package org.nasdanika.webtest.hub.ui.driver.actors;

import org.nasdanika.webtest.hub.ui.driver.pages.UserHome;
import org.nasdanika.webtest.hub.ui.driver.pages.WebTestHubPageFactory;
import org.openqa.selenium.WebDriver;

public interface WebTestHubActorFactory {
	
	WebTestHubPageFactory getPageFactory();
		
	Guest createGuest(WebDriver webDriver);

	User createUser(WebDriver webDriver, UserHome userHome);		

}
