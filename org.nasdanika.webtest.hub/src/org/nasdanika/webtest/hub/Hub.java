/**
 */
package org.nasdanika.webtest.hub;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.cdo.security.Group;
import org.nasdanika.cdo.security.LoginPasswordProtectionDomain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hub</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.Hub#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.Hub#getGuest <em>Guest</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.Hub#getUsers <em>Users</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.Hub#getAdministrators <em>Administrators</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.Hub#getSlideWidth <em>Slide Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.webtest.hub.HubPackage#getHub()
 * @model superTypes="org.nasdanika.cdo.security.LoginPasswordProtectionDomain org.nasdanika.webtest.hub.ApplicationOwner org.nasdanika.webtest.hub.BreadcrumbsProvider"
 * @generated
 */
public interface Hub extends LoginPasswordProtectionDomain, ApplicationOwner, BreadcrumbsProvider {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Web Test Hub"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.webtest.hub.HubPackage#getHub_Name()
	 * @model default="Web Test Hub"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.Hub#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Guest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guest</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guest</em>' containment reference.
	 * @see #setGuest(Guest)
	 * @see org.nasdanika.webtest.hub.HubPackage#getHub_Guest()
	 * @model containment="true"
	 * @generated
	 */
	Guest getGuest();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.Hub#getGuest <em>Guest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guest</em>' containment reference.
	 * @see #getGuest()
	 * @generated
	 */
	void setGuest(Guest value);

	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.webtest.hub.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see org.nasdanika.webtest.hub.HubPackage#getHub_Users()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUsers();

	/**
	 * Returns the value of the '<em><b>Administrators</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Administrators</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Administrators</em>' containment reference.
	 * @see #setAdministrators(Group)
	 * @see org.nasdanika.webtest.hub.HubPackage#getHub_Administrators()
	 * @model containment="true"
	 * @generated
	 */
	Group getAdministrators();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.Hub#getAdministrators <em>Administrators</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Administrators</em>' containment reference.
	 * @see #getAdministrators()
	 * @generated
	 */
	void setAdministrators(Group value);

	/**
	 * Returns the value of the '<em><b>Slide Width</b></em>' attribute.
	 * The default value is <code>"800"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slide Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slide Width</em>' attribute.
	 * @see #setSlideWidth(int)
	 * @see org.nasdanika.webtest.hub.HubPackage#getHub_SlideWidth()
	 * @model default="800"
	 * @generated
	 */
	int getSlideWidth();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.Hub#getSlideWidth <em>Slide Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slide Width</em>' attribute.
	 * @see #getSlideWidth()
	 * @generated
	 */
	void setSlideWidth(int value);

} // Hub
