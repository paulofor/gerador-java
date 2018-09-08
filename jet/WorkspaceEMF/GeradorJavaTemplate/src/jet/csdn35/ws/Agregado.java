package jet.csdn35.ws;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
import gerapp.modelo.*;

public class Agregado
{
  protected static String nl;
  public static synchronized Agregado create(String lineSeparator)
  {
    nl = lineSeparator;
    Agregado result = new Agregado();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "using System;" + NL + "using System.Collections.Generic;" + NL + "using br.com.digicom.lib.dao;" + NL + "using ";
  protected final String TEXT_2 = ".modelo.carregador;" + NL + "" + NL + "" + NL + "namespace ";
  protected final String TEXT_3 = ".modelo.agregados" + NL + "{" + NL + "" + NL + "\tpublic class ";
  protected final String TEXT_4 = "Agregado : ";
  protected final String TEXT_5 = "AgregadoI" + NL + "\t{" + NL + "\t\tprivate ";
  protected final String TEXT_6 = "Carregador carregador = null;" + NL + "\t\tprivate ";
  protected final String TEXT_7 = "Carregador getCarregador() {" + NL + "\t\t\tif (carregador==null) {" + NL + "\t\t\t\tcarregador = new ";
  protected final String TEXT_8 = "Carregador();" + NL + "\t\t\t}" + NL + "\t\t\treturn carregador;" + NL + "\t\t}" + NL + "\t\tpublic void setConexaoCarregador(DaoConexao conexao) {" + NL + "\t\t\tgetCarregador().setConexao(conexao);" + NL + "\t\t\t";
  protected final String TEXT_9 = "if (vo.";
  protected final String TEXT_10 = "_";
  protected final String TEXT_11 = " != null)" + NL + "\t\t\t\tvo.";
  protected final String TEXT_12 = "_";
  protected final String TEXT_13 = ".setConexaoCarregador(conexao);" + NL + "\t\t\t";
  protected final String TEXT_14 = NL + "\t\t}" + NL + "\t\t" + NL + "\t\tprivate ";
  protected final String TEXT_15 = " vo;" + NL + "\t\tpublic ";
  protected final String TEXT_16 = "Agregado(";
  protected final String TEXT_17 = " item) {" + NL + "\t\t\tvo = item;" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_18 = NL + "\t\t" + NL + "\t\tprivate ";
  protected final String TEXT_19 = " ";
  protected final String TEXT_20 = ";" + NL + "\t\tpublic ";
  protected final String TEXT_21 = " ";
  protected final String TEXT_22 = "_";
  protected final String TEXT_23 = " " + NL + "\t\t{\t" + NL + "\t\t\tget {" + NL + "\t\t\t\tif (";
  protected final String TEXT_24 = "==null)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tgetCarregador().CarregaItem";
  protected final String TEXT_25 = "_";
  protected final String TEXT_26 = "(vo);" + NL + "\t\t\t\t}" + NL + "\t\t\t\treturn ";
  protected final String TEXT_27 = ";" + NL + "\t\t\t}" + NL + "\t\t\tset {" + NL + "\t\t\t\t";
  protected final String TEXT_28 = " = value;" + NL + "\t\t\t}" + NL + "\t\t} " + NL + "\t\t";
  protected final String TEXT_29 = NL + "\t\t/*  AutoRelacionamento" + NL + "\t\t";
  protected final String TEXT_30 = NL + "\t\tpublic ";
  protected final String TEXT_31 = " AddLista";
  protected final String TEXT_32 = "_";
  protected final String TEXT_33 = " " + NL + "\t\t{\t" + NL + "\t\t\tset {" + NL + "\t\t\t\t";
  protected final String TEXT_34 = "_";
  protected final String TEXT_35 = " = value;" + NL + "\t\t\t}" + NL + "\t\t} " + NL + "\t\tpublic ";
  protected final String TEXT_36 = " Corrente";
  protected final String TEXT_37 = "_";
  protected final String TEXT_38 = " " + NL + "\t\t{\t" + NL + "\t\t\tget {" + NL + "\t\t\t\treturn ";
  protected final String TEXT_39 = "_";
  protected final String TEXT_40 = ";" + NL + "\t\t\t}" + NL + "\t\t} " + NL + "\t\t";
  protected final String TEXT_41 = NL + "\t\t*/" + NL + "\t\t";
  protected final String TEXT_42 = NL + " \t\t";
  protected final String TEXT_43 = NL + "     \t" + NL + "     \t";
  protected final String TEXT_44 = NL + "\t\tprivate ";
  protected final String TEXT_45 = " ";
  protected final String TEXT_46 = ";" + NL + "\t\tpublic ";
  protected final String TEXT_47 = " ";
  protected final String TEXT_48 = "_";
  protected final String TEXT_49 = " " + NL + "\t\t{\t" + NL + "\t\t\tget {" + NL + "\t\t\t\treturn ";
  protected final String TEXT_50 = ";" + NL + "\t\t\t}" + NL + "\t\t\tset {" + NL + "\t\t\t\t";
  protected final String TEXT_51 = " = value;" + NL + "\t\t\t}" + NL + "\t\t} " + NL + "\t\t" + NL + " \t\t";
  protected final String TEXT_52 = NL + "     \t" + NL + "     \t" + NL + "     \t";
  protected final String TEXT_53 = NL + "\t\tpublic bool ExisteLista";
  protected final String TEXT_54 = "_";
  protected final String TEXT_55 = " {" + NL + "\t\t\tget { return lista";
  protected final String TEXT_56 = "!= null; }" + NL + "\t\t}" + NL + "\t\tprivate List<";
  protected final String TEXT_57 = "> lista";
  protected final String TEXT_58 = ";" + NL + "\t\tpublic List<";
  protected final String TEXT_59 = "> Lista";
  protected final String TEXT_60 = "_";
  protected final String TEXT_61 = " " + NL + "\t\t{\t" + NL + "\t\t\tget {" + NL + "\t\t\t\t// ligando o LazyLoader" + NL + "\t\t\t\tif (lista";
  protected final String TEXT_62 = " == null)" + NL + "                {" + NL + "                    getCarregador().CarregaLista";
  protected final String TEXT_63 = "_";
  protected final String TEXT_64 = "(vo);" + NL + "                }" + NL + "\t\t\t\treturn lista";
  protected final String TEXT_65 = ";" + NL + "\t\t\t}" + NL + "\t\t\tset {" + NL + "\t\t\t\tlista";
  protected final String TEXT_66 = " = value;" + NL + "\t\t\t}" + NL + "\t\t} " + NL + "\t\tpublic ";
  protected final String TEXT_67 = " AddLista";
  protected final String TEXT_68 = "_";
  protected final String TEXT_69 = " " + NL + "\t\t{\t" + NL + "\t\t\tset {" + NL + "\t\t\t\tCriaVaziaLista";
  protected final String TEXT_70 = "_";
  protected final String TEXT_71 = "();" + NL + "\t\t\t\tlista";
  protected final String TEXT_72 = ".Add(value);" + NL + "\t\t\t}" + NL + "\t\t} " + NL + "\t\tpublic ";
  protected final String TEXT_73 = " Corrente";
  protected final String TEXT_74 = "_";
  protected final String TEXT_75 = " " + NL + "\t\t{\t" + NL + "\t\t\tget {" + NL + "\t\t\t\treturn lista";
  protected final String TEXT_76 = "[lista";
  protected final String TEXT_77 = ".Count-1];" + NL + "\t\t\t}" + NL + "\t\t} " + NL + "\t\tpublic void CriaVaziaLista";
  protected final String TEXT_78 = "_";
  protected final String TEXT_79 = "() {" + NL + "\t\t\tif (lista";
  protected final String TEXT_80 = " == null)" + NL + "            {" + NL + "            \tlista";
  protected final String TEXT_81 = " = new List<";
  protected final String TEXT_82 = ">();" + NL + "            }" + NL + "\t\t}" + NL + " \t\t";
  protected final String TEXT_83 = NL + "\t}" + NL + "}";

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
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_8);
    
			Iterator<RelacionamentoWrapper> iterador2 = classe.obtemListaComChaveEstrangeira().iterator();
			while (iterador2.hasNext()) {
			RelacionamentoWrapper relac = iterador2.next();
			ClasseWrapper classeOposta = relac.getClasseOposta();
			
    stringBuffer.append(TEXT_9);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_13);
    
			}
	     	
    stringBuffer.append(TEXT_14);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_17);
    
		Iterator<RelacionamentoWrapper> iterador = classe.obtemListaComChaveEstrangeira().iterator();
		while (iterador.hasNext()) {
		RelacionamentoWrapper relac = iterador.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
    stringBuffer.append(TEXT_18);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_21);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_25);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_28);
     if (classe.getId()==classeOposta.getId()) {
    stringBuffer.append(TEXT_29);
     } 
    stringBuffer.append(TEXT_30);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_31);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_32);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_34);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_35);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_36);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_37);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_38);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_39);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_40);
     if (classe.getId()==classeOposta.getId()) {
    stringBuffer.append(TEXT_41);
     } 
    stringBuffer.append(TEXT_42);
    
		}
     	
    stringBuffer.append(TEXT_43);
    
		Iterator<RelacionamentoWrapper> iterador1x1 = classe.obtemListaUmPraUm().iterator();
		while (iterador1x1.hasNext()) {
		RelacionamentoWrapper relac = iterador1x1.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
    stringBuffer.append(TEXT_44);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_45);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_46);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_47);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_48);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_49);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_50);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_51);
    
		}
     	
    stringBuffer.append(TEXT_52);
    
		Iterator<RelacionamentoWrapper> iteradorN = classe.obtemListaSemChaveEstrangeira().iterator();
		while (iteradorN.hasNext()) {
		RelacionamentoWrapper relac = iteradorN.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
    stringBuffer.append(TEXT_53);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_54);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_55);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_56);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_57);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_58);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_59);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_60);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_61);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_62);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_63);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_64);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_65);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_66);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_67);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_68);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_69);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_70);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_71);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_72);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_73);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_74);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_75);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_76);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_77);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_78);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_79);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_80);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_81);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_82);
    
		}
		
    stringBuffer.append(TEXT_83);
    return stringBuffer.toString();
  }
}
