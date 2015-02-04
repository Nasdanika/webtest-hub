package org.nasdanika.webtest.hub.ui.driver.pages.impl;

import org.nasdanika.webtest.Page;
import org.nasdanika.webtest.ReflectivePageFragmentBase;
import org.nasdanika.webtest.hub.ui.driver.pages.UserPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Base class for customer pages.
 * @author Pavel Vlasov
 *
 */
public class UserPageImpl extends ReflectivePageFragmentBase<WebDriver> implements UserPage {

	private WebDriver driver;
	
	private WebElement banner;

	protected UserPageImpl(WebDriver driver) {
		this.driver = driver;
	}

	@Override
	public WebDriver getWebDriver() {
		return driver;
	}

	@Override
	public String getBanner() {
		return banner.getText();
	}

	@Override
	public UserPage clickLogOut() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<WebDriver> confirmLogOut(boolean confirm) {
		// TODO Auto-generated method stub
		return null;
	}

}
