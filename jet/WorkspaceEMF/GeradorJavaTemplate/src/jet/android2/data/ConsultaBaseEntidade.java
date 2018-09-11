package jet.android2.data;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class ConsultaBaseEntidade
{
  protected static String nl;
  public static synchronized ConsultaBaseEntidade create(String lineSeparator)
  {
    nl = lineSeparator;
    ConsultaBaseEntidade result = new ConsultaBaseEntidade();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package  ";
  protected final String TEXT_3 = ".data.provider;" + NL + "" + NL + "public abstract class ";
  protected final String TEXT_4 = "ConsultaBase {" + NL + "\t" + NL + "\t" + NL + "}";

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
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_4);
    return stringBuffer.toString();
  }
}
