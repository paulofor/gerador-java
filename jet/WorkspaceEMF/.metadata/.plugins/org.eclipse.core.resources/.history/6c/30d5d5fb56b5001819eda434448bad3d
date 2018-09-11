package jet.android2.framework.dao;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class DaoItemRetorno
{
  protected static String nl;
  public static synchronized DaoItemRetorno create(String lineSeparator)
  {
    nl = lineSeparator;
    DaoItemRetorno result = new DaoItemRetorno();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package ";
  protected final String TEXT_3 = ".framework.dao;" + NL + "" + NL + "" + NL + "import ";
  protected final String TEXT_4 = ".framework.modelo.DCIObjetoDominio;" + NL + "" + NL + "public class DaoItemRetorno {" + NL + "" + NL + "\t" + NL + "\tprivate boolean insere;" + NL + "\tprivate DCIObjetoDominio objeto;" + NL + "\t" + NL + "\tpublic boolean getInsere() {" + NL + "\t\treturn insere;" + NL + "\t}" + NL + "\tpublic void setInsere(boolean item) {" + NL + "\t\tinsere = item;" + NL + "\t}" + NL + "\t" + NL + "\tpublic DCIObjetoDominio getObjeto() {" + NL + "\t\treturn objeto;" + NL + "\t}" + NL + "\tpublic void setObjeto(DCIObjetoDominio item) {" + NL + "\t\tobjeto = item;" + NL + "\t}" + NL + "}";

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
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_4);
    return stringBuffer.toString();
  }
}
