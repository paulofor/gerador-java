package jet.csdn35.servico;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
import gerapp.modelo.*;

public class RegraServico
{
  protected static String nl;
  public static synchronized RegraServico create(String lineSeparator)
  {
    nl = lineSeparator;
    RegraServico result = new RegraServico();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "using System;" + NL + "using ";
  protected final String TEXT_2 = ".modelo;" + NL + "" + NL + "namespace ";
  protected final String TEXT_3 = ".servico.filtro {" + NL + "" + NL + "" + NL + "" + NL + "public class ";
  protected final String TEXT_4 = "Filtro {";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_4);
    return stringBuffer.toString();
  }
}
