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
  protected final String TEXT_2 = ".js\"], function(hub) {" + NL + "\tconsole.log(hub.name);" + NL + "\treturn;" + NL + "\ttry {" + NL + "\t\tangular.module('hubApp', []).controller('AppsController', ['$scope', function ($scope) {  \t " + NL + "\t\t\tfunction applyModelChanges() {" + NL + "\t\t\t\t$scope.$apply();" + NL + "\t\t\t\tjQuery(\"#appOverlay\").css(\"display\", \"none\");" + NL + "\t\t\t};" + NL + "\t" + NL + "\t\t\tfunction onError(error) {" + NL + "\t\t\t\tjQuery(\"#appOverlay\").css(\"display\", \"none\");" + NL + "\t\t\t\tconsole.trace(error);" + NL + "\t\t\t\talert(error);" + NL + "\t\t\t};" + NL + "\t\t\t" + NL + "\t\t\tfunction showOverlay() {" + NL + "\t\t\t\tjQuery('#appOverlay').width(jQuery('#appContainer').width());" + NL + "\t\t\t\tjQuery('#appOverlay').height(jQuery('#appContainer').height());" + NL + "\t\t\t\tjQuery(\"#appOverlay\").css(\"display\", \"block\");\t\t" + NL + "\t\t\t};\t\t" + NL + "\t\t\t   " + NL + "\t    \t$scope.hub = hub;" + NL + "\t    \t" + NL + "\t    \t$scope.hubApplications = function() {" + NL + "\t    \t\treturn hub.applications;" + NL + "\t    \t}" + NL + "\t    \t" + NL + "\t    \t$scope.appName = function(app) {" + NL + "\t    \t\treturn typeof app === 'function' ? app().name : app.name;" + NL + "\t    \t};" + NL + "\t" + NL + "\t\t\tvar appPropertyDescriptor = Object.getOwnPropertyDescriptor(hub, \"applications\");" + NL + "\t\t\t$scope.canAddApp = appPropertyDescriptor!==undefined && appPropertyDescriptor.hasOwnProperty(\"set\");" + NL + "\t\t\t" + NL + "\t\t\t$scope.canDeleteApp = function(pos) {" + NL + "\t\t\t\tvar app = hub.applications[pos];\t\t\t" + NL + "\t\t\t\treturn typeof app === 'function' && typeof app().$delete === 'function';" + NL + "\t\t\t};" + NL + "\t\t\t" + NL + "\t\t\t$scope.deleteApp = function(pos) {" + NL + "\t\t\t\tif (confirm(\"Do you really want to delete application \"+hub.applications[pos]().name+\"?\")) {" + NL + "\t\t\t\t\tshowOverlay();" + NL + "\t\t\t\t\thub.applications.splice(pos, 1);" + NL + "\t\t\t\t\thub.$store().then(applyModelChanges, onError).done();" + NL + "\t\t\t\t}" + NL + "\t\t\t};" + NL + "\t" + NL + "\t\t\t$scope.addApp = function() {" + NL + "\t\t\t\tvar hubApps = hub.applications;" + NL + "\t\t\t\tfor (ak in hubApps) {" + NL + "\t\t\t\t\tif (hubApps[ak]().name === $scope.newAppName) {" + NL + "\t\t\t\t\t\t$scope.newAppErrorMessage = \"Duplicate application name\";" + NL + "\t\t\t\t\t\treturn;" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t}" + NL + "\t\t\t\thub.applications.push({ name: $scope.newAppName });" + NL + "\t\t\t\thub.$store().then(" + NL + "\t\t\t\t\tfunction() {" + NL + "\t\t\t\t\t\tdelete $scope.newAppName;" + NL + "\t\t\t\t\t\tdelete $scope.newAppErrorMessage;" + NL + "\t\t\t\t\t\t$scope.$apply();" + NL + "\t\t\t\t\t\tvar newAppModal = angular.element(\"#newAppFormModal\");" + NL + "\t\t\t\t\t\tnewAppModal.on('hidden.bs.modal', function (e) {" + NL + "\t\t\t\t\t\t\tvar apps = hub.applications;" + NL + "\t\t\t\t\t\t\tvar route = 'router/main/'+apps[apps.length-1].$path+'.html';" + NL + "\t\t\t\t\t\t\tworkspace.navigate(route, { trigger : true });" + NL + "\t\t\t\t\t\t});" + NL + "\t\t\t\t\t\tnewAppModal.modal('hide');" + NL + "\t\t\t\t\t}," + NL + "\t\t\t\t\tfunction(error) {" + NL + "\t\t\t\t\t\t$scope.newAppErrorMessage = error;" + NL + "\t\t\t\t\t}).done();" + NL + "\t\t\t};      " + NL + "\t\t\t" + NL + "\t\t\tjQuery(\"#appOverlay\").css(\"display\", \"none\");" + NL + "\t      " + NL + "\t\t}]);" + NL + "\t    " + NL + "\t\tangular.bootstrap(jQuery(\"#applicationPanel\"), ['hubApp']);" + NL + "\t} catch (error) {" + NL + "\t\tlog.error(error);" + NL + "\t}" + NL + "});";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(argument);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
