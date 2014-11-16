package org.nasdanika.webtest.hub.ui.driver.actors.impl;

import org.nasdanika.webtest.Actor;
import org.nasdanika.webtest.Page;
import org.nasdanika.webtest.hub.ui.driver.actors.User;
import org.nasdanika.webtest.hub.ui.driver.actors.WebTestHubActorFactory;
import org.nasdanika.webtest.hub.ui.driver.pages.UserHome;
import org.nasdanika.webtest.hub.ui.driver.pages.UserPage;
import org.openqa.selenium.WebDriver;

class UserImpl implements User {
	
	private Page<WebDriver> currentPage;
	private WebDriver webDriver;
	private WebTestHubActorFactory factory;

	UserImpl(WebTestHubActorFactory factory, WebDriver webDriver, UserHome homePage) {
		this.factory = factory;
		this.currentPage = homePage;
		this.webDriver = webDriver;
	}

	@Override
	public Page<WebDriver> getCurrentPage() {
		return currentPage;
	}

	@Override
	public Actor<WebDriver> logOut(boolean confirm) {
		UserPage userPage = (UserPage) currentPage;
		userPage.clickLogOut();
		Page<WebDriver> page = userPage.confirmLogOut(confirm);
		if (page instanceof UserPage) {
			currentPage = page;
			return this;
		}
		
		return factory.createGuest(webDriver); // Should have gone to the guest home.
	}
	

}
