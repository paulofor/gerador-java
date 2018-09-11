package jet.java.webparse;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.java.*;
import gerapp.modelo.*;

public class DadosParseBase
{
  protected static String nl;
  public static synchronized DadosParseBase create(String lineSeparator)
  {
    nl = lineSeparator;
    DadosParseBase result = new DadosParseBase();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".parse.dados.basico;" + NL + "" + NL + "import java.util.ArrayList;" + NL + "import java.util.Iterator;" + NL + "import java.util.List;" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".dao.";
  protected final String TEXT_4 = "Dao;" + NL + "import ";
  protected final String TEXT_5 = ".dao.DBB;" + NL + "import br.com.digicom.lib.dao.DaoException;" + NL + "import br.com.digicom.parse.callback.IDadosParse;" + NL + "import br.com.digicom.parse.dao.DadosParseDao;" + NL + "import ";
  protected final String TEXT_6 = ".parse.dados.*;" + NL + "import ";
  protected final String TEXT_7 = ".modelo.*;" + NL + "import ";
  protected final String TEXT_8 = ".log.ArquivoLog;" + NL + "import org.json.JSONObject;" + NL + "" + NL + "" + NL + "" + NL + "public abstract class ";
  protected final String TEXT_9 = "DadosParseBase extends DadosParseDao {" + NL + "" + NL + "\tprotected ";
  protected final String TEXT_10 = "Dao dao = null;" + NL + "\tprotected ";
  protected final String TEXT_11 = " itemDetalhe = null;" + NL + "\tprotected List<";
  protected final String TEXT_12 = "> lista = null;" + NL + "\t" + NL + "\tprivate boolean debug;" + NL + "\t" + NL + "\tpublic void setDebug() {" + NL + "\t\tdebug = true;" + NL + "\t}" + NL + "\t" + NL + "\tprivate String proximaPagina = null;" + NL + "\tpublic void setProximaPagina(String url) {" + NL + "\t\tproximaPagina = url;" + NL + "\t}" + NL + "\t@Override" + NL + "\tpublic void setJson(JSONObject json) {" + NL + "\t\tthrow new RuntimeException(\"voce deve implmentar o metodo setJson em \" + this.getClass().toString());" + NL + "\t}" + NL + "\t" + NL + "\t// Para ser utilizado quando se esta obtendo o detalhe " + NL + "\t// do Objeto ";
  protected final String TEXT_13 = NL + "\t// Para listas usar itemCorrente." + NL + "\tpublic ";
  protected final String TEXT_14 = " getItemDetalhe() {" + NL + "\t\treturn itemDetalhe;" + NL + "\t}" + NL + "\t" + NL + "\tprivate ";
  protected final String TEXT_15 = " itemCorrente = null;" + NL + "\t";
  protected final String TEXT_16 = NL + "\t//";
  protected final String TEXT_17 = " " + NL + "\tprivate\t";
  protected final String TEXT_18 = " corrente";
  protected final String TEXT_19 = ";" + NL + "\tprotected List<";
  protected final String TEXT_20 = "> lista";
  protected final String TEXT_21 = " = new ArrayList<";
  protected final String TEXT_22 = ">();" + NL + "\t" + NL + "\t// Adicionado em 01-08-2016" + NL + "\tpublic void adiciona";
  protected final String TEXT_23 = "(";
  protected final String TEXT_24 = " itemLista) {" + NL + "\t\titemLista.set";
  protected final String TEXT_25 = "(itemDetalhe.getId";
  protected final String TEXT_26 = "());" + NL + "\t\t//ArquivoLog.getInstancia().salvaLog(\"";
  protected final String TEXT_27 = "(adicionaCorrente";
  protected final String TEXT_28 = "):\" + ";
  protected final String TEXT_29 = "DadosParseBase.displayLog(corrente";
  protected final String TEXT_30 = "));" + NL + "\t\tlista";
  protected final String TEXT_31 = ".add(itemLista);" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\t" + NL + "\t@Deprecated" + NL + "\tpublic ";
  protected final String TEXT_32 = " getCorrente";
  protected final String TEXT_33 = "() {" + NL + "\t\treturn corrente";
  protected final String TEXT_34 = ";" + NL + "\t}" + NL + "\t@Deprecated" + NL + "\tpublic void adicionaCorrente";
  protected final String TEXT_35 = "() {" + NL + "\t\tcorrente";
  protected final String TEXT_36 = ".set";
  protected final String TEXT_37 = "(itemDetalhe.getId";
  protected final String TEXT_38 = "());" + NL + "\t\tArquivoLog.getInstancia().salvaLog(\"";
  protected final String TEXT_39 = "(adicionaCorrente";
  protected final String TEXT_40 = "):\" + ";
  protected final String TEXT_41 = "DadosParseBase.displayLog(corrente";
  protected final String TEXT_42 = "));" + NL + "\t\t" + NL + "\t\tlista";
  protected final String TEXT_43 = ".add(corrente";
  protected final String TEXT_44 = ");" + NL + "\t}" + NL + "\t@Deprecated" + NL + "\tpublic void criaCorrente";
  protected final String TEXT_45 = "() {" + NL + "\t\tcorrente";
  protected final String TEXT_46 = " = FabricaVo.cria";
  protected final String TEXT_47 = "();" + NL + "\t}" + NL + " \t\t";
  protected final String TEXT_48 = NL + "\t" + NL + "\tpublic ";
  protected final String TEXT_49 = "DadosParseBase() {" + NL + "\t\tsuper();" + NL + "\t\tlista = new ArrayList<";
  protected final String TEXT_50 = ">();" + NL + "\t}" + NL + "" + NL + "\t// Para ser chamado pelos CallbackParsing" + NL + "\t@Deprecated" + NL + "\tpublic ";
  protected final String TEXT_51 = " getCorrente() {" + NL + "\t\treturn itemCorrente;" + NL + "\t}" + NL + "\tpublic void adicionaCorrenteExterno(";
  protected final String TEXT_52 = " item) {" + NL + "\t\tArquivoLog.getInstancia().salvaLog(\"";
  protected final String TEXT_53 = "(adicionaCorrenteExterno):\" + displayLog(item));" + NL + "\t\tif (debug) {" + NL + "\t\t\tdisplayDebug(item);" + NL + "\t\t}" + NL + "\t\tlista.add(item);" + NL + "\t}" + NL + "\tprotected void displayDebug(";
  protected final String TEXT_54 = " item) {" + NL + "\t\tSystem.out.println(displayLog(item));" + NL + "\t}" + NL + "\t" + NL + "\t@Deprecated" + NL + "\tpublic void adicionaCorrente() {" + NL + "\t\tArquivoLog.getInstancia().salvaLog(\"";
  protected final String TEXT_55 = "(adicionaCorrente):\" + displayLog(itemCorrente));" + NL + "\t\tlista.add(itemCorrente);" + NL + "\t}" + NL + "\t" + NL + "\t@Deprecated" + NL + "\tpublic void criaCorrente() {" + NL + "\t\titemCorrente = FabricaVo.cria";
  protected final String TEXT_56 = "();" + NL + "\t}" + NL + "" + NL + "" + NL + "\tpublic void setItemDetalhe(";
  protected final String TEXT_57 = " item){" + NL + "\t\titemDetalhe = item;" + NL + "\t}" + NL + "" + NL + "\tpublic String getUrlLista() {" + NL + " \t\treturn \"implementar getUrlLista() em ";
  protected final String TEXT_58 = "DadosParse\";" + NL + " \t}" + NL + " \tpublic String getUrlDetalhe() {" + NL + " \t\treturn \"implementar getUrlDetalhe() em ";
  protected final String TEXT_59 = "DadosParse\";" + NL + " \t}" + NL + "" + NL + "\t";
  protected final String TEXT_60 = NL + "\tprivate ";
  protected final String TEXT_61 = " _";
  protected final String TEXT_62 = "_";
  protected final String TEXT_63 = "; " + NL + "\t" + NL + "\t@Deprecated" + NL + "\tpublic void set";
  protected final String TEXT_64 = "_";
  protected final String TEXT_65 = "(";
  protected final String TEXT_66 = " item) {" + NL + "\t\t_";
  protected final String TEXT_67 = "_";
  protected final String TEXT_68 = " = item;" + NL + "\t}" + NL + "\t@Deprecated" + NL + "\tpublic ";
  protected final String TEXT_69 = " get";
  protected final String TEXT_70 = "_";
  protected final String TEXT_71 = "() {" + NL + "\t\treturn _";
  protected final String TEXT_72 = "_";
  protected final String TEXT_73 = ";" + NL + "\t}" + NL + " \t";
  protected final String TEXT_74 = NL + NL + "\t@Override" + NL + "\tpublic void setServidor(String paramString) {" + NL + "\t\t// TODO Auto-generated method stub" + NL + "\t\t" + NL + "\t}" + NL + "\t" + NL + "\tpublic void finalizacaoOkDetalhe() {" + NL + "\t\t// deve ser sobrescrito caso nao seja um update de objeto." + NL + "\t\ttry {" + NL + "\t\t\tdao = DBB.getInstancia().get";
  protected final String TEXT_75 = "Dao();" + NL + "\t\t\tdao.setConexao(getConexao());" + NL + "\t\t\tdao.alteraItem(itemDetalhe);" + NL + "\t\t} catch (DaoException e) {" + NL + "\t\t\tSystem.out.println(e.getMessage());" + NL + "\t\t\te.printStackTrace();" + NL + "\t\t}" + NL + "\t}" + NL + "\t" + NL + "" + NL + "\tpublic void finalizacaoOkLista() {" + NL + "\t\ttry {" + NL + "\t\t\tdao = DBB.getInstancia().get";
  protected final String TEXT_76 = "Dao();" + NL + "\t\t\tdao.setConexao(getConexao());" + NL + "\t\t\tList<";
  protected final String TEXT_77 = "> listaBanco = dao.ListaCorrente();" + NL + "\t\t\tList<";
  protected final String TEXT_78 = "> listaInclusao = subtraiListaPorNome(lista,listaBanco);" + NL + "\t\t\tList<";
  protected final String TEXT_79 = "> listaExclusao = subtraiListaPorNome(listaBanco,lista);" + NL + "\t\t\tdisplayLogLista(listaInclusao,\"Inclusao\");" + NL + "\t\t\tdisplayLogLista(listaExclusao,\"Exclusao\");" + NL + "\t\t\tIterator<";
  protected final String TEXT_80 = "> it = listaInclusao.iterator();" + NL + "\t\t\twhile (it.hasNext()) {" + NL + "\t\t\t\t";
  protected final String TEXT_81 = " item = it.next();" + NL + "\t\t\t\tSystem.out.println(\"";
  protected final String TEXT_82 = " Nova: \" + toString(item));" + NL + "\t\t\t\tsetDataInclusaoItemLista(item);" + NL + "\t\t\t\tdao.insereItem(item);" + NL + "\t\t\t}" + NL + "\t\t\tIterator<";
  protected final String TEXT_83 = "> itExclusao = listaExclusao.iterator();" + NL + "\t\t\twhile (itExclusao.hasNext()) {" + NL + "\t\t\t\t";
  protected final String TEXT_84 = " item = itExclusao.next();" + NL + "\t\t\t\texcluiItemLista(item, dao);" + NL + "\t\t\t}" + NL + "\t\t\t//Nao se pode fechar a conexao aqui, preciso arrumar outro ponto." + NL + "\t\t\t//dao.liberaConexao(getConexao());" + NL + "\t\t} catch (DaoException e) {" + NL + "\t\t\te.printStackTrace();" + NL + "\t\t}" + NL + "\t}" + NL + "\tprotected void excluiItemLista(";
  protected final String TEXT_85 = " item, ";
  protected final String TEXT_86 = "Dao dao) throws DaoException{" + NL + "\t\t//dao.insereHistorico(item,  DCConvert.getDataDD_MM_AAAA());" + NL + "\t\t//dao.excluiItem(item);" + NL + "\t}" + NL + "\tprotected void setDataInclusaoItemLista(";
  protected final String TEXT_87 = " item) {" + NL + "\t\t//item.setDataInclusao(DCConvert.getDataDD_MM_AAAA());" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\tpublic void finalizacaoOk(";
  protected final String TEXT_88 = " item) {" + NL + "\t\ttry {" + NL + "\t\t\tdao = DBB.getInstancia().get";
  protected final String TEXT_89 = "Dao();" + NL + "\t\t\tdao.setConexao(getConexao());" + NL + "\t\t\tdao.alteraItem(item);" + NL + "\t\t} catch (DaoException e) {" + NL + "\t\t\te.printStackTrace();" + NL + "\t\t}" + NL + "\t}" + NL + "\t" + NL + "\tpublic List<";
  protected final String TEXT_90 = "> subtraiListaPorNome(List<";
  protected final String TEXT_91 = "> listaMaior, List<";
  protected final String TEXT_92 = "> listaMenor) {" + NL + "\t\tIterator<";
  protected final String TEXT_93 = "> itMaior = listaMaior.iterator();" + NL + "\t\tIterator<";
  protected final String TEXT_94 = "> itMenor = null;" + NL + "\t\tList<";
  protected final String TEXT_95 = "> listaDiferenca = new ArrayList<";
  protected final String TEXT_96 = ">();" + NL + "\t\tboolean achou = false;" + NL + "\t\twhile (itMaior.hasNext()) {" + NL + "\t\t\tachou = false;" + NL + "\t\t\t";
  protected final String TEXT_97 = " corrente = itMaior.next();" + NL + "\t\t\titMenor = listaMenor.iterator();" + NL + "\t\t\twhile (itMenor.hasNext()) {" + NL + "\t\t\t\t";
  protected final String TEXT_98 = " comparador = itMenor.next();" + NL + "\t\t\t\tif (iguais(comparador,corrente)) {" + NL + "\t\t\t\t\tachou = true;" + NL + "\t\t\t\t\tbreak;" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t\tif (!achou) {" + NL + "\t\t\t\tlistaDiferenca.add(corrente);" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn listaDiferenca;" + NL + "\t}" + NL + "\tprotected boolean iguais(";
  protected final String TEXT_99 = " item1, ";
  protected final String TEXT_100 = " item2) {" + NL + "\t\tthrow new RuntimeException(\"Fazer override em ";
  protected final String TEXT_101 = "DadosParse.iguais()\");" + NL + "\t\t//return (item1.getNome().compareTo(item2.getNome())==0);" + NL + "\t}" + NL + "\t" + NL + "\tprotected String toString(";
  protected final String TEXT_102 = " item) {" + NL + "\t\treturn \"Fazer override em ";
  protected final String TEXT_103 = "DadosParse.toString()\";" + NL + "\t}" + NL + "\t" + NL + "\tpublic void inicializacaoLista() {" + NL + "\t\tlista.clear();" + NL + "\t}" + NL + "\t" + NL + "\tpublic void inicializacaoDetalhe() {" + NL + "\t";
  protected final String TEXT_104 = NL + "\t\tlista";
  protected final String TEXT_105 = ".clear();";
  protected final String TEXT_106 = NL + "\t" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\tpublic void displayLogLista(List<";
  protected final String TEXT_107 = "> lista, String codigo) {" + NL + "\t\tfor (";
  protected final String TEXT_108 = " item : lista) {" + NL + "\t\t\tArquivoLog.getInstancia().salvaLog(\"";
  protected final String TEXT_109 = "(lista\" + codigo + \"):\" + displayLog(item));" + NL + "\t\t}" + NL + "\t}" + NL + "\tpublic static String displayLog(";
  protected final String TEXT_110 = " item) {" + NL + "\t\tStringBuffer display = new StringBuffer();" + NL + "\t\tdisplay.append(\"";
  protected final String TEXT_111 = " {\");" + NL + "\t\t";
  protected final String TEXT_112 = NL + "\t\tdisplay.append(\"";
  protected final String TEXT_113 = ":\" + item.get";
  protected final String TEXT_114 = "() + \";\");" + NL + "\t\t";
  protected final String TEXT_115 = NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_116 = NL + "\t\tif (item.get";
  protected final String TEXT_117 = "(false)!=null) {" + NL + "\t\t\tdisplay.append(\"";
  protected final String TEXT_118 = "{\");" + NL + "\t\t\tdisplay.append(";
  protected final String TEXT_119 = "DadosParse.displayLog(item.get";
  protected final String TEXT_120 = "(false)));" + NL + "\t\t\tdisplay.append(\"}\");" + NL + "\t\t}" + NL + " \t\t";
  protected final String TEXT_121 = NL + NL + "\t\tdisplay.append(\"}\");" + NL + "\t\treturn display.toString();" + NL + "\t}" + NL + "\t" + NL + "\tpublic List camposPost() {" + NL + "\t\treturn null;" + NL + "\t}" + NL + "}";

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
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_15);
    
		Iterator<RelacionamentoWrapper> iteradorN = classe.obtemListaSemChaveEstrangeira().iterator();
		while (iteradorN.hasNext()) {
		RelacionamentoWrapper relac = iteradorN.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
    stringBuffer.append(TEXT_16);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_21);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( relac.getNomePropriedadeEntidadeOposta() );
    stringBuffer.append(TEXT_25);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_29);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_30);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_31);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_32);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_34);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_35);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_36);
    stringBuffer.append( relac.getNomePropriedadeEntidadeOposta() );
    stringBuffer.append(TEXT_37);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_38);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_39);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_40);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_41);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_42);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_43);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_44);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_45);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_46);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_47);
    
		}
	
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
    
	Iterator<RelacionamentoWrapper> iterador = classe.obtemListaComChaveEstrangeira().iterator();
	while (iterador.hasNext()) {
	RelacionamentoWrapper relac = iterador.next();
	ClasseWrapper classeOposta = relac.getClasseOposta();
	
    stringBuffer.append(TEXT_60);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_61);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append(TEXT_62);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_63);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_64);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_65);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_66);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append(TEXT_67);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_68);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_69);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_70);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_71);
    stringBuffer.append( classeOposta.getNomeParaVariavel() );
    stringBuffer.append(TEXT_72);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_73);
    
	}
	
    stringBuffer.append(TEXT_74);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_75);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_76);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_77);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_78);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_79);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_80);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_81);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_82);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_83);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_84);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_85);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_86);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_87);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_88);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_89);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_90);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_91);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_92);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_93);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_94);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_95);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_96);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_97);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_98);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_99);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_100);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_101);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_102);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_103);
    
		Iterator<RelacionamentoWrapper> iteradorIni = classe.obtemListaSemChaveEstrangeira().iterator();
		while (iteradorIni.hasNext()) {
		RelacionamentoWrapper relac = iteradorIni.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
    stringBuffer.append(TEXT_104);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_105);
    
		}
	
    stringBuffer.append(TEXT_106);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_107);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_108);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_109);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_110);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_111);
    
		Iterator<AtributoTotalI> it = classe.getListaAtributoTotal().iterator();
		while (it.hasNext()) {
		AtributoTotalI atributo = it.next();
		
    stringBuffer.append(TEXT_112);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_113);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_114);
     
		}
		
    stringBuffer.append(TEXT_115);
    
		Iterator<RelacionamentoWrapper> iterador2 = classe.obtemListaComChaveEstrangeira().iterator();
		while (iterador2.hasNext()) {
		RelacionamentoWrapper relac = iterador2.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
    stringBuffer.append(TEXT_116);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_117);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_118);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_119);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_120);
    
		}
		
    stringBuffer.append(TEXT_121);
    return stringBuffer.toString();
  }
}
