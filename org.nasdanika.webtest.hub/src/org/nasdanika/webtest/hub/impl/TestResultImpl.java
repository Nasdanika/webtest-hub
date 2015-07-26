/**
 */
package org.nasdanika.webtest.hub.impl;

import java.io.BufferedReader;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringEscapeUtils;
import org.eclipse.emf.cdo.CDOLock;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.nasdanika.core.Context;
import org.nasdanika.core.ContextParameter;
import org.nasdanika.html.Breadcrumbs;
import org.nasdanika.html.FontAwesome.WebApplication;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.web.HttpServletRequestContext;
import org.nasdanika.web.RequestMethod;
import org.nasdanika.web.RouteMethod;
import org.nasdanika.webtest.hub.ActorResult;
import org.nasdanika.webtest.hub.BreadcrumbsProvider;
import org.nasdanika.webtest.hub.HubFactory;
import org.nasdanika.webtest.hub.HubPackage;
import org.nasdanika.webtest.hub.PageResult;
import org.nasdanika.webtest.hub.TestResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.impl.TestResultImpl#getPageResults <em>Page Results</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.TestResultImpl#getActorResults <em>Actor Results</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestResultImpl extends DescriptorImpl implements TestResult {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HubPackage.Literals.TEST_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PageResult> getPageResults() {
		return (EList<PageResult>)eGet(HubPackage.Literals.TEST_RESULT__PAGE_RESULTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ActorResult> getActorResults() {
		return (EList<ActorResult>)eGet(HubPackage.Literals.TEST_RESULT__ACTOR_RESULTS, true);
	}
	
	@RouteMethod(pattern="L[\\d]+/pageResults", value=RequestMethod.POST)
	public void createPageResult(@ContextParameter final HttpServletRequestContext context) throws Exception {
		if (HubUtil.authorize(context, this)) {
			CDOLock writeLock = cdoWriteLock();
			if (writeLock.tryLock(5, TimeUnit.SECONDS)) {
				try (BufferedReader reader = context.getRequest().getReader()) {
					JSONObject json = new JSONObject(new JSONTokener(reader));
					PageResult result = HubFactory.eINSTANCE.createPageResult();
					getPageResults().add(result);
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
		
	@RouteMethod(pattern="L[\\d]+/actorResults", value=RequestMethod.POST)
	public void createActorResult(@ContextParameter final HttpServletRequestContext context) throws Exception {
		if (HubUtil.authorize(context, this)) {
			CDOLock writeLock = cdoWriteLock();
			if (writeLock.tryLock(5, TimeUnit.SECONDS)) {
				try (BufferedReader reader = context.getRequest().getReader()) {
					JSONObject json = new JSONObject(new JSONTokener(reader));
					ActorResult result = HubFactory.eINSTANCE.createActorResult();
					getActorResults().add(result);
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
	
	@Override
	public void loadJSON(JSONObject json, Context context)	throws Exception {
		super.loadJSON(json, context);
		HubUtil.sessionProgress(this);
	}
	
	@Override 
	public Object getIcon(HTMLFactory htmlFactory) {
		return htmlFactory.fontAwesome().webApplication(WebApplication.flask);
	}
	
	@Override
	public Breadcrumbs createBreadcrumbs(HttpServletRequestContext context, boolean active) throws Exception {
		Breadcrumbs ret = ((BreadcrumbsProvider) eContainer()).createBreadcrumbs(context, false);		
		HTMLFactory htmlFactory = context.adapt(HTMLFactory.class);
		ret.item(active ? null : htmlFactory.routeRef("right-panel", "/"+context.getObjectPath(this))+".html",
				getIcon(htmlFactory),
				"&nbsp;",
				StringEscapeUtils.escapeHtml4(getTitle()));		
		return ret;
	}
	
} //TestResultImpl
