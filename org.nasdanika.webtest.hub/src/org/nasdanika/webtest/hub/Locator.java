/**
 */
package org.nasdanika.webtest.hub;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Locator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.Locator#getHow <em>How</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.Locator#getUsing <em>Using</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.webtest.hub.HubPackage#getLocator()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Locator extends CDOObject {
	/**
	 * Returns the value of the '<em><b>How</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>How</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>How</em>' attribute.
	 * @see #setHow(String)
	 * @see org.nasdanika.webtest.hub.HubPackage#getLocator_How()
	 * @model
	 * @generated
	 */
	String getHow();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.Locator#getHow <em>How</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>How</em>' attribute.
	 * @see #getHow()
	 * @generated
	 */
	void setHow(String value);

	/**
	 * Returns the value of the '<em><b>Using</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Using</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Using</em>' attribute.
	 * @see #setUsing(String)
	 * @see org.nasdanika.webtest.hub.HubPackage#getLocator_Using()
	 * @model
	 * @generated
	 */
	String getUsing();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.Locator#getUsing <em>Using</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Using</em>' attribute.
	 * @see #getUsing()
	 * @generated
	 */
	void setUsing(String value);

} // Locator
