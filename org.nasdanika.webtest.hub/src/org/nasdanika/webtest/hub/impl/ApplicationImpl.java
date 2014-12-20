/**
 */
package org.nasdanika.webtest.hub.impl;

import java.io.BufferedReader;
import java.io.IOException;
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
import org.nasdanika.html.Breadcrumbs;
import org.nasdanika.html.FontAwesome.WebApplication;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.HTMLFactory.Glyphicon;
import org.nasdanika.html.Table;
import org.nasdanika.html.Table.Row;
import org.nasdanika.html.Table.Row.Cell;
import org.nasdanika.html.UIElement.HTMLColor;
import org.nasdanika.html.UIElement.Style;
import org.nasdanika.web.HttpContext;
import org.nasdanika.web.RequestMethod;
import org.nasdanika.web.RouteMethod;
import org.nasdanika.webtest.hub.Application;
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
		
		CDOLock readLock = cdoReadLock();
		if (readLock.tryLock(5, TimeUnit.SECONDS)) {
			try {
				for (TestSession ts: getTestSessions()) {
					ts.summaryRow(context, testSessionsTable.row());
				}
				Breadcrumbs breadcrumbs = htmlFactory.breadcrumbs();
				breadcrumbs.item(htmlFactory.routeRef("main", "/"+context.getObjectPath(eContainer()))+"/summary", "Home");
				breadcrumbs.item(null, StringEscapeUtils.escapeHtml4(getName()));
				
				return	htmlFactory.div(breadcrumbs).id("breadcrumbs-container").toString()+
						htmlFactory.tag("H3", StringEscapeUtils.escapeHtml4(getName())) +
						(getDescription()==null ? "" : getDescription()) +
						htmlFactory.panel(Style.INFO, "Test sessions", testSessionsTable, null) +
						htmlFactory.title(getName());
			} finally {
				readLock.unlock();
			}
		} else {
			return htmlFactory.alert(Style.WARNING, false, "The system is overloaded, please try again later.").toString(); 			
		}
	}
	
	@Override
	public void summaryRow(HttpContext context, Row aRow) throws Exception {
		HTMLFactory htmlFactory = context.adapt(HTMLFactory.class);
		aRow.cell(htmlFactory.routeLink(
				"main", 
				"/"+context.getObjectPath(this)+".html", 
				StringEscapeUtils.escapeHtml4(getName()))); 
//		aRow.cell(getDescription());
		
		EList<TestSession> ts = getTestSessions();
		TestSession lastTestSession = ts.isEmpty() ? null : ts.get(ts.size()-1);
		Totals totals = lastTestSession == null ? null : lastTestSession.getTotals();
		
		aRow.cell(lastTestSession==null ? "" : new SimpleDateFormat(TestSessionImpl.DATE_PATTERN).format(new Date(lastTestSession.getTimestamp()))).style("text-align", "center");	
		aRow.cell(totals==null ? "" : HubUtil.blankZero(totals.getPass())).style("text-align", "center");
		Cell failCell = aRow.cell(totals==null ? "" : HubUtil.blankZero(totals.getFail())).style("text-align", "center");
		Cell errorCell = aRow.cell(totals==null ? "" : HubUtil.blankZero(totals.getError())).style("text-align", "center");
		if (totals!=null && totals.getError()>0) {
			errorCell.style("font-weight", "bold").style("color", HTMLColor.DarkOrange);
		}
		aRow.cell(totals==null ? "" : HubUtil.blankZero(totals.getPending())).style("text-align", "center");
		
		if (totals!=null) {
			if (totals.getFail()>0) {
				failCell.style("font-weight", "bold").style("color", "red");
				aRow.style(Style.DANGER);
			} else if (totals.getError()>0) {
				aRow.style(Style.WARNING);			
			}
		}

		// TODO - trending arrows
		aRow.cell(totals==null ? "" : HubUtil.blankZero(totals.getActorClasses())).style("text-align", "center");
		aRow.cell(totals==null ? "" : HubUtil.blankZero(totals.getActorMethods())).style("text-align", "center");
		aRow.cell(totals==null || totals.getActorMethods()==0 ? "" : totals.getActorCoverage()+" ("+(100*totals.getActorCoverage()/Math.max(1, totals.getActorMethods()))+"%)").style("text-align", "center");
		
		aRow.cell(totals==null ? "" : HubUtil.blankZero(totals.getPageClasses())).style("text-align", "center");
		aRow.cell(totals==null ? "" : HubUtil.blankZero(totals.getPageMethods())).style("text-align", "center");
		aRow.cell(totals==null ? "" : HubUtil.blankZero(totals.getPageElements())).style("text-align", "center");					
		aRow.cell(totals==null|| totals.getPageMethods()==0 ? "" : totals.getPageCoverage()+" ("+(100*totals.getPageCoverage()/Math.max(1, totals.getPageMethods()))+"%)").style("text-align", "center");
	}
	

} //ApplicationImpl
