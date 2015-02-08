package org.nasdanika.webtest.hub.impl;

import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.common.id.CDOIDUtil;
import org.eclipse.emf.cdo.transaction.CDOCommitContext;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.transaction.CDOTransactionHandler2;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.html.FontAwesome.WebApplication;
import org.nasdanika.html.Form;
import org.nasdanika.html.FormInputGroup;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.InputBase;
import org.nasdanika.html.Tag;
import org.nasdanika.web.HttpContext;
import org.nasdanika.webtest.hub.Hub;
import org.nasdanika.webtest.hub.TestClassResult;
import org.nasdanika.webtest.hub.TestResult;
import org.nasdanika.webtest.hub.TestSession;
import org.nasdanika.webtest.hub.TestSuiteResult;

class HubUtil {
	
	private HubUtil() {
		// Utility class
	}
	
	static boolean authorize(HttpContext context, EObject obj) throws IOException {
		if (obj instanceof ApplicationImpl) {
			return ((ApplicationImpl) obj).authorize(context);
		}
		if (obj.eContainer()==null) {
			return false;
		}
		return authorize(context, obj.eContainer());
	}

	static void sessionProgress(EObject obj) throws IOException {
		if (obj instanceof TestSession) {
			((TestSession) obj).setProgress(((TestSession) obj).getProgress()+1);
		} else if (obj!=null) {
			sessionProgress(obj.eContainer());
		}
	}
	
	static void respondWithLocationAndObjectIdOnCommit(final HttpContext context, final CDOObject obj) {
		((CDOTransaction) obj.cdoView()).addTransactionHandler(new CDOTransactionHandler2() {

			@Override
			public void committedTransaction(CDOTransaction transactions, CDOCommitContext commitContext) {
				try {
					StringBuffer rURL = context.getRequest().getRequestURL();
					context.getResponse().setHeader("Location", rURL.substring(0, rURL.indexOf(context.getRequest().getRequestURI()))+context.getObjectPath(obj));
					context.getResponse().setHeader("ID", obj.eResource().getURIFragment(obj));
				} catch (Exception e) {
					e.printStackTrace();
					try {
						context.getResponse().sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, e.toString());
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}						
			}

			@Override
			public void committingTransaction(CDOTransaction transactions, CDOCommitContext context) {
				// NOP						
			}

			@Override
			public void rolledBackTransaction(CDOTransaction transactions) {
				// NOP						
			}
			
		});
		
	}
	
	@SuppressWarnings("unchecked")
	static <T> T getContainer(EObject obj, Class<T> containerType) {
		if (obj==null) {
			return null;
		}
		if (containerType.isInstance(obj)) {
			return (T) obj;
		}
		return getContainer(obj.eContainer(), containerType);
	}
	
	static String title(String name) {
		StringBuilder titleBuilder = new StringBuilder();
		String[] scna = StringUtils.splitByCharacterTypeCamelCase(name);
		for (int i=0; i<scna.length; ++i) {
			if (i==0) {
				titleBuilder.append(StringUtils.capitalize(scna[i]));
			} else {
				titleBuilder.append(" ");
				if (scna[i].length()>1 && Character.isUpperCase(scna[i].charAt(1))) {
					titleBuilder.append(scna[i]);
				} else {
					titleBuilder.append(StringUtils.uncapitalize(scna[i]));
				}
			}
		}
		return titleBuilder.toString();
	}

	static int width(EObject obj) {
		return (int) ((getContainer(obj, Hub.class).getSlideWidth()+32)*12.0/9.0);	
	}
	
	static String blankZero(Integer number) {
		return number==null || number==0 ? "" : String.valueOf(number);
	}
	
	static void aggregateStats(TestResult result, Map<String, int[]> stats) {
		if (result instanceof TestSuiteResult) {
			for (TestResult child: ((TestSuiteResult) result).getChildren()) {
				aggregateStats(child, stats);
			} 
		} else if (result instanceof TestClassResult) {
			for (Entry<String, Integer> e: ((TestClassResult) result).getStats().entrySet()) {
				int[] sk = stats.get(e.getKey());
				if (sk==null) {
					stats.put(e.getKey(), new int[] {e.getValue()});
				} else {
					sk[0]+=e.getValue();
				}
			}
		}
	}
	
	static String cdoIDtoString(CDOID id) {
		StringBuilder idBuilder = new StringBuilder();
		CDOIDUtil.write(idBuilder, id);		
		return idBuilder.toString();
	}
	
	/**
	 * Creates and configures a form input group.
	 * @param htmlFactory Factory
	 * @param form Form
	 * @param control Control. This method sets control <code>name</code>, <code>ng-model</code>, and <code>id</code>. Other attributes, such are <code>required</code> can
	 * be explicitly configured.
	 * @param name Input/control name and id.
	 * @param title Control title.
	 * @param modelData Model data. If null control is bound to scope.
	 * @param errorData Error data. If null error message is bound to <code>&lt;name&gtError</code> scope variable.
	 * @return form input group for further configuration, e.g. adding add-ons.
	 */
	static FormInputGroup createFormInputGroup(
			HTMLFactory htmlFactory, 
			Form form, 
			InputBase<?> control,
			String name,
			String title,
			String modelData, 
			String errorData) {
		
		control.name(name);
		control.ngModel(modelData==null ? name : modelData+"."+name);
		control.id(name);
		
		Tag errorMessage = htmlFactory.span()
				.ngBind(errorData==null ? name+"Error" : errorData+"."+name)
				.ngShow(errorData==null ? name+"Error" : errorData+"."+name)
				.style("color", "red");
		
		return form.formInputGroup(title, name, control, errorMessage)
			.ngClass("{ 'has-error' : "+(errorData==null ? name+"Error" : errorData+"."+name)+" }")
			.leftAddOn(htmlFactory.fontAwesome().webApplication(WebApplication.key).fixedWidth());
		
	}
}
