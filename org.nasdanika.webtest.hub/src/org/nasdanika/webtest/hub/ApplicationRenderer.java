/**
 */
package org.nasdanika.webtest.hub;

import org.eclipse.emf.cdo.CDOObject;
import org.nasdanika.core.Command;
import org.nasdanika.html.ApplicationPanel;
import org.nasdanika.web.HttpServletRequestContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Renderer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.nasdanika.webtest.hub.HubPackage#getApplicationRenderer()
 * @model interface="true" abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface ApplicationRenderer extends CDOObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.nasdanika.webtest.hub.Exception" contextDataType="org.nasdanika.webtest.hub.HttpServletRequestContext" configuratorDataType="org.nasdanika.webtest.hub.Command<org.nasdanika.webtest.hub.HttpServletRequestContext, org.nasdanika.webtest.hub.ApplicationPanel, org.nasdanika.webtest.hub.Void>"
	 * @generated
	 */
	Object renderApplication(HttpServletRequestContext context, Command<HttpServletRequestContext, ApplicationPanel, Void> configurator) throws Exception;

} // ApplicationRenderer
