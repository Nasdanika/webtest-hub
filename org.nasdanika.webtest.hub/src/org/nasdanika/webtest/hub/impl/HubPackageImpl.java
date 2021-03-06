/**
 */
package org.nasdanika.webtest.hub.impl;

import java.util.Map;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.nasdanika.cdo.CDOViewContext;
import org.nasdanika.cdo.security.SecurityPackage;
import org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext;
import org.nasdanika.cdo.web.SessionWebSocketServlet.WebSocketContext;
import org.nasdanika.core.Command;
import org.nasdanika.core.Deletable;
import org.nasdanika.core.JSONLoader;
import org.nasdanika.html.ApplicationPanel;
import org.nasdanika.web.HttpServletRequestContext;
import org.nasdanika.webtest.hub.ActorMethodResult;
import org.nasdanika.webtest.hub.ActorResult;
import org.nasdanika.webtest.hub.Application;
import org.nasdanika.webtest.hub.ApplicationOwner;
import org.nasdanika.webtest.hub.ApplicationRenderer;
import org.nasdanika.webtest.hub.AuthenticationMode;
import org.nasdanika.webtest.hub.BreadcrumbsProvider;
import org.nasdanika.webtest.hub.Coverage;
import org.nasdanika.webtest.hub.Description;
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
import org.nasdanika.webtest.performance.PerformancePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HubPackageImpl extends EPackageImpl implements HubPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hubEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationOwnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testSessionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testClassResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statsEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testSuiteResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterizedTestResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass screenshotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass throwableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stackTraceEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initializationResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorMethodResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageMethodResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testMethodResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coverageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonLoaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breadcrumbsProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deletableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationRendererEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum authenticationModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operationStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType httpServletResponseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdoViewContextEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType httpServletRequestContextEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cdoTransactionHttpServletRequestContextEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType webSocketContextEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType voidEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType commandEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType applicationPanelEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.webtest.hub.HubPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HubPackageImpl() {
		super(eNS_URI, HubFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link HubPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HubPackage init() {
		if (isInited) return (HubPackage)EPackage.Registry.INSTANCE.getEPackage(HubPackage.eNS_URI);

		// Obtain or create and register package
		HubPackageImpl theHubPackage = (HubPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HubPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HubPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PerformancePackage.eINSTANCE.eClass();
		SecurityPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theHubPackage.createPackageContents();

		// Initialize created meta-data
		theHubPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHubPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HubPackage.eNS_URI, theHubPackage);
		return theHubPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHub() {
		return hubEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHub_Name() {
		return (EAttribute)hubEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHub_Guest() {
		return (EReference)hubEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHub_Users() {
		return (EReference)hubEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHub_Administrators() {
		return (EReference)hubEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHub_SlideWidth() {
		return (EAttribute)hubEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHub_Everyone() {
		return (EReference)hubEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHub__ExecuteScript__WebSocketContext_String() {
		return hubEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHub__UserList() {
		return hubEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHub__DeleteUser__String() {
		return hubEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHub__CreateOrUpdateUser__String_String_String_boolean_boolean_AuthenticationMode_String_String() {
		return hubEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHub__Home__CDOViewContext_HttpServletRequestContext() {
		return hubEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationOwner() {
		return applicationOwnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationOwner_Applications() {
		return (EReference)applicationOwnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuest() {
		return guestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGuest__RegistrationForm__CDOTransactionHttpServletRequestContext() {
		return guestEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGuest__Home__HttpServletRequestContext() {
		return guestEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGuest__Register__WebSocketContext_String_String_String_String_String() {
		return guestEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Name() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplication() {
		return applicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_TestSessions() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_SecurityToken() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_Screenshots() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_Name() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplication_Description() {
		return (EAttribute)applicationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplication__GetSummaryRow__WebSocketContext() {
		return applicationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptor() {
		return descriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptor_QualifiedName() {
		return (EAttribute)descriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptor_Title() {
		return (EAttribute)descriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescriptor_Description() {
		return (EReference)descriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescription() {
		return descriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescription_Url() {
		return (EAttribute)descriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescription_Value() {
		return (EAttribute)descriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescription_Html() {
		return (EAttribute)descriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestSession() {
		return testSessionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestSession_TestResults() {
		return (EReference)testSessionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestSession_PageResults() {
		return (EReference)testSessionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestSession_ActorResults() {
		return (EReference)testSessionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestSession_Published() {
		return (EAttribute)testSessionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestSession_Size() {
		return (EAttribute)testSessionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestSession_Progress() {
		return (EAttribute)testSessionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestSession_Timestamp() {
		return (EAttribute)testSessionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestSession_Node() {
		return (EAttribute)testSessionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTestSession__GetSummaryRow__WebSocketContext() {
		return testSessionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestResult() {
		return testResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestResult_PageResults() {
		return (EReference)testResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestResult_ActorResults() {
		return (EReference)testResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestClassResult() {
		return testClassResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestClassResult_MethodResults() {
		return (EReference)testClassResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestClassResult_Stats() {
		return (EReference)testClassResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatsEntry() {
		return statsEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatsEntry_Key() {
		return (EAttribute)statsEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatsEntry_Value() {
		return (EAttribute)statsEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestSuiteResult() {
		return testSuiteResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestSuiteResult_Children() {
		return (EReference)testSuiteResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterizedTestResult() {
		return parameterizedTestResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterizedTestResult_ParameterDescriptors() {
		return (EReference)parameterizedTestResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScreenshot() {
		return screenshotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScreenshot_Content() {
		return (EAttribute)screenshotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScreenshot_Timestamp() {
		return (EAttribute)screenshotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScreenshot_Height() {
		return (EAttribute)screenshotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScreenshot_Width() {
		return (EAttribute)screenshotEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScreenshot_ContentType() {
		return (EAttribute)screenshotEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScreenshot_Length() {
		return (EAttribute)screenshotEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScreenshot_Digest() {
		return (EAttribute)screenshotEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScreenshot_BeforeOperations() {
		return (EReference)screenshotEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScreenshot_AfterOperations() {
		return (EReference)screenshotEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationResult() {
		return operationResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationResult_Screenshots() {
		return (EReference)operationResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationResult_Children() {
		return (EReference)operationResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationResult_OperationName() {
		return (EAttribute)operationResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationResult_Arguments() {
		return (EAttribute)operationResultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationResult_BeforeTiming() {
		return (EReference)operationResultEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationResult_BeforeScreenshot() {
		return (EReference)operationResultEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationResult_AfterTiming() {
		return (EReference)operationResultEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationResult_AfterScreenshot() {
		return (EReference)operationResultEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationResult_Failure() {
		return (EReference)operationResultEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationResult_Error() {
		return (EReference)operationResultEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationResult_Start() {
		return (EAttribute)operationResultEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationResult_Finish() {
		return (EAttribute)operationResultEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationResult_Status() {
		return (EAttribute)operationResultEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThrowable() {
		return throwableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThrowable_Type() {
		return (EAttribute)throwableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThrowable_Message() {
		return (EAttribute)throwableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThrowable_StackTrace() {
		return (EReference)throwableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStackTraceEntry() {
		return stackTraceEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStackTraceEntry_ClassName() {
		return (EAttribute)stackTraceEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStackTraceEntry_FileName() {
		return (EAttribute)stackTraceEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStackTraceEntry_MethodName() {
		return (EAttribute)stackTraceEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStackTraceEntry_LineNumber() {
		return (EAttribute)stackTraceEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStackTraceEntry_Native() {
		return (EAttribute)stackTraceEntryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitializationResult() {
		return initializationResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodResult() {
		return methodResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActorMethodResult() {
		return actorMethodResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActorMethodResult_ActorResult() {
		return (EReference)actorMethodResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageMethodResult() {
		return pageMethodResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageMethodResult_PageResult() {
		return (EReference)pageMethodResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestMethodResult() {
		return testMethodResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestMethodResult_Parameters() {
		return (EAttribute)testMethodResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestMethodResult_NavigationTiming() {
		return (EReference)testMethodResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTestMethodResult__LoadTiming__JSONObject() {
		return testMethodResultEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoverage() {
		return coverageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoverage_Invocations() {
		return (EAttribute)coverageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActorResult() {
		return actorResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActorResult_Results() {
		return (EReference)actorResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActorResult_Coverage() {
		return (EReference)actorResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActorResult_Proxy() {
		return (EAttribute)actorResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageResult() {
		return pageResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageResult_Results() {
		return (EReference)pageResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageResult_Coverage() {
		return (EReference)pageResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageResult_WebElements() {
		return (EReference)pageResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPageResult_Proxy() {
		return (EAttribute)pageResultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebElement() {
		return webElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWebElement_Locators() {
		return (EReference)webElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocator() {
		return locatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocator_How() {
		return (EAttribute)locatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocator_Using() {
		return (EAttribute)locatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJSONLoader() {
		return jsonLoaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreadcrumbsProvider() {
		return breadcrumbsProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeletable() {
		return deletableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationRenderer() {
		return applicationRendererEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplicationRenderer__RenderApplication__HttpServletRequestContext_Command() {
		return applicationRendererEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuthenticationMode() {
		return authenticationModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperationStatus() {
		return operationStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHttpServletResponse() {
		return httpServletResponseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCDOViewContext() {
		return cdoViewContextEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getHttpServletRequestContext() {
		return httpServletRequestContextEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCDOTransactionHttpServletRequestContext() {
		return cdoTransactionHttpServletRequestContextEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getWebSocketContext() {
		return webSocketContextEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVoid() {
		return voidEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCommand() {
		return commandEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getApplicationPanel() {
		return applicationPanelEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HubFactory getHubFactory() {
		return (HubFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		hubEClass = createEClass(HUB);
		createEAttribute(hubEClass, HUB__NAME);
		createEReference(hubEClass, HUB__GUEST);
		createEReference(hubEClass, HUB__USERS);
		createEReference(hubEClass, HUB__ADMINISTRATORS);
		createEAttribute(hubEClass, HUB__SLIDE_WIDTH);
		createEReference(hubEClass, HUB__EVERYONE);
		createEOperation(hubEClass, HUB___EXECUTE_SCRIPT__WEBSOCKETCONTEXT_STRING);
		createEOperation(hubEClass, HUB___USER_LIST);
		createEOperation(hubEClass, HUB___DELETE_USER__STRING);
		createEOperation(hubEClass, HUB___CREATE_OR_UPDATE_USER__STRING_STRING_STRING_BOOLEAN_BOOLEAN_AUTHENTICATIONMODE_STRING_STRING);
		createEOperation(hubEClass, HUB___HOME__CDOVIEWCONTEXT_HTTPSERVLETREQUESTCONTEXT);

		applicationOwnerEClass = createEClass(APPLICATION_OWNER);
		createEReference(applicationOwnerEClass, APPLICATION_OWNER__APPLICATIONS);

		guestEClass = createEClass(GUEST);
		createEOperation(guestEClass, GUEST___REGISTRATION_FORM__CDOTRANSACTIONHTTPSERVLETREQUESTCONTEXT);
		createEOperation(guestEClass, GUEST___HOME__HTTPSERVLETREQUESTCONTEXT);
		createEOperation(guestEClass, GUEST___REGISTER__WEBSOCKETCONTEXT_STRING_STRING_STRING_STRING_STRING);

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__NAME);

		applicationEClass = createEClass(APPLICATION);
		createEReference(applicationEClass, APPLICATION__TEST_SESSIONS);
		createEAttribute(applicationEClass, APPLICATION__SECURITY_TOKEN);
		createEReference(applicationEClass, APPLICATION__SCREENSHOTS);
		createEAttribute(applicationEClass, APPLICATION__NAME);
		createEAttribute(applicationEClass, APPLICATION__DESCRIPTION);
		createEOperation(applicationEClass, APPLICATION___GET_SUMMARY_ROW__WEBSOCKETCONTEXT);

		descriptorEClass = createEClass(DESCRIPTOR);
		createEAttribute(descriptorEClass, DESCRIPTOR__QUALIFIED_NAME);
		createEAttribute(descriptorEClass, DESCRIPTOR__TITLE);
		createEReference(descriptorEClass, DESCRIPTOR__DESCRIPTION);

		descriptionEClass = createEClass(DESCRIPTION);
		createEAttribute(descriptionEClass, DESCRIPTION__URL);
		createEAttribute(descriptionEClass, DESCRIPTION__VALUE);
		createEAttribute(descriptionEClass, DESCRIPTION__HTML);

		testSessionEClass = createEClass(TEST_SESSION);
		createEReference(testSessionEClass, TEST_SESSION__TEST_RESULTS);
		createEReference(testSessionEClass, TEST_SESSION__PAGE_RESULTS);
		createEReference(testSessionEClass, TEST_SESSION__ACTOR_RESULTS);
		createEAttribute(testSessionEClass, TEST_SESSION__PUBLISHED);
		createEAttribute(testSessionEClass, TEST_SESSION__SIZE);
		createEAttribute(testSessionEClass, TEST_SESSION__PROGRESS);
		createEAttribute(testSessionEClass, TEST_SESSION__TIMESTAMP);
		createEAttribute(testSessionEClass, TEST_SESSION__NODE);
		createEOperation(testSessionEClass, TEST_SESSION___GET_SUMMARY_ROW__WEBSOCKETCONTEXT);

		testResultEClass = createEClass(TEST_RESULT);
		createEReference(testResultEClass, TEST_RESULT__PAGE_RESULTS);
		createEReference(testResultEClass, TEST_RESULT__ACTOR_RESULTS);

		testClassResultEClass = createEClass(TEST_CLASS_RESULT);
		createEReference(testClassResultEClass, TEST_CLASS_RESULT__METHOD_RESULTS);
		createEReference(testClassResultEClass, TEST_CLASS_RESULT__STATS);

		statsEntryEClass = createEClass(STATS_ENTRY);
		createEAttribute(statsEntryEClass, STATS_ENTRY__KEY);
		createEAttribute(statsEntryEClass, STATS_ENTRY__VALUE);

		testSuiteResultEClass = createEClass(TEST_SUITE_RESULT);
		createEReference(testSuiteResultEClass, TEST_SUITE_RESULT__CHILDREN);

		parameterizedTestResultEClass = createEClass(PARAMETERIZED_TEST_RESULT);
		createEReference(parameterizedTestResultEClass, PARAMETERIZED_TEST_RESULT__PARAMETER_DESCRIPTORS);

		screenshotEClass = createEClass(SCREENSHOT);
		createEAttribute(screenshotEClass, SCREENSHOT__CONTENT);
		createEAttribute(screenshotEClass, SCREENSHOT__TIMESTAMP);
		createEAttribute(screenshotEClass, SCREENSHOT__HEIGHT);
		createEAttribute(screenshotEClass, SCREENSHOT__WIDTH);
		createEAttribute(screenshotEClass, SCREENSHOT__CONTENT_TYPE);
		createEAttribute(screenshotEClass, SCREENSHOT__LENGTH);
		createEAttribute(screenshotEClass, SCREENSHOT__DIGEST);
		createEReference(screenshotEClass, SCREENSHOT__BEFORE_OPERATIONS);
		createEReference(screenshotEClass, SCREENSHOT__AFTER_OPERATIONS);

		operationResultEClass = createEClass(OPERATION_RESULT);
		createEReference(operationResultEClass, OPERATION_RESULT__SCREENSHOTS);
		createEReference(operationResultEClass, OPERATION_RESULT__CHILDREN);
		createEAttribute(operationResultEClass, OPERATION_RESULT__OPERATION_NAME);
		createEAttribute(operationResultEClass, OPERATION_RESULT__ARGUMENTS);
		createEReference(operationResultEClass, OPERATION_RESULT__BEFORE_TIMING);
		createEReference(operationResultEClass, OPERATION_RESULT__BEFORE_SCREENSHOT);
		createEReference(operationResultEClass, OPERATION_RESULT__AFTER_TIMING);
		createEReference(operationResultEClass, OPERATION_RESULT__AFTER_SCREENSHOT);
		createEReference(operationResultEClass, OPERATION_RESULT__FAILURE);
		createEReference(operationResultEClass, OPERATION_RESULT__ERROR);
		createEAttribute(operationResultEClass, OPERATION_RESULT__START);
		createEAttribute(operationResultEClass, OPERATION_RESULT__FINISH);
		createEAttribute(operationResultEClass, OPERATION_RESULT__STATUS);

		throwableEClass = createEClass(THROWABLE);
		createEAttribute(throwableEClass, THROWABLE__TYPE);
		createEAttribute(throwableEClass, THROWABLE__MESSAGE);
		createEReference(throwableEClass, THROWABLE__STACK_TRACE);

		stackTraceEntryEClass = createEClass(STACK_TRACE_ENTRY);
		createEAttribute(stackTraceEntryEClass, STACK_TRACE_ENTRY__CLASS_NAME);
		createEAttribute(stackTraceEntryEClass, STACK_TRACE_ENTRY__FILE_NAME);
		createEAttribute(stackTraceEntryEClass, STACK_TRACE_ENTRY__METHOD_NAME);
		createEAttribute(stackTraceEntryEClass, STACK_TRACE_ENTRY__LINE_NUMBER);
		createEAttribute(stackTraceEntryEClass, STACK_TRACE_ENTRY__NATIVE);

		initializationResultEClass = createEClass(INITIALIZATION_RESULT);

		methodResultEClass = createEClass(METHOD_RESULT);

		actorMethodResultEClass = createEClass(ACTOR_METHOD_RESULT);
		createEReference(actorMethodResultEClass, ACTOR_METHOD_RESULT__ACTOR_RESULT);

		pageMethodResultEClass = createEClass(PAGE_METHOD_RESULT);
		createEReference(pageMethodResultEClass, PAGE_METHOD_RESULT__PAGE_RESULT);

		testMethodResultEClass = createEClass(TEST_METHOD_RESULT);
		createEAttribute(testMethodResultEClass, TEST_METHOD_RESULT__PARAMETERS);
		createEReference(testMethodResultEClass, TEST_METHOD_RESULT__NAVIGATION_TIMING);
		createEOperation(testMethodResultEClass, TEST_METHOD_RESULT___LOAD_TIMING__JSONOBJECT);

		coverageEClass = createEClass(COVERAGE);
		createEAttribute(coverageEClass, COVERAGE__INVOCATIONS);

		actorResultEClass = createEClass(ACTOR_RESULT);
		createEReference(actorResultEClass, ACTOR_RESULT__RESULTS);
		createEReference(actorResultEClass, ACTOR_RESULT__COVERAGE);
		createEAttribute(actorResultEClass, ACTOR_RESULT__PROXY);

		pageResultEClass = createEClass(PAGE_RESULT);
		createEReference(pageResultEClass, PAGE_RESULT__RESULTS);
		createEReference(pageResultEClass, PAGE_RESULT__COVERAGE);
		createEReference(pageResultEClass, PAGE_RESULT__WEB_ELEMENTS);
		createEAttribute(pageResultEClass, PAGE_RESULT__PROXY);

		webElementEClass = createEClass(WEB_ELEMENT);
		createEReference(webElementEClass, WEB_ELEMENT__LOCATORS);

		locatorEClass = createEClass(LOCATOR);
		createEAttribute(locatorEClass, LOCATOR__HOW);
		createEAttribute(locatorEClass, LOCATOR__USING);

		jsonLoaderEClass = createEClass(JSON_LOADER);

		breadcrumbsProviderEClass = createEClass(BREADCRUMBS_PROVIDER);

		deletableEClass = createEClass(DELETABLE);

		applicationRendererEClass = createEClass(APPLICATION_RENDERER);
		createEOperation(applicationRendererEClass, APPLICATION_RENDERER___RENDER_APPLICATION__HTTPSERVLETREQUESTCONTEXT_COMMAND);

		// Create enums
		authenticationModeEEnum = createEEnum(AUTHENTICATION_MODE);
		operationStatusEEnum = createEEnum(OPERATION_STATUS);

		// Create data types
		httpServletResponseEDataType = createEDataType(HTTP_SERVLET_RESPONSE);
		cdoViewContextEDataType = createEDataType(CDO_VIEW_CONTEXT);
		httpServletRequestContextEDataType = createEDataType(HTTP_SERVLET_REQUEST_CONTEXT);
		cdoTransactionHttpServletRequestContextEDataType = createEDataType(CDO_TRANSACTION_HTTP_SERVLET_REQUEST_CONTEXT);
		webSocketContextEDataType = createEDataType(WEB_SOCKET_CONTEXT);
		voidEDataType = createEDataType(VOID);
		commandEDataType = createEDataType(COMMAND);
		applicationPanelEDataType = createEDataType(APPLICATION_PANEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SecurityPackage theSecurityPackage = (SecurityPackage)EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI);
		PerformancePackage thePerformancePackage = (PerformancePackage)EPackage.Registry.INSTANCE.getEPackage(PerformancePackage.eNS_URI);

		// Create type parameters
		addETypeParameter(cdoViewContextEDataType, "V");
		addETypeParameter(cdoViewContextEDataType, "CR");
		addETypeParameter(cdoTransactionHttpServletRequestContextEDataType, "CR");
		addETypeParameter(webSocketContextEDataType, "CR");
		addETypeParameter(commandEDataType, "C");
		addETypeParameter(commandEDataType, "T");
		addETypeParameter(commandEDataType, "R");

		// Set bounds for type parameters

		// Add supertypes to classes
		hubEClass.getESuperTypes().add(theSecurityPackage.getLoginPasswordProtectionDomain());
		hubEClass.getESuperTypes().add(this.getApplicationOwner());
		hubEClass.getESuperTypes().add(this.getBreadcrumbsProvider());
		guestEClass.getESuperTypes().add(theSecurityPackage.getUser());
		guestEClass.getESuperTypes().add(this.getApplicationRenderer());
		userEClass.getESuperTypes().add(this.getApplicationOwner());
		userEClass.getESuperTypes().add(theSecurityPackage.getLoginPasswordHashUser());
		userEClass.getESuperTypes().add(this.getApplicationRenderer());
		applicationEClass.getESuperTypes().add(this.getBreadcrumbsProvider());
		descriptorEClass.getESuperTypes().add(this.getJSONLoader());
		descriptionEClass.getESuperTypes().add(this.getJSONLoader());
		testSessionEClass.getESuperTypes().add(this.getDescriptor());
		testSessionEClass.getESuperTypes().add(this.getBreadcrumbsProvider());
		testSessionEClass.getESuperTypes().add(this.getDeletable());
		testResultEClass.getESuperTypes().add(this.getDescriptor());
		testResultEClass.getESuperTypes().add(this.getBreadcrumbsProvider());
		testClassResultEClass.getESuperTypes().add(this.getTestResult());
		testSuiteResultEClass.getESuperTypes().add(this.getTestResult());
		parameterizedTestResultEClass.getESuperTypes().add(this.getTestSuiteResult());
		operationResultEClass.getESuperTypes().add(this.getDescriptor());
		operationResultEClass.getESuperTypes().add(this.getBreadcrumbsProvider());
		throwableEClass.getESuperTypes().add(this.getJSONLoader());
		stackTraceEntryEClass.getESuperTypes().add(this.getJSONLoader());
		initializationResultEClass.getESuperTypes().add(this.getPageMethodResult());
		methodResultEClass.getESuperTypes().add(this.getOperationResult());
		actorMethodResultEClass.getESuperTypes().add(this.getMethodResult());
		pageMethodResultEClass.getESuperTypes().add(this.getMethodResult());
		testMethodResultEClass.getESuperTypes().add(this.getOperationResult());
		coverageEClass.getESuperTypes().add(this.getDescriptor());
		actorResultEClass.getESuperTypes().add(this.getDescriptor());
		actorResultEClass.getESuperTypes().add(this.getBreadcrumbsProvider());
		pageResultEClass.getESuperTypes().add(this.getDescriptor());
		pageResultEClass.getESuperTypes().add(this.getBreadcrumbsProvider());
		webElementEClass.getESuperTypes().add(this.getDescriptor());

		// Initialize classes, features, and operations; add parameters
		initEClass(hubEClass, Hub.class, "Hub", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHub_Name(), ecorePackage.getEString(), "name", "Web Test Hub", 0, 1, Hub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHub_Guest(), this.getGuest(), null, "guest", null, 0, 1, Hub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHub_Users(), this.getUser(), null, "users", null, 0, -1, Hub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHub_Administrators(), theSecurityPackage.getGroup(), null, "administrators", null, 0, 1, Hub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHub_SlideWidth(), ecorePackage.getEInt(), "slideWidth", "800", 0, 1, Hub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHub_Everyone(), theSecurityPackage.getGroup(), null, "everyone", null, 0, 1, Hub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getHub__ExecuteScript__WebSocketContext_String(), null, "executeScript", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(this.getWebSocketContext());
		EGenericType g2 = createEGenericType(theSecurityPackage.getLoginPasswordCredentials());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "script", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePerformancePackage.getException());
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getHub__UserList(), null, "userList", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePerformancePackage.getException());
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getHub__DeleteUser__String(), null, "deleteUser", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "login", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePerformancePackage.getException());
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getHub__CreateOrUpdateUser__String_String_String_boolean_boolean_AuthenticationMode_String_String(), null, "createOrUpdateUser", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "userID", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "login", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "admin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "disabled", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAuthenticationMode(), "authentication", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "password", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "passwordConfirmation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePerformancePackage.getException());
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getHub__Home__CDOViewContext_HttpServletRequestContext(), null, "home", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getCDOViewContext());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "viewContext", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getHttpServletRequestContext(), "requestContext", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePerformancePackage.getException());

		initEClass(applicationOwnerEClass, ApplicationOwner.class, "ApplicationOwner", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplicationOwner_Applications(), this.getApplication(), null, "applications", null, 0, -1, ApplicationOwner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guestEClass, Guest.class, "Guest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getGuest__RegistrationForm__CDOTransactionHttpServletRequestContext(), ecorePackage.getEJavaObject(), "registrationForm", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getCDOTransactionHttpServletRequestContext());
		g2 = createEGenericType(theSecurityPackage.getLoginPasswordCredentials());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePerformancePackage.getException());

		op = initEOperation(getGuest__Home__HttpServletRequestContext(), ecorePackage.getEJavaObject(), "home", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getHttpServletRequestContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePerformancePackage.getException());

		op = initEOperation(getGuest__Register__WebSocketContext_String_String_String_String_String(), ecorePackage.getEJavaObject(), "register", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getWebSocketContext());
		g2 = createEGenericType(theSecurityPackage.getLoginPasswordCredentials());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "login", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "eMail", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "password", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "passwordConfirmation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePerformancePackage.getException());

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_Name(), ecorePackage.getEString(), "name", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplication_TestSessions(), this.getTestSession(), null, "testSessions", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_SecurityToken(), ecorePackage.getEString(), "securityToken", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Screenshots(), this.getScreenshot(), null, "screenshots", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_Name(), ecorePackage.getEString(), "name", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_Description(), ecorePackage.getEString(), "description", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getApplication__GetSummaryRow__WebSocketContext(), thePerformancePackage.getJSONObject(), "getSummaryRow", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getWebSocketContext());
		g2 = createEGenericType(theSecurityPackage.getLoginPasswordCredentials());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(descriptorEClass, org.nasdanika.webtest.hub.Descriptor.class, "Descriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescriptor_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 0, 1, org.nasdanika.webtest.hub.Descriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptor_Title(), ecorePackage.getEString(), "title", null, 0, 1, org.nasdanika.webtest.hub.Descriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDescriptor_Description(), this.getDescription(), null, "description", null, 0, 1, org.nasdanika.webtest.hub.Descriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptionEClass, Description.class, "Description", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescription_Url(), ecorePackage.getEString(), "url", null, 0, 1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescription_Value(), ecorePackage.getEString(), "value", null, 0, -1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescription_Html(), ecorePackage.getEBoolean(), "html", null, 0, 1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testSessionEClass, TestSession.class, "TestSession", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestSession_TestResults(), this.getTestResult(), null, "testResults", null, 0, -1, TestSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestSession_PageResults(), this.getPageResult(), null, "pageResults", null, 0, -1, TestSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestSession_ActorResults(), this.getActorResult(), null, "actorResults", null, 0, -1, TestSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestSession_Published(), ecorePackage.getEBoolean(), "published", null, 0, 1, TestSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestSession_Size(), ecorePackage.getEInt(), "size", null, 0, 1, TestSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestSession_Progress(), ecorePackage.getEInt(), "progress", null, 0, 1, TestSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestSession_Timestamp(), ecorePackage.getELong(), "timestamp", null, 0, 1, TestSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestSession_Node(), ecorePackage.getEString(), "node", null, 0, 1, TestSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTestSession__GetSummaryRow__WebSocketContext(), null, "getSummaryRow", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getWebSocketContext());
		g2 = createEGenericType(theSecurityPackage.getLoginPasswordCredentials());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(testResultEClass, TestResult.class, "TestResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestResult_PageResults(), this.getPageResult(), null, "pageResults", null, 0, -1, TestResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestResult_ActorResults(), this.getActorResult(), null, "actorResults", null, 0, -1, TestResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testClassResultEClass, TestClassResult.class, "TestClassResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestClassResult_MethodResults(), this.getTestMethodResult(), null, "methodResults", null, 0, -1, TestClassResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestClassResult_Stats(), this.getStatsEntry(), null, "stats", null, 0, -1, TestClassResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statsEntryEClass, Map.Entry.class, "StatsEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatsEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatsEntry_Value(), ecorePackage.getEIntegerObject(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testSuiteResultEClass, TestSuiteResult.class, "TestSuiteResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestSuiteResult_Children(), this.getTestResult(), null, "children", null, 0, -1, TestSuiteResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterizedTestResultEClass, ParameterizedTestResult.class, "ParameterizedTestResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterizedTestResult_ParameterDescriptors(), this.getDescriptor(), null, "parameterDescriptors", null, 0, -1, ParameterizedTestResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(screenshotEClass, Screenshot.class, "Screenshot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScreenshot_Content(), ecorePackage.getEByteArray(), "content", null, 0, 1, Screenshot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScreenshot_Timestamp(), ecorePackage.getELong(), "timestamp", null, 0, 1, Screenshot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScreenshot_Height(), ecorePackage.getEInt(), "height", null, 0, 1, Screenshot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScreenshot_Width(), ecorePackage.getEInt(), "width", null, 0, 1, Screenshot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScreenshot_ContentType(), ecorePackage.getEString(), "contentType", null, 0, 1, Screenshot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScreenshot_Length(), ecorePackage.getEInt(), "length", null, 0, 1, Screenshot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScreenshot_Digest(), ecorePackage.getEByteArray(), "digest", null, 0, 1, Screenshot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScreenshot_BeforeOperations(), this.getOperationResult(), this.getOperationResult_BeforeScreenshot(), "beforeOperations", null, 0, -1, Screenshot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScreenshot_AfterOperations(), this.getOperationResult(), this.getOperationResult_AfterScreenshot(), "afterOperations", null, 0, -1, Screenshot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationResultEClass, OperationResult.class, "OperationResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationResult_Screenshots(), this.getScreenshot(), null, "screenshots", null, 0, -1, OperationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationResult_Children(), this.getOperationResult(), null, "children", null, 0, -1, OperationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationResult_OperationName(), ecorePackage.getEString(), "operationName", null, 0, 1, OperationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationResult_Arguments(), ecorePackage.getEString(), "arguments", null, 0, -1, OperationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationResult_BeforeTiming(), thePerformancePackage.getTimingBase(), null, "beforeTiming", null, 0, 1, OperationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationResult_BeforeScreenshot(), this.getScreenshot(), this.getScreenshot_BeforeOperations(), "beforeScreenshot", null, 0, 1, OperationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationResult_AfterTiming(), thePerformancePackage.getTimingBase(), null, "afterTiming", null, 0, 1, OperationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationResult_AfterScreenshot(), this.getScreenshot(), this.getScreenshot_AfterOperations(), "afterScreenshot", null, 0, 1, OperationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationResult_Failure(), this.getThrowable(), null, "failure", null, 0, 1, OperationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationResult_Error(), this.getThrowable(), null, "error", null, 0, 1, OperationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationResult_Start(), ecorePackage.getELong(), "start", null, 0, 1, OperationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationResult_Finish(), ecorePackage.getELong(), "finish", null, 0, 1, OperationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationResult_Status(), this.getOperationStatus(), "status", null, 0, 1, OperationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(throwableEClass, org.nasdanika.webtest.hub.Throwable.class, "Throwable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThrowable_Type(), ecorePackage.getEString(), "type", null, 0, 1, org.nasdanika.webtest.hub.Throwable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThrowable_Message(), ecorePackage.getEString(), "message", null, 0, 1, org.nasdanika.webtest.hub.Throwable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThrowable_StackTrace(), this.getStackTraceEntry(), null, "stackTrace", null, 0, -1, org.nasdanika.webtest.hub.Throwable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stackTraceEntryEClass, StackTraceEntry.class, "StackTraceEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStackTraceEntry_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, StackTraceEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStackTraceEntry_FileName(), ecorePackage.getEString(), "fileName", null, 0, 1, StackTraceEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStackTraceEntry_MethodName(), ecorePackage.getEString(), "methodName", null, 0, 1, StackTraceEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStackTraceEntry_LineNumber(), ecorePackage.getEInt(), "lineNumber", null, 0, 1, StackTraceEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStackTraceEntry_Native(), ecorePackage.getEBoolean(), "native", null, 0, 1, StackTraceEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initializationResultEClass, InitializationResult.class, "InitializationResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(methodResultEClass, MethodResult.class, "MethodResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actorMethodResultEClass, ActorMethodResult.class, "ActorMethodResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActorMethodResult_ActorResult(), this.getActorResult(), this.getActorResult_Results(), "actorResult", null, 0, 1, ActorMethodResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageMethodResultEClass, PageMethodResult.class, "PageMethodResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPageMethodResult_PageResult(), this.getPageResult(), this.getPageResult_Results(), "pageResult", null, 0, 1, PageMethodResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testMethodResultEClass, TestMethodResult.class, "TestMethodResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestMethodResult_Parameters(), ecorePackage.getEString(), "parameters", null, 0, -1, TestMethodResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTestMethodResult_NavigationTiming(), thePerformancePackage.getNavigationTiming(), null, "navigationTiming", null, 0, -1, TestMethodResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTestMethodResult__LoadTiming__JSONObject(), thePerformancePackage.getTimingBase(), "loadTiming", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, thePerformancePackage.getJSONObject(), "json", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(coverageEClass, Coverage.class, "Coverage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoverage_Invocations(), ecorePackage.getEInt(), "invocations", null, 0, 1, Coverage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorResultEClass, ActorResult.class, "ActorResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActorResult_Results(), this.getActorMethodResult(), this.getActorMethodResult_ActorResult(), "results", null, 0, -1, ActorResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActorResult_Coverage(), this.getCoverage(), null, "coverage", null, 0, -1, ActorResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActorResult_Proxy(), ecorePackage.getEBoolean(), "proxy", null, 0, 1, ActorResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageResultEClass, PageResult.class, "PageResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPageResult_Results(), this.getPageMethodResult(), this.getPageMethodResult_PageResult(), "results", null, 0, -1, PageResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPageResult_Coverage(), this.getCoverage(), null, "coverage", null, 0, -1, PageResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPageResult_WebElements(), this.getWebElement(), null, "webElements", null, 0, -1, PageResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPageResult_Proxy(), ecorePackage.getEBoolean(), "proxy", null, 0, 1, PageResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(webElementEClass, WebElement.class, "WebElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWebElement_Locators(), this.getLocator(), null, "locators", null, 0, -1, WebElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locatorEClass, Locator.class, "Locator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocator_How(), ecorePackage.getEString(), "how", null, 0, 1, Locator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocator_Using(), ecorePackage.getEString(), "using", null, 0, 1, Locator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsonLoaderEClass, JSONLoader.class, "JSONLoader", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(breadcrumbsProviderEClass, BreadcrumbsProvider.class, "BreadcrumbsProvider", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(deletableEClass, Deletable.class, "Deletable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(applicationRendererEClass, ApplicationRenderer.class, "ApplicationRenderer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getApplicationRenderer__RenderApplication__HttpServletRequestContext_Command(), ecorePackage.getEJavaObject(), "renderApplication", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getHttpServletRequestContext(), "context", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getCommand());
		g2 = createEGenericType(this.getHttpServletRequestContext());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getApplicationPanel());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getVoid());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "configurator", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, thePerformancePackage.getException());

		// Initialize enums and add enum literals
		initEEnum(authenticationModeEEnum, AuthenticationMode.class, "AuthenticationMode");
		addEEnumLiteral(authenticationModeEEnum, AuthenticationMode.PASSWORD);
		addEEnumLiteral(authenticationModeEEnum, AuthenticationMode.NTLM);

		initEEnum(operationStatusEEnum, OperationStatus.class, "OperationStatus");
		addEEnumLiteral(operationStatusEEnum, OperationStatus.PASS);
		addEEnumLiteral(operationStatusEEnum, OperationStatus.FAIL);
		addEEnumLiteral(operationStatusEEnum, OperationStatus.ERROR);
		addEEnumLiteral(operationStatusEEnum, OperationStatus.PENDING);

		// Initialize data types
		initEDataType(httpServletResponseEDataType, HttpServletResponse.class, "HttpServletResponse", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(cdoViewContextEDataType, CDOViewContext.class, "CDOViewContext", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(httpServletRequestContextEDataType, HttpServletRequestContext.class, "HttpServletRequestContext", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(cdoTransactionHttpServletRequestContextEDataType, CDOTransactionHttpServletRequestContext.class, "CDOTransactionHttpServletRequestContext", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(webSocketContextEDataType, WebSocketContext.class, "WebSocketContext", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(voidEDataType, Void.class, "Void", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(commandEDataType, Command.class, "Command", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(applicationPanelEDataType, ApplicationPanel.class, "ApplicationPanel", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// org.nasdanika.cdo.security:permissions
		createOrgAnnotations();
		// org.nasdanika.cdo:context-parameter
		createOrg_1Annotations();
		// org.nasdanika.cdo.web:getter
		createOrg_2Annotations();
		// org.nasdanika.cdo.web.html.form-control
		createOrg_3Annotations();
		// org.nasdanika.cdo.validator
		createOrg_4Annotations();
		// org.nasdanika.cdo.web:home-route
		createOrg_5Annotations();
		// org.nasdanika.cdo.web:eager-obj
		createOrg_6Annotations();
		// org.nasdanika.cdo.web:lenient
		createOrg_7Annotations();
		// org.nasdanika.cdo.web:route
		createOrg_8Annotations();
		// org.nasdanika.cdo.web.html.form
		createOrg_9Annotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "documentation", "Nasdanika WebTest Hub is a web application for hosting [Nasdanika WebTest](https://github.com/Nasdanika/server/wiki/webtest) reports.\r\n\r\n"
		   });	
		addAnnotation
		  (httpServletResponseEDataType, 
		   source, 
		   new String[] {
			 "documentation", "some doc"
		   });	
		addAnnotation
		  (hubEClass, 
		   source, 
		   new String[] {
			 "documentation", "Hub is the root of the object model.\r\n\r\nImage wiki link for testing [[image:https://github.com/Nasdanika/server/wiki/webtest-hub-update-user-dialog.png|User dialog.]]. Some content.\r\n"
		   });	
		addAnnotation
		  (getHub__ExecuteScript__WebSocketContext_String(), 
		   source, 
		   new String[] {
			 "documentation", "Operation documentation"
		   });	
		addAnnotation
		  ((getHub__ExecuteScript__WebSocketContext_String()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "documentation", ""
		   });	
		addAnnotation
		  ((getHub__ExecuteScript__WebSocketContext_String()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "documentation", "Parameter documentation"
		   });	
		addAnnotation
		  (getHub_Name(), 
		   source, 
		   new String[] {
			 "documentation", "Attribute doc"
		   });	
		addAnnotation
		  ((getGuest__Register__WebSocketContext_String_String_String_String_String()).getEParameters().get(3), 
		   source, 
		   new String[] {
			 "documentation", "email"
		   });
	}

	/**
	 * Initializes the annotations for <b>org.nasdanika.cdo.security:permissions</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrgAnnotations() {
		String source = "org.nasdanika.cdo.security:permissions";	
		addAnnotation
		  (hubEClass, 
		   source, 
		   new String[] {
			 "story/landing", "extension/js\r\nread/home\r\nread/summary\r\nread/applications\r\nread/applications/getSummaryRow\r\nextension/applications/js"
		   });	
		addAnnotation
		  (guestEClass, 
		   source, 
		   new String[] {
			 "story/registration", "GET/registrationForm\r\ninvoke/register\r\nextension/js"
		   });
	}

	/**
	 * Initializes the annotations for <b>org.nasdanika.cdo:context-parameter</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrg_1Annotations() {
		String source = "org.nasdanika.cdo:context-parameter";	
		addAnnotation
		  ((getHub__ExecuteScript__WebSocketContext_String()).getEParameters().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  ((getHub__Home__CDOViewContext_HttpServletRequestContext()).getEParameters().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  ((getHub__Home__CDOViewContext_HttpServletRequestContext()).getEParameters().get(1), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  ((getGuest__RegistrationForm__CDOTransactionHttpServletRequestContext()).getEParameters().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  ((getGuest__Home__HttpServletRequestContext()).getEParameters().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  ((getGuest__Register__WebSocketContext_String_String_String_String_String()).getEParameters().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  ((getApplication__GetSummaryRow__WebSocketContext()).getEParameters().get(0), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  ((getTestSession__GetSummaryRow__WebSocketContext()).getEParameters().get(0), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>org.nasdanika.cdo.web:getter</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrg_2Annotations() {
		String source = "org.nasdanika.cdo.web:getter";	
		addAnnotation
		  (getHub__UserList(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getApplication__GetSummaryRow__WebSocketContext(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTestSession__GetSummaryRow__WebSocketContext(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>org.nasdanika.cdo.web.html.form-control</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrg_3Annotations() {
		String source = "org.nasdanika.cdo.web.html.form-control";	
		addAnnotation
		  ((getHub__CreateOrUpdateUser__String_String_String_boolean_boolean_AuthenticationMode_String_String()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "private", "true"
		   });	
		addAnnotation
		  ((getHub__CreateOrUpdateUser__String_String_String_boolean_boolean_AuthenticationMode_String_String()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "required", "true",
			 "attribute:ng-disabled", "userModel.data.userID",
			 "validator", "if (!this.data.userID) {\r\n\tfor (k in $scope.userList) {\r\n\t\tif (value===$scope.userList[k].login) {\r\n\t\t\treturn \"Duplicate login\";\r\n\t\t}\r\n\t}\r\n}"
		   });	
		addAnnotation
		  ((getHub__CreateOrUpdateUser__String_String_String_boolean_boolean_AuthenticationMode_String_String()).getEParameters().get(3), 
		   source, 
		   new String[] {
			 "inline", "true"
		   });	
		addAnnotation
		  ((getHub__CreateOrUpdateUser__String_String_String_boolean_boolean_AuthenticationMode_String_String()).getEParameters().get(4), 
		   source, 
		   new String[] {
			 "inline", "true"
		   });	
		addAnnotation
		  ((getHub__CreateOrUpdateUser__String_String_String_boolean_boolean_AuthenticationMode_String_String()).getEParameters().get(5), 
		   source, 
		   new String[] {
			 "default", "PASSWORD"
		   });	
		addAnnotation
		  ((getHub__CreateOrUpdateUser__String_String_String_boolean_boolean_AuthenticationMode_String_String()).getEParameters().get(6), 
		   source, 
		   new String[] {
			 "input-type", "password",
			 "group-attribute:ng-hide", "userModel.data.authentication === \'NTLM\'",
			 "attribute:ng-required", "userModel.data.authentication === \'PASSWORD\' && !userModel.data.userID"
		   });	
		addAnnotation
		  ((getHub__CreateOrUpdateUser__String_String_String_boolean_boolean_AuthenticationMode_String_String()).getEParameters().get(7), 
		   source, 
		   new String[] {
			 "input-type", "password",
			 "group-attribute:ng-hide", "userModel.data.authentication === \'NTLM\'",
			 "attribute:ng-required", "userModel.data.authentication === \'PASSWORD\' && !userModel.data.userID",
			 "validator", "if (this.data.authentication === \'PASSWORD\' && value!==this.data.password) { return \'Passwords do not match\'; }"
		   });	
		addAnnotation
		  ((getGuest__Register__WebSocketContext_String_String_String_String_String()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "required", "true"
		   });	
		addAnnotation
		  ((getGuest__Register__WebSocketContext_String_String_String_String_String()).getEParameters().get(2), 
		   source, 
		   new String[] {
			 "label", "Real name"
		   });	
		addAnnotation
		  ((getGuest__Register__WebSocketContext_String_String_String_String_String()).getEParameters().get(3), 
		   source, 
		   new String[] {
			 "input-type", "email",
			 "label", "E-Mail"
		   });	
		addAnnotation
		  ((getGuest__Register__WebSocketContext_String_String_String_String_String()).getEParameters().get(4), 
		   source, 
		   new String[] {
			 "input-type", "password",
			 "required", "true"
		   });	
		addAnnotation
		  ((getGuest__Register__WebSocketContext_String_String_String_String_String()).getEParameters().get(5), 
		   source, 
		   new String[] {
			 "input-type", "password",
			 "validator", "if (value!==this.data.password) { return \'Passwords do not match\'; }",
			 "required", "true"
		   });	
		addAnnotation
		  (getDescriptor_Title(), 
		   source, 
		   new String[] {
			 "input-type", "f",
			 "label", "lbl"
		   });	
		addAnnotation
		  (getScreenshot_Timestamp(), 
		   source, 
		   new String[] {
			 "input-type", "",
			 "label", "ts",
			 "required", "rq",
			 "private", "prvt",
			 "default", "dflt",
			 "placeholder", "plhldr",
			 "help-text", "hlptxt",
			 "inline", "inl",
			 "control-id", "ctrlid",
			 "validator", "if (x) { something }"
		   });
	}

	/**
	 * Initializes the annotations for <b>org.nasdanika.cdo.validator</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrg_4Annotations() {
		String source = "org.nasdanika.cdo.validator";	
		addAnnotation
		  ((getHub__CreateOrUpdateUser__String_String_String_boolean_boolean_AuthenticationMode_String_String()).getEParameters().get(7), 
		   source, 
		   new String[] {
			 "server", "if (data.authentication.name() === \'PASSWORD\' && data.password!=value) {\r\n\treturn \"Passwords do not match\";\r\n}"
		   });	
		addAnnotation
		  ((getGuest__Register__WebSocketContext_String_String_String_String_String()).getEParameters().get(5), 
		   source, 
		   new String[] {
			 "server", "if (data.password!=value) {\r\n\treturn \"Passwords do not match\";\r\n}"
		   });
	}

	/**
	 * Initializes the annotations for <b>org.nasdanika.cdo.web:home-route</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrg_5Annotations() {
		String source = "org.nasdanika.cdo.web:home-route";	
		addAnnotation
		  (getHub__Home__CDOViewContext_HttpServletRequestContext(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getGuest__Home__HttpServletRequestContext(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>org.nasdanika.cdo.web:eager-obj</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrg_6Annotations() {
		String source = "org.nasdanika.cdo.web:eager-obj";	
		addAnnotation
		  (getApplicationOwner_Applications(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>org.nasdanika.cdo.web:lenient</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrg_7Annotations() {
		String source = "org.nasdanika.cdo.web:lenient";	
		addAnnotation
		  (getApplicationOwner_Applications(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getApplication_TestSessions(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>org.nasdanika.cdo.web:route</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrg_8Annotations() {
		String source = "org.nasdanika.cdo.web:route";	
		addAnnotation
		  (getGuest__RegistrationForm__CDOTransactionHttpServletRequestContext(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>org.nasdanika.cdo.web.html.form</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrg_9Annotations() {
		String source = "org.nasdanika.cdo.web.html.form";	
		addAnnotation
		  (getGuest__Register__WebSocketContext_String_String_String_String_String(), 
		   source, 
		   new String[] {
		   });
	}

} //HubPackageImpl
