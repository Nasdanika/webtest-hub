package org.nasdanika.webtest.hub.ui.driver.pages;

import org.nasdanika.webtest.Page;
import org.openqa.selenium.WebDriver;

/**
 * New customer sign-up dialog.
 * @author Pavel Vlasov
 *
 */
public interface RegistrationDialog extends Page<WebDriver> {

	RegistrationDialog enterLogin(String login);

	RegistrationDialog enterEMail(String eMail);

	RegistrationDialog enterPassword(String password);

	RegistrationDialog enterPasswordConfirmation(String passwordConfirmation);

	Page<WebDriver> clickRegister();
	
	GuestHome clickCancel();

	String getLoginErrorMessage();

	String getEMailErrorMessage();
	
	String getPasswordErrorMessage();
	
	String getPasswordConfirmationErrorMessage();
}
