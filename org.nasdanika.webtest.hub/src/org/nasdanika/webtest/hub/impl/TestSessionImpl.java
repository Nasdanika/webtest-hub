/**
 */
package org.nasdanika.webtest.hub.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringEscapeUtils;
import org.eclipse.emf.cdo.CDOLock;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.nasdanika.core.ConverterContext;
import org.nasdanika.html.Breadcrumbs;
import org.nasdanika.html.FontAwesome.WebApplication;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.HTMLFactory.Glyphicon;
import org.nasdanika.html.LinkGroup;
import org.nasdanika.html.Table;
import org.nasdanika.html.Table.Row;
import org.nasdanika.html.Table.Row.Cell;
import org.nasdanika.html.Tabs;
import org.nasdanika.html.Tag.TagName;
import org.nasdanika.html.UIElement.DeviceSize;
import org.nasdanika.html.UIElement.HTMLColor;
import org.nasdanika.html.UIElement.Style;
import org.nasdanika.web.HttpContext;
import org.nasdanika.web.RequestMethod;
import org.nasdanika.web.RouteMethod;
import org.nasdanika.webtest.hub.ActorResult;
import org.nasdanika.webtest.hub.Application;
import org.nasdanika.webtest.hub.Coverage;
import org.nasdanika.webtest.hub.HubFactory;
import org.nasdanika.webtest.hub.HubPackage;
import org.nasdanika.webtest.hub.OperationResult;
import org.nasdanika.webtest.hub.PageResult;
import org.nasdanika.webtest.hub.Screenshot;
import org.nasdanika.webtest.hub.TestResult;
import org.nasdanika.webtest.hub.TestSession;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Session</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.impl.TestSessionImpl#getTestResults <em>Test Results</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.TestSessionImpl#getPageResults <em>Page Results</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.TestSessionImpl#getActorResults <em>Actor Results</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.TestSessionImpl#isPublished <em>Published</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.TestSessionImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.TestSessionImpl#getProgress <em>Progress</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.TestSessionImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.TestSessionImpl#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestSessionImpl extends DescriptorImpl implements TestSession {
	static final String DATE_PATTERN = "YYYY/MM/dd HH:mm";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestSessionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HubPackage.Literals.TEST_SESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TestResult> getTestResults() {
		return (EList<TestResult>)eGet(HubPackage.Literals.TEST_SESSION__TEST_RESULTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PageResult> getPageResults() {
		return (EList<PageResult>)eGet(HubPackage.Literals.TEST_SESSION__PAGE_RESULTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ActorResult> getActorResults() {
		return (EList<ActorResult>)eGet(HubPackage.Literals.TEST_SESSION__ACTOR_RESULTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPublished() {
		return (Boolean)eGet(HubPackage.Literals.TEST_SESSION__PUBLISHED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublished(boolean newPublished) {
		eSet(HubPackage.Literals.TEST_SESSION__PUBLISHED, newPublished);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return (Integer)eGet(HubPackage.Literals.TEST_SESSION__SIZE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		eSet(HubPackage.Literals.TEST_SESSION__SIZE, newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getProgress() {
		return (Integer)eGet(HubPackage.Literals.TEST_SESSION__PROGRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgress(int newProgress) {
		eSet(HubPackage.Literals.TEST_SESSION__PROGRESS, newProgress);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTimestamp() {
		return (Long)eGet(HubPackage.Literals.TEST_SESSION__TIMESTAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(long newTimestamp) {
		eSet(HubPackage.Literals.TEST_SESSION__TIMESTAMP, newTimestamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNode() {
		return (String)eGet(HubPackage.Literals.TEST_SESSION__NODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(String newNode) {
		eSet(HubPackage.Literals.TEST_SESSION__NODE, newNode);
	}

	@Override
	public void loadJSON(JSONObject json, ConverterContext context)	throws Exception {
		super.loadJSON(json, context);
		setSize(json.getInt("size"));
		setNode(json.getString("node"));
		setTimestamp(System.currentTimeMillis());
		setProgress(1);
	}

	@RouteMethod(pattern="L[\\d]+/testResults", value=RequestMethod.POST)
	public void createTestResult(final HttpContext context) throws Exception {
		if (HubUtil.authorize(context, this)) {
			CDOLock writeLock = cdoWriteLock();
			if (writeLock.tryLock(5, TimeUnit.SECONDS)) {
				try (BufferedReader reader = context.getRequest().getReader()) {
					JSONObject json = new JSONObject(new JSONTokener(reader));
					switch (json.getString("type")) {
					case "class": {
						TestResult result = HubFactory.eINSTANCE.createTestClassResult();
						getTestResults().add(result);
						result.loadJSON(json, context);
						HubUtil.respondWithLocationAndObjectIdOnCommit(context, result);				
						break;
					}
					case "suite": {
						TestResult result = HubFactory.eINSTANCE.createTestSuiteResult();
						getTestResults().add(result);
						result.loadJSON(json, context);
						HubUtil.respondWithLocationAndObjectIdOnCommit(context, result);				
						break;
					}
					case "parameterized": {
						TestResult result = HubFactory.eINSTANCE.createParameterizedTestResult();
						getTestResults().add(result);
						result.loadJSON(json, context);
						HubUtil.respondWithLocationAndObjectIdOnCommit(context, result);				
						break;
					}
					default:
						context.getResponse().sendError(HttpServletResponse.SC_BAD_REQUEST, "Unexpected type: "+json.getString("type"));
					}
				} finally {
					writeLock.unlock();
				}
			} else {			
				context.getResponse().sendError(HttpServletResponse.SC_SERVICE_UNAVAILABLE, "Cannot acquire a write lock");
			}			
		}
	}	
	
	@RouteMethod(pattern="L[\\d]+/pageResults", value=RequestMethod.POST)
	public void createPageResult(final HttpContext context) throws Exception {
		if (HubUtil.authorize(context, this)) {
			CDOLock writeLock = cdoWriteLock();
			if (writeLock.tryLock(5, TimeUnit.SECONDS)) {
				try (BufferedReader reader = context.getRequest().getReader()) {
					JSONObject json = new JSONObject(new JSONTokener(reader));
					PageResult result = HubFactory.eINSTANCE.createPageResult();
					getPageResults().add(result);
					result.loadJSON(json, context);
					HubUtil.respondWithLocationAndObjectIdOnCommit(context, result);
				} finally {
					writeLock.unlock();
				}
			} else {			
				context.getResponse().sendError(HttpServletResponse.SC_SERVICE_UNAVAILABLE, "Cannot acquire a write lock");
			}			
		}
	}	
		
	@RouteMethod(pattern="L[\\d]+/actorResults", value=RequestMethod.POST)
	public void createActorResult(final HttpContext context) throws Exception {
		if (HubUtil.authorize(context, this)) {
			CDOLock writeLock = cdoWriteLock();
			if (writeLock.tryLock(5, TimeUnit.SECONDS)) {
				try (BufferedReader reader = context.getRequest().getReader()) {
					JSONObject json = new JSONObject(new JSONTokener(reader));
					ActorResult result = HubFactory.eINSTANCE.createActorResult();
					getActorResults().add(result);
					result.loadJSON(json, context);
					HubUtil.respondWithLocationAndObjectIdOnCommit(context, result);
				} finally {
					writeLock.unlock();
				}
			} else {			
				context.getResponse().sendError(HttpServletResponse.SC_SERVICE_UNAVAILABLE, "Cannot acquire a write lock");
			}			
		}
	}	
	
	@RouteMethod(pattern="L[\\d]+", value=RequestMethod.PUT)
	public void uploadFinished(final HttpContext context) throws Exception {
		if (HubUtil.authorize(context, this)) {
			CDOLock writeLock = cdoWriteLock();
			if (writeLock.tryLock(5, TimeUnit.SECONDS)) {
				try {
					setPublished(true);
				} finally {
					writeLock.unlock();
				}
			} else {			
				context.getResponse().sendError(HttpServletResponse.SC_SERVICE_UNAVAILABLE, "Cannot acquire a write lock");
			}
			File out = new File("repo-dump-"+Long.toString(System.currentTimeMillis(), Character.MAX_RADIX)+".xml");
			try (FileOutputStream fos = new FileOutputStream(out)) {
				eResource().save(fos, null);
				System.out.println("Repository dumped to "+out.getAbsolutePath());
			}
		}
	}	
	
	@RouteMethod(pattern="L[\\d]+", value=RequestMethod.DELETE)
	public void uploadFailed(final HttpContext context) throws Exception {
		if (HubUtil.authorize(context, this)) {
			CDOLock writeLock = ((CDOObject) eContainer()).cdoWriteLock();
			if (writeLock.tryLock(5, TimeUnit.SECONDS)) {
				try {
					// Cleaning references to screenshots
					TreeIterator<EObject> tit = eAllContents();
					while (tit.hasNext()) {
						EObject next = tit.next();
						if (next instanceof OperationResult) {
							OperationResult or = (OperationResult) next;
							or.getScreenshots().clear();
							or.setBeforeScreenshot(null);
							or.setAfterScreenshot(null);
						}
					}
					// Removing unreferenced screenshots
					Iterator<Screenshot> sit = HubUtil.getContainer(this, Application.class).getScreenshots().iterator();
					while (sit.hasNext()) {
						Screenshot screenshot = sit.next();
						if (screenshot.getAfterOperations().isEmpty() && screenshot.getBeforeOperations().isEmpty()) {
							sit.remove();
						}
					}
					// Removing test session from the container (detaching)
					((Collection<?>) eContainer().eGet(eContainingFeature())).remove(this);
				} finally {
					writeLock.unlock();
				}
			} else {			
				context.getResponse().sendError(HttpServletResponse.SC_SERVICE_UNAVAILABLE, "Cannot acquire a write lock");
			}			
		}
	}	
	
	@RouteMethod(pattern="L?[\\d]+\\.html")
	public String home(HttpContext context) throws Exception {
		HTMLFactory htmlFactory = context.adapt(HTMLFactory.class);
		if (!context.authorize(this, "read", null, null)) {
			return htmlFactory.alert(Style.DANGER, false, "Access Denied!").toString(); 
		}	
		
		int width = HubUtil.width(this); 	
		int leftPanelWidth = (int) Math.round(250.0*12.0/width);

		Fragment leftPanel = htmlFactory.fragment(htmlFactory.routeLink("right-panel", "/"+context.getObjectPath(this)+"/summary", "<b>Summary</b>"), htmlFactory.tag("p"));
		
		// TODO - test class methods threshold 
		leftPanel.content(
				htmlFactory.collapsible(
						Style.INFO, 
						htmlFactory.fontAwesome().webApplication(WebApplication.flask)+"&nbsp;Tests", 
						false, 
						testsLeftPanel(context, htmlFactory)));
		
		Object actorsLeftPanel = actorsLeftPanel(context, htmlFactory);
		if (actorsLeftPanel!=null) {
			leftPanel.content(htmlFactory.collapsible(Style.INFO, htmlFactory.glyphicon(Glyphicon.user)+" Actors", false, actorsLeftPanel));
		}
		Object pagesLeftPanel = pagesLeftPanel(context, htmlFactory);
		if (pagesLeftPanel!=null) {
			leftPanel.content(htmlFactory.collapsible(Style.INFO, htmlFactory.glyphicon(Glyphicon.list_alt)+" Pages", false, pagesLeftPanel));
		}
		
		String title = StringEscapeUtils.escapeHtml4(getTitle())+" "+new SimpleDateFormat(DATE_PATTERN).format(new Date(getTimestamp()));
		
		return	htmlFactory.div().id("breadcrumbs-container").toString() + 
				htmlFactory.div(leftPanel).addClass("col-"+DeviceSize.LARGE.code+"-"+leftPanelWidth) +
				htmlFactory.div(summary(context)).id("right-panel").addClass("col-"+DeviceSize.LARGE.code+"-"+(12-leftPanelWidth)) +
				htmlFactory.title(title); 
	}
	
	@Override
	public Breadcrumbs createBreadcrumbs(HttpContext context, boolean active) throws Exception {
		Breadcrumbs ret = ((Application) eContainer()).createBreadcrumbs(context, false);
		String title = StringEscapeUtils.escapeHtml4(getTitle())+" "+new SimpleDateFormat(DATE_PATTERN).format(new Date(getTimestamp()));
		ret.item(active ? null : context.adapt(HTMLFactory.class).routeRef("main", "/"+context.getObjectPath(this))+".html", title);		
		return ret;
	}
	
	private Object pagesLeftPanel(HttpContext context, HTMLFactory htmlFactory) throws Exception {
		List<PageResult> prs = new ArrayList<>(getPageResults());
		if (prs.isEmpty()) {
			return null;
		}
		Collections.sort(prs, new Comparator<PageResult>() {

			@Override
			public int compare(PageResult o1, PageResult o2) {				
				return o1.getTitle().compareTo(o2.getTitle());
			}
		});

		LinkGroup linkGroup = htmlFactory.linkGroup();
		for (PageResult pr: prs) {
			if (!pr.isProxy()) {
				linkGroup.item(
						StringEscapeUtils.escapeHtml4(pr.getTitle()), 
						htmlFactory.routeRef("right-panel",	"/"+context.getObjectPath(pr)+".html"),
						null, 
						false);
			}
		}
		return linkGroup.length()==0 ? null : linkGroup;
	}

	private Object actorsLeftPanel(HttpContext context, HTMLFactory htmlFactory) throws Exception {
		List<ActorResult> ars = new ArrayList<>(getActorResults());
		if (ars.isEmpty()) {
			return null;
		}
		Collections.sort(ars, new Comparator<ActorResult>() {

			@Override
			public int compare(ActorResult o1, ActorResult o2) {				
				return o1.getTitle().compareTo(o2.getTitle());
			}
		});

		LinkGroup linkGroup = htmlFactory.linkGroup();
		for (ActorResult ar: ars) {
			if (!ar.isProxy()) {
				linkGroup.item(
						StringEscapeUtils.escapeHtml4(ar.getTitle()), 
						htmlFactory.routeRef("right-panel",	"/"+context.getObjectPath(ar)+".html"),
						null, 
						false);
			}
		}
		return linkGroup.length()==0 ? null : linkGroup;
	}

	@RouteMethod
	public String summary(HttpContext context) throws Exception {
		HTMLFactory htmlFactory = context.adapt(HTMLFactory.class);
		if (!context.authorize(this, "read", null, null)) {
			return htmlFactory.alert(Style.DANGER, false, "Access Denied!").toString(); 
		}	
		
		String testsSummary = testsSummary(context);
		String actorsSummary = actorsSummary(context);
		String pagesSummary = pagesSummary(context);
		
		Object body;
		if (actorsSummary==null && pagesSummary==null) {
			body = testsSummary;
		} else {
			Tabs tabs = htmlFactory.tabs();
			body = tabs;
			tabs.item(htmlFactory.fontAwesome().webApplication(WebApplication.flask)+"&nbsp;Tests", testsSummary);
			if (actorsSummary!=null) {
				tabs.item(htmlFactory.glyphicon(Glyphicon.user)+"&nbsp;Actors", actorsSummary);				
			}
			if (pagesSummary!=null) {
				tabs.item(htmlFactory.glyphicon(Glyphicon.list_alt)+"&nbsp;Pages", pagesSummary);				
			}
		}
		
		return 	htmlFactory.inject("#breadcrumbs-container", createBreadcrumbs(context, true)).toString() +
				htmlFactory.tag(TagName.h3, "Summary") +
				getDescription().toHTML()+
				"<P/>"+
				body;		
	}

	private String testsSummary(HttpContext context) throws Exception {
		HTMLFactory htmlFactory = context.adapt(HTMLFactory.class);
		Table testResultsTable = htmlFactory.table().bordered();
		Row hRow = testResultsTable.row().style(Style.INFO);
		hRow.header("Test").style("text-align", "center").attribute("nowrap", "true");
		hRow.header("Description").style("text-align", "center").attribute("nowrap", "true");
		hRow.header(htmlFactory.glyphicon(Glyphicon.ok), "&nbsp;Pass").style("text-align", "center").attribute("nowrap", "true").style("color", HTMLColor.Green);
		hRow.header(htmlFactory.glyphicon(Glyphicon.remove), "&nbsp;Fail").style("text-align", "center").attribute("nowrap", "true").style("color", HTMLColor.Red);
		hRow.header(htmlFactory.glyphicon(Glyphicon.warning_sign), "&nbsp;Error").style("text-align", "center").attribute("nowrap", "true").style("color", HTMLColor.DarkOrange);
		hRow.header(htmlFactory.glyphicon(Glyphicon.time), "&nbsp;Pending").style("text-align", "center").attribute("nowrap", "true").style("color", "gray");
		
		List<TestResult> sortedResults = new ArrayList<>(getTestResults());
		Collections.sort(sortedResults, new Comparator<TestResult>() {

			@Override
			public int compare(TestResult o1, TestResult o2) {
				String t1 = o1.getTitle();
				String t2 = o2.getTitle();
				if (t1==null) {
					if (t2==null) {
						return o1.getQualifiedName().compareTo(o2.getQualifiedName());
					}
					return 1;
				}
				if (t2==null) {
					return -1;
				}
				return t1.compareTo(t2);
			}
		});
		
		int tPass = 0;
		int tFail = 0;
		int tError = 0;
		int tPending = 0;

		for (TestResult tr: sortedResults) {
			Row sRow = testResultsTable.row();
			sRow.cell(htmlFactory.routeLink(
					"right-panel", 
					"/"+context.getObjectPath(tr)+".html", 
					tr.getIcon(htmlFactory), "&nbsp;", StringEscapeUtils.escapeHtml4(tr.getTitle()))); 
			
			sRow.cell(tr.getDescription().toHTML());
			Map<String, int[]> stats = new HashMap<>();
			HubUtil.aggregateStats(tr, stats);
			
			int pass = stats.containsKey("Pass") ? stats.get("Pass")[0] : 0;
			tPass+=pass;
			sRow.cell(HubUtil.blankZero(pass)).style("text-align", "center");
			
			int fail = stats.containsKey("Fail") ? stats.get("Fail")[0] : 0;
			tFail+=fail;
			Cell failCell = sRow.cell(HubUtil.blankZero(fail)).style("text-align", "center");
			
			int error = stats.containsKey("Error") ? stats.get("Error")[0] : 0;
			Cell errorCell = sRow.cell(HubUtil.blankZero(error)).style("text-align", "center");
			tError+=error;
			if (error>0) {
				errorCell.style("font-weight", "bold").style("color", HTMLColor.DarkOrange);
			}
			
			int pending = stats.containsKey("Pending") ? stats.get("Pending")[0] : 0;
			tPending+=pending;
			sRow.cell(HubUtil.blankZero(pending)).style("text-align", "center");
			
			if (fail>0) {
				failCell.style("font-weight", "bold").style("color", "red");
				sRow.style(Style.DANGER);
			} else if (error>0) {
				sRow.style(Style.WARNING);			
			}			
		}
		
		Row tRow = testResultsTable.row().style(Style.INFO);
		tRow.header("Total").colspan(2);
		
		tRow.cell(HubUtil.blankZero(tPass)).style("text-align", "center");
		Cell failCell = tRow.cell(HubUtil.blankZero(tFail)).style("text-align", "center");
		if (tFail>0) {
			failCell.style("font-weight", "bold").style("color", "red");
		}
		
		Cell errorCell = tRow.cell(HubUtil.blankZero(tError)).style("text-align", "center");
		if (tError>0) {
			errorCell.style("font-weight", "bold").style("color", HTMLColor.DarkOrange);
		}
		
		tRow.cell(HubUtil.blankZero(tPending)).style("text-align", "center");
		
		return testResultsTable.toString();
	}
	
	private String actorsSummary(HttpContext context) throws Exception {		
		List<ActorResult> ars = new ArrayList<>(getActorResults());
		if (ars.isEmpty()) {
			return null;
		}
		Collections.sort(ars, new Comparator<ActorResult>() {

			@Override
			public int compare(ActorResult o1, ActorResult o2) {				
				return o1.getTitle().compareTo(o2.getTitle());
			}
		});

		HTMLFactory htmlFactory = context.adapt(HTMLFactory.class);
		Table actorTable = htmlFactory.table().bordered();
		Row header = actorTable.row().style(Style.INFO);
		int[] totals = {0, 0, 0};
		header.header(htmlFactory.glyphicon(Glyphicon.user), "&nbsp;Actor class").style("text-align", "center");
		header.header(htmlFactory.glyphicon(Glyphicon.file), "&nbsp;Description").style("text-align", "center");
		header.header("Methods").style("text-align", "center");
		header.header("Invocations").style("text-align", "center");
		header.header("Coverage").style("text-align", "center");
		for (ActorResult ar: ars) {
			if (!ar.isProxy()) {
				Row pageRow = actorTable.row();
				pageRow.cell(htmlFactory.routeLink(
						"right-panel", 
						"/"+context.getObjectPath(ar)+".html", 
						StringEscapeUtils.escapeHtml4(ar.getTitle())));
				pageRow.cell(ar.getDescription().toHTML());
				int covered = 0;
				int calls = 0;
				for (Coverage mc: ar.getCoverage()) {
					if (mc.getInvocations()!=0) {
						++covered;
					}
					calls+=mc.getInvocations();
				}
				pageRow.cell(HubUtil.blankZero(ar.getCoverage().size())).style("text-align", "center");
				pageRow.cell(HubUtil.blankZero(calls)).attribute("align", "center");
				pageRow.cell(covered==0 ? "" : covered+MessageFormat.format(" ({0,number,#.##}%)", 100.0*covered/ar.getCoverage().size())).style("text-align", "center");
				totals[0]+=ar.getCoverage().size();
				totals[1]+=calls;
				totals[2]+=covered;
			}
		}
		Row totalsRow = actorTable.row().style(Style.INFO);
		totalsRow.cell("Total").colspan(2);
		totalsRow.cell(HubUtil.blankZero(totals[0])).attribute("align", "center");
		totalsRow.cell(HubUtil.blankZero(totals[1])).attribute("align", "center");
		totalsRow.cell(totals[2]==0 ? "" : totals[2]+MessageFormat.format(" ({0,number,#.##}%)", 100.0*totals[2]/totals[0])).attribute("align", "center");
		return actorTable.length()==0 ? null : actorTable.toString();
	}
	
	private String pagesSummary(HttpContext context) throws Exception {
		List<PageResult> prs = new ArrayList<>(getPageResults());
		if (prs.isEmpty()) {
			return null;
		}
		Collections.sort(prs, new Comparator<PageResult>() {

			@Override
			public int compare(PageResult o1, PageResult o2) {				
				return o1.getTitle().compareTo(o2.getTitle());
			}
		});

		HTMLFactory htmlFactory = context.adapt(HTMLFactory.class);
		Table pageTable = htmlFactory.table().bordered();
		Row header = pageTable.row().style(Style.INFO);
		int[] totals = {0, 0, 0, 0};
		header.header(htmlFactory.glyphicon(Glyphicon.list_alt), "&nbsp;Page class").style("text-align", "center");
		header.header(htmlFactory.glyphicon(Glyphicon.file), "&nbsp;Description").style("text-align", "center");
		header.header("Elements").style("text-align", "center");
		header.header("Methods").style("text-align", "center");
		header.header("Invocations").style("text-align", "center");
		header.header("Coverage").style("text-align", "center");
		for (PageResult pr: prs) {
			if (!pr.isProxy()) {
				Row pageRow = pageTable.row();
				pageRow.cell(htmlFactory.routeLink(
						"right-panel", 
						"/"+context.getObjectPath(pr)+".html", 
						StringEscapeUtils.escapeHtml4(pr.getTitle())));
				pageRow.cell(pr.getDescription().toHTML());
				int covered = 0;
				int calls = 0;
				for (Coverage mc: pr.getCoverage()) {
					if (mc.getInvocations()!=0) {
						++covered;
					}
					calls+=mc.getInvocations();
				}
				pageRow.cell(HubUtil.blankZero(pr.getWebElements().size())).style("text-align", "center");
				pageRow.cell(HubUtil.blankZero(pr.getCoverage().size())).style("text-align", "center");
				pageRow.cell(HubUtil.blankZero(calls)).style("text-align", "center");
				pageRow.cell(covered==0 ? "" : covered+MessageFormat.format(" ({0,number,#.##}%)", 100.0*covered/pr.getCoverage().size())).style("text-align", "center");
				totals[0]+=pr.getWebElements().size();
				totals[1]+=pr.getCoverage().size();
				totals[2]+=calls;
				totals[3]+=covered;
			}
		}
		Row totalsRow = pageTable.row().style(Style.INFO);
		totalsRow.cell("Total").colspan(2);
		totalsRow.cell(HubUtil.blankZero(totals[0])).attribute("align", "center");
		totalsRow.cell(HubUtil.blankZero(totals[1])).attribute("align", "center");
		totalsRow.cell(HubUtil.blankZero(totals[2])).attribute("align", "center");
		totalsRow.cell(totals[3]==0 ? "" : totals[3]+MessageFormat.format(" ({0,number,#.##}%)", 100.0*totals[3]/totals[1])).attribute("align", "center");
		return pageTable.length()==0 ? null : pageTable.toString();
	}
	
	private Object testsLeftPanel(HttpContext context, HTMLFactory htmlFactory) throws Exception {
		List<TestResult> sortedResults = new ArrayList<>(getTestResults());
		Collections.sort(sortedResults, new Comparator<TestResult>() {

			@Override
			public int compare(TestResult o1, TestResult o2) {
				String t1 = o1.getTitle();
				String t2 = o2.getTitle();
				if (t1==null) {
					if (t2==null) {
						return o1.getQualifiedName().compareTo(o2.getQualifiedName());
					}
					return 1;
				}
				if (t2==null) {
					return -1;
				}
				return t1.compareTo(t2);
			}
		});
		
		LinkGroup linkGroup = htmlFactory.linkGroup();
		for (TestResult tr: sortedResults) {
			linkGroup.item(
					tr.getIcon(htmlFactory) +  "&nbsp;" + StringEscapeUtils.escapeHtml4(tr.getTitle()), 
					htmlFactory.routeRef("right-panel",	"/"+context.getObjectPath(tr)+".html"),
					null, 
					false);
		}
		return linkGroup;
	}
			
	@Override
	public Totals getTotals() {
		final Map<String, int[]> stats = new HashMap<>();
		
		final Map<String, Integer> pageSizeMap = new HashMap<>();
		final Map<String, Map<String, int[]>> pageMethodsMap = new HashMap<>(); // qName -> Method -> calls
		final Map<String, Map<String, int[]>> actorMethodsMap = new HashMap<>(); // qName -> Method -> calls
		
		for (TestResult result: getTestResults()) {
			HubUtil.aggregateStats(result, stats);
		}
		
		for (PageResult pr: getPageResults()) {
			if (!pr.isProxy()) {
				Integer ps = pageSizeMap.get(pr.getQualifiedName());
				if (ps==null || pr.getWebElements().size()>ps) {
					pageSizeMap.put(pr.getQualifiedName(), pr.getWebElements().size());
				}
				Map<String, int[]> mm = pageMethodsMap.get(pr.getQualifiedName());
				if (mm==null) {
					mm = new HashMap<>();
					pageMethodsMap.put(pr.getQualifiedName(), mm);
				}
				for (Coverage pm: pr.getCoverage()) {
					int[] mc = mm.get(pm.getQualifiedName());
					if (mc==null) {
						mm.put(pm.getQualifiedName(), new int[] {pm.getInvocations()});
					} else {
						mc[0]+=pm.getInvocations();
					}
				}
			}
		}
		for (ActorResult ar: getActorResults()) {
			if (!ar.isProxy()) {
				Map<String, int[]> mm = actorMethodsMap.get(ar.getQualifiedName());
				if (mm==null) {
					mm = new HashMap<>();
					actorMethodsMap.put(ar.getQualifiedName(), mm);
				}
				for (Coverage am: ar.getCoverage()) {
					int[] mc = mm.get(am.getQualifiedName());
					if (mc==null) {
						mm.put(am.getQualifiedName(), new int[] {am.getInvocations()});
					} else {
						mc[0]+=am.getInvocations();
					}
				}
			}
		}
		
		return new Totals() {

			@Override
			public int getPass() {
				int[] pass = stats.get("Pass");
				return pass==null ? 0 : pass[0];
			}

			@Override
			public int getFail() {
				int[] fail = stats.get("Fail");
				return fail==null ? 0 : fail[0];
			}

			@Override
			public int getError() {
				int[] error = stats.get("Error");
				return error==null ? 0 : error[0];
			}

			@Override
			public int getPending() {
				int[] pending = stats.get("Pending");
				return pending==null ? 0 : pending[0];
			}

			@Override
			public int getActorClasses() {
				return actorMethodsMap.size();
			}

			@Override
			public int getActorMethods() {
				int ret = 0;
				for (Map<String, int[]> v: actorMethodsMap.values()) {
					ret+=v.size();
				}
				return ret;
			}

			@Override
			public int getActorCoverage() {
				int ret = 0;
				for (Map<String, int[]> v: actorMethodsMap.values()) {
					for (int[] vv: v.values()) {
						if (vv[0]>0) {
							++ret;
						}
					}
				}
				return ret;
			}

			@Override
			public int getPageClasses() {
				return pageMethodsMap.size();
			}

			@Override
			public int getPageMethods() {
				int ret = 0;
				for (Map<String, int[]> v: pageMethodsMap.values()) {
					ret+=v.size();
				}
				return ret;
			}

			@Override
			public int getPageCoverage() {
				int ret = 0;
				for (Map<String, int[]> v: pageMethodsMap.values()) {
					for (int[] vv: v.values()) {
						if (vv[0]>0) {
							++ret;
						}
					}
				}
				return ret;
			}

			@Override
			public int getPageElements() {
				int ret = 0;
				for (Integer v: pageSizeMap.values()) {
					ret+=v;
				}
				return ret;
			}
			
		};
	}
	
	@Override
	public void summaryRow(HttpContext context, Row aRow) throws Exception {
		HTMLFactory htmlFactory = context.adapt(HTMLFactory.class);
		aRow.cell(htmlFactory.routeLink(
				"main", 
				"/"+context.getObjectPath(this)+".html", 
				StringEscapeUtils.escapeHtml4(getTitle()))); 
//		aRow.cell(getDescription());
		aRow.cell(getNode()).style("text-align", "center");
		aRow.cell(new SimpleDateFormat(DATE_PATTERN).format(new Date(getTimestamp()))).style("text-align", "center");	
		
		Totals totals = getTotals();
		
		aRow.cell(HubUtil.blankZero(totals.getPass())).style("text-align", "center");
		Cell failCell = aRow.cell(HubUtil.blankZero(totals.getFail())).style("text-align", "center");
		Cell errorCell = aRow.cell(HubUtil.blankZero(totals.getError())).style("text-align", "center");
		if (totals.getError()>0) {
			errorCell.style("font-weight", "bold").style("color", HTMLColor.DarkOrange);
		}
		aRow.cell(HubUtil.blankZero(totals.getPending())).style("text-align", "center");
		
		if (totals.getFail()>0) {
			failCell.style("font-weight", "bold").style("color", "red");
			aRow.style(Style.DANGER);
		} else if (totals.getError()>0) {
			aRow.style(Style.WARNING);			
		}

		aRow.cell(HubUtil.blankZero(totals.getActorClasses())).style("text-align", "center");
		aRow.cell(HubUtil.blankZero(totals.getActorMethods())).style("text-align", "center");
		aRow.cell(totals.getActorMethods()==0 ? "" : totals.getActorCoverage()+" ("+(100*totals.getActorCoverage()/Math.max(1, totals.getActorMethods()))+"%)").style("text-align", "center");
		
		aRow.cell(HubUtil.blankZero(totals.getPageClasses())).style("text-align", "center");
		aRow.cell(HubUtil.blankZero(totals.getPageMethods())).style("text-align", "center");
		aRow.cell(HubUtil.blankZero(totals.getPageElements())).style("text-align", "center");					
		aRow.cell(totals.getPageMethods()==0 ? "" : totals.getPageCoverage()+" ("+(100*totals.getPageCoverage()/Math.max(1, totals.getPageMethods()))+"%)").style("text-align", "center");
	}
	
} //TestSessionImpl
