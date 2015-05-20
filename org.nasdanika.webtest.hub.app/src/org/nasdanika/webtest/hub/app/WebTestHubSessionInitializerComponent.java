package org.nasdanika.webtest.hub.app;

import org.eclipse.emf.cdo.common.model.CDOPackageRegistry;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOCommitContext;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.transaction.CDOTransactionHandler2;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.cdo.CDOSessionInitializer;
import org.nasdanika.cdo.security.Group;
import org.nasdanika.cdo.security.Permission;
import org.nasdanika.cdo.security.SecurityFactory;
import org.nasdanika.webtest.hub.Application;
import org.nasdanika.webtest.hub.Guest;
import org.nasdanika.webtest.hub.Hub;
import org.nasdanika.webtest.hub.HubFactory;
import org.nasdanika.webtest.hub.HubPackage;
import org.nasdanika.webtest.hub.TestSession;
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

				// Read permission on Hub.home() to Guest
//				permission.setTargetClass("Hub");
//				permission.setTargetNamespaceURI("urn:org.nasdanika.webtest.hub");
												
//				guest.getPermissions().add(createPermission("read", hub, "/home", true));
//				
//				guest.getPermissions().add(createPermission("read", hub, "/summary", true));
//				guest.getPermissions().add(createPermission("read", hub, "/home", true));
//				guest.getPermissions().add(createPermission("extension", hub, ".*/js", true));

				guest.getPermissions().add(createPermission("story", hub, "/landing", true));				
				
				guest.getPermissions().add(createPermission("*", guest, ".+", true)); // All permissions on self.								
				
				
				Group administrators = SecurityFactory.eINSTANCE.createGroup();
				administrators.setName("Administrators");
				hub.setAdministrators(administrators);
				hub.setSuperUsersGroup(administrators);
				
				String[] admins = System.getProperty("hub.admins", "admin").split(";");
				for (String adminStr: admins) {
					int idx = adminStr.indexOf(":");
					User admin = HubFactory.eINSTANCE.createUser();
					admin.setLogin((idx==-1 ? adminStr : adminStr.substring(0, idx)).trim());
					admin.setName(admin.getLogin());
					if (idx==-1) {
						hub.setPasswordHash(admin, adminStr);						
					} else {
						String pwd = adminStr.substring(idx+1).trim();
						if (pwd.length()!=0) {
							hub.setPasswordHash(admin, pwd);
						}
					}
					hub.getUsers().add(admin);
					administrators.getMembers().add(admin);
				}
				
				// For testing
				final Application app = HubFactory.eINSTANCE.createApplication();
				app.setSecurityToken("secret");
				app.setName(System.getProperty("hub.app.name", "Nasdanika Bank Examples"));
				app.setDescription("A sample NFS application for demonstration and testing");
				hub.getApplications().add(app);
//				
//				transaction.addTransactionHandler(new CDOTransactionHandler2() {
//
//					@Override
//					public void committedTransaction(CDOTransaction transactions, CDOCommitContext context) {
//						System.out.println("Application ID: "+app.cdoID());						
//					}
//
//					@Override
//					public void committingTransaction(CDOTransaction transactions, CDOCommitContext context) {
//						// NOP						
//					}
//
//					@Override
//					public void rolledBackTransaction(CDOTransaction transactions) {
//						// NOP						
//					}
//					
//				});
			}
			
			// For testing
			Hub hub = (Hub) cRes.getContents().get(0);
			for (Application app: hub.getApplications()) {
				TestSession ts = HubFactory.eINSTANCE.createTestSession();
				ts.setTitle("My session");
				app.getTestSessions().add(ts);
			}
						
			transaction.commit();
		} catch (CommitException e) {
			e.printStackTrace();
		}
	}
	
	private static Permission createPermission(String name, EObject target, String qualifier, boolean allow) {
		Permission permission = SecurityFactory.eINSTANCE.createPermission();
		permission.setName(name);
		permission.setTarget(target); 
		permission.setQualifier(qualifier);
		permission.setAllow(allow);
//		permission.setTargetClass("Hub");
//		permission.setTargetNamespaceURI("urn:org.nasdanika.webtest.hub");
		return permission;
	}

}
