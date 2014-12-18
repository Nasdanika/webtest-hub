/**
 */
package org.nasdanika.webtest.hub.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.HTMLFactory.Glyphicon;
import org.nasdanika.webtest.hub.ActorMethodResult;
import org.nasdanika.webtest.hub.ActorResult;
import org.nasdanika.webtest.hub.HubPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor Method Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.impl.ActorMethodResultImpl#getActorResult <em>Actor Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActorMethodResultImpl extends MethodResultImpl implements ActorMethodResult {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorMethodResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HubPackage.Literals.ACTOR_METHOD_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorResult getActorResult() {
		return (ActorResult)eGet(HubPackage.Literals.ACTOR_METHOD_RESULT__ACTOR_RESULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActorResult(ActorResult newActorResult) {
		eSet(HubPackage.Literals.ACTOR_METHOD_RESULT__ACTOR_RESULT, newActorResult);
	}

	@Override
	public Object getIcon(HTMLFactory htmlFactory) throws Exception {
		return htmlFactory.glyphicon(Glyphicon.user);
	}

} //ActorMethodResultImpl
