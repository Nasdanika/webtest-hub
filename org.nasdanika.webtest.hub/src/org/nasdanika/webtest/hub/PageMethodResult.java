/**
 */
package org.nasdanika.webtest.hub;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Method Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.PageMethodResult#getPageResult <em>Page Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.webtest.hub.HubPackage#getPageMethodResult()
 * @model
 * @generated
 */
public interface PageMethodResult extends MethodResult {

	/**
	 * Returns the value of the '<em><b>Page Result</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.webtest.hub.PageResult#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Result</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Result</em>' reference.
	 * @see #setPageResult(PageResult)
	 * @see org.nasdanika.webtest.hub.HubPackage#getPageMethodResult_PageResult()
	 * @see org.nasdanika.webtest.hub.PageResult#getResults
	 * @model opposite="results"
	 * @generated
	 */
	PageResult getPageResult();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.PageMethodResult#getPageResult <em>Page Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Result</em>' reference.
	 * @see #getPageResult()
	 * @generated
	 */
	void setPageResult(PageResult value);
} // PageMethodResult
