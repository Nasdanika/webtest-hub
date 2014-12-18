/**
 */
package org.nasdanika.webtest.hub;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.ActorResult#getResults <em>Results</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.ActorResult#getCoverage <em>Coverage</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.webtest.hub.HubPackage#getActorResult()
 * @model
 * @generated
 */
public interface ActorResult extends Descriptor {
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
	 * @see org.nasdanika.webtest.hub.HubPackage#getActorResult_Coverage()
	 * @model mapType="org.nasdanika.webtest.hub.CoverageEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EIntegerObject>"
	 * @generated
	 */
	EMap<String, Integer> getCoverage();

} // ActorResult
