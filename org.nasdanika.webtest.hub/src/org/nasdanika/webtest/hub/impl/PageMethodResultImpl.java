/**
 */
package org.nasdanika.webtest.hub.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.FontAwesome.WebApplication;
import org.nasdanika.html.HTMLFactory.Glyphicon;
import org.nasdanika.webtest.hub.HubPackage;
import org.nasdanika.webtest.hub.PageMethodResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Method Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PageMethodResultImpl extends MethodResultImpl implements PageMethodResult {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageMethodResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HubPackage.Literals.PAGE_METHOD_RESULT;
	}

	@Override
	public Object getIcon(HTMLFactory htmlFactory) throws Exception {
		return htmlFactory.glyphicon(Glyphicon.list_alt);
	}

} //PageMethodResultImpl
