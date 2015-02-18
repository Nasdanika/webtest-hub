/**
 */
package org.nasdanika.webtest.hub.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.Throwable;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringEscapeUtils;
import org.eclipse.emf.cdo.CDOLock;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.nasdanika.cdo.web.routes.CDOWebUtil;
import org.nasdanika.html.Breadcrumbs;
import org.nasdanika.html.FontAwesome.Spinner;
import org.nasdanika.html.FontAwesome.WebApplication;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.HTMLFactory.Glyphicon;
import org.nasdanika.html.Table;
import org.nasdanika.html.Table.Row;
import org.nasdanika.html.Tag.TagName;
import org.nasdanika.html.UIElement.HTMLColor;
import org.nasdanika.html.UIElement.Style;
import org.nasdanika.web.HttpContext;
import org.nasdanika.web.RequestMethod;
import org.nasdanika.web.RouteMethod;
import org.nasdanika.webtest.hub.Application;
import org.nasdanika.webtest.hub.Hub;
import org.nasdanika.webtest.hub.HubFactory;
import org.nasdanika.webtest.hub.HubPackage;
import org.nasdanika.webtest.hub.Screenshot;
import org.nasdanika.webtest.hub.TestSession;
import org.nasdanika.webtest.hub.TestSession.Totals;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.impl.ApplicationImpl#getTestSessions <em>Test Sessions</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.ApplicationImpl#getSecurityToken <em>Security Token</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.ApplicationImpl#getScreenshots <em>Screenshots</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.ApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.ApplicationImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationImpl extends CDOObjectImpl implements Application {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HubPackage.Literals.APPLICATION;
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
	public EList<TestSession> getTestSessions() {
		return (EList<TestSession>)eGet(HubPackage.Literals.APPLICATION__TEST_SESSIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecurityToken() {
		return (String)eGet(HubPackage.Literals.APPLICATION__SECURITY_TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityToken(String newSecurityToken) {
		eSet(HubPackage.Literals.APPLICATION__SECURITY_TOKEN, newSecurityToken);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Screenshot> getScreenshots() {
		return (EList<Screenshot>)eGet(HubPackage.Literals.APPLICATION__SCREENSHOTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(HubPackage.Literals.APPLICATION__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(HubPackage.Literals.APPLICATION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(HubPackage.Literals.APPLICATION__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(HubPackage.Literals.APPLICATION__DESCRIPTION, newDescription);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public JSONObject getSummaryRow(HttpContext context) throws Exception {
		JSONObject ret = new JSONObject();
		
		ret.put("name", CDOWebUtil.marshalValue(getName()));
		ret.put(CDOWebUtil.PATH_KEY, CDOWebUtil.marshalValue(context.getObjectPath(this)));
		ret.put("$delete", CDOWebUtil.marshalValue(context.authorize(this, "delete", null, null)));
		
//		aRow.cell(getDescription());
		
		EList<TestSession> ts = getTestSessions();
		TestSession lastTestSession = ts.isEmpty() ? null : ts.get(ts.size()-1);
		Totals totals = lastTestSession == null ? null : lastTestSession.getTotals();
		
		ret.put("lastTest", CDOWebUtil.marshalValue(lastTestSession==null ? "" : new SimpleDateFormat(TestSessionImpl.DATE_PATTERN).format(new Date(lastTestSession.getTimestamp()))));
		
		JSONObject testsSummary = new JSONObject();
		ret.put("tests", CDOWebUtil.marshalValue(testsSummary));
		testsSummary.put("pass", CDOWebUtil.marshalValue(totals==null ? "" : HubUtil.blankZero(totals.getPass())));
		testsSummary.put("fail", CDOWebUtil.marshalValue(totals==null ? "" : HubUtil.blankZero(totals.getFail())));
		testsSummary.put("error", CDOWebUtil.marshalValue(totals==null ? "" : HubUtil.blankZero(totals.getError())));
		testsSummary.put("pending", CDOWebUtil.marshalValue(totals==null ? "" : HubUtil.blankZero(totals.getPending())));

		JSONObject actorsSummary = new JSONObject();
		ret.put("actors", CDOWebUtil.marshalValue(actorsSummary));
		actorsSummary.put("classes", CDOWebUtil.marshalValue(totals==null ? "" : HubUtil.blankZero(totals.getActorClasses())));
		actorsSummary.put("methods", CDOWebUtil.marshalValue(totals==null ? "" : HubUtil.blankZero(totals.getActorMethods())));
		actorsSummary.put("coverage", CDOWebUtil.marshalValue(totals==null || totals.getActorMethods()==0 ? "" : totals.getActorCoverage()+" ("+(100*totals.getActorCoverage()/Math.max(1, totals.getActorMethods()))+"%)"));
		
		JSONObject pagesSummary = new JSONObject();
		ret.put("pages", CDOWebUtil.marshalValue(pagesSummary));
		pagesSummary.put("classes", CDOWebUtil.marshalValue(totals==null ? "" : HubUtil.blankZero(totals.getPageClasses())));
		pagesSummary.put("methods", CDOWebUtil.marshalValue(totals==null ? "" : HubUtil.blankZero(totals.getPageMethods())));
		pagesSummary.put("elements", CDOWebUtil.marshalValue(totals==null ? "" : HubUtil.blankZero(totals.getPageElements())));
		pagesSummary.put("coverage", CDOWebUtil.marshalValue(totals==null|| totals.getPageMethods()==0 ? "" : totals.getPageCoverage()+" ("+(100*totals.getPageCoverage()/Math.max(1, totals.getPageMethods()))+"%)"));
				
		return ret;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HubPackage.APPLICATION___GET_SUMMARY_ROW__HTTPCONTEXT:
				try {
					return getSummaryRow((HttpContext)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

	@RouteMethod(pattern="L[\\d]+/testSessions", value=RequestMethod.POST)
	public void createTestSession(final HttpContext context) throws Exception {
		if (authorize(context)) {
			final TestSession testSession = HubFactory.eINSTANCE.createTestSession();
			CDOLock writeLock = cdoWriteLock();
			if (writeLock.tryLock(5, TimeUnit.SECONDS)) {
				try {					
					getTestSessions().add(testSession);
					try (BufferedReader reader = context.getRequest().getReader()) {
						testSession.loadJSON(new JSONObject(new JSONTokener(reader)), context);
					}
					HubUtil.respondWithLocationAndObjectIdOnCommit(context, testSession);
				} finally {
					writeLock.unlock();
				}
			} else {			
				context.getResponse().sendError(HttpServletResponse.SC_SERVICE_UNAVAILABLE, "Cannot acquire a write lock");
			}
		}
	}

	boolean authorize(final HttpContext context) throws IOException {
		if (getSecurityToken()==null) {
			return true;
		}
		
		String authorization = context.getRequest().getHeader("Authorization");
		if (authorization==null) {
			context.getResponse().sendError(HttpServletResponse.SC_UNAUTHORIZED, "No security token");
			return false;
		}
		if (!authorization.startsWith("Bearer ")) {
			context.getResponse().sendError(HttpServletResponse.SC_UNAUTHORIZED, "Invalid authorization");
			return false;
		}
		if (!authorization.substring("Bearer ".length()).equals(getSecurityToken())) {
			context.getResponse().sendError(HttpServletResponse.SC_UNAUTHORIZED, "Invalid security token");
			return false;
		}
		
		return true;
	}
	
	@RouteMethod(pattern="L?[\\d]+\\.html")
	public String home(HttpContext context) throws Exception {
		HTMLFactory htmlFactory = context.adapt(HTMLFactory.class);
		if (!context.authorize(this, "read", null, null)) {
			return htmlFactory.alert(Style.DANGER, false, "Access Denied!").toString(); 
		}		
		Table testSessionsTable = htmlFactory.table().bordered();
		Row hRow = testSessionsTable.row().style(Style.INFO);
		hRow.header("Title").rowspan(2).style("text-align", "center").attribute("nowrap", "true");
//		hRow.header(htmlFactory.glyphicon(Glyphicon.file), "&nbsp;Description").rowspan(2).style("text-align", "center").attribute("nowrap", "true"); 
		hRow.header(htmlFactory.fontAwesome().webApplication(WebApplication.desktop), "&nbsp;Node").rowspan(2).style("text-align", "center").attribute("nowrap", "true");
		hRow.header(htmlFactory.fontAwesome().webApplication(WebApplication.calendar), "&nbsp;Time").rowspan(2).style("text-align", "center").attribute("nowrap", "true");
		hRow.header(htmlFactory.fontAwesome().webApplication(WebApplication.flask),"&nbsp;Tests").colspan(4).style("text-align", "center").attribute("nowrap", "true");
		hRow.header(htmlFactory.glyphicon(Glyphicon.user), "&nbsp;Actors").colspan(3).style("text-align", "center").attribute("nowrap", "true");
		hRow.header(htmlFactory.glyphicon(Glyphicon.list_alt), "&nbsp;Pages").colspan(4).style("text-align", "center").attribute("nowrap", "true");
		
		Row hRow2 = testSessionsTable.row().style(Style.INFO);
		hRow2.header(htmlFactory.glyphicon(Glyphicon.ok), "&nbsp;Pass").style("text-align", "center").attribute("nowrap", "true").style("color", HTMLColor.Green);
		hRow2.header(htmlFactory.glyphicon(Glyphicon.remove), "&nbsp;Fail").style("text-align", "center").attribute("nowrap", "true").style("color", HTMLColor.Red);
		hRow2.header(htmlFactory.glyphicon(Glyphicon.warning_sign), "&nbsp;Error").style("text-align", "center").attribute("nowrap", "true").style("color", HTMLColor.DarkOrange);
		hRow2.header(htmlFactory.glyphicon(Glyphicon.time), "&nbsp;Pending").style("text-align", "center").attribute("nowrap", "true").style("color", "gray");

		hRow2.header("Classes").style("text-align", "center").attribute("nowrap", "true");
		hRow2.header("Methods").style("text-align", "center").attribute("nowrap", "true");
		hRow2.header("Coverage").style("text-align", "center").attribute("nowrap", "true");
		
		hRow2.header("Classes").style("text-align", "center").attribute("nowrap", "true");
		hRow2.header("Methods").style("text-align", "center").attribute("nowrap", "true");
		hRow2.header("Elements").style("text-align", "center").attribute("nowrap", "true");
		hRow2.header("Coverage").style("text-align", "center").attribute("nowrap", "true");
		
				
		Row aRow = testSessionsTable.row().ngRepeat("summaryRow in testSessionsSummary");
		
		aRow.cell(
				htmlFactory.routeLink("main","/{{ summaryRow.$path }}.html","").ngBind("summaryRow.title"),
				"&nbsp;",
				htmlFactory.button(htmlFactory.fontAwesome().webApplication(WebApplication.trash).getTarget()).style("float", "right").ngClick("deleteTestSession(summaryRow.$path)").ngShow("summaryRow.$delete"));
		
		aRow.cell().ngBind("summaryRow.node").style("text-align", "center");
		aRow.cell().ngBind("summaryRow.time").style("text-align", "center");	
		
		aRow.cell().ngBind("summaryRow.tests.pass").style("text-align", "center");
		aRow.cell().ngBind("summaryRow.tests.fail").style("text-align", "center").style("font-weight", "bold").style("color", HTMLColor.Red);
		aRow.cell().ngBind("summaryRow.tests.error").style("text-align", "center").style("font-weight", "bold").style("color", HTMLColor.DarkOrange);
		aRow.cell().ngBind("summaryRow.tests.pending").style("text-align", "center");

		aRow.cell().ngBind("summaryRow.actors.classes").style("text-align", "center");
		aRow.cell().ngBind("summaryRow.actors.methods").style("text-align", "center");
		aRow.cell().ngBind("summaryRow.actors.coverage").style("text-align", "center");

		aRow.cell().ngBind("summaryRow.pages.classes").style("text-align", "center");
		aRow.cell().ngBind("summaryRow.pages.methods").style("text-align", "center");
		aRow.cell().ngBind("summaryRow.pages.elements").style("text-align", "center");
		aRow.cell().ngBind("summaryRow.pages.coverage").style("text-align", "center");
				
		String rUrl = context.getRequest().getRequestURL().toString();
		String pathInfo = context.getRequest().getPathInfo();
		if (rUrl.endsWith(pathInfo)) {
			rUrl = rUrl.substring(0, rUrl.length()-pathInfo.length());
		}
		String sPath = context.getRequest().getServletPath();
		if (rUrl.endsWith(sPath)) {
			rUrl = rUrl.substring(0, rUrl.length()-sPath.length());
		}
		
		return	htmlFactory.div(createBreadcrumbs(context, true)).id("breadcrumbs-container").toString()+
				htmlFactory.tag("H3", StringEscapeUtils.escapeHtml4(getName())) +
				htmlFactory.label(Style.DEFAULT, "Publish URL: "+rUrl+context.getObjectPath(this)+"/testSessions") +
				(getDescription()==null ? "" : htmlFactory.div(getDescription())) +
				htmlFactory.spinnerOverlay(Spinner.refresh).id("testSessionsOverlay") +
				htmlFactory.panel(Style.INFO, "Test sessions", testSessionsTable, null).id("testSessionsPanel").ngController("TestSessionsController") +
				htmlFactory.title(getName()) +
				htmlFactory.tag(TagName.script, new TestSessionsControllerGenerator().generate(context.getObjectPath(this))) +
				htmlFactory.tag(TagName.script, "jQuery('#testSessionsOverlay').width(jQuery('#testSessionsPanel').width());") +
				htmlFactory.tag(TagName.script, "jQuery('#testSessionsOverlay').height(jQuery('#testSessionsPanel').height());")				;
	}
	
	@Override
	public Breadcrumbs createBreadcrumbs(HttpContext context, boolean active) throws Exception {
		Breadcrumbs ret = ((Hub) eContainer()).createBreadcrumbs(context, false);
		ret.item(active ? null : context.adapt(HTMLFactory.class).routeRef("main", "/"+context.getObjectPath(this))+".html", StringEscapeUtils.escapeHtml4(getName()));		
		return ret;
	}
	

} //ApplicationImpl
