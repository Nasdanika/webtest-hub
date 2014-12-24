/**
 */
package org.nasdanika.webtest.hub.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.json.JSONObject;
import org.nasdanika.cdo.security.SecurityPackage;
import org.nasdanika.core.JSONLoader;
import org.nasdanika.webtest.hub.ActorMethodResult;
import org.nasdanika.webtest.hub.ActorResult;
import org.nasdanika.webtest.hub.Application;
import org.nasdanika.webtest.hub.ApplicationOwner;
import org.nasdanika.webtest.hub.BreadcrumbsProvider;
import org.nasdanika.webtest.hub.Description;
import org.nasdanika.webtest.hub.Guest;
import org.nasdanika.webtest.hub.Hub;
import org.nasdanika.webtest.hub.HubFactory;
import org.nasdanika.webtest.hub.HubPackage;
import org.nasdanika.webtest.hub.InitializationResult;
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
	private EClass coverageEntryEClass = null;

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
	private EEnum operationStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jsonObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType exceptionEDataType = null;

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
	public EClass getUser() {
		return userEClass;
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
	public EReference getTestSession_Results() {
		return (EReference)testSessionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestSession_Published() {
		return (EAttribute)testSessionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestSession_Size() {
		return (EAttribute)testSessionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestSession_Progress() {
		return (EAttribute)testSessionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestSession_Timestamp() {
		return (EAttribute)testSessionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestSession_Node() {
		return (EAttribute)testSessionEClass.getEStructuralFeatures().get(5);
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
	public EClass getCoverageEntry() {
		return coverageEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoverageEntry_Key() {
		return (EAttribute)coverageEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoverageEntry_Value() {
		return (EAttribute)coverageEntryEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getPageResult_Size() {
		return (EAttribute)pageResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageResult_Coverage() {
		return (EReference)pageResultEClass.getEStructuralFeatures().get(2);
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
	public EEnum getOperationStatus() {
		return operationStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJSONObject() {
		return jsonObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getException() {
		return exceptionEDataType;
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

		applicationOwnerEClass = createEClass(APPLICATION_OWNER);
		createEReference(applicationOwnerEClass, APPLICATION_OWNER__APPLICATIONS);

		guestEClass = createEClass(GUEST);

		userEClass = createEClass(USER);

		applicationEClass = createEClass(APPLICATION);
		createEReference(applicationEClass, APPLICATION__TEST_SESSIONS);
		createEAttribute(applicationEClass, APPLICATION__SECURITY_TOKEN);
		createEReference(applicationEClass, APPLICATION__SCREENSHOTS);
		createEAttribute(applicationEClass, APPLICATION__NAME);
		createEAttribute(applicationEClass, APPLICATION__DESCRIPTION);

		descriptorEClass = createEClass(DESCRIPTOR);
		createEAttribute(descriptorEClass, DESCRIPTOR__QUALIFIED_NAME);
		createEAttribute(descriptorEClass, DESCRIPTOR__TITLE);
		createEReference(descriptorEClass, DESCRIPTOR__DESCRIPTION);

		descriptionEClass = createEClass(DESCRIPTION);
		createEAttribute(descriptionEClass, DESCRIPTION__URL);
		createEAttribute(descriptionEClass, DESCRIPTION__VALUE);
		createEAttribute(descriptionEClass, DESCRIPTION__HTML);

		testSessionEClass = createEClass(TEST_SESSION);
		createEReference(testSessionEClass, TEST_SESSION__RESULTS);
		createEAttribute(testSessionEClass, TEST_SESSION__PUBLISHED);
		createEAttribute(testSessionEClass, TEST_SESSION__SIZE);
		createEAttribute(testSessionEClass, TEST_SESSION__PROGRESS);
		createEAttribute(testSessionEClass, TEST_SESSION__TIMESTAMP);
		createEAttribute(testSessionEClass, TEST_SESSION__NODE);

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

		coverageEntryEClass = createEClass(COVERAGE_ENTRY);
		createEAttribute(coverageEntryEClass, COVERAGE_ENTRY__KEY);
		createEAttribute(coverageEntryEClass, COVERAGE_ENTRY__VALUE);

		actorResultEClass = createEClass(ACTOR_RESULT);
		createEReference(actorResultEClass, ACTOR_RESULT__RESULTS);
		createEReference(actorResultEClass, ACTOR_RESULT__COVERAGE);

		pageResultEClass = createEClass(PAGE_RESULT);
		createEReference(pageResultEClass, PAGE_RESULT__RESULTS);
		createEAttribute(pageResultEClass, PAGE_RESULT__SIZE);
		createEReference(pageResultEClass, PAGE_RESULT__COVERAGE);

		jsonLoaderEClass = createEClass(JSON_LOADER);

		breadcrumbsProviderEClass = createEClass(BREADCRUMBS_PROVIDER);

		// Create enums
		operationStatusEEnum = createEEnum(OPERATION_STATUS);

		// Create data types
		jsonObjectEDataType = createEDataType(JSON_OBJECT);
		exceptionEDataType = createEDataType(EXCEPTION);
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

		// Set bounds for type parameters

		// Add supertypes to classes
		hubEClass.getESuperTypes().add(theSecurityPackage.getLoginPasswordProtectionDomain());
		hubEClass.getESuperTypes().add(this.getApplicationOwner());
		hubEClass.getESuperTypes().add(this.getBreadcrumbsProvider());
		guestEClass.getESuperTypes().add(theSecurityPackage.getUser());
		userEClass.getESuperTypes().add(this.getApplicationOwner());
		userEClass.getESuperTypes().add(theSecurityPackage.getLoginPasswordHashUser());
		applicationEClass.getESuperTypes().add(this.getBreadcrumbsProvider());
		descriptorEClass.getESuperTypes().add(this.getJSONLoader());
		descriptionEClass.getESuperTypes().add(this.getJSONLoader());
		testSessionEClass.getESuperTypes().add(this.getDescriptor());
		testSessionEClass.getESuperTypes().add(this.getBreadcrumbsProvider());
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
		actorResultEClass.getESuperTypes().add(this.getDescriptor());
		actorResultEClass.getESuperTypes().add(this.getBreadcrumbsProvider());
		pageResultEClass.getESuperTypes().add(this.getDescriptor());
		pageResultEClass.getESuperTypes().add(this.getBreadcrumbsProvider());

		// Initialize classes, features, and operations; add parameters
		initEClass(hubEClass, Hub.class, "Hub", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHub_Name(), ecorePackage.getEString(), "name", null, 0, 1, Hub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHub_Guest(), this.getGuest(), null, "guest", null, 0, 1, Hub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHub_Users(), this.getUser(), null, "users", null, 0, -1, Hub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHub_Administrators(), theSecurityPackage.getGroup(), null, "administrators", null, 0, 1, Hub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHub_SlideWidth(), ecorePackage.getEInt(), "slideWidth", null, 0, 1, Hub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationOwnerEClass, ApplicationOwner.class, "ApplicationOwner", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplicationOwner_Applications(), this.getApplication(), null, "applications", null, 0, -1, ApplicationOwner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guestEClass, Guest.class, "Guest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplication_TestSessions(), this.getTestSession(), null, "testSessions", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_SecurityToken(), ecorePackage.getEString(), "securityToken", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplication_Screenshots(), this.getScreenshot(), null, "screenshots", null, 0, -1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_Name(), ecorePackage.getEString(), "name", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApplication_Description(), ecorePackage.getEString(), "description", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptorEClass, org.nasdanika.webtest.hub.Descriptor.class, "Descriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescriptor_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 0, 1, org.nasdanika.webtest.hub.Descriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptor_Title(), ecorePackage.getEString(), "title", null, 0, 1, org.nasdanika.webtest.hub.Descriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDescriptor_Description(), this.getDescription(), null, "description", null, 0, 1, org.nasdanika.webtest.hub.Descriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptionEClass, Description.class, "Description", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescription_Url(), ecorePackage.getEString(), "url", null, 0, 1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescription_Value(), ecorePackage.getEString(), "value", null, 0, -1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescription_Html(), ecorePackage.getEBoolean(), "html", null, 0, 1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testSessionEClass, TestSession.class, "TestSession", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestSession_Results(), this.getTestResult(), null, "results", null, 0, -1, TestSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestSession_Published(), ecorePackage.getEBoolean(), "published", null, 0, 1, TestSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestSession_Size(), ecorePackage.getEInt(), "size", null, 0, 1, TestSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestSession_Progress(), ecorePackage.getEInt(), "progress", null, 0, 1, TestSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestSession_Timestamp(), ecorePackage.getELong(), "timestamp", null, 0, 1, TestSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestSession_Node(), ecorePackage.getEString(), "node", null, 0, 1, TestSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		EOperation op = initEOperation(getTestMethodResult__LoadTiming__JSONObject(), thePerformancePackage.getTimingBase(), "loadTiming", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJSONObject(), "json", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		initEClass(coverageEntryEClass, Map.Entry.class, "CoverageEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoverageEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoverageEntry_Value(), ecorePackage.getEIntegerObject(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorResultEClass, ActorResult.class, "ActorResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActorResult_Results(), this.getActorMethodResult(), this.getActorMethodResult_ActorResult(), "results", null, 0, -1, ActorResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActorResult_Coverage(), this.getCoverageEntry(), null, "coverage", null, 0, -1, ActorResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageResultEClass, PageResult.class, "PageResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPageResult_Results(), this.getPageMethodResult(), this.getPageMethodResult_PageResult(), "results", null, 0, -1, PageResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPageResult_Size(), ecorePackage.getEInt(), "size", null, 0, 1, PageResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPageResult_Coverage(), this.getCoverageEntry(), null, "coverage", null, 0, -1, PageResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsonLoaderEClass, JSONLoader.class, "JSONLoader", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(breadcrumbsProviderEClass, BreadcrumbsProvider.class, "BreadcrumbsProvider", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(operationStatusEEnum, OperationStatus.class, "OperationStatus");
		addEEnumLiteral(operationStatusEEnum, OperationStatus.PASS);
		addEEnumLiteral(operationStatusEEnum, OperationStatus.FAIL);
		addEEnumLiteral(operationStatusEEnum, OperationStatus.ERROR);
		addEEnumLiteral(operationStatusEEnum, OperationStatus.PENDING);

		// Initialize data types
		initEDataType(jsonObjectEDataType, JSONObject.class, "JSONObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(exceptionEDataType, Exception.class, "Exception", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //HubPackageImpl
