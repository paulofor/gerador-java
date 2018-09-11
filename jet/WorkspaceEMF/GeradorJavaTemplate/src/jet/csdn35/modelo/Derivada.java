package jet.csdn35.modelo;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
import gerapp.modelo.*;

public class Derivada
{
  protected static String nl;
  public static synchronized Derivada create(String lineSeparator)
  {
    nl = lineSeparator;
    Derivada result = new Derivada();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "namespace ";
  protected final String TEXT_2 = ".modelo.derivadas {" + NL + "" + NL + "public class ";
  protected final String TEXT_3 = "Derivada : ";
  protected final String TEXT_4 = "DerivadaBase, ";
  protected final String TEXT_5 = "DerivadaI" + NL + "{" + NL + "\tprivate ";
  protected final String TEXT_6 = " principal;" + NL + "\t" + NL + "\tpublic ";
  protected final String TEXT_7 = "Derivada(";
  protected final String TEXT_8 = " item) {" + NL + "\t\tprincipal = item;" + NL + "\t}" + NL + "}" + NL + "" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_8);
    return stringBuffer.toString();
  }
}
