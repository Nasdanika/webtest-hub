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
	 * The number of structural features of the '<em>Hub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB_FEATURE_COUNT = SecurityPackage.LOGIN_PASSWORD_PROTECTION_DOMAIN_FEATURE_COUNT + 4;

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
	 * The number of operations of the '<em>Hub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB_OPERATION_COUNT = SecurityPackage.LOGIN_PASSWORD_PROTECTION_DOMAIN_OPERATION_COUNT + 0;

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
	int APPLICATION__TEST_SESSIONS = 0;

	/**
	 * The feature id for the '<em><b>Security Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__SECURITY_TOKEN = 1;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.webtest.hub.JSONLoader <em>JSON Loader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.webtest.hub.JSONLoader
	 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getJSONLoader()
	 * @generated
	 */
	int JSON_LOADER = 16;

	/**
	 * The number of structural features of the '<em>JSON Loader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_LOADER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Load JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_LOADER___LOAD_JSON__JSONOBJECT = 0;

	/**
	 * The number of operations of the '<em>JSON Loader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_LOADER_OPERATION_COUNT = 1;

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
	 * The operation id for the '<em>Load JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR___LOAD_JSON__JSONOBJECT = JSON_LOADER___LOAD_JSON__JSONOBJECT;

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
	 * The operation id for the '<em>Load JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION___LOAD_JSON__JSONOBJECT = JSON_LOADER___LOAD_JSON__JSONOBJECT;

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
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SESSION__RESULTS = DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SESSION__PUBLISHED = DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Test Session</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SESSION_FEATURE_COUNT = DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Load JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SESSION___LOAD_JSON__JSONOBJECT = DESCRIPTOR___LOAD_JSON__JSONOBJECT;

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
	 * The operation id for the '<em>Load JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_RESULT___LOAD_JSON__JSONOBJECT = DESCRIPTOR___LOAD_JSON__JSONOBJECT;

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
	 * The number of structural features of the '<em>Test Class Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS_RESULT_FEATURE_COUNT = TEST_RESULT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Load JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS_RESULT___LOAD_JSON__JSONOBJECT = TEST_RESULT___LOAD_JSON__JSONOBJECT;

	/**
	 * The number of operations of the '<em>Test Class Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CLASS_RESULT_OPERATION_COUNT = TEST_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.webtest.hub.impl.TestSuiteResultImpl <em>Test Suite Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.webtest.hub.impl.TestSuiteResultImpl
	 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getTestSuiteResult()
	 * @generated
	 */
	int TEST_SUITE_RESULT = 10;

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
	 * The operation id for the '<em>Load JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SUITE_RESULT___LOAD_JSON__JSONOBJECT = TEST_RESULT___LOAD_JSON__JSONOBJECT;

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
	int PARAMETERIZED_TEST_RESULT = 11;

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
	 * The number of structural features of the '<em>Parameterized Test Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TEST_RESULT_FEATURE_COUNT = TEST_SUITE_RESULT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Load JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERIZED_TEST_RESULT___LOAD_JSON__JSONOBJECT = TEST_SUITE_RESULT___LOAD_JSON__JSONOBJECT;

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
	int SCREENSHOT = 12;

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
	 * The number of structural features of the '<em>Screenshot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREENSHOT_FEATURE_COUNT = 4;

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
	int OPERATION_RESULT = 13;

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
	 * The feature id for the '<em><b>Screenshots</b></em>' containment reference list.
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
	 * The number of structural features of the '<em>Operation Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RESULT_FEATURE_COUNT = DESCRIPTOR_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Load JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RESULT___LOAD_JSON__JSONOBJECT = DESCRIPTOR___LOAD_JSON__JSONOBJECT;

	/**
	 * The number of operations of the '<em>Operation Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_RESULT_OPERATION_COUNT = DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.webtest.hub.impl.ActorResultImpl <em>Actor Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.webtest.hub.impl.ActorResultImpl
	 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getActorResult()
	 * @generated
	 */
	int ACTOR_RESULT = 14;

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
	 * The number of structural features of the '<em>Actor Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_RESULT_FEATURE_COUNT = DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Load JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_RESULT___LOAD_JSON__JSONOBJECT = DESCRIPTOR___LOAD_JSON__JSONOBJECT;

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
	int PAGE_RESULT = 15;

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
	 * The number of structural features of the '<em>Page Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_RESULT_FEATURE_COUNT = DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Load JSON</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_RESULT___LOAD_JSON__JSONOBJECT = DESCRIPTOR___LOAD_JSON__JSONOBJECT;

	/**
	 * The number of operations of the '<em>Page Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_RESULT_OPERATION_COUNT = DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.webtest.hub.TestStatus <em>Test Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.webtest.hub.TestStatus
	 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getTestStatus()
	 * @generated
	 */
	int TEST_STATUS = 17;

	/**
	 * The meta object id for the '<em>JSON Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.json.JSONObject
	 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getJSONObject()
	 * @generated
	 */
	int JSON_OBJECT = 18;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 19;


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
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.webtest.hub.TestSession#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Results</em>'.
	 * @see org.nasdanika.webtest.hub.TestSession#getResults()
	 * @see #getTestSession()
	 * @generated
	 */
	EReference getTestSession_Results();

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
	 * Returns the meta object for class '{@link org.nasdanika.webtest.hub.OperationResult <em>Operation Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Result</em>'.
	 * @see org.nasdanika.webtest.hub.OperationResult
	 * @generated
	 */
	EClass getOperationResult();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.webtest.hub.OperationResult#getScreenshots <em>Screenshots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Screenshots</em>'.
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
	 * Returns the meta object for class '{@link org.nasdanika.webtest.hub.JSONLoader <em>JSON Loader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSON Loader</em>'.
	 * @see org.nasdanika.webtest.hub.JSONLoader
	 * @generated
	 */
	EClass getJSONLoader();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.webtest.hub.JSONLoader#loadJSON(org.json.JSONObject) <em>Load JSON</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load JSON</em>' operation.
	 * @see org.nasdanika.webtest.hub.JSONLoader#loadJSON(org.json.JSONObject)
	 * @generated
	 */
	EOperation getJSONLoader__LoadJSON__JSONObject();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.webtest.hub.TestStatus <em>Test Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Status</em>'.
	 * @see org.nasdanika.webtest.hub.TestStatus
	 * @generated
	 */
	EEnum getTestStatus();

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
		 * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_SESSION__RESULTS = eINSTANCE.getTestSession_Results();

		/**
		 * The meta object literal for the '<em><b>Published</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_SESSION__PUBLISHED = eINSTANCE.getTestSession_Published();

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
		 * The meta object literal for the '{@link org.nasdanika.webtest.hub.impl.OperationResultImpl <em>Operation Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.webtest.hub.impl.OperationResultImpl
		 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getOperationResult()
		 * @generated
		 */
		EClass OPERATION_RESULT = eINSTANCE.getOperationResult();

		/**
		 * The meta object literal for the '<em><b>Screenshots</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link org.nasdanika.webtest.hub.JSONLoader <em>JSON Loader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.webtest.hub.JSONLoader
		 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getJSONLoader()
		 * @generated
		 */
		EClass JSON_LOADER = eINSTANCE.getJSONLoader();

		/**
		 * The meta object literal for the '<em><b>Load JSON</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation JSON_LOADER___LOAD_JSON__JSONOBJECT = eINSTANCE.getJSONLoader__LoadJSON__JSONObject();

		/**
		 * The meta object literal for the '{@link org.nasdanika.webtest.hub.TestStatus <em>Test Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.webtest.hub.TestStatus
		 * @see org.nasdanika.webtest.hub.impl.HubPackageImpl#getTestStatus()
		 * @generated
		 */
		EEnum TEST_STATUS = eINSTANCE.getTestStatus();

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
