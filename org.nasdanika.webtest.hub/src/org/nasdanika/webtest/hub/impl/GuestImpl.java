/**
 */
package org.nasdanika.webtest.hub.impl;

import java.io.BufferedReader;
import java.lang.Throwable;
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
import org.nasdanika.cdo.CDOTransactionContext;
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
import org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext;
import org.nasdanika.cdo.web.SessionWebSocketServlet.WebSocketContext;
import org.nasdanika.cdo.web.html.KnockoutJsEOperationFormGenerator;
import org.nasdanika.core.AbstractCommand;
import org.nasdanika.core.AuthorizationProvider.AccessDecision;
import org.nasdanika.core.Command;
import org.nasdanika.core.Context;
import org.nasdanika.core.ContextParameter;
import org.nasdanika.html.ApplicationPanel;
import org.nasdanika.html.FontAwesome.Spinner;
import org.nasdanika.html.Form;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.Navbar;
import org.nasdanika.html.Tag;
import org.nasdanika.html.Tag.TagName;
import org.nasdanika.html.Theme;
import org.nasdanika.html.UIElement.Style;
import org.nasdanika.web.Action;
import org.nasdanika.web.HttpServletRequestContext;
import org.nasdanika.web.RequestMethod;
import org.nasdanika.web.RouteMethod;
import org.nasdanika.web.ServerException;
import org.nasdanika.webtest.hub.ApplicationRenderer;
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
	public Object registrationForm(CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context) throws Exception {
		return renderApplication(context, new AbstractCommand<HttpServletRequestContext, ApplicationPanel, Void>() {

			@Override
			public Void execute(HttpServletRequestContext context, ApplicationPanel... args) throws Exception {
				KnockoutJsEOperationFormGenerator formGenerator = new KnockoutJsEOperationFormGenerator(
						HubPackage.eINSTANCE.getGuest__Register__WebSocketContext_String_String_String_String_String(), 
						"model", 
						"submitHandler",
						"cancelHandler") {
					
				};
							
				HTMLFactory htmlFactory = context.adapt(HTMLFactory.class);
				Form form = formGenerator.generateForm(htmlFactory);
				GuestRegistrationGenerator<Context, String> viewModelGenerator = new GuestRegistrationGenerator<Context, String>();
				String script = viewModelGenerator.execute(
						context, 
						context.getObjectPath(GuestImpl.this), 
						formGenerator.generateModel(),
						"registrationContainer");
												
				args[0].contentPanel(
						htmlFactory.div(
								htmlFactory.spinnerOverlay(Spinner.spinner).id("registrationFormOverlay").style("display", "none"),
								form).id("registrationContainer"),
						htmlFactory.tag(Tag.TagName.script, script));
				return null;
			}
		});
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ApplicationRenderer.class) {
			switch (baseOperationID) {
				case HubPackage.APPLICATION_RENDERER___RENDER_APPLICATION__HTTPSERVLETREQUESTCONTEXT_COMMAND: return HubPackage.GUEST___RENDER_APPLICATION__HTTPSERVLETREQUESTCONTEXT_COMMAND;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case HubPackage.GUEST___REGISTRATION_FORM__CDOTRANSACTIONHTTPSERVLETREQUESTCONTEXT:
				try {
					return registrationForm((CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case HubPackage.GUEST___HOME__HTTPSERVLETREQUESTCONTEXT:
				try {
					return home((HttpServletRequestContext)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case HubPackage.GUEST___REGISTER__WEBSOCKETCONTEXT_STRING_STRING_STRING_STRING_STRING:
				try {
					return register((WebSocketContext<LoginPasswordCredentials>)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case HubPackage.GUEST___RENDER_APPLICATION__HTTPSERVLETREQUESTCONTEXT_COMMAND:
				try {
					return renderApplication((HttpServletRequestContext)arguments.get(0), (Command<HttpServletRequestContext, ApplicationPanel, Void>)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case HubPackage.GUEST___AUTHORIZE__SECURITYPOLICY_CONTEXT_OBJECT_STRING_STRING_MAP:
				return authorize((SecurityPolicy)arguments.get(0), (Context)arguments.get(1), arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (Map<String, Object>)arguments.get(5));
			case HubPackage.GUEST___SEND_MESSAGE__PRINCIPAL_STRING_STRING_OBJECT:
				sendMessage((Principal)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), arguments.get(3));
				return null;
			case HubPackage.GUEST___SEND_MESSAGE__PRINCIPAL_STRING_MAP:
				sendMessage((Principal)arguments.get(0), (String)arguments.get(1), (Map<String, Object>)arguments.get(2));
				return null;
			case HubPackage.GUEST___SEND_MESSAGE__PRINCIPAL_STRING_STRING:
				sendMessage((Principal)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}
	
	public Object home(HttpServletRequestContext context) throws Exception {
		return renderApplication(context, new AbstractCommand<HttpServletRequestContext, ApplicationPanel, Void>() {

			@Override
			public Void execute(final HttpServletRequestContext context, ApplicationPanel... args) throws Exception {
				args[0].contentPanel(new Object() {
					
					@Override
					public String toString() {
						try {
							return "Coming soon "+context.adapt(CDOTransactionContext.class).getView().isClosed();
						} catch (Exception e) {
							return e.toString();
						}
					}
					
				});
				return null;
			}
		});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Object register(
			WebSocketContext<LoginPasswordCredentials> context, 
			final String login, 
			String name, 
			String eMail, 
			final String password, 
			String passwordConfirmation) throws Exception {
		
		Map<String, Object> ret = new HashMap<>();
		Map<String, Object> validationResults = new HashMap<>();

		// Server-side explicit validation.
		if (login==null || login.trim().length()==0) {
			validationResults.put("login", "Login is blank");
		}
		
//		if (eMail==null || eMail.trim().length()==0) {
//			validationResults.put("eMail", "E-Mail is blank");
//		}
		
		if (password==null || password.trim().length()==0) {
			validationResults.put("password", "Password is blank");
		}
		
		if (passwordConfirmation==null || passwordConfirmation.trim().length()==0) {
			validationResults.put("passwordConfirm", "Password confirm is blank");
		} else if (password!=null && !password.equals(passwordConfirmation)) {
			validationResults.put("passwordConfirm", "Passwords don't match");
		}
		
		// TODO - min length, strength checks.
		
		if (!validationResults.isEmpty()) {
			ret.put("validationResults", validationResults);
			return ret;
		}		
		
		Hub hub = (Hub) eContainer();
		CDOLock writeLock = hub.cdoWriteLock();
		if (writeLock.tryLock(5, TimeUnit.SECONDS)) {
			try {
				for (User u: hub.getAllUsers()) {
					if (u instanceof LoginPasswordHashUser) {
						LoginPasswordHashUser lphUser = (LoginPasswordHashUser) u;
						if (lphUser.getLogin()!=null && lphUser.getLogin().equalsIgnoreCase(login)) {
							validationResults.put("login", "Login already exists");							
							ret.put("validationResults", validationResults);
							return ret;
						}
					}
				}
				org.nasdanika.webtest.hub.User newUser = HubFactory.eINSTANCE.createUser();
				newUser.setLogin(login);
				//newUser.setName(name); - later
				hub.setPasswordHash(newUser, password);
				hub.getUsers().add(newUser);
				
				// Permission				
				Permission permission = SecurityFactory.eINSTANCE.createPermission();
				permission.setTarget(newUser); // self-target
				permission.setAllow(true);
				permission.setName("GET");
				permission.setQualifier("/home");
				newUser.getPermissions().add(permission);				
				
				//((UserImpl) newUser).init();
				
				Principal authenticatedUser = context.authenticate(new LoginPasswordCredentials() {
					
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
					throw new ServerException("Registration failed - server error");
				}
				
				return context.getObjectPath(hub)+".html"; 
			} finally {
				writeLock.unlock();
			}
		} 
		
		throw new org.nasdanika.web.ServerException("Cannot acquire write lock");		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Object renderApplication(HttpServletRequestContext context, Command<HttpServletRequestContext, ApplicationPanel, Void> configurator) throws Exception {
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
		
		// TODO - Login form on the right using knockout form and login operation.
		
		if (context.getRequest().getUserPrincipal()==null) { // NFS authentication
			navBar.item(htmlFactory.link(context.getObjectPath(this)+"/registrationForm", "Register"), false, true);
		}
		
		appPanel.navigation(navBar);
		
		configurator.execute(context, appPanel);
		
//			.width(DeviceSize.SMALL, 9)
//			.width(DeviceSize.MEDIUM, 10)
//			.width(DeviceSize.LARGE, 11);
		
		return htmlFactory.bootstrapRouterApplication(
				Theme.Default,
				StringEscapeUtils.escapeHtml4(((Hub) eContainer()).getName()), 
				null, 
				htmlFactory.tag(TagName.script, getClass().getResource("RequireJSConfig.js")), 
				appPanel);
		
	}
	
	@RouteMethod(value=RequestMethod.POST)
	public Object login(@ContextParameter final HttpServletRequestContext context) throws Exception {
		try (BufferedReader reader = context.getRequest().getReader()) {
			final JSONObject body = new JSONObject(new JSONTokener(reader));
			@SuppressWarnings("unchecked")
			Principal authenticatedPrincipal = ((CDOViewContext<?,LoginPasswordCredentials>) context).authenticate(new LoginPasswordCredentials() {
				
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

} //GuestImpl
