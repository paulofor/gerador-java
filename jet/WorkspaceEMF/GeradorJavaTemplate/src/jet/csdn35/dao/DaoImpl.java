package jet.csdn35.dao;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
import gerapp.modelo.*;

public class DaoImpl
{
  protected static String nl;
  public static synchronized DaoImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    DaoImpl result = new DaoImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "using System;" + NL + "using System.Collections;" + NL + "using br.com.digicom.lib.dao;" + NL + "using br.com.digicom.lib;" + NL + "using ";
  protected final String TEXT_2 = ".dao.basico;" + NL + "using ";
  protected final String TEXT_3 = ".dao.datasource;" + NL + "" + NL + "" + NL + "namespace ";
  protected final String TEXT_4 = ".dao" + NL + "{" + NL + "\tpublic class ";
  protected final String TEXT_5 = "Dao  : ";
  protected final String TEXT_6 = "DaoBase " + NL + "\t{ " + NL + "     " + NL + "\t}" + NL + "}";

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
