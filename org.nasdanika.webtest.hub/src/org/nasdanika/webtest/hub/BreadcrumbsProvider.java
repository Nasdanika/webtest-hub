package org.nasdanika.webtest.hub;

import org.nasdanika.html.Breadcrumbs;
import org.nasdanika.web.HttpServletRequestContext;

public interface BreadcrumbsProvider {
		
	Breadcrumbs createBreadcrumbs(HttpServletRequestContext context, boolean active) throws Exception;	

}
