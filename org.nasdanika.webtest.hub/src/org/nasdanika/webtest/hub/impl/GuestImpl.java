/**
 */
package org.nasdanika.webtest.hub.impl;

import java.io.BufferedReader;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringEscapeUtils;
import org.eclipse.emf.cdo.CDOLock;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.nasdanika.cdo.CDOViewContext;
import org.nasdanika.cdo.security.AuthorizationHelper;
import org.nasdanika.cdo.security.Group;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.security.LoginPasswordHashUser;
import org.nasdanika.cdo.security.Permission;
import org.nasdanika.cdo.security.Principal;
import org.nasdanika.cdo.security.ProtectionDomain;
import org.nasdanika.cdo.security.SecurityFactory;
import org.nasdanika.cdo.security.SecurityPackage;
import org.nasdanika.cdo.security.SecurityPolicy;
import org.nasdanika.cdo.security.User;
import org.nasdanika.core.AuthorizationProvider.AccessDecision;
import org.nasdanika.core.Context;
import org.nasdanika.html.ApplicationPanel;
import org.nasdanika.html.ApplicationPanel.ContentPanel;
import org.nasdanika.html.Button.Type;
import org.nasdanika.html.FontAwesome.Rotate;
import org.nasdanika.html.FontAwesome.Spinner;
import org.nasdanika.html.FontAwesome.WebApplication;
import org.nasdanika.html.Form;
import org.nasdanika.html.Form.Method;
import org.nasdanika.html.FormInputGroup;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.HTMLFactory.Glyphicon;
import org.nasdanika.html.HTMLFactory.InputType;
import org.nasdanika.html.Input;
import org.nasdanika.html.Modal;
import org.nasdanika.html.Navbar;
import org.nasdanika.html.Tag;
import org.nasdanika.html.Tag.TagName;
import org.nasdanika.html.Theme;
import org.nasdanika.html.UIElement.Event;
import org.nasdanika.html.UIElement.Style;
import org.nasdanika.web.Action;
import org.nasdanika.web.HttpContext;
import org.nasdanika.web.RequestMethod;
import org.nasdanika.web.RouteMethod;
import org.nasdanika.webtest.hub.Guest;
import org.nasdanika.webtest.hub.Hub;
import org.nasdanika.webtest.hub.HubFactory;
import org.nasdanika.webtest.hub.HubPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.impl.GuestImpl#getMemberOf <em>Member Of</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.GuestImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.GuestImpl#getProtectionDomain <em>Protection Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuestImpl extends CDOObjectImpl implements Guest {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HubPackage.Literals.GUEST;
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
	@SuppressWarnings("unchecked")
	public EList<Group> getMemberOf() {
		return (EList<Group>)eGet(SecurityPackage.Literals.PRINCIPAL__MEMBER_OF, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Permission> getPermissions() {
		return (EList<Permission>)eGet(SecurityPackage.Literals.PRINCIPAL__PERMISSIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ProtectionDomain<?> getProtectionDomain() {
		return (ProtectionDomain<?>) eContainer(); // eGet(SecurityPackage.Literals.PRINCIPAL__PROTECTION_DOMAIN, true);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void sendMessage(Principal from, String subject, String bodyMimeType, Object body) {
		// NOP
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void sendMessage(Principal from, String subject, Map<String, Object> bodyMap) {
		// NOP
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void sendMessage(Principal from, String subject, String body) {
		// NOP
	}

	private AuthorizationHelper authorizationHelper = new AuthorizationHelper(this);
		
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AccessDecision authorize(
			SecurityPolicy securityPolicy, 
			Context context, 
			Object target, 
			String action, 
			String qualifier, 
			Map<String, Object> environment) {
		return authorizationHelper.authorize(securityPolicy, context, target, action, qualifier, environment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HubPackage.GUEST___AUTHORIZE__SECURITYPOLICY_CONTEXT_OBJECT_STRING_STRING_MAP_1:
				return authorize((SecurityPolicy)arguments.get(0), (Context)arguments.get(1), arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (Map<String, Object>)arguments.get(5));
			case HubPackage.GUEST___SEND_MESSAGE__PRINCIPAL_STRING_STRING_OBJECT_1:
				sendMessage((Principal)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), arguments.get(3));
				return null;
			case HubPackage.GUEST___SEND_MESSAGE__PRINCIPAL_STRING_MAP_1:
				sendMessage((Principal)arguments.get(0), (String)arguments.get(1), (Map<String, Object>)arguments.get(2));
				return null;
			case HubPackage.GUEST___SEND_MESSAGE__PRINCIPAL_STRING_STRING_1:
				sendMessage((Principal)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}
	
	
	// --- Route methods ---
	
	@RouteMethod(pattern="[^/]+\\.html")
	public String home(HttpContext context) throws Exception {
		HTMLFactory htmlFactory = context.adapt(HTMLFactory.class);
		String objectPath = context.getObjectPath(this);
		ApplicationPanel appPanel = htmlFactory.applicationPanel()
				.style(Style.INFO) // Guest INFO, Authenticated user - primary.
				.header(StringEscapeUtils.escapeHtml4(((Hub) eContainer()).getName()))
				.width(HubUtil.width(this))
				.minHeight(600)
				.headerLink("/index.html")
				.id("guestAppPanel")
				.footer(htmlFactory.link("#", "Documentation"));		
		
		
		Navbar navBar = htmlFactory.navbar("Welcome!", objectPath+".html"); 	
		createLoginForm(htmlFactory, navBar);		
		navBar.item(htmlFactory.link("#", "Register").id("registerMenuItem").on(Event.click, "jQuery('#registration-form-modal').modal();"), false, true);
		
		Modal authenticationFailedModal = htmlFactory.modal()
				.id("authentication-failed-modal")
				.small()
				.title("Authentication failed")
				.body("Invalid Login/Password combination");
						
		Tag guestAppDiv = htmlFactory.div(
				navBar, 
				createRegistrationFormModal(htmlFactory, objectPath), 
				authenticationFailedModal).id("guestApp");		
				
		appPanel.navigation(
				guestAppDiv,
				htmlFactory.tag("script", new GuestAppControllersRenderer().generate(this, objectPath)),
				htmlFactory.tag("script", "angular.bootstrap($('#guestApp'), ['guestApp']);"));		
		
		ContentPanel mainPanel = appPanel.contentPanel().id("main");
//			.width(DeviceSize.SMALL, 9)
//			.width(DeviceSize.MEDIUM, 10)
//			.width(DeviceSize.LARGE, 11);
		
		mainPanel.content(htmlFactory.fontAwesome().spinner(Spinner.spinner).spin()+"&nbsp;Loading summary");//HubUtil.getContainer(this, HubImpl.class).summary(context));
				
		return htmlFactory.bootstrapRouterApplication(
				Theme.Default,
				StringEscapeUtils.escapeHtml4(((Hub) eContainer()).getName()), 
				"main/"+context.getObjectPath(eContainer())+"/summary", 
				htmlFactory.tag(TagName.script, getClass().getResource("RequireJSConfig.js")), 
				appPanel).toString();
		
	}

	private Modal createRegistrationFormModal(HTMLFactory htmlFactory, String objectPath) throws Exception {
		Form registrationForm = htmlFactory.form()
				.method(Method.post)
				//.action(objectPath+"/register")
				.id("registration-form")
				.ngController("registrationController")
				.ngSubmit("register()");
		
		registrationForm.content(htmlFactory.div("").style("color", "red").id("registrationErrorMessage"));
		
		Input rLogin = htmlFactory.input(InputType.text)
				.name("rLogin")
				.id("rLogin")
				.placeholder("Login")
				.autofocus()
				.required()
				.ngModel("registrationData.login");
		
		Tag loginErrorMessage = htmlFactory.span()
				.ngBind("errorData.login")
				.ngShow("errorData.login")
				.style("color", "red")
				.id("rLoginErrorMessage");
		registrationForm.formInputGroup("Login", "rLogin", rLogin, loginErrorMessage)
			.ngClass("{ 'has-error' : errorData.login }")
			.leftAddOn(htmlFactory.fontAwesome().webApplication(WebApplication.user).fixedWidth());
		registrationForm.content(" ");
		
		Input rEMail = htmlFactory.input(InputType.email)
				.name("eMail")
				.id("rEMail")
				.placeholder("E-Mail")
				.required()
				.ngModel("registrationData.eMail");
		
		Tag eMailErrorMessage = htmlFactory.span()
				.ngBind("errorData.eMail")
				.ngShow("errorData.eMail")
				.style("color", "red")
				.id("rEMailErrorMessage");
		FormInputGroup eMailFormInputGroup = registrationForm.formInputGroup("E-Mail", "rEMail", rEMail, eMailErrorMessage).ngClass("{ 'has-error' : errorData.eMail }");			
		eMailFormInputGroup.leftAddOn(htmlFactory.fontAwesome().webApplication(WebApplication.envelope).fixedWidth()); 		
		
		registrationForm.content(" ");
		
		Input rPassword = htmlFactory.input(InputType.password)
				.name("password")
				.id("rPassword")
				.placeholder("Password")
				.required()
				.ngModel("registrationData.password");
		
		Tag passwordErrorMessage = htmlFactory.span()
				.ngBind("errorData.password")
				.ngShow("errorData.password")
				.style("color", "red")
				.id("rPasswordErrorMessage");
		registrationForm.formInputGroup("Password", "rPassword", rPassword, passwordErrorMessage)
			.ngClass("{ 'has-error' : errorData.password }")
			.leftAddOn(htmlFactory.fontAwesome().webApplication(WebApplication.key).fixedWidth());
		registrationForm.content(" ");
		
		Input rPasswordConfirm = htmlFactory.input(InputType.password)
				.name("passwordConfirm")
				.id("rPasswordConfirm")
				.placeholder("Confirm password")
				.required()
				.ngModel("registrationData.passwordConfirm");
		
		Tag passwordConfirmErrorMessage = htmlFactory.span()
				.ngBind("errorData.passwordConfirm")
				.ngShow("errorData.passwordConfirm")
				.style("color", "red")
				.id("rPasswordConfirmErrorMessage");
		
		registrationForm.formInputGroup(
				"Confirm password", 
				"rPasswordConfirm", 
				rPasswordConfirm, 
				passwordConfirmErrorMessage)
			.ngClass("{ 'has-error' : errorData.passwordConfirm }")
			.leftAddOn(htmlFactory.fontAwesome().webApplication(WebApplication.key).fixedWidth().rotate(Rotate.R90));
		
		registrationForm.content(" ");
		
		registrationForm.button("Register").type(Type.SUBMIT).style(Style.PRIMARY).id("registrationSubmitButton");
		registrationForm.content("&nbsp;");
		registrationForm.button("Cancel").attribute("data-dismiss", "modal").id("registrationCancelButton");
		
		return htmlFactory.modal()
				.id("registration-form-modal")
				.small()
				.title("Register")
				.body(registrationForm);
	}

	private void createLoginForm(HTMLFactory htmlFactory, Navbar navBar) {
		Form loginForm = navBar.form(true)
				.method(Method.post)
				//.action(objectPath+"/signin")
				.ngController("loginController")
				.ngSubmit("login()");
		
		Input login = htmlFactory.input(InputType.text)
				.name("login")
				.id("login")
				.placeholder("Login")
				.required()
				.ngModel("loginData.login");
		
		loginForm.formGroup("Login", "login", login, null).ngClass("{ 'has-error' : error }");

		loginForm.content(" ");
		
		Input password = htmlFactory.input(InputType.password)
				.name("password")
				.id("password")
				.placeholder("Password")
				.required()
				.ngModel("loginData.password");
		
		loginForm.formGroup(null, "password", password, null).ngClass("{ 'has-error' : error }");
		loginForm.content(" ");
		
		loginForm.button("Log in&nbsp;", htmlFactory.glyphicon(Glyphicon.log_in)).type(Type.SUBMIT).id("loginButton");
	}
	
	@RouteMethod(value=RequestMethod.POST)
	public Object login(final HttpContext context) throws Exception {
		try (BufferedReader reader = context.getRequest().getReader()) {
			final JSONObject body = new JSONObject(new JSONTokener(reader));
			@SuppressWarnings("unchecked")
			Principal authenticatedPrincipal = ((CDOViewContext<?,LoginPasswordCredentials,?>) context).authenticate(new LoginPasswordCredentials() {
				
				@Override
				public String getPassword() throws Exception {
					return body.getString("password");
				}
				
				@Override
				public String getLogin() throws Exception {
					return body.getString("login");
				}
			});
			
			if (authenticatedPrincipal==null) {
				return Action.UNAUTHORIZED;
			}
			return context.getObjectPath(authenticatedPrincipal)+".html";
		}
	}	
	
	@SuppressWarnings("unchecked")
	@RouteMethod(value=RequestMethod.POST)
	public Object register(final HttpContext context) throws Exception {
		try (BufferedReader reader = context.getRequest().getReader()) {
			final JSONObject body = new JSONObject(new JSONTokener(reader));
			
			Map<String, String> registrationResults = new HashMap<>();
			// Server-side validation
			final String login = body.getString("login");
			if (login==null || login.trim().length()==0) {
				registrationResults.put("login", "Login is blank");
			}
			
			final String eMail = body.getString("eMail");
			if (eMail==null || eMail.trim().length()==0) {
				registrationResults.put("eMail", "E-Mail is blank");
			}
			
			final String password = body.getString("password");
			if (password==null || password.trim().length()==0) {
				registrationResults.put("password", "Password is blank");
			}
			
			String passwordConfirm = body.getString("passwordConfirm");
			if (passwordConfirm==null || passwordConfirm.trim().length()==0) {
				registrationResults.put("passwordConfirm", "Password confirm is blank");
			} else if (password!=null && !password.equals(passwordConfirm)) {
				registrationResults.put("passwordConfirm", "Passwords don't match");
			}
			
			if (!registrationResults.isEmpty()) {
				return new JSONObject(registrationResults).toString();
			}
			
			// TODO - min length, strength checks.
			
			Hub hub = (Hub) eContainer();
			CDOLock writeLock = hub.cdoWriteLock();
			if (writeLock.tryLock(5, TimeUnit.SECONDS)) {
				try {
					for (User u: hub.getAllUsers()) {
						if (u instanceof LoginPasswordHashUser) {
							LoginPasswordHashUser lphUser = (LoginPasswordHashUser) u;
							if (lphUser.getLogin()!=null && lphUser.getLogin().equalsIgnoreCase(login)) {
								registrationResults.put("login", "Login already exists");							
								return new JSONObject(registrationResults).toString();
							}
						}
					}
					org.nasdanika.webtest.hub.User newUser = HubFactory.eINSTANCE.createUser();
					newUser.setLogin(login);
					//newUser.setName(name); - later
					hub.setPasswordHash(newUser, password);
					hub.getUsers().add(newUser);
					
//					// Permission				
//					Permission permission = SecurityFactory.eINSTANCE.createPermission();
//					permission.setTarget(newUser); // self-target
//					permission.setAllow(true);
//					permission.setName("*");
//					permission.setTargetClass("User");
//					permission.setTargetNamespaceURI("urn:org.nasdanika.cdo.security");
//					newUser.getPermissions().add(permission);				

					// Read permission on Hub to the new user.
					Permission permission = SecurityFactory.eINSTANCE.createPermission();
					permission.setTarget(hub); // self-target
					permission.setAllow(true);
					permission.setName("read");
					permission.setTargetClass("Hub");
					permission.setTargetNamespaceURI("urn:org.nasdanika.webtest.hub");
					newUser.getPermissions().add(permission);													
					
					//((UserImpl) newUser).init();
					
					Principal authenticatedUser = ((CDOViewContext<CDOView, LoginPasswordCredentials, HttpContext>) context).authenticate(new LoginPasswordCredentials() {
						
						@Override
						public String getPassword() {
							return password;
						}
						
						@Override
						public String getLogin() {
							return login;
						}
					});
					
					if (newUser!=authenticatedUser) {
						context.getResponse().sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Registration failed - server error");
						return Action.NOP;
					}
					
					registrationResults.put("target", context.getObjectPath(hub)+".html"); 
					return new JSONObject(registrationResults).toString();
				} finally {
					writeLock.unlock();
				}
			} 
			
			context.getResponse().sendError(HttpServletResponse.SC_SERVICE_UNAVAILABLE, "Cannot acquire write lock");
			return Action.NOP;
		}
	}	
	

} //GuestImpl
