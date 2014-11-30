/**
 */
package org.nasdanika.webtest.hub.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.json.JSONArray;
import org.json.JSONObject;
import org.nasdanika.core.ConverterContext;
import org.nasdanika.webtest.hub.HubFactory;
import org.nasdanika.webtest.hub.HubPackage;
import org.nasdanika.webtest.hub.StackTraceEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Throwable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.impl.ThrowableImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.ThrowableImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.ThrowableImpl#getStackTrace <em>Stack Trace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThrowableImpl extends CDOObjectImpl implements org.nasdanika.webtest.hub.Throwable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThrowableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HubPackage.Literals.THROWABLE;
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
	public String getType() {
		return (String)eGet(HubPackage.Literals.THROWABLE__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		eSet(HubPackage.Literals.THROWABLE__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessage() {
		return (String)eGet(HubPackage.Literals.THROWABLE__MESSAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(String newMessage) {
		eSet(HubPackage.Literals.THROWABLE__MESSAGE, newMessage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<StackTraceEntry> getStackTrace() {
		return (EList<StackTraceEntry>)eGet(HubPackage.Literals.THROWABLE__STACK_TRACE, true);
	}

	@Override
	public void loadJSON(JSONObject json, ConverterContext context)	throws Exception {
		setType(json.getString("type"));
		if (json.has("message")) {
			setMessage(json.getString("message"));
		}
		if (json.has("stackTrace")) {
			JSONArray stackTrace = json.getJSONArray("stackTrace");
			for (int i=0; i<stackTrace.length(); ++i) {
				StackTraceEntry ste = HubFactory.eINSTANCE.createStackTraceEntry();
				getStackTrace().add(ste);
				ste.loadJSON(stackTrace.getJSONObject(i), context);
			}
		}
		
	}
} //ThrowableImpl
