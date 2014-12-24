/**
 */
package org.nasdanika.webtest.hub;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.WebElement#getLocators <em>Locators</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.nasdanika.webtest.hub.HubPackage#getWebElement()
 * @model
 * @generated
 */
public interface WebElement extends Descriptor {
	/**
	 * Returns the value of the '<em><b>Locators</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.webtest.hub.Locator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locators</em>' containment reference list.
	 * @see org.nasdanika.webtest.hub.HubPackage#getWebElement_Locators()
	 * @model containment="true"
	 * @generated
	 */
	EList<Locator> getLocators();

} // WebElement
