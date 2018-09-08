package jet.csdn35.dao;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
import gerapp.modelo.*;

public class DaoAplicacao
{
  protected static String nl;
  public static synchronized DaoAplicacao create(String lineSeparator)
  {
    nl = lineSeparator;
    DaoAplicacao result = new DaoAplicacao();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "using System;" + NL + "using System.Collections;" + NL + "using br.com.digicom.lib.dao;" + NL + "using br.com.digicom.lib;" + NL + "using ";
  protected final String TEXT_2 = ".dao.datasource;" + NL + "" + NL + "namespace ";
  protected final String TEXT_3 = ".dao.basico" + NL + "{" + NL + "\tpublic abstract class DaoAplicacao  : DaoBase " + NL + "\t{ " + NL + "\t\tpublic DaoAplicacao() : base(new DataSourceAplicacao()) { }" + NL + "\t\tpublic DaoAplicacao(DataFonte ds) : base(ds) {}" + NL + "\t}" + NL + "}";

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
    return stringBuffer.toString();
  }
}
