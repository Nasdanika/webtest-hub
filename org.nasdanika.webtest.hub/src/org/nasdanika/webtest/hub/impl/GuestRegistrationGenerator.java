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
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + NL + "require([\"";
  protected final String TEXT_3 = ".js\", 'q', 'jquery', 'knockout', 'domReady!'], function(guest, Q, jQuery, ko, doc) {" + NL + "\tko.applyBindings({" + NL + "\t\tmodel: new ";
  protected final String TEXT_4 = "(undefined, guest)," + NL + "\t\tsubmitHandler: function(form) {" + NL + "\t\t\tvar overlay = jQuery('#registrationFormOverlay')" + NL + "\t\t\toverlay.width(form.offsetWidth);" + NL + "\t\t\toverlay.height(form.offsetHeight);" + NL + "\t\t\toverlay.css(\"display\", \"block\");\t\t" + NL + "" + NL + "\t\t\tthis.model.validateAndApply().then(function(value) {" + NL + "\t\t\t\tif (value.validationResults) {" + NL + "\t\t\t\t\tthis.validationResults = value.validationResults;" + NL + "\t\t\t\t} else {" + NL + "\t\t\t\t\twindow.location.href = value;" + NL + "\t\t\t\t}" + NL + "\t\t\t\toverlay.css(\"display\", \"none\");" + NL + "\t\t\t}.bind(this.model)," + NL + "\t\t\tfunction(reason) {" + NL + "\t\t\t\tif (reason.targetInvocationError) {" + NL + "\t\t\t\t\tthis.validationResults['$this'] = reason.targetInvocationError;" + NL + "\t\t\t\t}" + NL + "\t\t\t\toverlay.css(\"display\", \"none\");" + NL + "\t\t\t}.bind(this.model));" + NL + "\t\t}," + NL + "\t\tcancelHandler: function() {" + NL + "\t\t\twindow.history.back();" + NL + "\t\t}\t\t" + NL + "\t}, doc.getElementById('";
  protected final String TEXT_5 = "'));" + NL + "" + NL + "});";
  protected final String TEXT_6 = NL;

@Override
public String execute(C context, T... args) throws Exception
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
	T moduleName = args[0];
	T formHandler = args[1];
	T applyId = args[2];

    stringBuffer.append(TEXT_2);
    stringBuffer.append(moduleName);
    stringBuffer.append(TEXT_3);
    stringBuffer.append(formHandler);
    stringBuffer.append(TEXT_4);
    stringBuffer.append(applyId);
    stringBuffer.append(TEXT_5);
    stringBuffer.append(TEXT_6);
    return stringBuffer.toString();
  }
}