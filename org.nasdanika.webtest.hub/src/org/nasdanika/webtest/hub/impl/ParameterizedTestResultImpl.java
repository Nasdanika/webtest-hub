/**
 */
package org.nasdanika.webtest.hub.impl;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringEscapeUtils;
import org.eclipse.emf.cdo.CDOLock;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.json.JSONArray;
import org.json.JSONObject;
import org.nasdanika.core.Context;
import org.nasdanika.core.ContextParameter;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.HTMLFactory.Glyphicon;
import org.nasdanika.html.HTMLFactory.Placement;
import org.nasdanika.html.Table;
import org.nasdanika.html.Table.Row;
import org.nasdanika.html.Tag;
import org.nasdanika.html.Tag.TagName;
import org.nasdanika.html.UIElement.HTMLColor;
import org.nasdanika.html.UIElement.Style;
import org.nasdanika.web.HttpServletRequestContext;
import org.nasdanika.web.RouteMethod;
import org.nasdanika.webtest.hub.Descriptor;
import org.nasdanika.webtest.hub.HubFactory;
import org.nasdanika.webtest.hub.HubPackage;
import org.nasdanika.webtest.hub.ParameterizedTestResult;
import org.nasdanika.webtest.hub.TestClassResult;
import org.nasdanika.webtest.hub.TestMethodResult;
import org.nasdanika.webtest.hub.TestResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameterized Test Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.impl.ParameterizedTestResultImpl#getParameterDescriptors <em>Parameter Descriptors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterizedTestResultImpl extends TestSuiteResultImpl implements ParameterizedTestResult {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterizedTestResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HubPackage.Literals.PARAMETERIZED_TEST_RESULT;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Descriptor> getParameterDescriptors() {
		return (EList<Descriptor>)eGet(HubPackage.Literals.PARAMETERIZED_TEST_RESULT__PARAMETER_DESCRIPTORS, true);
	}

	@Override
	public Object getIcon(HTMLFactory htmlFactory) {
		return htmlFactory.glyphicon(Glyphicon.tasks);
	}	
	
	@RouteMethod(pattern="L?[\\d]+\\.html")
	public String home(@ContextParameter HttpServletRequestContext context) throws Exception {
		HTMLFactory htmlFactory = context.adapt(HTMLFactory.class);
		if (!context.authorize(this, "read", null, null)) {
			return htmlFactory.alert(Style.DANGER, false, "Access Denied!").toString(); 
		}	
		CDOLock readLock = cdoReadLock();
		if (readLock.tryLock(15, TimeUnit.SECONDS)) {
			try {
				Table classTable = htmlFactory.table().bordered();
				Row header = classTable.row().style(Style.INFO);
				int[] totals = {0, 0, 0, 0};
				
				header.header("#").rowspan(2);
				
				header.header("Parameters").colspan(getParameterDescriptors().size()).style("text-align", "center").attribute("nowrap", "true");
			
				header.header(htmlFactory.glyphicon(Glyphicon.ok), "&nbsp;Pass").rowspan(2).style("text-align", "center").attribute("nowrap", "true").style("color", HTMLColor.Green);
				header.header(htmlFactory.glyphicon(Glyphicon.remove), "&nbsp;Fail").rowspan(2).style("text-align", "center").attribute("nowrap", "true").style("color", HTMLColor.Red);
				header.header(htmlFactory.glyphicon(Glyphicon.warning_sign), "&nbsp;Error").rowspan(2).style("text-align", "center").attribute("nowrap", "true").style("color", HTMLColor.DarkOrange);
				header.header(htmlFactory.glyphicon(Glyphicon.time), "&nbsp;Pending").rowspan(2).style("text-align", "center").attribute("nowrap", "true").style("color", "gray");
				
				StringBuilder tooltipInitializers = new StringBuilder();
				
				Row paramNamesRow = classTable.row().style(Style.INFO);
				for (Descriptor pd: getParameterDescriptors()) {
					Object prmHeader = pd.getTitle();
					String descriptionHtml = pd.getDescription().toHTML();
					if (descriptionHtml != null && descriptionHtml.trim().length()!=0) {
						prmHeader = htmlFactory.span(prmHeader);
						htmlFactory.tooltip((Tag) prmHeader, Placement.TOP, descriptionHtml);
						((Tag) prmHeader).id("parameterHeader_"+htmlFactory.nextId());
						tooltipInitializers.append("$('#"+((Tag) prmHeader).getId()+"').tooltip({html:true});");
					}
					paramNamesRow.header(prmHeader);
				}
				int testIdx = 1;
				for (TestResult tr: getChildren()) {
					TestClassResult tcr = (TestClassResult) tr;
					if (!tcr.getMethodResults().isEmpty()) {
						Row classRow = classTable.row();
						classRow.cell(htmlFactory.routeLink("right-panel", "/"+context.getObjectPath(tr)+".html", testIdx++));

						TestMethodResult firstTest = tcr.getMethodResults().get(0);
						int idx = 0;
						for (Object prm: firstTest.getParameters()) {
							classRow.cell(prm);
							idx++;
						}
						
						EMap<String, Integer> stats = tcr.getStats();
						// TODO - parameter values, render to HTML.
						classRow.cell(HubUtil.blankZero(stats.get("Pass"))).attribute("align", "center");
						classRow.cell(HubUtil.blankZero(stats.get("Fail"))).attribute("align", "center").style("color", HTMLColor.Red);
						classRow.cell(HubUtil.blankZero(stats.get("Error"))).attribute("align", "center").style("color", HTMLColor.DarkOrange);
						classRow.cell(HubUtil.blankZero(stats.get("Pending"))).attribute("align", "center");

						totals[0]+=stats.get("Pass")==null ? 0 : stats.get("Pass");
						totals[0]+=stats.get("Fail")==null ? 0 : stats.get("Fail");
						totals[0]+=stats.get("Error")==null ? 0 : stats.get("Error");
						totals[0]+=stats.get("Pending")==null ? 0 : stats.get("Pending");
					}
				}
				Row totalsRow = classTable.row().style(Style.INFO);
				totalsRow.cell("Total").colspan(getParameterDescriptors().size()+1);
				totalsRow.cell(HubUtil.blankZero(totals[0])).attribute("align", "center");
				totalsRow.cell(HubUtil.blankZero(totals[1])).attribute("align", "center").style("color", HTMLColor.Red);
				totalsRow.cell(HubUtil.blankZero(totals[2])).attribute("align", "center").style("color", HTMLColor.DarkOrange);
				totalsRow.cell(HubUtil.blankZero(totals[3])).attribute("align", "center");
												
				return 	htmlFactory.inject("#breadcrumbs-container", createBreadcrumbs(context, true)).toString() + 
						htmlFactory.tag("H3", getIcon(htmlFactory), " ", StringEscapeUtils.escapeHtml4(getTitle())) +
						getDescription().toHTML() +
						"<P/>" +
						classTable +
						(tooltipInitializers.length()==0 ? "" : htmlFactory.tag(TagName.script, tooltipInitializers)); 
			} finally {
				readLock.unlock();
			}
		} else {			
			return htmlFactory.alert(Style.DANGER, false, "System is overloaded, please try again later!").toString();
		}		
	}	
	
	@Override
	public void loadJSON(JSONObject json, Context context)	throws Exception {
		super.loadJSON(json, context);
		if (json.has("parameterDescriptors")) {
			JSONArray pda = json.getJSONArray("parameterDescriptors");
			for (int i=0; i < pda.length(); ++i) {
				Descriptor pd = HubFactory.eINSTANCE.createDescriptor();
				pd.loadJSON(pda.getJSONObject(i), context);
				getParameterDescriptors().add(pd);
			}
		}
	}

} //ParameterizedTestResultImpl
