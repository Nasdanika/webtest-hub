package org.nasdanika.webtest.hub.ui.driver.actors.impl;

import org.nasdanika.webtest.hub.ui.driver.pages.WebTestHubPageFactory;
import org.nasdanika.webtest.hub.ui.driver.actors.WebTestHubActorFactory;
import org.nasdanika.webtest.hub.ui.driver.actors.WebTestHubActor;
import org.nasdanika.webtest.AbstractNasdanikaWebTestRunner;
import org.openqa.selenium.WebDriver;
import org.osgi.service.component.ComponentContext;

public class WebTestHubActorFactoryImpl implements WebTestHubActorFactory {

	private WebTestHubPageFactory pageFactory;

	public void setPageFactory(WebTestHubPageFactory pageFactory) {
		this.pageFactory = AbstractNasdanikaWebTestRunner.proxyPageFactory(pageFactory);
	}

	@Override
	public WebTestHubActor createWebTestHubActor(WebDriver webDriver) {
		return new WebTestHubActorImpl(this, webDriver);
	}
	
	// For troubleshooting
	public void activate(ComponentContext context) {
		System.out.println("WebTest Hub Actor Factory Component activated");
	}

	@Override
	public WebTestHubPageFactory getPageFactory() {
		return pageFactory;
	}

}
