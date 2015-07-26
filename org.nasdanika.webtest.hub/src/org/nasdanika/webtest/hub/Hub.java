/**
 */
package org.nasdanika.webtest.hub;

import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.nasdanika.cdo.CDOViewContext;
import org.nasdanika.cdo.security.Group;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.security.LoginPasswordProtectionDomain;
import org.nasdanika.cdo.web.SessionWebSocketServlet.WebSocketContext;
import org.nasdanika.web.HttpServletRequestContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hub</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Hub is the root of the object model.
 * 
 * Image wiki link for testing [[image:https://github.com/Nasdanika/server/wiki/webtest-hub-update-user-dialog.png|User dialog.]]. Some content.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.Hub#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.Hub#getGuest <em>Guest</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.Hub#getUsers <em>Users</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.Hub#getAdministrators <em>Administrators</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.Hub#getSlideWidth <em>Slide Width</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.Hub#getEveryone <em>Everyone</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.webtest.hub.HubPackage#getHub()
 * @model superTypes="org.nasdanika.cdo.security.LoginPasswordProtectionDomain org.nasdanika.webtest.hub.ApplicationOwner org.nasdanika.webtest.hub.BreadcrumbsProvider"
 *        annotation="org.nasdanika.cdo.security:permissions story/landing='extension/js\r\nread/home\r\nread/summary\r\nread/applications\r\nread/applications/getSummaryRow\r\nextension/applications/js'"
 * @generated
 */
public interface Hub extends LoginPasswordProtectionDomain, ApplicationOwner, BreadcrumbsProvider {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Web Test Hub"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attribute doc
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.webtest.hub.HubPackage#getHub_Name()
	 * @model default="Web Test Hub"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.Hub#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Guest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guest</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guest</em>' containment reference.
	 * @see #setGuest(Guest)
	 * @see org.nasdanika.webtest.hub.HubPackage#getHub_Guest()
	 * @model containment="true"
	 * @generated
	 */
	Guest getGuest();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.Hub#getGuest <em>Guest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guest</em>' containment reference.
	 * @see #getGuest()
	 * @generated
	 */
	void setGuest(Guest value);

	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.webtest.hub.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see org.nasdanika.webtest.hub.HubPackage#getHub_Users()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUsers();

	/**
	 * Returns the value of the '<em><b>Administrators</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Administrators</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Administrators</em>' containment reference.
	 * @see #setAdministrators(Group)
	 * @see org.nasdanika.webtest.hub.HubPackage#getHub_Administrators()
	 * @model containment="true"
	 * @generated
	 */
	Group getAdministrators();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.Hub#getAdministrators <em>Administrators</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Administrators</em>' containment reference.
	 * @see #getAdministrators()
	 * @generated
	 */
	void setAdministrators(Group value);

	/**
	 * Returns the value of the '<em><b>Slide Width</b></em>' attribute.
	 * The default value is <code>"800"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slide Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slide Width</em>' attribute.
	 * @see #setSlideWidth(int)
	 * @see org.nasdanika.webtest.hub.HubPackage#getHub_SlideWidth()
	 * @model default="800"
	 * @generated
	 */
	int getSlideWidth();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.Hub#getSlideWidth <em>Slide Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slide Width</em>' attribute.
	 * @see #getSlideWidth()
	 * @generated
	 */
	void setSlideWidth(int value);

	/**
	 * Returns the value of the '<em><b>Everyone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Everyone</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Everyone</em>' containment reference.
	 * @see #setEveryone(Group)
	 * @see org.nasdanika.webtest.hub.HubPackage#getHub_Everyone()
	 * @model containment="true"
	 * @generated
	 */
	Group getEveryone();

	/**
	 * Sets the value of the '{@link org.nasdanika.webtest.hub.Hub#getEveryone <em>Everyone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Everyone</em>' containment reference.
	 * @see #getEveryone()
	 * @generated
	 */
	void setEveryone(Group value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Operation documentation
	 * @param context 
	 * @param script Parameter documentation
	 * <!-- end-model-doc -->
	 * @model exceptions="org.nasdanika.webtest.performance.Exception" contextDataType="org.nasdanika.webtest.hub.WebSocketContext<org.nasdanika.cdo.security.LoginPasswordCredentials>"
	 * @generated
	 */
	Map<String, Object> executeScript(WebSocketContext<LoginPasswordCredentials> context, String script) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.nasdanika.webtest.performance.Exception"
	 * @generated
	 */
	EList<Map<String, Object>> userList() throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.nasdanika.webtest.performance.Exception"
	 * @generated
	 */
	EList<Map<String, Object>> deleteUser(String login) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.nasdanika.webtest.performance.Exception" userIDAnnotation="org.nasdanika.cdo.web.html.form-control private='true'" loginAnnotation="org.nasdanika.cdo.web.html.form-control required='true' attribute:ng-disabled='userModel.data.userID' validator='if (!this.data.userID) {\r\n\tfor (k in $scope.userList) {\r\n\t\tif (value===$scope.userList[k].login) {\r\n\t\t\treturn \"Duplicate login\";\r\n\t\t}\r\n\t}\r\n}'" adminAnnotation="org.nasdanika.cdo.web.html.form-control inline='true'" disabledAnnotation="org.nasdanika.cdo.web.html.form-control inline='true'" authenticationAnnotation="org.nasdanika.cdo.web.html.form-control default='PASSWORD'" passwordAnnotation="org.nasdanika.cdo.web.html.form-control input-type='password' group-attribute:ng-hide='userModel.data.authentication === \'NTLM\'' attribute:ng-required='userModel.data.authentication === \'PASSWORD\' && !userModel.data.userID'" passwordConfirmationAnnotation="org.nasdanika.cdo.web.html.form-control input-type='password' group-attribute:ng-hide='userModel.data.authentication === \'NTLM\'' attribute:ng-required='userModel.data.authentication === \'PASSWORD\' && !userModel.data.userID' validator='if (this.data.authentication === \'PASSWORD\' && value!==this.data.password) { return \'Passwords do not match\'; }'"
	 *        passwordConfirmationAnnotation="org.nasdanika.cdo.validator server='if (data.authentication.name() === \'PASSWORD\' && data.password!=value) {\r\n\treturn \"Passwords do not match\";\r\n}'"
	 * @generated
	 */
	EList<Map<String, Object>> createOrUpdateUser(String userID, String login, String name, boolean admin, boolean disabled, AuthenticationMode authentication, String password, String passwordConfirmation) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.nasdanika.webtest.performance.Exception" viewContextDataType="org.nasdanika.webtest.hub.CDOViewContext<?, ?>" requestContextDataType="org.nasdanika.webtest.hub.HttpServletRequestContext"
	 * @generated
	 */
	void home(CDOViewContext<?, ?> viewContext, HttpServletRequestContext requestContext) throws Exception;

} // Hub
