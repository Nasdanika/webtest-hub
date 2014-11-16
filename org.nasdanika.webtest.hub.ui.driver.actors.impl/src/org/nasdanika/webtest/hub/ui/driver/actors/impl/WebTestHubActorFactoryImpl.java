package org.nasdanika.webtest.hub.ui.driver.actors.impl;

import org.nasdanika.webtest.hub.ui.driver.pages.UserHome;
import org.nasdanika.webtest.hub.ui.driver.pages.WebTestHubPageFactory;
import org.nasdanika.webtest.hub.ui.driver.actors.Guest;
import org.nasdanika.webtest.hub.ui.driver.actors.User;
import org.nasdanika.webtest.hub.ui.driver.actors.WebTestHubActorFactory;
import org.nasdanika.webtest.AbstractNasdanikaWebTestRunner;
import org.openqa.selenium.WebDriver;
import org.osgi.service.component.ComponentContext;

public class WebTestHubActorFactoryImpl implements WebTestHubActorFactory {

	private WebTestHubPageFactory pageFactory;

	public void setPageFactory(WebTestHubPageFactory pageFactory) {
		this.pageFactory = AbstractNasdanikaWebTestRunner.proxyPageFactory(pageFactory);
	}
	
	// For troubleshooting
	public void activate(ComponentContext context) {
		System.out.println("WebTest Hub Actor Factory Component activated");
	}

	@Override
	public WebTestHubPageFactory getPageFactory() {
		return pageFactory;
	}
	
	@Override
	public Guest createGuest(WebDriver webDriver) {		
		return new GuestImpl(this, webDriver);
	}

	@Override
	public User createUser(WebDriver webDriver, UserHome userHome) {
		return new UserImpl(this, webDriver, userHome);
	}

}
