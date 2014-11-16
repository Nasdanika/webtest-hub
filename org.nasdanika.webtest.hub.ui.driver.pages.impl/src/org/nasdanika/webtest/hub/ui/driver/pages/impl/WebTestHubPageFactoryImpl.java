package org.nasdanika.webtest.hub.ui.driver.pages.impl;

import org.nasdanika.webtest.hub.ui.driver.pages.GuestHome;
import org.nasdanika.webtest.hub.ui.driver.pages.UserHome;
import org.nasdanika.webtest.hub.ui.driver.pages.WebTestHubPageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.nasdanika.webtest.WebTestUtil;
import org.osgi.service.component.ComponentContext;

public class WebTestHubPageFactoryImpl implements WebTestHubPageFactory {

	private String baseURL;
	
	public void activate(ComponentContext context) {
		baseURL = (String) context.getProperties().get("base-url");
		System.out.println("Page factory component activated with base URL '"+baseURL+"'");
	}
	
	public void setBaseURL(String baseURL) {
		this.baseURL = baseURL;
	}
	
	public String getBaseURL() {
		return baseURL;
	}
		
	@Override
	public GuestHome createGuestHome(WebDriver webDriver) {
		GuestHomeImpl ret = PageFactory.initElements(webDriver, GuestHomeImpl.class);
		ret.setFactory(this);
		return ret;
	}
	
	@Override
	public UserHome createUserHome(WebDriver webDriver) {
		new WebDriverWait(webDriver, 3).until(ExpectedConditions.visibilityOfElementLocated(By.id("main")));
		return WebTestUtil.initElements(webDriver, UserHomeImpl.class);
	}
	

}
