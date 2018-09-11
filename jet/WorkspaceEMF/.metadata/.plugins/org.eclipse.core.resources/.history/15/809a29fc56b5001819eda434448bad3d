package jet.android2.framework.xml;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class StringXml
{
  protected static String nl;
  public static synchronized StringXml create(String lineSeparator)
  {
    nl = lineSeparator;
    StringXml result = new StringXml();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "<resources>" + NL + "    <string name=\"app_name\">";
  protected final String TEXT_3 = "</string>" + NL + "" + NL + "    <string name=\"sync_account_type\">lojadigicom.";
  protected final String TEXT_4 = "</string>" + NL + "    <string name=\"content_authority\">br.com.lojadigicom.";
  protected final String TEXT_5 = "</string>" + NL + "</resources>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNomeAplicacao() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_5);
    return stringBuffer.toString();
  }
}
