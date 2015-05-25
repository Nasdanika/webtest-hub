/**
 */
package org.nasdanika.webtest.hub.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.Throwable;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.StringEscapeUtils;
import org.eclipse.emf.cdo.common.id.CDOIDUtil;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.nasdanika.cdo.CDOViewContext;
import org.nasdanika.cdo.security.Group;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.security.Principal;
import org.nasdanika.cdo.security.impl.LoginPasswordProtectionDomainImpl;
import org.nasdanika.cdo.web.SessionWebSocketServlet.WebSocketContext;
import org.nasdanika.cdo.web.html.AngularJsEOperationFormGenerator;
import org.nasdanika.core.ContextParameter;
import org.nasdanika.html.Breadcrumbs;
import org.nasdanika.html.Button;
import org.nasdanika.html.Button.Type;
import org.nasdanika.html.FontAwesome.Spinner;
import org.nasdanika.html.FontAwesome.WebApplication;
import org.nasdanika.html.Form;
import org.nasdanika.html.Form.Method;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.HTMLFactory.Glyphicon;
import org.nasdanika.html.HTMLFactory.InputType;
import org.nasdanika.html.Input;
import org.nasdanika.html.Modal;
import org.nasdanika.html.Table;
import org.nasdanika.html.Table.Row;
import org.nasdanika.html.Tabs;
import org.nasdanika.html.Tag;
import org.nasdanika.html.Tag.TagName;
import org.nasdanika.html.TextArea;
import org.nasdanika.html.UIElement.HTMLColor;
import org.nasdanika.html.UIElement.Style;
import org.nasdanika.web.HttpServletRequestContext;
import org.nasdanika.web.RouteMethod;
import org.nasdanika.webtest.hub.Application;
import org.nasdanika.webtest.hub.ApplicationOwner;
import org.nasdanika.webtest.hub.AuthenticationMode;
import org.nasdanika.webtest.hub.BreadcrumbsProvider;
import org.nasdanika.webtest.hub.Guest;
import org.nasdanika.webtest.hub.Hub;
import org.nasdanika.webtest.hub.HubFactory;
import org.nasdanika.webtest.hub.HubPackage;
import org.nasdanika.webtest.hub.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hub</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.impl.HubImpl#getApplications <em>Applications</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.HubImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.HubImpl#getGuest <em>Guest</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.HubImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.HubImpl#getAdministrators <em>Administrators</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.HubImpl#getSlideWidth <em>Slide Width</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.HubImpl#getEveryone <em>Everyone</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HubImpl extends LoginPasswordProtectionDomainImpl implements Hub {
	private static final String SCRIPT_SCOPE_ATTRIBUTE_KEY = Hub.class.getName()+":scriptScope";


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HubImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HubPackage.Literals.HUB;
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
	public String getName() {
		return (String)eGet(HubPackage.Literals.HUB__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(HubPackage.Literals.HUB__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guest getGuest() {
		return (Guest)eGet(HubPackage.Literals.HUB__GUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuest(Guest newGuest) {
		eSet(HubPackage.Literals.HUB__GUEST, newGuest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<User> getUsers() {
		return (EList<User>)eGet(HubPackage.Literals.HUB__USERS, true);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group getAdministrators() {
		return (Group)eGet(HubPackage.Literals.HUB__ADMINISTRATORS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdministrators(Group newAdministrators) {
		eSet(HubPackage.Literals.HUB__ADMINISTRATORS, newAdministrators);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSlideWidth() {
		return (Integer)eGet(HubPackage.Literals.HUB__SLIDE_WIDTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlideWidth(int newSlideWidth) {
		eSet(HubPackage.Literals.HUB__SLIDE_WIDTH, newSlideWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group getEveryone() {
		return (Group)eGet(HubPackage.Literals.HUB__EVERYONE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEveryone(Group newEveryone) {
		eSet(HubPackage.Literals.HUB__EVERYONE, newEveryone);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Map<String, Object> executeScript(WebSocketContext<LoginPasswordCredentials> context, String script) throws Exception {
		org.mozilla.javascript.Context scriptContext = org.mozilla.javascript.Context.enter();
		try {
			Scriptable scope = (Scriptable) context.getAttribute(SCRIPT_SCOPE_ATTRIBUTE_KEY);
			if (scope == null) {
				scope = scriptContext.initStandardObjects();
				context.setAttribute(SCRIPT_SCOPE_ATTRIBUTE_KEY, scope);
			}
			synchronized (scope) {
				ScriptableObject.putProperty(scope, "hub", org.mozilla.javascript.Context.javaToJS(this, scope));
				ScriptableObject.putProperty(scope, "context", org.mozilla.javascript.Context.javaToJS(context, scope));
				ScriptableObject.putProperty(scope, "hubFactory", org.mozilla.javascript.Context.javaToJS(HubFactory.eINSTANCE, scope));
				final StringBuilder[] errorBuilder = { null };
				final StringBuilder outputBuilder = new StringBuilder();
				PrintWriter out = new PrintWriter(new Writer() {
	
					@Override
					public void write(char[] cbuf, int off, int len) throws IOException {
						flush();
						outputBuilder.append(StringEscapeUtils.escapeHtml4(new String(cbuf, off, len)));
					}
	
					@Override
					public void flush() throws IOException {
						if (errorBuilder[0]!=null) {
							outputBuilder.append("<span style='color:red'>");
							outputBuilder.append(StringEscapeUtils.escapeHtml4(errorBuilder[0].toString()));
							outputBuilder.append("</span>");
							errorBuilder[0] = null;
						}
					}
	
					@Override
					public void close() throws IOException {
						flush();					
					}
					
				});
				ScriptableObject.putProperty(scope, "out", org.mozilla.javascript.Context.javaToJS(out, scope));
				
				PrintWriter err = new PrintWriter(new Writer() {
	
					@Override
					public void write(char[] cbuf, int off, int len) throws IOException {
						if (errorBuilder[0] == null) {
							errorBuilder[0] = new StringBuilder();
						}
						
						errorBuilder[0].append(cbuf, off, len);					 
					}
	
					@Override
					public void flush() throws IOException {
						if (errorBuilder[0]!=null) {
							outputBuilder.append("<span style='color:red'>");
							outputBuilder.append(StringEscapeUtils.escapeHtml4(errorBuilder[0].toString()));
							outputBuilder.append("</span>");
							errorBuilder[0] = null;
						}
					}
	
					@Override
					public void close() throws IOException {
						flush();
					}
					
				});
				ScriptableObject.putProperty(scope, "err", org.mozilla.javascript.Context.javaToJS(err, scope));
				
				Map<String, Object> ret = new HashMap<>();
				
				try {
					Object result = scriptContext.evaluateString(scope, script, "script", 1, null);
					ret.put("result", Context.toString(result));
				} catch (Exception e) {
					Throwable th = e;
					while (th.getCause()!=null) {
						th = th.getCause();
					}
					StringWriter exw = new StringWriter();
					th.printStackTrace(new PrintWriter(exw));
					exw.close();
					ret.put("exception", StringEscapeUtils.escapeHtml4(exw.toString()));
				} finally {
					out.close();
					err.close();
					ret.put("output", outputBuilder.toString());
				}
				
				return ret;
			}
		} finally {
			org.mozilla.javascript.Context.exit();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Map<String, Object>> userList() throws Exception {
		EList<Map<String, Object>> ret = new BasicEList<>();
		for (User user: getUsers()) {
			Map<String, Object> entry = new HashMap<>();
			ret.add(entry);
			entry.put("userID", HubUtil.cdoIDtoString(user.cdoID()));
			entry.put("login", user.getLogin());
			if (user.getName()!=null) {
				entry.put("name", user.getName());
			}
			if (user.getPasswordHash()==null) {
				entry.put("authentication",  AuthenticationMode.NTLM.name());
				entry.put("authenticationLiteral",  AuthenticationMode.NTLM.toString());
			} else {
				entry.put("authentication",  AuthenticationMode.PASSWORD.name());
				entry.put("authenticationLiteral",  AuthenticationMode.PASSWORD.toString());
			}
			entry.put("disabled", user.isDisabled());
			entry.put("admin", getAdministrators().isMember(user));
		}
		Collections.sort(ret, new Comparator<Map<String, Object>>() {

			@Override
			public int compare(Map<String, Object> o1, Map<String, Object> o2) {
				return ((String) o1.get("login")).compareTo((String) o2.get("login"));
			}
			
		}); 
		return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Map<String, Object>> deleteUser(String login) throws Exception {
		org.nasdanika.cdo.security.User toDelete = getUser(login);
		if (toDelete!=null) {
			EcoreUtil.delete(toDelete, true);
		}
		return userList();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Map<String, Object>> createOrUpdateUser(
			String userID, 
			String login, 
			String name, 
			boolean admin, 
			boolean disabled, 
			AuthenticationMode authentication, 
			String password, 
			String passwordConfirmation) throws Exception {
				
		User user = (User) (userID==null ? HubFactory.eINSTANCE.createUser() : cdoView().getObject(CDOIDUtil.read(userID)));
		user.setLogin(login);
		user.setName(name);
		if (admin) {
			getAdministrators().getMembers().add(user);
		} else {
			getAdministrators().getMembers().remove(user);
		}
		user.setDisabled(disabled);
		if (AuthenticationMode.NTLM.equals(authentication)) {
			user.setPasswordHash(null);
		} else if (password!=null) {
			setPasswordHash(user, password);
		}
		if (userID==null) {
			getUsers().add(user);
		}
		return userList();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void home(CDOViewContext<?, ?> viewContext, HttpServletRequestContext requestContext) throws Exception {
		Principal principal = viewContext.getPrincipal();
		requestContext.getResponse().sendRedirect(requestContext.getObjectPath(principal)+".html");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ApplicationOwner.class) {
			switch (derivedFeatureID) {
				case HubPackage.HUB__APPLICATIONS: return HubPackage.APPLICATION_OWNER__APPLICATIONS;
				default: return -1;
			}
		}
		if (baseClass == BreadcrumbsProvider.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == ApplicationOwner.class) {
			switch (baseFeatureID) {
				case HubPackage.APPLICATION_OWNER__APPLICATIONS: return HubPackage.HUB__APPLICATIONS;
				default: return -1;
			}
		}
		if (baseClass == BreadcrumbsProvider.class) {
			switch (baseFeatureID) {
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HubPackage.HUB___EXECUTE_SCRIPT__WEBSOCKETCONTEXT_STRING:
				try {
					return executeScript((WebSocketContext<LoginPasswordCredentials>)arguments.get(0), (String)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case HubPackage.HUB___USER_LIST:
				try {
					return userList();
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case HubPackage.HUB___DELETE_USER__STRING:
				try {
					return deleteUser((String)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case HubPackage.HUB___CREATE_OR_UPDATE_USER__STRING_STRING_STRING_BOOLEAN_BOOLEAN_AUTHENTICATIONMODE_STRING_STRING:
				try {
					return createOrUpdateUser((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (Boolean)arguments.get(3), (Boolean)arguments.get(4), (AuthenticationMode)arguments.get(5), (String)arguments.get(6), (String)arguments.get(7));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case HubPackage.HUB___HOME__CDOVIEWCONTEXT_HTTPSERVLETREQUESTCONTEXT:
				try {
					home((CDOViewContext<?, ?>)arguments.get(0), (HttpServletRequestContext)arguments.get(1));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<org.nasdanika.cdo.security.User> getAllUsers() {
		// Currently only customers. Add back-office workers in future versions.
		return new BasicEList<org.nasdanika.cdo.security.User>(getUsers());
	}
	
	// --- Route methods ---
	
	@RouteMethod
	public String scriptConsole(@ContextParameter HttpServletRequestContext context) throws Exception {
		HTMLFactory htmlFactory = context.adapt(HTMLFactory.class);
		if (!context.authorize(this, "invoke", "executeScript", null)) {
			return htmlFactory.alert(Style.DANGER, false, "Access Denied!").toString(); 
		}	
		
		Form scriptConsoleForm = htmlFactory.form().ngSubmit("executeScript()").id("scriptConsoleForm").ngController("HubScriptConsoleController");
		Tag outputTag = htmlFactory.tag(TagName.pre)
				.id("output")
				.style("overflow", "scroll")
				.style("width", "100%")
				.style("height", "400px");
				//.ngBind("output");
		
		scriptConsoleForm.formGroup("Output", outputTag.getId(), outputTag, null);
		
		TextArea inputTextArea = htmlFactory.textArea().rows(10).ngModel("script").id("input");
		scriptConsoleForm.formGroup("Input", inputTextArea.getId(), inputTextArea, null);
		scriptConsoleForm.button("Execute").type(Type.SUBMIT).style(Style.PRIMARY);
		return htmlFactory.spinnerOverlay(Spinner.cog).id("scriptConsoleOverlay").toString() +
				scriptConsoleForm +
				htmlFactory.tag(TagName.script, new HubScriptConsoleControllerGenerator().generate(context.getObjectPath(this))) +
				htmlFactory.tag(TagName.script, "jQuery('#scriptConsoleOverlay').width(jQuery('#scriptConsoleForm').width());") +
				htmlFactory.tag(TagName.script, "jQuery('#scriptConsoleOverlay').height(jQuery('#scriptConsoleForm').height());");
	}	
	
	@RouteMethod(action="read")
	public String summary(@ContextParameter HttpServletRequestContext context) throws Exception {
		HTMLFactory htmlFactory = context.adapt(HTMLFactory.class);
		Table applicationsTable = htmlFactory.table().bordered();
		Row hRow = applicationsTable.row().style(Style.INFO);
		hRow.header("Name").rowspan(2).style("text-align", "center").attribute("nowrap", "true");
		hRow.header(htmlFactory.glyphicon(Glyphicon.calendar), "&nbsp;Last test").rowspan(2).style("text-align", "center").attribute("nowrap", "true"); 
		hRow.header(htmlFactory.fontAwesome().webApplication(WebApplication.flask),"&nbsp;Tests").colspan(4).style("text-align", "center").attribute("nowrap", "true");
		hRow.header(htmlFactory.glyphicon(Glyphicon.user), "&nbsp;Actors").colspan(3).style("text-align", "center").attribute("nowrap", "true");
		hRow.header(htmlFactory.glyphicon(Glyphicon.list_alt), "&nbsp;Pages").colspan(4).style("text-align", "center").attribute("nowrap", "true");
		
		Row hRow2 = applicationsTable.row().style(Style.INFO);
		hRow2.header(htmlFactory.glyphicon(Glyphicon.ok), "&nbsp;Pass").style("text-align", "center").attribute("nowrap", "true").style("color", HTMLColor.Green);
		hRow2.header(htmlFactory.glyphicon(Glyphicon.remove), "&nbsp;Fail").style("text-align", "center").attribute("nowrap", "true").style("color", HTMLColor.Red);
		hRow2.header(htmlFactory.glyphicon(Glyphicon.warning_sign), "&nbsp;Error").style("text-align", "center").attribute("nowrap", "true").style("color", HTMLColor.DarkOrange);
		hRow2.header(htmlFactory.glyphicon(Glyphicon.time), "&nbsp;Pending").style("text-align", "center").attribute("nowrap", "true").style("color", HTMLColor.Gray);

		hRow2.header("Classes").style("text-align", "center").attribute("nowrap", "true");
		hRow2.header("Methods").style("text-align", "center").attribute("nowrap", "true");
		hRow2.header("Coverage").style("text-align", "center").attribute("nowrap", "true");
		
		hRow2.header("Classes").style("text-align", "center").attribute("nowrap", "true");
		hRow2.header("Methods").style("text-align", "center").attribute("nowrap", "true");
		hRow2.header("Elements").style("text-align", "center").attribute("nowrap", "true");
		hRow2.header("Coverage").style("text-align", "center").attribute("nowrap", "true");
		
		Row appRow = applicationsTable.row().ngRepeat("appSummary in hubApplicationsSummary");
		
		Tag nameLink = htmlFactory.routeLink("main", "/{{ appSummary.$path }}.html", "").ngBind("appSummary.name");  
		
		Button deleteButton = htmlFactory.button(htmlFactory.fontAwesome().webApplication(WebApplication.trash).getTarget()).style("float", "right");
		deleteButton.ngClick("deleteApp(appSummary.$path)");
		deleteButton.ngShow("appSummary.$delete");
		
		appRow.cell(nameLink, "&nbsp;", deleteButton);		

		appRow.cell().ngBindHtml("appSummary.lastTest").style("text-align", "center");

		appRow.cell().ngBind("appSummary.tests.pass").style("text-align", "center");
		appRow.cell().ngBind("appSummary.tests.fail").style("text-align", "center").style("font-weight", "bold").style("color", HTMLColor.Red);
		appRow.cell().ngBind("appSummary.tests.error").style("text-align", "center").style("font-weight", "bold").style("color", HTMLColor.DarkOrange);
		appRow.cell().ngBind("appSummary.tests.pending").style("text-align", "center");
		
		appRow.cell().ngBind("appSummary.actors.classes").style("text-align", "center");
		appRow.cell().ngBind("appSummary.actors.methods").style("text-align", "center");
		appRow.cell().ngBind("appSummary.actors.coverage").style("text-align", "center");

		appRow.cell().ngBind("appSummary.pages.classes").style("text-align", "center");
		appRow.cell().ngBind("appSummary.pages.methods").style("text-align", "center");
		appRow.cell().ngBind("appSummary.pages.elements").style("text-align", "center");
		appRow.cell().ngBind("appSummary.pages.coverage").style("text-align", "center");		
		
		Fragment appFragment = htmlFactory.fragment(applicationsTable);
		
		if (context.authorize(this, "write", "applications", null)) {
			Modal newApplicationModal = createNewApplicationFormModal(htmlFactory, context.getObjectPath(this));
			appFragment.content(newApplicationModal);
			Button addButton = htmlFactory.button("Add").style(Style.PRIMARY);
			newApplicationModal.bind(addButton);
			appFragment.content(addButton);
		}
		
		if (context.authorize(this, "manage", "users", null)) { // Tabs
			Tabs tabs = htmlFactory.tabs();
			tabs.item(
					"Applications", 
					htmlFactory.spinnerOverlay(Spinner.refresh).id("applicationOverlay"),
					htmlFactory.div(
							appFragment,
							htmlFactory.tag(TagName.script, new ApplicationsControllerGenerator().generate(context.getObjectPath(this))),
							htmlFactory.tag(TagName.script, htmlFactory.showOverlay("#applicationOverlay", "#applicationPanel", 12, 12)))
							.id("applicationPanel")
							.style("border-left", "solid 1px #ddd")
							.style("border-right", "solid 1px #ddd")
							.style("border-bottom", "solid 1px #ddd")
							.style("padding", "5px")
							.ngController("ApplicationsController"));
			
			tabs.ajaxItem("Users", context.getObjectPath(this)+"/usersApp");
			
			return htmlFactory.div(createBreadcrumbs(context, true)).id("breadcrumbs-container").toString() + tabs + htmlFactory.title(getName());					
		}
		
		return htmlFactory.div(createBreadcrumbs(context, true)).id("breadcrumbs-container").toString() +
				htmlFactory.spinnerOverlay(Spinner.refresh).id("applicationOverlay") +
				htmlFactory.panel(
					Style.INFO, 
					"Applications", 
					appFragment, 
					null).id("applicationPanel").ngController("ApplicationsController") +
					htmlFactory.title(getName()) +
					htmlFactory.tag(TagName.script, new ApplicationsControllerGenerator().generate(context.getObjectPath(this))) +
					htmlFactory.tag(TagName.script, htmlFactory.showOverlay("#applicationOverlay", "#applicationPanel", 12, 12));
	}
	
	private Modal createNewApplicationFormModal(HTMLFactory htmlFactory, String objectPath) throws Exception {
		Form newApplicationForm = htmlFactory.form()
				.method(Method.post)
				//.action(objectPath+"/register")
				.id("newAppForm")
				.ngSubmit("addApp()");
		
		newApplicationForm.content(htmlFactory.div("").style("color", "red").ngBind("newAppErrorMessage"));
		
		HubUtil.createFormGroup(
				htmlFactory, 
				newApplicationForm,
				htmlFactory.input(InputType.text).required().autofocus(),
				"name",
				"Application name",
				"newApplicationData",
				"errorData");		
		
		newApplicationForm.content(" ");
		
		TextArea appDescription = htmlFactory.textArea().placeholder("Description").rows(4);
		
		HubUtil.createFormGroup(
				htmlFactory, 
				newApplicationForm, 
				appDescription, 
				"description", 
				"Description", 
				"newApplicationData",
				"errorData");		
		
		newApplicationForm.content(" ");
		
		Input securityToken = htmlFactory.input(InputType.text)
				.name("appSecurityToken")
				.id("appSecurityToken")
				.placeholder("Security token")
				.required()
				.ngModel("newApplicationData.securityToken");
		
		Tag securityTokenErrorMessage = htmlFactory.span()
				.ngBind("errorData.securityToken")
				.ngShow("errorData.securityToken")
				.style("color", "red")
				.id("securityTokenErrorMessage");
		
		newApplicationForm.formInputGroup("Security token", "appSecurityToken", securityToken, securityTokenErrorMessage)
			.ngClass("{ 'has-error' : errorData.securityToken }")
			.leftAddOn(htmlFactory.fontAwesome().webApplication(WebApplication.key).fixedWidth());
		
		newApplicationForm.content(" ");
		
		newApplicationForm.content(" ");
		
		newApplicationForm.button("Create").type(Type.SUBMIT).style(Style.PRIMARY).id("newAppSubmitButton");
		newApplicationForm.content("&nbsp;");
		newApplicationForm.button("Cancel").attribute("data-dismiss", "modal").id("newAppCancelButton");
		
		return htmlFactory.modal()
				.id("newAppFormModal")
				.small()
				.title("Create application")
				.body(newApplicationForm);
	}
		
	@Override
	public Breadcrumbs createBreadcrumbs(HttpServletRequestContext context, boolean active) throws Exception {
		HTMLFactory htmlFactory = context.adapt(HTMLFactory.class);
		Breadcrumbs breadcrumbs = htmlFactory.breadcrumbs();
		breadcrumbs.item(active ? null : htmlFactory.routeRef("main", "/"+context.getObjectPath(this))+"/summary", "Home");
		return breadcrumbs;
	}
	
	/**
	 * Generates AngularJS application template for user management.
	 * @param context
	 * @return
	 * @throws Exception
	 */
	@RouteMethod
	public String usersApp(@ContextParameter HttpServletRequestContext context) throws Exception {
		HTMLFactory htmlFactory = context.adapt(HTMLFactory.class);
		if (!context.authorize(this, "manage", "users", null)) {
			return htmlFactory.alert(Style.DANGER, false, "Access Denied!").toString(); 
		}	
		
		Table usersTable = htmlFactory.table().bordered();
		Row hRow = usersTable.row().style(Style.INFO);
		hRow.header("Login").style("text-align", "center").attribute("nowrap", "true");
		hRow.header("Name").style("text-align", "center").attribute("nowrap", "true");
		hRow.header("Authentication").style("text-align", "center").attribute("nowrap", "true");
		hRow.header("Disabled").style("text-align", "center").attribute("nowrap", "true");
		hRow.header("Admin").style("text-align", "center").attribute("nowrap", "true");
		
		Row userRow = usersTable.row().ngRepeat("userInfo in userList");
		
		Button editButton = htmlFactory.button(htmlFactory.fontAwesome().webApplication(WebApplication.pencil).getTarget());
		editButton.ngClick("updateUser(userInfo)");
		
		Button deleteButton = htmlFactory.button(htmlFactory.fontAwesome().webApplication(WebApplication.trash).getTarget());
		deleteButton.ngClick("deleteUser(userInfo)");
				
		userRow.cell(htmlFactory.span().ngBind("userInfo.login"), htmlFactory.div(editButton, "&nbsp;", deleteButton).style("float", "right"));		

		userRow.cell().ngBind("userInfo.name");
		userRow.cell().ngBind("userInfo.authenticationLiteral").style("text-align", "center");
		userRow.cell(htmlFactory.fontAwesome().webApplication(WebApplication.check).getTarget().ngShow("userInfo.disabled")).style("text-align", "center");
		userRow.cell(htmlFactory.fontAwesome().webApplication(WebApplication.check).getTarget().ngShow("userInfo.admin")).style("text-align", "center");
		
		EOperation createOrUpdateUser = HubPackage.eINSTANCE.getHub__CreateOrUpdateUser__String_String_String_boolean_boolean_AuthenticationMode_String_String();
		AngularJsEOperationFormGenerator createUpdateUserFormGenerator = new AngularJsEOperationFormGenerator(createOrUpdateUser, "userModel", "createOrUpdateUser()");
		
//		KnockoutJsEOperationFormGenerator test = new KnockoutJsEOperationFormGenerator(createOrUpdateUser, "userModel", "createOrUpdateUser");
//		System.out.println(test.generateForm(htmlFactory));
//		System.out.println("----");
//		System.out.println(test.generateModel());
		
		Modal createUpdateUserModal = htmlFactory.modal()
				.id("createUpdateUserFormModal")
				.small()
				.title("{{userDialogTitle}}")
				.body(htmlFactory.spinnerOverlay(Spinner.spinner).id("userFormOverlay").style("display", "none"),
						createUpdateUserFormGenerator.generateForm(htmlFactory).id("userForm"));
		
		Button addButton = htmlFactory.button("Add").style(Style.PRIMARY).ngClick("createUser()");
	
		return htmlFactory.spinnerOverlay(Spinner.refresh).id("usersAppOverlay").toString() +
				htmlFactory.div(usersTable, addButton, createUpdateUserModal)
					.id("usersApp")
					.style("border-left", "solid 1px #ddd")
					.style("border-right", "solid 1px #ddd")
					.style("border-bottom", "solid 1px #ddd")
					.style("padding", "5px")
					.ngController("UsersController") + 
				htmlFactory.tag(TagName.script, new UsersControllerGenerator().generate(context.getObjectPath(this), createUpdateUserFormGenerator.generateModel())) + 
				htmlFactory.tag(TagName.script, htmlFactory.showOverlay("#usersAppOverlay", "#usersApp", 12, 12));
	}
	
	
		
} //HubImpl
