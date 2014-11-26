package org.nasdanika.webtest.hub.app;

import org.eclipse.emf.cdo.common.model.CDOPackageRegistry;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOCommitContext;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.transaction.CDOTransactionHandler2;
import org.eclipse.emf.cdo.transaction.CDOTransactionHandlerBase;
import org.eclipse.emf.cdo.util.CommitException;
import org.nasdanika.cdo.CDOSessionInitializer;
import org.nasdanika.webtest.hub.Application;
import org.nasdanika.webtest.hub.Guest;
import org.nasdanika.webtest.hub.Hub;
import org.nasdanika.webtest.hub.HubFactory;
import org.nasdanika.webtest.hub.HubPackage;

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
				
				// For testing
				final Application app = HubFactory.eINSTANCE.createApplication();
				app.setSecurityToken("secret");
				hub.getApplications().add(app);
				
				transaction.addTransactionHandler(new CDOTransactionHandler2() {

					@Override
					public void committedTransaction(CDOTransaction transactions, CDOCommitContext context) {
						System.out.println("Application ID: "+app.cdoID());						
					}

					@Override
					public void committingTransaction(CDOTransaction transactions, CDOCommitContext context) {
						// NOP						
					}

					@Override
					public void rolledBackTransaction(CDOTransaction transactions) {
						// NOP						
					}
					
				});
			}
			
			transaction.commit();
		} catch (CommitException e) {
			e.printStackTrace();
		}
	}

}
