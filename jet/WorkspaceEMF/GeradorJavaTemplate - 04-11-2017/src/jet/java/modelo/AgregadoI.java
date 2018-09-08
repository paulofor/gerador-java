package jet.java.modelo;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.java.*;
import gerapp.modelo.*;

public class AgregadoI
{
  protected static String nl;
  public static synchronized AgregadoI create(String lineSeparator)
  {
    nl = lineSeparator;
    AgregadoI result = new AgregadoI();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".modelo.agregado;" + NL + "" + NL + "import java.util.List;" + NL + "" + NL + "import br.com.digicom.lib.dao.DaoConexao;" + NL + "import ";
  protected final String TEXT_3 = ".modelo.*;" + NL + "" + NL + "// Gera??o autom?tica n?o alterar" + NL + "public interface ";
  protected final String TEXT_4 = "AgregadoI{" + NL + "" + NL + "\t//void setConexaoCarregador(DaoConexao conexao);" + NL + "\t\t" + NL + "\t// Com chave estrangeira" + NL + "  \t";
  protected final String TEXT_5 = NL + "\t// Montador tradicional" + NL + "\tpublic ";
  protected final String TEXT_6 = " get";
  protected final String TEXT_7 = "(boolean lazyLoader);" + NL + "\tpublic void set";
  protected final String TEXT_8 = "(";
  protected final String TEXT_9 = " item);" + NL + "\t//public void set";
  protected final String TEXT_10 = "ComReversao(";
  protected final String TEXT_11 = " item);" + NL + "\t" + NL + "\t// Montador alternativo" + NL + "\t";
  protected final String TEXT_12 = NL + "\t/*  AutoRelacionamento" + NL + "\t";
  protected final String TEXT_13 = NL + "\tpublic void addLista";
  protected final String TEXT_14 = "_";
  protected final String TEXT_15 = "(";
  protected final String TEXT_16 = " item); " + NL + "\tpublic ";
  protected final String TEXT_17 = " getCorrente";
  protected final String TEXT_18 = "_";
  protected final String TEXT_19 = "();" + NL + "\t";
  protected final String TEXT_20 = NL + "\t*/" + NL + "\t";
  protected final String TEXT_21 = NL + "\t\t";
  protected final String TEXT_22 = NL + "\t" + NL + "\t// Sem Chave Estrangeira" + NL + "\t";
  protected final String TEXT_23 = NL + "\tpublic ";
  protected final String TEXT_24 = " getCorrente";
  protected final String TEXT_25 = "_";
  protected final String TEXT_26 = "();" + NL + "\tpublic void addLista";
  protected final String TEXT_27 = "_";
  protected final String TEXT_28 = "(";
  protected final String TEXT_29 = " item);" + NL + "\tpublic List<";
  protected final String TEXT_30 = "> getLista";
  protected final String TEXT_31 = "_";
  protected final String TEXT_32 = "(); " + NL + "\tpublic void setLista";
  protected final String TEXT_33 = "_";
  protected final String TEXT_34 = "(List<";
  protected final String TEXT_35 = "> item); " + NL + "\tpublic void criaVaziaLista";
  protected final String TEXT_36 = "_";
  protected final String TEXT_37 = "();" + NL + "\tpublic boolean existeLista";
  protected final String TEXT_38 = "_";
  protected final String TEXT_39 = "();" + NL + " \t\t";
  protected final String TEXT_40 = NL + "\t" + NL + "\t// Um pra um" + NL + "\t";
  protected final String TEXT_41 = NL + "\t// Montador tradicional" + NL + "\tpublic ";
  protected final String TEXT_42 = " get";
  protected final String TEXT_43 = "(); " + NL + "\tpublic void set";
  protected final String TEXT_44 = "(";
  protected final String TEXT_45 = " item); " + NL + " \t\t";
  protected final String TEXT_46 = NL + "\t" + NL + "\tpublic void setConexaoCarregador(DaoConexao conexao);" + NL + "}";
  protected final String TEXT_47 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespace() );
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
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_11);
     if (classe.getId()==classeOposta.getId()) {
    stringBuffer.append(TEXT_12);
     } 
    stringBuffer.append(TEXT_13);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_19);
     if (classe.getId()==classeOposta.getId()) {
    stringBuffer.append(TEXT_20);
     } 
    stringBuffer.append(TEXT_21);
    
		}
	
    stringBuffer.append(TEXT_22);
    
		Iterator<RelacionamentoWrapper> iteradorN = classe.obtemListaSemChaveEstrangeira().iterator();
		while (iteradorN.hasNext()) {
		RelacionamentoWrapper relac = iteradorN.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
    stringBuffer.append(TEXT_23);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_25);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_29);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_30);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_31);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_32);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_34);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_35);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_36);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_37);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_38);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_39);
    
		}
	
    stringBuffer.append(TEXT_40);
    
		Iterator<RelacionamentoWrapper> iterador1x1 = classe.obtemListaUmPraUm().iterator();
		while (iterador1x1.hasNext()) {
		RelacionamentoWrapper relac = iterador1x1.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
    stringBuffer.append(TEXT_41);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_42);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_43);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_44);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_45);
    
		}
	
    stringBuffer.append(TEXT_46);
    stringBuffer.append(TEXT_47);
    return stringBuffer.toString();
  }
}
