/**
 */
package org.nasdanika.webtest.hub;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Screenshot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.Screenshot#getContent <em>Content</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.Screenshot#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.Screenshot#getHeight <em>Height</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.Screenshot#getWidth <em>Width</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.Screenshot#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.Screenshot#getLength <em>Length</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.Screenshot#getDigest <em>Digest</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.Screenshot#getBeforeOperations <em>Before Operations</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.Screenshot#getAfterOperations <em>After Operations</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.webtest.hub.HubPackage#getScreenshot()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Screenshot extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(byte[])
	 * @see org.nasdanika.webtest.hub.HubPackage#getScreenshot_Content()
	 * @model
	 * @generated
	 */
	byte[] getContent();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.Screenshot#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(byte[] value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(long)
	 * @see org.nasdanika.webtest.hub.HubPackage#getScreenshot_Timestamp()
	 * @model annotation="org.nasdanika.cdo.web.html.form-control input-type='' label='ts' required='rq' private='prvt' default='dflt' placeholder='plhldr' help-text='hlptxt' inline='inl' control-id='ctrlid' validator='if (x) { something }'"
	 * @generated
	 */
	long getTimestamp();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.Screenshot#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(long value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see org.nasdanika.webtest.hub.HubPackage#getScreenshot_Height()
	 * @model
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.Screenshot#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see org.nasdanika.webtest.hub.HubPackage#getScreenshot_Width()
	 * @model
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.Screenshot#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' attribute.
	 * @see #setContentType(String)
	 * @see org.nasdanika.webtest.hub.HubPackage#getScreenshot_ContentType()
	 * @model
	 * @generated
	 */
	String getContentType();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.Screenshot#getContentType <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' attribute.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(String value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see org.nasdanika.webtest.hub.HubPackage#getScreenshot_Length()
	 * @model
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.Screenshot#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

	/**
	 * Returns the value of the '<em><b>Digest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Digest</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Digest</em>' attribute.
	 * @see #setDigest(byte[])
	 * @see org.nasdanika.webtest.hub.HubPackage#getScreenshot_Digest()
	 * @model
	 * @generated
	 */
	byte[] getDigest();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.Screenshot#getDigest <em>Digest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Digest</em>' attribute.
	 * @see #getDigest()
	 * @generated
	 */
	void setDigest(byte[] value);

	/**
	 * Returns the value of the '<em><b>Before Operations</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.webtest.hub.OperationResult}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.webtest.hub.OperationResult#getBeforeScreenshot <em>Before Screenshot</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Before Operations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Operations</em>' reference list.
	 * @see org.nasdanika.webtest.hub.HubPackage#getScreenshot_BeforeOperations()
	 * @see org.nasdanika.webtest.hub.OperationResult#getBeforeScreenshot
	 * @model opposite="beforeScreenshot"
	 * @generated
	 */
	EList<OperationResult> getBeforeOperations();

	/**
	 * Returns the value of the '<em><b>After Operations</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.webtest.hub.OperationResult}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.webtest.hub.OperationResult#getAfterScreenshot <em>After Screenshot</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After Operations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After Operations</em>' reference list.
	 * @see org.nasdanika.webtest.hub.HubPackage#getScreenshot_AfterOperations()
	 * @see org.nasdanika.webtest.hub.OperationResult#getAfterScreenshot
	 * @model opposite="afterScreenshot"
	 * @generated
	 */
	EList<OperationResult> getAfterOperations();

} // Screenshot
