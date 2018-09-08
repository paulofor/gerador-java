package jet.java.modelo;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.java.*;
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
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".modelo.agregado;" + NL + "" + NL + "import java.util.List;" + NL + "import java.util.ArrayList;" + NL + "import ";
  protected final String TEXT_3 = ".modelo.*;" + NL + "import br.com.digicom.lib.dao.DaoConexao;" + NL + "import br.com.digicom.lib.dao.DaoException;" + NL + "" + NL + "// Gera??o autom?tica n?o alterar" + NL + "\tpublic class ";
  protected final String TEXT_4 = "Agregado implements ";
  protected final String TEXT_5 = "AgregadoI" + NL + "\t{" + NL + "\t\t" + NL + "\t\tprivate ";
  protected final String TEXT_6 = "Carregador carregador = null;" + NL + "\t\tprivate ";
  protected final String TEXT_7 = "Carregador getCarregador() {" + NL + "\t\t\tif (carregador==null) {" + NL + "\t\t\t\tcarregador = new ";
  protected final String TEXT_8 = "Carregador();" + NL + "\t\t\t}" + NL + "\t\t\treturn carregador;" + NL + "\t\t}" + NL + "\t\tpublic void setConexaoCarregador(DaoConexao conexao) {" + NL + "\t\t\tgetCarregador().setConexao(conexao);" + NL + "\t\t\t";
  protected final String TEXT_9 = "if (vo.get";
  protected final String TEXT_10 = "(false) != null)" + NL + "\t\t\t\tvo.get";
  protected final String TEXT_11 = "(false).setConexaoCarregador(conexao);" + NL + "\t\t\t";
  protected final String TEXT_12 = NL + "\t\t}" + NL + "\t\t" + NL + "\t\t" + NL + "\t\tprivate ";
  protected final String TEXT_13 = " vo;" + NL + "\t\tpublic ";
  protected final String TEXT_14 = "Agregado(";
  protected final String TEXT_15 = " item) {" + NL + "\t\t\tvo = item;" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\t// Com chave estrangeira" + NL + "\t\t";
  protected final String TEXT_16 = NL + "\t\tprivate ";
  protected final String TEXT_17 = " ";
  protected final String TEXT_18 = ";" + NL + "\t\t// Montador Tradicional" + NL + "\t\tpublic ";
  protected final String TEXT_19 = " get";
  protected final String TEXT_20 = "(boolean lazyloader) " + NL + "\t\t{\t" + NL + "\t\t\tif (lazyloader && ";
  protected final String TEXT_21 = "==null)" + NL + "\t\t\t{" + NL + "\t\t\t\ttry {" + NL + "\t\t\t\t\tgetCarregador().CarregaItem";
  protected final String TEXT_22 = "_";
  protected final String TEXT_23 = "(vo);" + NL + "\t\t\t\t} catch (DaoException e) {" + NL + "\t\t\t\t\te.printStackTrace();" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_24 = ";" + NL + "\t\t} " + NL + "\t\tpublic void set";
  protected final String TEXT_25 = "(";
  protected final String TEXT_26 = " value) " + NL + "\t\t{\t" + NL + "\t\t\t";
  protected final String TEXT_27 = " = value;" + NL + "\t\t} " + NL + "\t\t/*" + NL + "\t\tpublic void set";
  protected final String TEXT_28 = "ComReversao(";
  protected final String TEXT_29 = " value) " + NL + "\t\t{\t" + NL + "\t\t\t";
  protected final String TEXT_30 = " = value;" + NL + "\t\t\tSystem.out.println(\"Alteracao:\" + ";
  protected final String TEXT_31 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_32 = "!=null)" + NL + "\t\t\t\t";
  protected final String TEXT_33 = ".addLista";
  protected final String TEXT_34 = "_";
  protected final String TEXT_35 = "(vo);" + NL + "\t\t} " + NL + "\t\t*/" + NL + "\t\t";
  protected final String TEXT_36 = NL + "\t\t/*  AutoRelacionamento" + NL + "\t\t";
  protected final String TEXT_37 = NL + "\t\tpublic void addLista";
  protected final String TEXT_38 = "_";
  protected final String TEXT_39 = "(";
  protected final String TEXT_40 = "  value) " + NL + "\t\t{\t" + NL + "\t\t\t";
  protected final String TEXT_41 = " = value;" + NL + "\t\t} " + NL + "\t\tpublic ";
  protected final String TEXT_42 = " getCorrente";
  protected final String TEXT_43 = "_";
  protected final String TEXT_44 = "()" + NL + "\t\t{\t" + NL + "\t\t\treturn ";
  protected final String TEXT_45 = ";" + NL + "\t\t} " + NL + "\t\t";
  protected final String TEXT_46 = NL + "\t\t*/" + NL + "\t\t";
  protected final String TEXT_47 = NL + " \t\t";
  protected final String TEXT_48 = NL + "     \t" + NL + "     \t// Um pra um" + NL + "     \t";
  protected final String TEXT_49 = NL + "\t\tprivate ";
  protected final String TEXT_50 = " ";
  protected final String TEXT_51 = ";" + NL + "\t\t// Montador Tradicional" + NL + "\t\tpublic ";
  protected final String TEXT_52 = " get";
  protected final String TEXT_53 = "() " + NL + "\t\t{\t" + NL + "\t\t\treturn ";
  protected final String TEXT_54 = ";" + NL + "\t\t} " + NL + "\t\tpublic void set";
  protected final String TEXT_55 = "(";
  protected final String TEXT_56 = " value) " + NL + "\t\t{\t" + NL + "\t\t\t";
  protected final String TEXT_57 = " = value;" + NL + "\t\t} " + NL + " \t\t";
  protected final String TEXT_58 = NL + "     \t" + NL + "     \t// Sem Chave Estrangeira" + NL + "     \t";
  protected final String TEXT_59 = NL + "\t\tpublic boolean existeLista";
  protected final String TEXT_60 = "_";
  protected final String TEXT_61 = "() {" + NL + "\t\t\treturn lista";
  protected final String TEXT_62 = "!= null;" + NL + "\t\t}" + NL + "\t\tprivate List<";
  protected final String TEXT_63 = "> lista";
  protected final String TEXT_64 = ";" + NL + "\t\tpublic void setLista";
  protected final String TEXT_65 = "_";
  protected final String TEXT_66 = "(List<";
  protected final String TEXT_67 = "> value) " + NL + "\t\t{\t" + NL + "\t\t\tlista";
  protected final String TEXT_68 = " = value;" + NL + "\t\t} " + NL + "\t\tpublic List<";
  protected final String TEXT_69 = "> getLista";
  protected final String TEXT_70 = "_";
  protected final String TEXT_71 = " ()" + NL + "\t\t{\t" + NL + "\t\t\t// ligando o LazyLoader" + NL + "\t\t\t//if (lista";
  protected final String TEXT_72 = " == null)" + NL + "\t\t\t//{" + NL + "            //\tgetCarregador().CarregaLista";
  protected final String TEXT_73 = "_";
  protected final String TEXT_74 = "(vo);" + NL + "            //}" + NL + "\t\t\treturn lista";
  protected final String TEXT_75 = ";" + NL + "\t\t\t" + NL + "\t\t} " + NL + "\t\tpublic void addLista";
  protected final String TEXT_76 = "_";
  protected final String TEXT_77 = "(";
  protected final String TEXT_78 = " value)" + NL + "\t\t{\t" + NL + "\t\t\tcriaVaziaLista";
  protected final String TEXT_79 = "_";
  protected final String TEXT_80 = "();" + NL + "\t\t\tlista";
  protected final String TEXT_81 = ".add(value);" + NL + "\t\t} " + NL + "\t\tpublic ";
  protected final String TEXT_82 = " getCorrente";
  protected final String TEXT_83 = "_";
  protected final String TEXT_84 = "()" + NL + "\t\t{\t" + NL + "\t\t\tif (lista";
  protected final String TEXT_85 = "==null || lista";
  protected final String TEXT_86 = ".size()==0) return null;" + NL + "\t\t\treturn lista";
  protected final String TEXT_87 = ".get(lista";
  protected final String TEXT_88 = ".size()-1);" + NL + "\t\t} " + NL + "\t\tpublic void criaVaziaLista";
  protected final String TEXT_89 = "_";
  protected final String TEXT_90 = "() {" + NL + "\t\t\tif (lista";
  protected final String TEXT_91 = " == null)" + NL + "            {" + NL + "            \tlista";
  protected final String TEXT_92 = " = new ArrayList<";
  protected final String TEXT_93 = ">();" + NL + "            }" + NL + "\t\t}" + NL + " \t\t";
  protected final String TEXT_94 = NL + "\t}";
  protected final String TEXT_95 = NL;

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
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_11);
    
			}
	     	
    stringBuffer.append(TEXT_12);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_15);
    
		Iterator<RelacionamentoWrapper> iterador = classe.obtemListaComChaveEstrangeiraComUsuario().iterator();
		while (iterador.hasNext()) {
		RelacionamentoWrapper relac = iterador.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
    stringBuffer.append(TEXT_16);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_21);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_25);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_29);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_30);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_31);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_32);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_34);
    stringBuffer.append( relac.getNomeRelacionamentoOposto() );
    stringBuffer.append(TEXT_35);
     if (classe.getId()==classeOposta.getId()) {
    stringBuffer.append(TEXT_36);
     } 
    stringBuffer.append(TEXT_37);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_38);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_39);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_40);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_41);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_42);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_43);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_44);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_45);
     if (classe.getId()==classeOposta.getId()) {
    stringBuffer.append(TEXT_46);
     } 
    stringBuffer.append(TEXT_47);
    
		}
     	
    stringBuffer.append(TEXT_48);
    
		Iterator<RelacionamentoWrapper> iterador1x1 = classe.obtemListaUmPraUm().iterator();
		while (iterador1x1.hasNext()) {
		RelacionamentoWrapper relac = iterador1x1.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
    stringBuffer.append(TEXT_49);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_50);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_51);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_52);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_53);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_54);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_55);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_56);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_57);
    
		}
     	
    stringBuffer.append(TEXT_58);
    
		Iterator<RelacionamentoWrapper> iteradorN = classe.obtemListaSemChaveEstrangeira().iterator();
		while (iteradorN.hasNext()) {
		RelacionamentoWrapper relac = iteradorN.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
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
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_64);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_65);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_66);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_67);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_68);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
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
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_74);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_75);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_76);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_77);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_78);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_79);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_80);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_81);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_82);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_83);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_84);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_85);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_86);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_87);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_88);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_89);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_90);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_91);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_92);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_93);
    
		}
		
    stringBuffer.append(TEXT_94);
    stringBuffer.append(TEXT_95);
    return stringBuffer.toString();
  }
}
