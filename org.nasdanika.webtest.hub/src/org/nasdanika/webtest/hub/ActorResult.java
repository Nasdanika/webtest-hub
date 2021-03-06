/**
 */
package org.nasdanika.webtest.hub;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.ActorResult#getResults <em>Results</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.ActorResult#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.ActorResult#isProxy <em>Proxy</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.webtest.hub.HubPackage#getActorResult()
 * @model superTypes="org.nasdanika.webtest.hub.Descriptor org.nasdanika.webtest.hub.BreadcrumbsProvider"
 * @generated
 */
public interface ActorResult extends Descriptor, BreadcrumbsProvider {
	/**
	 * Returns the value of the '<em><b>Results</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.webtest.hub.ActorMethodResult}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.webtest.hub.ActorMethodResult#getActorResult <em>Actor Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Results</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results</em>' reference list.
	 * @see org.nasdanika.webtest.hub.HubPackage#getActorResult_Results()
	 * @see org.nasdanika.webtest.hub.ActorMethodResult#getActorResult
	 * @model opposite="actorResult"
	 * @generated
	 */
	EList<ActorMethodResult> getResults();

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
	 * @see org.nasdanika.webtest.hub.HubPackage#getActorResult_Coverage()
	 * @model containment="true"
	 * @generated
	 */
	EList<Coverage> getCoverage();

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
	 * @see org.nasdanika.webtest.hub.HubPackage#getActorResult_Proxy()
	 * @model
	 * @generated
	 */
	boolean isProxy();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.ActorResult#isProxy <em>Proxy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proxy</em>' attribute.
	 * @see #isProxy()
	 * @generated
	 */
	void setProxy(boolean value);

} // ActorResult
