/**
 */
package org.nasdanika.webtest.hub.impl;

import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.nasdanika.core.ConverterContext;
import org.nasdanika.web.HttpContext;
import org.nasdanika.web.RequestMethod;
import org.nasdanika.web.RouteMethod;
import org.nasdanika.webtest.hub.HubFactory;
import org.nasdanika.webtest.hub.HubPackage;
import org.nasdanika.webtest.hub.TestClassResult;
import org.nasdanika.webtest.hub.TestMethodResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Class Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.impl.TestClassResultImpl#getMethodResults <em>Method Results</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.TestClassResultImpl#getStats <em>Stats</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestClassResultImpl extends TestResultImpl implements TestClassResult {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestClassResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HubPackage.Literals.TEST_CLASS_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TestMethodResult> getMethodResults() {
		return (EList<TestMethodResult>)eGet(HubPackage.Literals.TEST_CLASS_RESULT__METHOD_RESULTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<String, Integer> getStats() {
		return (EMap<String, Integer>)eGet(HubPackage.Literals.TEST_CLASS_RESULT__STATS, true);
	}	
	
	@Override
	public void loadJSON(JSONObject json, ConverterContext context)	throws Exception {
		super.loadJSON(json, context);
		if (json.has("stats")) {
			JSONObject stats = json.getJSONObject("stats");
			Iterator<String> kit = stats.keys();
			while (kit.hasNext()) {
				String key = kit.next();
				getStats().put(key, stats.getInt(key));
			}
		}
	}

	@RouteMethod(pattern="L[\\d]+/methodResults", value=RequestMethod.POST)
	public void createTestResult(final HttpContext context) throws Exception {
		if (HubUtil.authorize(context, this)) {
			try (InputStreamReader reader = new InputStreamReader(new GZIPInputStream(context.getRequest().getInputStream()))) {
				TestMethodResult result = HubFactory.eINSTANCE.createTestMethodResult();
				getMethodResults().add(result);
				JSONObject json = new JSONObject(new JSONTokener(reader));
				result.loadJSON(json, context);
				HubUtil.respondWithLocationAndObjectIdOnCommit(context, result);
			}
		}
	}	
	

} //TestClassResultImpl
