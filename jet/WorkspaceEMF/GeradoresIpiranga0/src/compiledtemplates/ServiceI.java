package compiledtemplates;

import java.util.*;
import util.wrappers.*;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.codegen.util.*;

public class ServiceI
{
  protected static String nl;
  public static synchronized ServiceI create(String lineSeparator)
  {
    nl = lineSeparator;
    ServiceI result = new ServiceI();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import ipiranga.pdsi.framework.modelo.negocio.service.ServiceException;" + NL + "import ";
  protected final String TEXT_3 = ".*;" + NL + "import java.util.List;" + NL + "import ipiranga.pdsi.framework.modelo.acesso.DaoFactory;" + NL;
  protected final String TEXT_4 = NL;
  protected final String TEXT_5 = NL;
  protected final String TEXT_6 = NL;
  protected final String TEXT_7 = NL;
  protected final String TEXT_8 = NL;
  protected final String TEXT_9 = NL;
  protected final String TEXT_10 = NL;
  protected final String TEXT_11 = NL + "public interface ";
  protected final String TEXT_12 = " ";
  protected final String TEXT_13 = " extends ";
  protected final String TEXT_14 = " ";
  protected final String TEXT_15 = "{" + NL;
  protected final String TEXT_16 = NL + "\tpublic ";
  protected final String TEXT_17 = " obtemPorChave(";
  protected final String TEXT_18 = " ";
  protected final String TEXT_19 = ") throws ServiceException;" + NL + "\tpublic List listaAtivos() throws ServiceException;";
  protected final String TEXT_20 = NL + "\tpublic ";
  protected final String TEXT_21 = " cadastra";
  protected final String TEXT_22 = "(";
  protected final String TEXT_23 = " ";
  protected final String TEXT_24 = ") throws ServiceException;" + NL + "\tpublic ";
  protected final String TEXT_25 = " cadastra";
  protected final String TEXT_26 = "(";
  protected final String TEXT_27 = " ";
  protected final String TEXT_28 = ", DaoFactory factory) throws ServiceException;" + NL + "\tpublic ";
  protected final String TEXT_29 = " atualiza";
  protected final String TEXT_30 = "(";
  protected final String TEXT_31 = " ";
  protected final String TEXT_32 = ") throws ServiceException;" + NL + "\tpublic List obtemPorFiltro(";
  protected final String TEXT_33 = " ";
  protected final String TEXT_34 = ") throws ServiceException;" + NL + "\tpublic List obtemPorFiltro(";
  protected final String TEXT_35 = " ";
  protected final String TEXT_36 = ", String tipoFiltro) throws ServiceException;" + NL + "\t" + NL + "\t";
  protected final String TEXT_37 = NL + "    public ";
  protected final String TEXT_38 = " ";
  protected final String TEXT_39 = "  throws ServiceException;";
  protected final String TEXT_40 = NL;
  protected final String TEXT_41 = NL + "\t";
  protected final String TEXT_42 = NL + "    ";
  protected final String TEXT_43 = " ";
  protected final String TEXT_44 = NL + "    ";
  protected final String TEXT_45 = " ";
  protected final String TEXT_46 = NL + "    ";
  protected final String TEXT_47 = NL + "\tpublic ";
  protected final String TEXT_48 = " ";
  protected final String TEXT_49 = "(";
  protected final String TEXT_50 = " item)  throws ServiceException;\t";
  protected final String TEXT_51 = NL;
  protected final String TEXT_52 = NL + "\t";
  protected final String TEXT_53 = NL + "    ";
  protected final String TEXT_54 = " ";
  protected final String TEXT_55 = NL + "    ";
  protected final String TEXT_56 = " ";
  protected final String TEXT_57 = NL + "    ";
  protected final String TEXT_58 = NL + "\t//public List ";
  protected final String TEXT_59 = "(";
  protected final String TEXT_60 = " ";
  protected final String TEXT_61 = ");\t" + NL + "\tpublic List ";
  protected final String TEXT_62 = "(";
  protected final String TEXT_63 = ")  throws ServiceException;\t" + NL + "\t" + NL + "\t";
  protected final String TEXT_64 = NL + "    ";
  protected final String TEXT_65 = " ";
  protected final String TEXT_66 = NL + "    ";
  protected final String TEXT_67 = " ";
  protected final String TEXT_68 = NL + "    ";
  protected final String TEXT_69 = NL + "    ";
  protected final String TEXT_70 = NL + "\t//public boolean ";
  protected final String TEXT_71 = "(";
  protected final String TEXT_72 = " ";
  protected final String TEXT_73 = ");\t" + NL + "\tpublic boolean ";
  protected final String TEXT_74 = "(";
  protected final String TEXT_75 = ")  throws ServiceException;\t" + NL + "\t";
  protected final String TEXT_76 = NL + NL + "\t";
  protected final String TEXT_77 = NL + "\tpublic ";
  protected final String TEXT_78 = " get";
  protected final String TEXT_79 = "(";
  protected final String TEXT_80 = ")  throws ServiceException;" + NL + "\t";
  protected final String TEXT_81 = NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
EClass eClass = (EClass) argument;  
ClassWrapper classe = new ClassWrapper();
classe.setClasse(eClass);
AttributeWrapper atributo = new AttributeWrapper();
ReferenceWrapper referencia = null;
OperationWrapper operacao = new OperationWrapper();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( classe.getPacoteServiceI() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( classe.getPacoteModeloI() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append(TEXT_4);
    stringBuffer.append( "/*" );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( "* Interface gerada automaticamente, n&atilde;o realizar altera&ccedil;&otilde;es " );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( "*/" );
    stringBuffer.append(TEXT_7);
    stringBuffer.append(TEXT_8);
    stringBuffer.append( "/***"  );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( "*  Interface respons&aacute;vel por oferecer servi&ccedil;os que manipulem objetos do tipo " + classe.getNomeModeloI() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( "*/ " );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( classe.getNomeServiceI() );
    stringBuffer.append(TEXT_12);
     if (classe.getSuperTipo()!=null) {
    stringBuffer.append(TEXT_13);
    stringBuffer.append( classe.getSuperTipo().getNomeServiceI() );
    stringBuffer.append(TEXT_14);
     } 
    stringBuffer.append(TEXT_15);
     if (classe.getSuperTipo()==null) { 
    stringBuffer.append(TEXT_16);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_19);
     } 
    stringBuffer.append(TEXT_20);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_21);
    stringBuffer.append( classe.getNomeSimples() );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_25);
    stringBuffer.append( classe.getNomeSimples() );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_29);
    stringBuffer.append( classe.getNomeSimples() );
    stringBuffer.append(TEXT_30);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_31);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_32);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_34);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_35);
    stringBuffer.append( classe.getNomeVariavel() );
    stringBuffer.append(TEXT_36);
    for (EOperation item : eClass.getEOperations()) {
     operacao.setOperation(item); 
    stringBuffer.append(TEXT_37);
    stringBuffer.append( operacao.getTipo() );
    stringBuffer.append(TEXT_38);
    stringBuffer.append( operacao.getAssinatura() );
    stringBuffer.append(TEXT_39);
    }
    stringBuffer.append(TEXT_40);
    
	Iterator iterador = classe.getReferenceWrappersOpostoUnico().iterator();
	while(iterador.hasNext()) {
		ReferenceWrapper reference = (ReferenceWrapper) iterador.next();

    stringBuffer.append(TEXT_41);
    stringBuffer.append( "/***"  );
    stringBuffer.append(TEXT_42);
    stringBuffer.append( "* Retorna o " + classe.getNomeModeloI() + " relacionado com " + reference.getClasseOposta().getNomeModeloI() + " passado como par&acirc;metro" );
    stringBuffer.append(TEXT_43);
    stringBuffer.append(TEXT_44);
    stringBuffer.append( "* @param item objeto a ser relacionado" );
    stringBuffer.append(TEXT_45);
    stringBuffer.append(TEXT_46);
    stringBuffer.append( "*/ " );
    stringBuffer.append(TEXT_47);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_48);
    stringBuffer.append( reference.metodoObtemServico() );
    stringBuffer.append(TEXT_49);
    stringBuffer.append( reference.getClasseOposta().getNomeModeloI() );
    stringBuffer.append(TEXT_50);
    	} 
    stringBuffer.append(TEXT_51);
    
	iterador = classe.getReferenceWrappersOpostoMultiplo().iterator();
	while(iterador.hasNext()) {
		ReferenceWrapper reference = (ReferenceWrapper) iterador.next();

    stringBuffer.append(TEXT_52);
    stringBuffer.append( "/***"  );
    stringBuffer.append(TEXT_53);
    stringBuffer.append( "* Retorna uma lista de objetos " + classe.getNomeModeloI() + " que estejam relacionados com " + reference.getClasseOposta().getNomeModeloI() + " passado como par&acirc;metro" );
    stringBuffer.append(TEXT_54);
    stringBuffer.append(TEXT_55);
    stringBuffer.append( "* @param " + reference.getClasseOposta().getNomeVariavel() + " objeto de refer&ecirc;ncia utilizado para criar a lista " );
    stringBuffer.append(TEXT_56);
    stringBuffer.append(TEXT_57);
    stringBuffer.append( "*/ " );
    stringBuffer.append(TEXT_58);
    stringBuffer.append( reference.metodoObtemServico() );
    stringBuffer.append(TEXT_59);
    stringBuffer.append( reference.getClasseOposta().getNomeModeloI() );
    stringBuffer.append(TEXT_60);
    stringBuffer.append( reference.getClasseOposta().getNomeVariavel() );
    stringBuffer.append(TEXT_61);
    stringBuffer.append( reference.metodoObtemServico() );
    stringBuffer.append(TEXT_62);
    stringBuffer.append( reference.declaracaoParametro() );
    stringBuffer.append(TEXT_63);
    stringBuffer.append( "/***"  );
    stringBuffer.append(TEXT_64);
    stringBuffer.append( "* Gerada pelo relacionamento com o objeto de dominio " + reference.getClasseOposta().getNomeSimples() );
    stringBuffer.append(TEXT_65);
    stringBuffer.append(TEXT_66);
    stringBuffer.append( "* @param item objeto a ser relacionado" );
    stringBuffer.append(TEXT_67);
    stringBuffer.append(TEXT_68);
    stringBuffer.append( "* @return retorna verdadeiro se existir relacao com o parametro informado " );
    stringBuffer.append(TEXT_69);
    stringBuffer.append( "*/ " );
    stringBuffer.append(TEXT_70);
    stringBuffer.append( reference.metodoExisteRelacionamento() );
    stringBuffer.append(TEXT_71);
    stringBuffer.append( reference.getClasseOposta().getNomeModeloI() );
    stringBuffer.append(TEXT_72);
    stringBuffer.append( reference.getClasseOposta().getNomeVariavel() );
    stringBuffer.append(TEXT_73);
    stringBuffer.append( reference.metodoExisteRelacionamento() );
    stringBuffer.append(TEXT_74);
    stringBuffer.append( reference.declaracaoParametro() );
    stringBuffer.append(TEXT_75);
    	} 
    stringBuffer.append(TEXT_76);
     if (classe.ehAssociativa()) {
    stringBuffer.append(TEXT_77);
    stringBuffer.append( classe.getNomeModeloI() );
    stringBuffer.append(TEXT_78);
    stringBuffer.append( classe.getNomeSimples() );
    stringBuffer.append(TEXT_79);
    stringBuffer.append( classe.parametrosParaAssociativa() );
    stringBuffer.append(TEXT_80);
     } 
    stringBuffer.append(TEXT_81);
    return stringBuffer.toString();
  }
}
