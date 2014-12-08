/**
 */
package org.nasdanika.webtest.hub.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
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
import org.nasdanika.html.FontAwesome.Directional;
import org.nasdanika.html.Fragment;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.HTMLFactory.Glyphicon;
import org.nasdanika.html.Table.Row;
import org.nasdanika.html.UIElement.DeviceSize;
import org.nasdanika.html.UIElement.Style;
import org.nasdanika.web.HttpContext;
import org.nasdanika.web.RequestMethod;
import org.nasdanika.web.RouteMethod;
import org.nasdanika.webtest.hub.ActorResult;
import org.nasdanika.webtest.hub.Application;
import org.nasdanika.webtest.hub.HubFactory;
import org.nasdanika.webtest.hub.HubPackage;
import org.nasdanika.webtest.hub.OperationResult;
import org.nasdanika.webtest.hub.PageResult;
import org.nasdanika.webtest.hub.Screenshot;
import org.nasdanika.webtest.hub.TestClassResult;
import org.nasdanika.webtest.hub.TestResult;
import org.nasdanika.webtest.hub.TestSession;
import org.nasdanika.webtest.hub.TestSuiteResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Session</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.impl.TestSessionImpl#getResults <em>Results</em>}</li>
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
	private static final String DATE_PATTERN = "YYYY/MM/dd HH:mm";

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
	public EList<TestResult> getResults() {
		return (EList<TestResult>)eGet(HubPackage.Literals.TEST_SESSION__RESULTS, true);
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

	@RouteMethod(pattern="L[\\d]+/results", value=RequestMethod.POST)
	public void createTestResult(final HttpContext context) throws Exception {
		if (HubUtil.authorize(context, this)) {
			CDOLock writeLock = cdoWriteLock();
			if (writeLock.tryLock(5, TimeUnit.SECONDS)) {
				try (BufferedReader reader = context.getRequest().getReader()) {
					JSONObject json = new JSONObject(new JSONTokener(reader));
					switch (json.getString("type")) {
					case "class": {
						TestResult result = HubFactory.eINSTANCE.createTestClassResult();
						getResults().add(result);
						result.loadJSON(json, context);
						HubUtil.respondWithLocationAndObjectIdOnCommit(context, result);				
						break;
					}
					case "suite": {
						TestResult result = HubFactory.eINSTANCE.createTestSuiteResult();
						getResults().add(result);
						result.loadJSON(json, context);
						HubUtil.respondWithLocationAndObjectIdOnCommit(context, result);				
						break;
					}
					case "parameterized": {
						TestResult result = HubFactory.eINSTANCE.createParameterizedTestResult();
						getResults().add(result);
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
		leftPanel.content(htmlFactory.collapsible(Style.INFO, htmlFactory.glyphicon(Glyphicon.search)+" Tests", false, generateTestsLeftPanel(context, htmlFactory, true), null));
		
		boolean hasActorResults = false;
		boolean hasPageResults = false;
		for (TestResult r: getResults()) {
			hasActorResults = hasActorResults || !r.getActorResults().isEmpty();
			hasPageResults = hasPageResults || !r.getPageResults().isEmpty();
			if (hasActorResults && hasPageResults) {
				break;
			}
		}
		if (hasActorResults) {
			leftPanel.content(htmlFactory.collapsible(Style.INFO, htmlFactory.glyphicon(Glyphicon.user)+" Actors", false, generateActorsLeftPanel(context, htmlFactory), null));
		}
		if (hasPageResults) {
			leftPanel.content(htmlFactory.collapsible(Style.INFO, htmlFactory.glyphicon(Glyphicon.list_alt)+" Pages", false, generatePagesLeftPanel(context, htmlFactory), null));
		}
		
		return htmlFactory.div(leftPanel).addClass("col-"+DeviceSize.LARGE.code+"-"+leftPanelWidth).toString()
				+ htmlFactory.div(summary(context)).id("right-panel").addClass("col-"+DeviceSize.LARGE.code+"-"+(12-leftPanelWidth)).toString()
				+htmlFactory.title(getTitle()+" "+new SimpleDateFormat(DATE_PATTERN).format(new Date(getTimestamp()))); 
	}
	
	private Object generatePagesLeftPanel(HttpContext context, HTMLFactory htmlFactory) {
		return "Pages Left Panel";
	}

	private Object generateActorsLeftPanel(HttpContext context, HTMLFactory htmlFactory) {
		return "Actors Left Panel";
	}

	@RouteMethod
	public String summary(HttpContext context) throws Exception {
		HTMLFactory htmlFactory = context.adapt(HTMLFactory.class);
		if (!context.authorize(this, "read", null, null)) {
			return htmlFactory.alert(Style.DANGER, false, "Access Denied!").toString(); 
		}	
		return "<H3>Summary</H3>"+getDescription().toHTML();
	}
	
	protected String generateTestsLeftPanel(HttpContext context, HTMLFactory htmlFactory, boolean secondLevel) throws IOException {
//		Tag container = htmlFactory.tag("dl");		
//		for (TestResult testResult: getResults()) {
//			if (testResult instanceof TestClassResult) {
//				generateTestClassResultLeftPanelEntry(
//						(TestClassResult) testResult, 
//						htmlFactory, 
//						container,
//						secondLevel);
//			} else {
//				generateTestSuiteResultLeftPanelEntry(
//						(TestSuiteResult) testResult, 
//						htmlFactory,
//						container,
//						secondLevel);				
//			}
//		}
//		return container;
		return "Tests Left Panel";
	}
		
//	protected void generateTestClassResultLeftPanelEntry(
//			TestClassResult testClassResult, 
//			HTMLFactory htmlFactory, 
//			org.nasdanika.html.Container<?> container,
//			boolean secondLevel) {
//		Tag testNameDD = htmlFactory.tag("dd", routeLink(testClassResult, htmlFactory)).style("font-weight", "bold");
//		container.content(testNameDD);
//		
//		if (secondLevel) {
//			for (TestMethodResult tmr : testClassResult.getMethodResults()) {
//				container.content(htmlFactory.tag("dt", tmr.routeLink(htmlFactory, true))
//						.style("font-weight", "normal")
//						.style("padding-left", "15px"));
//			}
//		}		
//	}
//	
//	protected void generateTestSuiteResultLeftPanelEntry(
//			TestSuiteResult testSuiteResult, 
//			HTMLFactory htmlFactory, 
//			org.nasdanika.html.Container<?> container, 
//			boolean secondLevel) {
//		
//		Tag testNameDD = htmlFactory.tag("dd", routeLink(testSuiteResult, htmlFactory)).style("font-weight", "bold");
//		container.content(testNameDD); // TODO - Link to test class summary
//		
//		if (secondLevel && !(testSuiteResult instanceof ParameterizedTestResult)) {
//			for (TestResult tr : testSuiteResult.getChildren()) {
//				container.content(htmlFactory.tag("dt", routeLink(tr, htmlFactory)).style("padding-left", "15px"));
//			}
//		}
//	}
//		
//	private Object routeLink(TestResult testResult, HTMLFactory htmlFactory) {
//		StringBuilder nameBuilder = new StringBuilder();
//		if (testResult instanceof TestClassResult) {
//			nameBuilder.append(htmlFactory.glyphicon(Glyphicon.search));
//		} else if (testResult instanceof ParameterizedTestResult) {
//			nameBuilder.append(htmlFactory.glyphicon(Glyphicon.tasks));			
//		} else {
//			nameBuilder.append(htmlFactory.glyphicon(Glyphicon.folder_open));
//		}
//		
//		nameBuilder.append("&nbsp;");			
//		nameBuilder.append(ReportGenerator.classTitle(testResult.getTestClass()));
//		
//		return htmlFactory.routeLink("right-panel", "content/class_"+testResult.getId()+".html", nameBuilder);
//	}	
	
	private void aggregateStats(TestResult result, Map<String, int[]> stats) {
		if (result instanceof TestSuiteResult) {
			for (TestResult child: ((TestSuiteResult) result).getChildren()) {
				aggregateStats(child, stats);
			} 
		} else if (result instanceof TestClassResult) {
			for (Entry<String, Integer> e: ((TestClassResult) result).getStats().entrySet()) {
				int[] sk = stats.get(e.getKey());
				if (sk==null) {
					stats.put(e.getKey(), new int[] {e.getValue()});
				} else {
					sk[0]+=e.getValue();
				}
			}
		}
	}
	
	@Override
	public Totals getTotals() {
		final Map<String, int[]> stats = new HashMap<>();
		
		final Map<String, Integer> pageSizeMap = new HashMap<>();
		final Map<String, Map<String, int[]>> pageMethodsMap = new HashMap<>(); // qName -> Method -> calls
		final Map<String, Map<String, int[]>> actorMethodsMap = new HashMap<>(); // qName -> Method -> calls
		
		for (TestResult result: getResults()) {
			aggregateStats(result, stats);
			for (PageResult pr: result.getPageResults()) {
				Integer ps = pageSizeMap.get(pr.getQualifiedName());
				if (ps==null || pr.getSize()>ps) {
					pageSizeMap.put(pr.getQualifiedName(), pr.getSize());
				}
				Map<String, int[]> mm = pageMethodsMap.get(pr.getQualifiedName());
				if (mm==null) {
					mm = new HashMap<>();
					pageMethodsMap.put(pr.getQualifiedName(), mm);
				}
				for (Entry<String, Integer> pm: pr.getCoverage()) {
					int[] mc = mm.get(pm.getKey());
					if (mc==null) {
						mm.put(pm.getKey(), new int[] {pm.getValue()});
					} else {
						mc[0]+=pm.getValue();
					}
				}
			}
			for (ActorResult ar: result.getActorResults()) {
				Map<String, int[]> mm = actorMethodsMap.get(ar.getQualifiedName());
				if (mm==null) {
					mm = new HashMap<>();
					actorMethodsMap.put(ar.getQualifiedName(), mm);
				}
				for (Entry<String, Integer> am: ar.getCoverage()) {
					int[] mc = mm.get(am.getKey());
					if (mc==null) {
						mm.put(am.getKey(), new int[] {am.getValue()});
					} else {
						mc[0]+=am.getValue();
					}
				}
			}
		}
		
		return new Totals() {

			@Override
			public int getPass() {
				return stats.get("Pass")[0];
			}

			@Override
			public int getFail() {
				return stats.get("Fail")[0];
			}

			@Override
			public int getError() {
				return stats.get("Error")[0];
			}

			@Override
			public int getPending() {
				return stats.get("Pending")[0];
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
		
		aRow.cell(totals.getPass()).style("text-align", "center");
		aRow.cell(totals.getFail()).style("text-align", "center");
		aRow.cell(totals.getError()).style("text-align", "center");
		aRow.cell(totals.getPending()).style("text-align", "center");
		
		if (totals.getFail()>0) {
			aRow.style(Style.DANGER);
		} else if (totals.getError()>0) {
			aRow.style(Style.WARNING);			
		}

		aRow.cell(totals.getActorClasses()).style("text-align", "center");
		aRow.cell(totals.getActorMethods()).style("text-align", "center");
		aRow.cell(totals.getActorCoverage()+" ("+(100*totals.getActorCoverage()/Math.max(1, totals.getActorMethods()))+"%)").style("text-align", "center");
		
		aRow.cell(totals.getPageClasses()).style("text-align", "center");
		aRow.cell(totals.getPageMethods()).style("text-align", "center");
		aRow.cell(totals.getPageElements()).style("text-align", "center");					
		aRow.cell(totals.getPageCoverage()+" ("+(100*totals.getPageCoverage()/Math.max(1, totals.getPageMethods()))+"%)").style("text-align", "center");
	}
	
} //TestSessionImpl
