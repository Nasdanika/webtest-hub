/**
 */
package org.nasdanika.webtest.hub.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringEscapeUtils;
import org.eclipse.emf.cdo.CDOLock;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.json.JSONArray;
import org.json.JSONObject;
import org.nasdanika.core.Context;
import org.nasdanika.core.ContextParameter;
import org.nasdanika.html.Breadcrumbs;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.HTMLFactory.Glyphicon;
import org.nasdanika.html.Table;
import org.nasdanika.html.Table.Row;
import org.nasdanika.html.Tag.TagName;
import org.nasdanika.html.UIElement.Style;
import org.nasdanika.web.HttpServletRequestContext;
import org.nasdanika.web.RouteMethod;
import org.nasdanika.webtest.hub.ActorMethodResult;
import org.nasdanika.webtest.hub.ActorResult;
import org.nasdanika.webtest.hub.BreadcrumbsProvider;
import org.nasdanika.webtest.hub.Coverage;
import org.nasdanika.webtest.hub.HubFactory;
import org.nasdanika.webtest.hub.HubPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.impl.ActorResultImpl#getResults <em>Results</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.ActorResultImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.ActorResultImpl#isProxy <em>Proxy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActorResultImpl extends DescriptorImpl implements ActorResult {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HubPackage.Literals.ACTOR_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ActorMethodResult> getResults() {
		return (EList<ActorMethodResult>)eGet(HubPackage.Literals.ACTOR_RESULT__RESULTS, true);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Coverage> getCoverage() {
		return (EList<Coverage>)eGet(HubPackage.Literals.ACTOR_RESULT__COVERAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProxy() {
		return (Boolean)eGet(HubPackage.Literals.ACTOR_RESULT__PROXY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProxy(boolean newProxy) {
		eSet(HubPackage.Literals.ACTOR_RESULT__PROXY, newProxy);
	}

	@Override
	public void loadJSON(JSONObject json, Context context)	throws Exception {
		super.loadJSON(json, context);
		setProxy(json.getBoolean("isProxy"));
		if (json.has("coverage")) {
			JSONArray cov = json.getJSONArray("coverage");
			for (int i=0; i<cov.length(); ++i) {
				Coverage coverage = HubFactory.eINSTANCE.createCoverage();
				getCoverage().add(coverage);
				coverage.loadJSON(cov.getJSONObject(i), context);
			}
		}
		if (json.has("results")) {
			JSONArray res = json.getJSONArray("results");
			for (int i=0; i<res.length(); ++i) {
				getResults().add((ActorMethodResult) eResource().getEObject(res.getString(i)));
			}
		}
		HubUtil.sessionProgress(this);
	}

	@RouteMethod(pattern="L?[\\d]+\\.html")
	public String home(@ContextParameter HttpServletRequestContext context) throws Exception {
		HTMLFactory htmlFactory = context.adapt(HTMLFactory.class);
		if (!context.authorize(this, "read", null, null)) {
			return htmlFactory.alert(Style.DANGER, false, "Access Denied!").toString(); 
		}	
		CDOLock readLock = cdoReadLock();
		if (readLock.tryLock(15, TimeUnit.SECONDS)) {
			try {				
				Table methodTable = htmlFactory.table().bordered();
				Row headerRow = methodTable.row().style(Style.INFO);
				headerRow.header(htmlFactory.glyphicon(Glyphicon.cog), " Method");
				headerRow.header(htmlFactory.glyphicon(Glyphicon.file), " Description");
				headerRow.header(htmlFactory.glyphicon(Glyphicon.file), " Calls");
				ArrayList<Coverage> sortedCoverage = new ArrayList<>(getCoverage());
				Collections.sort(sortedCoverage, new Comparator<Coverage>() {

					@Override
					public int compare(Coverage o1, Coverage o2) {
						return o1.getTitle().compareTo(o2.getTitle());
					}
					
				});
				for (Coverage coverage: sortedCoverage) {
					Row methodRow = methodTable.row();
					methodRow.cell(StringEscapeUtils.escapeHtml4(coverage.getTitle()));
					methodRow.cell(coverage.getDescription().toHTML());				
					methodRow.cell(HubUtil.blankZero(coverage.getInvocations())).attribute("align", "right");
				}
				
				return 	htmlFactory.inject("#breadcrumbs-container", createBreadcrumbs(context, true)).toString() + 
						htmlFactory.tag(TagName.h3, htmlFactory.glyphicon(Glyphicon.user), " ", StringEscapeUtils.escapeHtml4(getTitle())) +
						getDescription().toHTML() +
						"<P/>" +
						methodTable;
			} finally {
				readLock.unlock();
			}
		} else {			
			return htmlFactory.alert(Style.DANGER, false, "System is overloaded, please try again later!").toString();
		}			
	}	
	
	@Override
	public Breadcrumbs createBreadcrumbs(HttpServletRequestContext context, boolean active) throws Exception {
		Breadcrumbs ret = ((BreadcrumbsProvider) eContainer()).createBreadcrumbs(context, false);		
		HTMLFactory htmlFactory = context.adapt(HTMLFactory.class);
		ret.item(active ? null : htmlFactory.routeRef("right-panel", "/"+context.getObjectPath(this))+".html",
				htmlFactory.glyphicon(Glyphicon.user),
				"&nbsp;",
				StringEscapeUtils.escapeHtml4(getTitle()));		
		return ret;
	}

} //ActorResultImpl
