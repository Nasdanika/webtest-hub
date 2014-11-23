package org.nasdanika.webtest.hub.ui.driver.pages.impl;

import org.nasdanika.webtest.Page;
import org.nasdanika.webtest.ReflectivePageBase;
import org.nasdanika.webtest.Wait;
import org.nasdanika.webtest.WebTestUtil;
import org.nasdanika.webtest.hub.ui.driver.pages.GuestHome;
import org.nasdanika.webtest.hub.ui.driver.pages.RegistrationDialog;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Wait(id="rLogin")
public class RegistrationDialogImpl extends ReflectivePageBase<WebDriver> implements RegistrationDialog {

	private WebDriver driver;
	private WebDriverWait webDriverWait;

	public RegistrationDialogImpl(WebDriver driver) {
		this.driver = driver;
		webDriverWait = new WebDriverWait(driver, 3);
	}
	
	private WebElement rLogin;
	private WebElement rEMail;
	private WebElement rPassword;
	private WebElement rPasswordConfirm;
	private WebElement registrationSubmitButton;
	private WebElement registrationCancelButton;
	private WebElement rLoginErrorMessage;
	private WebElement rEMailErrorMessage;
	private WebElement rPasswordErrorMessage;
	private WebElement rPasswordConfirmErrorMessage;

	@Override
	public RegistrationDialog enterLogin(String login) {
		if (login==null) {
			rLogin.clear();
		} else {
			rLogin.sendKeys(login);
		}
		return this;
	}

	@Override
	public RegistrationDialog enterEMail(String eMail) {
		if (eMail == null) {
			rEMail.clear();
		} else {
			rEMail.sendKeys(eMail);
		}
		return this;
	}

	@Override
	public RegistrationDialog enterPassword(String password) {
		if (password == null) {
			rPassword.clear();
		} else {
			rPassword.sendKeys(password);
		}
		return this;
	}

	@Override
	public RegistrationDialog enterPasswordConfirmation(String passwordConfirmation) {
		if (passwordConfirmation == null) {
			rPasswordConfirm.clear();
		} else {
			rPasswordConfirm.sendKeys(passwordConfirmation);
		}
		return this;
	}

	@Override
	public Page<WebDriver> clickRegister() {
		registrationSubmitButton.click();
		try {
			webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("banner")));
			return WebTestUtil.initElements(driver, UserHomeImpl.class);
		} catch (WebDriverException wde) {
			return this;
		}
	}

	@Override
	public WebDriver getWebDriver() {
		return driver;
	}

	@Override
	public GuestHome clickCancel() {
		registrationCancelButton.click();
		webDriverWait.until(ExpectedConditions.not(ExpectedConditions.visibilityOf(rLogin)));
		return WebTestUtil.initElements(getWebDriver(), GuestHomeImpl.class);
	}

	@Override
	public String getLoginErrorMessage() {
		return rLoginErrorMessage.isDisplayed() ? rLoginErrorMessage.getText() : null;
	}

	@Override
	public String getEMailErrorMessage() {
		return rEMailErrorMessage.isDisplayed() ? rEMailErrorMessage.getText() : null;
	}

	@Override
	public String getPasswordErrorMessage() {
		return rPasswordErrorMessage.isDisplayed() ? rPasswordErrorMessage.getText() : null;
	}

	@Override
	public String getPasswordConfirmationErrorMessage() {
		return rPasswordConfirmErrorMessage.isDisplayed() ? rPasswordConfirmErrorMessage.getText() : null;
	}

}


