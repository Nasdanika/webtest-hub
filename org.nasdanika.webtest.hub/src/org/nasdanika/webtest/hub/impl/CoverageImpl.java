/**
 */
package org.nasdanika.webtest.hub.impl;

import org.eclipse.emf.ecore.EClass;
import org.json.JSONObject;
import org.nasdanika.core.Context;
import org.nasdanika.webtest.hub.Coverage;
import org.nasdanika.webtest.hub.HubPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coverage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.impl.CoverageImpl#getInvocations <em>Invocations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoverageImpl extends DescriptorImpl implements Coverage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HubPackage.Literals.COVERAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInvocations() {
		return (Integer)eGet(HubPackage.Literals.COVERAGE__INVOCATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvocations(int newInvocations) {
		eSet(HubPackage.Literals.COVERAGE__INVOCATIONS, newInvocations);
	}

	@Override
	public void loadJSON(JSONObject json, Context context)	throws Exception {
		super.loadJSON(json, context);
		setInvocations(json.getInt("invocations"));
	}

} //CoverageImpl
