/**
 */
package org.nasdanika.webtest.hub;

import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.security.User;
import org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext;
import org.nasdanika.cdo.web.SessionWebSocketServlet.WebSocketContext;
import org.nasdanika.web.HttpServletRequestContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guest</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.nasdanika.webtest.hub.HubPackage#getGuest()
 * @model annotation="org.nasdanika.cdo.security:permissions story/registration='GET/registrationForm\r\ninvoke/register\r\nextension/js'"
 * @generated
 */
public interface Guest extends User, ApplicationRenderer {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.nasdanika.webtest.performance.Exception" contextDataType="org.nasdanika.webtest.hub.CDOTransactionHttpServletRequestContext<org.nasdanika.cdo.security.LoginPasswordCredentials>"
	 * @generated
	 */
	Object registrationForm(CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.nasdanika.webtest.performance.Exception" contextDataType="org.nasdanika.webtest.hub.HttpServletRequestContext"
	 * @generated
	 */
	Object home(HttpServletRequestContext context) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param eMail email
	 * <!-- end-model-doc -->
	 * @model exceptions="org.nasdanika.webtest.performance.Exception" contextDataType="org.nasdanika.webtest.hub.WebSocketContext<org.nasdanika.cdo.security.LoginPasswordCredentials>" loginAnnotation="org.nasdanika.cdo.web.html.form-control required='true'" nameAnnotation="org.nasdanika.cdo.web.html.form-control label='Real name'" eMailAnnotation="org.nasdanika.cdo.web.html.form-control input-type='email' label='E-Mail'" passwordAnnotation="org.nasdanika.cdo.web.html.form-control input-type='password' required='true'" passwordConfirmationAnnotation="org.nasdanika.cdo.web.html.form-control input-type='password' validator='if (value!==this.data.password) { return \'Passwords do not match\'; }' required='true'"
	 *        passwordConfirmationAnnotation="org.nasdanika.cdo.validator server='if (data.password!=value) {\r\n\treturn \"Passwords do not match\";\r\n}'"
	 * @generated
	 */
	Object register(WebSocketContext<LoginPasswordCredentials> context, String login, String name, String eMail, String password, String passwordConfirmation) throws Exception;
} // Guest
