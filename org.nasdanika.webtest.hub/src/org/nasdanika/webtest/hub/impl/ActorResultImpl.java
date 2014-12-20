/**
 */
package org.nasdanika.webtest.hub.impl;

import java.util.Iterator;

import org.apache.commons.lang3.StringEscapeUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.json.JSONArray;
import org.json.JSONObject;
import org.nasdanika.core.ConverterContext;
import org.nasdanika.html.Breadcrumbs;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.HTMLFactory.Glyphicon;
import org.nasdanika.web.HttpContext;
import org.nasdanika.webtest.hub.ActorMethodResult;
import org.nasdanika.webtest.hub.ActorResult;
import org.nasdanika.webtest.hub.BreadcrumbsProvider;
import org.nasdanika.webtest.hub.HubPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.impl.ActorResultImpl#getResults <em>Results</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.ActorResultImpl#getCoverage <em>Coverage</em>}</li>
 * </ul>
 * </p>
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
	public EMap<String, Integer> getCoverage() {
		return (EMap<String, Integer>)eGet(HubPackage.Literals.ACTOR_RESULT__COVERAGE, true);
	}

	@Override
	public void loadJSON(JSONObject json, ConverterContext context)	throws Exception {
		super.loadJSON(json, context);
		if (json.has("coverage")) {
			JSONObject cov = json.getJSONObject("coverage");
			Iterator<String> kit = cov.keys();
			while (kit.hasNext()) {
				String key = kit.next();				
				getCoverage().put(key, cov.getInt(key));
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
	
	@Override
	public Breadcrumbs createBreadcrumbs(HttpContext context, boolean active) throws Exception {
		Breadcrumbs ret = ((BreadcrumbsProvider) eContainer()).createBreadcrumbs(context, false);		
		HTMLFactory htmlFactory = context.adapt(HTMLFactory.class);
		ret.item(active ? null : htmlFactory.routeRef("right-panel", "/"+context.getObjectPath(this))+".html",
				htmlFactory.glyphicon(Glyphicon.user),
				"&nbsp;",
				StringEscapeUtils.escapeHtml4(getTitle()));		
		return ret;
	}

} //ActorResultImpl
