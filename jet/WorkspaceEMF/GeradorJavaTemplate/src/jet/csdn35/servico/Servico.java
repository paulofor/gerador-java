package jet.csdn35.servico;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
import gerapp.modelo.*;

public class Servico
{
  protected static String nl;
  public static synchronized Servico create(String lineSeparator)
  {
    nl = lineSeparator;
    Servico result = new Servico();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "using System;" + NL + "" + NL + "using ";
  protected final String TEXT_2 = ".modelo;" + NL + "using ";
  protected final String TEXT_3 = ".servico.filtro;" + NL + "using System.Collections;" + NL + "using System.Collections.Generic;" + NL + "using br.com.digicom.lib.dao;" + NL + "" + NL + "namespace  ";
  protected final String TEXT_4 = ".servico {" + NL + "" + NL + "public abstract class ";
  protected final String TEXT_5 = "Servico {" + NL + "" + NL + "\tprivate ";
  protected final String TEXT_6 = "Filtro filtro = null;" + NL + "\tpublic ";
  protected final String TEXT_7 = "Filtro getFiltro() {" + NL + "\t\tif (filtro==null) {" + NL + "\t\t\tfiltro = new ";
  protected final String TEXT_8 = "Filtro();" + NL + "\t\t}" + NL + "\t\treturn filtro;" + NL + "\t}" + NL + "\t" + NL + "\t/*" + NL + "\t";
  protected final String TEXT_9 = NL + "\tpublic abstract ";
  protected final String TEXT_10 = " obtemPor";
  protected final String TEXT_11 = "(long id);" + NL + "\tpublic abstract ";
  protected final String TEXT_12 = " obtemPor";
  protected final String TEXT_13 = "(long id, DaoConexao conexao);" + NL + " \t";
  protected final String TEXT_14 = NL + "\t*/" + NL + "" + NL + "\t";
  protected final String TEXT_15 = NL + "\tprotected bool _obtem";
  protected final String TEXT_16 = "_";
  protected final String TEXT_17 = " = false;" + NL + "\tpublic void setObtem";
  protected final String TEXT_18 = "_";
  protected final String TEXT_19 = "() {" + NL + "\t\t_obtem";
  protected final String TEXT_20 = "_";
  protected final String TEXT_21 = " = true;" + NL + "\t}" + NL + " \t";
  protected final String TEXT_22 = NL + NL + "\t" + NL + " \tpublic string listaJSonMultilinha(List<";
  protected final String TEXT_23 = "> listaEntrada)" + NL + "    {" + NL + "        string listaSaida = \"\";" + NL + "        bool primeiro = true;" + NL + "        foreach (";
  protected final String TEXT_24 = " item in listaEntrada)" + NL + "        {" + NL + "            if (!primeiro)" + NL + "            {" + NL + "                listaSaida += Environment.NewLine;" + NL + "            }" + NL + "            primeiro = false;" + NL + "            listaSaida += item.JSon;" + NL + "        }" + NL + "        return listaSaida;" + NL + "    }" + NL + "\t" + NL + "\tpublic string listaJSon(List<";
  protected final String TEXT_25 = "> listaEntrada) {" + NL + "        string listaSaida = \"\";" + NL + "        bool primeiro = true;" + NL + "        foreach (";
  protected final String TEXT_26 = " item in listaEntrada)" + NL + "        {" + NL + "            if (!primeiro)" + NL + "            {" + NL + "                listaSaida += \" , \";" + NL + "            }" + NL + "            primeiro = false;" + NL + "            listaSaida += item.JSon;" + NL + "        }" + NL + "        return \"{ \\\"Lista\\\" : [ \" + listaSaida + \" ] } \";" + NL + "\t}" + NL + "" + NL + "\tpublic abstract void recebeListaSincronizada(List<";
  protected final String TEXT_27 = "> lista, string tmp, string cod, int versao);" + NL + " \tpublic abstract void recebeListaSincronizada(List<";
  protected final String TEXT_28 = "> lista, string tmp, string cod, int versao, DaoConexao conexao);" + NL + " \tpublic abstract List<";
  protected final String TEXT_29 = "> listaSincronizada(string tmp, string cod, string app);" + NL + " \t//public abstract List<";
  protected final String TEXT_30 = "> listaSincronizada(string tmp, string cod, DaoConexao conexao);" + NL + " \t//public abstract List<";
  protected final String TEXT_31 = "> listaSincronizadaV2(string tmp, string cod);" + NL + " \t//public abstract List<";
  protected final String TEXT_32 = "> listaSincronizadaV2(string tmp, string cod, DaoConexao conexao);" + NL + " \t//public abstract List<";
  protected final String TEXT_33 = "> listaSincronizadaUsuario(string tmp, string cod);" + NL + " \t//public abstract List<";
  protected final String TEXT_34 = "> listaSincronizadaUsuario(string tmp, string cod, DaoConexao conexao);" + NL + " \t//public abstract List<";
  protected final String TEXT_35 = "> listaSincronizadaUsuarioV2(string tmp, string cod);" + NL + " \t//public abstract List<";
  protected final String TEXT_36 = "> listaSincronizadaUsuarioV2(string tmp, string cod, DaoConexao conexao);" + NL + " " + NL + " " + NL + " \t " + NL + "\tpublic abstract bool cria(List<";
  protected final String TEXT_37 = "> listaNovo);" + NL + "\tpublic abstract bool cria(List<";
  protected final String TEXT_38 = "> listaNovo,DaoConexao conexao);" + NL + "\tpublic abstract bool cria(";
  protected final String TEXT_39 = " novo);" + NL + "\tpublic abstract bool cria(";
  protected final String TEXT_40 = " novo,DaoConexao conexao);" + NL + "\t" + NL + "" + NL + "\tpublic abstract List<";
  protected final String TEXT_41 = "> listaTotal();" + NL + "\tpublic abstract ";
  protected final String TEXT_42 = " obtemPorId(long id);" + NL + "\tpublic abstract ";
  protected final String TEXT_43 = " obtemPorId(long id,DaoConexao conexao);" + NL + "\tpublic abstract ";
  protected final String TEXT_44 = " obtemCompletoPorId(long id);" + NL + "\tpublic abstract ";
  protected final String TEXT_45 = " obtemCompletoPorId(long id,DaoConexao conexao);" + NL + "\tpublic abstract void excluiPorId(long id);" + NL + "\tpublic abstract void excluiPorId(long id,DaoConexao conexao);" + NL + "\t" + NL + "\tpublic abstract List<";
  protected final String TEXT_46 = "> listaTotal(DaoConexao conexao);" + NL + "\tpublic abstract List<";
  protected final String TEXT_47 = "> listaFiltroChaves();" + NL + "\tpublic abstract ";
  protected final String TEXT_48 = " itemFiltroChaves();" + NL + "\tpublic abstract List<";
  protected final String TEXT_49 = "> listaFiltroChaves(DaoConexao conexao);" + NL + "\tpublic abstract ";
  protected final String TEXT_50 = " itemFiltroChaves(DaoConexao conexao);" + NL + "\t" + NL + "\tpublic abstract bool criaLoad(";
  protected final String TEXT_51 = " novo);" + NL + "\tpublic abstract bool criaLoad(";
  protected final String TEXT_52 = " novo, DaoConexao conexao);" + NL + "\tpublic abstract bool atualiza(";
  protected final String TEXT_53 = " item);" + NL + "\tpublic abstract bool atualiza(";
  protected final String TEXT_54 = " item, DaoConexao conexao);" + NL + "\t//public abstract bool atualizaCamposEdicao(";
  protected final String TEXT_55 = " item);" + NL + "\tpublic abstract bool atualizaCamposEdicao(";
  protected final String TEXT_56 = " item, DaoConexao conexao);" + NL + "\tpublic abstract bool atualizaCamposEdicao(List<";
  protected final String TEXT_57 = "> lista);" + NL + "\tpublic abstract bool atualizaCamposEdicao(List<";
  protected final String TEXT_58 = "> lista, DaoConexao conexao);" + NL + "\t" + NL + "\tpublic abstract bool criaLoad(List<";
  protected final String TEXT_59 = "> listaNovo);" + NL + "\tpublic abstract bool criaLoad(List<";
  protected final String TEXT_60 = "> listaNovo, DaoConexao conexao);" + NL + "\t" + NL + "\t//public abstract void insertAll(List<";
  protected final String TEXT_61 = "> lista);" + NL + "\t";
  protected final String TEXT_62 = NL + NL + "\t";
  protected final String TEXT_63 = NL + "\tpublic abstract List<";
  protected final String TEXT_64 = "> ";
  protected final String TEXT_65 = "(List<";
  protected final String TEXT_66 = "> lista);" + NL + "\tpublic abstract List<";
  protected final String TEXT_67 = "> ";
  protected final String TEXT_68 = "(List<";
  protected final String TEXT_69 = "> lista, DaoConexao conexao);" + NL + "\t";
  protected final String TEXT_70 = NL + "\tpublic abstract List<";
  protected final String TEXT_71 = "> ";
  protected final String TEXT_72 = "();" + NL + "\tpublic abstract List<";
  protected final String TEXT_73 = "> ";
  protected final String TEXT_74 = "(DaoConexao conexao);" + NL + "\t";
  protected final String TEXT_75 = NL + "\t";
  protected final String TEXT_76 = NL + "\tpublic abstract ";
  protected final String TEXT_77 = " ";
  protected final String TEXT_78 = "(List<";
  protected final String TEXT_79 = "> lista);" + NL + "\tpublic abstract ";
  protected final String TEXT_80 = " ";
  protected final String TEXT_81 = "(List<";
  protected final String TEXT_82 = "> lista, DaoConexao conexao);";
  protected final String TEXT_83 = NL + "\tpublic abstract ";
  protected final String TEXT_84 = " ";
  protected final String TEXT_85 = "();" + NL + "\tpublic abstract ";
  protected final String TEXT_86 = " ";
  protected final String TEXT_87 = "(DaoConexao conexao);";
  protected final String TEXT_88 = NL;
  protected final String TEXT_89 = "\t" + NL + "\t" + NL + "\t";
  protected final String TEXT_90 = NL + "\t";
  protected final String TEXT_91 = NL + "\t// ***  Para fazer atualizacoes em objetos associativos. ***" + NL + "\tpublic abstract bool AtualizaPor";
  protected final String TEXT_92 = "NN(long id, string[] ids);" + NL + "\tpublic abstract bool AtualizaPor";
  protected final String TEXT_93 = "NN(long id, string[] ids, DaoConexao conexao);" + NL + "\t";
  protected final String TEXT_94 = NL + "\tpublic abstract List<";
  protected final String TEXT_95 = "> getPor";
  protected final String TEXT_96 = "(long id);" + NL + "\tpublic abstract List<";
  protected final String TEXT_97 = "> getPor";
  protected final String TEXT_98 = "(long id,DaoConexao conexao);" + NL + "\tpublic abstract bool excluiPor";
  protected final String TEXT_99 = "(long id);" + NL + "\tpublic abstract bool excluiPor";
  protected final String TEXT_100 = "(long id,DaoConexao conexao);" + NL + "\t";
  protected final String TEXT_101 = NL + "\t" + NL + "\t" + NL + "\t";
  protected final String TEXT_102 = NL + NL + "\t";
  protected final String TEXT_103 = NL + "\tpublic abstract List<";
  protected final String TEXT_104 = "> lista";
  protected final String TEXT_105 = "NaoAssociada_";
  protected final String TEXT_106 = "(long id";
  protected final String TEXT_107 = ");" + NL + "\tpublic abstract List<";
  protected final String TEXT_108 = "> lista";
  protected final String TEXT_109 = "NaoAssociada_";
  protected final String TEXT_110 = "(long id";
  protected final String TEXT_111 = ");" + NL + "\tpublic abstract ";
  protected final String TEXT_112 = " obtemPorCodigoDuplo(long id";
  protected final String TEXT_113 = ",long id";
  protected final String TEXT_114 = ");" + NL + "\t";
  protected final String TEXT_115 = NL + "\t";
  protected final String TEXT_116 = NL + "\t// ";
  protected final String TEXT_117 = NL + "\tpublic abstract ";
  protected final String TEXT_118 = " ObtemPorCodigoTel(string app);" + NL + "\tpublic abstract ";
  protected final String TEXT_119 = " ObtemPorCodigoTel(string app, DaoConexao conexao);" + NL + "" + NL + "\tpublic abstract ";
  protected final String TEXT_120 = " ObtemPorCodigoImei(string app);" + NL + "\tpublic abstract ";
  protected final String TEXT_121 = " ObtemPorCodigoImei(string app, DaoConexao conexao);";
  protected final String TEXT_122 = NL + NL + "\t}" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = recursos.getClasse();
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
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_8);
    
	Iterator<RelacionamentoWrapper> iterador4 = classe.obtemListaSemChaveEstrangeira().iterator();
	while (iterador4.hasNext()) {
	RelacionamentoWrapper relac = iterador4.next();
	ClasseWrapper classeOposta = relac.getClasseOposta();
	AtributoWrapper chaveOposta = classeOposta.getChaveW();
	
    stringBuffer.append(TEXT_9);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_13);
    
		}
	
    stringBuffer.append(TEXT_14);
    
	Iterator<RelacionamentoWrapper> iterador2 = classe.obtemListaComChaveEstrangeira().iterator();
	while (iterador2.hasNext()) {
	RelacionamentoWrapper relac = iterador2.next();
	ClasseWrapper classeOposta = relac.getClasseOposta();
	AtributoWrapper chaveOposta = classeOposta.getChaveW();
	
    stringBuffer.append(TEXT_15);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_21);
    
		}
	
    stringBuffer.append(TEXT_22);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_25);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_29);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_30);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_31);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_32);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_34);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_35);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_36);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_37);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_38);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_39);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_40);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_41);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_42);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_43);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_44);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_45);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_46);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_47);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_48);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_49);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_50);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_51);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_52);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_53);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_54);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_55);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_56);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_57);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_58);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_59);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_60);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_61);
    
	Iterator<RegraColecao> iteradorRegra = classe.getListaRegraColecao().iterator();
	while (iteradorRegra.hasNext()) {
	RegraColecao regra = iteradorRegra.next();
	if (regra.getAtivoCs()) {
		if (regra.getRetornaColecao()) {

    stringBuffer.append(TEXT_62);
    	if (regra.getRecebeColecao()) { 
    stringBuffer.append(TEXT_63);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_64);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_65);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_66);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_67);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_68);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_69);
     } else { 
    stringBuffer.append(TEXT_70);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_71);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_72);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_73);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_74);
     } 
    stringBuffer.append(TEXT_75);
     } else { 
    	if (regra.getRecebeColecao()) { 
    stringBuffer.append(TEXT_76);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_77);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_78);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_79);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_80);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_81);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_82);
     } else { 
    stringBuffer.append(TEXT_83);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_84);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_85);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_86);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_87);
     } 
    stringBuffer.append(TEXT_88);
    
		}
	}
	}

    stringBuffer.append(TEXT_89);
    
	Iterator<RelacionamentoWrapper> iterador = classe.obtemListaComChaveEstrangeira().iterator();
	while (iterador.hasNext()) {
		RelacionamentoWrapper relCorrente = iterador.next();
	
    stringBuffer.append(TEXT_90);
     if (classe.isAssociativa()) { 
    stringBuffer.append(TEXT_91);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_92);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_93);
     } 
    stringBuffer.append(TEXT_94);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_95);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_96);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_97);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_98);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_99);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_100);
    
	}
	
    stringBuffer.append(TEXT_101);
    
	// *****  Somente associativas ********
	if (classe.isAssociativa()) {
	
    stringBuffer.append(TEXT_102);
    
	List<RelacionamentoWrapper> relac = classe.obtemListaComChaveEstrangeira();
	RelacionamentoWrapper rel1 = relac.get(0);
	RelacionamentoWrapper rel2 = relac.get(1);
	
    stringBuffer.append(TEXT_103);
    stringBuffer.append( rel1.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_104);
    stringBuffer.append( rel1.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_105);
    stringBuffer.append( rel1.getNomeRelacionamento() );
    stringBuffer.append(TEXT_106);
    stringBuffer.append( rel2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_107);
    stringBuffer.append( rel2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_108);
    stringBuffer.append( rel2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_109);
    stringBuffer.append( rel2.getNomeRelacionamento() );
    stringBuffer.append(TEXT_110);
    stringBuffer.append( rel1.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_111);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_112);
    stringBuffer.append( rel1.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append( rel2.getNomeRelacionamento() );
    stringBuffer.append(TEXT_113);
    stringBuffer.append( rel2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append( rel1.getNomeRelacionamento() );
    stringBuffer.append(TEXT_114);
    
	}
	
    stringBuffer.append(TEXT_115);
    	if(classe.ehUsuario() || classe.ehDispositivo()) { 
    stringBuffer.append(TEXT_116);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_117);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_118);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_119);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_120);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_121);
    	} 
    stringBuffer.append(TEXT_122);
    return stringBuffer.toString();
  }
}
