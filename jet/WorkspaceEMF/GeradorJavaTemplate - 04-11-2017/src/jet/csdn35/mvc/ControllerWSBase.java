package jet.csdn35.mvc;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
import gerapp.modelo.*;

public class ControllerWSBase
{
  protected static String nl;
  public static synchronized ControllerWSBase create(String lineSeparator)
  {
    nl = lineSeparator;
    ControllerWSBase result = new ControllerWSBase();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "namespace ";
  protected final String TEXT_2 = ".mvc.controller {" + NL + "" + NL + "" + NL + "using System.Web;" + NL + "using System.Web.Mvc;" + NL + "" + NL + "" + NL + "public class BaseWSController : Controller {" + NL + "" + NL + "public string DiretorioVirtual" + NL + "    {" + NL + "        get" + NL + "        {" + NL + "            string teste = Request.Url.AbsolutePath;" + NL + "            string saida = \"\";" + NL + "            if (teste.Contains(\"SisacaoMVC\"))" + NL + "                saida = \"/SisacaoMVC\";" + NL + "            if (teste.Contains(\"GerProjMVC3\"))" + NL + "                saida = \"/GerProjMVC3\";" + NL + "            if (teste.Contains(\"sisacaomvc\"))" + NL + "                saida = \"/sisacaomvc\";" + NL + "            if (teste.Contains(\"gerprojmvc3\"))" + NL + "                saida = \"/gerprojmvc3\";" + NL + "            if (teste.Contains(\"Sim4MVC\"))" + NL + "                saida = \"/Sim4MVC\";" + NL + "            if (teste.Contains(\"CadVideo\"))" + NL + "                saida = \"/CadVideo\";" + NL + "            return saida;" + NL + "        }" + NL + "        set" + NL + "        {" + NL + "        }" + NL + "    }" + NL + "" + NL + "}" + NL + "" + NL + "" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
List<ClasseWrapper> classes = recursos.getListaClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
