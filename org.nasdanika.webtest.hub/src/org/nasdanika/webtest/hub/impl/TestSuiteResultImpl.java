/**
 */
package org.nasdanika.webtest.hub.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.webtest.hub.HubPackage;
import org.nasdanika.webtest.hub.TestResult;
import org.nasdanika.webtest.hub.TestSuiteResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Suite Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.impl.TestSuiteResultImpl#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestSuiteResultImpl extends TestResultImpl implements TestSuiteResult {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestSuiteResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HubPackage.Literals.TEST_SUITE_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TestResult> getChildren() {
		return (EList<TestResult>)eGet(HubPackage.Literals.TEST_SUITE_RESULT__CHILDREN, true);
	}

} //TestSuiteResultImpl
