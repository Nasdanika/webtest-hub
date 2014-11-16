package org.nasdanika.webtest.hub.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.nasdanika.webtest.NasdanikaWebTestSuite;
import org.nasdanika.webtest.Title;

@RunWith(NasdanikaWebTestSuite.class)
@Title("WebTest Hub test report")
@SuiteClasses({WebTestHubTest.class, WebTestHubRouteTest.class})
public class WebTestHubTests {
	
}
