/**
 */
package org.nasdanika.webtest.hub.impl;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.json.JSONArray;
import org.json.JSONObject;
import org.nasdanika.core.ConverterContext;
import org.nasdanika.webtest.hub.ActorResult;
import org.nasdanika.webtest.hub.HubPackage;
import org.nasdanika.webtest.hub.OperationResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.impl.ActorResultImpl#getResults <em>Results</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.ActorResultImpl#getCoverage <em>Coverage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActorResultImpl extends DescriptorImpl implements ActorResult {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HubPackage.Literals.ACTOR_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OperationResult> getResults() {
		return (EList<OperationResult>)eGet(HubPackage.Literals.ACTOR_RESULT__RESULTS, true);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<String, Integer> getCoverage() {
		return (EMap<String, Integer>)eGet(HubPackage.Literals.ACTOR_RESULT__COVERAGE, true);
	}

	@Override
	public void loadJSON(JSONObject json, ConverterContext context)	throws Exception {
		super.loadJSON(json, context);
		if (json.has("coverage")) {
			JSONObject cov = json.getJSONObject("coverage");
			Iterator<String> kit = cov.keys();
			while (kit.hasNext()) {
				String key = kit.next();				
				getCoverage().put(key, cov.getInt(key));
			}
		}
		if (json.has("results")) {
			JSONArray res = json.getJSONArray("results");
			for (int i=0; i<res.length(); ++i) {
				getResults().add((OperationResult) eResource().getEObject(res.getString(i)));
			}
		}
		HubUtil.sessionProgress(this);
	}

} //ActorResultImpl
