package jet.csdn35.mvc;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
import gerapp.modelo.*;

public class ControllerBase
{
  protected static String nl;
  public static synchronized ControllerBase create(String lineSeparator)
  {
    nl = lineSeparator;
    ControllerBase result = new ControllerBase();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "namespace ";
  protected final String TEXT_2 = ".mvc.controller {" + NL + "" + NL + "" + NL + "using System.Web;" + NL + "using System.Web.Mvc;" + NL + "" + NL + "" + NL + "public class BaseController : Controller {" + NL + "" + NL + "public string DiretorioVirtual" + NL + "    {" + NL + "        get" + NL + "        {" + NL + "            string teste = Request.Url.AbsolutePath;" + NL + "            string saida = \"\";" + NL + "             if (teste.ToLower().Contains(\"sisacaomvc\"))" + NL + "                saida = \"/sisacaomvc\";" + NL + "            if (teste.ToLower().Contains(\"gerprojmvc3\"))" + NL + "                saida = \"/gerprojmvc3\";" + NL + "            if (teste.ToLower().Contains(\"sim4mvc\"))" + NL + "                saida = \"/sim4mvc\";" + NL + "            if (teste.ToLower().Contains(\"sim4\"))" + NL + "                saida = \"/sim4\";" + NL + "            if (teste.ToLower().Contains(\"cadvideo\"))" + NL + "                saida = \"/cadvideo\";" + NL + "\t\t\tif (teste.ToLower().Contains(\"gesafil\"))" + NL + "                saida = \"/gesafil\";" + NL + "            if (teste.ToLower().Contains(\"valealim\"))" + NL + "                saida = \"/valealim\";" + NL + "            if (teste.ToLower().Contains(\"ctrlestoque\"))" + NL + "                saida = \"/ctrlestoque\";" + NL + "            if (teste.ToLower().Contains(\"dafitiafil\"))" + NL + "                saida = \"/dafitiafil\";" + NL + "            return saida;" + NL + "        }" + NL + "        set" + NL + "        {" + NL + "        }" + NL + "    }" + NL + "" + NL + "}" + NL + "" + NL + "" + NL + "}";

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
