package jet.csdn35.ws;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
import gerapp.modelo.*;

public class WsObjeto
{
  protected static String nl;
  public static synchronized WsObjeto create(String lineSeparator)
  {
    nl = lineSeparator;
    WsObjeto result = new WsObjeto();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "namespace ";
  protected final String TEXT_2 = ".modelo.ws" + NL + "{" + NL + "" + NL + "\tusing ";
  protected final String TEXT_3 = ".modelo.vo;" + NL + "\tusing ";
  protected final String TEXT_4 = ".modelo;" + NL + "\tusing System.Collections;" + NL + "" + NL + "\tpublic class ";
  protected final String TEXT_5 = "ObjetoWs " + NL + "\t{" + NL + "\t" + NL + "\t\t";
  protected final String TEXT_6 = NL + "\t\tprivate ";
  protected final String TEXT_7 = " ";
  protected final String TEXT_8 = ";" + NL + "\t\tpublic ";
  protected final String TEXT_9 = " ";
  protected final String TEXT_10 = NL + "\t\t{" + NL + "\t\t\tget { return ";
  protected final String TEXT_11 = "; }" + NL + "\t\t\tset { ";
  protected final String TEXT_12 = " = value; }" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_13 = NL + "\t\t" + NL + "\t\t" + NL + "    \t";
  protected final String TEXT_14 = NL + "\t\tprivate ";
  protected final String TEXT_15 = "ObjetoWs[] lista";
  protected final String TEXT_16 = ";" + NL + "\t\tpublic ";
  protected final String TEXT_17 = "ObjetoWs[] Lista";
  protected final String TEXT_18 = "_";
  protected final String TEXT_19 = " " + NL + "\t\t{\t" + NL + "\t\t\tget {" + NL + "\t\t\t\treturn lista";
  protected final String TEXT_20 = ";" + NL + "\t\t\t}" + NL + "\t\t\tset {" + NL + "\t\t\t\tlista";
  protected final String TEXT_21 = " = value;" + NL + "\t\t\t}" + NL + "\t\t} " + NL + " \t\t";
  protected final String TEXT_22 = NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_23 = NL + "\t\tprivate ";
  protected final String TEXT_24 = "ObjetoWs ";
  protected final String TEXT_25 = ";" + NL + "\t\tpublic ";
  protected final String TEXT_26 = "ObjetoWs ";
  protected final String TEXT_27 = "_";
  protected final String TEXT_28 = " " + NL + "\t\t{\t" + NL + "\t\t\tget {" + NL + "\t\t\t\treturn ";
  protected final String TEXT_29 = ";" + NL + "\t\t\t}" + NL + "\t\t\tset {" + NL + "\t\t\t\t";
  protected final String TEXT_30 = " = value;" + NL + "\t\t\t}" + NL + "\t\t} " + NL + " \t\t";
  protected final String TEXT_31 = NL + "\t" + NL + "\t}" + NL + "\t" + NL + "}";

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
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_5);
    
		Iterator<AtributoTotalI> iterador = classe.getListaAtributoTotal().iterator();
		while (iterador.hasNext()) {
		AtributoTotalI atributo = iterador.next();
		
    stringBuffer.append(TEXT_6);
    stringBuffer.append( atributo.getTipo() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( atributo.getTipo() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( atributo.getNomeVariavel() );
    stringBuffer.append(TEXT_12);
    
		}
		
    stringBuffer.append(TEXT_13);
    
		Iterator<RelacionamentoWrapper> iteradorN = classe.obtemListaSemChaveEstrangeira().iterator();
		while (iteradorN.hasNext()) {
		RelacionamentoWrapper relac = iteradorN.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
    stringBuffer.append(TEXT_14);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_21);
    
		}
		
    stringBuffer.append(TEXT_22);
    
		iteradorN = classe.obtemListaComChaveEstrangeira().iterator();
		while (iteradorN.hasNext()) {
		RelacionamentoWrapper relac = iteradorN.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
    stringBuffer.append(TEXT_23);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_25);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_29);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_30);
    
		}
		
    stringBuffer.append(TEXT_31);
    return stringBuffer.toString();
  }
}
