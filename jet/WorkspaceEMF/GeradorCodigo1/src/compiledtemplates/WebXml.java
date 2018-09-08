package compiledtemplates;

import java.util.*;
import util.wrappers.*;

public class WebXml
{
  protected static String nl;
  public static synchronized WebXml create(String lineSeparator)
  {
    nl = lineSeparator;
    WebXml result = new WebXml();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version = '1.0' encoding = 'iso-8859-1'?>" + NL + "<web-app xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xsi:schemaLocation='http://java.sun.com/xml/ns/j2ee http://java.sun.com/xml/ns/j2ee/web-app_2_4.xsd' version='2.4' xmlns='http://java.sun.com/xml/ns/j2ee'>" + NL + "<description>Empty web.xml file for Web Application</description>" + NL + "<filter>" + NL + "<description>filtro do PRM</description>" + NL + "<display-name>prmFilter</display-name>" + NL + "<filter-name>prmFilter</filter-name>" + NL + "<filter-class>com.br.brasilcap.arq.prm.prmfrmwrk.prmfiltro.PrmFilter</filter-class>" + NL + "</filter>" + NL + "<filter-mapping>" + NL + "<filter-name>prmFilter</filter-name>" + NL + "<servlet-name>TrataparametrosCT</servlet-name>" + NL + "<dispatcher>FORWARD</dispatcher>" + NL + "<dispatcher>INCLUDE</dispatcher>" + NL + "<dispatcher>REQUEST</dispatcher>" + NL + "</filter-mapping>" + NL + "<servlet>" + NL + "<servlet-name>TrataparametrosCT</servlet-name>" + NL + "<servlet-class>com.br.brasilcap.cap.obl.trataparametros.servlet.TrataparametrosCT</servlet-class>" + NL + "</servlet>" + NL + "<servlet-mapping>" + NL + "<servlet-name>TrataparametrosCT</servlet-name>" + NL + "<url-pattern>/trataparametrosct</url-pattern>" + NL + "</servlet-mapping>" + NL + "<session-config>" + NL + "<session-timeout>35</session-timeout>" + NL + "</session-config>" + NL + "<mime-mapping>" + NL + "<extension>html</extension>" + NL + "<mime-type>text/html</mime-type>" + NL + "</mime-mapping>" + NL + "<mime-mapping>" + NL + "<extension>txt</extension>" + NL + "<mime-type>text/plain</mime-type>" + NL + "</mime-mapping>" + NL + "</web-app>";
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
