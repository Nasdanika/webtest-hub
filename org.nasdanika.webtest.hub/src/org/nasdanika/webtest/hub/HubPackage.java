/**
 */
package org.nasdanika.webtest.hub;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.nasdanika.cdo.security.SecurityPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.webtest.hub.HubFactory
 * @model kind="package"
 * @generated
 */
public interface HubPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hub";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:org.nasdanika.webtest.hub";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.webtest.hub";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HubPackage eINSTANCE = org.nasdanika.webtest.hub.impl.HubPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.webtest.hub.impl.HubImpl <em>Hub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.webtest.hub.impl.HubImpl
	 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getHub()
	 * @generated
	 */
	int HUB = 0;

	/**
	 * The feature id for the '<em><b>Super Users Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB__SUPER_USERS_GROUP = SecurityPackage.LOGIN_PASSWORD_PROTECTION_DOMAIN__SUPER_USERS_GROUP;

	/**
	 * The feature id for the '<em><b>Unauthenticated Principal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB__UNAUTHENTICATED_PRINCIPAL = SecurityPackage.LOGIN_PASSWORD_PROTECTION_DOMAIN__UNAUTHENTICATED_PRINCIPAL;

	/**
	 * The feature id for the '<em><b>Everyone Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB__EVERYONE_GROUP = SecurityPackage.LOGIN_PASSWORD_PROTECTION_DOMAIN__EVERYONE_GROUP;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB__APPLICATIONS = SecurityPackage.LOGIN_PASSWORD_PROTECTION_DOMAIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB__NAME = SecurityPackage.LOGIN_PASSWORD_PROTECTION_DOMAIN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Guest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB__GUEST = SecurityPackage.LOGIN_PASSWORD_PROTECTION_DOMAIN_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB__USERS = SecurityPackage.LOGIN_PASSWORD_PROTECTION_DOMAIN_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Administrators</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB__ADMINISTRATORS = SecurityPackage.LOGIN_PASSWORD_PROTECTION_DOMAIN_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Slide Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB__SLIDE_WIDTH = SecurityPackage.LOGIN_PASSWORD_PROTECTION_DOMAIN_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Hub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB_FEATURE_COUNT = SecurityPackage.LOGIN_PASSWORD_PROTECTION_DOMAIN_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Authenticate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB___AUTHENTICATE__OBJECT = SecurityPackage.LOGIN_PASSWORD_PROTECTION_DOMAIN___AUTHENTICATE__OBJECT;

	/**
	 * The operation id for the '<em>Clear Permissions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB___CLEAR_PERMISSIONS__EOBJECT = SecurityPackage.LOGIN_PASSWORD_PROTECTION_DOMAIN___CLEAR_PERMISSIONS__EOBJECT;

	/**
	 * The operation id for the '<em>Get All Users</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB___GET_ALL_USERS = SecurityPackage.LOGIN_PASSWORD_PROTECTION_DOMAIN___GET_ALL_USERS;

	/**
	 * The operation id for the '<em>Set Password Hash</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB___SET_PASSWORD_HASH__LOGINPASSWORDHASHUSER_STRING = SecurityPackage.LOGIN_PASSWORD_PROTECTION_DOMAIN___SET_PASSWORD_HASH__LOGINPASSWORDHASHUSER_STRING;

	/**
	 * The operation id for the '<em>Get User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB___GET_USER__STRING = SecurityPackage.LOGIN_PASSWORD_PROTECTION_DOMAIN___GET_USER__STRING;

	/**
	 * The operation id for the '<em>Test Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB___TEST_OPERATION__INT = SecurityPackage.LOGIN_PASSWORD_PROTECTION_DOMAIN_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB_OPERATION_COUNT = SecurityPackage.LOGIN_PASSWORD_PROTECTION_DOMAIN_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.webtest.hub.ApplicationOwner <em>Application Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.webtest.hub.ApplicationOwner
	 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getApplicationOwner()
	 * @generated
	 */
	int APPLICATION_OWNER = 1;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OWNER__APPLICATIONS = 0;

	/**
	 * The number of structural features of the '<em>Application Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OWNER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Application Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OWNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.webtest.hub.impl.GuestImpl <em>Guest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.webtest.hub.impl.GuestImpl
	 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getGuest()
	 * @generated
	 */
	int GUEST = 2;

	/**
	 * The feature id for the '<em><b>Member Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__MEMBER_OF = SecurityPackage.USER__MEMBER_OF;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__PERMISSIONS = SecurityPackage.USER__PERMISSIONS;

	/**
	 * The feature id for the '<em><b>Protection Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__PROTECTION_DOMAIN = SecurityPackage.USER__PROTECTION_DOMAIN;

	/**
	 * The number of structural features of the '<em>Guest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_FEATURE_COUNT = SecurityPackage.USER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Authorize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST___AUTHORIZE__SECURITYPOLICY_CONTEXT_OBJECT_STRING_STRING_MAP = SecurityPackage.USER___AUTHORIZE__SECURITYPOLICY_CONTEXT_OBJECT_STRING_STRING_MAP;

	/**
	 * The operation id for the '<em>Send Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST___SEND_MESSAGE__PRINCIPAL_STRING_STRING_OBJECT = SecurityPackage.USER___SEND_MESSAGE__PRINCIPAL_STRING_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Send Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST___SEND_MESSAGE__PRINCIPAL_STRING_MAP = SecurityPackage.USER___SEND_MESSAGE__PRINCIPAL_STRING_MAP;

	/**
	 * The operation id for the '<em>Send Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST___SEND_MESSAGE__PRINCIPAL_STRING_STRING = SecurityPackage.USER___SEND_MESSAGE__PRINCIPAL_STRING_STRING;

	/**
	 * The number of operations of the '<em>Guest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_OPERATION_COUNT = SecurityPackage.USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.webtest.hub.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.webtest.hub.impl.UserImpl
	 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getUser()
	 * @generated
	 */
	int USER = 3;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__APPLICATIONS = APPLICATION_OWNER__APPLICATIONS;

	/**
	 * The feature id for the '<em><b>Member Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__MEMBER_OF = APPLICATION_OWNER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PERMISSIONS = APPLICATION_OWNER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Protection Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PROTECTION_DOMAIN = APPLICATION_OWNER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LOGIN = APPLICATION_OWNER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Password Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PASSWORD_HASH = APPLICATION_OWNER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__DISABLED = APPLICATION_OWNER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = APPLICATION_OWNER_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Authorize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___AUTHORIZE__SECURITYPOLICY_CONTEXT_OBJECT_STRING_STRING_MAP = APPLICATION_OWNER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Send Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___SEND_MESSAGE__PRINCIPAL_STRING_STRING_OBJECT = APPLICATION_OWNER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Send Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___SEND_MESSAGE__PRINCIPAL_STRING_MAP = APPLICATION_OWNER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Send Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___SEND_MESSAGE__PRINCIPAL_STRING_STRING = APPLICATION_OWNER_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = APPLICATION_OWNER_OPERATION_COUNT + 4;


	/**
	 * The meta object id for the '{@link org.nasdanika.webtest.hub.BreadcrumbsProvider <em>Breadcrumbs Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.webtest.hub.BreadcrumbsProvider
	 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getBreadcrumbsProvider()
	 * @generated
	 */
	int BREADCRUMBS_PROVIDER = 28;

	/**
	 * The number of structural features of the '<em>Breadcrumbs Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMBS_PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Breadcrumbs Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREADCRUMBS_PROVIDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.webtest.hub.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.webtest.hub.impl.ApplicationImpl
	 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 4;

	/**
	 * The feature id for the '<em><b>Test Sessions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__TEST_SESSIONS = BREADCRUMBS_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Security Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__SECURITY_TOKEN = BREADCRUMBS_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Screenshots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__SCREENSHOTS = BREADCRUMBS_PROVIDER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = BREADCRUMBS_PROVIDER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__DESCRIPTION = BREADCRUMBS_PROVIDER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = BREADCRUMBS_PROVIDER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = BREADCRUMBS_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.core.JSONLoader <em>JSON Loader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.core.JSONLoader
	 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getJSONLoader()
	 * @generated
	 */
	int JSON_LOADER = 27;

	/**
	 * The number of structural features of the '<em>JSON Loader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_LOADER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>JSON Loader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_LOADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.webtest.hub.impl.DescriptorImpl <em>Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.webtest.hub.impl.DescriptorImpl
	 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getDescriptor()
	 * @generated
	 */
	int DESCRIPTOR = 5;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR__QUALIFIED_NAME = JSON_LOADER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR__TITLE = JSON_LOADER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR__DESCRIPTION = JSON_LOADER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_FEATURE_COUNT = JSON_LOADER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_OPERATION_COUNT = JSON_LOADER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.webtest.hub.impl.DescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.webtest.hub.impl.DescriptionImpl
	 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__URL = JSON_LOADER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__VALUE = JSON_LOADER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Html</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__HTML = JSON_LOADER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_FEATURE_COUNT = JSON_LOADER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_OPERATION_COUNT = JSON_LOADER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.webtest.hub.impl.TestSessionImpl <em>Test Session</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.webtest.hub.impl.TestSessionImpl
	 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getTestSession()
	 * @generated
	 */
	int TEST_SESSION = 7;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SESSION__QUALIFIED_NAME = DESCRIPTOR__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SESSION__TITLE = DESCRIPTOR__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SESSION__DESCRIPTION = DESCRIPTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Test Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SESSION__TEST_RESULTS = DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Page Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SESSION__PAGE_RESULTS = DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actor Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SESSION__ACTOR_RESULTS = DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SESSION__PUBLISHED = DESCRIPTOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SESSION__SIZE = DESCRIPTOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SESSION__PROGRESS = DESCRIPTOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SESSION__TIMESTAMP = DESCRIPTOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SESSION__NODE = DESCRIPTOR_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Test Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SESSION_FEATURE_COUNT = DESCRIPTOR_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Test Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SESSION_OPERATION_COUNT = DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.webtest.hub.impl.TestResultImpl <em>Test Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.webtest.hub.impl.TestResultImpl
	 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getTestResult()
	 * @generated
	 */
	int TEST_RESULT = 8;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RESULT__QUALIFIED_NAME = DESCRIPTOR__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RESULT__TITLE = DESCRIPTOR__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RESULT__DESCRIPTION = DESCRIPTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Page Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RESULT__PAGE_RESULTS = DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actor Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RESULT__ACTOR_RESULTS = DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Test Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RESULT_FEATURE_COUNT = DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Test Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RESULT_OPERATION_COUNT = DESCRIPTOR_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.webtest.hub.impl.TestClassResultImpl <em>Test Class Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.webtest.hub.impl.TestClassResultImpl
	 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getTestClassResult()
	 * @generated
	 */
	int TEST_CLASS_RESULT = 9;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS_RESULT__QUALIFIED_NAME = TEST_RESULT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS_RESULT__TITLE = TEST_RESULT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS_RESULT__DESCRIPTION = TEST_RESULT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Page Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS_RESULT__PAGE_RESULTS = TEST_RESULT__PAGE_RESULTS;

	/**
	 * The feature id for the '<em><b>Actor Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS_RESULT__ACTOR_RESULTS = TEST_RESULT__ACTOR_RESULTS;

	/**
	 * The feature id for the '<em><b>Method Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS_RESULT__METHOD_RESULTS = TEST_RESULT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stats</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS_RESULT__STATS = TEST_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Test Class Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS_RESULT_FEATURE_COUNT = TEST_RESULT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Test Class Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS_RESULT_OPERATION_COUNT = TEST_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.webtest.hub.impl.StatsEntryImpl <em>Stats Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.webtest.hub.impl.StatsEntryImpl
	 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getStatsEntry()
	 * @generated
	 */
	int STATS_ENTRY = 10;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Stats Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Stats Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATS_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.webtest.hub.impl.TestSuiteResultImpl <em>Test Suite Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.webtest.hub.impl.TestSuiteResultImpl
	 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getTestSuiteResult()
	 * @generated
	 */
	int TEST_SUITE_RESULT = 11;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE_RESULT__QUALIFIED_NAME = TEST_RESULT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE_RESULT__TITLE = TEST_RESULT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE_RESULT__DESCRIPTION = TEST_RESULT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Page Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE_RESULT__PAGE_RESULTS = TEST_RESULT__PAGE_RESULTS;

	/**
	 * The feature id for the '<em><b>Actor Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE_RESULT__ACTOR_RESULTS = TEST_RESULT__ACTOR_RESULTS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE_RESULT__CHILDREN = TEST_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Test Suite Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE_RESULT_FEATURE_COUNT = TEST_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Test Suite Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE_RESULT_OPERATION_COUNT = TEST_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.webtest.hub.impl.ParameterizedTestResultImpl <em>Parameterized Test Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.webtest.hub.impl.ParameterizedTestResultImpl
	 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getParameterizedTestResult()
	 * @generated
	 */
	int PARAMETERIZED_TEST_RESULT = 12;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TEST_RESULT__QUALIFIED_NAME = TEST_SUITE_RESULT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TEST_RESULT__TITLE = TEST_SUITE_RESULT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TEST_RESULT__DESCRIPTION = TEST_SUITE_RESULT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Page Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TEST_RESULT__PAGE_RESULTS = TEST_SUITE_RESULT__PAGE_RESULTS;

	/**
	 * The feature id for the '<em><b>Actor Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TEST_RESULT__ACTOR_RESULTS = TEST_SUITE_RESULT__ACTOR_RESULTS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TEST_RESULT__CHILDREN = TEST_SUITE_RESULT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parameter Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TEST_RESULT__PARAMETER_DESCRIPTORS = TEST_SUITE_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameterized Test Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TEST_RESULT_FEATURE_COUNT = TEST_SUITE_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameterized Test Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TEST_RESULT_OPERATION_COUNT = TEST_SUITE_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.webtest.hub.impl.ScreenshotImpl <em>Screenshot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.webtest.hub.impl.ScreenshotImpl
	 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getScreenshot()
	 * @generated
	 */
	int SCREENSHOT = 13;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREENSHOT__CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREENSHOT__TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREENSHOT__HEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREENSHOT__WIDTH = 3;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREENSHOT__CONTENT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREENSHOT__LENGTH = 5;

	/**
	 * The feature id for the '<em><b>Digest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREENSHOT__DIGEST = 6;

	/**
	 * The feature id for the '<em><b>Before Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREENSHOT__BEFORE_OPERATIONS = 7;

	/**
	 * The feature id for the '<em><b>After Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREENSHOT__AFTER_OPERATIONS = 8;

	/**
	 * The number of structural features of the '<em>Screenshot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREENSHOT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Screenshot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREENSHOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.webtest.hub.impl.OperationResultImpl <em>Operation Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.webtest.hub.impl.OperationResultImpl
	 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getOperationResult()
	 * @generated
	 */
	int OPERATION_RESULT = 14;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RESULT__QUALIFIED_NAME = DESCRIPTOR__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RESULT__TITLE = DESCRIPTOR__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RESULT__DESCRIPTION = DESCRIPTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Screenshots</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RESULT__SCREENSHOTS = DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RESULT__CHILDREN = DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RESULT__OPERATION_NAME = DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RESULT__ARGUMENTS = DESCRIPTOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Before Timing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RESULT__BEFORE_TIMING = DESCRIPTOR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Before Screenshot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RESULT__BEFORE_SCREENSHOT = DESCRIPTOR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>After Timing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RESULT__AFTER_TIMING = DESCRIPTOR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>After Screenshot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RESULT__AFTER_SCREENSHOT = DESCRIPTOR_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RESULT__FAILURE = DESCRIPTOR_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RESULT__ERROR = DESCRIPTOR_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RESULT__START = DESCRIPTOR_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RESULT__FINISH = DESCRIPTOR_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RESULT__STATUS = DESCRIPTOR_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Operation Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RESULT_FEATURE_COUNT = DESCRIPTOR_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Operation Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RESULT_OPERATION_COUNT = DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.webtest.hub.impl.ThrowableImpl <em>Throwable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.webtest.hub.impl.ThrowableImpl
	 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getThrowable()
	 * @generated
	 */
	int THROWABLE = 15;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWABLE__TYPE = JSON_LOADER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWABLE__MESSAGE = JSON_LOADER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stack Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWABLE__STACK_TRACE = JSON_LOADER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Throwable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWABLE_FEATURE_COUNT = JSON_LOADER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Throwable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWABLE_OPERATION_COUNT = JSON_LOADER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.webtest.hub.impl.StackTraceEntryImpl <em>Stack Trace Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.webtest.hub.impl.StackTraceEntryImpl
	 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getStackTraceEntry()
	 * @generated
	 */
	int STACK_TRACE_ENTRY = 16;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_TRACE_ENTRY__CLASS_NAME = JSON_LOADER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_TRACE_ENTRY__FILE_NAME = JSON_LOADER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_TRACE_ENTRY__METHOD_NAME = JSON_LOADER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Line Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_TRACE_ENTRY__LINE_NUMBER = JSON_LOADER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Native</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_TRACE_ENTRY__NATIVE = JSON_LOADER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Stack Trace Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_TRACE_ENTRY_FEATURE_COUNT = JSON_LOADER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Stack Trace Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_TRACE_ENTRY_OPERATION_COUNT = JSON_LOADER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.webtest.hub.impl.InitializationResultImpl <em>Initialization Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.webtest.hub.impl.InitializationResultImpl
	 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getInitializationResult()
	 * @generated
	 */
	int INITIALIZATION_RESULT = 17;

	/**
	 * The meta object id for the '{@link org.nasdanika.webtest.hub.impl.MethodResultImpl <em>Method Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.webtest.hub.impl.MethodResultImpl
	 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getMethodResult()
	 * @generated
	 */
	int METHOD_RESULT = 18;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_RESULT__QUALIFIED_NAME = OPERATION_RESULT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_RESULT__TITLE = OPERATION_RESULT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_RESULT__DESCRIPTION = OPERATION_RESULT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Screenshots</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_RESULT__SCREENSHOTS = OPERATION_RESULT__SCREENSHOTS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_RESULT__CHILDREN = OPERATION_RESULT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_RESULT__OPERATION_NAME = OPERATION_RESULT__OPERATION_NAME;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_RESULT__ARGUMENTS = OPERATION_RESULT__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Before Timing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_RESULT__BEFORE_TIMING = OPERATION_RESULT__BEFORE_TIMING;

	/**
	 * The feature id for the '<em><b>Before Screenshot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_RESULT__BEFORE_SCREENSHOT = OPERATION_RESULT__BEFORE_SCREENSHOT;

	/**
	 * The feature id for the '<em><b>After Timing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_RESULT__AFTER_TIMING = OPERATION_RESULT__AFTER_TIMING;

	/**
	 * The feature id for the '<em><b>After Screenshot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_RESULT__AFTER_SCREENSHOT = OPERATION_RESULT__AFTER_SCREENSHOT;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_RESULT__FAILURE = OPERATION_RESULT__FAILURE;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_RESULT__ERROR = OPERATION_RESULT__ERROR;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_RESULT__START = OPERATION_RESULT__START;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_RESULT__FINISH = OPERATION_RESULT__FINISH;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_RESULT__STATUS = OPERATION_RESULT__STATUS;

	/**
	 * The number of structural features of the '<em>Method Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_RESULT_FEATURE_COUNT = OPERATION_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Method Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_RESULT_OPERATION_COUNT = OPERATION_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.webtest.hub.impl.ActorMethodResultImpl <em>Actor Method Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.webtest.hub.impl.ActorMethodResultImpl
	 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getActorMethodResult()
	 * @generated
	 */
	int ACTOR_METHOD_RESULT = 19;

	/**
	 * The meta object id for the '{@link org.nasdanika.webtest.hub.impl.PageMethodResultImpl <em>Page Method Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.webtest.hub.impl.PageMethodResultImpl
	 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getPageMethodResult()
	 * @generated
	 */
	int PAGE_METHOD_RESULT = 20;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_METHOD_RESULT__QUALIFIED_NAME = METHOD_RESULT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_METHOD_RESULT__TITLE = METHOD_RESULT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_METHOD_RESULT__DESCRIPTION = METHOD_RESULT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Screenshots</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_METHOD_RESULT__SCREENSHOTS = METHOD_RESULT__SCREENSHOTS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_METHOD_RESULT__CHILDREN = METHOD_RESULT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_METHOD_RESULT__OPERATION_NAME = METHOD_RESULT__OPERATION_NAME;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_METHOD_RESULT__ARGUMENTS = METHOD_RESULT__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Before Timing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_METHOD_RESULT__BEFORE_TIMING = METHOD_RESULT__BEFORE_TIMING;

	/**
	 * The feature id for the '<em><b>Before Screenshot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_METHOD_RESULT__BEFORE_SCREENSHOT = METHOD_RESULT__BEFORE_SCREENSHOT;

	/**
	 * The feature id for the '<em><b>After Timing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_METHOD_RESULT__AFTER_TIMING = METHOD_RESULT__AFTER_TIMING;

	/**
	 * The feature id for the '<em><b>After Screenshot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_METHOD_RESULT__AFTER_SCREENSHOT = METHOD_RESULT__AFTER_SCREENSHOT;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_METHOD_RESULT__FAILURE = METHOD_RESULT__FAILURE;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_METHOD_RESULT__ERROR = METHOD_RESULT__ERROR;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_METHOD_RESULT__START = METHOD_RESULT__START;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_METHOD_RESULT__FINISH = METHOD_RESULT__FINISH;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_METHOD_RESULT__STATUS = METHOD_RESULT__STATUS;

	/**
	 * The feature id for the '<em><b>Page Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_METHOD_RESULT__PAGE_RESULT = METHOD_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Page Method Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_METHOD_RESULT_FEATURE_COUNT = METHOD_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Page Method Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_METHOD_RESULT_OPERATION_COUNT = METHOD_RESULT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZATION_RESULT__QUALIFIED_NAME = PAGE_METHOD_RESULT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZATION_RESULT__TITLE = PAGE_METHOD_RESULT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZATION_RESULT__DESCRIPTION = PAGE_METHOD_RESULT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Screenshots</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZATION_RESULT__SCREENSHOTS = PAGE_METHOD_RESULT__SCREENSHOTS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZATION_RESULT__CHILDREN = PAGE_METHOD_RESULT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZATION_RESULT__OPERATION_NAME = PAGE_METHOD_RESULT__OPERATION_NAME;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZATION_RESULT__ARGUMENTS = PAGE_METHOD_RESULT__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Before Timing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZATION_RESULT__BEFORE_TIMING = PAGE_METHOD_RESULT__BEFORE_TIMING;

	/**
	 * The feature id for the '<em><b>Before Screenshot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZATION_RESULT__BEFORE_SCREENSHOT = PAGE_METHOD_RESULT__BEFORE_SCREENSHOT;

	/**
	 * The feature id for the '<em><b>After Timing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZATION_RESULT__AFTER_TIMING = PAGE_METHOD_RESULT__AFTER_TIMING;

	/**
	 * The feature id for the '<em><b>After Screenshot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZATION_RESULT__AFTER_SCREENSHOT = PAGE_METHOD_RESULT__AFTER_SCREENSHOT;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZATION_RESULT__FAILURE = PAGE_METHOD_RESULT__FAILURE;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZATION_RESULT__ERROR = PAGE_METHOD_RESULT__ERROR;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZATION_RESULT__START = PAGE_METHOD_RESULT__START;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZATION_RESULT__FINISH = PAGE_METHOD_RESULT__FINISH;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZATION_RESULT__STATUS = PAGE_METHOD_RESULT__STATUS;

	/**
	 * The feature id for the '<em><b>Page Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZATION_RESULT__PAGE_RESULT = PAGE_METHOD_RESULT__PAGE_RESULT;

	/**
	 * The number of structural features of the '<em>Initialization Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZATION_RESULT_FEATURE_COUNT = PAGE_METHOD_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Initialization Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZATION_RESULT_OPERATION_COUNT = PAGE_METHOD_RESULT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_METHOD_RESULT__QUALIFIED_NAME = METHOD_RESULT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_METHOD_RESULT__TITLE = METHOD_RESULT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_METHOD_RESULT__DESCRIPTION = METHOD_RESULT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Screenshots</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_METHOD_RESULT__SCREENSHOTS = METHOD_RESULT__SCREENSHOTS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_METHOD_RESULT__CHILDREN = METHOD_RESULT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_METHOD_RESULT__OPERATION_NAME = METHOD_RESULT__OPERATION_NAME;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_METHOD_RESULT__ARGUMENTS = METHOD_RESULT__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Before Timing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_METHOD_RESULT__BEFORE_TIMING = METHOD_RESULT__BEFORE_TIMING;

	/**
	 * The feature id for the '<em><b>Before Screenshot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_METHOD_RESULT__BEFORE_SCREENSHOT = METHOD_RESULT__BEFORE_SCREENSHOT;

	/**
	 * The feature id for the '<em><b>After Timing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_METHOD_RESULT__AFTER_TIMING = METHOD_RESULT__AFTER_TIMING;

	/**
	 * The feature id for the '<em><b>After Screenshot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_METHOD_RESULT__AFTER_SCREENSHOT = METHOD_RESULT__AFTER_SCREENSHOT;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_METHOD_RESULT__FAILURE = METHOD_RESULT__FAILURE;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_METHOD_RESULT__ERROR = METHOD_RESULT__ERROR;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_METHOD_RESULT__START = METHOD_RESULT__START;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_METHOD_RESULT__FINISH = METHOD_RESULT__FINISH;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_METHOD_RESULT__STATUS = METHOD_RESULT__STATUS;

	/**
	 * The feature id for the '<em><b>Actor Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_METHOD_RESULT__ACTOR_RESULT = METHOD_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actor Method Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_METHOD_RESULT_FEATURE_COUNT = METHOD_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Actor Method Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_METHOD_RESULT_OPERATION_COUNT = METHOD_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.webtest.hub.impl.TestMethodResultImpl <em>Test Method Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.webtest.hub.impl.TestMethodResultImpl
	 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getTestMethodResult()
	 * @generated
	 */
	int TEST_METHOD_RESULT = 21;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_METHOD_RESULT__QUALIFIED_NAME = OPERATION_RESULT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_METHOD_RESULT__TITLE = OPERATION_RESULT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_METHOD_RESULT__DESCRIPTION = OPERATION_RESULT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Screenshots</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_METHOD_RESULT__SCREENSHOTS = OPERATION_RESULT__SCREENSHOTS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_METHOD_RESULT__CHILDREN = OPERATION_RESULT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_METHOD_RESULT__OPERATION_NAME = OPERATION_RESULT__OPERATION_NAME;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_METHOD_RESULT__ARGUMENTS = OPERATION_RESULT__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Before Timing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_METHOD_RESULT__BEFORE_TIMING = OPERATION_RESULT__BEFORE_TIMING;

	/**
	 * The feature id for the '<em><b>Before Screenshot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_METHOD_RESULT__BEFORE_SCREENSHOT = OPERATION_RESULT__BEFORE_SCREENSHOT;

	/**
	 * The feature id for the '<em><b>After Timing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_METHOD_RESULT__AFTER_TIMING = OPERATION_RESULT__AFTER_TIMING;

	/**
	 * The feature id for the '<em><b>After Screenshot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_METHOD_RESULT__AFTER_SCREENSHOT = OPERATION_RESULT__AFTER_SCREENSHOT;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_METHOD_RESULT__FAILURE = OPERATION_RESULT__FAILURE;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_METHOD_RESULT__ERROR = OPERATION_RESULT__ERROR;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_METHOD_RESULT__START = OPERATION_RESULT__START;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_METHOD_RESULT__FINISH = OPERATION_RESULT__FINISH;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_METHOD_RESULT__STATUS = OPERATION_RESULT__STATUS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_METHOD_RESULT__PARAMETERS = OPERATION_RESULT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Navigation Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_METHOD_RESULT__NAVIGATION_TIMING = OPERATION_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Test Method Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_METHOD_RESULT_FEATURE_COUNT = OPERATION_RESULT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Load Timing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_METHOD_RESULT___LOAD_TIMING__JSONOBJECT = OPERATION_RESULT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Test Method Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_METHOD_RESULT_OPERATION_COUNT = OPERATION_RESULT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.webtest.hub.impl.CoverageImpl <em>Coverage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.webtest.hub.impl.CoverageImpl
	 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getCoverage()
	 * @generated
	 */
	int COVERAGE = 22;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE__QUALIFIED_NAME = DESCRIPTOR__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE__TITLE = DESCRIPTOR__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE__DESCRIPTION = DESCRIPTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Invocations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE__INVOCATIONS = DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Coverage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_FEATURE_COUNT = DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Coverage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_OPERATION_COUNT = DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.webtest.hub.impl.ActorResultImpl <em>Actor Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.webtest.hub.impl.ActorResultImpl
	 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getActorResult()
	 * @generated
	 */
	int ACTOR_RESULT = 23;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_RESULT__QUALIFIED_NAME = DESCRIPTOR__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_RESULT__TITLE = DESCRIPTOR__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_RESULT__DESCRIPTION = DESCRIPTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Results</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_RESULT__RESULTS = DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_RESULT__COVERAGE = DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_RESULT__PROXY = DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Actor Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_RESULT_FEATURE_COUNT = DESCRIPTOR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Actor Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_RESULT_OPERATION_COUNT = DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.webtest.hub.impl.PageResultImpl <em>Page Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.webtest.hub.impl.PageResultImpl
	 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getPageResult()
	 * @generated
	 */
	int PAGE_RESULT = 24;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_RESULT__QUALIFIED_NAME = DESCRIPTOR__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_RESULT__TITLE = DESCRIPTOR__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_RESULT__DESCRIPTION = DESCRIPTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Results</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_RESULT__RESULTS = DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_RESULT__COVERAGE = DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Web Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_RESULT__WEB_ELEMENTS = DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_RESULT__PROXY = DESCRIPTOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Page Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_RESULT_FEATURE_COUNT = DESCRIPTOR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Page Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_RESULT_OPERATION_COUNT = DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.webtest.hub.impl.WebElementImpl <em>Web Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.webtest.hub.impl.WebElementImpl
	 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getWebElement()
	 * @generated
	 */
	int WEB_ELEMENT = 25;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ELEMENT__QUALIFIED_NAME = DESCRIPTOR__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ELEMENT__TITLE = DESCRIPTOR__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ELEMENT__DESCRIPTION = DESCRIPTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Locators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ELEMENT__LOCATORS = DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Web Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ELEMENT_FEATURE_COUNT = DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Web Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEB_ELEMENT_OPERATION_COUNT = DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.webtest.hub.impl.LocatorImpl <em>Locator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.webtest.hub.impl.LocatorImpl
	 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getLocator()
	 * @generated
	 */
	int LOCATOR = 26;

	/**
	 * The feature id for the '<em><b>How</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATOR__HOW = 0;

	/**
	 * The feature id for the '<em><b>Using</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATOR__USING = 1;

	/**
	 * The number of structural features of the '<em>Locator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Locator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.webtest.hub.OperationStatus <em>Operation Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.webtest.hub.OperationStatus
	 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getOperationStatus()
	 * @generated
	 */
	int OPERATION_STATUS = 29;

	/**
	 * The meta object id for the '<em>JSON Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.json.JSONObject
	 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getJSONObject()
	 * @generated
	 */
	int JSON_OBJECT = 30;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 31;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.webtest.hub.Hub <em>Hub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hub</em>'.
	 * @see org.nasdanika.webtest.hub.Hub
	 * @generated
	 */
	EClass getHub();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.webtest.hub.Hub#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.webtest.hub.Hub#getName()
	 * @see #getHub()
	 * @generated
	 */
	EAttribute getHub_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.webtest.hub.Hub#getGuest <em>Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guest</em>'.
	 * @see org.nasdanika.webtest.hub.Hub#getGuest()
	 * @see #getHub()
	 * @generated
	 */
	EReference getHub_Guest();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.webtest.hub.Hub#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see org.nasdanika.webtest.hub.Hub#getUsers()
	 * @see #getHub()
	 * @generated
	 */
	EReference getHub_Users();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.webtest.hub.Hub#getAdministrators <em>Administrators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Administrators</em>'.
	 * @see org.nasdanika.webtest.hub.Hub#getAdministrators()
	 * @see #getHub()
	 * @generated
	 */
	EReference getHub_Administrators();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.webtest.hub.Hub#getSlideWidth <em>Slide Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slide Width</em>'.
	 * @see org.nasdanika.webtest.hub.Hub#getSlideWidth()
	 * @see #getHub()
	 * @generated
	 */
	EAttribute getHub_SlideWidth();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.webtest.hub.Hub#testOperation(int) <em>Test Operation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Test Operation</em>' operation.
	 * @see org.nasdanika.webtest.hub.Hub#testOperation(int)
	 * @generated
	 */
	EOperation getHub__TestOperation__int();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.webtest.hub.ApplicationOwner <em>Application Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Owner</em>'.
	 * @see org.nasdanika.webtest.hub.ApplicationOwner
	 * @generated
	 */
	EClass getApplicationOwner();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.webtest.hub.ApplicationOwner#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applications</em>'.
	 * @see org.nasdanika.webtest.hub.ApplicationOwner#getApplications()
	 * @see #getApplicationOwner()
	 * @generated
	 */
	EReference getApplicationOwner_Applications();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.webtest.hub.Guest <em>Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guest</em>'.
	 * @see org.nasdanika.webtest.hub.Guest
	 * @generated
	 */
	EClass getGuest();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.webtest.hub.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see org.nasdanika.webtest.hub.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.webtest.hub.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see org.nasdanika.webtest.hub.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.webtest.hub.Application#getTestSessions <em>Test Sessions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test Sessions</em>'.
	 * @see org.nasdanika.webtest.hub.Application#getTestSessions()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_TestSessions();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.webtest.hub.Application#getSecurityToken <em>Security Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Token</em>'.
	 * @see org.nasdanika.webtest.hub.Application#getSecurityToken()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_SecurityToken();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.webtest.hub.Application#getScreenshots <em>Screenshots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Screenshots</em>'.
	 * @see org.nasdanika.webtest.hub.Application#getScreenshots()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Screenshots();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.webtest.hub.Application#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.webtest.hub.Application#getName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.webtest.hub.Application#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.webtest.hub.Application#getDescription()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Description();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.webtest.hub.Descriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Descriptor</em>'.
	 * @see org.nasdanika.webtest.hub.Descriptor
	 * @generated
	 */
	EClass getDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.webtest.hub.Descriptor#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see org.nasdanika.webtest.hub.Descriptor#getQualifiedName()
	 * @see #getDescriptor()
	 * @generated
	 */
	EAttribute getDescriptor_QualifiedName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.webtest.hub.Descriptor#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.nasdanika.webtest.hub.Descriptor#getTitle()
	 * @see #getDescriptor()
	 * @generated
	 */
	EAttribute getDescriptor_Title();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.webtest.hub.Descriptor#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see org.nasdanika.webtest.hub.Descriptor#getDescription()
	 * @see #getDescriptor()
	 * @generated
	 */
	EReference getDescriptor_Description();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.webtest.hub.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see org.nasdanika.webtest.hub.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.webtest.hub.Description#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.nasdanika.webtest.hub.Description#getUrl()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_Url();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.webtest.hub.Description#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see org.nasdanika.webtest.hub.Description#getValue()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.webtest.hub.Description#isHtml <em>Html</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Html</em>'.
	 * @see org.nasdanika.webtest.hub.Description#isHtml()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_Html();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.webtest.hub.TestSession <em>Test Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Session</em>'.
	 * @see org.nasdanika.webtest.hub.TestSession
	 * @generated
	 */
	EClass getTestSession();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.webtest.hub.TestSession#getTestResults <em>Test Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Test Results</em>'.
	 * @see org.nasdanika.webtest.hub.TestSession#getTestResults()
	 * @see #getTestSession()
	 * @generated
	 */
	EReference getTestSession_TestResults();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.webtest.hub.TestSession#getPageResults <em>Page Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Page Results</em>'.
	 * @see org.nasdanika.webtest.hub.TestSession#getPageResults()
	 * @see #getTestSession()
	 * @generated
	 */
	EReference getTestSession_PageResults();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.webtest.hub.TestSession#getActorResults <em>Actor Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actor Results</em>'.
	 * @see org.nasdanika.webtest.hub.TestSession#getActorResults()
	 * @see #getTestSession()
	 * @generated
	 */
	EReference getTestSession_ActorResults();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.webtest.hub.TestSession#isPublished <em>Published</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Published</em>'.
	 * @see org.nasdanika.webtest.hub.TestSession#isPublished()
	 * @see #getTestSession()
	 * @generated
	 */
	EAttribute getTestSession_Published();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.webtest.hub.TestSession#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.nasdanika.webtest.hub.TestSession#getSize()
	 * @see #getTestSession()
	 * @generated
	 */
	EAttribute getTestSession_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.webtest.hub.TestSession#getProgress <em>Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Progress</em>'.
	 * @see org.nasdanika.webtest.hub.TestSession#getProgress()
	 * @see #getTestSession()
	 * @generated
	 */
	EAttribute getTestSession_Progress();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.webtest.hub.TestSession#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see org.nasdanika.webtest.hub.TestSession#getTimestamp()
	 * @see #getTestSession()
	 * @generated
	 */
	EAttribute getTestSession_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.webtest.hub.TestSession#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see org.nasdanika.webtest.hub.TestSession#getNode()
	 * @see #getTestSession()
	 * @generated
	 */
	EAttribute getTestSession_Node();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.webtest.hub.TestResult <em>Test Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Result</em>'.
	 * @see org.nasdanika.webtest.hub.TestResult
	 * @generated
	 */
	EClass getTestResult();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.webtest.hub.TestResult#getPageResults <em>Page Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Page Results</em>'.
	 * @see org.nasdanika.webtest.hub.TestResult#getPageResults()
	 * @see #getTestResult()
	 * @generated
	 */
	EReference getTestResult_PageResults();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.webtest.hub.TestResult#getActorResults <em>Actor Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actor Results</em>'.
	 * @see org.nasdanika.webtest.hub.TestResult#getActorResults()
	 * @see #getTestResult()
	 * @generated
	 */
	EReference getTestResult_ActorResults();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.webtest.hub.TestClassResult <em>Test Class Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Class Result</em>'.
	 * @see org.nasdanika.webtest.hub.TestClassResult
	 * @generated
	 */
	EClass getTestClassResult();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.webtest.hub.TestClassResult#getMethodResults <em>Method Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method Results</em>'.
	 * @see org.nasdanika.webtest.hub.TestClassResult#getMethodResults()
	 * @see #getTestClassResult()
	 * @generated
	 */
	EReference getTestClassResult_MethodResults();

	/**
	 * Returns the meta object for the map '{@link org.nasdanika.webtest.hub.TestClassResult#getStats <em>Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Stats</em>'.
	 * @see org.nasdanika.webtest.hub.TestClassResult#getStats()
	 * @see #getTestClassResult()
	 * @generated
	 */
	EReference getTestClassResult_Stats();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Stats Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stats Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.emf.ecore.EIntegerObject"
	 * @generated
	 */
	EClass getStatsEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStatsEntry()
	 * @generated
	 */
	EAttribute getStatsEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStatsEntry()
	 * @generated
	 */
	EAttribute getStatsEntry_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.webtest.hub.TestSuiteResult <em>Test Suite Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Suite Result</em>'.
	 * @see org.nasdanika.webtest.hub.TestSuiteResult
	 * @generated
	 */
	EClass getTestSuiteResult();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.webtest.hub.TestSuiteResult#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.nasdanika.webtest.hub.TestSuiteResult#getChildren()
	 * @see #getTestSuiteResult()
	 * @generated
	 */
	EReference getTestSuiteResult_Children();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.webtest.hub.ParameterizedTestResult <em>Parameterized Test Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameterized Test Result</em>'.
	 * @see org.nasdanika.webtest.hub.ParameterizedTestResult
	 * @generated
	 */
	EClass getParameterizedTestResult();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.webtest.hub.ParameterizedTestResult#getParameterDescriptors <em>Parameter Descriptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Descriptors</em>'.
	 * @see org.nasdanika.webtest.hub.ParameterizedTestResult#getParameterDescriptors()
	 * @see #getParameterizedTestResult()
	 * @generated
	 */
	EReference getParameterizedTestResult_ParameterDescriptors();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.webtest.hub.Screenshot <em>Screenshot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screenshot</em>'.
	 * @see org.nasdanika.webtest.hub.Screenshot
	 * @generated
	 */
	EClass getScreenshot();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.webtest.hub.Screenshot#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.nasdanika.webtest.hub.Screenshot#getContent()
	 * @see #getScreenshot()
	 * @generated
	 */
	EAttribute getScreenshot_Content();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.webtest.hub.Screenshot#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see org.nasdanika.webtest.hub.Screenshot#getTimestamp()
	 * @see #getScreenshot()
	 * @generated
	 */
	EAttribute getScreenshot_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.webtest.hub.Screenshot#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.nasdanika.webtest.hub.Screenshot#getHeight()
	 * @see #getScreenshot()
	 * @generated
	 */
	EAttribute getScreenshot_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.webtest.hub.Screenshot#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.nasdanika.webtest.hub.Screenshot#getWidth()
	 * @see #getScreenshot()
	 * @generated
	 */
	EAttribute getScreenshot_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.webtest.hub.Screenshot#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Type</em>'.
	 * @see org.nasdanika.webtest.hub.Screenshot#getContentType()
	 * @see #getScreenshot()
	 * @generated
	 */
	EAttribute getScreenshot_ContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.webtest.hub.Screenshot#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.nasdanika.webtest.hub.Screenshot#getLength()
	 * @see #getScreenshot()
	 * @generated
	 */
	EAttribute getScreenshot_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.webtest.hub.Screenshot#getDigest <em>Digest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Digest</em>'.
	 * @see org.nasdanika.webtest.hub.Screenshot#getDigest()
	 * @see #getScreenshot()
	 * @generated
	 */
	EAttribute getScreenshot_Digest();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.webtest.hub.Screenshot#getBeforeOperations <em>Before Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Before Operations</em>'.
	 * @see org.nasdanika.webtest.hub.Screenshot#getBeforeOperations()
	 * @see #getScreenshot()
	 * @generated
	 */
	EReference getScreenshot_BeforeOperations();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.webtest.hub.Screenshot#getAfterOperations <em>After Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>After Operations</em>'.
	 * @see org.nasdanika.webtest.hub.Screenshot#getAfterOperations()
	 * @see #getScreenshot()
	 * @generated
	 */
	EReference getScreenshot_AfterOperations();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.webtest.hub.OperationResult <em>Operation Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Result</em>'.
	 * @see org.nasdanika.webtest.hub.OperationResult
	 * @generated
	 */
	EClass getOperationResult();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.webtest.hub.OperationResult#getScreenshots <em>Screenshots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Screenshots</em>'.
	 * @see org.nasdanika.webtest.hub.OperationResult#getScreenshots()
	 * @see #getOperationResult()
	 * @generated
	 */
	EReference getOperationResult_Screenshots();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.webtest.hub.OperationResult#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.nasdanika.webtest.hub.OperationResult#getChildren()
	 * @see #getOperationResult()
	 * @generated
	 */
	EReference getOperationResult_Children();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.webtest.hub.OperationResult#getOperationName <em>Operation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Name</em>'.
	 * @see org.nasdanika.webtest.hub.OperationResult#getOperationName()
	 * @see #getOperationResult()
	 * @generated
	 */
	EAttribute getOperationResult_OperationName();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.webtest.hub.OperationResult#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Arguments</em>'.
	 * @see org.nasdanika.webtest.hub.OperationResult#getArguments()
	 * @see #getOperationResult()
	 * @generated
	 */
	EAttribute getOperationResult_Arguments();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.webtest.hub.OperationResult#getBeforeTiming <em>Before Timing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Before Timing</em>'.
	 * @see org.nasdanika.webtest.hub.OperationResult#getBeforeTiming()
	 * @see #getOperationResult()
	 * @generated
	 */
	EReference getOperationResult_BeforeTiming();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.webtest.hub.OperationResult#getBeforeScreenshot <em>Before Screenshot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Before Screenshot</em>'.
	 * @see org.nasdanika.webtest.hub.OperationResult#getBeforeScreenshot()
	 * @see #getOperationResult()
	 * @generated
	 */
	EReference getOperationResult_BeforeScreenshot();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.webtest.hub.OperationResult#getAfterTiming <em>After Timing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>After Timing</em>'.
	 * @see org.nasdanika.webtest.hub.OperationResult#getAfterTiming()
	 * @see #getOperationResult()
	 * @generated
	 */
	EReference getOperationResult_AfterTiming();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.webtest.hub.OperationResult#getAfterScreenshot <em>After Screenshot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>After Screenshot</em>'.
	 * @see org.nasdanika.webtest.hub.OperationResult#getAfterScreenshot()
	 * @see #getOperationResult()
	 * @generated
	 */
	EReference getOperationResult_AfterScreenshot();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.webtest.hub.OperationResult#getFailure <em>Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Failure</em>'.
	 * @see org.nasdanika.webtest.hub.OperationResult#getFailure()
	 * @see #getOperationResult()
	 * @generated
	 */
	EReference getOperationResult_Failure();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.webtest.hub.OperationResult#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error</em>'.
	 * @see org.nasdanika.webtest.hub.OperationResult#getError()
	 * @see #getOperationResult()
	 * @generated
	 */
	EReference getOperationResult_Error();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.webtest.hub.OperationResult#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see org.nasdanika.webtest.hub.OperationResult#getStart()
	 * @see #getOperationResult()
	 * @generated
	 */
	EAttribute getOperationResult_Start();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.webtest.hub.OperationResult#getFinish <em>Finish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finish</em>'.
	 * @see org.nasdanika.webtest.hub.OperationResult#getFinish()
	 * @see #getOperationResult()
	 * @generated
	 */
	EAttribute getOperationResult_Finish();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.webtest.hub.OperationResult#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.nasdanika.webtest.hub.OperationResult#getStatus()
	 * @see #getOperationResult()
	 * @generated
	 */
	EAttribute getOperationResult_Status();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.webtest.hub.Throwable <em>Throwable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throwable</em>'.
	 * @see org.nasdanika.webtest.hub.Throwable
	 * @generated
	 */
	EClass getThrowable();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.webtest.hub.Throwable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.webtest.hub.Throwable#getType()
	 * @see #getThrowable()
	 * @generated
	 */
	EAttribute getThrowable_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.webtest.hub.Throwable#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.nasdanika.webtest.hub.Throwable#getMessage()
	 * @see #getThrowable()
	 * @generated
	 */
	EAttribute getThrowable_Message();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.webtest.hub.Throwable#getStackTrace <em>Stack Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stack Trace</em>'.
	 * @see org.nasdanika.webtest.hub.Throwable#getStackTrace()
	 * @see #getThrowable()
	 * @generated
	 */
	EReference getThrowable_StackTrace();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.webtest.hub.StackTraceEntry <em>Stack Trace Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stack Trace Entry</em>'.
	 * @see org.nasdanika.webtest.hub.StackTraceEntry
	 * @generated
	 */
	EClass getStackTraceEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.webtest.hub.StackTraceEntry#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.nasdanika.webtest.hub.StackTraceEntry#getClassName()
	 * @see #getStackTraceEntry()
	 * @generated
	 */
	EAttribute getStackTraceEntry_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.webtest.hub.StackTraceEntry#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see org.nasdanika.webtest.hub.StackTraceEntry#getFileName()
	 * @see #getStackTraceEntry()
	 * @generated
	 */
	EAttribute getStackTraceEntry_FileName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.webtest.hub.StackTraceEntry#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see org.nasdanika.webtest.hub.StackTraceEntry#getMethodName()
	 * @see #getStackTraceEntry()
	 * @generated
	 */
	EAttribute getStackTraceEntry_MethodName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.webtest.hub.StackTraceEntry#getLineNumber <em>Line Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Number</em>'.
	 * @see org.nasdanika.webtest.hub.StackTraceEntry#getLineNumber()
	 * @see #getStackTraceEntry()
	 * @generated
	 */
	EAttribute getStackTraceEntry_LineNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.webtest.hub.StackTraceEntry#isNative <em>Native</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Native</em>'.
	 * @see org.nasdanika.webtest.hub.StackTraceEntry#isNative()
	 * @see #getStackTraceEntry()
	 * @generated
	 */
	EAttribute getStackTraceEntry_Native();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.webtest.hub.InitializationResult <em>Initialization Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initialization Result</em>'.
	 * @see org.nasdanika.webtest.hub.InitializationResult
	 * @generated
	 */
	EClass getInitializationResult();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.webtest.hub.MethodResult <em>Method Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Result</em>'.
	 * @see org.nasdanika.webtest.hub.MethodResult
	 * @generated
	 */
	EClass getMethodResult();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.webtest.hub.ActorMethodResult <em>Actor Method Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor Method Result</em>'.
	 * @see org.nasdanika.webtest.hub.ActorMethodResult
	 * @generated
	 */
	EClass getActorMethodResult();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.webtest.hub.ActorMethodResult#getActorResult <em>Actor Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actor Result</em>'.
	 * @see org.nasdanika.webtest.hub.ActorMethodResult#getActorResult()
	 * @see #getActorMethodResult()
	 * @generated
	 */
	EReference getActorMethodResult_ActorResult();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.webtest.hub.PageMethodResult <em>Page Method Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Method Result</em>'.
	 * @see org.nasdanika.webtest.hub.PageMethodResult
	 * @generated
	 */
	EClass getPageMethodResult();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.webtest.hub.PageMethodResult#getPageResult <em>Page Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Page Result</em>'.
	 * @see org.nasdanika.webtest.hub.PageMethodResult#getPageResult()
	 * @see #getPageMethodResult()
	 * @generated
	 */
	EReference getPageMethodResult_PageResult();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.webtest.hub.TestMethodResult <em>Test Method Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Method Result</em>'.
	 * @see org.nasdanika.webtest.hub.TestMethodResult
	 * @generated
	 */
	EClass getTestMethodResult();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.webtest.hub.TestMethodResult#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameters</em>'.
	 * @see org.nasdanika.webtest.hub.TestMethodResult#getParameters()
	 * @see #getTestMethodResult()
	 * @generated
	 */
	EAttribute getTestMethodResult_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.webtest.hub.TestMethodResult#getNavigationTiming <em>Navigation Timing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Navigation Timing</em>'.
	 * @see org.nasdanika.webtest.hub.TestMethodResult#getNavigationTiming()
	 * @see #getTestMethodResult()
	 * @generated
	 */
	EReference getTestMethodResult_NavigationTiming();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.webtest.hub.TestMethodResult#loadTiming(org.json.JSONObject) <em>Load Timing</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Timing</em>' operation.
	 * @see org.nasdanika.webtest.hub.TestMethodResult#loadTiming(org.json.JSONObject)
	 * @generated
	 */
	EOperation getTestMethodResult__LoadTiming__JSONObject();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.webtest.hub.Coverage <em>Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coverage</em>'.
	 * @see org.nasdanika.webtest.hub.Coverage
	 * @generated
	 */
	EClass getCoverage();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.webtest.hub.Coverage#getInvocations <em>Invocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invocations</em>'.
	 * @see org.nasdanika.webtest.hub.Coverage#getInvocations()
	 * @see #getCoverage()
	 * @generated
	 */
	EAttribute getCoverage_Invocations();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.webtest.hub.ActorResult <em>Actor Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor Result</em>'.
	 * @see org.nasdanika.webtest.hub.ActorResult
	 * @generated
	 */
	EClass getActorResult();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.webtest.hub.ActorResult#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Results</em>'.
	 * @see org.nasdanika.webtest.hub.ActorResult#getResults()
	 * @see #getActorResult()
	 * @generated
	 */
	EReference getActorResult_Results();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.webtest.hub.ActorResult#getCoverage <em>Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coverage</em>'.
	 * @see org.nasdanika.webtest.hub.ActorResult#getCoverage()
	 * @see #getActorResult()
	 * @generated
	 */
	EReference getActorResult_Coverage();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.webtest.hub.ActorResult#isProxy <em>Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proxy</em>'.
	 * @see org.nasdanika.webtest.hub.ActorResult#isProxy()
	 * @see #getActorResult()
	 * @generated
	 */
	EAttribute getActorResult_Proxy();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.webtest.hub.PageResult <em>Page Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Result</em>'.
	 * @see org.nasdanika.webtest.hub.PageResult
	 * @generated
	 */
	EClass getPageResult();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.webtest.hub.PageResult#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Results</em>'.
	 * @see org.nasdanika.webtest.hub.PageResult#getResults()
	 * @see #getPageResult()
	 * @generated
	 */
	EReference getPageResult_Results();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.webtest.hub.PageResult#getCoverage <em>Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coverage</em>'.
	 * @see org.nasdanika.webtest.hub.PageResult#getCoverage()
	 * @see #getPageResult()
	 * @generated
	 */
	EReference getPageResult_Coverage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.webtest.hub.PageResult#getWebElements <em>Web Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Web Elements</em>'.
	 * @see org.nasdanika.webtest.hub.PageResult#getWebElements()
	 * @see #getPageResult()
	 * @generated
	 */
	EReference getPageResult_WebElements();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.webtest.hub.PageResult#isProxy <em>Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proxy</em>'.
	 * @see org.nasdanika.webtest.hub.PageResult#isProxy()
	 * @see #getPageResult()
	 * @generated
	 */
	EAttribute getPageResult_Proxy();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.webtest.hub.WebElement <em>Web Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Web Element</em>'.
	 * @see org.nasdanika.webtest.hub.WebElement
	 * @generated
	 */
	EClass getWebElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.webtest.hub.WebElement#getLocators <em>Locators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locators</em>'.
	 * @see org.nasdanika.webtest.hub.WebElement#getLocators()
	 * @see #getWebElement()
	 * @generated
	 */
	EReference getWebElement_Locators();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.webtest.hub.Locator <em>Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Locator</em>'.
	 * @see org.nasdanika.webtest.hub.Locator
	 * @generated
	 */
	EClass getLocator();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.webtest.hub.Locator#getHow <em>How</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>How</em>'.
	 * @see org.nasdanika.webtest.hub.Locator#getHow()
	 * @see #getLocator()
	 * @generated
	 */
	EAttribute getLocator_How();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.webtest.hub.Locator#getUsing <em>Using</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Using</em>'.
	 * @see org.nasdanika.webtest.hub.Locator#getUsing()
	 * @see #getLocator()
	 * @generated
	 */
	EAttribute getLocator_Using();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.core.JSONLoader <em>JSON Loader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSON Loader</em>'.
	 * @see org.nasdanika.core.JSONLoader
	 * @model instanceClass="org.nasdanika.core.JSONLoader"
	 * @generated
	 */
	EClass getJSONLoader();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.webtest.hub.BreadcrumbsProvider <em>Breadcrumbs Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Breadcrumbs Provider</em>'.
	 * @see org.nasdanika.webtest.hub.BreadcrumbsProvider
	 * @model instanceClass="org.nasdanika.webtest.hub.BreadcrumbsProvider"
	 * @generated
	 */
	EClass getBreadcrumbsProvider();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.webtest.hub.OperationStatus <em>Operation Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation Status</em>'.
	 * @see org.nasdanika.webtest.hub.OperationStatus
	 * @generated
	 */
	EEnum getOperationStatus();

	/**
	 * Returns the meta object for data type '{@link org.json.JSONObject <em>JSON Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>JSON Object</em>'.
	 * @see org.json.JSONObject
	 * @model instanceClass="org.json.JSONObject"
	 * @generated
	 */
	EDataType getJSONObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see java.lang.Exception
	 * @model instanceClass="java.lang.Exception"
	 * @generated
	 */
	EDataType getException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HubFactory getHubFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.webtest.hub.impl.HubImpl <em>Hub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.webtest.hub.impl.HubImpl
		 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getHub()
		 * @generated
		 */
		EClass HUB = eINSTANCE.getHub();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HUB__NAME = eINSTANCE.getHub_Name();

		/**
		 * The meta object literal for the '<em><b>Guest</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUB__GUEST = eINSTANCE.getHub_Guest();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUB__USERS = eINSTANCE.getHub_Users();

		/**
		 * The meta object literal for the '<em><b>Administrators</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HUB__ADMINISTRATORS = eINSTANCE.getHub_Administrators();

		/**
		 * The meta object literal for the '<em><b>Slide Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HUB__SLIDE_WIDTH = eINSTANCE.getHub_SlideWidth();

		/**
		 * The meta object literal for the '<em><b>Test Operation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HUB___TEST_OPERATION__INT = eINSTANCE.getHub__TestOperation__int();

		/**
		 * The meta object literal for the '{@link org.nasdanika.webtest.hub.ApplicationOwner <em>Application Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.webtest.hub.ApplicationOwner
		 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getApplicationOwner()
		 * @generated
		 */
		EClass APPLICATION_OWNER = eINSTANCE.getApplicationOwner();

		/**
		 * The meta object literal for the '<em><b>Applications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_OWNER__APPLICATIONS = eINSTANCE.getApplicationOwner_Applications();

		/**
		 * The meta object literal for the '{@link org.nasdanika.webtest.hub.impl.GuestImpl <em>Guest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.webtest.hub.impl.GuestImpl
		 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getGuest()
		 * @generated
		 */
		EClass GUEST = eINSTANCE.getGuest();

		/**
		 * The meta object literal for the '{@link org.nasdanika.webtest.hub.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.webtest.hub.impl.UserImpl
		 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '{@link org.nasdanika.webtest.hub.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.webtest.hub.impl.ApplicationImpl
		 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Test Sessions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__TEST_SESSIONS = eINSTANCE.getApplication_TestSessions();

		/**
		 * The meta object literal for the '<em><b>Security Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__SECURITY_TOKEN = eINSTANCE.getApplication_SecurityToken();

		/**
		 * The meta object literal for the '<em><b>Screenshots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__SCREENSHOTS = eINSTANCE.getApplication_Screenshots();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__DESCRIPTION = eINSTANCE.getApplication_Description();

		/**
		 * The meta object literal for the '{@link org.nasdanika.webtest.hub.impl.DescriptorImpl <em>Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.webtest.hub.impl.DescriptorImpl
		 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getDescriptor()
		 * @generated
		 */
		EClass DESCRIPTOR = eINSTANCE.getDescriptor();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTOR__QUALIFIED_NAME = eINSTANCE.getDescriptor_QualifiedName();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTOR__TITLE = eINSTANCE.getDescriptor_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTOR__DESCRIPTION = eINSTANCE.getDescriptor_Description();

		/**
		 * The meta object literal for the '{@link org.nasdanika.webtest.hub.impl.DescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.webtest.hub.impl.DescriptionImpl
		 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getDescription()
		 * @generated
		 */
		EClass DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__URL = eINSTANCE.getDescription_Url();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__VALUE = eINSTANCE.getDescription_Value();

		/**
		 * The meta object literal for the '<em><b>Html</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__HTML = eINSTANCE.getDescription_Html();

		/**
		 * The meta object literal for the '{@link org.nasdanika.webtest.hub.impl.TestSessionImpl <em>Test Session</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.webtest.hub.impl.TestSessionImpl
		 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getTestSession()
		 * @generated
		 */
		EClass TEST_SESSION = eINSTANCE.getTestSession();

		/**
		 * The meta object literal for the '<em><b>Test Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_SESSION__TEST_RESULTS = eINSTANCE.getTestSession_TestResults();

		/**
		 * The meta object literal for the '<em><b>Page Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_SESSION__PAGE_RESULTS = eINSTANCE.getTestSession_PageResults();

		/**
		 * The meta object literal for the '<em><b>Actor Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_SESSION__ACTOR_RESULTS = eINSTANCE.getTestSession_ActorResults();

		/**
		 * The meta object literal for the '<em><b>Published</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_SESSION__PUBLISHED = eINSTANCE.getTestSession_Published();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_SESSION__SIZE = eINSTANCE.getTestSession_Size();

		/**
		 * The meta object literal for the '<em><b>Progress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_SESSION__PROGRESS = eINSTANCE.getTestSession_Progress();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_SESSION__TIMESTAMP = eINSTANCE.getTestSession_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_SESSION__NODE = eINSTANCE.getTestSession_Node();

		/**
		 * The meta object literal for the '{@link org.nasdanika.webtest.hub.impl.TestResultImpl <em>Test Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.webtest.hub.impl.TestResultImpl
		 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getTestResult()
		 * @generated
		 */
		EClass TEST_RESULT = eINSTANCE.getTestResult();

		/**
		 * The meta object literal for the '<em><b>Page Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_RESULT__PAGE_RESULTS = eINSTANCE.getTestResult_PageResults();

		/**
		 * The meta object literal for the '<em><b>Actor Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_RESULT__ACTOR_RESULTS = eINSTANCE.getTestResult_ActorResults();

		/**
		 * The meta object literal for the '{@link org.nasdanika.webtest.hub.impl.TestClassResultImpl <em>Test Class Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.webtest.hub.impl.TestClassResultImpl
		 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getTestClassResult()
		 * @generated
		 */
		EClass TEST_CLASS_RESULT = eINSTANCE.getTestClassResult();

		/**
		 * The meta object literal for the '<em><b>Method Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CLASS_RESULT__METHOD_RESULTS = eINSTANCE.getTestClassResult_MethodResults();

		/**
		 * The meta object literal for the '<em><b>Stats</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CLASS_RESULT__STATS = eINSTANCE.getTestClassResult_Stats();

		/**
		 * The meta object literal for the '{@link org.nasdanika.webtest.hub.impl.StatsEntryImpl <em>Stats Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.webtest.hub.impl.StatsEntryImpl
		 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getStatsEntry()
		 * @generated
		 */
		EClass STATS_ENTRY = eINSTANCE.getStatsEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATS_ENTRY__KEY = eINSTANCE.getStatsEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATS_ENTRY__VALUE = eINSTANCE.getStatsEntry_Value();

		/**
		 * The meta object literal for the '{@link org.nasdanika.webtest.hub.impl.TestSuiteResultImpl <em>Test Suite Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.webtest.hub.impl.TestSuiteResultImpl
		 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getTestSuiteResult()
		 * @generated
		 */
		EClass TEST_SUITE_RESULT = eINSTANCE.getTestSuiteResult();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_SUITE_RESULT__CHILDREN = eINSTANCE.getTestSuiteResult_Children();

		/**
		 * The meta object literal for the '{@link org.nasdanika.webtest.hub.impl.ParameterizedTestResultImpl <em>Parameterized Test Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.webtest.hub.impl.ParameterizedTestResultImpl
		 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getParameterizedTestResult()
		 * @generated
		 */
		EClass PARAMETERIZED_TEST_RESULT = eINSTANCE.getParameterizedTestResult();

		/**
		 * The meta object literal for the '<em><b>Parameter Descriptors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETERIZED_TEST_RESULT__PARAMETER_DESCRIPTORS = eINSTANCE.getParameterizedTestResult_ParameterDescriptors();

		/**
		 * The meta object literal for the '{@link org.nasdanika.webtest.hub.impl.ScreenshotImpl <em>Screenshot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.webtest.hub.impl.ScreenshotImpl
		 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getScreenshot()
		 * @generated
		 */
		EClass SCREENSHOT = eINSTANCE.getScreenshot();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREENSHOT__CONTENT = eINSTANCE.getScreenshot_Content();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREENSHOT__TIMESTAMP = eINSTANCE.getScreenshot_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREENSHOT__HEIGHT = eINSTANCE.getScreenshot_Height();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREENSHOT__WIDTH = eINSTANCE.getScreenshot_Width();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREENSHOT__CONTENT_TYPE = eINSTANCE.getScreenshot_ContentType();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREENSHOT__LENGTH = eINSTANCE.getScreenshot_Length();

		/**
		 * The meta object literal for the '<em><b>Digest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREENSHOT__DIGEST = eINSTANCE.getScreenshot_Digest();

		/**
		 * The meta object literal for the '<em><b>Before Operations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCREENSHOT__BEFORE_OPERATIONS = eINSTANCE.getScreenshot_BeforeOperations();

		/**
		 * The meta object literal for the '<em><b>After Operations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCREENSHOT__AFTER_OPERATIONS = eINSTANCE.getScreenshot_AfterOperations();

		/**
		 * The meta object literal for the '{@link org.nasdanika.webtest.hub.impl.OperationResultImpl <em>Operation Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.webtest.hub.impl.OperationResultImpl
		 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getOperationResult()
		 * @generated
		 */
		EClass OPERATION_RESULT = eINSTANCE.getOperationResult();

		/**
		 * The meta object literal for the '<em><b>Screenshots</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_RESULT__SCREENSHOTS = eINSTANCE.getOperationResult_Screenshots();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_RESULT__CHILDREN = eINSTANCE.getOperationResult_Children();

		/**
		 * The meta object literal for the '<em><b>Operation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_RESULT__OPERATION_NAME = eINSTANCE.getOperationResult_OperationName();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_RESULT__ARGUMENTS = eINSTANCE.getOperationResult_Arguments();

		/**
		 * The meta object literal for the '<em><b>Before Timing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_RESULT__BEFORE_TIMING = eINSTANCE.getOperationResult_BeforeTiming();

		/**
		 * The meta object literal for the '<em><b>Before Screenshot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_RESULT__BEFORE_SCREENSHOT = eINSTANCE.getOperationResult_BeforeScreenshot();

		/**
		 * The meta object literal for the '<em><b>After Timing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_RESULT__AFTER_TIMING = eINSTANCE.getOperationResult_AfterTiming();

		/**
		 * The meta object literal for the '<em><b>After Screenshot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_RESULT__AFTER_SCREENSHOT = eINSTANCE.getOperationResult_AfterScreenshot();

		/**
		 * The meta object literal for the '<em><b>Failure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_RESULT__FAILURE = eINSTANCE.getOperationResult_Failure();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_RESULT__ERROR = eINSTANCE.getOperationResult_Error();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_RESULT__START = eINSTANCE.getOperationResult_Start();

		/**
		 * The meta object literal for the '<em><b>Finish</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_RESULT__FINISH = eINSTANCE.getOperationResult_Finish();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_RESULT__STATUS = eINSTANCE.getOperationResult_Status();

		/**
		 * The meta object literal for the '{@link org.nasdanika.webtest.hub.impl.ThrowableImpl <em>Throwable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.webtest.hub.impl.ThrowableImpl
		 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getThrowable()
		 * @generated
		 */
		EClass THROWABLE = eINSTANCE.getThrowable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THROWABLE__TYPE = eINSTANCE.getThrowable_Type();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THROWABLE__MESSAGE = eINSTANCE.getThrowable_Message();

		/**
		 * The meta object literal for the '<em><b>Stack Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THROWABLE__STACK_TRACE = eINSTANCE.getThrowable_StackTrace();

		/**
		 * The meta object literal for the '{@link org.nasdanika.webtest.hub.impl.StackTraceEntryImpl <em>Stack Trace Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.webtest.hub.impl.StackTraceEntryImpl
		 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getStackTraceEntry()
		 * @generated
		 */
		EClass STACK_TRACE_ENTRY = eINSTANCE.getStackTraceEntry();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_TRACE_ENTRY__CLASS_NAME = eINSTANCE.getStackTraceEntry_ClassName();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_TRACE_ENTRY__FILE_NAME = eINSTANCE.getStackTraceEntry_FileName();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_TRACE_ENTRY__METHOD_NAME = eINSTANCE.getStackTraceEntry_MethodName();

		/**
		 * The meta object literal for the '<em><b>Line Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_TRACE_ENTRY__LINE_NUMBER = eINSTANCE.getStackTraceEntry_LineNumber();

		/**
		 * The meta object literal for the '<em><b>Native</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_TRACE_ENTRY__NATIVE = eINSTANCE.getStackTraceEntry_Native();

		/**
		 * The meta object literal for the '{@link org.nasdanika.webtest.hub.impl.InitializationResultImpl <em>Initialization Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.webtest.hub.impl.InitializationResultImpl
		 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getInitializationResult()
		 * @generated
		 */
		EClass INITIALIZATION_RESULT = eINSTANCE.getInitializationResult();

		/**
		 * The meta object literal for the '{@link org.nasdanika.webtest.hub.impl.MethodResultImpl <em>Method Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.webtest.hub.impl.MethodResultImpl
		 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getMethodResult()
		 * @generated
		 */
		EClass METHOD_RESULT = eINSTANCE.getMethodResult();

		/**
		 * The meta object literal for the '{@link org.nasdanika.webtest.hub.impl.ActorMethodResultImpl <em>Actor Method Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.webtest.hub.impl.ActorMethodResultImpl
		 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getActorMethodResult()
		 * @generated
		 */
		EClass ACTOR_METHOD_RESULT = eINSTANCE.getActorMethodResult();

		/**
		 * The meta object literal for the '<em><b>Actor Result</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_METHOD_RESULT__ACTOR_RESULT = eINSTANCE.getActorMethodResult_ActorResult();

		/**
		 * The meta object literal for the '{@link org.nasdanika.webtest.hub.impl.PageMethodResultImpl <em>Page Method Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.webtest.hub.impl.PageMethodResultImpl
		 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getPageMethodResult()
		 * @generated
		 */
		EClass PAGE_METHOD_RESULT = eINSTANCE.getPageMethodResult();

		/**
		 * The meta object literal for the '<em><b>Page Result</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_METHOD_RESULT__PAGE_RESULT = eINSTANCE.getPageMethodResult_PageResult();

		/**
		 * The meta object literal for the '{@link org.nasdanika.webtest.hub.impl.TestMethodResultImpl <em>Test Method Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.webtest.hub.impl.TestMethodResultImpl
		 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getTestMethodResult()
		 * @generated
		 */
		EClass TEST_METHOD_RESULT = eINSTANCE.getTestMethodResult();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_METHOD_RESULT__PARAMETERS = eINSTANCE.getTestMethodResult_Parameters();

		/**
		 * The meta object literal for the '<em><b>Navigation Timing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_METHOD_RESULT__NAVIGATION_TIMING = eINSTANCE.getTestMethodResult_NavigationTiming();

		/**
		 * The meta object literal for the '<em><b>Load Timing</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEST_METHOD_RESULT___LOAD_TIMING__JSONOBJECT = eINSTANCE.getTestMethodResult__LoadTiming__JSONObject();

		/**
		 * The meta object literal for the '{@link org.nasdanika.webtest.hub.impl.CoverageImpl <em>Coverage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.webtest.hub.impl.CoverageImpl
		 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getCoverage()
		 * @generated
		 */
		EClass COVERAGE = eINSTANCE.getCoverage();

		/**
		 * The meta object literal for the '<em><b>Invocations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COVERAGE__INVOCATIONS = eINSTANCE.getCoverage_Invocations();

		/**
		 * The meta object literal for the '{@link org.nasdanika.webtest.hub.impl.ActorResultImpl <em>Actor Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.webtest.hub.impl.ActorResultImpl
		 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getActorResult()
		 * @generated
		 */
		EClass ACTOR_RESULT = eINSTANCE.getActorResult();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_RESULT__RESULTS = eINSTANCE.getActorResult_Results();

		/**
		 * The meta object literal for the '<em><b>Coverage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_RESULT__COVERAGE = eINSTANCE.getActorResult_Coverage();

		/**
		 * The meta object literal for the '<em><b>Proxy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR_RESULT__PROXY = eINSTANCE.getActorResult_Proxy();

		/**
		 * The meta object literal for the '{@link org.nasdanika.webtest.hub.impl.PageResultImpl <em>Page Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.webtest.hub.impl.PageResultImpl
		 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getPageResult()
		 * @generated
		 */
		EClass PAGE_RESULT = eINSTANCE.getPageResult();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_RESULT__RESULTS = eINSTANCE.getPageResult_Results();

		/**
		 * The meta object literal for the '<em><b>Coverage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_RESULT__COVERAGE = eINSTANCE.getPageResult_Coverage();

		/**
		 * The meta object literal for the '<em><b>Web Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_RESULT__WEB_ELEMENTS = eINSTANCE.getPageResult_WebElements();

		/**
		 * The meta object literal for the '<em><b>Proxy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE_RESULT__PROXY = eINSTANCE.getPageResult_Proxy();

		/**
		 * The meta object literal for the '{@link org.nasdanika.webtest.hub.impl.WebElementImpl <em>Web Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.webtest.hub.impl.WebElementImpl
		 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getWebElement()
		 * @generated
		 */
		EClass WEB_ELEMENT = eINSTANCE.getWebElement();

		/**
		 * The meta object literal for the '<em><b>Locators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEB_ELEMENT__LOCATORS = eINSTANCE.getWebElement_Locators();

		/**
		 * The meta object literal for the '{@link org.nasdanika.webtest.hub.impl.LocatorImpl <em>Locator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.webtest.hub.impl.LocatorImpl
		 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getLocator()
		 * @generated
		 */
		EClass LOCATOR = eINSTANCE.getLocator();

		/**
		 * The meta object literal for the '<em><b>How</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATOR__HOW = eINSTANCE.getLocator_How();

		/**
		 * The meta object literal for the '<em><b>Using</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATOR__USING = eINSTANCE.getLocator_Using();

		/**
		 * The meta object literal for the '{@link org.nasdanika.core.JSONLoader <em>JSON Loader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.core.JSONLoader
		 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getJSONLoader()
		 * @generated
		 */
		EClass JSON_LOADER = eINSTANCE.getJSONLoader();

		/**
		 * The meta object literal for the '{@link org.nasdanika.webtest.hub.BreadcrumbsProvider <em>Breadcrumbs Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.webtest.hub.BreadcrumbsProvider
		 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getBreadcrumbsProvider()
		 * @generated
		 */
		EClass BREADCRUMBS_PROVIDER = eINSTANCE.getBreadcrumbsProvider();

		/**
		 * The meta object literal for the '{@link org.nasdanika.webtest.hub.OperationStatus <em>Operation Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.webtest.hub.OperationStatus
		 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getOperationStatus()
		 * @generated
		 */
		EEnum OPERATION_STATUS = eINSTANCE.getOperationStatus();

		/**
		 * The meta object literal for the '<em>JSON Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.json.JSONObject
		 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getJSONObject()
		 * @generated
		 */
		EDataType JSON_OBJECT = eINSTANCE.getJSONObject();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getException()
		 * @generated
		 */
		EDataType EXCEPTION = eINSTANCE.getException();

	}

} //HubPackage
