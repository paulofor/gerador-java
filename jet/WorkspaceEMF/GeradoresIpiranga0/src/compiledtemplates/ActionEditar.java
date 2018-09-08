package compiledtemplates;

import java.util.*;
import util.wrappers.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.codegen.util.*;

public class ActionEditar
{
  protected static String nl;
  public static synchronized ActionEditar create(String lineSeparator)
  {
    nl = lineSeparator;
    ActionEditar result = new ActionEditar();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "" + NL + "import javax.servlet.http.HttpServletRequest;" + NL + "import javax.servlet.http.HttpServletResponse;" + NL + "" + NL + "import org.apache.struts.action.Action;" + NL + "import org.apache.struts.action.ActionForm;" + NL + "import org.apache.struts.action.ActionForward;" + NL + "import org.apache.struts.action.ActionMapping;" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".";
  protected final String TEXT_4 = ";" + NL + "import ";
  protected final String TEXT_5 = ".ServiceLocator;" + NL + "import ";
  protected final String TEXT_6 = ".";
  protected final String TEXT_7 = ";" + NL + NL;
  protected final String TEXT_8 = NL;
  protected final String TEXT_9 = NL;
  protected final String TEXT_10 = NL;
  protected final String TEXT_11 = NL + "public abstract class ";
  protected final String TEXT_12 = " extends Action{" + NL + "" + NL + "\tpublic ActionForward execute(ActionMapping mapping, ActionForm form," + NL + "\t    HttpServletRequest request, HttpServletResponse response)" + NL + "\t    throws Exception {" + NL + "" + NL + "\t\t";
  protected final String TEXT_13 = " servico = ServiceLocator.get";
  protected final String TEXT_14 = "();\t" + NL + "\t\t";
  protected final String TEXT_15 = " formBean = (";
  protected final String TEXT_16 = ") form;" + NL + "\t\treturn execute(servico,formBean,mapping,request,response);" + NL + "\t\t" + NL + "    }" + NL + "    " + NL + "    protected abstract ActionForward execute(";
  protected final String TEXT_17 = " servico, ";
  protected final String TEXT_18 = " formBean, ActionMapping mapping, HttpServletRequest request, HttpServletResponse response) throws Exception;" + NL + "    " + NL + "} " + NL;
  protected final String TEXT_19 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    

    EClass eClass = (EClass) argument;
ClassWrapper classe = new ClassWrapper();
classe.setClasse(eClass);
ReferenceWrapper referencia = null;


    stringBuffer.append(TEXT_1);
    stringBuffer.append( classe.getPacoteActionEditar() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( classe.getPacoteServiceI() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( classe.getNomeServiceI() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getPacoteServiceI() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getPacoteFormBean() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getNomeFormBean() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append(TEXT_8);
    stringBuffer.append( "/*" );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( "* Classe gerada automaticamente, nao realizar alteracoes " );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( "*/" );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( classe.getNomeActionEditar() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( classe.getNomeServiceI() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( classe.getNomeServiceI() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( classe.getNomeFormBean() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( classe.getNomeFormBean() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( classe.getNomeServiceI() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( classe.getNomeFormBean() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append(TEXT_19);
    return stringBuffer.toString();
  }
}
