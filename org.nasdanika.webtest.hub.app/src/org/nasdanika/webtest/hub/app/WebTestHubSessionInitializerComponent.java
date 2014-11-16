package org.nasdanika.webtest.hub.app;

import org.eclipse.emf.cdo.common.model.CDOPackageRegistry;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.nasdanika.cdo.CDOSessionInitializer;
import org.nasdanika.webtest.hub.Guest;
import org.nasdanika.webtest.hub.HubFactory;
import org.nasdanika.webtest.hub.HubPackage;
import org.nasdanika.webtest.hub.Hub;

public class WebTestHubSessionInitializerComponent implements CDOSessionInitializer {
	
	@Override
	public void init(CDOSession session) {
		System.out.println("Initializing session");
		
		// Register packages
		CDOPackageRegistry packageRegistry = session.getPackageRegistry();
		packageRegistry.putEPackage(HubPackage.eINSTANCE);
		
		// Populate with initial data if empty.
		CDOTransaction transaction = session.openTransaction();				
		try {
			CDOResource cRes = transaction.getOrCreateResource("/WebTestHub");
			if (cRes.getContents().isEmpty()) {
				// Create initial content
				Hub hub = HubFactory.eINSTANCE.createHub();
				cRes.getContents().add(hub);
				
				Guest guest = HubFactory.eINSTANCE.createGuest();
				hub.setGuest(guest);
				hub.setUnauthenticatedPrincipal(guest);
			}
			
			transaction.commit();
		} catch (CommitException e) {
			e.printStackTrace();
		}
	}

}
