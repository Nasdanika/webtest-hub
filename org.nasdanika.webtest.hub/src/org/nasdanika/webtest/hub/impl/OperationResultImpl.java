/**
 */
package org.nasdanika.webtest.hub.impl;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringEscapeUtils;
import org.eclipse.emf.cdo.CDOLock;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.nasdanika.core.ConverterContext;
import org.nasdanika.html.Carousel;
import org.nasdanika.html.Carousel.Slide;
import org.nasdanika.html.FontAwesome.Directional;
import org.nasdanika.html.FontAwesome.WebApplication;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.HTMLFactory.Glyphicon;
import org.nasdanika.html.HTMLFactory.Placement;
import org.nasdanika.html.Table;
import org.nasdanika.html.Table.Row;
import org.nasdanika.html.Table.Row.Cell;
import org.nasdanika.html.Tag;
import org.nasdanika.html.Tag.TagName;
import org.nasdanika.html.UIElement.BootstrapColor;
import org.nasdanika.html.UIElement.Event;
import org.nasdanika.html.UIElement.Style;
import org.nasdanika.web.HttpContext;
import org.nasdanika.web.RequestMethod;
import org.nasdanika.web.RouteMethod;
import org.nasdanika.webtest.hub.ActorMethodResult;
import org.nasdanika.webtest.hub.ActorResult;
import org.nasdanika.webtest.hub.Application;
import org.nasdanika.webtest.hub.HubFactory;
import org.nasdanika.webtest.hub.HubPackage;
import org.nasdanika.webtest.hub.InitializationResult;
import org.nasdanika.webtest.hub.OperationResult;
import org.nasdanika.webtest.hub.OperationStatus;
import org.nasdanika.webtest.hub.PageMethodResult;
import org.nasdanika.webtest.hub.PageResult;
import org.nasdanika.webtest.hub.Screenshot;
import org.nasdanika.webtest.hub.TestMethodResult;
import org.nasdanika.webtest.hub.Throwable;
import org.nasdanika.webtest.performance.TimingBase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.impl.OperationResultImpl#getScreenshots <em>Screenshots</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.OperationResultImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.OperationResultImpl#getOperationName <em>Operation Name</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.OperationResultImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.OperationResultImpl#getBeforeTiming <em>Before Timing</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.OperationResultImpl#getBeforeScreenshot <em>Before Screenshot</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.OperationResultImpl#getAfterTiming <em>After Timing</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.OperationResultImpl#getAfterScreenshot <em>After Screenshot</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.OperationResultImpl#getFailure <em>Failure</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.OperationResultImpl#getError <em>Error</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.OperationResultImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.OperationResultImpl#getFinish <em>Finish</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.OperationResultImpl#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationResultImpl extends DescriptorImpl implements OperationResult {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HubPackage.Literals.OPERATION_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Screenshot> getScreenshots() {
		return (EList<Screenshot>)eGet(HubPackage.Literals.OPERATION_RESULT__SCREENSHOTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OperationResult> getChildren() {
		return (EList<OperationResult>)eGet(HubPackage.Literals.OPERATION_RESULT__CHILDREN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperationName() {
		return (String)eGet(HubPackage.Literals.OPERATION_RESULT__OPERATION_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationName(String newOperationName) {
		eSet(HubPackage.Literals.OPERATION_RESULT__OPERATION_NAME, newOperationName);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getArguments() {
		return (EList<String>)eGet(HubPackage.Literals.OPERATION_RESULT__ARGUMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingBase getBeforeTiming() {
		return (TimingBase)eGet(HubPackage.Literals.OPERATION_RESULT__BEFORE_TIMING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeforeTiming(TimingBase newBeforeTiming) {
		eSet(HubPackage.Literals.OPERATION_RESULT__BEFORE_TIMING, newBeforeTiming);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screenshot getBeforeScreenshot() {
		return (Screenshot)eGet(HubPackage.Literals.OPERATION_RESULT__BEFORE_SCREENSHOT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeforeScreenshot(Screenshot newBeforeScreenshot) {
		eSet(HubPackage.Literals.OPERATION_RESULT__BEFORE_SCREENSHOT, newBeforeScreenshot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingBase getAfterTiming() {
		return (TimingBase)eGet(HubPackage.Literals.OPERATION_RESULT__AFTER_TIMING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfterTiming(TimingBase newAfterTiming) {
		eSet(HubPackage.Literals.OPERATION_RESULT__AFTER_TIMING, newAfterTiming);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Screenshot getAfterScreenshot() {
		return (Screenshot)eGet(HubPackage.Literals.OPERATION_RESULT__AFTER_SCREENSHOT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfterScreenshot(Screenshot newAfterScreenshot) {
		eSet(HubPackage.Literals.OPERATION_RESULT__AFTER_SCREENSHOT, newAfterScreenshot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.webtest.hub.Throwable getFailure() {
		return (org.nasdanika.webtest.hub.Throwable)eGet(HubPackage.Literals.OPERATION_RESULT__FAILURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailure(org.nasdanika.webtest.hub.Throwable newFailure) {
		eSet(HubPackage.Literals.OPERATION_RESULT__FAILURE, newFailure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.webtest.hub.Throwable getError() {
		return (org.nasdanika.webtest.hub.Throwable)eGet(HubPackage.Literals.OPERATION_RESULT__ERROR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setError(org.nasdanika.webtest.hub.Throwable newError) {
		eSet(HubPackage.Literals.OPERATION_RESULT__ERROR, newError);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getStart() {
		return (Long)eGet(HubPackage.Literals.OPERATION_RESULT__START, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(long newStart) {
		eSet(HubPackage.Literals.OPERATION_RESULT__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getFinish() {
		return (Long)eGet(HubPackage.Literals.OPERATION_RESULT__FINISH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinish(long newFinish) {
		eSet(HubPackage.Literals.OPERATION_RESULT__FINISH, newFinish);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationStatus getStatus() {
		return (OperationStatus)eGet(HubPackage.Literals.OPERATION_RESULT__STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(OperationStatus newStatus) {
		eSet(HubPackage.Literals.OPERATION_RESULT__STATUS, newStatus);
	}

	private static TestMethodResult getTestMethodResultContainer(EObject obj) {
		if (obj instanceof TestMethodResult) {
			return (TestMethodResult) obj;
		}
		return obj==null ? null : getTestMethodResultContainer(obj.eContainer());
	}

	@Override
	public void loadJSON(JSONObject json, ConverterContext context)	throws Exception {
		super.loadJSON(json, context);
		if (json.has("operationName")) {
			setOperationName(json.getString("operationName"));
		}
		if (json.has("arguments")) {
			JSONArray args = json.getJSONArray("arguments");
			for (int i=0; i<args.length(); ++i) {
				getArguments().add(args.getString(i));
			}
		}
		TestMethodResult tmrc = getTestMethodResultContainer(this);
		if (tmrc!=null) {
			if (json.has("beforePerformance")) {
				setBeforeTiming(tmrc.loadTiming(json.getJSONObject("beforePerformance")));
			}
			if (json.has("afterPerformance")) {
				setAfterTiming(tmrc.loadTiming(json.getJSONObject("afterPerformance")));
			}
		}
		if (json.has("start")) {
			setStart(json.getLong("start"));
		}
		if (json.has("finish")) {
			setFinish(json.getLong("finish"));
		}
		if (json.has("status")) {
			setStatus(OperationStatus.valueOf(json.getString("status")));
		}
		if (json.has("error")) {
			Throwable err = HubFactory.eINSTANCE.createThrowable();
			setError(err);
			err.loadJSON(json.getJSONObject("error"), context);
		}
		if (json.has("failure")) {
			Throwable failure = HubFactory.eINSTANCE.createThrowable();
			setFailure(failure);
			failure.loadJSON(json.getJSONObject("failure"), context);
		}
		if (json.has("beforeScreenshot")) {
			setBeforeScreenshot((Screenshot) eResource().getEObject(json.getString("beforeScreenshot")));
		}
		if (json.has("afterScreenshot")) {
			setAfterScreenshot((Screenshot) eResource().getEObject(json.getString("afterScreenshot")));
		}
		
		HubUtil.sessionProgress(this);
	}
	
	@RouteMethod(pattern="L[\\d]+", value=RequestMethod.PUT)
	public void update(final HttpContext context) throws Exception {
		if (HubUtil.authorize(context, this)) {
			CDOLock writeLock = cdoWriteLock();
			if (writeLock.tryLock(5, TimeUnit.SECONDS)) {
				try (BufferedReader reader = context.getRequest().getReader()) {
					JSONObject json = new JSONObject(new JSONTokener(reader));
					if (json.has("beforeScreenshot")) {
						setBeforeScreenshot((Screenshot) eResource().getEObject(json.getString("beforeScreenshot")));
					}
					if (json.has("afterScreenshot")) {
						setAfterScreenshot((Screenshot) eResource().getEObject(json.getString("afterScreenshot")));
					}				
				} finally {
					writeLock.unlock();
				}
			} else {			
				context.getResponse().sendError(HttpServletResponse.SC_SERVICE_UNAVAILABLE, "Cannot acquire a write lock");
			}			
		}
	}	

	@RouteMethod(pattern="L[\\d]+/children", value=RequestMethod.POST)
	public void createChild(final HttpContext context) throws Exception {
		if (HubUtil.authorize(context, this)) {
			CDOLock writeLock = cdoWriteLock();
			if (writeLock.tryLock(5, TimeUnit.SECONDS)) {
				try (InputStreamReader reader = new InputStreamReader(new GZIPInputStream(context.getRequest().getInputStream()))) {
					JSONObject json = new JSONObject(new JSONTokener(reader));
					EClassifier type = HubPackage.eINSTANCE.getEClassifier(json.getString("type"));
					OperationResult child = (OperationResult) HubFactory.eINSTANCE.create((EClass) type);
					getChildren().add(child);
					child.loadJSON(json, context);
					HubUtil.respondWithLocationAndObjectIdOnCommit(context, child);				
				} finally {
					writeLock.unlock();
				}
			} else {			
				context.getResponse().sendError(HttpServletResponse.SC_SERVICE_UNAVAILABLE, "Cannot acquire a write lock");
			}			
		}
	}
	
	private static Screenshot addScreenshot(Application app, Screenshot screenshot) {
		for (Screenshot s: app.getScreenshots()) {
			if (s.getLength()==screenshot.getLength() 
					&& Arrays.equals(s.getDigest(), screenshot.getDigest())
					&& Arrays.equals(s.getContent(), screenshot.getContent())) {
				return s;
			}
		}
		app.getScreenshots().add(screenshot);
		return screenshot;
	}
	
	@RouteMethod(pattern="L[\\d]+/screenshots", value=RequestMethod.POST)
	public void createScreenshot(final HttpContext context) throws Exception {
		if (HubUtil.authorize(context, this)) {
			Screenshot screenshot = HubFactory.eINSTANCE.createScreenshot();
			screenshot.setContentType(context.getRequest().getHeader("Content-Type"));
			screenshot.setHeight(Integer.parseInt(context.getRequest().getHeader("Height")));
			screenshot.setWidth(Integer.parseInt(context.getRequest().getHeader("Width")));
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			try (InputStream in = context.getRequest().getInputStream()) {
				for (int data = in.read(); data!=-1; data = in.read()) {
					baos.write(data);					
				}
			}
			baos.close();
			byte[] imageBytes = baos.toByteArray();
			screenshot.setContent(imageBytes);
			screenshot.setDigest(MessageDigest.getInstance("SHA").digest(imageBytes));
			screenshot.setLength(imageBytes.length);
			screenshot.setTimestamp(System.currentTimeMillis());
			
			Application app = HubUtil.getContainer(this, Application.class);
			CDOLock writeLock = app.cdoWriteLock();
			if (writeLock.tryLock(10, TimeUnit.SECONDS)) {
				try {
					screenshot = addScreenshot(app, screenshot);
					getScreenshots().add(screenshot);			
					HubUtil.sessionProgress(screenshot);
					HubUtil.respondWithLocationAndObjectIdOnCommit(context, screenshot);				
				} finally {
					writeLock.unlock();
				}
			} else {			
				context.getResponse().sendError(HttpServletResponse.SC_SERVICE_UNAVAILABLE, "Cannot acquire a write lock");
			}			
		}
	}
	
	protected Object routeLink(HttpContext context, boolean doStyle) throws Exception {
		HTMLFactory htmlFactory = context.adapt(HTMLFactory.class);		
		String methodDetailsLocation = "/"+context.getObjectPath(this) + ".html";
		if (OperationStatus.FAIL.equals(getStatus())) {
			Tag routeLink = htmlFactory.routeLink(
					"right-panel", 
					methodDetailsLocation, 
					htmlFactory.glyphicon(Glyphicon.remove), 
					"&nbsp;", 
					StringEscapeUtils.escapeHtml4(getTitle()));
			
			return doStyle ? routeLink.style("color", BootstrapColor.DANGER.code) : routeLink;
		}
		
		if (OperationStatus.ERROR.equals(getStatus())) {
			Tag routeLink = htmlFactory.routeLink(
					"right-panel", 
					methodDetailsLocation, 
					htmlFactory.glyphicon(Glyphicon.warning_sign), 
					"&nbsp;", 
					StringEscapeUtils.escapeHtml4(getTitle()));
			return doStyle ? routeLink.style("color", BootstrapColor.WARNING.code) : routeLink;
		}		
		
		if (OperationStatus.PENDING.equals(getStatus())) { // Only the first screenshot or no calls to actor/page methods.
			Tag routeLink = htmlFactory.span(
					htmlFactory.glyphicon(Glyphicon.time), 
					"&nbsp;", 
					StringEscapeUtils.escapeHtml4(getTitle()));				
			return doStyle ? routeLink.style("color", BootstrapColor.GRAY.code) : routeLink;
			
		}
		
		Tag routeLink = htmlFactory.routeLink(
				"right-panel", 
				methodDetailsLocation, 
				htmlFactory.glyphicon(Glyphicon.ok), 
				"&nbsp;", 
				StringEscapeUtils.escapeHtml4(getTitle()));
		return doStyle ? routeLink.style("color", BootstrapColor.SUCCESS.code) : routeLink;
	}
		
	@Override
	public void genRow(HttpContext context, Table methodTable) throws Exception {
		Row row = methodTable.row();
		switch (getStatus()) {
		case ERROR:
			row.style(Style.WARNING);
			break;
		case FAIL:
			row.style(Style.DANGER);
			break;
		case PASS:
			row.style(Style.SUCCESS);
			break;
		case PENDING:
			row.style(Style.DEFAULT);
			break;
		default:
			break;
		
		}
		row.cell(routeLink(context, false));
		genDescriptionAndDurationCells(context.adapt(HTMLFactory.class), row);
	}
	
	@Override
	public void genRows(HTMLFactory htmlFactory, Table methodTable, Object carouselId, List<Screenshot> screenshots, int indent) throws Exception {
		Row row = methodTable.row();
		if (OperationStatus.FAIL.equals(getStatus())) {
			row.style(Style.DANGER);
		} else if (OperationStatus.ERROR.equals(getStatus())) {
			row.style(Style.WARNING);
		}
		
		Object caption = getIcon(htmlFactory)+"&nbsp;";
		if (this instanceof InitializationResult) {
			caption+=StringEscapeUtils.escapeHtml4(((PageMethodResult) this).getPageResult().getTitle());			
		} else if (this instanceof PageMethodResult) {
			PageResult pr = ((PageMethodResult) this).getPageResult();
			caption+=StringEscapeUtils.escapeHtml4(pr.getTitle())+"&nbsp;"+htmlFactory.fontAwesome().directional(Directional.caret_right)+"&nbsp;";
		} else if (this instanceof ActorMethodResult) {
			ActorResult ar = ((ActorMethodResult) this).getActorResult();
			caption+=StringEscapeUtils.escapeHtml4(ar.getTitle())+"&nbsp;"+htmlFactory.fontAwesome().directional(Directional.caret_right)+"&nbsp;";			
		}
		caption += StringEscapeUtils.escapeHtml4(getTitle());
		int slideIdx = -1;
		Screenshot beforeScreenshot = getBeforeScreenshot();
		if (beforeScreenshot!=null) {
			slideIdx = screenshots.indexOf(beforeScreenshot); 
		}
		Screenshot afterScreenshot = getAfterScreenshot();
		if (slideIdx==-1 && afterScreenshot!=null) {
			slideIdx = screenshots.indexOf(afterScreenshot);
		}
		if (slideIdx!=-1) {
			caption = htmlFactory.link("#carousel_"+carouselId, caption).on(Event.click, "jQuery('#"+carouselId+"').carousel("+slideIdx+"); return true;");
		}
		row.cell(caption).style("padding-left", (indent*30+5)+"px");
		
		genDescriptionAndDurationCells(htmlFactory, row);
		
		for (OperationResult ch: getChildren()) {
			ch.genRows(htmlFactory, methodTable, carouselId, screenshots, indent+1);
		}
	}
	
	private void genDescriptionAndDurationCells(HTMLFactory htmlFactory, Row row) {
		Cell descriptionCell = row.cell();
		descriptionCell.content(getDescription().toHTML());
		if (getFailure()!=null) {
			descriptionCell.content(getFailure().toCollapsible(htmlFactory, Style.DANGER));
		} else if (getError()!=null) {
			descriptionCell.content(getError().toCollapsible(htmlFactory, Style.WARNING));			
		}
		
		long duration = getFinish() - getStart();
		if (duration<1000) {
			row.cell(duration, " ms").style("text-align", "right");
		} else {
			row.cell(MessageFormat.format("{0,number,#.###} sec", new Object[] {duration/1000.0})).style("text-align", "right");
		}
	}
	
//	protected String format(String str) {
//		if (str==null || getArguments().isEmpty()) {
//			return str;
//		}
//		return MessageFormat.format(str, getArguments().toArray());
//	}	
	
	@RouteMethod(pattern="L?[\\d]+\\.html")
	public String home(HttpContext context) throws Exception {
		HTMLFactory htmlFactory = context.adapt(HTMLFactory.class);
		if (!context.authorize(this, "read", null, null)) {
			return htmlFactory.alert(Style.DANGER, false, "Access Denied!").toString(); 
		}	
		CDOLock readLock = cdoReadLock();
		if (readLock.tryLock(15, TimeUnit.SECONDS)) {
			try {
				
				StringBuilder initScript = new StringBuilder();
				Carousel screenshotCarousel = htmlFactory.carousel()
						.ride(false)
						.indicatorsBackground(BootstrapColor.GRAY)
						.attribute("data-interval", "false")
						.id(htmlFactory.nextId()+"_screenshotCarousel");
				
				String opId = HubUtil.cdoIDtoString(cdoID());
				for (Screenshot se: getScreenshots()) {
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
				
				Table methodTable = htmlFactory.table().bordered();
				Row headerRow = methodTable.row().style(Style.INFO);
				headerRow.header(htmlFactory.glyphicon(Glyphicon.cog), " Method").style("text-align", "center");
				headerRow.header(htmlFactory.glyphicon(Glyphicon.file), " Description").style("text-align", "center");
				headerRow.header(htmlFactory.glyphicon(Glyphicon.time), " Duration").style("text-align", "center");
				genRows(htmlFactory, methodTable, screenshotCarousel.getId(), getScreenshots(), 0);
				
				// TODO - parameters - method to override.
				
				return 	htmlFactory.tag(TagName.h3, getIcon(htmlFactory), "&nbsp;", StringEscapeUtils.escapeHtml4(getTitle())).toString() +
						htmlFactory.tag(TagName.a).attribute("name", "carousel_"+screenshotCarousel.getId()) +
						screenshotCarousel +
						methodTable +
						(initScript.length()>0 ? htmlFactory.tag(TagName.script, initScript) : "");

			} finally {
				readLock.unlock();
			}
		} else {			
			return htmlFactory.alert(Style.DANGER, false, "System is overloaded, please try again later!").toString();
		}			
	}	

	@Override
	public Object getIcon(HTMLFactory htmlFactory) throws Exception {
		return htmlFactory.fontAwesome().webApplication(WebApplication.cog);
	}

} //OperationResultImpl
