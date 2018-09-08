package jet.csdn35.servico;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
import gerapp.modelo.*;

public class Carregador
{
  protected static String nl;
  public static synchronized Carregador create(String lineSeparator)
  {
    nl = lineSeparator;
    Carregador result = new Carregador();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "namespace ";
  protected final String TEXT_2 = ".servico.carregador {" + NL + "" + NL + "using System.Collections.Generic;" + NL + "using ";
  protected final String TEXT_3 = ".modelo;" + NL + "using ";
  protected final String TEXT_4 = ".dao;" + NL + "" + NL + "public class ";
  protected final String TEXT_5 = "Carregador{" + NL + "" + NL + "\tprivate DaoConexao conexao;" + NL + "\tpublic void setConexao(DaoConexao conexao) " + NL + "\t{" + NL + "\t\tthis.conexao = conexao;" + NL + "\t}" + NL + "" + NL + "}" + NL + "}";

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
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_5);
    return stringBuffer.toString();
  }
}
