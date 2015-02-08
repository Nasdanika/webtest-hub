package org.nasdanika.webtest.hub.impl;

public class GuestAppControllersRenderer {


  protected static String nl;
  public static synchronized GuestAppControllersRenderer create(String lineSeparator)
  {
    nl = lineSeparator;
    GuestAppControllersRenderer result = new GuestAppControllersRenderer();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "angular.module('guestApp', []).controller('registrationController', function($scope, $http) {" + NL + "\t" + NL + "\t$scope.registrationData = {};" + NL + "\t" + NL + "\t$scope.errorData = {};" + NL + "" + NL + "\t$scope.register = function() {" + NL + "\t\t$http.post('";
  protected final String TEXT_2 = "/register', $scope.registrationData).success(function(data) {" + NL + "\t\t\tif (data.target) {" + NL + "           \t\twindow.location = data.target;" + NL + "           \t} else {" + NL + "\t\t\t\t$scope.errorData = data;       " + NL + "\t\t\t\tconsole.dir(data);    \t\t" + NL + "           \t}" + NL + "        }).error(function(data, status, headers, config) {" + NL + "\t\t\talert(\"Registration failed: \"+status);" + NL + "\t\t});" + NL + "\t};" + NL + "" + NL + "});" + NL + "" + NL + "angular.module('guestApp').controller('loginController', function($scope, $http) {" + NL + "" + NL + "\t// create a blank object to hold our form information" + NL + "\t// $scope will allow this to pass between controller and view" + NL + "\t$scope.loginData = {" + NL + "\t\t" + NL + "\t};" + NL + "" + NL + "\t// process the form" + NL + "\t$scope.login = function() {" + NL + "\t\t$http.post('";
  protected final String TEXT_3 = "/login', $scope.loginData).success(function(data) {" + NL + "           \twindow.location = data;" + NL + "        }).error(function(data, status, headers, config) {" + NL + "        \t$scope.error = true;" + NL + "\t\t\tif (401 == status) {" + NL + "\t\t\t\t//fe.addClass(\"has-error\");" + NL + "\t\t\t\tjQuery('#authentication-failed-modal').modal();" + NL + "\t\t\t\t//fe.eq(0).children()[0].focus();\t\t\t\t\t\t\t\t\t\t\t\t" + NL + "\t\t\t} else {" + NL + "\t\t\t\talert(\"Login failed: \"+status);" + NL + "\t\t\t}" + NL + "\t\t});" + NL + "\t};" + NL + "" + NL + "});";
  protected final String TEXT_4 = NL;

public String generate(org.eclipse.emf.cdo.CDOObject target, Object... args) throws Exception
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(args[0]);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(args[0]);
    stringBuffer.append(TEXT_3);
    stringBuffer.append(TEXT_4);
    return stringBuffer.toString();
  }
}