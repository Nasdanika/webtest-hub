/**
 */
package org.nasdanika.webtest.hub;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;
import org.json.JSONObject;
import org.nasdanika.html.Table.Row;
import org.nasdanika.web.HttpContext;

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
 *   <li>{@link org.nasdanika.webtest.hub.Application#getScreenshots <em>Screenshots</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.Application#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.Application#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.webtest.hub.HubPackage#getApplication()
 * @model superTypes="org.nasdanika.webtest.hub.BreadcrumbsProvider"
 * @extends CDOObject
 * @generated
 */
public interface Application extends CDOObject, BreadcrumbsProvider {
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

	/**
	 * Returns the value of the '<em><b>Screenshots</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.webtest.hub.Screenshot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Screenshots</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screenshots</em>' containment reference list.
	 * @see org.nasdanika.webtest.hub.HubPackage#getApplication_Screenshots()
	 * @model containment="true"
	 * @generated
	 */
	EList<Screenshot> getScreenshots();

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
	 * @see org.nasdanika.webtest.hub.HubPackage#getApplication_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.Application#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.webtest.hub.HubPackage#getApplication_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.Application#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.nasdanika.webtest.performance.JSONObject" exceptions="org.nasdanika.webtest.hub.Exception" contextDataType="org.nasdanika.webtest.hub.HttpContext"
	 * @generated
	 */
	JSONObject getSummaryRow(HttpContext context) throws Exception;

	//void summaryRow(HttpContext context, Row row) throws Exception;
	

} // Application
