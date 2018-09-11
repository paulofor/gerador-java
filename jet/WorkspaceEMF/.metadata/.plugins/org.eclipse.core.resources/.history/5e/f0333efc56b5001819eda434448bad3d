package jet.android2.modelo;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class AgregadoInterface
{
  protected static String nl;
  public static synchronized AgregadoInterface create(String lineSeparator)
  {
    nl = lineSeparator;
    AgregadoInterface result = new AgregadoInterface();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".modelo.agregado;" + NL + "" + NL + "import java.util.List;" + NL + "import ";
  protected final String TEXT_3 = ".modelo.*;" + NL + "" + NL + "public interface ";
  protected final String TEXT_4 = "AgregadoI{" + NL + "" + NL + "\t// ComChaveEstrangeira" + NL + "  \t";
  protected final String TEXT_5 = NL + "\t\tpublic ";
  protected final String TEXT_6 = " get";
  protected final String TEXT_7 = "_";
  protected final String TEXT_8 = "(); " + NL + "\t\tpublic void set";
  protected final String TEXT_9 = "_";
  protected final String TEXT_10 = "(";
  protected final String TEXT_11 = " item); " + NL + "\t\t";
  protected final String TEXT_12 = NL + "\t\tpublic void addLista";
  protected final String TEXT_13 = "_";
  protected final String TEXT_14 = "(";
  protected final String TEXT_15 = " item); " + NL + "\t\tpublic ";
  protected final String TEXT_16 = " getCorrente";
  protected final String TEXT_17 = "_";
  protected final String TEXT_18 = "(); " + NL + "\t\t";
  protected final String TEXT_19 = NL + "\t\t";
  protected final String TEXT_20 = NL + "\t" + NL + "\t// SemChaveEstrangeira" + NL + "\t";
  protected final String TEXT_21 = NL + "\t\tpublic ";
  protected final String TEXT_22 = " getCorrente";
  protected final String TEXT_23 = "_";
  protected final String TEXT_24 = "();" + NL + "\t\tpublic void addLista";
  protected final String TEXT_25 = "_";
  protected final String TEXT_26 = "(";
  protected final String TEXT_27 = " item);" + NL + "\t\t//public List<";
  protected final String TEXT_28 = "> getLista";
  protected final String TEXT_29 = "_";
  protected final String TEXT_30 = "();" + NL + "\t\tpublic List<";
  protected final String TEXT_31 = "> getLista";
  protected final String TEXT_32 = "_";
  protected final String TEXT_33 = "Original();" + NL + "\t\t//public List<";
  protected final String TEXT_34 = "> getLista";
  protected final String TEXT_35 = "_";
  protected final String TEXT_36 = "(int qtde);" + NL + "\t\t//public void setLista";
  protected final String TEXT_37 = "_";
  protected final String TEXT_38 = "(List<";
  protected final String TEXT_39 = "> lista); " + NL + "\t\t//public void setLista";
  protected final String TEXT_40 = "_";
  protected final String TEXT_41 = "ByDao(List<";
  protected final String TEXT_42 = "> lista); " + NL + "\t\t//public void criaVaziaLista";
  protected final String TEXT_43 = "_";
  protected final String TEXT_44 = "();" + NL + "\t\tpublic boolean existeLista";
  protected final String TEXT_45 = "_";
  protected final String TEXT_46 = "();" + NL + " \t\t";
  protected final String TEXT_47 = NL + "\t" + NL + "\t// UmPraUm" + NL + "\t";
  protected final String TEXT_48 = NL + "\t\t//public ";
  protected final String TEXT_49 = " get";
  protected final String TEXT_50 = "_";
  protected final String TEXT_51 = "(); " + NL + "\t\t//public void set";
  protected final String TEXT_52 = "_";
  protected final String TEXT_53 = "(";
  protected final String TEXT_54 = " item); " + NL + " \t\t";
  protected final String TEXT_55 = NL + "}";
  protected final String TEXT_56 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_4);
    
		Iterator<RelacionamentoWrapper> iterador = classe.obtemListaComChaveEstrangeiraComUsuario().iterator();
		while (iterador.hasNext()) {
		RelacionamentoWrapper relac = iterador.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_11);
     if (classeOposta.getId()!=classe.getId()) { 
    stringBuffer.append(TEXT_12);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_18);
     } 
    stringBuffer.append(TEXT_19);
    
		}
	
    stringBuffer.append(TEXT_20);
    
		Iterator<RelacionamentoWrapper> iteradorN = classe.obtemListaSemChaveEstrangeira().iterator();
		while (iteradorN.hasNext()) {
		RelacionamentoWrapper relac = iteradorN.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
    stringBuffer.append(TEXT_21);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_25);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_29);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_30);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_31);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_32);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_34);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_35);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_36);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_37);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_38);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_39);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_40);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_41);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_42);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_43);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_44);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_45);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_46);
    
		}
	
    stringBuffer.append(TEXT_47);
    
		Iterator<RelacionamentoWrapper> iterador1x1 = classe.obtemListaUmPraUm().iterator();
		while (iterador1x1.hasNext()) {
		RelacionamentoWrapper relac = iterador1x1.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
    stringBuffer.append(TEXT_48);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_49);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_50);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_51);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_52);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_53);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_54);
    
		}
	
    stringBuffer.append(TEXT_55);
    stringBuffer.append(TEXT_56);
    return stringBuffer.toString();
  }
}
