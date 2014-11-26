/**
 */
package org.nasdanika.webtest.hub;

import org.eclipse.emf.cdo.CDOObject;

import org.json.JSONObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JSON Loader</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.nasdanika.webtest.hub.HubPackage#getJSONLoader()
 * @model interface="true" abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface JSONLoader extends CDOObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.nasdanika.webtest.hub.Exception" jsonDataType="org.nasdanika.webtest.hub.JSONObject"
	 * @generated
	 */
	void loadJSON(JSONObject json) throws Exception;

} // JSONLoader
