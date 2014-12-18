/**
 */
package org.nasdanika.webtest.hub.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.HTMLFactory.Glyphicon;
import org.nasdanika.webtest.hub.HubPackage;
import org.nasdanika.webtest.hub.PageMethodResult;
import org.nasdanika.webtest.hub.PageResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Method Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.impl.PageMethodResultImpl#getPageResult <em>Page Result</em>}</li>
 * </ul>
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageResult getPageResult() {
		return (PageResult)eGet(HubPackage.Literals.PAGE_METHOD_RESULT__PAGE_RESULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageResult(PageResult newPageResult) {
		eSet(HubPackage.Literals.PAGE_METHOD_RESULT__PAGE_RESULT, newPageResult);
	}

	@Override
	public Object getIcon(HTMLFactory htmlFactory) throws Exception {
		return htmlFactory.glyphicon(Glyphicon.list_alt);
	}

} //PageMethodResultImpl
