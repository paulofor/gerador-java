package compiledtemplates;

import java.util.*;
import util.wrappers.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.codegen.util.*;

public class ActionCadastrar
{
  protected static String nl;
  public static synchronized ActionCadastrar create(String lineSeparator)
  {
    nl = lineSeparator;
    ActionCadastrar result = new ActionCadastrar();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import java.util.List;" + NL + "" + NL + "import javax.servlet.http.HttpServletRequest;" + NL + "import javax.servlet.http.HttpServletResponse;" + NL + "" + NL + "import org.apache.struts.action.Action;" + NL + "import org.apache.struts.action.ActionError;" + NL + "import org.apache.struts.action.ActionErrors;" + NL + "import org.apache.struts.action.ActionForm;" + NL + "import org.apache.struts.action.ActionForward;" + NL + "import org.apache.struts.action.ActionMapping;" + NL + "import ";
  protected final String TEXT_3 = ".EditarAction;" + NL + "import ";
  protected final String TEXT_4 = ".";
  protected final String TEXT_5 = ";" + NL + "import ";
  protected final String TEXT_6 = ".ServiceLocator;" + NL + "import ipiranga.pdsi.framework.modelo.negocio.service.ServiceException;" + NL + "import ";
  protected final String TEXT_7 = ".";
  protected final String TEXT_8 = ";" + NL;
  protected final String TEXT_9 = NL;
  protected final String TEXT_10 = NL;
  protected final String TEXT_11 = NL;
  protected final String TEXT_12 = NL + "public abstract class ";
  protected final String TEXT_13 = " extends EditarAction{" + NL + "\t" + NL + "\tprotected abstract ";
  protected final String TEXT_14 = " preparaInsercao(";
  protected final String TEXT_15 = " ";
  protected final String TEXT_16 = ", ";
  protected final String TEXT_17 = " formBean, HttpServletRequest request, ActionErrors erros) throws ServiceException;" + NL + "\tprotected abstract ";
  protected final String TEXT_18 = " preparaAlteracao(";
  protected final String TEXT_19 = " ";
  protected final String TEXT_20 = ", ";
  protected final String TEXT_21 = " formBean, HttpServletRequest request, ActionErrors erros) throws ServiceException;" + NL + "\tprotected abstract ActionErrors executaInsercao(";
  protected final String TEXT_22 = " ";
  protected final String TEXT_23 = ", ";
  protected final String TEXT_24 = " servico, ";
  protected final String TEXT_25 = " formBean, HttpServletRequest request, ActionErrors erros) throws ServiceException;" + NL + "\tprotected abstract ActionErrors executaAlteracao(";
  protected final String TEXT_26 = " ";
  protected final String TEXT_27 = ", ";
  protected final String TEXT_28 = " servico, ";
  protected final String TEXT_29 = " formBean, HttpServletRequest request, ActionErrors erros) throws ServiceException;" + NL + "" + NL + "\tpublic ActionForward execute(ActionMapping mapping, " + NL + "\t\t\t ActionForm form, " + NL + "\t\t\t HttpServletRequest request, " + NL + "\t\t\t HttpServletResponse response) throws Exception {" + NL + "" + NL + "\t\tActionErrors errors = new ActionErrors();" + NL + "\t\tActionForward forward = new ActionForward();" + NL + "" + NL + "\t\ttry {" + NL + "\t\t\tHttpSession session = request.getSession(true);" + NL + "\t\t\tString tipoOperacao = session.getAttribute(CHAVE_TIPO_OPERACAO);" + NL + "\t\t\t";
  protected final String TEXT_30 = " servico = ServiceLocator.get";
  protected final String TEXT_31 = "();\t" + NL + "\t\t\t";
  protected final String TEXT_32 = " formBean = (";
  protected final String TEXT_33 = ") form;" + NL + "\t\t\tif (tipoOperacao.compareTo(OPERACAO_ALTERACAO)==0) {" + NL + "\t\t\t\tpreparaAlteracao(formBean, request, ActionErrors erros);" + NL + "\t\t\t\terrors = executaAlteracao(servico,formBean, request, erros);" + NL + "\t\t\t} else {" + NL + "\t\t\t\tpreparaInsercao( formBean, request, erros);" + NL + "\t\t\t\terrors = executaInsercao( servico, formBean, request, erros);" + NL + "\t\t\t}" + NL + "" + NL + "\t\t} catch (Exception e) {" + NL + "" + NL + "\t\t\t// Report the error using the appropriate name and ID." + NL + "\t\t\te.printStackTrace();" + NL + "\t\t\terrors.add(\"name\", new ActionError(\"id\"));" + NL + "" + NL + "\t\t}" + NL + "" + NL + "\t\t// If a message is required, save the specified key(s)" + NL + "\t\t// into the request for use by the <struts:errors> tag." + NL + "" + NL + "\t\tif (!errors.isEmpty()) {" + NL + "\t\t\tsaveErrors(request, errors);" + NL + "" + NL + "\t\t\t// Forward control to the appropriate 'failure' URI (change name as desired)" + NL + "\t\t\tforward = mapping.findForward(\"erro\");" + NL + "" + NL + "\t\t} else {" + NL + "" + NL + "\t\t\t// Forward control to the appropriate 'success' URI (change name as desired)" + NL + "\t\t\tforward = mapping.findForward(\"sucesso\");" + NL + "" + NL + "\t\t}" + NL + "" + NL + "\t\t// Finish with" + NL + "\t\treturn (forward);" + NL + "" + NL + "\t}" + NL + "" + NL + "}";
  protected final String TEXT_34 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    

    EClass eClass = (EClass) argument;
ClassWrapper classe = new ClassWrapper();
classe.setClasse(eClass);
ReferenceWrapper referencia = null;


    stringBuffer.append(TEXT_1);
    stringBuffer.append( classe.getPacoteActionCadastrar() );
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
    stringBuffer.append( classe.getNomeActionCadastrar() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( classe.getNomeFormBean() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( classe.getNomeFormBean() );
    stringBuffer.append(TEXT_21);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( classe.getNomeServiceI() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( classe.getNomeFormBean() );
    stringBuffer.append(TEXT_25);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( classe.getNomeServiceI() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append( classe.getNomeFormBean() );
    stringBuffer.append(TEXT_29);
    stringBuffer.append( classe.getNomeServiceI() );
    stringBuffer.append(TEXT_30);
    stringBuffer.append( classe.getNomeServiceI() );
    stringBuffer.append(TEXT_31);
    stringBuffer.append( classe.getNomeFormBean() );
    stringBuffer.append(TEXT_32);
    stringBuffer.append( classe.getNomeFormBean() );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(TEXT_34);
    return stringBuffer.toString();
  }
}
