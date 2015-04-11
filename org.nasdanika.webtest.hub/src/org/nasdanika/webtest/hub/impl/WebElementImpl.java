/**
 */
package org.nasdanika.webtest.hub.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.json.JSONArray;
import org.json.JSONObject;
import org.nasdanika.core.Context;
import org.nasdanika.webtest.hub.HubFactory;
import org.nasdanika.webtest.hub.HubPackage;
import org.nasdanika.webtest.hub.Locator;
import org.nasdanika.webtest.hub.WebElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.impl.WebElementImpl#getLocators <em>Locators</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WebElementImpl extends DescriptorImpl implements WebElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HubPackage.Literals.WEB_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Locator> getLocators() {
		return (EList<Locator>)eGet(HubPackage.Literals.WEB_ELEMENT__LOCATORS, true);
	}
	
	@Override
	public void loadJSON(JSONObject json, Context context)	throws Exception {
		super.loadJSON(json, context);
		if (json.has("locators")) {
			JSONArray res = json.getJSONArray("locators");
			for (int i=0; i<res.length(); ++i) {
				Locator locator = HubFactory.eINSTANCE.createLocator();
				getLocators().add(locator);
				JSONObject jl = res.getJSONObject(i);
				String how = (String) jl.keys().next();
				locator.setHow(how);
				locator.setUsing(jl.getString(how));
			}
		}
	}

} //WebElementImpl
