/**
 */
package org.nasdanika.webtest.hub;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.html.HTMLFactory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.TestResult#getPageResults <em>Page Results</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.TestResult#getActorResults <em>Actor Results</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.webtest.hub.HubPackage#getTestResult()
 * @model superTypes="org.nasdanika.webtest.hub.Descriptor org.nasdanika.webtest.hub.BreadcrumbsProvider"
 * @generated
 */
public interface TestResult extends Descriptor, BreadcrumbsProvider {

	/**
	 * Returns the value of the '<em><b>Page Results</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.webtest.hub.PageResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Results</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Results</em>' containment reference list.
	 * @see org.nasdanika.webtest.hub.HubPackage#getTestResult_PageResults()
	 * @model containment="true"
	 * @generated
	 */
	EList<PageResult> getPageResults();

	/**
	 * Returns the value of the '<em><b>Actor Results</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.webtest.hub.ActorResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor Results</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor Results</em>' containment reference list.
	 * @see org.nasdanika.webtest.hub.HubPackage#getTestResult_ActorResults()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActorResult> getActorResults();

	Object getIcon(HTMLFactory htmlFactory);
	
} // TestResult
