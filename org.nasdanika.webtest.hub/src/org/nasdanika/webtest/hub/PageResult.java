/**
 */
package org.nasdanika.webtest.hub;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.PageResult#getResults <em>Results</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.PageResult#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.PageResult#getWebElements <em>Web Elements</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.PageResult#isProxy <em>Proxy</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.webtest.hub.HubPackage#getPageResult()
 * @model superTypes="org.nasdanika.webtest.hub.Descriptor org.nasdanika.webtest.hub.BreadcrumbsProvider"
 * @generated
 */
public interface PageResult extends Descriptor, BreadcrumbsProvider {
	/**
	 * Returns the value of the '<em><b>Results</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.webtest.hub.PageMethodResult}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.webtest.hub.PageMethodResult#getPageResult <em>Page Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Results</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results</em>' reference list.
	 * @see org.nasdanika.webtest.hub.HubPackage#getPageResult_Results()
	 * @see org.nasdanika.webtest.hub.PageMethodResult#getPageResult
	 * @model opposite="pageResult"
	 * @generated
	 */
	EList<PageMethodResult> getResults();

	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.webtest.hub.Coverage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coverage</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coverage</em>' containment reference list.
	 * @see org.nasdanika.webtest.hub.HubPackage#getPageResult_Coverage()
	 * @model containment="true"
	 * @generated
	 */
	EList<Coverage> getCoverage();

	/**
	 * Returns the value of the '<em><b>Web Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.webtest.hub.WebElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Web Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Elements</em>' containment reference list.
	 * @see org.nasdanika.webtest.hub.HubPackage#getPageResult_WebElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<WebElement> getWebElements();

	/**
	 * Returns the value of the '<em><b>Proxy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proxy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proxy</em>' attribute.
	 * @see #setProxy(boolean)
	 * @see org.nasdanika.webtest.hub.HubPackage#getPageResult_Proxy()
	 * @model
	 * @generated
	 */
	boolean isProxy();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.PageResult#isProxy <em>Proxy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy</em>' attribute.
	 * @see #isProxy()
	 * @generated
	 */
	void setProxy(boolean value);

} // PageResult
