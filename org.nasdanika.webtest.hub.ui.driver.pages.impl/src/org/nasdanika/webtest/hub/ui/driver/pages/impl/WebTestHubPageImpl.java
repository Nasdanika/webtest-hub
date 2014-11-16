package org.nasdanika.webtest.hub.ui.driver.pages.impl;

import org.nasdanika.webtest.hub.ui.driver.pages.WebTestHubPage;
import org.nasdanika.webtest.Wait;
import org.openqa.selenium.WebDriver;

@Wait(id="button-groups")
public class WebTestHubPageImpl implements WebTestHubPage {
		
	private WebTestHubPageFactoryImpl factory;
	private WebDriver webDriver;	

	public WebTestHubPageImpl(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	
	public void setFactory(WebTestHubPageFactoryImpl factory) {
		this.factory = factory;
	}
	
	@Override
	public WebDriver getWebDriver() {
		return webDriver;
	}

}
