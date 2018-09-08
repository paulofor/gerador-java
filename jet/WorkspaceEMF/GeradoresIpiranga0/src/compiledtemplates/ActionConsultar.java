package compiledtemplates;

import java.util.*;
import util.wrappers.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.codegen.util.*;

public class ActionConsultar
{
  protected static String nl;
  public static synchronized ActionConsultar create(String lineSeparator)
  {
    nl = lineSeparator;
    ActionConsultar result = new ActionConsultar();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import javax.servlet.http.HttpServletRequest;" + NL + "import javax.servlet.http.HttpServletResponse;" + NL + "" + NL + "import org.apache.struts.action.Action;" + NL + "import org.apache.struts.action.ActionError;" + NL + "import org.apache.struts.action.ActionErrors;" + NL + "import org.apache.struts.action.ActionForm;" + NL + "import org.apache.struts.action.ActionForward;" + NL + "import org.apache.struts.action.ActionMapping;" + NL + "import ";
  protected final String TEXT_3 = ".CadastrarAction;" + NL;
  protected final String TEXT_4 = NL;
  protected final String TEXT_5 = NL;
  protected final String TEXT_6 = NL;
  protected final String TEXT_7 = NL + "public abstract class ";
  protected final String TEXT_8 = " extends Action{" + NL + "" + NL + "" + NL + "\tprotected abstract executaConsulta(ActionMapping mapping, ActionForm form," + NL + "\t    HttpServletRequest request, HttpServletResponse response, ActionErrors erros) throws Exception;" + NL + "" + NL + "\tpublic ActionForward execute(ActionMapping mapping, ActionForm form," + NL + "\t    HttpServletRequest request, HttpServletResponse response)" + NL + "\t    throws Exception {" + NL + "" + NL + "\t\tActionErrors errors = new ActionErrors();" + NL + "\t\tActionForward forward = new ActionForward(); // return value" + NL + "" + NL + "\t\ttry {" + NL + "\t    \t// do something here" + NL + "\t\t\texecutaConsulta(mapping,form,request,response,errors);" + NL + "\t\t} catch (Exception e) {" + NL + "\t\t    // Report the error using the appropriate name and ID." + NL + "\t\t\te.printStackTrace();" + NL + "\t\t    errors.add(\"name\", new ActionError(\"id\"));" + NL + "\t\t}" + NL + "" + NL + "\t\t// If a message is required, save the specified key(s)" + NL + "\t\t// into the request for use by the <struts:errors> tag." + NL + "" + NL + "\t\tif (!errors.isEmpty()) {" + NL + "\t    \tsaveErrors(request, errors);" + NL + "\t    \t// Forward control to the appropriate 'failure' URI (change name as desired)" + NL + "\t\t    forward = mapping.findForward(\"erro\");" + NL + "\t\t} else {" + NL + "\t\t    // Forward control to the appropriate 'success' URI (change name as desired)" + NL + "\t\t    forward = mapping.findForward(\"sucesso\");" + NL + "\t\t}" + NL + "" + NL + "\t\t// Finish with" + NL + "\t\treturn (forward);" + NL + "" + NL + "    }" + NL + "} ";
  protected final String TEXT_9 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    

    EClass eClass = (EClass) argument;
ClassWrapper classe = new ClassWrapper();
classe.setClasse(eClass);
ReferenceWrapper referencia = null;


    stringBuffer.append(TEXT_1);
    stringBuffer.append( classe.getPacoteActionConsultar() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( classe.getPacoteActionComum() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append(TEXT_4);
    stringBuffer.append( "/*" );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( "* Classe gerada automaticamente, nao realizar alteracoes " );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( "*/" );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getNomeActionConsultar() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append(TEXT_9);
    return stringBuffer.toString();
  }
}
