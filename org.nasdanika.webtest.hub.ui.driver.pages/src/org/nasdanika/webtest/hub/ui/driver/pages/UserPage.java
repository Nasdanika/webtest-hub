package org.nasdanika.webtest.hub.ui.driver.pages;

import org.nasdanika.webtest.Page;
import org.openqa.selenium.WebDriver;

/**
 * Base interface for customer pages.
 * @author Pavel Vlasov
 *
 */
public interface UserPage extends Page<WebDriver> {
	
	/**
	 * Clicks sign-out link.
	 */
	UserPage clickLogOut();
	
	/**
	 * Clicks OK or Cancel in sign-out confirmation dialog.
	 * @param confirm
	 * @return
	 */
	Page<WebDriver> confirmLogOut(boolean confirm);	
	
	/**
	 * @return Text in the nav-bar banner.
	 */
	String getBanner();
	

}
