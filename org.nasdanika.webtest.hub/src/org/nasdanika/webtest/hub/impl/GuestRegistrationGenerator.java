package org.nasdanika.webtest.hub.impl;

public class GuestRegistrationGenerator<C extends org.nasdanika.core.Context, T> extends org.nasdanika.core.AbstractCommand<C,T,String> {

  protected static String nl;
  public static synchronized GuestRegistrationGenerator create(String lineSeparator)
  {
    nl = lineSeparator;
    GuestRegistrationGenerator result = new GuestRegistrationGenerator();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "require([\"";
  protected final String TEXT_2 = ".js\", 'q', 'jquery'], function(hub, Q, jQuery) { // TODO  - knockout, require config to eliminate version in modules" + NL + "" + NL + "});";

@Override
public String execute(C context, T... args) throws Exception
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(args[0]);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}