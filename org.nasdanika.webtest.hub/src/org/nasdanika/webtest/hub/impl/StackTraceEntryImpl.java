/**
 */
package org.nasdanika.webtest.hub.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.json.JSONObject;
import org.nasdanika.core.Context;
import org.nasdanika.webtest.hub.HubPackage;
import org.nasdanika.webtest.hub.StackTraceEntry;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stack Trace Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.impl.StackTraceEntryImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.StackTraceEntryImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.StackTraceEntryImpl#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.StackTraceEntryImpl#getLineNumber <em>Line Number</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.StackTraceEntryImpl#isNative <em>Native</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StackTraceEntryImpl extends CDOObjectImpl implements StackTraceEntry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StackTraceEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HubPackage.Literals.STACK_TRACE_ENTRY;
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
	public String getClassName() {
		return (String)eGet(HubPackage.Literals.STACK_TRACE_ENTRY__CLASS_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassName(String newClassName) {
		eSet(HubPackage.Literals.STACK_TRACE_ENTRY__CLASS_NAME, newClassName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileName() {
		return (String)eGet(HubPackage.Literals.STACK_TRACE_ENTRY__FILE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileName(String newFileName) {
		eSet(HubPackage.Literals.STACK_TRACE_ENTRY__FILE_NAME, newFileName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethodName() {
		return (String)eGet(HubPackage.Literals.STACK_TRACE_ENTRY__METHOD_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodName(String newMethodName) {
		eSet(HubPackage.Literals.STACK_TRACE_ENTRY__METHOD_NAME, newMethodName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLineNumber() {
		return (Integer)eGet(HubPackage.Literals.STACK_TRACE_ENTRY__LINE_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineNumber(int newLineNumber) {
		eSet(HubPackage.Literals.STACK_TRACE_ENTRY__LINE_NUMBER, newLineNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNative() {
		return (Boolean)eGet(HubPackage.Literals.STACK_TRACE_ENTRY__NATIVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNative(boolean newNative) {
		eSet(HubPackage.Literals.STACK_TRACE_ENTRY__NATIVE, newNative);
	}
	
	@Override
	public void loadJSON(JSONObject json, Context context)	throws Exception {
		if (json.has("className")) {
			setClassName(json.getString("className"));
		}
		if (json.has("fileName")) {
			setFileName(json.getString("fileName"));
		}
		if (json.has("lineNumber")) {
			setLineNumber(json.getInt("lineNumber"));
		}
		if (json.has("methodName")) {
			setMethodName(json.getString("methodName"));
		}
		if (json.has("native")) {
			setNative(json.getBoolean("native"));
		}		
	}

} //StackTraceEntryImpl
