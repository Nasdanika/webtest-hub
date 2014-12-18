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
	
	static String blankZero(int number) {
		return number==0 ? "" : String.valueOf(number);
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
}
