package org.nasdanika.webtest.hub.tests;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.nasdanika.webtest.Actor;
import org.nasdanika.webtest.ActorFactory;
import org.nasdanika.webtest.Description;
import org.nasdanika.webtest.NasdanikaParameterizedWebTestRunner;
import org.nasdanika.webtest.Screenshot;
import org.nasdanika.webtest.Title;
import org.nasdanika.webtest.WebTest;
import org.nasdanika.webtest.hub.ui.driver.actors.Guest;
import org.nasdanika.webtest.hub.ui.driver.actors.User;
import org.nasdanika.webtest.hub.ui.driver.actors.WebTestHubActorFactory;
import org.nasdanika.webtest.hub.ui.driver.pages.GuestHome;
import org.nasdanika.webtest.hub.ui.driver.pages.LogInFailedDialog;
import org.nasdanika.webtest.hub.ui.driver.pages.UserHome;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

@RunWith(NasdanikaParameterizedWebTestRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LogIn implements WebTest<WebDriver> {
	
	public enum Browser { firefox, chrome, iexplorer }
	
	@Parameters(name="{index}: {0}")
	public static Collection<Object[]> registrationData() {
		return Arrays.asList(new Object[][] { {Browser.firefox} /*, {Browser.chrome}, {Browser.iexplorer} */ });
	}
	
	@Parameter
	@Title("Browser")
	public Browser browser;	
	
	private static final String TEST_USER_LOGIN = "janeDoe";
	private static final String TEST_USER_EMAIL = "Jane.Doe@nasdanika.org";
	private static final String TEST_PASSWORD = "J123_D45";
	
	private WebDriver driver;
	
	@ActorFactory
	public WebTestHubActorFactory actorFactory;

	@Override
	public WebDriver getWebDriver() {
		return driver;
	}
	
	@Before
	public void setUp() throws Exception {		
		//String browser = System.getenv("browser");
		if (browser==null || Browser.chrome.equals(browser)) {
			driver = new ChromeDriver();
		} else if (Browser.firefox.equals(browser)) {
			driver = new FirefoxDriver();		
		} else if (Browser.iexplorer.equals(browser)) {
			driver = new InternetExplorerDriver();
		} else {
			throw new IllegalArgumentException("Unexpected browser: "+browser);
		}
	}

	@Test
	@Title("Register a new customer")
	@Description("Helper test - Creates a new customer account to use in tests.")
	@Screenshot({Screenshot.When.AFTER, Screenshot.When.EXCEPTION})
	public void _SignUpCustomer() throws Exception {
		Guest guest = actorFactory.createGuest(getWebDriver());
		guest.goHome();
		Actor<WebDriver> user = guest.register(TEST_USER_LOGIN, TEST_USER_EMAIL, TEST_PASSWORD, TEST_PASSWORD);
		Assert.assertTrue(user instanceof User);
		Assert.assertTrue(user.getCurrentPage() instanceof UserHome);
		//Assert.assertEquals(TEST_USER_NAME, ((UserHome) user.getCurrentPage()).getBanner());
	}

	@Test
	@Title("Log in")
	@Description("Tests successful log in")
	@Screenshot({Screenshot.When.AFTER, Screenshot.When.EXCEPTION})
	public void signIn() throws Exception {
		Guest guest = actorFactory.createGuest(driver);
		guest.goHome();
		Actor<WebDriver> actor = guest.logIn(TEST_USER_LOGIN, TEST_PASSWORD);	
		Assert.assertTrue(actor instanceof User);
		Assert.assertTrue(actor.getCurrentPage() instanceof UserHome);
		//Assert.assertEquals(TEST_CUSTOMER_NAME, ((UserHome) actor.getCurrentPage()).getBanner());
	}
	
	@Test
	@Screenshot({Screenshot.When.AFTER, Screenshot.When.EXCEPTION})
	public void invalidCredentials() {
		Guest guest = actorFactory.createGuest(driver);
		guest.goHome();
		Actor<WebDriver> actor = guest.logIn(TEST_USER_LOGIN, TEST_PASSWORD+"_1234");	
		Assert.assertTrue(actor instanceof Guest);
		Assert.assertTrue(actor.getCurrentPage() instanceof LogInFailedDialog);
	}

	@Test
	@Screenshot({Screenshot.When.AFTER, Screenshot.When.EXCEPTION})
	public void emptyOnlineId() {
		Guest guest = actorFactory.createGuest(driver);
		guest.goHome();
		Actor<WebDriver> actor = guest.logIn(null, TEST_PASSWORD);	
		Assert.assertTrue(actor instanceof Guest);
		Assert.assertTrue(actor.getCurrentPage() instanceof GuestHome);
	}

	@Test
	@Screenshot({Screenshot.When.AFTER, Screenshot.When.EXCEPTION})
	public void emptyPassword() {
		Guest guest = actorFactory.createGuest(driver);
		guest.goHome();
		Actor<WebDriver> actor = guest.logIn(TEST_USER_LOGIN, null);	
		Assert.assertTrue(actor instanceof Guest);
		Assert.assertTrue(actor.getCurrentPage() instanceof GuestHome);
	}

	@After
	public void quitDriver() {		
        //Close the browser
        driver.quit();	
        driver = null;
	}

	@Override
	public long getScreenshotDelay() {
		return 0;
	}
	
}
