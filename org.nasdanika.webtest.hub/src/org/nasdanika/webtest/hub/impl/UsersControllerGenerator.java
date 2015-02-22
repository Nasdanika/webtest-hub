package org.nasdanika.webtest.hub.impl;

public class UsersControllerGenerator {


  protected static String nl;
  public static synchronized UsersControllerGenerator create(String lineSeparator)
  {
    nl = lineSeparator;
    UsersControllerGenerator result = new UsersControllerGenerator();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "require([\"";
  protected final String TEXT_2 = ".js\", 'q', 'jquery'], function(hub, Q, jQuery) {" + NL + "\tangular.module('hubUsersApp', []).controller('UsersController', ['$scope', function ($scope) {  \t " + NL + "" + NL + "\t\tfunction onError(error) {" + NL + "\t\t\tjQuery(\"#usersAppOverlay\").css(\"display\", \"none\");" + NL + "\t\t\tconsole.trace(error);" + NL + "\t\t\talert(error);" + NL + "\t\t};" + NL + "\t\t" + NL + "\t\tfunction showOverlay() {" + NL + "\t\t\tjQuery('#usersAppOverlay').width(jQuery('#usersApp').width()+12);" + NL + "\t\t\tjQuery('#usersAppOverlay').height(jQuery('#usersApp').height()+12);" + NL + "\t\t\tjQuery(\"#usersAppOverlay\").show();\t\t" + NL + "\t\t};\t\t" + NL + "\t\t   \t\t  \t\t" + NL + "\t\t$scope.$applyAsync(function($scope) {" + NL + "\t\t\tjQuery(\"#usersAppOverlay\").hide();" + NL + "\t\t\t$scope.userModel = ";
  protected final String TEXT_3 = "; \t\t" + NL + "\t\t});\t\t\t\t\t" + NL + "      " + NL + "\t}]);" + NL + "    " + NL + "\tangular.bootstrap(jQuery(\"#usersApp\"), ['hubUsersApp']);" + NL + "});";

public String generate(Object... args) throws Exception
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(args[0]);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(args[1]);
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}