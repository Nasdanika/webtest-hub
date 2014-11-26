/**
 */
package org.nasdanika.webtest.hub.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.webtest.hub.ActorResult;
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

} //TestResultImpl
