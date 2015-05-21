/**
 */
package org.nasdanika.webtest.hub;

import org.json.JSONObject;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.security.User;
import org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext;
import org.nasdanika.web.HttpServletRequestContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guest</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.nasdanika.webtest.hub.HubPackage#getGuest()
 * @model annotation="org.nasdanika.cdo.security:permissions story/registration='GET/registrationForm\r\ninvoke/register'"
 * @generated
 */
public interface Guest extends User, ApplicationRenderer {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.nasdanika.webtest.hub.Exception" contextDataType="org.nasdanika.webtest.hub.CDOTransactionHttpServletRequestContext<org.nasdanika.cdo.security.LoginPasswordCredentials>"
	 * @generated
	 */
	Object registrationForm(CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.nasdanika.webtest.hub.Exception" contextDataType="org.nasdanika.webtest.hub.HttpServletRequestContext"
	 * @generated
	 */
	Object home(HttpServletRequestContext context) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.nasdanika.webtest.hub.JSONObject" exceptions="org.nasdanika.webtest.hub.Exception"
	 * @generated
	 */
	JSONObject register(String login, String name, String eMail, String password, String passwordConfirmation) throws Exception;
} // Guest
