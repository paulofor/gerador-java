package compiledtemplates;

import java.util.*;
import util.wrappers.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.codegen.util.*;

public class ActionPesquisar
{
  protected static String nl;
  public static synchronized ActionPesquisar create(String lineSeparator)
  {
    nl = lineSeparator;
    ActionPesquisar result = new ActionPesquisar();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import java.util.List;" + NL + "" + NL + "import javax.servlet.http.HttpServletRequest;" + NL + "import javax.servlet.http.HttpServletResponse;" + NL + "" + NL + "import org.apache.struts.action.Action;" + NL + "import org.apache.struts.action.ActionError;" + NL + "import org.apache.struts.action.ActionErrors;" + NL + "import org.apache.struts.action.ActionForm;" + NL + "import org.apache.struts.action.ActionForward;" + NL + "import org.apache.struts.action.ActionMapping;" + NL + "import ";
  protected final String TEXT_3 = ".PesquisarAction;" + NL + "import ";
  protected final String TEXT_4 = ".";
  protected final String TEXT_5 = ";" + NL + "import ";
  protected final String TEXT_6 = ".ServiceLocator;" + NL + "import ";
  protected final String TEXT_7 = ".";
  protected final String TEXT_8 = ";" + NL;
  protected final String TEXT_9 = NL;
  protected final String TEXT_10 = NL;
  protected final String TEXT_11 = NL;
  protected final String TEXT_12 = NL + "public abstract class ";
  protected final String TEXT_13 = " extends PesquisarAction{" + NL + "" + NL + "\tprotected abstract List ListaPorFiltro(";
  protected final String TEXT_14 = " servico, ";
  protected final String TEXT_15 = " formBean, HttpServletRequest request, HttpServletResponse response, ActionErrors errors);" + NL + "" + NL + "\tpublic ActionForward execute(ActionMapping mapping, ActionForm form," + NL + "\t    HttpServletRequest request, HttpServletResponse response)" + NL + "\t    throws Exception {" + NL + "" + NL + "\t\tActionErrors errors = new ActionErrors();" + NL + "\t\tActionForward forward = new ActionForward(); // return value" + NL + "\t\tList resultado = null;" + NL + "\t\t" + NL + "\t\ttry {" + NL + "\t\t\tString acao = request.getParameter(\"acao\");" + NL + "\t\t\trequest.setAttribute(\"acao\", acao);" + NL + "\t\t\t";
  protected final String TEXT_16 = " formBean = (";
  protected final String TEXT_17 = ") form;" + NL + " \t\t\t";
  protected final String TEXT_18 = " servico = ServiceLocator.get";
  protected final String TEXT_19 = "();" + NL + " \t\t\tresultado = ListaPorFiltro(servico, formBean, request, response, errors);" + NL + "  \t\t\trequest.setAttribute(\"listaPesquisa\", resultado);" + NL + "\t    \tif (resultado != null){" + NL + " \t\t\t\trequest.setAttribute(\"listaPesquisa\", resultado); \t\t\t\t" + NL + " \t\t\t} else {" + NL + " \t\t\t\trequest.setAttribute(\"listaPesquisa\", null); \t\t\t\t" + NL + " \t\t\t}" + NL + "" + NL + "\t\t} catch (Exception e) {" + NL + "" + NL + "\t\t    // Report the error using the appropriate name and ID." + NL + "\t\t\te.printStackTrace();" + NL + "\t\t    errors.add(\"name\", new ActionError(\"id\"));" + NL + "" + NL + "\t\t}" + NL + "" + NL + "\t\t// If a message is required, save the specified key(s)" + NL + "\t\t// into the request for use by the <struts:errors> tag." + NL + "" + NL + "\t\tif (!errors.isEmpty()) {" + NL + "\t    \tsaveErrors(request, errors);" + NL + "" + NL + "\t\t    // Forward control to the appropriate 'failure' URI (change name as desired)" + NL + "\t\t    forward = mapping.findForward(\"erro\");" + NL + "" + NL + "\t\t} else {" + NL + "\t\t\tif (resultado != null && resultado.size()==1) {" + NL + "\t\t\t\tforward = mapping.findForward(\"sucessoItemUnico\");" + NL + "\t\t\t} else {" + NL + "\t\t\t\tforward = mapping.findForward(\"sucesso\");" + NL + "\t\t\t}" + NL + "" + NL + "\t\t}" + NL + "" + NL + "\t\t// Finish with" + NL + "\t\treturn (forward);" + NL + "" + NL + "    }" + NL + "} ";
  protected final String TEXT_20 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    

    EClass eClass = (EClass) argument;
ClassWrapper classe = new ClassWrapper();
classe.setClasse(eClass);
ReferenceWrapper referencia = null;


    stringBuffer.append(TEXT_1);
    stringBuffer.append( classe.getPacoteActionPesquisar() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( classe.getPacoteActionComum() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( classe.getPacoteServiceI() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getNomeServiceI() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getPacoteServiceI() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getPacoteFormBean() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getNomeFormBean() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append(TEXT_9);
    stringBuffer.append( "/*" );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( "* Classe gerada automaticamente, nao realizar alteracoes " );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( "*/" );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( classe.getNomeActionPesquisar() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( classe.getNomeServiceI() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( classe.getNomeFormBean() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( classe.getNomeFormBean() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( classe.getNomeFormBean() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( classe.getNomeServiceI() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( classe.getNomeServiceI() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append(TEXT_20);
    return stringBuffer.toString();
  }
}
