/**
 */
package org.nasdanika.webtest.hub;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Session</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.TestSession#getResults <em>Results</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.TestSession#isPublished <em>Published</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.TestSession#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.TestSession#getProgress <em>Progress</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.webtest.hub.HubPackage#getTestSession()
 * @model
 * @generated
 */
public interface TestSession extends Descriptor {
	/**
	 * Returns the value of the '<em><b>Results</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.webtest.hub.TestResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Results</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results</em>' containment reference list.
	 * @see org.nasdanika.webtest.hub.HubPackage#getTestSession_Results()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestResult> getResults();

	/**
	 * Returns the value of the '<em><b>Published</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Published</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Published</em>' attribute.
	 * @see #setPublished(boolean)
	 * @see org.nasdanika.webtest.hub.HubPackage#getTestSession_Published()
	 * @model
	 * @generated
	 */
	boolean isPublished();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.TestSession#isPublished <em>Published</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Published</em>' attribute.
	 * @see #isPublished()
	 * @generated
	 */
	void setPublished(boolean value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see org.nasdanika.webtest.hub.HubPackage#getTestSession_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.TestSession#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Progress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Progress</em>' attribute.
	 * @see #setProgress(int)
	 * @see org.nasdanika.webtest.hub.HubPackage#getTestSession_Progress()
	 * @model
	 * @generated
	 */
	int getProgress();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.TestSession#getProgress <em>Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Progress</em>' attribute.
	 * @see #getProgress()
	 * @generated
	 */
	void setProgress(int value);

} // TestSession
