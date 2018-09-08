package compiledtemplates;

import java.util.*;
import util.wrappers.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.codegen.util.*;

public class ActionTelaInicial
{
  protected static String nl;
  public static synchronized ActionTelaInicial create(String lineSeparator)
  {
    nl = lineSeparator;
    ActionTelaInicial result = new ActionTelaInicial();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "" + NL + "import javax.servlet.http.HttpServletRequest;" + NL + "import javax.servlet.http.HttpServletResponse;" + NL + "import javax.servlet.http.HttpSession;" + NL + "" + NL + "import org.apache.struts.action.Action;" + NL + "import org.apache.struts.action.ActionError;" + NL + "import org.apache.struts.action.ActionErrors;" + NL + "import org.apache.struts.action.ActionForm;" + NL + "import org.apache.struts.action.ActionForward;" + NL + "import org.apache.struts.action.ActionMapping;";
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL;
  protected final String TEXT_5 = NL;
  protected final String TEXT_6 = NL + "public class ";
  protected final String TEXT_7 = " extends Action{" + NL + "" + NL + "\tpublic ActionForward execute(ActionMapping mapping, ActionForm form," + NL + "\t    HttpServletRequest request, HttpServletResponse response)" + NL + "\t    throws Exception {" + NL + "\t\t" + NL + "\t\tActionErrors errors = new ActionErrors();" + NL + "\t\tActionForward forward = new ActionForward();" + NL + "\t\tif (!errors.isEmpty()) {" + NL + "\t\t\tsaveErrors(request, errors);" + NL + "\t\t} else {" + NL + "\t\t\tforward = mapping.findForward(\"sucesso\");" + NL + "\t\t}" + NL + "\t\treturn (forward);" + NL + "\t\t" + NL + "    }" + NL + "}" + NL;
  protected final String TEXT_8 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    

    EClass eClass = (EClass) argument;
ClassWrapper classe = new ClassWrapper();
classe.setClasse(eClass);
ReferenceWrapper referencia = null;


    stringBuffer.append(TEXT_1);
    stringBuffer.append( classe.getPacoteActionTelaInicial() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append(TEXT_3);
    stringBuffer.append( "/*" );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( "* Classe gerada automaticamente, nao realizar alteracoes " );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( "*/" );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getNomeActionTelaInicial() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append(TEXT_8);
    return stringBuffer.toString();
  }
}
