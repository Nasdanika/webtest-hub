/**
 */
package org.nasdanika.webtest.hub.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.json.JSONObject;
import org.nasdanika.webtest.hub.Description;
import org.nasdanika.webtest.hub.Descriptor;
import org.nasdanika.webtest.hub.HubFactory;
import org.nasdanika.webtest.hub.HubPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.impl.DescriptorImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.DescriptorImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.DescriptorImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DescriptorImpl extends CDOObjectImpl implements Descriptor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HubPackage.Literals.DESCRIPTOR;
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
	public String getQualifiedName() {
		return (String)eGet(HubPackage.Literals.DESCRIPTOR__QUALIFIED_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifiedName(String newQualifiedName) {
		eSet(HubPackage.Literals.DESCRIPTOR__QUALIFIED_NAME, newQualifiedName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return (String)eGet(HubPackage.Literals.DESCRIPTOR__TITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		eSet(HubPackage.Literals.DESCRIPTOR__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description getDescription() {
		return (Description)eGet(HubPackage.Literals.DESCRIPTOR__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Description newDescription) {
		eSet(HubPackage.Literals.DESCRIPTOR__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void loadJSON(JSONObject json) throws Exception {
		if (json.has("qualifiedName")) { 
			setQualifiedName(json.getString("qualifiedName"));
		}
		if (json.has("title")) {
			setTitle(json.getString("title"));
		}
		if (json.has("description")) {
			Description d = HubFactory.eINSTANCE.createDescription();
			d.loadJSON(json.getJSONObject("description"));
			setDescription(d);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HubPackage.DESCRIPTOR___LOAD_JSON__JSONOBJECT:
				try {
					loadJSON((JSONObject)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

} //DescriptorImpl
