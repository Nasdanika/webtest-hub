/**
 */
package org.nasdanika.webtest.hub.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.html.FontAwesome.WebApplication;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.webtest.hub.HubPackage;
import org.nasdanika.webtest.hub.InitializationResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initialization Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class InitializationResultImpl extends PageMethodResultImpl implements InitializationResult {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitializationResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HubPackage.Literals.INITIALIZATION_RESULT;
	}
	
	@Override
	public Object getIcon(HTMLFactory htmlFactory) throws Exception {
		return htmlFactory.fontAwesome().webApplication(WebApplication.bolt);
	}

} //InitializationResultImpl
