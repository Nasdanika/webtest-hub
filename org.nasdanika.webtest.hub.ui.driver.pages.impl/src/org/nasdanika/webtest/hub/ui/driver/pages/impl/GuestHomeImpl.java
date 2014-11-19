package org.nasdanika.webtest.hub.ui.driver.pages.impl;

import org.nasdanika.webtest.Page;
import org.nasdanika.webtest.Screenshot;
import org.nasdanika.webtest.WebTestUtil;
import org.nasdanika.webtest.hub.ui.driver.pages.GuestHome;
import org.nasdanika.webtest.hub.ui.driver.pages.RegistrationDialog;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GuestHomeImpl implements GuestHome {
		
	private WebTestHubPageFactoryImpl factory;
	private WebDriver webDriver;	
	private WebDriverWait webDriverWait;

	public GuestHomeImpl(WebDriver webDriver) {
		this.webDriver = webDriver;
		webDriverWait = new WebDriverWait(webDriver, 3);
	}
	
	public void setFactory(WebTestHubPageFactoryImpl factory) {
		this.factory = factory;
	}
	
	private WebElement login;
	private WebElement password;
	private WebElement loginButton;
	
	private WebElement registerMenuItem;
	
	@FindBy(css = "body > div.panel.panel-info > div.panel-body > nav > div > div.navbar-header > button")
	private WebElement navBarToggleButton;

	@Override
	public void enterLogin(String login) {
		if (!this.login.isDisplayed() && navBarToggleButton.isDisplayed()) {
			navBarToggleButton.click();
			webDriverWait.until(ExpectedConditions.visibilityOf(this.login));
		}
		if (login==null) {
			this.login.clear();
		}
		this.login.sendKeys(login);
	}

	@Override
	public void enterPassword(String password) {
		if (!this.password.isDisplayed() && navBarToggleButton.isDisplayed()) {
			navBarToggleButton.click();
			webDriverWait.until(ExpectedConditions.visibilityOf(this.password));
		}
		this.password.sendKeys(password);
	}

	@Override
	public Page<WebDriver> clickLogin() {
		if (!loginButton.isDisplayed() && navBarToggleButton.isDisplayed()) {
			navBarToggleButton.click();
			webDriverWait.until(ExpectedConditions.visibilityOf(loginButton));
		}
		this.loginButton.click();
		try {
			return WebTestUtil.initElements(webDriver, UserHomeImpl.class);
		} catch (WebDriverException e) { 
			try {
				return WebTestUtil.initElements(webDriver, LogInFailedDialogImpl.class);
			} catch (WebDriverException e1) {
				return this;
			}
		}
	}

	@Override
	public WebDriver getWebDriver() {
		return webDriver;
	}

	/**
	 * Before screenshot is suppressed as it is irrelevant.
	 */
	@Override
	@Screenshot({Screenshot.When.AFTER, Screenshot.When.EXCEPTION})
	public void open() {
		getWebDriver().get(factory.getBaseURL()+"/index.html");
		new WebDriverWait(webDriver, 3).until(ExpectedConditions.visibilityOfElementLocated(By.id("main")));		
	}

	@Override
	public RegistrationDialog clickRegister() {
		if (!registerMenuItem.isDisplayed() && navBarToggleButton.isDisplayed()) {
			navBarToggleButton.click();
			webDriverWait.until(ExpectedConditions.visibilityOf(registerMenuItem));
		}
		registerMenuItem.click();
		return WebTestUtil.initElements(webDriver, RegistrationDialogImpl.class);
	}

}
