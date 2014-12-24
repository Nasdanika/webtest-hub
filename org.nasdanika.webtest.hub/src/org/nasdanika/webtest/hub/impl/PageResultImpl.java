/**
 */
package org.nasdanika.webtest.hub.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringEscapeUtils;
import org.eclipse.emf.cdo.CDOLock;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.json.JSONArray;
import org.json.JSONObject;
import org.nasdanika.core.ConverterContext;
import org.nasdanika.html.Breadcrumbs;
import org.nasdanika.html.Carousel;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.Tag;
import org.nasdanika.html.Carousel.Slide;
import org.nasdanika.html.HTMLFactory.Glyphicon;
import org.nasdanika.html.HTMLFactory.Placement;
import org.nasdanika.html.Table;
import org.nasdanika.html.Table.Row;
import org.nasdanika.html.Tabs;
import org.nasdanika.html.Tag.TagName;
import org.nasdanika.html.UIElement.BootstrapColor;
import org.nasdanika.html.UIElement.Style;
import org.nasdanika.web.HttpContext;
import org.nasdanika.web.RouteMethod;
import org.nasdanika.webtest.hub.BreadcrumbsProvider;
import org.nasdanika.webtest.hub.Coverage;
import org.nasdanika.webtest.hub.HubFactory;
import org.nasdanika.webtest.hub.HubPackage;
import org.nasdanika.webtest.hub.Locator;
import org.nasdanika.webtest.hub.OperationResult;
import org.nasdanika.webtest.hub.PageMethodResult;
import org.nasdanika.webtest.hub.PageResult;
import org.nasdanika.webtest.hub.Screenshot;
import org.nasdanika.webtest.hub.WebElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.impl.PageResultImpl#getResults <em>Results</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.PageResultImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.PageResultImpl#getWebElements <em>Web Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageResultImpl extends DescriptorImpl implements PageResult {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HubPackage.Literals.PAGE_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PageMethodResult> getResults() {
		return (EList<PageMethodResult>)eGet(HubPackage.Literals.PAGE_RESULT__RESULTS, true);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Coverage> getCoverage() {
		return (EList<Coverage>)eGet(HubPackage.Literals.PAGE_RESULT__COVERAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<WebElement> getWebElements() {
		return (EList<WebElement>)eGet(HubPackage.Literals.PAGE_RESULT__WEB_ELEMENTS, true);
	}

	@Override
	public void loadJSON(JSONObject json, ConverterContext context)	throws Exception {
		super.loadJSON(json, context);
		if (json.has("webElements")) {
			JSONArray wea = json.getJSONArray("webElements");
			for (int i=0; i<wea.length(); ++i) {
				WebElement we = HubFactory.eINSTANCE.createWebElement();
				getWebElements().add(we);
				we.loadJSON(wea.getJSONObject(i), context);
			}
		}
		if (json.has("coverage")) {
			JSONArray cov = json.getJSONArray("coverage");
			for (int i=0; i<cov.length(); ++i) {
				Coverage coverage = HubFactory.eINSTANCE.createCoverage();
				getCoverage().add(coverage);
				coverage.loadJSON(cov.getJSONObject(i), context);
			}
		}
		if (json.has("results")) {
			JSONArray res = json.getJSONArray("results");
			for (int i=0; i<res.length(); ++i) {
				getResults().add((PageMethodResult) eResource().getEObject(res.getString(i)));
			}
		}
		HubUtil.sessionProgress(this);
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
				Table methodTable = htmlFactory.table().bordered();
				Row headerRow = methodTable.row().style(Style.INFO);
				headerRow.header(htmlFactory.glyphicon(Glyphicon.cog), " Method").style("text-align", "center");
				headerRow.header(htmlFactory.glyphicon(Glyphicon.file), " Description").style("text-align", "center");
				headerRow.header(htmlFactory.glyphicon(Glyphicon.file), " Calls").style("text-align", "center");
				ArrayList<Coverage> sortedCoverage = new ArrayList<>(getCoverage());
				Collections.sort(sortedCoverage, new Comparator<Coverage>() {

					@Override
					public int compare(Coverage o1, Coverage o2) {
						return o1.getTitle().compareTo(o2.getTitle());
					}
					
				});
				for (Coverage coverage: sortedCoverage) {
					Row methodRow = methodTable.row();
					methodRow.cell(StringEscapeUtils.escapeHtml4(coverage.getTitle()));
					methodRow.cell(coverage.getDescription().toHTML());				
					methodRow.cell(HubUtil.blankZero(coverage.getInvocations())).attribute("align", "right");
				}
				
				Table webElementsTable = htmlFactory.table().bordered();
				Row wehRow = webElementsTable.row().style(Style.INFO);
				wehRow.header("Web Element").rowspan(2).style("text-align", "center");
				wehRow.header("Description").rowspan(2).style("text-align", "center");
				wehRow.header("Find By").colspan(2).style("text-align", "center");
				
				Row wehRow2 = webElementsTable.row().style(Style.INFO);
				wehRow2.header("How").style("text-align", "center");
				wehRow2.header("Using").style("text-align", "center");
				
				for (WebElement we: getWebElements()) {
					Row weRow = webElementsTable.row();
					int locSize = we.getLocators().size();
					weRow.cell(StringEscapeUtils.escapeHtml4(we.getTitle())).rowspan(locSize);
					weRow.cell(we.getDescription().toHTML()).rowspan(locSize);
					for (Locator loc: we.getLocators()) {
						Row locRow = weRow.length()==2 ? weRow : webElementsTable.row();
						locRow.cell(loc.getHow()).style("text-align", "center");
						locRow.cell(StringEscapeUtils.escapeHtml4(loc.getUsing()));
					}
				}				
				
				Tabs tabs = htmlFactory.tabs();
				tabs.item("Methods", methodTable);
				tabs.item("Web Elements", webElementsTable);
				
				// TODO - screenshots carousel from method results.
				List<Screenshot> screenshots = new ArrayList<>();
				for (PageMethodResult r: getResults()) {
					Screenshot bs = r.getBeforeScreenshot();
					if (bs!=null && !screenshots.contains(bs)) {
						screenshots.add(bs);
					}
					Screenshot as = r.getAfterScreenshot();
					if (as!=null && !screenshots.contains(as)) {
						screenshots.add(as);
					}
				}
				
				if (!screenshots.isEmpty()) {									
					StringBuilder initScript = new StringBuilder();
					Carousel screenshotCarousel = htmlFactory.carousel()
							.ride(false)
							.indicatorsBackground(BootstrapColor.GRAY)
							.attribute("data-interval", "false")
							.id(htmlFactory.nextId()+"_screenshotCarousel");
					
					String opId = HubUtil.cdoIDtoString(cdoID());
					for (Screenshot se: screenshots) {
						String imageLocation = context.getObjectPath(se)+".png";
						Tag imageTag = htmlFactory.tag(TagName.img).attribute("src", imageLocation).style("margin", "auto");
						Tag link = htmlFactory.link(imageLocation, imageTag).attribute("data-lightbox", "test-"+opId);
						Slide slide = screenshotCarousel.slide().content(link);
						
						EList<OperationResult> ao = se.getAfterOperations();
						OperationResult firstOp = ao.isEmpty() ? null : ao.get(0);
						if (firstOp == null) {
							EList<OperationResult> bo = se.getBeforeOperations();
							firstOp =bo.isEmpty() ? null : bo.get(0);
						}
						if (firstOp != null) {
							String title = firstOp.getTitle();
							if (title!=null) {
								link.attribute("data-title", StringEscapeUtils.escapeHtml4(title));
							}
							StringBuilder captionBuilder = new StringBuilder();
							captionBuilder.append(firstOp.getIcon(htmlFactory));
							captionBuilder.append("&nbsp;");
							captionBuilder.append(StringEscapeUtils.escapeHtml4(title));
							String htmlDescr = firstOp.getDescription().toHTML();
							if (htmlDescr!=null && htmlDescr.trim().length()>0) {
								Tag comment = htmlFactory.glyphicon(Glyphicon.comment);
								comment.id(htmlFactory.nextId()+"_slide_comment");
								htmlFactory.tooltip(comment, Placement.TOP, htmlDescr);
								initScript.append("jQuery('#"+comment.getId()+"').tooltip({html:true});");
								captionBuilder.append("&nbsp;");
								captionBuilder.append(comment);		
							}
							slide.caption(htmlFactory.label(Style.INFO, captionBuilder).style("opacity", "0.7"));
						}
					}
					
					tabs.item("Screenshots", screenshotCarousel);
				}				
				
				return 	htmlFactory.inject("#breadcrumbs-container", createBreadcrumbs(context, true)).toString() + 
						htmlFactory.tag(TagName.h3, htmlFactory.glyphicon(Glyphicon.list_alt), " ", StringEscapeUtils.escapeHtml4(getTitle())) +
						getDescription().toHTML() +
						"<P/>" +
						tabs;
			} finally {
				readLock.unlock();
			}
		} else {			
			return htmlFactory.alert(Style.DANGER, false, "System is overloaded, please try again later!").toString();
		}			
	}	
	
	@Override
	public Breadcrumbs createBreadcrumbs(HttpContext context, boolean active) throws Exception {
		Breadcrumbs ret = ((BreadcrumbsProvider) eContainer()).createBreadcrumbs(context, false);		
		HTMLFactory htmlFactory = context.adapt(HTMLFactory.class);
		ret.item(active ? null : htmlFactory.routeRef("right-panel", "/"+context.getObjectPath(this))+".html",
				htmlFactory.glyphicon(Glyphicon.list_alt),
				"&nbsp;",
				StringEscapeUtils.escapeHtml4(getTitle()));		
		return ret;
	}
	

} //PageResultImpl
