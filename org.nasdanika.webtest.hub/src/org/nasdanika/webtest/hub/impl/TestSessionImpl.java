/**
 */
package org.nasdanika.webtest.hub.impl;

import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.nasdanika.web.HttpContext;
import org.nasdanika.web.RequestMethod;
import org.nasdanika.web.RouteMethod;
import org.nasdanika.webtest.hub.HubFactory;
import org.nasdanika.webtest.hub.HubPackage;
import org.nasdanika.webtest.hub.TestResult;
import org.nasdanika.webtest.hub.TestSession;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Session</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.impl.TestSessionImpl#getResults <em>Results</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.TestSessionImpl#isPublished <em>Published</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestSessionImpl extends DescriptorImpl implements TestSession {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestSessionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HubPackage.Literals.TEST_SESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TestResult> getResults() {
		return (EList<TestResult>)eGet(HubPackage.Literals.TEST_SESSION__RESULTS, true);
	}
		
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPublished() {
		return (Boolean)eGet(HubPackage.Literals.TEST_SESSION__PUBLISHED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublished(boolean newPublished) {
		eSet(HubPackage.Literals.TEST_SESSION__PUBLISHED, newPublished);
	}

	@RouteMethod(pattern="L[\\d]+/results", value=RequestMethod.POST)
	public void createTestResult(final HttpContext context) throws Exception {
		if (HubUtil.authorize(context, this)) {
			JSONObject json = new JSONObject(new JSONTokener(context.getRequest().getReader()));
			switch (json.getString("type")) {
			case "class": {
				TestResult result = HubFactory.eINSTANCE.createTestClassResult();
				result.loadJSON(json);
				getResults().add(result);
				HubUtil.respondWithLocationAndObjectIdOnCommit(context, result);				
				break;
			}
			case "suite": {
				TestResult result = HubFactory.eINSTANCE.createTestSuiteResult();
				result.loadJSON(json);
				getResults().add(result);
				HubUtil.respondWithLocationAndObjectIdOnCommit(context, result);				
				break;
			}
			case "parameterized": {
				TestResult result = HubFactory.eINSTANCE.createParameterizedTestResult();
				result.loadJSON(json);
				getResults().add(result);
				HubUtil.respondWithLocationAndObjectIdOnCommit(context, result);				
				break;
			}
			default:
				context.getResponse().sendError(HttpServletResponse.SC_BAD_REQUEST, "Unexpected type: "+json.getString("type"));
			}
		}
	}	
	
	@RouteMethod(pattern="L[\\d]", value=RequestMethod.PUT)
	public void uploadFinished(final HttpContext context) throws Exception {
		if (HubUtil.authorize(context, this)) {
			setPublished(true);
		}
	}	
	
	
} //TestSessionImpl
