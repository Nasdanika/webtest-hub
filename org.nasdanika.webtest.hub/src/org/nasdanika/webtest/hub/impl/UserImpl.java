/**
 */
package org.nasdanika.webtest.hub.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.apache.commons.lang3.StringEscapeUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.nasdanika.cdo.security.AuthorizationHelper;
import org.nasdanika.cdo.security.Group;
import org.nasdanika.cdo.security.LoginPasswordHashUser;
import org.nasdanika.cdo.security.Permission;
import org.nasdanika.cdo.security.Principal;
import org.nasdanika.cdo.security.ProtectionDomain;
import org.nasdanika.cdo.security.SecurityPackage;
import org.nasdanika.cdo.security.SecurityPolicy;
import org.nasdanika.core.AuthorizationProvider.AccessDecision;
import org.nasdanika.core.Context;
import org.nasdanika.html.ApplicationPanel;
import org.nasdanika.html.ApplicationPanel.ContentPanel;
import org.nasdanika.html.FontAwesome.Spinner;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.HTMLFactory.Glyphicon;
import org.nasdanika.html.Navbar;
import org.nasdanika.html.Theme;
import org.nasdanika.html.Tag.TagName;
import org.nasdanika.html.UIElement.Event;
import org.nasdanika.html.UIElement.Style;
import org.nasdanika.web.HttpContext;
import org.nasdanika.web.RouteMethod;
import org.nasdanika.webtest.hub.Application;
import org.nasdanika.webtest.hub.Hub;
import org.nasdanika.webtest.hub.HubPackage;
import org.nasdanika.webtest.hub.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.impl.UserImpl#getApplications <em>Applications</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.UserImpl#getMemberOf <em>Member Of</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.UserImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.UserImpl#getProtectionDomain <em>Protection Domain</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.UserImpl#getLogin <em>Login</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.UserImpl#getPasswordHash <em>Password Hash</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.UserImpl#isDisabled <em>Disabled</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserImpl extends CDOObjectImpl implements User {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HubPackage.Literals.USER;
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
	public EList<Application> getApplications() {
		return (EList<Application>)eGet(HubPackage.Literals.APPLICATION_OWNER__APPLICATIONS, true);
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
	 * @generated
	 */
	public String getLogin() {
		return (String)eGet(SecurityPackage.Literals.LOGIN_PASSWORD_HASH_USER__LOGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogin(String newLogin) {
		eSet(SecurityPackage.Literals.LOGIN_PASSWORD_HASH_USER__LOGIN, newLogin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getPasswordHash() {
		return (byte[])eGet(SecurityPackage.Literals.LOGIN_PASSWORD_HASH_USER__PASSWORD_HASH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPasswordHash(byte[] newPasswordHash) {
		eSet(SecurityPackage.Literals.LOGIN_PASSWORD_HASH_USER__PASSWORD_HASH, newPasswordHash);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisabled() {
		return (Boolean)eGet(SecurityPackage.Literals.LOGIN_PASSWORD_HASH_USER__DISABLED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabled(boolean newDisabled) {
		eSet(SecurityPackage.Literals.LOGIN_PASSWORD_HASH_USER__DISABLED, newDisabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sendMessage(Principal from, String subject, String bodyMimeType, Object body) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sendMessage(Principal from, String subject, Map<String, Object> bodyMap) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sendMessage(Principal from, String subject, String body) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Principal.class) {
			switch (derivedFeatureID) {
				case HubPackage.USER__MEMBER_OF: return SecurityPackage.PRINCIPAL__MEMBER_OF;
				case HubPackage.USER__PERMISSIONS: return SecurityPackage.PRINCIPAL__PERMISSIONS;
				case HubPackage.USER__PROTECTION_DOMAIN: return SecurityPackage.PRINCIPAL__PROTECTION_DOMAIN;
				default: return -1;
			}
		}
		if (baseClass == org.nasdanika.cdo.security.User.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == LoginPasswordHashUser.class) {
			switch (derivedFeatureID) {
				case HubPackage.USER__LOGIN: return SecurityPackage.LOGIN_PASSWORD_HASH_USER__LOGIN;
				case HubPackage.USER__PASSWORD_HASH: return SecurityPackage.LOGIN_PASSWORD_HASH_USER__PASSWORD_HASH;
				case HubPackage.USER__DISABLED: return SecurityPackage.LOGIN_PASSWORD_HASH_USER__DISABLED;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Principal.class) {
			switch (baseFeatureID) {
				case SecurityPackage.PRINCIPAL__MEMBER_OF: return HubPackage.USER__MEMBER_OF;
				case SecurityPackage.PRINCIPAL__PERMISSIONS: return HubPackage.USER__PERMISSIONS;
				case SecurityPackage.PRINCIPAL__PROTECTION_DOMAIN: return HubPackage.USER__PROTECTION_DOMAIN;
				default: return -1;
			}
		}
		if (baseClass == org.nasdanika.cdo.security.User.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == LoginPasswordHashUser.class) {
			switch (baseFeatureID) {
				case SecurityPackage.LOGIN_PASSWORD_HASH_USER__LOGIN: return HubPackage.USER__LOGIN;
				case SecurityPackage.LOGIN_PASSWORD_HASH_USER__PASSWORD_HASH: return HubPackage.USER__PASSWORD_HASH;
				case SecurityPackage.LOGIN_PASSWORD_HASH_USER__DISABLED: return HubPackage.USER__DISABLED;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Principal.class) {
			switch (baseOperationID) {
				case SecurityPackage.PRINCIPAL___AUTHORIZE__SECURITYPOLICY_CONTEXT_OBJECT_STRING_STRING_MAP: return HubPackage.USER___AUTHORIZE__SECURITYPOLICY_CONTEXT_OBJECT_STRING_STRING_MAP;
				case SecurityPackage.PRINCIPAL___SEND_MESSAGE__PRINCIPAL_STRING_STRING_OBJECT: return HubPackage.USER___SEND_MESSAGE__PRINCIPAL_STRING_STRING_OBJECT;
				case SecurityPackage.PRINCIPAL___SEND_MESSAGE__PRINCIPAL_STRING_MAP: return HubPackage.USER___SEND_MESSAGE__PRINCIPAL_STRING_MAP;
				case SecurityPackage.PRINCIPAL___SEND_MESSAGE__PRINCIPAL_STRING_STRING: return HubPackage.USER___SEND_MESSAGE__PRINCIPAL_STRING_STRING;
				default: return -1;
			}
		}
		if (baseClass == org.nasdanika.cdo.security.User.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == LoginPasswordHashUser.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case HubPackage.USER___AUTHORIZE__SECURITYPOLICY_CONTEXT_OBJECT_STRING_STRING_MAP:
				return authorize((SecurityPolicy)arguments.get(0), (Context)arguments.get(1), arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (Map<String, Object>)arguments.get(5));
			case HubPackage.USER___SEND_MESSAGE__PRINCIPAL_STRING_STRING_OBJECT:
				sendMessage((Principal)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), arguments.get(3));
				return null;
			case HubPackage.USER___SEND_MESSAGE__PRINCIPAL_STRING_MAP:
				sendMessage((Principal)arguments.get(0), (String)arguments.get(1), (Map<String, Object>)arguments.get(2));
				return null;
			case HubPackage.USER___SEND_MESSAGE__PRINCIPAL_STRING_STRING:
				sendMessage((Principal)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}
	

	private AuthorizationHelper authorizationHelper = new AuthorizationHelper(this);
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AccessDecision authorize(SecurityPolicy securityPolicy, Context context, Object target, String action, String qualifier, Map<String, Object> environment) {
		return authorizationHelper.authorize(securityPolicy, context, target, action, qualifier, environment);
	}

	@RouteMethod(pattern="[^/]+\\.html")
	public String home(HttpContext context) throws Exception {
		HTMLFactory htmlFactory = context.adapt(HTMLFactory.class);
		if (!context.authorize(this, "read", null, null)) {
			return "Access denied!"; 			
		}
		ApplicationPanel appPanel = htmlFactory
				.applicationPanel()
				.width(HubUtil.width(this))
				.minHeight(600)
				.style(Style.PRIMARY)
				.header(StringEscapeUtils.escapeHtml4(((Hub) eContainer()).getName()))
				.headerLink("/index.html");

		String objectPath = context.getObjectPath(this);
		Navbar navBar = htmlFactory.navbar(htmlFactory.span(StringEscapeUtils.escapeHtml4("TODO - User name"/*getName()*/)).id("banner"), objectPath+".html"); // Profile for authenticated user?		
		navBar.item(htmlFactory.link(objectPath+"/logout", "Log out&nbsp;", htmlFactory.glyphicon(Glyphicon.log_out)).on(Event.click, "return confirm('Are you sure you want to log out?');"), false, true);

		//Breadcrumbs breadcrumbs = htmlFactory.breadcrumbs();
		//for (TraceEntry te: context.getPathTrace()) {
		//	breadcrumbs.item(te.getPath(), te.getDisplayName());
		//}
		//breadcrumbs.item(null, StringEscapeUtils.escapeHtml4("Hi there"));		

		appPanel.navigation(navBar /*, breadcrumbs */);
		
		ContentPanel mainPanel = appPanel.contentPanel()
				.id("main");
//				.width(DeviceSize.SMALL, 9)
//				.width(DeviceSize.MEDIUM, 10)
//				.width(DeviceSize.LARGE, 11);
			
			mainPanel.content(htmlFactory.fontAwesome().spinner(Spinner.spinner).spin()+"&nbsp;Loading summary");//HubUtil.getContainer(this, HubImpl.class).summary(context));
			
			return htmlFactory.bootstrapRouterApplication(
					Theme.Default,
					StringEscapeUtils.escapeHtml4(((Hub) eContainer()).getName()), 
					"main/"+context.getObjectPath(eContainer())+"/summary", 
					htmlFactory.tag(TagName.script, getClass().getResource("RequireJSConfig.js")), 
					appPanel).toString();
	}
		
	@RouteMethod()
	public void logout(final HttpContext context) throws Exception {
		context.getRequest().getSession().invalidate();
		context.getResponse().sendRedirect(context.getObjectPath(eContainer())+".html");
	}	
	

} //UserImpl
