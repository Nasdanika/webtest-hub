/**
 */
package org.nasdanika.webtest.hub.impl;

import java.io.OutputStream;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.nasdanika.web.HttpContext;
import org.nasdanika.web.RouteMethod;
import org.nasdanika.webtest.hub.HubPackage;
import org.nasdanika.webtest.hub.Screenshot;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Screenshot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.impl.ScreenshotImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.ScreenshotImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.ScreenshotImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.ScreenshotImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.ScreenshotImpl#getContentType <em>Content Type</em>}</li>
 * </ul>
 * </p>
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
	 * Redirects to the principal home page.
	 * @param context
	 * @throws Exception
	 */
	@RouteMethod(pattern="L[\\d]+\\.png")
	public void img(HttpContext context) throws Exception {
		context.getResponse().setContentType(getContentType());
		try (OutputStream out=context.getResponse().getOutputStream()) {
			out.write(getContent());
		}
	}	
	

} //ScreenshotImpl
