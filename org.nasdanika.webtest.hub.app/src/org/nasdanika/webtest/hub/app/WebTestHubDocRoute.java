package org.nasdanika.webtest.hub.app;

import org.apache.commons.lang3.StringEscapeUtils;
import org.nasdanika.cdo.web.doc.DocumentationPanelFactory;
import org.nasdanika.html.ApplicationPanel;
import org.nasdanika.html.HTMLFactory;
import org.nasdanika.html.Navbar;
import org.nasdanika.html.Table;
import org.nasdanika.html.Table.Row;
import org.nasdanika.html.Tag.TagName;
import org.nasdanika.html.Theme;
import org.nasdanika.html.UIElement.BootstrapColor;
import org.nasdanika.html.UIElement.Style;
import org.nasdanika.web.Action;
import org.nasdanika.web.HttpServletRequestContext;
import org.nasdanika.web.Route;

/**
 * Route to demonstrate/test HTMLFactory capabilities
 *
 */
public class WebTestHubDocRoute implements Route {

	@Override
	public Action execute(HttpServletRequestContext context, Object... args) throws Exception {
		HTMLFactory htmlFactory = context.adapt(HTMLFactory.class);
		String objectPath = context.getObjectPath(this);
		ApplicationPanel appPanel = htmlFactory.applicationPanel()
				.style(Style.INFO) // Guest INFO, Authenticated user - primary.
				.header("Documentation")
//				.width(1024)
				.minHeight(600)
				.headerLink(context.getRequest().getContextPath()+"/router/doc.html")
				.id("docAppPanel")
				.footer(htmlFactory.link("#", "Documentation"));		
				
		Navbar navBar = htmlFactory.navbar("Welcome!", objectPath+".html"); 	
		
		// TODO - Login form on the right using knockout form and login operation.
		
		if (context.getRequest().getUserPrincipal()==null) { // NFS authentication
			navBar.item(htmlFactory.link(context.getObjectPath(this)+"/registrationForm", "Register"), false, true);
		}
		
		appPanel.navigation(navBar);
		Table table = htmlFactory.table();
		Row row = table.row();
		DocumentationPanelFactory documentationPanelFactory = new DocumentationPanelFactory(htmlFactory, context.getContextURL()+"/doc");
		row.cell(documentationPanelFactory.leftPanel()).id("left-panel");
		row.cell("")
			.id("splitter")
			.style("width", "5px")
			.style("padding", "0px")
			.background(BootstrapColor.INFO)
			.style("cursor", "col-resize");
		row.cell(documentationPanelFactory.rightPanel()).id("right-panel");
		appPanel.contentPanel(table, htmlFactory.tag(TagName.script, getClass().getResource("Splitter.js")));
		
//		appPanel.contentPanel(documentationPanelFactory.leftPanel()).width(DeviceSize.LARGE, 3).style("overflow", "auto");
//		appPanel.contentPanel(documentationPanelFactory.rightPanel()).width(DeviceSize.LARGE, 9).style("border-left", "solid gray 1px");
		
//			.width(DeviceSize.SMALL, 9)
//			.width(DeviceSize.MEDIUM, 10)
//			.width(DeviceSize.LARGE, 11);

		final AutoCloseable app = htmlFactory.bootstrapRouterApplication(
				Theme.Default,
				StringEscapeUtils.escapeHtml4("Documentation"), 
				null, //"main/doc/index.html", 
				htmlFactory.fragment(
						htmlFactory.tag(TagName.link)
							.attribute("rel", "stylesheet")
							.attribute("href", context.getContextURL()+"/doc/resources/css/github-markdown.css"),							
						htmlFactory.tag(TagName.link)
							.attribute("rel", "stylesheet")
							.attribute("href", context.getContextURL()+"/doc/resources/jstree/themes/default/style.min.css")), 
				appPanel);
				
		return new Action() {
			
			@Override
			public void close() throws Exception {
				app.close();				
			}
			
			@Override
			public Object execute() throws Exception {
				return app.toString();
			}
		};
		
	}

	@Override
	public boolean canExecute() {
		return true;
	}

	@Override
	public void close() throws Exception {
		// NOP
	}

}
