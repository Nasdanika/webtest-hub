/**
 */
package org.nasdanika.webtest.hub.impl;

import java.lang.reflect.InvocationTargetException;

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
import org.nasdanika.html.UIElement.Event;
import org.nasdanika.html.UIElement.HTMLColor;
import org.nasdanika.html.UIElement.Style;
import org.nasdanika.web.HttpContext;
import org.nasdanika.web.RouteMethod;
import org.nasdanika.webtest.hub.Application;
import org.nasdanika.webtest.hub.ApplicationOwner;
import org.nasdanika.webtest.hub.BreadcrumbsProvider;
import org.nasdanika.webtest.hub.Guest;
import org.nasdanika.webtest.hub.Hub;
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
	public Application testOperation(int prm) {
		Application app = getApplications().get(1);
		app.setDescription("Prm: "+prm);
		return app;
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
			case HubPackage.HUB___TEST_OPERATION__INT:
				return testOperation((Integer)arguments.get(0));
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
		Principal principal = ((CDOViewContext<?,?>) context).getPrincipal();
		context.getResponse().sendRedirect(context.getObjectPath(principal)+".html");
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

		Tag nameLink = htmlFactory.tag(TagName.a, "{{ appSummary.name }}").attribute("href", "#router/main/{{ appSummary.$path }}.html");
		
		Button deleteButton = htmlFactory.button(htmlFactory.fontAwesome().webApplication(WebApplication.trash).getTarget()).style("float", "right");
		deleteButton.ngClick("deleteApp(appSummary.$path)");
		deleteButton.ngShow("appSummary.$delete");
		
		appRow.cell(nameLink, "&nbsp;", deleteButton);		

		appRow.cell().ngBindHtml("appSummary.lastTest").style("text-align", "center");

		appRow.cell().ngBind("appSummary.tests.pass").style("text-align", "center");
		appRow.cell().ngBind("appSummary.tests.fail").style("text-align", "center");
		appRow.cell().ngBind("appSummary.tests.error").style("text-align", "center");
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
		
		return htmlFactory.div(
				createBreadcrumbs(context, true)).id("breadcrumbs-container").toString() +
				htmlFactory.panel(
					Style.INFO, 
					"Applications", 
					appFragment, 
					null).id("applicationPanel").ngController("ApplicationsController") +
					htmlFactory.tag(TagName.script, new ApplicationsControllerGenerator().generate(context.getObjectPath(this))) +
					htmlFactory.title(getName());
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
