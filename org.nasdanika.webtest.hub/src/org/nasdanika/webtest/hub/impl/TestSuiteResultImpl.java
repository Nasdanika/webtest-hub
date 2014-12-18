/**
 */
package org.nasdanika.webtest.hub.impl;

import java.io.BufferedReader;
import java.util.concurrent.TimeUnit;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.emf.cdo.CDOLock;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.HTMLFactory.Glyphicon;
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
	
		return this.toString();
	}	
	
} //TestSuiteResultImpl
