package jet.csdn35.servico;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
import gerapp.modelo.*;

public class RegraObjetoServicoImpl
{
  protected static String nl;
  public static synchronized RegraObjetoServicoImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    RegraObjetoServicoImpl result = new RegraObjetoServicoImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "using System;" + NL + "using ";
  protected final String TEXT_2 = ".modelo;" + NL + "using ";
  protected final String TEXT_3 = ".servico.regra.basico;" + NL + "" + NL + "namespace ";
  protected final String TEXT_4 = ".servico.regra {" + NL + "" + NL + "" + NL + "" + NL + "public class ";
  protected final String TEXT_5 = "RegraImpl : ";
  protected final String TEXT_6 = "RegraBase{" + NL + "" + NL + "}" + NL + "" + NL + "}";

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
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_6);
    return stringBuffer.toString();
  }
}
