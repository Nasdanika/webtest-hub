package org.nasdanika.webtest.hub.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.nasdanika.webtest.NasdanikaWebTestSuite;
import org.nasdanika.webtest.Report;
import org.nasdanika.webtest.Title;

@RunWith(NasdanikaWebTestSuite.class)
@Report
@Title("WebTest Hub test report")
@SuiteClasses({
	Register.class, 
	LogIn.class})
public class WebTestHubTests {
	
}
