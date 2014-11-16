package org.nasdanika.webtest.hub.impl;

public class LoginControllerRenderer {


  protected static String nl;
  public static synchronized LoginControllerRenderer create(String lineSeparator)
  {
    nl = lineSeparator;
    LoginControllerRenderer result = new LoginControllerRenderer();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "console.log(\"Hi!\");";

public String generate(org.eclipse.emf.cdo.CDOObject target, Object... args) throws Exception
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    return stringBuffer.toString();
  }
}