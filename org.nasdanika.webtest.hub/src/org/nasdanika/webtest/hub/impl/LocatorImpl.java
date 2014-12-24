/**
 */
package org.nasdanika.webtest.hub.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.nasdanika.webtest.hub.HubPackage;
import org.nasdanika.webtest.hub.Locator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Locator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.impl.LocatorImpl#getHow <em>How</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.LocatorImpl#getUsing <em>Using</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocatorImpl extends CDOObjectImpl implements Locator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HubPackage.Literals.LOCATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHow() {
		return (String)eGet(HubPackage.Literals.LOCATOR__HOW, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHow(String newHow) {
		eSet(HubPackage.Literals.LOCATOR__HOW, newHow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsing() {
		return (String)eGet(HubPackage.Literals.LOCATOR__USING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsing(String newUsing) {
		eSet(HubPackage.Literals.LOCATOR__USING, newUsing);
	}

} //LocatorImpl
