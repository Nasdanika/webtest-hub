/**
 */
package org.nasdanika.webtest.hub;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.PageResult#getResults <em>Results</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.PageResult#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.PageResult#getCoverage <em>Coverage</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.webtest.hub.HubPackage#getPageResult()
 * @model
 * @generated
 */
public interface PageResult extends Descriptor {
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
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see org.nasdanika.webtest.hub.HubPackage#getPageResult_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.PageResult#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.Integer},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coverage</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coverage</em>' map.
	 * @see org.nasdanika.webtest.hub.HubPackage#getPageResult_Coverage()
	 * @model mapType="org.nasdanika.webtest.hub.CoverageEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EIntegerObject>"
	 * @generated
	 */
	EMap<String, Integer> getCoverage();

} // PageResult
