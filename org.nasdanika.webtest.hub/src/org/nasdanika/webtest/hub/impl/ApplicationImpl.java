/**
 */
package org.nasdanika.webtest.hub.impl;

import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.nasdanika.web.HttpContext;
import org.nasdanika.web.RequestMethod;
import org.nasdanika.web.RouteMethod;
import org.nasdanika.webtest.hub.Application;
import org.nasdanika.webtest.hub.HubFactory;
import org.nasdanika.webtest.hub.HubPackage;
import org.nasdanika.webtest.hub.TestSession;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.impl.ApplicationImpl#getTestSessions <em>Test Sessions</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.ApplicationImpl#getSecurityToken <em>Security Token</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationImpl extends CDOObjectImpl implements Application {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HubPackage.Literals.APPLICATION;
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
	@SuppressWarnings("unchecked")
	public EList<TestSession> getTestSessions() {
		return (EList<TestSession>)eGet(HubPackage.Literals.APPLICATION__TEST_SESSIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecurityToken() {
		return (String)eGet(HubPackage.Literals.APPLICATION__SECURITY_TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityToken(String newSecurityToken) {
		eSet(HubPackage.Literals.APPLICATION__SECURITY_TOKEN, newSecurityToken);
	}
	
	@RouteMethod(pattern="L[\\d]+/testSessions", value=RequestMethod.POST)
	public void createTestSession(final HttpContext context) throws Exception {
		if (authorize(context)) {
			final TestSession testSession = HubFactory.eINSTANCE.createTestSession();
			testSession.loadJSON(new JSONObject(new JSONTokener(context.getRequest().getReader())));
			getTestSessions().add(testSession);
			HubUtil.respondWithLocationAndObjectIdOnCommit(context, testSession);
		}
	}

	boolean authorize(final HttpContext context) throws IOException {
		if (getSecurityToken()==null) {
			return true;
		}
		
		String authorization = context.getRequest().getHeader("Authorization");
		if (authorization==null) {
			context.getResponse().sendError(HttpServletResponse.SC_UNAUTHORIZED, "No security token");
			return false;
		}
		if (!authorization.startsWith("Bearer ")) {
			context.getResponse().sendError(HttpServletResponse.SC_UNAUTHORIZED, "Invalid authorization");
			return false;
		}
		if (!authorization.substring("Bearer ".length()).equals(getSecurityToken())) {
			context.getResponse().sendError(HttpServletResponse.SC_UNAUTHORIZED, "Invalid security token");
			return false;
		}
		
		return true;
	}

} //ApplicationImpl
