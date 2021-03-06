package org.nasdanika.webtest.hub.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.fail;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.nasdanika.html.Theme;
import org.nasdanika.webtest.Description;
import org.nasdanika.webtest.NasdanikaParameterizedWebTestRunner;
import org.nasdanika.webtest.Screenshot;
import org.nasdanika.webtest.Title;
import org.nasdanika.webtest.WebTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@RunWith(NasdanikaParameterizedWebTestRunner.class)
@Description("Tests WebTestHubRoute")
public class WebTestHubRouteTest implements WebTest<WebDriver> {
	
	private enum DriverType { firefox, chrome, ie } 
	
	private WebDriver driver;
		
	@Parameters(name="{index}: {0}")
	public static Collection<Object[]> registrationData() {
		List<Object[]> ret = new ArrayList<>();
		for (Theme theme: Theme.values()) {
			ret.add(new Object[] { DriverType.firefox, theme }); // TODO Add other browsers
		}
		return ret;
	}
	
	@Parameter(0)
	public DriverType driverType;
	
	@Parameter(1)
	@Title("Theme")
	public Theme theme;		
	
	@Override
	public WebDriver getWebDriver() {
		return driver;
	}

	@Before
	public void setUp() throws Exception {
		switch (driverType) {
		case firefox:
	        driver = new FirefoxDriver();
	        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			break;
		default:
			fail("Unsupported driver type: ");		
		}
	}
	
	@Test
	@Description("WebTest Hub Route")
	@Screenshot({Screenshot.When.AFTER, Screenshot.When.EXCEPTION})
	public void appRoute() throws Exception {
		getWebDriver().get("http://localhost:18080/router/webtest-hub.html?theme="+theme);
		new WebDriverWait(getWebDriver(), 20).until(ExpectedConditions.visibilityOfElementLocated(By.id("button-groups")));		
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
