package org.nasdanika.webtest.hub.app;

import org.eclipse.emf.cdo.common.model.CDOPackageRegistry;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOCommitContext;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.transaction.CDOTransactionHandler2;
import org.eclipse.emf.cdo.util.CommitException;
import org.nasdanika.cdo.CDOSessionInitializer;
import org.nasdanika.cdo.security.Group;
import org.nasdanika.cdo.security.Permission;
import org.nasdanika.cdo.security.SecurityFactory;
import org.nasdanika.webtest.hub.Application;
import org.nasdanika.webtest.hub.Guest;
import org.nasdanika.webtest.hub.Hub;
import org.nasdanika.webtest.hub.HubFactory;
import org.nasdanika.webtest.hub.HubPackage;
import org.nasdanika.webtest.hub.User;

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
				hub.setName(System.getProperty("hub.name", "Nasdanika Web Tests"));
				hub.setSlideWidth(1024);
				
				Guest guest = HubFactory.eINSTANCE.createGuest();
				hub.setGuest(guest);
				hub.setUnauthenticatedPrincipal(guest);

				// Read permission on Hub to Guest
				Permission permission = SecurityFactory.eINSTANCE.createPermission();
				permission.setTarget(hub); // self-target
				permission.setAllow(true);
				permission.setName("read");
				permission.setTargetClass("Hub");
				permission.setTargetNamespaceURI("urn:org.nasdanika.webtest.hub");
				guest.getPermissions().add(permission);								
				
				Group administrators = SecurityFactory.eINSTANCE.createGroup();
				administrators.setName("Administrators");
				hub.setAdministrators(administrators);
				hub.setSuperUsersGroup(administrators);
				
				User admin = HubFactory.eINSTANCE.createUser();
				admin.setLogin(System.getProperty("hub.admin", "admin"));
				hub.setPasswordHash(admin, "admin");
				hub.getUsers().add(admin);
				administrators.getMembers().add(admin);
				
				// For testing
				final Application app = HubFactory.eINSTANCE.createApplication();
				app.setSecurityToken("secret");
				app.setName(System.getProperty("hub.app.name", "Nasdanika Bank Examples"));
				app.setDescription("A sample NFS application for demonstration and testing");
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
