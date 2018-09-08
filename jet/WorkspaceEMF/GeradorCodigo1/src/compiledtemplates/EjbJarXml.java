package compiledtemplates;

import java.util.*;
import util.wrappers.*;

public class EjbJarXml
{
  protected static String nl;
  public static synchronized EjbJarXml create(String lineSeparator)
  {
    nl = lineSeparator;
    EjbJarXml result = new EjbJarXml();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version = '1.0' encoding = 'windows-1252'?>" + NL + "<!DOCTYPE ejb-jar PUBLIC " + NL + "   '-//Sun Microsystems, Inc.//DTD Enterprise JavaBeans 1.1//EN' " + NL + "   'http://java.sun.com/j2ee/dtds/ejb-jar_1_1.dtd'>" + NL + "" + NL + "<ejb-jar>" + NL + "<enterprise-beans>" + NL + "<session>" + NL + "<description>Session Bean ( Stateless )</description>" + NL + "<display-name>TrataparametrosCN</display-name>" + NL + "<ejb-name>TrataparametrosCN</ejb-name>" + NL + "<home>com.br.brasilcap.cap.obl.trataparametros.ejbsession.TrataparametrosCNHome</home>" + NL + "<remote>com.br.brasilcap.cap.obl.trataparametros.ejbsession.TrataparametrosCN</remote>" + NL + "<ejb-class>com.br.brasilcap.cap.obl.trataparametros.ejbsession.TrataparametrosCNBean</ejb-class>" + NL + "<session-type>Stateless</session-type>" + NL + "<transaction-type>Container</transaction-type>" + NL + "<!--" + NL + "<resource-ref>" + NL + "<res-type>jdbc/oracObl</res-type>" + NL + "<res-type>javax.sql.DataSource</res-type>" + NL + "<res-auth>Container</res-auth>" + NL + "</resource-ref>" + NL + "-->" + NL + "</session>" + NL + "<session>" + NL + "<description>Session Bean ( Stateless )</description>" + NL + "<display-name>TrataparametrosCD</display-name>" + NL + "<ejb-name>TrataparametrosCD</ejb-name>" + NL + "<home>com.br.brasilcap.cap.obl.trataparametros.ejbsession.TrataparametrosCDHome</home>" + NL + "<remote>com.br.brasilcap.cap.obl.trataparametros.ejbsession.TrataparametrosCD</remote>" + NL + "<ejb-class>com.br.brasilcap.cap.obl.trataparametros.ejbsession.TrataparametrosCDBean</ejb-class>" + NL + "<session-type>Stateless</session-type>" + NL + "<transaction-type>Container</transaction-type>" + NL + "<!--" + NL + "<resource-ref>" + NL + "<res-type>jdbc/oracObl</res-type>" + NL + "<res-type>javax.sql.DataSource</res-type>" + NL + "<res-auth>Container</res-auth>" + NL + "</resource-ref>" + NL + "-->" + NL + "</session>" + NL + "</enterprise-beans>" + NL + "" + NL + "<assembly-descriptor>" + NL + "<container-transaction>" + NL + "<method>" + NL + "<ejb-name>TrataparametrosCN</ejb-name>" + NL + "<method-name>*</method-name>" + NL + "</method>" + NL + "<trans-attribute>Required</trans-attribute>" + NL + "</container-transaction>" + NL + "<container-transaction>" + NL + "<method>" + NL + "<ejb-name>TrataparametrosCD</ejb-name>" + NL + "<method-name>*</method-name>" + NL + "</method>" + NL + "<trans-attribute>Required</trans-attribute>" + NL + "</container-transaction>" + NL + "</assembly-descriptor>" + NL + "</ejb-jar>" + NL;
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
