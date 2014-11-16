package org.nasdanika.webtest.hub.ui.driver.actors;

import org.nasdanika.webtest.Actor;
import org.nasdanika.webtest.Description;
import org.nasdanika.webtest.hub.ui.driver.pages.GuestHome;
import org.openqa.selenium.WebDriver;

@Description("Unauthenticated user")
public interface Guest extends Actor<WebDriver> {
	
	/**
	 * 
	 * @param user
	 * @param password
	 * @return Actor for the authenticated user (Customer) if log-in successful, 
	 * self otherwise.
	 */
	@Description("Enter Online ID and Password and click 'Sign in' button.")
	Actor<WebDriver> logIn(
			String onlineId, 
			String password);

	/**
	 * Registers new user.
	 * @param onlineId
	 * @param name
	 * @param password
	 * @param passwordConfirmation
	 * @return Customer if sign-up successful, Guest otherwise.
	 */
	Actor<WebDriver> register(
			String onlineId, 
			String eMail, 
			String password, 
			String passwordConfirmation);

	GuestHome goHome();

}
