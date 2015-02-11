package org.nasdanika.webtest.hub.impl;

public class TestSessionsControllerGenerator
{
  protected static String nl;
  public static synchronized TestSessionsControllerGenerator create(String lineSeparator)
  {
    nl = lineSeparator;
    TestSessionsControllerGenerator result = new TestSessionsControllerGenerator();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "require([\"";
  protected final String TEXT_2 = ".js\", 'q', 'jquery'], function(app, Q, jQuery) {" + NL + "\tangular.module('testSessionsApp', []).controller('TestSessionsController', ['$scope', function ($scope) {\t" + NL + "\t\tfunction applyModelChanges() {" + NL + "\t\t\t\t\t" + NL + "\t\t\tapp.testSessions.then(function(testSessions) {\t" + NL + "\t\t\t\tvar summaryRowPromises = testSessions.map(" + NL + "\t\t    \t\t\tfunction(tsAccessor) {" + NL + "\t\t    \t\t\t\treturn tsAccessor().then(function(ts) {" + NL + "\t\t    \t\t\t\t\treturn ts.summaryRow;" + NL + "\t\t    \t\t\t\t});" + NL + "\t\t    \t\t\t});" + NL + "\t\t    \t\t\t \t\t\t\t\t\t" + NL + "\t\t    \tQ.all(summaryRowPromises).then(function(summaryRows) {" + NL + "\t\t    \t\t$scope.testSessionsSummary = summaryRows;" + NL + "\t\t    \t\t$scope.$apply();\t\t\t" + NL + "\t\t\t\t\tjQuery(\"#testSessionsOverlay\").css(\"display\", \"none\");" + NL + "\t\t    \t}).done();" + NL + "\t\t    }).done();" + NL + "\t\t};" + NL + "" + NL + "\t\tfunction onError(error) {" + NL + "\t\t\t$scope.busy = false;" + NL + "\t\t\tjQuery(\"#testSessionsOverlay\").css(\"display\", \"none\");" + NL + "\t\t\talert(error);" + NL + "\t\t};" + NL + "\t\t" + NL + "\t\tfunction showOverlay() {" + NL + "\t\t\tvar testSessionsOverlay = jQuery('#testSessionsOverlay');" + NL + "\t\t\ttestSessionsOverlay.width(jQuery('#testSessionsPanel').width());" + NL + "\t\t\ttestSessionsOverlay.height(jQuery('#testSessionsPanel').height());" + NL + "\t\t\ttestSessionsOverlay.css(\"display\", \"block\");" + NL + "\t\t};\t\t" + NL + "\t\t" + NL + "    \tapplyModelChanges();" + NL + "" + NL + "\t\t$scope.deleteTestSession = function(path) {" + NL + "\t\t\trequire([path+\".js\"], function(testSession) {\t" + NL + "\t\t\t\tif (confirm(\"Do you really want to delete test session \"+app.name+\"?\")) {" + NL + "\t\t\t\t\tshowOverlay();" + NL + "\t\t\t\t\ttestSession.$delete().then(applyModelChanges, onError).done();" + NL + "\t\t\t\t}" + NL + "\t\t\t});" + NL + "\t\t};" + NL + "\t\t" + NL + "//\t\tjQuery(\"#testSessionsOverlay\").css(\"display\", \"none\");      " + NL + "\t}]);" + NL + "    " + NL + "\tangular.bootstrap(jQuery(\"#testSessionsPanel\"), ['testSessionsApp']);" + NL + "});";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(argument);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
