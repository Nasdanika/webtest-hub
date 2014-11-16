package org.nasdanika.webtest.hub.ui.driver.pages;

import org.openqa.selenium.WebDriver;

public interface WebTestHubPageFactory {
	
	GuestHome createGuestHome(WebDriver webDriver);

	UserHome createUserHome(WebDriver webDriver);
	
}
