/**
 */
package org.nasdanika.webtest.hub;

import org.eclipse.emf.cdo.CDOObject;
import org.nasdanika.core.JSONLoader;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.Descriptor#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.Descriptor#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.Descriptor#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.webtest.hub.HubPackage#getDescriptor()
 * @model superTypes="org.nasdanika.webtest.hub.JSONLoader"
 * @extends CDOObject
 * @generated
 */
public interface Descriptor extends CDOObject, JSONLoader {
	/**
	 * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Name</em>' attribute.
	 * @see #setQualifiedName(String)
	 * @see org.nasdanika.webtest.hub.HubPackage#getDescriptor_QualifiedName()
	 * @model
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.Descriptor#getQualifiedName <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Name</em>' attribute.
	 * @see #getQualifiedName()
	 * @generated
	 */
	void setQualifiedName(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.nasdanika.webtest.hub.HubPackage#getDescriptor_Title()
	 * @model annotation="org.nasdanika.cdo.web.html.form-control input-type='f' label='lbl'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.Descriptor#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Description)
	 * @see org.nasdanika.webtest.hub.HubPackage#getDescriptor_Description()
	 * @model containment="true"
	 * @generated
	 */
	Description getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.Descriptor#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Description value);

} // Descriptor
