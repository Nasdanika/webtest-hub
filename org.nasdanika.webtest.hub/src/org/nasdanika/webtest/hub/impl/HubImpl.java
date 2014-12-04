/**
 */
package org.nasdanika.webtest.hub.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.cdo.CDOViewContext;
import org.nasdanika.cdo.security.Group;
import org.nasdanika.cdo.security.Principal;
import org.nasdanika.cdo.security.impl.LoginPasswordProtectionDomainImpl;
import org.nasdanika.web.HttpContext;
import org.nasdanika.web.RouteMethod;
import org.nasdanika.webtest.hub.Application;
import org.nasdanika.webtest.hub.ApplicationOwner;
import org.nasdanika.webtest.hub.Guest;
import org.nasdanika.webtest.hub.Hub;
import org.nasdanika.webtest.hub.HubPackage;
import org.nasdanika.webtest.hub.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hub</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.nasdanika.webtest.hub.impl.HubImpl#getApplications <em>Applications</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.HubImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.HubImpl#getGuest <em>Guest</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.HubImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link org.nasdanika.webtest.hub.impl.HubImpl#getAdministrators <em>Administrators</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HubImpl extends LoginPasswordProtectionDomainImpl implements Hub {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HubImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HubPackage.Literals.HUB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Application> getApplications() {
		return (EList<Application>)eGet(HubPackage.Literals.APPLICATION_OWNER__APPLICATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(HubPackage.Literals.HUB__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(HubPackage.Literals.HUB__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guest getGuest() {
		return (Guest)eGet(HubPackage.Literals.HUB__GUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuest(Guest newGuest) {
		eSet(HubPackage.Literals.HUB__GUEST, newGuest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<User> getUsers() {
		return (EList<User>)eGet(HubPackage.Literals.HUB__USERS, true);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group getAdministrators() {
		return (Group)eGet(HubPackage.Literals.HUB__ADMINISTRATORS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdministrators(Group newAdministrators) {
		eSet(HubPackage.Literals.HUB__ADMINISTRATORS, newAdministrators);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ApplicationOwner.class) {
			switch (derivedFeatureID) {
				case HubPackage.HUB__APPLICATIONS: return HubPackage.APPLICATION_OWNER__APPLICATIONS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ApplicationOwner.class) {
			switch (baseFeatureID) {
				case HubPackage.APPLICATION_OWNER__APPLICATIONS: return HubPackage.HUB__APPLICATIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<org.nasdanika.cdo.security.User> getAllUsers() {
		// Currently only customers. Add back-office workers in future versions.
		return new BasicEList<org.nasdanika.cdo.security.User>(getUsers());
	}
	
	// --- Route methods ---
	
	/**
	 * Redirects to the principal home page.
	 * @param context
	 * @throws Exception
	 */
	@RouteMethod(pattern="L?[\\d]+\\.html")
	public void home(HttpContext context) throws Exception {
		Principal principal = ((CDOViewContext<?,?>) context).getPrincipal();
		context.getResponse().sendRedirect(context.getObjectPath(principal)+".html");
	}	

} //HubImpl
