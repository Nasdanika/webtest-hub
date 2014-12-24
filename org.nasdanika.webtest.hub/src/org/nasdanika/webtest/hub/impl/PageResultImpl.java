/**
 */
package org.nasdanika.webtest.hub.impl;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringEscapeUtils;
import org.eclipse.emf.cdo.CDOLock;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.json.JSONArray;
import org.json.JSONObject;
import org.nasdanika.core.ConverterContext;
import org.nasdanika.html.Breadcrumbs;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.HTMLFactory.Glyphicon;
import org.nasdanika.html.Tag.TagName;
import org.nasdanika.html.UIElement.Style;
import org.nasdanika.web.HttpContext;
import org.nasdanika.web.RouteMethod;
import org.nasdanika.webtest.hub.BreadcrumbsProvider;
import org.nasdanika.webtest.hub.HubFactory;
import org.nasdanika.webtest.hub.HubPackage;
import org.nasdanika.webtest.hub.PageMethodResult;
import org.nasdanika.webtest.hub.PageResult;
import org.nasdanika.webtest.hub.WebElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.impl.PageResultImpl#getResults <em>Results</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.PageResultImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.PageResultImpl#getWebElements <em>Web Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageResultImpl extends DescriptorImpl implements PageResult {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HubPackage.Literals.PAGE_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PageMethodResult> getResults() {
		return (EList<PageMethodResult>)eGet(HubPackage.Literals.PAGE_RESULT__RESULTS, true);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<String, Integer> getCoverage() {
		return (EMap<String, Integer>)eGet(HubPackage.Literals.PAGE_RESULT__COVERAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<WebElement> getWebElements() {
		return (EList<WebElement>)eGet(HubPackage.Literals.PAGE_RESULT__WEB_ELEMENTS, true);
	}

	@Override
	public void loadJSON(JSONObject json, ConverterContext context)	throws Exception {
		super.loadJSON(json, context);
		if (json.has("webElements")) {
			JSONArray wea = json.getJSONArray("webElements");
			for (int i=0; i<wea.length(); ++i) {
				WebElement we = HubFactory.eINSTANCE.createWebElement();
				getWebElements().add(we);
				we.loadJSON(wea.getJSONObject(i), context);
			}
		}
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
				getResults().add((PageMethodResult) eResource().getEObject(res.getString(i)));
			}
		}
		HubUtil.sessionProgress(this);
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
				return 	htmlFactory.inject("#breadcrumbs-container", createBreadcrumbs(context, true)).toString() + 
						htmlFactory.tag(TagName.h3, htmlFactory.glyphicon(Glyphicon.list_alt), " ", StringEscapeUtils.escapeHtml4(getTitle())) +
						getDescription().toHTML() +
						"<P/>";
			} finally {
				readLock.unlock();
			}
		} else {			
			return htmlFactory.alert(Style.DANGER, false, "System is overloaded, please try again later!").toString();
		}			
	}	
	
	@Override
	public Breadcrumbs createBreadcrumbs(HttpContext context, boolean active) throws Exception {
		Breadcrumbs ret = ((BreadcrumbsProvider) eContainer()).createBreadcrumbs(context, false);		
		HTMLFactory htmlFactory = context.adapt(HTMLFactory.class);
		ret.item(active ? null : htmlFactory.routeRef("right-panel", "/"+context.getObjectPath(this))+".html",
				htmlFactory.glyphicon(Glyphicon.list_alt),
				"&nbsp;",
				StringEscapeUtils.escapeHtml4(getTitle()));		
		return ret;
	}
	

} //PageResultImpl
