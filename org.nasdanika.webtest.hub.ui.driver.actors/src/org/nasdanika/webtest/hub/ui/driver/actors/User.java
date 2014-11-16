package org.nasdanika.webtest.hub.ui.driver.actors;

import org.nasdanika.webtest.Actor;
import org.nasdanika.webtest.Description;
import org.openqa.selenium.WebDriver;

/**
 * 
 * @author Pavel Vlasov
 *
 */
@Description("Registered user.")
public interface User extends Actor<WebDriver> {
	
	Actor<WebDriver> logOut(boolean confirm);

}
