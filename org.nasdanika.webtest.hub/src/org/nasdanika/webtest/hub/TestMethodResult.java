/**
 */
package org.nasdanika.webtest.hub;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.webtest.performance.NavigationTiming;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Method Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.TestMethodResult#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.TestMethodResult#getNavigationTiming <em>Navigation Timing</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.webtest.hub.HubPackage#getTestMethodResult()
 * @model
 * @generated
 */
public interface TestMethodResult extends OperationResult {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute list.
	 * @see org.nasdanika.webtest.hub.HubPackage#getTestMethodResult_Parameters()
	 * @model
	 * @generated
	 */
	EList<String> getParameters();

	/**
	 * Returns the value of the '<em><b>Navigation Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigation Timing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigation Timing</em>' containment reference.
	 * @see #setNavigationTiming(NavigationTiming)
	 * @see org.nasdanika.webtest.hub.HubPackage#getTestMethodResult_NavigationTiming()
	 * @model containment="true"
	 * @generated
	 */
	NavigationTiming getNavigationTiming();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.TestMethodResult#getNavigationTiming <em>Navigation Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigation Timing</em>' containment reference.
	 * @see #getNavigationTiming()
	 * @generated
	 */
	void setNavigationTiming(NavigationTiming value);

} // TestMethodResult
