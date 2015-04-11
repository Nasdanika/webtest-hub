/**
 */
package org.nasdanika.webtest.hub.impl;

import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringEscapeUtils;
import org.eclipse.emf.cdo.CDOLock;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.nasdanika.core.Context;
import org.nasdanika.html.Breadcrumbs;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.HTMLFactory.Glyphicon;
import org.nasdanika.html.Table;
import org.nasdanika.html.Table.Row;
import org.nasdanika.html.Tag.TagName;
import org.nasdanika.html.UIElement.Style;
import org.nasdanika.web.HttpContext;
import org.nasdanika.web.RequestMethod;
import org.nasdanika.web.RouteMethod;
import org.nasdanika.webtest.hub.BreadcrumbsProvider;
import org.nasdanika.webtest.hub.Descriptor;
import org.nasdanika.webtest.hub.HubFactory;
import org.nasdanika.webtest.hub.HubPackage;
import org.nasdanika.webtest.hub.ParameterizedTestResult;
import org.nasdanika.webtest.hub.TestClassResult;
import org.nasdanika.webtest.hub.TestMethodResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Class Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.impl.TestClassResultImpl#getMethodResults <em>Method Results</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.TestClassResultImpl#getStats <em>Stats</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestClassResultImpl extends TestResultImpl implements TestClassResult {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestClassResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HubPackage.Literals.TEST_CLASS_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TestMethodResult> getMethodResults() {
		return (EList<TestMethodResult>)eGet(HubPackage.Literals.TEST_CLASS_RESULT__METHOD_RESULTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<String, Integer> getStats() {
		return (EMap<String, Integer>)eGet(HubPackage.Literals.TEST_CLASS_RESULT__STATS, true);
	}	
	
	@Override
	public void loadJSON(JSONObject json, Context context)	throws Exception {
		super.loadJSON(json, context);
		if (json.has("stats")) {
			JSONObject stats = json.getJSONObject("stats");
			Iterator<String> kit = stats.keys();
			while (kit.hasNext()) {
				String key = kit.next();
				getStats().put(key, stats.getInt(key));
			}
		}
	}

	@RouteMethod(pattern="L[\\d]+/methodResults", value=RequestMethod.POST)
	public void createTestResult(final HttpContext context) throws Exception {
		if (HubUtil.authorize(context, this)) {
			CDOLock writeLock = cdoWriteLock();
			if (writeLock.tryLock(5, TimeUnit.SECONDS)) {
				try (InputStreamReader reader = new InputStreamReader(new GZIPInputStream(context.getRequest().getInputStream()))) {
					TestMethodResult result = HubFactory.eINSTANCE.createTestMethodResult();
					getMethodResults().add(result);
					JSONObject json = new JSONObject(new JSONTokener(reader));
					result.loadJSON(json, context);
					HubUtil.respondWithLocationAndObjectIdOnCommit(context, result);
				} finally {
					writeLock.unlock();
				}
			} else {			
				context.getResponse().sendError(HttpServletResponse.SC_SERVICE_UNAVAILABLE, "Cannot acquire a write lock");
			}			
		}
	}	
		
	@RouteMethod(pattern="L?[\\d]+\\.html")
	public String home(HttpContext context) throws Exception {
		HTMLFactory htmlFactory = context.adapt(HTMLFactory.class);
		if (!context.authorize(this, "read", null, null)) {
			return htmlFactory.alert(Style.DANGER, false, "Access Denied!").toString(); 
		}	
		CDOLock readLock = cdoReadLock();
		if (readLock.tryLock(15, TimeUnit.SECONDS)) {
			try {
				Table parametersTable = null;
				if (eContainer() instanceof ParameterizedTestResult && !getMethodResults().isEmpty()) {
					parametersTable = htmlFactory.table().bordered();
					Row hRow = parametersTable.row().style(Style.INFO);
					hRow.header("Name").style("text-align", "center");
					hRow.header("Value").style("text-align", "center");
					hRow.header("Description").style("text-align", "center");
					EList<Descriptor> pdl = HubUtil.getContainer(this, ParameterizedTestResult.class).getParameterDescriptors();
					int idx = 0;
					for (String p: getMethodResults().get(0).getParameters()) {			
						Row pRow = parametersTable.row();
						Descriptor pd = pdl.get(idx);
						pRow.cell(pd.getTitle());
						pRow.cell(StringEscapeUtils.escapeHtml4(p));			
						pRow.cell(pd.getDescription().toHTML());
						++idx;
					}
				}								
				
				Table methodTable = htmlFactory.table().bordered();
				Row headerRow = methodTable.row().style(Style.INFO);
				headerRow.header(htmlFactory.glyphicon(Glyphicon.cog), " Method").style("white-space", "nowrap");
				headerRow.header(htmlFactory.glyphicon(Glyphicon.file), " Description").style("white-space", "nowrap");
				headerRow.header(htmlFactory.glyphicon(Glyphicon.time), " Duration").style("white-space", "nowrap");
				for (TestMethodResult tmr: getMethodResults()) {
					tmr.genRow(context, methodTable);
				}
												
				return 	htmlFactory.inject("#breadcrumbs-container", createBreadcrumbs(context, true)).toString() + 
						htmlFactory.tag(TagName.h3, getIcon(htmlFactory), " ", StringEscapeUtils.escapeHtml4(getTitle())) +
						getDescription().toHTML() +
						"<P/>" +
						(parametersTable==null ? "" : htmlFactory.tag(TagName.h4, "Parameters").toString() + parametersTable) +
						htmlFactory.tag(TagName.h4, "Methods") +
						methodTable; 
			} finally {
				readLock.unlock();
			}
		} else {			
			return htmlFactory.alert(Style.DANGER, false, "System is overloaded, please try again later!").toString();
		}			
	}	
		
	@Override
	public Breadcrumbs createBreadcrumbs(HttpContext context, boolean active) throws Exception {
		if (eContainer() instanceof ParameterizedTestResult) {
			Breadcrumbs ret = ((BreadcrumbsProvider) eContainer()).createBreadcrumbs(context, false);		
			HTMLFactory htmlFactory = context.adapt(HTMLFactory.class);
			ret.item(active ? null : htmlFactory.routeRef("right-panel", "/"+context.getObjectPath(this))+".html",
					getIcon(htmlFactory),
					"&nbsp;",
					((ParameterizedTestResult) eContainer()).getChildren().indexOf(this)+1);		
			return ret;
			
		}
		return super.createBreadcrumbs(context, active);
	}
	

} //TestClassResultImpl
