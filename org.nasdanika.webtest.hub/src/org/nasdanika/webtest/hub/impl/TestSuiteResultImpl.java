/**
 */
package org.nasdanika.webtest.hub.impl;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringEscapeUtils;
import org.eclipse.emf.cdo.CDOLock;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.json.JSONObject;
import org.json.JSONTokener;
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
import org.nasdanika.webtest.hub.HubFactory;
import org.nasdanika.webtest.hub.HubPackage;
import org.nasdanika.webtest.hub.TestResult;
import org.nasdanika.webtest.hub.TestSuiteResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Suite Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.impl.TestSuiteResultImpl#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestSuiteResultImpl extends TestResultImpl implements TestSuiteResult {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestSuiteResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HubPackage.Literals.TEST_SUITE_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TestResult> getChildren() {
		return (EList<TestResult>)eGet(HubPackage.Literals.TEST_SUITE_RESULT__CHILDREN, true);
	}

	@RouteMethod(pattern="L[\\d]+/children", value=RequestMethod.POST)
	public void createTestResult(final HttpContext context) throws Exception {
		if (HubUtil.authorize(context, this)) {
			CDOLock writeLock = cdoWriteLock();
			if (writeLock.tryLock(5, TimeUnit.SECONDS)) {
				try (BufferedReader reader = context.getRequest().getReader()) {
					JSONObject json = new JSONObject(new JSONTokener(reader));
					switch (json.getString("type")) {
					case "class": {
						TestResult result = HubFactory.eINSTANCE.createTestClassResult();
						getChildren().add(result);
						result.loadJSON(json, context);
						HubUtil.respondWithLocationAndObjectIdOnCommit(context, result);				
						break;
					}
					case "suite": {
						TestResult result = HubFactory.eINSTANCE.createTestSuiteResult();
						getChildren().add(result);
						result.loadJSON(json, context);
						HubUtil.respondWithLocationAndObjectIdOnCommit(context, result);				
						break;
					}
					case "parameterized": {
						TestResult result = HubFactory.eINSTANCE.createParameterizedTestResult();
						getChildren().add(result);
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
	
	@Override
	public Object getIcon(HTMLFactory htmlFactory) {
		return htmlFactory.glyphicon(Glyphicon.folder_open);
	}
		
	@RouteMethod(pattern="L?[\\d]+\\.html")
	public String home(HttpContext context) throws Exception {
		HTMLFactory htmlFactory = context.adapt(HTMLFactory.class);
		if (!context.authorize(this, "read", null, null)) {
			return htmlFactory.alert(Style.DANGER, false, "Access Denied!").toString(); 
		}	
		CDOLock readLock = cdoReadLock();
		if (readLock.tryLock(15, TimeUnit.SECONDS)) {
			try {
				Table testResultsTable = htmlFactory.table().bordered();
				Row hRow = testResultsTable.row().style(Style.INFO);
				hRow.header("Test").style("text-align", "center").attribute("nowrap", "true");
				hRow.header("Description").style("text-align", "center").attribute("nowrap", "true");
				hRow.header(htmlFactory.glyphicon(Glyphicon.ok), "&nbsp;Pass").style("text-align", "center").attribute("nowrap", "true").style("color", HTMLColor.Green);
				hRow.header(htmlFactory.glyphicon(Glyphicon.remove), "&nbsp;Fail").style("text-align", "center").attribute("nowrap", "true").style("color", HTMLColor.Red);
				hRow.header(htmlFactory.glyphicon(Glyphicon.warning_sign), "&nbsp;Error").style("text-align", "center").attribute("nowrap", "true").style("color", HTMLColor.DarkOrange);
				hRow.header(htmlFactory.glyphicon(Glyphicon.time), "&nbsp;Pending").style("text-align", "center").attribute("nowrap", "true").style("color", "gray");
				
				List<TestResult> sortedResults = new ArrayList<>(getChildren());
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
					
					int pass = stats.get("Pass")[0];
					tPass+=pass;
					sRow.cell(HubUtil.blankZero(pass)).style("text-align", "center");
					
					int fail = stats.get("Fail")[0];
					tFail+=fail;
					Cell failCell = sRow.cell(HubUtil.blankZero(fail)).style("text-align", "center");
					
					int error = stats.get("Error")[0];
					Cell errorCell = sRow.cell(HubUtil.blankZero(error)).style("text-align", "center");
					tError+=error;
					if (error>0) {
						errorCell.style("font-weight", "bold").style("color", HTMLColor.DarkOrange);
					}
					
					int pending = stats.get("Pending")[0];
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
												
				return 	htmlFactory.inject("#breadcrumbs-container", createBreadcrumbs(context, true)).toString() + 
						htmlFactory.tag("H3", getIcon(htmlFactory), " ", StringEscapeUtils.escapeHtml4(getTitle())) +
						getDescription().toHTML() +
						"<P/>" +
						testResultsTable; 
			} finally {
				readLock.unlock();
			}
		} else {			
			return htmlFactory.alert(Style.DANGER, false, "System is overloaded, please try again later!").toString();
		}		
	}	
	
} //TestSuiteResultImpl
