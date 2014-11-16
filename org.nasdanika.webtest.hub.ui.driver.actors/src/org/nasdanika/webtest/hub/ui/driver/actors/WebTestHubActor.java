package org.nasdanika.webtest.hub.ui.driver.actors;

import org.nasdanika.webtest.hub.ui.driver.pages.WebTestHubPage;
import org.nasdanika.webtest.Actor;
import org.nasdanika.webtest.Description;
import org.openqa.selenium.WebDriver;

@Description("WebTest Hub Actor")
public interface WebTestHubActor extends Actor<WebDriver> {
	
	@Description("Navigates to WebTestHubPage")
	WebTestHubPage navigateToWebTestHubPage();

}
