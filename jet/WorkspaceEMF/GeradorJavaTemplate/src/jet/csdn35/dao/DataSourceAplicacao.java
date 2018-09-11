package jet.csdn35.dao;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
import gerapp.modelo.*;

public class DataSourceAplicacao
{
  protected static String nl;
  public static synchronized DataSourceAplicacao create(String lineSeparator)
  {
    nl = lineSeparator;
    DataSourceAplicacao result = new DataSourceAplicacao();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "using br.com.digicom.lib.dao;" + NL + "" + NL + "namespace ";
  protected final String TEXT_2 = ".dao.datasource" + NL + "{" + NL + "\tpublic class DataSourceAplicacao : MySqlDataSource" + NL + "\t{" + NL + "\t\tpublic DataSourceAplicacao() : base(\"localhost\",\"sisacao2\", \"sisacaoweb\",\"aspnet\")" + NL + "\t\t{" + NL + "\t\t\t" + NL + "\t\t}" + NL + "\t}" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
