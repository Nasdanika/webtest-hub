package org.nasdanika.webtest.hub.impl;

public class RegistrationControllerRenderer {


  protected static String nl;
  public static synchronized RegistrationControllerRenderer create(String lineSeparator)
  {
    nl = lineSeparator;
    RegistrationControllerRenderer result = new RegistrationControllerRenderer();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "angular.module('guestApp').controller('registrationController', function($scope, $http) {" + NL + "" + NL + "\t$scope.registrationData = {};" + NL + "\t" + NL + "\t$scope.errorData = {};" + NL + "" + NL + "\t$scope.register = function() {" + NL + "\t\t$http.post('";
  protected final String TEXT_2 = "', $scope.registrationData).success(function(data) {" + NL + "\t\t\tif (data.target) {" + NL + "           \t\twindow.location = data.target;" + NL + "           \t} else {" + NL + "\t\t\t\t$scope.errorData = data;       " + NL + "\t\t\t\tconsole.dir(data);    \t\t" + NL + "           \t}" + NL + "        }).error(function(data, status, headers, config) {" + NL + "\t\t\talert(\"Login failed: \"+status);" + NL + "\t\t});" + NL + "\t};" + NL + "" + NL + "});";
  protected final String TEXT_3 = NL;

public String generate(org.eclipse.emf.cdo.CDOObject target, Object... args) throws Exception
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(args[0]);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}