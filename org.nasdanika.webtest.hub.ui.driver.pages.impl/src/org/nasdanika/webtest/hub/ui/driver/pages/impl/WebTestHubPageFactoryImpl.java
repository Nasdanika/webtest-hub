package org.nasdanika.webtest.hub.ui.driver.pages.impl;

import org.nasdanika.webtest.hub.ui.driver.pages.WebTestHubPageFactory;
import org.nasdanika.webtest.hub.ui.driver.pages.WebTestHubPage;
import org.openqa.selenium.WebDriver;
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
	
	@Override
	public WebTestHubPage createWebTestHubPage(WebDriver webDriver) {
		WebTestHubPageImpl ret = WebTestUtil.initElements(webDriver, WebTestHubPageImpl.class);
		ret.setFactory(this);
		return ret;
	}
	
	public String getBaseURL() {
		return baseURL;
	}

}
