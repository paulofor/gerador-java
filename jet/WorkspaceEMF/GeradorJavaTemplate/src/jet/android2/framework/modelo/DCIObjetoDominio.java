package jet.android2.framework.modelo;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class DCIObjetoDominio
{
  protected static String nl;
  public static synchronized DCIObjetoDominio create(String lineSeparator)
  {
    nl = lineSeparator;
    DCIObjetoDominio result = new DCIObjetoDominio();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package ";
  protected final String TEXT_3 = ".framework.modelo;" + NL + "" + NL + "import android.content.ContentValues;" + NL + "" + NL + "public interface DCIObjetoDominio {" + NL + "\tContentValues getContentValues();" + NL + "    long getIdObj();" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}
