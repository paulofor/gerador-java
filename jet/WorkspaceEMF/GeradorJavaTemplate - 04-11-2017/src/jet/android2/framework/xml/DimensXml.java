package jet.android2.framework.xml;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class DimensXml
{
  protected static String nl;
  public static synchronized DimensXml create(String lineSeparator)
  {
    nl = lineSeparator;
    DimensXml result = new DimensXml();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "<resources>" + NL + "    <!-- Default screen margins, per the Android Design guidelines. -->" + NL + "    <dimen name=\"nav_header_vertical_spacing\">16dp</dimen>" + NL + "    <dimen name=\"nav_header_height\">160dp</dimen>" + NL + "    <!-- Default screen margins, per the Android Design guidelines. -->" + NL + "    <dimen name=\"activity_horizontal_margin\">16dp</dimen>" + NL + "    <dimen name=\"activity_vertical_margin\">16dp</dimen>" + NL + "    <dimen name=\"fab_margin\">16dp</dimen>" + NL + "</resources>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
