package org.nasdanika.webtest.hub.ui.driver.actors.impl;

import org.nasdanika.webtest.hub.ui.driver.actors.WebTestHubActor;
import org.nasdanika.webtest.hub.ui.driver.actors.WebTestHubActorFactory;
import org.nasdanika.webtest.hub.ui.driver.pages.WebTestHubPage;
import org.nasdanika.webtest.Description;
import org.nasdanika.webtest.Page;
import org.nasdanika.webtest.Screenshot;
import org.openqa.selenium.WebDriver;

class WebTestHubActorImpl implements WebTestHubActor {

	private WebTestHubActorFactory factory;
	private Page<WebDriver> currentPage;
	private WebDriver webDriver;

	WebTestHubActorImpl(WebTestHubActorFactory factory, WebDriver webDriver) {
		this.factory = factory;
		this.webDriver = webDriver;
	}

	@Override
	public Page<WebDriver> getCurrentPage() {
		return currentPage;
	}
	
	@Override		
	@Description("Navigates to WebTestHubPage")
	@Screenshot({Screenshot.When.AFTER, Screenshot.When.EXCEPTION})
	public WebTestHubPage navigateToWebTestHubPage() {
		webDriver.get("http://localhost:8080/router/webtest-hub.html");
		WebTestHubPage ret = factory.getPageFactory().createWebTestHubPage(webDriver);
		
		return ret;
	}

}
