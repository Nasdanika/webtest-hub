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
  protected final String TEXT_2 = ".js\", 'q', 'jquery'], function(hub, Q, jQuery) {" + NL + "\tangular.module('hubUsersApp', []).controller('UsersController', ['$scope', function ($scope) {  \t" + NL + "\t" + NL + "\t\tfunction updateUserList(userList) {" + NL + "\t\t\t$scope.$apply(function($scope) {" + NL + "\t\t\t\t$scope.userList = userList;" + NL + "\t\t\t\thideOverlay();" + NL + "\t\t\t});" + NL + "\t\t} " + NL + "" + NL + "\t\tfunction onError(error) {" + NL + "\t\t\tjQuery(\"#usersAppOverlay\").css(\"display\", \"none\");" + NL + "\t\t\tconsole.trace(error);" + NL + "\t\t\talert(error);" + NL + "\t\t};" + NL + "\t\t\t\t\t\t" + NL + "\t\tfunction showOverlay() {" + NL + "\t\t\tjQuery('#usersAppOverlay').width(jQuery('#usersApp').width()+12);" + NL + "\t\t\tjQuery('#usersAppOverlay').height(jQuery('#usersApp').height()+12);" + NL + "\t\t\tjQuery(\"#usersAppOverlay\").show();\t\t" + NL + "\t\t};\t" + NL + "\t\t" + NL + "\t\tfunction hideOverlay() {" + NL + "\t\t\tjQuery(\"#usersAppOverlay\").hide();" + NL + "\t\t}" + NL + "\t\t\t\t\t\t" + NL + "\t\tfunction showFormOverlay() {" + NL + "\t\t\tjQuery('#userFormOverlay').width(jQuery('#userForm').width());" + NL + "\t\t\tjQuery('#userFormOverlay').height(jQuery('#userForm').height());" + NL + "\t\t\tjQuery(\"#userFormOverlay\").show();\t\t" + NL + "\t\t};\t" + NL + "\t\t" + NL + "\t\tfunction hideFormOverlay() {" + NL + "\t\t\tjQuery(\"#userFormOverlay\").hide();" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\thub.userList.then(function(userList) {" + NL + "\t\t\t$scope.$apply(function($scope) {" + NL + "\t\t\t\t$scope.userModel = ";
  protected final String TEXT_3 = ";" + NL + "\t\t\t\t$scope.userList = userList;" + NL + "\t\t\t\t" + NL + "\t\t\t\t$scope.updateUser = function(userInfo) {" + NL + "\t\t\t\t\t$scope.userModel.clear();" + NL + "\t\t\t\t\t$scope.userModel.data = userInfo;" + NL + "\t\t\t\t\t$scope.userDialogTitle = \"Update user\";" + NL + "\t\t\t\t\tjQuery(\"#createUpdateUserFormModal\").modal('show');" + NL + "\t\t\t\t}" + NL + "\t\t\t\t" + NL + "\t\t\t\t$scope.createUser = function() {" + NL + "\t\t\t\t\t$scope.userModel.clear();" + NL + "\t\t\t\t\t$scope.userDialogTitle = \"Create user\";" + NL + "\t\t\t\t\tjQuery(\"#createUpdateUserFormModal\").modal('show');" + NL + "\t\t\t\t}" + NL + "\t\t\t\t" + NL + "\t\t\t\t$scope.createOrUpdateUser = function() {" + NL + "\t\t\t\t\tshowFormOverlay();" + NL + "\t\t\t\t\t" + NL + "\t\t\t\t\t$scope.userModel.validateAndApply(hub.createOrUpdateUser).then(" + NL + "\t\t\t\t\t\tfunction(userList) {" + NL + "\t\t\t\t\t\t\t$scope.$apply(function($scope) {" + NL + "\t\t\t\t\t\t\t\t$scope.userList = userList;" + NL + "\t\t\t\t\t\t\t\thideFormOverlay();" + NL + "\t\t\t\t\t\t\t\tjQuery(\"#createUpdateUserFormModal\").modal('hide');\t\t\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t\t});\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t}," + NL + "\t\t\t\t\t\tfunction(reason) {" + NL + "\t\t\t\t\t\tif (reason.validationFailed) {" + NL + "\t\t\t\t\t\t\t$scope.$apply();" + NL + "\t\t\t\t\t\t} else {" + NL + "\t\t\t\t\t\t\tconsole.trace(reason);" + NL + "\t\t\t\t\t\t\talert(reason.targetInvocationError ? reason.targetInvocationError : reason);\t\t\t\t\t\t" + NL + "\t\t\t\t\t\t}\t\t\t\t\t" + NL + "\t\t\t\t\t\thideFormOverlay();" + NL + "\t\t\t\t\t}).done();" + NL + "\t\t\t\t}" + NL + "\t\t\t\t" + NL + "\t\t\t\t$scope.deleteUser = function(userInfo) {" + NL + "\t\t\t\t\tif (confirm(\"Do you really want to delete user \"+userInfo.login+\"?\")) {" + NL + "\t\t\t\t\t\tshowOverlay();" + NL + "\t\t\t\t\t\thub.deleteUser(userInfo.login).then(updateUserList, onError).done();" + NL + "\t\t\t\t\t}\t\t\t\t" + NL + "\t\t\t\t}" + NL + "\t\t\t\t \t" + NL + "\t\t\t\thideOverlay();" + NL + "\t\t\t});\t\t\t\t\t\t\t" + NL + "\t\t});\t\t\t   \t\t  \t\t" + NL + "      " + NL + "\t}]);" + NL + "    " + NL + "\tangular.bootstrap(jQuery(\"#usersApp\"), ['hubUsersApp']);" + NL + "});";

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