/**
 */
package org.nasdanika.webtest.hub;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.webtest.hub.HubPackage
 * @generated
 */
public interface HubFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HubFactory eINSTANCE = org.nasdanika.webtest.hub.impl.HubFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Hub</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hub</em>'.
	 * @generated
	 */
	Hub createHub();

	/**
	 * Returns a new object of class '<em>Guest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guest</em>'.
	 * @generated
	 */
	Guest createGuest();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns a new object of class '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application</em>'.
	 * @generated
	 */
	Application createApplication();

	/**
	 * Returns a new object of class '<em>Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Descriptor</em>'.
	 * @generated
	 */
	Descriptor createDescriptor();

	/**
	 * Returns a new object of class '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Description</em>'.
	 * @generated
	 */
	Description createDescription();

	/**
	 * Returns a new object of class '<em>Test Session</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Session</em>'.
	 * @generated
	 */
	TestSession createTestSession();

	/**
	 * Returns a new object of class '<em>Test Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Result</em>'.
	 * @generated
	 */
	TestResult createTestResult();

	/**
	 * Returns a new object of class '<em>Test Class Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Class Result</em>'.
	 * @generated
	 */
	TestClassResult createTestClassResult();

	/**
	 * Returns a new object of class '<em>Test Suite Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Suite Result</em>'.
	 * @generated
	 */
	TestSuiteResult createTestSuiteResult();

	/**
	 * Returns a new object of class '<em>Parameterized Test Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameterized Test Result</em>'.
	 * @generated
	 */
	ParameterizedTestResult createParameterizedTestResult();

	/**
	 * Returns a new object of class '<em>Screenshot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Screenshot</em>'.
	 * @generated
	 */
	Screenshot createScreenshot();

	/**
	 * Returns a new object of class '<em>Operation Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Result</em>'.
	 * @generated
	 */
	OperationResult createOperationResult();

	/**
	 * Returns a new object of class '<em>Throwable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Throwable</em>'.
	 * @generated
	 */
	Throwable createThrowable();

	/**
	 * Returns a new object of class '<em>Stack Trace Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stack Trace Entry</em>'.
	 * @generated
	 */
	StackTraceEntry createStackTraceEntry();

	/**
	 * Returns a new object of class '<em>Initialization Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initialization Result</em>'.
	 * @generated
	 */
	InitializationResult createInitializationResult();

	/**
	 * Returns a new object of class '<em>Method Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Result</em>'.
	 * @generated
	 */
	MethodResult createMethodResult();

	/**
	 * Returns a new object of class '<em>Actor Method Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor Method Result</em>'.
	 * @generated
	 */
	ActorMethodResult createActorMethodResult();

	/**
	 * Returns a new object of class '<em>Page Method Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page Method Result</em>'.
	 * @generated
	 */
	PageMethodResult createPageMethodResult();

	/**
	 * Returns a new object of class '<em>Test Method Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Method Result</em>'.
	 * @generated
	 */
	TestMethodResult createTestMethodResult();

	/**
	 * Returns a new object of class '<em>Actor Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor Result</em>'.
	 * @generated
	 */
	ActorResult createActorResult();

	/**
	 * Returns a new object of class '<em>Page Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page Result</em>'.
	 * @generated
	 */
	PageResult createPageResult();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HubPackage getHubPackage();

} //HubFactory
