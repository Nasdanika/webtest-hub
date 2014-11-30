/**
 */
package org.nasdanika.webtest.hub.impl;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.nasdanika.core.ConverterContext;
import org.nasdanika.web.HttpContext;
import org.nasdanika.web.RequestMethod;
import org.nasdanika.web.RouteMethod;
import org.nasdanika.webtest.hub.HubFactory;
import org.nasdanika.webtest.hub.HubPackage;
import org.nasdanika.webtest.hub.OperationResult;
import org.nasdanika.webtest.hub.Screenshot;
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
 *   <li>{@link org.nasdanika.webtest.hub.impl.OperationResultImpl#isPending <em>Pending</em>}</li>
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
	public boolean isPending() {
		return (Boolean)eGet(HubPackage.Literals.OPERATION_RESULT__PENDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPending(boolean newPending) {
		eSet(HubPackage.Literals.OPERATION_RESULT__PENDING, newPending);
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
		if (json.has("beforePerformance")) {
			// TODO
		}
		if (json.has("afterPerformance")) {
			// TODO
		}
		if (json.has("start")) {
			setStart(json.getLong("start"));
		}
		if (json.has("finish")) {
			setFinish(json.getLong("finish"));
		}
		if (json.has("pending")) {
			setPending(json.getBoolean("pending"));
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
			try (BufferedReader reader = context.getRequest().getReader()) {
				JSONObject json = new JSONObject(new JSONTokener(reader));
				if (json.has("beforeScreenshot")) {
					setBeforeScreenshot((Screenshot) eResource().getEObject(json.getString("beforeScreenshot")));
				}
				if (json.has("afterScreenshot")) {
					setAfterScreenshot((Screenshot) eResource().getEObject(json.getString("afterScreenshot")));
				}				
			}
		}
	}	

	@RouteMethod(pattern="L[\\d]+/children", value=RequestMethod.POST)
	public void createChild(final HttpContext context) throws Exception {
		if (HubUtil.authorize(context, this)) {
			try (InputStreamReader reader = new InputStreamReader(new GZIPInputStream(context.getRequest().getInputStream()))) {
				JSONObject json = new JSONObject(new JSONTokener(reader));
				EClassifier type = HubPackage.eINSTANCE.getEClassifier(json.getString("type"));
				OperationResult child = (OperationResult) HubFactory.eINSTANCE.create((EClass) type);
				getChildren().add(child);
				child.loadJSON(json, context);
				HubUtil.respondWithLocationAndObjectIdOnCommit(context, child);				
			}
		}
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
			screenshot.setContent(baos.toByteArray());
			getScreenshots().add(screenshot);			
			HubUtil.sessionProgress(screenshot);
			HubUtil.respondWithLocationAndObjectIdOnCommit(context, screenshot);				
		}
	}	

} //OperationResultImpl
