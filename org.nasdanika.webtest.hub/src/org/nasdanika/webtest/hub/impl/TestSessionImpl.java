/**
 */
package org.nasdanika.webtest.hub.impl;

import java.io.BufferedReader;
import java.util.Collection;

import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.nasdanika.core.ConverterContext;
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
 *   <li>{@link org.nasdanika.webtest.hub.impl.TestSessionImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.TestSessionImpl#getProgress <em>Progress</em>}</li>
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return (Integer)eGet(HubPackage.Literals.TEST_SESSION__SIZE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		eSet(HubPackage.Literals.TEST_SESSION__SIZE, newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getProgress() {
		return (Integer)eGet(HubPackage.Literals.TEST_SESSION__PROGRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgress(int newProgress) {
		eSet(HubPackage.Literals.TEST_SESSION__PROGRESS, newProgress);
	}
	
	@Override
	public void loadJSON(JSONObject json, ConverterContext context)	throws Exception {
		super.loadJSON(json, context);
		setSize(json.getInt("size"));
		setProgress(1);
	}

	@RouteMethod(pattern="L[\\d]+/results", value=RequestMethod.POST)
	public void createTestResult(final HttpContext context) throws Exception {
		if (HubUtil.authorize(context, this)) {
			try (BufferedReader reader = context.getRequest().getReader()) {
				JSONObject json = new JSONObject(new JSONTokener(reader));
				switch (json.getString("type")) {
				case "class": {
					TestResult result = HubFactory.eINSTANCE.createTestClassResult();
					getResults().add(result);
					result.loadJSON(json, context);
					HubUtil.respondWithLocationAndObjectIdOnCommit(context, result);				
					break;
				}
				case "suite": {
					TestResult result = HubFactory.eINSTANCE.createTestSuiteResult();
					getResults().add(result);
					result.loadJSON(json, context);
					HubUtil.respondWithLocationAndObjectIdOnCommit(context, result);				
					break;
				}
				case "parameterized": {
					TestResult result = HubFactory.eINSTANCE.createParameterizedTestResult();
					getResults().add(result);
					result.loadJSON(json, context);
					HubUtil.respondWithLocationAndObjectIdOnCommit(context, result);				
					break;
				}
				default:
					context.getResponse().sendError(HttpServletResponse.SC_BAD_REQUEST, "Unexpected type: "+json.getString("type"));
				}
			}
		}
	}	
	
	@RouteMethod(pattern="L[\\d]+", value=RequestMethod.PUT)
	public void uploadFinished(final HttpContext context) throws Exception {
		if (HubUtil.authorize(context, this)) {
			setPublished(true);
//			eResource().save(System.out, null);
		}
	}	
	
	@RouteMethod(pattern="L[\\d]+", value=RequestMethod.DELETE)
	public void uploadFailed(final HttpContext context) throws Exception {
		if (HubUtil.authorize(context, this)) {
			((Collection<?>) eContainer().eGet(eContainingFeature())).remove(this);
		}
	}	
	
} //TestSessionImpl
