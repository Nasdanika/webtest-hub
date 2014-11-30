/**
 */
package org.nasdanika.webtest.hub;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Class Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.TestClassResult#getMethodResults <em>Method Results</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.TestClassResult#getStats <em>Stats</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.webtest.hub.HubPackage#getTestClassResult()
 * @model
 * @generated
 */
public interface TestClassResult extends TestResult {

	/**
	 * Returns the value of the '<em><b>Method Results</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.webtest.hub.TestMethodResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Results</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Results</em>' containment reference list.
	 * @see org.nasdanika.webtest.hub.HubPackage#getTestClassResult_MethodResults()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestMethodResult> getMethodResults();

	/**
	 * Returns the value of the '<em><b>Stats</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.Integer},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stats</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stats</em>' map.
	 * @see org.nasdanika.webtest.hub.HubPackage#getTestClassResult_Stats()
	 * @model mapType="org.nasdanika.webtest.hub.StatsEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EIntegerObject>"
	 * @generated
	 */
	EMap<String, Integer> getStats();
} // TestClassResult
