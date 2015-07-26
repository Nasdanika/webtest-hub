/**
 */
package org.nasdanika.webtest.hub.impl;

import org.apache.commons.lang3.StringEscapeUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.json.JSONArray;
import org.json.JSONObject;
import org.nasdanika.core.Context;
import org.nasdanika.webtest.hub.Description;
import org.nasdanika.webtest.hub.HubPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.impl.DescriptionImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.DescriptionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.DescriptionImpl#isHtml <em>Html</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DescriptionImpl extends CDOObjectImpl implements Description {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HubPackage.Literals.DESCRIPTION;
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
	public String getUrl() {
		return (String)eGet(HubPackage.Literals.DESCRIPTION__URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		eSet(HubPackage.Literals.DESCRIPTION__URL, newUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getValue() {
		return (EList<String>)eGet(HubPackage.Literals.DESCRIPTION__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHtml() {
		return (Boolean)eGet(HubPackage.Literals.DESCRIPTION__HTML, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHtml(boolean newHtml) {
		eSet(HubPackage.Literals.DESCRIPTION__HTML, newHtml);
	}

	@Override
	public void loadJSON(JSONObject json, Context context)	throws Exception {
		if (json.has("url")) {
			setUrl(json.getString("url"));
		}
		setHtml(json.optBoolean("html", false));
		if (json.has("value")) {
			JSONArray va = json.getJSONArray("value");
			for (int i=0; i<va.length(); ++i) {
				getValue().add(va.getString(i));
			}
		}
	}

	@Override
	public String toHTML() {
		if (getUrl()!=null && getUrl().trim().length()>0) {
			return "<a href='"+getUrl()+"'>Description</a>";
		}
		if (getValue().isEmpty()) {
			return "";
		}
		StringBuilder descriptionBuilder = new StringBuilder();
		for (String v: getValue()) {
			if (descriptionBuilder.length()>0) {
				descriptionBuilder.append(System.lineSeparator());
			}
			descriptionBuilder.append(v);
		}
		return isHtml() ? descriptionBuilder.toString() : "<PRE>"+StringEscapeUtils.escapeHtml4(descriptionBuilder.toString())+"</PRE>";
	}

} //DescriptionImpl
