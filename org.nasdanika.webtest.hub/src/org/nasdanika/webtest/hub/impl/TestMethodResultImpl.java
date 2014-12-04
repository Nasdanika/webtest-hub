/**
 */
package org.nasdanika.webtest.hub.impl;

import java.io.BufferedReader;
import java.lang.Throwable;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.cdo.CDOLock;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.nasdanika.core.ConverterContext;
import org.nasdanika.webtest.hub.HubFactory;
import org.nasdanika.webtest.hub.HubPackage;
import org.nasdanika.webtest.hub.TestMethodResult;
import org.nasdanika.webtest.hub.TestResult;
import org.nasdanika.webtest.performance.NavigationTiming;
import org.nasdanika.webtest.performance.PerformanceFactory;
import org.nasdanika.webtest.performance.TimingBase;

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
	@SuppressWarnings("unchecked")
	public EList<NavigationTiming> getNavigationTiming() {
		return (EList<NavigationTiming>)eGet(HubPackage.Literals.TEST_METHOD_RESULT__NAVIGATION_TIMING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TimingBase loadTiming(JSONObject json) throws Exception {
		CDOLock writeLock = cdoWriteLock();
		writeLock.lock(5, TimeUnit.SECONDS);
		try {
			for (NavigationTiming nt: getNavigationTiming()) {
				TimingBase ret = nt.merge(json);
				if (ret!=null) {
					return ret;
				}
			}
			NavigationTiming nt = PerformanceFactory.eINSTANCE.createNavigationTiming();
			nt.loadJSON(json, null);
			getNavigationTiming().add(nt);
			return nt;
		} finally {
			writeLock.unlock();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HubPackage.TEST_METHOD_RESULT___LOAD_TIMING__JSONOBJECT:
				try {
					return loadTiming((JSONObject)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
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
