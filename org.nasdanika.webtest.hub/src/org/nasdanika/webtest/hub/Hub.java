/**
 */
package org.nasdanika.webtest.hub;

import org.eclipse.emf.common.util.EList;

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
 * </ul>
 * </p>
 *
 * @see org.nasdanika.webtest.hub.HubPackage#getHub()
 * @model
 * @generated
 */
public interface Hub extends LoginPasswordProtectionDomain, ApplicationOwner {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.webtest.hub.HubPackage#getHub_Name()
	 * @model
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

} // Hub
