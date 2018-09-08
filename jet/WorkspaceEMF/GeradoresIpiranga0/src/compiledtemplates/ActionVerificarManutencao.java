package compiledtemplates;

import java.util.*;
import util.wrappers.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.codegen.util.*;

public class ActionVerificarManutencao
{
  protected static String nl;
  public static synchronized ActionVerificarManutencao create(String lineSeparator)
  {
    nl = lineSeparator;
    ActionVerificarManutencao result = new ActionVerificarManutencao();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import javax.servlet.http.HttpServletRequest;" + NL + "import javax.servlet.http.HttpServletResponse;" + NL + "import javax.servlet.http.HttpSession;" + NL + "" + NL + "import org.apache.struts.action.Action;" + NL + "import org.apache.struts.action.ActionError;" + NL + "import org.apache.struts.action.ActionErrors;" + NL + "import org.apache.struts.action.ActionForm;" + NL + "import org.apache.struts.action.ActionForward;" + NL + "import org.apache.struts.action.ActionMapping;" + NL + "import ";
  protected final String TEXT_3 = ".EditarAction;" + NL + "import ";
  protected final String TEXT_4 = ".";
  protected final String TEXT_5 = ";" + NL + "import ";
  protected final String TEXT_6 = ".";
  protected final String TEXT_7 = ";" + NL + "import ";
  protected final String TEXT_8 = ".";
  protected final String TEXT_9 = ";" + NL + "import ";
  protected final String TEXT_10 = ".ServiceLocator;" + NL + "import ";
  protected final String TEXT_11 = ".";
  protected final String TEXT_12 = ";" + NL;
  protected final String TEXT_13 = NL;
  protected final String TEXT_14 = NL;
  protected final String TEXT_15 = NL;
  protected final String TEXT_16 = NL + "public abstract class ";
  protected final String TEXT_17 = " extends EditarAction {" + NL + "" + NL + "\tpublic abstract ";
  protected final String TEXT_18 = " pesquisa";
  protected final String TEXT_19 = "(";
  protected final String TEXT_20 = " servico, HttpServletRequest request, HttpServletResponse response,ActionErrors errors);" + NL + "\tpublic abstract ";
  protected final String TEXT_21 = " preparaInclusao(";
  protected final String TEXT_22 = " ";
  protected final String TEXT_23 = ",";
  protected final String TEXT_24 = " formBean,  HttpServletRequest request, HttpServletResponse response,ActionErrors errors);" + NL + "\tpublic abstract ";
  protected final String TEXT_25 = " preparaAlteracao(";
  protected final String TEXT_26 = " ";
  protected final String TEXT_27 = ", ";
  protected final String TEXT_28 = " formBean ,  HttpServletRequest request, HttpServletResponse response,ActionErrors errors);" + NL + "\t" + NL + "\tpublic ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)" + NL + "    throws Exception {" + NL + "    " + NL + "\t\tActionErrors errors = new ActionErrors();" + NL + "\t\tActionForward forward = new ActionForward();" + NL + "\t\tboolean inclusao = false;" + NL + "\t\t" + NL + "\t\ttry {" + NL + "\t\t\tHttpSession session = request.getSession(true);" + NL + "\t\t\t";
  protected final String TEXT_29 = " formBean = (";
  protected final String TEXT_30 = ") form;" + NL + " \t\t\t";
  protected final String TEXT_31 = " servico = ServiceLocator.get";
  protected final String TEXT_32 = "();" + NL + "\t\t\t";
  protected final String TEXT_33 = " ";
  protected final String TEXT_34 = " = pesquisa";
  protected final String TEXT_35 = "(servico, request, response, errors);" + NL + "\t\t\tif (errors.isEmpty()) {" + NL + "\t\t\t\tif (";
  protected final String TEXT_36 = "==null) {" + NL + "\t\t\t\t\tinclusao = true;" + NL + "\t\t\t\t\tsession.setAttribute(CHAVE_TIPO_OPERACAO,OPERACAO_INCLUSAO);" + NL + "\t\t\t\t\t";
  protected final String TEXT_37 = " = new ";
  protected final String TEXT_38 = "();" + NL + "\t\t\t\t\tpreparaInclusao(";
  protected final String TEXT_39 = ",formBean, request, response,errors);" + NL + "\t\t\t\t} else {" + NL + "\t\t\t\t\tsession.setAttribute(CHAVE_TIPO_OPERACAO,OPERACAO_ALTERACAO);" + NL + "\t\t\t\t\tpreparaAlteracao(";
  protected final String TEXT_40 = ", formBean , request, response,errors);" + NL + "\t\t\t\t}" + NL + "\t\t\t} " + NL + "\t\t} catch (Exception e) {" + NL + "" + NL + "\t\t    // Report the error using the appropriate name and ID." + NL + "\t\t\te.printStackTrace();" + NL + "\t\t    errors.add(\"name\", new ActionError(\"id\"));" + NL + "" + NL + "\t\t}" + NL + "" + NL + "\t\t// If a message is required, save the specified key(s)" + NL + "\t\t// into the request for use by the <struts:errors> tag." + NL + "" + NL + "\t\tif (!errors.isEmpty()) {" + NL + "\t    \tsaveErrors(request, errors);" + NL + "" + NL + "\t\t    // Forward control to the appropriate 'failure' URI (change name as desired)" + NL + "\t\t    forward = mapping.findForward(\"erro\");" + NL + "" + NL + "\t\t} else {" + NL + "" + NL + "\t\t    // Forward control to the appropriate 'success' URI (change name as desired)" + NL + "\t\t    if (inclusao){" + NL + "\t\t    \tforward = mapping.findForward(\"sucessoInclusao\");" + NL + "\t\t    } else {" + NL + "\t\t    \tforward = mapping.findForward(\"sucessoAlteracao\");" + NL + "\t\t    }" + NL + "\t\t\t" + NL + "" + NL + "\t\t}" + NL + "" + NL + "\t\t// Finish with" + NL + "\t\treturn (forward);" + NL + "" + NL + "\t}" + NL + "} " + NL;
  protected final String TEXT_41 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    

    EClass eClass = (EClass) argument;
ClassWrapper classe = new ClassWrapper();
classe.setClasse(eClass);
ReferenceWrapper referencia = null;


    stringBuffer.append(TEXT_1);
    stringBuffer.append( classe.getPacoteActionVerificarManutencao() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( classe.getPacoteActionComum() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( classe.getPacoteModeloI() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getPacoteModeloVo() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getNomeModeloVo() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getPacoteServiceI() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( classe.getNomeServiceI() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( classe.getPacoteServiceI() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( classe.getPacoteFormBean() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( classe.getNomeFormBean() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(TEXT_13);
    stringBuffer.append( "/*" );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( "* Classe gerada automaticamente, nao realizar alteracoes " );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( "*/" );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( classe.getNomeActionVerificarManutencao() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( classe.getNomeSimples() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( classe.getNomeServiceI() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_21);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( classe.getNomeFormBean() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_25);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( classe.getNomeFormBean() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append( classe.getNomeFormBean() );
    stringBuffer.append(TEXT_29);
    stringBuffer.append( classe.getNomeFormBean() );
    stringBuffer.append(TEXT_30);
    stringBuffer.append( classe.getNomeServiceI() );
    stringBuffer.append(TEXT_31);
    stringBuffer.append( classe.getNomeServiceI() );
    stringBuffer.append(TEXT_32);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_34);
    stringBuffer.append( classe.getNomeSimples() );
    stringBuffer.append(TEXT_35);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_36);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_37);
    stringBuffer.append( classe.getNomeModeloVo() );
    stringBuffer.append(TEXT_38);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_39);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_40);
    stringBuffer.append(TEXT_41);
    return stringBuffer.toString();
  }
}
