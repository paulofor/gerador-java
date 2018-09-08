package compiledtemplates;

import java.util.*;
import util.wrappers.*;

public class DeployEjb
{
  protected static String nl;
  public static synchronized DeployEjb create(String lineSeparator)
  {
    nl = lineSeparator;
    DeployEjb result = new DeployEjb();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version = '1.0' encoding = 'UTF-8'?>" + NL + "<ejb-deployment nselem=\"ejb-deployment\" class=\"oracle.jdeveloper.deploy.ejb.EjbProfile\" xmlns=\"http://xmlns.oracle.com/jdeveloper/101303/deploy/j2ee-ejb-jar\">" + NL + "   <archiveOptions>" + NL + "      <additionalManifests/>" + NL + "      <compressed>false</compressed>" + NL + "      <hasManifest>true</hasManifest>" + NL + "      <mainClass/>" + NL + "   </archiveOptions>" + NL + "   <defaultConnection>OC4J2-Custom</defaultConnection>" + NL + "   <deployClientMaxHeapSize/>" + NL + "   <earURL path=\"deploy/";
  protected final String TEXT_2 = "EJB.ear\"/>" + NL + "   <enterpriseAppName>";
  protected final String TEXT_3 = "EJB</enterpriseAppName>" + NL + "   <fileGroups>" + NL + "      <groups>" + NL + "         <Item class=\"oracle.jdeveloper.deploy.common.PackagingFileGroup\" internalName=\"project-output\">" + NL + "            <contributors>" + NL + "               <Item type=\"2\"/>" + NL + "               <Item type=\"7\"/>" + NL + "            </contributors>" + NL + "            <displayName>Project Output</displayName>" + NL + "            <filters>" + NL + "               <rules>" + NL + "                  <Item type=\"1\" pattern=\"META-INF/orion-ejb-jar.xml\"/>" + NL + "                  <Item type=\"1\" pattern=\"**/CVS/\"/>" + NL + "                  <Item type=\"1\" pattern=\"**.cdi\"/>" + NL + "                  <Item type=\"1\" pattern=\"**.contrib\"/>" + NL + "                  <Item type=\"1\" pattern=\"**.keep\"/>" + NL + "                  <Item type=\"1\" pattern=\"**.rvi\"/>" + NL + "                  <Item type=\"1\" pattern=\".jsps/\"/>" + NL + "                  <Item type=\"1\" pattern=\".tags/\"/>" + NL + "                  <Item type=\"1\" pattern=\".dtags/\"/>" + NL + "                  <Item type=\"1\" pattern=\"**/*.jht\"/>" + NL + "                  <Item type=\"1\" pattern=\"**/*.jjt\"/>" + NL + "                  <Item type=\"1\" pattern=\"**/*.jxt\"/>" + NL + "                  <Item type=\"0\" pattern=\"**\"/>" + NL + "               </rules>" + NL + "            </filters>" + NL + "            <targetWithinJar/>" + NL + "         </Item>" + NL + "      </groups>" + NL + "   </fileGroups>" + NL + "   <jarURL path=\"deploy/";
  protected final String TEXT_4 = "EJB.jar\"/>" + NL + "   <profileDeps/>" + NL + "   <properties/>" + NL + "</ejb-deployment>" + NL;
  protected final String TEXT_5 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
RecursosClasse recursos = (RecursosClasse) argument;  
ClasseFuncionalidade classe = (ClasseFuncionalidade) recursos.getClasse();
ConfiguracaoWrapper conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( classe.getNome() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( classe.getNome() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( classe.getNome() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(TEXT_5);
    return stringBuffer.toString();
  }
}
