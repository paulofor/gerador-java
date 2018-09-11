package jet.android2.servico;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class ServicoImpl
{
  protected static String nl;
  public static synchronized ServicoImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    ServicoImpl result = new ServicoImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".servico.impl;" + NL + "" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".servico.base.";
  protected final String TEXT_4 = "Servico;" + NL + "" + NL + "public class ";
  protected final String TEXT_5 = "ServicoImpl extends ";
  protected final String TEXT_6 = "Servico {" + NL + "" + NL + "" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_6);
    return stringBuffer.toString();
  }
}
