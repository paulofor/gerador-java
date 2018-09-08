package jet.cs.vo;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.java.*;
import gerapp.modelo.*;

public class CallbackHtmlBase
{
  protected static String nl;
  public static synchronized CallbackHtmlBase create(String lineSeparator)
  {
    nl = lineSeparator;
    CallbackHtmlBase result = new CallbackHtmlBase();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    return stringBuffer.toString();
  }
}
