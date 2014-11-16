package org.nasdanika.webtest.hub.ui.driver.pages.impl;

import org.nasdanika.webtest.Wait;
import org.nasdanika.webtest.hub.ui.driver.pages.UserHome;
import org.openqa.selenium.WebDriver;

@Wait(id="banner")
public class UserHomeImpl extends UserPageImpl implements UserHome {

	public UserHomeImpl(WebDriver driver) {
		super(driver);
	}


}
