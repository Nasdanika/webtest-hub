/**
 */
package org.nasdanika.webtest.hub.util;

import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.nasdanika.cdo.security.LoginPasswordHashUser;
import org.nasdanika.cdo.security.LoginPasswordProtectionDomain;
import org.nasdanika.cdo.security.LoginUser;
import org.nasdanika.cdo.security.Principal;
import org.nasdanika.cdo.security.ProtectionDomain;
import org.nasdanika.core.Deletable;
import org.nasdanika.core.JSONLoader;
import org.nasdanika.webtest.hub.ActorMethodResult;
import org.nasdanika.webtest.hub.ActorResult;
import org.nasdanika.webtest.hub.Application;
import org.nasdanika.webtest.hub.ApplicationOwner;
import org.nasdanika.webtest.hub.ApplicationRenderer;
import org.nasdanika.webtest.hub.BreadcrumbsProvider;
import org.nasdanika.webtest.hub.Coverage;
import org.nasdanika.webtest.hub.Description;
import org.nasdanika.webtest.hub.Descriptor;
import org.nasdanika.webtest.hub.Guest;
import org.nasdanika.webtest.hub.Hub;
import org.nasdanika.webtest.hub.HubPackage;
import org.nasdanika.webtest.hub.InitializationResult;
import org.nasdanika.webtest.hub.Locator;
import org.nasdanika.webtest.hub.MethodResult;
import org.nasdanika.webtest.hub.OperationResult;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.webtest.hub.HubPackage
 * @generated
 */
public class HubSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HubPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HubSwitch() {
		if (modelPackage == null) {
			modelPackage = HubPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case HubPackage.HUB: {
				Hub hub = (Hub)theEObject;
				T result = caseHub(hub);
				if (result == null) result = caseLoginPasswordProtectionDomain(hub);
				if (result == null) result = caseApplicationOwner(hub);
				if (result == null) result = caseBreadcrumbsProvider(hub);
				if (result == null) result = caseProtectionDomain(hub);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HubPackage.APPLICATION_OWNER: {
				ApplicationOwner applicationOwner = (ApplicationOwner)theEObject;
				T result = caseApplicationOwner(applicationOwner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HubPackage.GUEST: {
				Guest guest = (Guest)theEObject;
				T result = caseGuest(guest);
				if (result == null) result = caseSecurity_User(guest);
				if (result == null) result = caseApplicationRenderer(guest);
				if (result == null) result = casePrincipal(guest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HubPackage.USER: {
				User user = (User)theEObject;
				T result = caseUser(user);
				if (result == null) result = caseApplicationOwner(user);
				if (result == null) result = caseLoginPasswordHashUser(user);
				if (result == null) result = caseApplicationRenderer(user);
				if (result == null) result = caseLoginUser(user);
				if (result == null) result = caseSecurity_User(user);
				if (result == null) result = casePrincipal(user);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HubPackage.APPLICATION: {
				Application application = (Application)theEObject;
				T result = caseApplication(application);
				if (result == null) result = caseBreadcrumbsProvider(application);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HubPackage.DESCRIPTOR: {
				Descriptor descriptor = (Descriptor)theEObject;
				T result = caseDescriptor(descriptor);
				if (result == null) result = caseJSONLoader(descriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HubPackage.DESCRIPTION: {
				Description description = (Description)theEObject;
				T result = caseDescription(description);
				if (result == null) result = caseJSONLoader(description);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HubPackage.TEST_SESSION: {
				TestSession testSession = (TestSession)theEObject;
				T result = caseTestSession(testSession);
				if (result == null) result = caseDescriptor(testSession);
				if (result == null) result = caseBreadcrumbsProvider(testSession);
				if (result == null) result = caseDeletable(testSession);
				if (result == null) result = caseJSONLoader(testSession);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HubPackage.TEST_RESULT: {
				TestResult testResult = (TestResult)theEObject;
				T result = caseTestResult(testResult);
				if (result == null) result = caseDescriptor(testResult);
				if (result == null) result = caseBreadcrumbsProvider(testResult);
				if (result == null) result = caseJSONLoader(testResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HubPackage.TEST_CLASS_RESULT: {
				TestClassResult testClassResult = (TestClassResult)theEObject;
				T result = caseTestClassResult(testClassResult);
				if (result == null) result = caseTestResult(testClassResult);
				if (result == null) result = caseDescriptor(testClassResult);
				if (result == null) result = caseBreadcrumbsProvider(testClassResult);
				if (result == null) result = caseJSONLoader(testClassResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HubPackage.STATS_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, Integer> statsEntry = (Map.Entry<String, Integer>)theEObject;
				T result = caseStatsEntry(statsEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HubPackage.TEST_SUITE_RESULT: {
				TestSuiteResult testSuiteResult = (TestSuiteResult)theEObject;
				T result = caseTestSuiteResult(testSuiteResult);
				if (result == null) result = caseTestResult(testSuiteResult);
				if (result == null) result = caseDescriptor(testSuiteResult);
				if (result == null) result = caseBreadcrumbsProvider(testSuiteResult);
				if (result == null) result = caseJSONLoader(testSuiteResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HubPackage.PARAMETERIZED_TEST_RESULT: {
				ParameterizedTestResult parameterizedTestResult = (ParameterizedTestResult)theEObject;
				T result = caseParameterizedTestResult(parameterizedTestResult);
				if (result == null) result = caseTestSuiteResult(parameterizedTestResult);
				if (result == null) result = caseTestResult(parameterizedTestResult);
				if (result == null) result = caseDescriptor(parameterizedTestResult);
				if (result == null) result = caseBreadcrumbsProvider(parameterizedTestResult);
				if (result == null) result = caseJSONLoader(parameterizedTestResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HubPackage.SCREENSHOT: {
				Screenshot screenshot = (Screenshot)theEObject;
				T result = caseScreenshot(screenshot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HubPackage.OPERATION_RESULT: {
				OperationResult operationResult = (OperationResult)theEObject;
				T result = caseOperationResult(operationResult);
				if (result == null) result = caseDescriptor(operationResult);
				if (result == null) result = caseBreadcrumbsProvider(operationResult);
				if (result == null) result = caseJSONLoader(operationResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HubPackage.THROWABLE: {
				org.nasdanika.webtest.hub.Throwable throwable = (org.nasdanika.webtest.hub.Throwable)theEObject;
				T result = caseThrowable(throwable);
				if (result == null) result = caseJSONLoader(throwable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HubPackage.STACK_TRACE_ENTRY: {
				StackTraceEntry stackTraceEntry = (StackTraceEntry)theEObject;
				T result = caseStackTraceEntry(stackTraceEntry);
				if (result == null) result = caseJSONLoader(stackTraceEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HubPackage.INITIALIZATION_RESULT: {
				InitializationResult initializationResult = (InitializationResult)theEObject;
				T result = caseInitializationResult(initializationResult);
				if (result == null) result = casePageMethodResult(initializationResult);
				if (result == null) result = caseMethodResult(initializationResult);
				if (result == null) result = caseOperationResult(initializationResult);
				if (result == null) result = caseDescriptor(initializationResult);
				if (result == null) result = caseBreadcrumbsProvider(initializationResult);
				if (result == null) result = caseJSONLoader(initializationResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HubPackage.METHOD_RESULT: {
				MethodResult methodResult = (MethodResult)theEObject;
				T result = caseMethodResult(methodResult);
				if (result == null) result = caseOperationResult(methodResult);
				if (result == null) result = caseDescriptor(methodResult);
				if (result == null) result = caseBreadcrumbsProvider(methodResult);
				if (result == null) result = caseJSONLoader(methodResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HubPackage.ACTOR_METHOD_RESULT: {
				ActorMethodResult actorMethodResult = (ActorMethodResult)theEObject;
				T result = caseActorMethodResult(actorMethodResult);
				if (result == null) result = caseMethodResult(actorMethodResult);
				if (result == null) result = caseOperationResult(actorMethodResult);
				if (result == null) result = caseDescriptor(actorMethodResult);
				if (result == null) result = caseBreadcrumbsProvider(actorMethodResult);
				if (result == null) result = caseJSONLoader(actorMethodResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HubPackage.PAGE_METHOD_RESULT: {
				PageMethodResult pageMethodResult = (PageMethodResult)theEObject;
				T result = casePageMethodResult(pageMethodResult);
				if (result == null) result = caseMethodResult(pageMethodResult);
				if (result == null) result = caseOperationResult(pageMethodResult);
				if (result == null) result = caseDescriptor(pageMethodResult);
				if (result == null) result = caseBreadcrumbsProvider(pageMethodResult);
				if (result == null) result = caseJSONLoader(pageMethodResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HubPackage.TEST_METHOD_RESULT: {
				TestMethodResult testMethodResult = (TestMethodResult)theEObject;
				T result = caseTestMethodResult(testMethodResult);
				if (result == null) result = caseOperationResult(testMethodResult);
				if (result == null) result = caseDescriptor(testMethodResult);
				if (result == null) result = caseBreadcrumbsProvider(testMethodResult);
				if (result == null) result = caseJSONLoader(testMethodResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HubPackage.COVERAGE: {
				Coverage coverage = (Coverage)theEObject;
				T result = caseCoverage(coverage);
				if (result == null) result = caseDescriptor(coverage);
				if (result == null) result = caseJSONLoader(coverage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HubPackage.ACTOR_RESULT: {
				ActorResult actorResult = (ActorResult)theEObject;
				T result = caseActorResult(actorResult);
				if (result == null) result = caseDescriptor(actorResult);
				if (result == null) result = caseBreadcrumbsProvider(actorResult);
				if (result == null) result = caseJSONLoader(actorResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HubPackage.PAGE_RESULT: {
				PageResult pageResult = (PageResult)theEObject;
				T result = casePageResult(pageResult);
				if (result == null) result = caseDescriptor(pageResult);
				if (result == null) result = caseBreadcrumbsProvider(pageResult);
				if (result == null) result = caseJSONLoader(pageResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HubPackage.WEB_ELEMENT: {
				WebElement webElement = (WebElement)theEObject;
				T result = caseWebElement(webElement);
				if (result == null) result = caseDescriptor(webElement);
				if (result == null) result = caseJSONLoader(webElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HubPackage.LOCATOR: {
				Locator locator = (Locator)theEObject;
				T result = caseLocator(locator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HubPackage.JSON_LOADER: {
				JSONLoader jsonLoader = (JSONLoader)theEObject;
				T result = caseJSONLoader(jsonLoader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HubPackage.BREADCRUMBS_PROVIDER: {
				BreadcrumbsProvider breadcrumbsProvider = (BreadcrumbsProvider)theEObject;
				T result = caseBreadcrumbsProvider(breadcrumbsProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HubPackage.DELETABLE: {
				Deletable deletable = (Deletable)theEObject;
				T result = caseDeletable(deletable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HubPackage.APPLICATION_RENDERER: {
				ApplicationRenderer applicationRenderer = (ApplicationRenderer)theEObject;
				T result = caseApplicationRenderer(applicationRenderer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hub</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHub(Hub object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Owner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Owner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationOwner(ApplicationOwner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuest(Guest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplication(Application object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptor(Descriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescription(Description object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Session</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Session</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestSession(TestSession object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestResult(TestResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Class Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Class Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestClassResult(TestClassResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stats Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stats Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatsEntry(Map.Entry<String, Integer> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Suite Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Suite Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestSuiteResult(TestSuiteResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterized Test Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterized Test Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterizedTestResult(ParameterizedTestResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screenshot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screenshot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScreenshot(Screenshot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationResult(OperationResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Throwable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Throwable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThrowable(org.nasdanika.webtest.hub.Throwable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stack Trace Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stack Trace Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStackTraceEntry(StackTraceEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initialization Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initialization Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitializationResult(InitializationResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodResult(MethodResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor Method Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor Method Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActorMethodResult(ActorMethodResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page Method Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Method Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePageMethodResult(PageMethodResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Method Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Method Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestMethodResult(TestMethodResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverage(Coverage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActorResult(ActorResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePageResult(PageResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWebElement(WebElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Locator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Locator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocator(Locator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSON Loader</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSON Loader</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJSONLoader(JSONLoader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Breadcrumbs Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Breadcrumbs Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreadcrumbsProvider(BreadcrumbsProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deletable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deletable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeletable(Deletable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Renderer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Renderer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationRenderer(ApplicationRenderer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protection Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protection Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <CR> T caseProtectionDomain(ProtectionDomain<CR> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Login Password Protection Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Login Password Protection Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoginPasswordProtectionDomain(LoginPasswordProtectionDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Principal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Principal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrincipal(Principal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurity_User(org.nasdanika.cdo.security.User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Login User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Login User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoginUser(LoginUser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Login Password Hash User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Login Password Hash User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoginPasswordHashUser(LoginPasswordHashUser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //HubSwitch
