package org.nasdanika.webtest.hub.ui.driver.pages.impl;

import org.nasdanika.webtest.Wait;
import org.nasdanika.webtest.hub.ui.driver.pages.LogInFailedDialog;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Wait(id="authentication-failed-modal")
public class LogInFailedDialogImpl implements LogInFailedDialog {
	
	private WebDriver driver;

	public LogInFailedDialogImpl(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(id = "authentication-failed-modal")
	private WebElement dialog;

	@Override
	public WebDriver getWebDriver() {
		return driver;
	}

}
