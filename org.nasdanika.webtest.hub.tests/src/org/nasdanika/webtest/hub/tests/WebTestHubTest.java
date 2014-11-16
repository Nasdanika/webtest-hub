package org.nasdanika.webtest.hub.tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.nasdanika.webtest.hub.ui.driver.actors.WebTestHubActorFactory;
import org.nasdanika.webtest.hub.ui.driver.actors.WebTestHubActor;
import org.nasdanika.webtest.hub.ui.driver.pages.WebTestHubPage;
import org.nasdanika.webtest.Actor;
import org.nasdanika.webtest.ActorFactory;
import org.nasdanika.webtest.Description;
import org.nasdanika.webtest.NasdanikaWebTestRunner;
import org.nasdanika.webtest.Screenshot;
import org.nasdanika.webtest.WebTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@RunWith(NasdanikaWebTestRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@Description("Tests of WebTest Hub")
public class WebTestHubTest implements WebTest<WebDriver> {
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
	@Description("Test 1")
	@Screenshot({Screenshot.When.AFTER, Screenshot.When.EXCEPTION})
	public void testOne() throws Exception {
		WebTestHubActor actor = actorFactory.createWebTestHubActor(getWebDriver());
		WebTestHubPage page = actor.navigateToWebTestHubPage();
		Assert.assertNotNull(page); // TODO - implement assertions
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
