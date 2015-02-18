package org.nasdanika.webtest.hub.impl;

public class HubScriptConsoleControllerGenerator
{
  protected static String nl;
  public static synchronized HubScriptConsoleControllerGenerator create(String lineSeparator)
  {
    nl = lineSeparator;
    HubScriptConsoleControllerGenerator result = new HubScriptConsoleControllerGenerator();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "require([\"";
  protected final String TEXT_2 = ".js\", 'q', 'jquery'], function(hub, Q, jQuery) {" + NL + "\tangular.module('hubScriptConsoleApp', ['ngSanitize']).controller('HubScriptConsoleController', ['$scope', '$sce', function ($scope, $sce) {  \t " + NL + "" + NL + "\t\tvar outputElement = jQuery('#scriptConsoleForm').find('#output');\t\t" + NL + "" + NL + "\t\t$scope.executeScript = function() {" + NL + "\t\t\tvar outputInnerHtml = outputElement.html();" + NL + "\t\t\tconsole.log(outputInnerHtml);" + NL + "\t\t\toutputElement.html(outputInnerHtml + \"<div style='color:green'>\"+$scope.script+\"</div>\");" + NL + "\t\t\tvar script = $scope.script;" + NL + "\t\t\t$scope.script = \"\";" + NL + "\t\t\tif (script === 'cls') {" + NL + "\t\t\t\toutputElement.html(\"\");" + NL + "\t\t\t} else {\t\t\t" + NL + "\t\t\t\tjQuery('#scriptConsoleOverlay').width(jQuery('#scriptConsoleForm').width());" + NL + "\t\t\t\tjQuery('#scriptConsoleOverlay').height(jQuery('#scriptConsoleForm').height());" + NL + "\t\t\t\tjQuery(\"#scriptConsoleOverlay\").css(\"display\", \"block\");" + NL + "\t\t\t\t\t\t" + NL + "\t\t\t\thub.executeScript(script).then(function(result) {" + NL + "\t\t\t\t\tvar oih = outputElement.html()+ \"<div>\"+result.output+\"</div>\";" + NL + "\t\t\t\t\tif (result.hasOwnProperty('result')) {" + NL + "\t\t\t\t\t\toih+=\"<div style='color:blue'>\"+result.result+\"</div>\";" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t\tif (result.hasOwnProperty('exception')) {" + NL + "\t\t\t\t\t\toih+=\"<div style='color:red'>\"+result.exception+\"</div>\";" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t\toutputElement.html(oih);\t\t\t\t" + NL + "\t\t\t\t\toutputElement.scrollTop(outputElement[0].scrollHeight);" + NL + "\t\t    \t\t$scope.$apply();\t\t\t" + NL + "\t\t\t\t\tjQuery(\"#scriptConsoleOverlay\").css(\"display\", \"none\");" + NL + "\t\t\t\t}," + NL + "\t\t\t\tfunction(error) {" + NL + "\t\t\t\t\tjQuery(\"#scriptConsoleOverlay\").css(\"display\", \"none\");" + NL + "\t\t\t\t\tconsole.trace(error);" + NL + "\t\t\t\t\talert(error);\t\t\t" + NL + "\t\t\t\t}).done();" + NL + "\t\t\t}" + NL + "\t\t};      " + NL + "\t\t" + NL + "\t\tjQuery(\"#scriptConsoleOverlay\").css(\"display\", \"none\");" + NL + "      " + NL + "\t}]);" + NL + "    " + NL + "\tangular.bootstrap(jQuery(\"#scriptConsoleForm\"), ['hubScriptConsoleApp']);" + NL + "});";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(argument);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
