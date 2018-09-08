package compiledtemplates;

import java.util.*;
import util.wrappers.*;

public class EjbOrionXml
{
  protected static String nl;
  public static synchronized EjbOrionXml create(String lineSeparator)
  {
    nl = lineSeparator;
    EjbOrionXml result = new EjbOrionXml();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version = \"1.0\" encoding = \"iso-8859-1\"?>" + NL + "<orion-ejb-jar xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:noNamespaceSchemaLocation=\"http://xmlns.oracle.com/oracleas/schema/orion-ejb-jar-10_0.xsd\" schema-major-version=\"10\" schema-minor-version=\"0\">" + NL + "<enterprise-beans>" + NL + "<session-deployment name=\"TrataparametrosCN\"/>" + NL + "<session-deployment name=\"TrataparametrosCD\"/>" + NL + "</enterprise-beans>" + NL + "</orion-ejb-jar>";
  protected final String TEXT_2 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
RecursosClasse recursos = (RecursosClasse) argument;  
ClasseFuncionalidade classe = (ClasseFuncionalidade) recursos.getClasse();
ConfiguracaoWrapper conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
