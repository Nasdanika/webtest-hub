package org.nasdanika.webtest.hub.impl;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.transaction.CDOCommitContext;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.transaction.CDOTransactionHandler2;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.web.HttpContext;
import org.nasdanika.webtest.hub.TestSession;

class HubUtil {
	
	private HubUtil() {
		// Utility class
	}
	
	static boolean authorize(HttpContext context, EObject obj) throws IOException {
		if (obj instanceof ApplicationImpl) {
			return ((ApplicationImpl) obj).authorize(context);
		}
		if (obj.eContainer()==null) {
			return false;
		}
		return authorize(context, obj.eContainer());
	}

	static void sessionProgress(EObject obj) throws IOException {
		if (obj instanceof TestSession) {
			((TestSession) obj).setProgress(((TestSession) obj).getProgress()+1);
		} else if (obj!=null) {
			sessionProgress(obj.eContainer());
		}
	}
	
	static void respondWithLocationAndObjectIdOnCommit(final HttpContext context, final CDOObject obj) {
		((CDOTransaction) obj.cdoView()).addTransactionHandler(new CDOTransactionHandler2() {

			@Override
			public void committedTransaction(CDOTransaction transactions, CDOCommitContext commitContext) {
				try {
					StringBuffer rURL = context.getRequest().getRequestURL();
					context.getResponse().setHeader("Location", rURL.substring(0, rURL.indexOf(context.getRequest().getRequestURI()))+context.getObjectPath(obj));
					context.getResponse().setHeader("ID", obj.eResource().getURIFragment(obj));
				} catch (Exception e) {
					e.printStackTrace();
					try {
						context.getResponse().sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, e.toString());
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}						
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

}
