package org.nasdanika.webtest.hub;

import org.nasdanika.html.Breadcrumbs;
import org.nasdanika.web.HttpContext;

public interface BreadcrumbsProvider {
		
	Breadcrumbs createBreadcrumbs(HttpContext context, boolean active) throws Exception;	

}
