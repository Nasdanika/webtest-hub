/**
 */
package org.nasdanika.webtest.hub.impl;

import java.io.OutputStream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.nasdanika.core.ContextParameter;
import org.nasdanika.web.HttpServletRequestContext;
import org.nasdanika.web.RouteMethod;
import org.nasdanika.webtest.hub.HubPackage;
import org.nasdanika.webtest.hub.OperationResult;
import org.nasdanika.webtest.hub.Screenshot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Screenshot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.impl.ScreenshotImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.ScreenshotImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.ScreenshotImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.ScreenshotImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.ScreenshotImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.ScreenshotImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.ScreenshotImpl#getDigest <em>Digest</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.ScreenshotImpl#getBeforeOperations <em>Before Operations</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.ScreenshotImpl#getAfterOperations <em>After Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScreenshotImpl extends CDOObjectImpl implements Screenshot {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScreenshotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HubPackage.Literals.SCREENSHOT;
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
	public byte[] getContent() {
		return (byte[])eGet(HubPackage.Literals.SCREENSHOT__CONTENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(byte[] newContent) {
		eSet(HubPackage.Literals.SCREENSHOT__CONTENT, newContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTimestamp() {
		return (Long)eGet(HubPackage.Literals.SCREENSHOT__TIMESTAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(long newTimestamp) {
		eSet(HubPackage.Literals.SCREENSHOT__TIMESTAMP, newTimestamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return (Integer)eGet(HubPackage.Literals.SCREENSHOT__HEIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		eSet(HubPackage.Literals.SCREENSHOT__HEIGHT, newHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return (Integer)eGet(HubPackage.Literals.SCREENSHOT__WIDTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		eSet(HubPackage.Literals.SCREENSHOT__WIDTH, newWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContentType() {
		return (String)eGet(HubPackage.Literals.SCREENSHOT__CONTENT_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentType(String newContentType) {
		eSet(HubPackage.Literals.SCREENSHOT__CONTENT_TYPE, newContentType);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLength() {
		return (Integer)eGet(HubPackage.Literals.SCREENSHOT__LENGTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(int newLength) {
		eSet(HubPackage.Literals.SCREENSHOT__LENGTH, newLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getDigest() {
		return (byte[])eGet(HubPackage.Literals.SCREENSHOT__DIGEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDigest(byte[] newDigest) {
		eSet(HubPackage.Literals.SCREENSHOT__DIGEST, newDigest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OperationResult> getBeforeOperations() {
		return (EList<OperationResult>)eGet(HubPackage.Literals.SCREENSHOT__BEFORE_OPERATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OperationResult> getAfterOperations() {
		return (EList<OperationResult>)eGet(HubPackage.Literals.SCREENSHOT__AFTER_OPERATIONS, true);
	}

	/**
	 * Redirects to the principal home page.
	 * @param context
	 * @throws Exception
	 */
	@RouteMethod(pattern="L[\\d]+\\.png")
	public void img(@ContextParameter HttpServletRequestContext context) throws Exception {
		context.getResponse().setContentType(getContentType());
		try (OutputStream out=context.getResponse().getOutputStream()) {
			out.write(getContent());
		}
	}	
	

} //ScreenshotImpl
