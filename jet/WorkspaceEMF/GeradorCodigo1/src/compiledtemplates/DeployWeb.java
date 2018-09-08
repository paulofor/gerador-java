package compiledtemplates;

import java.util.*;
import util.wrappers.*;

public class DeployWeb
{
  protected static String nl;
  public static synchronized DeployWeb create(String lineSeparator)
  {
    nl = lineSeparator;
    DeployWeb result = new DeployWeb();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version = '1.0' encoding = 'UTF-8'?>" + NL + "<web-app-deployment nselem=\"web-app-deployment\" class=\"oracle.jdeveloper.deploy.war.WarProfile\" xmlns=\"http://xmlns.oracle.com/jdeveloper/101303/deploy/j2ee-war\">" + NL + "   <appletArchiveName/>" + NL + "   <appletArchives>" + NL + "      <archives/>" + NL + "      <selectionMode>0</selectionMode>" + NL + "   </appletArchives>" + NL + "   <appletDeployedAsArchive>false</appletDeployedAsArchive>" + NL + "   <appletDeployment>false</appletDeployment>" + NL + "   <appletFiles>" + NL + "      <autoInclude>true</autoInclude>" + NL + "      <deploySourceAs>0</deploySourceAs>" + NL + "      <files/>" + NL + "      <selectionFilters>" + NL + "         <Item>oracle.jdevimpl.deploy.common.JavaSelectionFilter</Item>" + NL + "      </selectionFilters>" + NL + "   </appletFiles>" + NL + "   <appletLocation/>" + NL + "   <archiveOptions>" + NL + "      <additionalManifests/>" + NL + "      <compressed>false</compressed>" + NL + "      <hasManifest>false</hasManifest>" + NL + "      <mainClass/>" + NL + "   </archiveOptions>" + NL + "   <contextRoot/>" + NL + "   <defaultConnection>OC4J2-Custom</defaultConnection>" + NL + "   <deployClientMaxHeapSize/>" + NL + "   <earURL path=\"deploy/OblTrataparametrosWEB.ear\"/>" + NL + "   <enterpriseAppName>OblTrataparametrosWEB</enterpriseAppName>" + NL + "   <fileGroups>" + NL + "      <groups>" + NL + "         <Item class=\"oracle.jdeveloper.deploy.common.PackagingFileGroup\" internalName=\"web-files\">" + NL + "            <contributors>" + NL + "               <Item type=\"5\"/>" + NL + "            </contributors>" + NL + "            <displayName>Web Files</displayName>" + NL + "            <filters>" + NL + "               <rules>" + NL + "                  <Item type=\"1\" pattern=\"WEB-INF/temp/\"/>" + NL + "                  <Item type=\"1\" pattern=\"WEB-INF/.svn/\"/>" + NL + "                  <Item type=\"1\" pattern=\".svn/\"/>" + NL + "                  <Item type=\"1\" pattern=\"**/CVS/\"/>" + NL + "                  <Item type=\"1\" pattern=\"**.cdi\"/>" + NL + "                  <Item type=\"1\" pattern=\"**.contrib\"/>" + NL + "                  <Item type=\"1\" pattern=\"**.keep\"/>" + NL + "                  <Item type=\"1\" pattern=\"**.rvi\"/>" + NL + "                  <Item type=\"1\" pattern=\".jsps/\"/>" + NL + "                  <Item type=\"1\" pattern=\".tags/\"/>" + NL + "                  <Item type=\"1\" pattern=\".dtags/\"/>" + NL + "                  <Item type=\"1\" pattern=\"**/*.jht\"/>" + NL + "                  <Item type=\"1\" pattern=\"**/*.jjt\"/>" + NL + "                  <Item type=\"1\" pattern=\"**/*.jxt\"/>" + NL + "                  <Item type=\"0\" pattern=\"**\"/>" + NL + "               </rules>" + NL + "            </filters>" + NL + "            <targetWithinJar/>" + NL + "         </Item>" + NL + "         <Item class=\"oracle.jdeveloper.deploy.common.PackagingFileGroup\" internalName=\"project-output\">" + NL + "            <contributors>" + NL + "               <Item type=\"2\"/>" + NL + "               <Item type=\"7\"/>" + NL + "            </contributors>" + NL + "            <displayName>WEB-INF/classes</displayName>" + NL + "            <filters>" + NL + "               <rules>" + NL + "                  <Item type=\"1\" pattern=\"**/CVS/\"/>" + NL + "                  <Item type=\"1\" pattern=\"**.cdi\"/>" + NL + "                  <Item type=\"1\" pattern=\"**.contrib\"/>" + NL + "                  <Item type=\"1\" pattern=\"**.keep\"/>" + NL + "                  <Item type=\"1\" pattern=\"**.rvi\"/>" + NL + "                  <Item type=\"1\" pattern=\".jsps/\"/>" + NL + "                  <Item type=\"1\" pattern=\".tags/\"/>" + NL + "                  <Item type=\"1\" pattern=\".dtags/\"/>" + NL + "                  <Item type=\"1\" pattern=\"**/*.jht\"/>" + NL + "                  <Item type=\"1\" pattern=\"**/*.jjt\"/>" + NL + "                  <Item type=\"1\" pattern=\"**/*.jxt\"/>" + NL + "                  <Item type=\"0\" pattern=\"**\"/>" + NL + "               </rules>" + NL + "            </filters>" + NL + "            <targetWithinJar>WEB-INF/classes</targetWithinJar>" + NL + "         </Item>" + NL + "         <Item class=\"oracle.jdeveloper.deploy.common.LibraryFileGroup\" internalName=\"libraries\">" + NL + "            <displayName>WEB-INF/lib</displayName>" + NL + "            <filters>" + NL + "               <rules>" + NL + "                  <Item type=\"0\" pattern=\"**\"/>" + NL + "               </rules>" + NL + "            </filters>" + NL + "            <selectedLibraries/>" + NL + "            <selectionMode>0</selectionMode>" + NL + "            <targetWithinJar>WEB-INF/lib</targetWithinJar>" + NL + "         </Item>" + NL + "      </groups>" + NL + "   </fileGroups>" + NL + "   <jarURL path=\"deploy/OblTrataparametrosWEB.war\"/>" + NL + "   <profileDeps/>" + NL + "   <properties/>" + NL + "</web-app-deployment>" + NL;
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
