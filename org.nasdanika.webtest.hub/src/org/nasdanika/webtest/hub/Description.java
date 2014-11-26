/**
 */
package org.nasdanika.webtest.hub;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;
import org.nasdanika.core.JSONLoader;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.Description#getUrl <em>Url</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.Description#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.Description#isHtml <em>Html</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.webtest.hub.HubPackage#getDescription()
 * @model superTypes="org.nasdanika.webtest.hub.JSONLoader"
 * @extends CDOObject
 * @generated
 */
public interface Description extends CDOObject, JSONLoader {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.nasdanika.webtest.hub.HubPackage#getDescription_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.Description#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see org.nasdanika.webtest.hub.HubPackage#getDescription_Value()
	 * @model
	 * @generated
	 */
	EList<String> getValue();

	/**
	 * Returns the value of the '<em><b>Html</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Html</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Html</em>' attribute.
	 * @see #setHtml(boolean)
	 * @see org.nasdanika.webtest.hub.HubPackage#getDescription_Html()
	 * @model
	 * @generated
	 */
	boolean isHtml();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.Description#isHtml <em>Html</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Html</em>' attribute.
	 * @see #isHtml()
	 * @generated
	 */
	void setHtml(boolean value);

} // Description
