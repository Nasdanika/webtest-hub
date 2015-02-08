package org.nasdanika.webtest.hub.impl;

public class ApplicationsControllerGenerator
{
  protected static String nl;
  public static synchronized ApplicationsControllerGenerator create(String lineSeparator)
  {
    nl = lineSeparator;
    ApplicationsControllerGenerator result = new ApplicationsControllerGenerator();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "require([\"";
  protected final String TEXT_2 = ".js\", 'q'], function(hub, Q) {" + NL + "\tangular.module('hubApp', ['ngSanitize']).controller('ApplicationsController', ['$scope', '$sce', function ($scope, $sce) {  \t " + NL + "\t\tfunction applyModelChanges() {" + NL + "\t    \tQ.all(hub.applications.map(function(app) { return app().summaryRow })).then(function (summaryRows) {" + NL + "\t    \t\tfor (var i in summaryRows) {" + NL + "\t    \t\t\tsummaryRows[i].name = $sce.trustAsHtml(summaryRows[i].name);" + NL + "\t    \t\t}" + NL + "\t    \t\t$scope.hubApplicationsSummary = summaryRows;" + NL + "\t    \t\t$scope.$apply();\t\t\t" + NL + "\t\t\t\tjQuery(\"#appOverlay\").css(\"display\", \"none\");" + NL + "\t    \t}).done();" + NL + "\t\t};" + NL + "" + NL + "\t\tfunction onError(error) {" + NL + "\t\t\tjQuery(\"#appOverlay\").css(\"display\", \"none\");" + NL + "\t\t\tconsole.trace(error);" + NL + "\t\t\talert(error);" + NL + "\t\t};" + NL + "\t\t" + NL + "\t\tfunction showOverlay() {" + NL + "\t\t\tjQuery('#appOverlay').width(jQuery('#appContainer').width());" + NL + "\t\t\tjQuery('#appOverlay').height(jQuery('#appContainer').height());" + NL + "\t\t\tjQuery(\"#appOverlay\").css(\"display\", \"block\");\t\t" + NL + "\t\t};\t\t" + NL + "\t\t   " + NL + "    \t$scope.hub = hub;" + NL + "    \t" + NL + "    \tQ.all(hub.applications.map(function(app) { return app().summaryRow })).then(function (summaryRows) {" + NL + "    \t\tfor (var i in summaryRows) {" + NL + "    \t\t\tsummaryRows[i].name = $sce.trustAsHtml(summaryRows[i].name);" + NL + "    \t\t}" + NL + "    \t\t$scope.hubApplicationsSummary = summaryRows;" + NL + "    \t\t$scope.$apply();" + NL + "    \t}).done();" + NL + "    \t" + NL + "    \t$scope.appName = function(app) {" + NL + "    \t\treturn typeof app === 'function' ? app().name : app.name;" + NL + "    \t};" + NL + "" + NL + "\t\tvar appPropertyDescriptor = Object.getOwnPropertyDescriptor(hub, \"applications\");" + NL + "\t\t$scope.canAddApp = appPropertyDescriptor!==undefined && appPropertyDescriptor.hasOwnProperty(\"set\");" + NL + "\t\t" + NL + "\t\t$scope.deleteApp = function(path) {" + NL + "\t\t\trequire([path+\".js\"], function(app) {\t\t\t" + NL + "\t\t\t\tif (confirm(\"Do you really want to delete application \"+app.name+\"?\")) {" + NL + "\t\t\t\t\tshowOverlay();" + NL + "\t\t\t\t\tapp.$delete().then(applyModelChanges, onError).done();" + NL + "\t\t\t\t}" + NL + "\t\t\t});" + NL + "\t\t};" + NL + "\t\t" + NL + "\t\t$scope.newApplicationData = { };" + NL + "" + NL + "\t\t$scope.addApp = function() {" + NL + "\t\t\tvar hubApps = hub.applications;" + NL + "\t\t\tfor (var ak in hubApps) {" + NL + "\t\t\t\tconsole.log(hubApps[ak]().name);" + NL + "\t\t\t\tconsole.dir($scope.newApplicationData);" + NL + "\t\t\t\tif (hubApps[ak]().name === $scope.newApplicationData.name) {" + NL + "\t\t\t\t\t$scope.newAppErrorMessage = \"Duplicate application name\";" + NL + "\t\t\t\t\treturn;" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t\thub.applications.push($scope.newApplicationData);" + NL + "\t\t\thub.$store().then(" + NL + "\t\t\t\tfunction() {" + NL + "\t\t\t\t\t$scope.newApplicationData = {};" + NL + "\t\t\t\t\tdelete $scope.newAppErrorMessage;" + NL + "\t\t\t\t\t$scope.$apply();" + NL + "\t\t\t\t\tvar newAppModal = angular.element(\"#newAppFormModal\");" + NL + "\t\t\t\t\tnewAppModal.on('hidden.bs.modal', function (e) {" + NL + "\t\t\t\t\t\tvar apps = hub.applications;" + NL + "\t\t\t\t\t\tvar route = 'router/main/'+apps[apps.length-1].$path+'.html';" + NL + "\t\t\t\t\t\tworkspace.navigate(route, { trigger : true });" + NL + "\t\t\t\t\t});" + NL + "\t\t\t\t\tnewAppModal.modal('hide');" + NL + "\t\t\t\t}," + NL + "\t\t\t\tfunction(error) {" + NL + "\t\t\t\t\t$scope.newAppErrorMessage = error;" + NL + "\t\t\t\t}).done();" + NL + "\t\t};      " + NL + "\t\t" + NL + "\t\tjQuery(\"#appOverlay\").css(\"display\", \"none\");" + NL + "      " + NL + "\t}]);" + NL + "    " + NL + "\tangular.bootstrap(jQuery(\"#applicationPanel\"), ['hubApp']);" + NL + "});";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(argument);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
