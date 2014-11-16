/**
 */
package org.nasdanika.webtest.hub;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB__NAME = SecurityPackage.LOGIN_PASSWORD_PROTECTION_DOMAIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Guest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB__GUEST = SecurityPackage.LOGIN_PASSWORD_PROTECTION_DOMAIN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB__USERS = SecurityPackage.LOGIN_PASSWORD_PROTECTION_DOMAIN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Hub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HUB_FEATURE_COUNT = SecurityPackage.LOGIN_PASSWORD_PROTECTION_DOMAIN_FEATURE_COUNT + 3;

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
	 * The number of structural features of the '<em>Application Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OWNER_FEATURE_COUNT = 0;

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

	}

} //HubPackage
