/**
 */
package org.nasdanika.webtest.hub.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.Throwable;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.apache.commons.lang3.StringEscapeUtils;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.cdo.CDOViewContext;
import org.nasdanika.cdo.security.Group;
import org.nasdanika.cdo.security.Principal;
import org.nasdanika.cdo.security.impl.LoginPasswordProtectionDomainImpl;
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
import org.nasdanika.html.Tag;
import org.nasdanika.html.Tag.TagName;
import org.nasdanika.html.TextArea;
import org.nasdanika.html.UIElement.HTMLColor;
import org.nasdanika.html.UIElement.Style;
import org.nasdanika.web.HttpContext;
import org.nasdanika.web.RouteMethod;
import org.nasdanika.webtest.hub.Application;
import org.nasdanika.webtest.hub.ApplicationOwner;
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
 * </ul>
 * </p>
 *
 * @generated
 */
public class HubImpl extends LoginPasswordProtectionDomainImpl implements Hub {
	private static final String SCRIPT_ENGINE_ATTRIBUTE_KEY = Hub.class.getName()+":scriptEngine";


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
	 * @generated NOT
	 */
	public Map<String, Object> executeScript(HttpContext context, String script) throws Exception {
		ScriptEngine engine = (ScriptEngine) context.getRequest().getSession().getAttribute(SCRIPT_ENGINE_ATTRIBUTE_KEY);
		if (engine == null) {
			engine = new ScriptEngineManager(getClass().getClassLoader()).getEngineByMimeType("text/javascript");
			context.getRequest().getSession().setAttribute(SCRIPT_ENGINE_ATTRIBUTE_KEY, engine);
		}
		synchronized (engine) {
			ScriptContext scriptContext = engine.getContext();
			scriptContext.setAttribute("hub", this, ScriptContext.ENGINE_SCOPE);
			scriptContext.setAttribute("context", context, ScriptContext.ENGINE_SCOPE);
			scriptContext.setAttribute("hubFactory", HubFactory.eINSTANCE, ScriptContext.ENGINE_SCOPE);
			final StringBuilder[] errorBuilder = { null };
			final StringBuilder outputBuilder = new StringBuilder();
			scriptContext.setWriter(new Writer() {

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
			
			scriptContext.setErrorWriter(new Writer() {

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
			
			Map<String, Object> ret = new HashMap<>();
			
			try {
				Object result = engine.eval(new StringReader(script));
				ret.put("result", result);
			} catch (ScriptException e) {
				Throwable th = e;
				while (th.getCause()!=null) {
					th = th.getCause();
				}
				StringWriter exw = new StringWriter();
				th.printStackTrace(new PrintWriter(exw));
				exw.close();
				ret.put("exception", StringEscapeUtils.escapeHtml4(exw.toString()));
			} finally {
				scriptContext.getErrorWriter().close();
				scriptContext.getWriter().close();
				ret.put("output", outputBuilder.toString());
			}
			
			return ret;
		}
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HubPackage.HUB___EXECUTE_SCRIPT__HTTPCONTEXT_STRING:
				try {
					return executeScript((HttpContext)arguments.get(0), (String)arguments.get(1));
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
	
	/**
	 * Redirects to the principal home page.
	 * @param context
	 * @throws Exception
	 */
	@RouteMethod(pattern="L?[\\d]+\\.html")
	public void home(HttpContext context) throws Exception {
		@SuppressWarnings("unchecked")
		Principal principal = ((CDOViewContext<?,?,HttpContext>) context).getPrincipal(context);
		context.getResponse().sendRedirect(context.getObjectPath(principal)+".html");
	}	
	
	
	@RouteMethod
	public String scriptConsole(HttpContext context) throws Exception {
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
	
	@RouteMethod
	public String summary(HttpContext context) throws Exception {
		HTMLFactory htmlFactory = context.adapt(HTMLFactory.class);
		if (!context.authorize(this, "read", null, null)) {
			return htmlFactory.alert(Style.DANGER, false, "Access Denied!").toString(); 
		}	
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
		
		return htmlFactory.div(createBreadcrumbs(context, true)).id("breadcrumbs-container").toString() +
				htmlFactory.spinnerOverlay(Spinner.refresh).id("applicationOverlay") +
				htmlFactory.panel(
					Style.INFO, 
					"Applications", 
					appFragment, 
					null).id("applicationPanel").ngController("ApplicationsController") +
					htmlFactory.title(getName()) +
					htmlFactory.tag(TagName.script, new ApplicationsControllerGenerator().generate(context.getObjectPath(this))) +
					htmlFactory.tag(TagName.script, "jQuery('#applicationOverlay').width(jQuery('#applicationPanel').width());") +
					htmlFactory.tag(TagName.script, "jQuery('#applicationOverlay').height(jQuery('#applicationPanel').height());");
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
	public Breadcrumbs createBreadcrumbs(HttpContext context, boolean active) throws Exception {
		HTMLFactory htmlFactory = context.adapt(HTMLFactory.class);
		Breadcrumbs breadcrumbs = htmlFactory.breadcrumbs();
		breadcrumbs.item(active ? null : htmlFactory.routeRef("main", "/"+context.getObjectPath(this))+"/summary", "Home");
		return breadcrumbs;
	}
		
} //HubImpl
