/**
 */
package org.nasdanika.webtest.hub.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.json.JSONArray;
import org.json.JSONObject;
import org.nasdanika.core.ConverterContext;
import org.nasdanika.webtest.hub.HubPackage;
import org.nasdanika.webtest.hub.TestMethodResult;
import org.nasdanika.webtest.performance.NavigationTiming;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Method Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.impl.TestMethodResultImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.TestMethodResultImpl#getNavigationTiming <em>Navigation Timing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestMethodResultImpl extends OperationResultImpl implements TestMethodResult {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestMethodResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HubPackage.Literals.TEST_METHOD_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getParameters() {
		return (EList<String>)eGet(HubPackage.Literals.TEST_METHOD_RESULT__PARAMETERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationTiming getNavigationTiming() {
		return (NavigationTiming)eGet(HubPackage.Literals.TEST_METHOD_RESULT__NAVIGATION_TIMING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNavigationTiming(NavigationTiming newNavigationTiming) {
		eSet(HubPackage.Literals.TEST_METHOD_RESULT__NAVIGATION_TIMING, newNavigationTiming);
	}
	
	@Override
	public void loadJSON(JSONObject json, ConverterContext context)	throws Exception {
		super.loadJSON(json, context);
		if (json.has("parameters")) {
			JSONArray params = json.getJSONArray("parameters");
			for (int i=0; i<params.length(); ++i) {
				getParameters().add(params.getString(i));
			}
		}
	}

} //TestMethodResultImpl
