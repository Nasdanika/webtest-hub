package org.nasdanika.webtest.hub.tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.nasdanika.webtest.Actor;
import org.nasdanika.webtest.ActorFactory;
import org.nasdanika.webtest.Description;
import org.nasdanika.webtest.NasdanikaWebTestRunner;
import org.nasdanika.webtest.Screenshot;
import org.nasdanika.webtest.WebTest;
import org.nasdanika.webtest.hub.ui.driver.actors.Guest;
import org.nasdanika.webtest.hub.ui.driver.actors.User;
import org.nasdanika.webtest.hub.ui.driver.actors.WebTestHubActorFactory;
import org.nasdanika.webtest.hub.ui.driver.pages.RegistrationDialog;
import org.nasdanika.webtest.hub.ui.driver.pages.UserHome;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@RunWith(NasdanikaWebTestRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@Description("Tests of sign-up scenarios")
public class Register implements WebTest<WebDriver> {
	
	private static final String TEST_PASSWORD = "J123_D45";
	private static final String TEST_USER_EMAIL = "John.Doe@nasdanika.org";
	private static final String TEST_USER_LOGIN = "jDoe";
	private WebDriver driver;
	
	@Override
	public WebDriver getWebDriver() {
		return driver;
	}
		
	@ActorFactory
	public WebTestHubActorFactory actorFactory;

	@Before
	public void setUp() throws Exception {
        driver = new FirefoxDriver(); // new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
	}
	
	@Test
	@Description("Successful registration")
	@Screenshot({Screenshot.When.AFTER, Screenshot.When.EXCEPTION})
	public void aHappyPath() throws Exception {
		Guest guest = actorFactory.createGuest(getWebDriver());
		guest.goHome();
		Actor<WebDriver> user = guest.register(TEST_USER_LOGIN, TEST_USER_EMAIL, TEST_PASSWORD, TEST_PASSWORD);
		Assert.assertTrue(user instanceof User);
		Assert.assertTrue(user.getCurrentPage() instanceof UserHome);
		//Assert.assertEquals(TEST_CUSTOMER_NAME, ((UserHome) user.getCurrentPage()).getBanner());
	}
	
	@Test
	@Screenshot({Screenshot.When.AFTER, Screenshot.When.EXCEPTION})
	public void duplicateId() {
		Guest guest = actorFactory.createGuest(driver);
		guest.goHome();
		Actor<WebDriver> actor = guest.register(TEST_USER_LOGIN, TEST_USER_EMAIL, TEST_PASSWORD, TEST_PASSWORD);	
		Assert.assertTrue("Expected Guest, got "+actor, actor instanceof Guest);
		Assert.assertTrue("Expected registration dialog, got "+actor.getCurrentPage(), actor.getCurrentPage() instanceof RegistrationDialog);
		RegistrationDialog registrationDialog = (RegistrationDialog) actor.getCurrentPage();
		Assert.assertEquals("Login already exists", registrationDialog.getLoginErrorMessage());
		registrationDialog.clickCancel();		
	}
	
	@Test
	@Description("All input fields are blank")
	public void allBlank() {
		
	}
	
	@Test
	@Screenshot({Screenshot.When.AFTER, Screenshot.When.EXCEPTION})
	public void blankId() {
		Guest guest = actorFactory.createGuest(driver);
		guest.goHome();
		Actor<WebDriver> actor = guest.register(null, TEST_USER_EMAIL, TEST_PASSWORD, TEST_PASSWORD);	
		Assert.assertTrue("Expected Guest, got "+actor, actor instanceof Guest);
		Assert.assertTrue("Expected registration dialog, got "+actor.getCurrentPage(), actor.getCurrentPage() instanceof RegistrationDialog);
		RegistrationDialog registrationDialog = (RegistrationDialog) actor.getCurrentPage();
		// Currently it is not possible to check HTML5 validation message with Selenium.
		Assert.assertNull(registrationDialog.getLoginErrorMessage());
		registrationDialog.clickCancel();				
	}
		
	@Test
	public void shortId() {
		
	}
		
	@Test
	public void blankName() {
		
	}
		
	@Test
	@Screenshot({Screenshot.When.AFTER, Screenshot.When.EXCEPTION})
	public void blankPassword() {
		Guest guest = actorFactory.createGuest(driver);
		guest.goHome();
		Actor<WebDriver> actor = guest.register(TEST_USER_LOGIN, TEST_USER_EMAIL, null, TEST_PASSWORD);	
		Assert.assertTrue(actor instanceof Guest);
		Assert.assertTrue(actor.getCurrentPage() instanceof RegistrationDialog);
		RegistrationDialog registrationDialog = (RegistrationDialog) actor.getCurrentPage();
		// Currently it is not possible to check HTML5 validation message with Selenium.
		Assert.assertNull(registrationDialog.getPasswordErrorMessage());
		registrationDialog.clickCancel();						
	}
	
	@Test
	@Description("Password shall be minimum 6 characters long")
	public void shortPassword() {
		
	}
			
	@Test
	@Description("Password shall contain 3 out of 4 character classes - lower case letters, upper case letters, numbers, special characters like _, @, #, $")
	public void weakPassword() {
		
	}
		
	@Test
	@Screenshot({Screenshot.When.AFTER, Screenshot.When.EXCEPTION})
	public void blankPasswordConfirm() {
		Guest guest = actorFactory.createGuest(driver);
		guest.goHome();
		Actor<WebDriver> actor = guest.register(TEST_USER_LOGIN, TEST_USER_EMAIL, TEST_PASSWORD, null);	
		Assert.assertTrue(actor instanceof Guest);
		Assert.assertTrue(actor.getCurrentPage() instanceof RegistrationDialog);
		RegistrationDialog registrationDialog = (RegistrationDialog) actor.getCurrentPage();
		// Currently it is not possible to check HTML5 validation message with Selenium.
		Assert.assertNull(registrationDialog.getPasswordConfirmationErrorMessage());
		registrationDialog.clickCancel();						
	}
		
	@Test
	@Screenshot({Screenshot.When.AFTER, Screenshot.When.EXCEPTION})
	public void passwordsDoNotMatch() {
		Guest guest = actorFactory.createGuest(driver);
		guest.goHome();
		Actor<WebDriver> actor = guest.register(TEST_USER_LOGIN, TEST_USER_EMAIL, TEST_PASSWORD+"x", TEST_PASSWORD);	
		Assert.assertTrue(actor instanceof Guest);
		Assert.assertTrue(actor.getCurrentPage() instanceof RegistrationDialog);
		RegistrationDialog registrationDialog = (RegistrationDialog) actor.getCurrentPage();
		Assert.assertEquals("Passwords don't match", registrationDialog.getPasswordConfirmationErrorMessage());
		registrationDialog.clickCancel();				
	}
	
	@Test
	public void cancelSignUp() {
		
	}
	
	@After
	public void quitDriver() throws Exception {
		if (driver!=null) {
	        driver.quit();
	        driver = null;
		}
	}

	@Override
	public long getScreenshotDelay() {
		return 0;
	}
	
}
