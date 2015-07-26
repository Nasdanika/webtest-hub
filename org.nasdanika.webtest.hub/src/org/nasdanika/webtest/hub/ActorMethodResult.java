/**
 */
package org.nasdanika.webtest.hub;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor Method Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.ActorMethodResult#getActorResult <em>Actor Result</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.webtest.hub.HubPackage#getActorMethodResult()
 * @model
 * @generated
 */
public interface ActorMethodResult extends MethodResult {

	/**
	 * Returns the value of the '<em><b>Actor Result</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.webtest.hub.ActorResult#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor Result</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor Result</em>' reference.
	 * @see #setActorResult(ActorResult)
	 * @see org.nasdanika.webtest.hub.HubPackage#getActorMethodResult_ActorResult()
	 * @see org.nasdanika.webtest.hub.ActorResult#getResults
	 * @model opposite="results"
	 * @generated
	 */
	ActorResult getActorResult();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.ActorMethodResult#getActorResult <em>Actor Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor Result</em>' reference.
	 * @see #getActorResult()
	 * @generated
	 */
	void setActorResult(ActorResult value);
} // ActorMethodResult
