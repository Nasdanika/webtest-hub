/**
 */
package org.nasdanika.webtest.hub.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.json.JSONObject;
import org.nasdanika.web.HttpContext;
import org.nasdanika.webtest.hub.ActorMethodResult;
import org.nasdanika.webtest.hub.ActorResult;
import org.nasdanika.webtest.hub.Application;
import org.nasdanika.webtest.hub.AuthenticationMode;
import org.nasdanika.webtest.hub.Coverage;
import org.nasdanika.webtest.hub.Description;
import org.nasdanika.webtest.hub.Descriptor;
import org.nasdanika.webtest.hub.Guest;
import org.nasdanika.webtest.hub.Hub;
import org.nasdanika.webtest.hub.HubFactory;
import org.nasdanika.webtest.hub.HubPackage;
import org.nasdanika.webtest.hub.InitializationResult;
import org.nasdanika.webtest.hub.Locator;
import org.nasdanika.webtest.hub.MethodResult;
import org.nasdanika.webtest.hub.OperationResult;
import org.nasdanika.webtest.hub.OperationStatus;
import org.nasdanika.webtest.hub.PageMethodResult;
import org.nasdanika.webtest.hub.PageResult;
import org.nasdanika.webtest.hub.ParameterizedTestResult;
import org.nasdanika.webtest.hub.Screenshot;
import org.nasdanika.webtest.hub.StackTraceEntry;
import org.nasdanika.webtest.hub.TestClassResult;
import org.nasdanika.webtest.hub.TestMethodResult;
import org.nasdanika.webtest.hub.TestResult;
import org.nasdanika.webtest.hub.TestSession;
import org.nasdanika.webtest.hub.TestSuiteResult;
import org.nasdanika.webtest.hub.User;
import org.nasdanika.webtest.hub.WebElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HubFactoryImpl extends EFactoryImpl implements HubFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HubFactory init() {
		try {
			HubFactory theHubFactory = (HubFactory)EPackage.Registry.INSTANCE.getEFactory(HubPackage.eNS_URI);
			if (theHubFactory != null) {
				return theHubFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HubFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HubFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HubPackage.HUB: return (EObject)createHub();
			case HubPackage.GUEST: return (EObject)createGuest();
			case HubPackage.USER: return (EObject)createUser();
			case HubPackage.APPLICATION: return (EObject)createApplication();
			case HubPackage.DESCRIPTOR: return (EObject)createDescriptor();
			case HubPackage.DESCRIPTION: return (EObject)createDescription();
			case HubPackage.TEST_SESSION: return (EObject)createTestSession();
			case HubPackage.TEST_RESULT: return (EObject)createTestResult();
			case HubPackage.TEST_CLASS_RESULT: return (EObject)createTestClassResult();
			case HubPackage.STATS_ENTRY: return (EObject)createStatsEntry();
			case HubPackage.TEST_SUITE_RESULT: return (EObject)createTestSuiteResult();
			case HubPackage.PARAMETERIZED_TEST_RESULT: return (EObject)createParameterizedTestResult();
			case HubPackage.SCREENSHOT: return (EObject)createScreenshot();
			case HubPackage.OPERATION_RESULT: return (EObject)createOperationResult();
			case HubPackage.THROWABLE: return (EObject)createThrowable();
			case HubPackage.STACK_TRACE_ENTRY: return (EObject)createStackTraceEntry();
			case HubPackage.INITIALIZATION_RESULT: return (EObject)createInitializationResult();
			case HubPackage.METHOD_RESULT: return (EObject)createMethodResult();
			case HubPackage.ACTOR_METHOD_RESULT: return (EObject)createActorMethodResult();
			case HubPackage.PAGE_METHOD_RESULT: return (EObject)createPageMethodResult();
			case HubPackage.TEST_METHOD_RESULT: return (EObject)createTestMethodResult();
			case HubPackage.COVERAGE: return (EObject)createCoverage();
			case HubPackage.ACTOR_RESULT: return (EObject)createActorResult();
			case HubPackage.PAGE_RESULT: return (EObject)createPageResult();
			case HubPackage.WEB_ELEMENT: return (EObject)createWebElement();
			case HubPackage.LOCATOR: return (EObject)createLocator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case HubPackage.AUTHENTICATION_MODE:
				return createAuthenticationModeFromString(eDataType, initialValue);
			case HubPackage.OPERATION_STATUS:
				return createOperationStatusFromString(eDataType, initialValue);
			case HubPackage.HTTP_CONTEXT:
				return createHttpContextFromString(eDataType, initialValue);
			case HubPackage.JSON_OBJECT:
				return createJSONObjectFromString(eDataType, initialValue);
			case HubPackage.EXCEPTION:
				return createExceptionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case HubPackage.AUTHENTICATION_MODE:
				return convertAuthenticationModeToString(eDataType, instanceValue);
			case HubPackage.OPERATION_STATUS:
				return convertOperationStatusToString(eDataType, instanceValue);
			case HubPackage.HTTP_CONTEXT:
				return convertHttpContextToString(eDataType, instanceValue);
			case HubPackage.JSON_OBJECT:
				return convertJSONObjectToString(eDataType, instanceValue);
			case HubPackage.EXCEPTION:
				return convertExceptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hub createHub() {
		HubImpl hub = new HubImpl();
		return hub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guest createGuest() {
		GuestImpl guest = new GuestImpl();
		return guest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Descriptor createDescriptor() {
		DescriptorImpl descriptor = new DescriptorImpl();
		return descriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description createDescription() {
		DescriptionImpl description = new DescriptionImpl();
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestSession createTestSession() {
		TestSessionImpl testSession = new TestSessionImpl();
		return testSession;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestResult createTestResult() {
		TestResultImpl testResult = new TestResultImpl();
		return testResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestClassResult createTestClassResult() {
		TestClassResultImpl testClassResult = new TestClassResultImpl();
		return testClassResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Integer> createStatsEntry() {
		StatsEntryImpl statsEntry = new StatsEntryImpl();
		return statsEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestSuiteResult createTestSuiteResult() {
		TestSuiteResultImpl testSuiteResult = new TestSuiteResultImpl();
		return testSuiteResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterizedTestResult createParameterizedTestResult() {
		ParameterizedTestResultImpl parameterizedTestResult = new ParameterizedTestResultImpl();
		return parameterizedTestResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screenshot createScreenshot() {
		ScreenshotImpl screenshot = new ScreenshotImpl();
		return screenshot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationResult createOperationResult() {
		OperationResultImpl operationResult = new OperationResultImpl();
		return operationResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.webtest.hub.Throwable createThrowable() {
		ThrowableImpl throwable = new ThrowableImpl();
		return throwable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StackTraceEntry createStackTraceEntry() {
		StackTraceEntryImpl stackTraceEntry = new StackTraceEntryImpl();
		return stackTraceEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitializationResult createInitializationResult() {
		InitializationResultImpl initializationResult = new InitializationResultImpl();
		return initializationResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodResult createMethodResult() {
		MethodResultImpl methodResult = new MethodResultImpl();
		return methodResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorMethodResult createActorMethodResult() {
		ActorMethodResultImpl actorMethodResult = new ActorMethodResultImpl();
		return actorMethodResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageMethodResult createPageMethodResult() {
		PageMethodResultImpl pageMethodResult = new PageMethodResultImpl();
		return pageMethodResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestMethodResult createTestMethodResult() {
		TestMethodResultImpl testMethodResult = new TestMethodResultImpl();
		return testMethodResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coverage createCoverage() {
		CoverageImpl coverage = new CoverageImpl();
		return coverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorResult createActorResult() {
		ActorResultImpl actorResult = new ActorResultImpl();
		return actorResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageResult createPageResult() {
		PageResultImpl pageResult = new PageResultImpl();
		return pageResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebElement createWebElement() {
		WebElementImpl webElement = new WebElementImpl();
		return webElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Locator createLocator() {
		LocatorImpl locator = new LocatorImpl();
		return locator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticationMode createAuthenticationModeFromString(EDataType eDataType, String initialValue) {
		AuthenticationMode result = AuthenticationMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuthenticationModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationStatus createOperationStatusFromString(EDataType eDataType, String initialValue) {
		OperationStatus result = OperationStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperationStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpContext createHttpContextFromString(EDataType eDataType, String initialValue) {
		return (HttpContext)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHttpContextToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONObject createJSONObjectFromString(EDataType eDataType, String initialValue) {
		return (JSONObject)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJSONObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exception createExceptionFromString(EDataType eDataType, String initialValue) {
		return (Exception)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HubPackage getHubPackage() {
		return (HubPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HubPackage getPackage() {
		return HubPackage.eINSTANCE;
	}

} //HubFactoryImpl
