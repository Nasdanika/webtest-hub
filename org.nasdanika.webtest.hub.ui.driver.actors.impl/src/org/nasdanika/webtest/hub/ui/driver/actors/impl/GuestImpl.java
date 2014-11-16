package org.nasdanika.webtest.hub.ui.driver.actors.impl;

import org.junit.Assert;
import org.nasdanika.webtest.Actor;
import org.nasdanika.webtest.Page;
import org.nasdanika.webtest.Screenshot;
import org.nasdanika.webtest.hub.ui.driver.actors.Guest;
import org.nasdanika.webtest.hub.ui.driver.actors.WebTestHubActorFactory;
import org.nasdanika.webtest.hub.ui.driver.pages.GuestHome;
import org.nasdanika.webtest.hub.ui.driver.pages.UserHome;
import org.openqa.selenium.WebDriver;

class GuestImpl implements Guest {

	private WebTestHubActorFactory factory;
	private Page<WebDriver> currentPage;
	private WebDriver webDriver;

	GuestImpl(WebTestHubActorFactory factory, WebDriver webDriver) {
		this.factory = factory;
		this.webDriver = webDriver;
	}

	@Override
	public Page<WebDriver> getCurrentPage() {
		return currentPage;
	}

	@Override
	public Actor<WebDriver> logIn(String login, String password) {
		GuestHome home = factory.getPageFactory().createGuestHome(webDriver);
		home.enterLogin(login);
		home.enterPassword(password);
		currentPage = home.clickLogin();
		if (currentPage instanceof UserHome) {
			return factory.createUser(webDriver, (UserHome) currentPage);
		}
		return this;
	}

	@Override
	public Actor<WebDriver> register(
			String login, 
			String eMail, 
			String password,
			String passwordConfirmation) {
		GuestHome home = factory.getPageFactory().createGuestHome(webDriver);
		currentPage = home;
		Page<WebDriver> registrationResult = home.clickRegister()
				.enterLogin(login)
				.enterEMail(eMail)
				.enterPassword(password)
				.enterPasswordConfirmation(passwordConfirmation)
				.clickRegister();

		if (registrationResult instanceof UserHome) {
			//Assert.assertEquals(eMail, ((UserHome) registrationResult).getBanner());
			return factory.createUser(webDriver, (UserHome) registrationResult);
		} else {
			currentPage = registrationResult;
		}
		
		return this;
	}
	
	/**
	 * Before screenshot is suppressed as it is irrelevant.
	 */
	@Override
	@Screenshot({Screenshot.When.AFTER, Screenshot.When.EXCEPTION})
	public GuestHome goHome() {
		currentPage = factory.getPageFactory().createGuestHome(webDriver);
		((GuestHome) currentPage).open();
		return (GuestHome) currentPage;
	}
	

}
