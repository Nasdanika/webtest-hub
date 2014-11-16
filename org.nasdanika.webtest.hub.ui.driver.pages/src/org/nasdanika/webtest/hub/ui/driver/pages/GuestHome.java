package org.nasdanika.webtest.hub.ui.driver.pages;

import org.nasdanika.webtest.Description;
import org.nasdanika.webtest.Page;
import org.nasdanika.webtest.Title;
import org.openqa.selenium.WebDriver;

@Title("Guest Home Page")
@Description("Page class for testing guest home page")
public interface GuestHome extends Page<WebDriver> {
	
	/**
	 * Navigates to the home page.
	 */
	@Description("Navigates to the home page")
	void open();
	
	void enterLogin(String login);
	
	void enterPassword(String password);
	
	/**
	 * Clicks sign-in button.
	 * @return Customer home if sign-in was successful, this page if input validation fails, or authentication failed dialog 
	 * if incorrect credentials were provided.
	 */
	Page<WebDriver> clickLogin();

	RegistrationDialog clickRegister();	

}
