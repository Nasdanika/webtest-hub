/**
 */
package org.nasdanika.webtest.hub.impl;

import java.lang.Throwable;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringEscapeUtils;
import org.eclipse.emf.cdo.CDOLock;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.json.JSONArray;
import org.json.JSONObject;
import org.nasdanika.core.Context;
import org.nasdanika.html.FontAwesome;
import org.nasdanika.html.FontAwesome.WebApplication;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.Table;
import org.nasdanika.html.Table.Row;
import org.nasdanika.html.Tag;
import org.nasdanika.html.UIElement.Style;
import org.nasdanika.webtest.hub.Descriptor;
import org.nasdanika.webtest.hub.HubPackage;
import org.nasdanika.webtest.hub.ParameterizedTestResult;
import org.nasdanika.webtest.hub.TestMethodResult;
import org.nasdanika.webtest.performance.NavigationTiming;
import org.nasdanika.webtest.performance.PerformanceFactory;
import org.nasdanika.webtest.performance.TimingBase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Method Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.impl.TestMethodResultImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.TestMethodResultImpl#getNavigationTiming <em>Navigation Timing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestMethodResultImpl extends OperationResultImpl implements TestMethodResult {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestMethodResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HubPackage.Literals.TEST_METHOD_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getParameters() {
		return (EList<String>)eGet(HubPackage.Literals.TEST_METHOD_RESULT__PARAMETERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<NavigationTiming> getNavigationTiming() {
		return (EList<NavigationTiming>)eGet(HubPackage.Literals.TEST_METHOD_RESULT__NAVIGATION_TIMING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TimingBase loadTiming(JSONObject json) throws Exception {
		CDOLock writeLock = cdoWriteLock();
		writeLock.lock(5, TimeUnit.SECONDS);
		try {
			for (NavigationTiming nt: getNavigationTiming()) {
				TimingBase ret = nt.merge(json);
				if (ret!=null) {
					return ret;
				}
			}
			NavigationTiming nt = PerformanceFactory.eINSTANCE.createNavigationTiming();
			nt.loadJSON(json, null);
			getNavigationTiming().add(nt);
			return nt;
		} finally {
			writeLock.unlock();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HubPackage.TEST_METHOD_RESULT___LOAD_TIMING__JSONOBJECT:
				try {
					return loadTiming((JSONObject)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public void loadJSON(JSONObject json, Context context)	throws Exception {
		super.loadJSON(json, context);
		if (json.has("parameters")) {
			JSONArray params = json.getJSONArray("parameters");
			for (int i=0; i<params.length(); ++i) {
				getParameters().add(params.getString(i));
			}
		}
	}
	
//	protected void generateTestMethodResultDetails(
//			TestMethodResult testMethodResult, 
//			DefaultHTMLFactory htmlFactory, 
//			File contentDir, 
//			int slideWidth) throws IOException {
//		
//		try (FileWriter testMethodResultWriter = new FileWriter(new File(contentDir, "operation_"+testMethodResult.getId()+".html"))) {
//			
//			testMethodResultWriter.write("<H3>");
//			testMethodResultWriter.write(htmlFactory.glyphicon(testMethodResult.getGlyphicon()).toString());
//			testMethodResultWriter.write(" ");
//			testMethodResultWriter.write(testMethodResult.getName());
//			testMethodResultWriter.write("</H3>");
//			
//			StringBuilder initScript = new StringBuilder();
//			Carousel screenshotCarousel = htmlFactory.carousel()
//					.ride(false)
//					.indicatorsBackground(BootstrapColor.GRAY)
//					.attribute("data-interval", "false")
//					.id(htmlFactory.nextId()+"_screenshotCarousel");
//			List<ScreenshotEntry> allScreenshots = testMethodResult.allScreenshots();
//			for (ScreenshotEntry se: allScreenshots) {
//				String imageLocation = "screenshots/screenshot_"+se.getId()+".png";
//				Tag imageTag = htmlFactory.tag("img").attribute("src", imageLocation).style("margin", "auto");
//				Tag link = htmlFactory.link(imageLocation, imageTag)
//						.attribute("data-lightbox", "test-"+testMethodResult.getId())
//						.attribute("data-title", StringEscapeUtils.escapeHtml4(se.getTextCaption()));
//				String caption = se.getHTMLCaption();
//				if (se.operationResult!=null) {
//					String descr = se.operationResult.getDescriptionHTML();
//					if (descr!=null) {
//						Tag comment = htmlFactory.glyphicon(Glyphicon.comment);
//						comment.id(htmlFactory.nextId()+"_slide_comment");
//						htmlFactory.tooltip(comment, Placement.TOP, descr);
//						initScript.append("jQuery('#"+comment.getId()+"').tooltip({html:true});");
//						caption+="&nbsp;";
//						caption+=comment;		
//					}
//				}
//				screenshotCarousel.slide()
//					.content(link)
//					.caption(htmlFactory.label(Style.INFO, caption).style("opacity", "0.7"));
//			}
//			testMethodResultWriter.write("<a name='carousel_"+screenshotCarousel.getId()+"'/>");
//			testMethodResultWriter.write(screenshotCarousel.toString());
//			
//			Table methodTable = htmlFactory.table().bordered();
//			Row headerRow = methodTable.row().style(Style.INFO);
//			headerRow.header(htmlFactory.glyphicon(Glyphicon.cog), " Method");
//			headerRow.header(htmlFactory.glyphicon(Glyphicon.file), " Description");
//			headerRow.header(htmlFactory.glyphicon(Glyphicon.time), " Duration");
//			testMethodResult.genRows(htmlFactory, methodTable, screenshotCarousel.getId(), allScreenshots, 0);
//			testMethodResultWriter.write("<P>"+methodTable.toString());			
//			if (initScript.length()>0) {
//				testMethodResultWriter.write("<script>");
//				testMethodResultWriter.write(initScript.toString());
//				testMethodResultWriter.write("</script>");				
//			}
//		}
//	}
	
	@Override
	public Object getIcon(HTMLFactory htmlFactory) throws Exception {
		FontAwesome<Tag> flask = htmlFactory.fontAwesome().webApplication(WebApplication.flask);
		switch (getStatus()) {
		case ERROR:
			flask.style(Style.WARNING);
			break;
		case FAIL:
			flask.style(Style.DANGER);
			break;
		case PASS:
			flask.style(Style.SUCCESS);
			break;
		case PENDING:
			flask.style(Style.DEFAULT);
			break;
		default:
			throw new IllegalStateException("Unexpected status: "+getStatus());		
		}
		return flask;
//		Stack stack = htmlFactory.fontAwesomeStack();
//		stack.icon(, null, false);
//	//	stack.icon(htmlFactory.fontAwesome().webApplication(WebApplication.cog).style(Style.SUCCESS), null, false);
//		return stack;
	}
	
	@Override
	protected Table createParametersTable(HTMLFactory htmlFactory) {
		if (getParameters().isEmpty()) {
			return null;
		}
		// TODO - Descriptor info - title, description, value.
		Table pTable = htmlFactory.table().bordered();
		Row hRow = pTable.row().style(Style.INFO);
		hRow.header("Name").style("text-align", "center");
		hRow.header("Value").style("text-align", "center");
		hRow.header("Description").style("text-align", "center");
		EList<Descriptor> pdl = HubUtil.getContainer(this, ParameterizedTestResult.class).getParameterDescriptors();
		int idx = 0;
		for (String p: getParameters()) {			
			Row pRow = pTable.row();
			Descriptor pd = pdl.get(idx);
			pRow.cell(pd.getTitle());
			pRow.cell(StringEscapeUtils.escapeHtml4(p));			
			pRow.cell(pd.getDescription().toHTML());
			++idx;
		}
		return 	pTable;
	}

} //TestMethodResultImpl
