/**
 */
package org.nasdanika.webtest.hub;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.Application#getTestSessions <em>Test Sessions</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.Application#getSecurityToken <em>Security Token</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.webtest.hub.HubPackage#getApplication()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Application extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Test Sessions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.webtest.hub.TestSession}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Sessions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Sessions</em>' containment reference list.
	 * @see org.nasdanika.webtest.hub.HubPackage#getApplication_TestSessions()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestSession> getTestSessions();

	/**
	 * Returns the value of the '<em><b>Security Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Token</em>' attribute.
	 * @see #setSecurityToken(String)
	 * @see org.nasdanika.webtest.hub.HubPackage#getApplication_SecurityToken()
	 * @model
	 * @generated
	 */
	String getSecurityToken();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.Application#getSecurityToken <em>Security Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Token</em>' attribute.
	 * @see #getSecurityToken()
	 * @generated
	 */
	void setSecurityToken(String value);
	

} // Application
