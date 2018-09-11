package jet.java.webparse;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.java.*;
import gerapp.modelo.*;

public class DadosParseImpl
{
  protected static String nl;
  public static synchronized DadosParseImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    DadosParseImpl result = new DadosParseImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".parse.dados;" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".parse.dados.basico.";
  protected final String TEXT_4 = "DadosParseBase;" + NL + "" + NL + "public class ";
  protected final String TEXT_5 = "DadosParse extends ";
  protected final String TEXT_6 = "DadosParseBase{" + NL + "" + NL + "" + NL + "" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespace() );
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
