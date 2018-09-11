package jet.android2.sincronismo;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class LogRemoto
{
  protected static String nl;
  public static synchronized LogRemoto create(String lineSeparator)
  {
    nl = lineSeparator;
    LogRemoto result = new LogRemoto();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".remoto;" + NL + "" + NL + "" + NL + "public class LogRemoto {" + NL + "" + NL + "    " + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
List<ClasseWrapper> classes = recursos.getListaClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
