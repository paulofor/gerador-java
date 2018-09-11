package jet.csdn35.modelo;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
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
  protected final String TEXT_1 = "namespace ";
  protected final String TEXT_2 = ".modelo.agregados {" + NL + "" + NL + "using System.Collections.Generic;" + NL + "using br.com.digicom.lib.dao;" + NL + "using ";
  protected final String TEXT_3 = ".modelo;" + NL + "" + NL + "" + NL + "public interface ";
  protected final String TEXT_4 = "AgregadoI{" + NL + "" + NL + "\t\tvoid setConexaoCarregador(DaoConexao conexao);" + NL + "  \t";
  protected final String TEXT_5 = NL + "\t\t";
  protected final String TEXT_6 = " ";
  protected final String TEXT_7 = "_";
  protected final String TEXT_8 = " {get;set;} " + NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_9 = " AddLista";
  protected final String TEXT_10 = "_";
  protected final String TEXT_11 = " {set;} " + NL + "\t\t";
  protected final String TEXT_12 = " Corrente";
  protected final String TEXT_13 = "_";
  protected final String TEXT_14 = " {get;} " + NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_15 = NL + "\t" + NL + "\t";
  protected final String TEXT_16 = NL + "\t\t";
  protected final String TEXT_17 = " Corrente";
  protected final String TEXT_18 = "_";
  protected final String TEXT_19 = " {get;}" + NL + "\t\t";
  protected final String TEXT_20 = " AddLista";
  protected final String TEXT_21 = "_";
  protected final String TEXT_22 = " {set;}" + NL + "\t\tList<";
  protected final String TEXT_23 = "> Lista";
  protected final String TEXT_24 = "_";
  protected final String TEXT_25 = " {get;set;} " + NL + "\t\tvoid CriaVaziaLista";
  protected final String TEXT_26 = "_";
  protected final String TEXT_27 = "();" + NL + "\t\tbool ExisteLista";
  protected final String TEXT_28 = "_";
  protected final String TEXT_29 = "{ get; }" + NL + " \t\t";
  protected final String TEXT_30 = NL + "\t" + NL + "\t" + NL + "\t";
  protected final String TEXT_31 = NL + "\t\t";
  protected final String TEXT_32 = " ";
  protected final String TEXT_33 = "_";
  protected final String TEXT_34 = " {get;set;} " + NL + " \t\t";
  protected final String TEXT_35 = NL + "}" + NL + "}";

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
    
		Iterator<RelacionamentoWrapper> iterador = classe.obtemListaComChaveEstrangeira().iterator();
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
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_14);
    
		}
	
    stringBuffer.append(TEXT_15);
    
		Iterator<RelacionamentoWrapper> iteradorN = classe.obtemListaSemChaveEstrangeira().iterator();
		while (iteradorN.hasNext()) {
		RelacionamentoWrapper relac = iteradorN.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
    stringBuffer.append(TEXT_16);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_21);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_25);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_29);
    
		}
	
    stringBuffer.append(TEXT_30);
    
		Iterator<RelacionamentoWrapper> iterador1x1 = classe.obtemListaUmPraUm().iterator();
		while (iterador1x1.hasNext()) {
		RelacionamentoWrapper relac = iterador1x1.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
    stringBuffer.append(TEXT_31);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_32);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_34);
    
		}
	
    stringBuffer.append(TEXT_35);
    return stringBuffer.toString();
  }
}
