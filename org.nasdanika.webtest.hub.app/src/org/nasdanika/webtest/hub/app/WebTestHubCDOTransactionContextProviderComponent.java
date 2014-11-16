package org.nasdanika.webtest.hub.app;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.cdo.CDOTransactionContextProviderComponent;
import org.nasdanika.cdo.security.ProtectionDomain;
import org.nasdanika.cdo.security.LoginPasswordCredentials;

public class WebTestHubCDOTransactionContextProviderComponent extends CDOTransactionContextProviderComponent<LoginPasswordCredentials> {

	@SuppressWarnings("unchecked")
	@Override
	protected ProtectionDomain<LoginPasswordCredentials> getProtectionDomain(CDOTransaction view) {
		CDOResource res = view.getResource("WebTestHub");
		if (res!=null) {
			for (EObject e: res.getContents()) {
				if (e instanceof ProtectionDomain) {
					return (ProtectionDomain<LoginPasswordCredentials>) e;
				}
			}
		}
		return null;
	}

}
