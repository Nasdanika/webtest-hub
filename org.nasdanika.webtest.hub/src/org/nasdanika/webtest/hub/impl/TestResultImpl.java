/**
 */
package org.nasdanika.webtest.hub.impl;

import java.io.BufferedReader;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.nasdanika.core.ConverterContext;
import org.nasdanika.web.HttpContext;
import org.nasdanika.web.RequestMethod;
import org.nasdanika.web.RouteMethod;
import org.nasdanika.webtest.hub.ActorResult;
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
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.impl.TestResultImpl#getPageResults <em>Page Results</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.TestResultImpl#getActorResults <em>Actor Results</em>}</li>
 * </ul>
 * </p>
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
	public void createPageResult(final HttpContext context) throws Exception {
		if (HubUtil.authorize(context, this)) {
			try (BufferedReader reader = context.getRequest().getReader()) {
				JSONObject json = new JSONObject(new JSONTokener(reader));
				PageResult result = HubFactory.eINSTANCE.createPageResult();
				getPageResults().add(result);
				result.loadJSON(json, context);
				HubUtil.respondWithLocationAndObjectIdOnCommit(context, result);
			}
		}
	}	
		
	@RouteMethod(pattern="L[\\d]+/actorResults", value=RequestMethod.POST)
	public void createActorResult(final HttpContext context) throws Exception {
		if (HubUtil.authorize(context, this)) {
			try (BufferedReader reader = context.getRequest().getReader()) {
				JSONObject json = new JSONObject(new JSONTokener(reader));
				ActorResult result = HubFactory.eINSTANCE.createActorResult();
				getActorResults().add(result);
				result.loadJSON(json, context);
				HubUtil.respondWithLocationAndObjectIdOnCommit(context, result);
			}
		}
	}	
	
	@Override
	public void loadJSON(JSONObject json, ConverterContext context)	throws Exception {
		super.loadJSON(json, context);
		HubUtil.sessionProgress(this);
	}

} //TestResultImpl
