package jet.java.service;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.java.*;
import gerapp.modelo.*;

public class Carregador
{
  protected static String nl;
  public static synchronized Carregador create(String lineSeparator)
  {
    nl = lineSeparator;
    Carregador result = new Carregador();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".regracolecao;" + NL + "" + NL + "" + NL + "import java.util.*;" + NL + "import br.com.digicom.lib.*;" + NL + "import br.com.digicom.lib.dao.*;" + NL + "" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".dao.*;" + NL + "import ";
  protected final String TEXT_4 = ".modelo.*;" + NL + "import ";
  protected final String TEXT_5 = ".regracolecao.filtro.*;" + NL + "" + NL + "" + NL + "public abstract class ";
  protected final String TEXT_6 = "RegraColecao {" + NL + "\t" + NL + "\tpublic ";
  protected final String TEXT_7 = "RegraColecao() {" + NL + "\t\t_filtro = null;" + NL + "\t}" + NL + "" + NL + "\tpublic List ListaCorrente(DaoConexao conexao) throws DaoException {" + NL + "\t\t";
  protected final String TEXT_8 = "Dao dao = getDao();" + NL + "\t\tdao.setConexao(conexao);" + NL + "\t\tList saida = dao.ListaCorrente();" + NL + "\t\treturn saida;" + NL + "\t\t/*" + NL + "\t\t";
  protected final String TEXT_9 = "Dao dao = getDao();" + NL + "\t\tdao.setConexao(conexao);" + NL + "\t\tList saida = null;" + NL + "\t\t";
  protected final String TEXT_10 = "Filtro filtroWork = getFiltro();" + NL + "\t\tif (filtroWork.getCodigoLinhaProdutoEstaEm() != -1) {" + NL + "\t\t\tsaida = dao.ListaPorLinhaProdutoEstaEm(filtroWork" + NL + "\t\t\t\t\t.getCodigoLinhaProdutoEstaEm());" + NL + "\t\t\treturn saida;" + NL + "\t\t}" + NL + "\t\tsaida = dao.ListaCorrenteAgrupada();" + NL + "\t\treturn saida;" + NL + "\t\t*/" + NL + "\t}" + NL + "" + NL + "\tprivate ";
  protected final String TEXT_11 = "Filtro _filtro;" + NL + "" + NL + "\tpublic ";
  protected final String TEXT_12 = "Filtro getFiltro() {" + NL + "\t\tif (_filtro == null)" + NL + "\t\t\t_filtro = new ";
  protected final String TEXT_13 = "Filtro();" + NL + "\t\treturn _filtro;" + NL + "\t}" + NL + "" + NL + "\tpublic void setFiltro(";
  protected final String TEXT_14 = "Filtro dado) {" + NL + "\t\t_filtro = dado;" + NL + "\t}" + NL + "" + NL + "\tprivate ";
  protected final String TEXT_15 = "Filtro[] _listaEntrada;" + NL + "\t@Deprecated" + NL + "\tprotected ";
  protected final String TEXT_16 = "Filtro[] getListaEntrada() {" + NL + "\t\treturn _listaEntrada;" + NL + "\t}" + NL + "\t@Deprecated" + NL + "\tpublic void setListaEntrada(final ";
  protected final String TEXT_17 = "Filtro[] dado) {" + NL + "\t\t_listaEntrada = dado;" + NL + "\t}" + NL + "\tprivate List<";
  protected final String TEXT_18 = "> _listaItem;" + NL + "\tprotected List<";
  protected final String TEXT_19 = "> getListaEntradaItem() {" + NL + "\t\treturn _listaItem;" + NL + "\t}" + NL + "\tpublic void setListaEntradaItem(final List<";
  protected final String TEXT_20 = "> dado) {" + NL + "\t\t_listaItem = dado;" + NL + "\t}" + NL;
  protected final String TEXT_21 = NL + "\tpublic final ";
  protected final String TEXT_22 = " ";
  protected final String TEXT_23 = "() throws DaoException {" + NL + "\t\t";
  protected final String TEXT_24 = " saida;" + NL + "\t\t";
  protected final String TEXT_25 = "Dao dao = getDao();" + NL + "\t\tpreparaDaoParaConexao(dao);" + NL + "\t\tDaoConexao conexao = null;" + NL + "\t\tconexao = dao.criaConexao();" + NL + "\t\tsaida = ";
  protected final String TEXT_26 = "(conexao);" + NL + "\t\tdao.liberaConexao(conexao);" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "\tpublic abstract ";
  protected final String TEXT_27 = " ";
  protected final String TEXT_28 = "(final DaoConexao conexao)" + NL + "\t\t\tthrows DaoException;";
  protected final String TEXT_29 = NL + NL + NL + NL + NL + "\tprotected final ";
  protected final String TEXT_30 = "Dao getDao() {" + NL + "\t\treturn DBB.getInstancia().get";
  protected final String TEXT_31 = "Dao();" + NL + "\t}" + NL + "\tprotected final ";
  protected final String TEXT_32 = "Dao getDao(final DaoConexao conexao) {" + NL + "\t\t";
  protected final String TEXT_33 = "Dao dao = getDao();" + NL + "\t\tdao.setConexao(conexao);" + NL + "\t\treturn dao;" + NL + "\t}" + NL + "" + NL + "\tprotected void preparaDaoParaConexao(final ";
  protected final String TEXT_34 = "Dao dao) throws DaoException {" + NL + "\t}" + NL + "" + NL + "\tpublic List ListaFiltro() throws DaoException {" + NL + "\t\t";
  protected final String TEXT_35 = "Dao dao = getDao();" + NL + "\t\tDaoConexao conexao = dao.criaConexao();" + NL + "\t\tdao.setConexao(conexao);" + NL + "\t\tList saida = null;" + NL + "\t\tsaida = dao.ListaFiltro(getFiltro());" + NL + "\t\tdao.liberaConexao(conexao);" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "\tpublic List ListaFiltro(DaoConexao conexao) throws DaoException {" + NL + "\t\t";
  protected final String TEXT_36 = "Dao dao = getDao();" + NL + "\t\tdao.setConexao(conexao);" + NL + "\t\tList saida = dao.ListaFiltro(getFiltro());" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "" + NL + "\tpublic List ListaFiltroSimples() throws DaoException {" + NL + "\t\t";
  protected final String TEXT_37 = "Dao dao = getDao();" + NL + "\t\tDaoConexao conexao = dao.criaConexao();" + NL + "\t\tdao.setConexao(conexao);" + NL + "\t\tList saida = null;" + NL + "\t\tsaida = dao.ListaFiltroSimples(getFiltro());" + NL + "\t\tdao.liberaConexao(conexao);" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "" + NL + "\tpublic List ListaFiltroSimples(DaoConexao conexao) throws DaoException {" + NL + "\t\t";
  protected final String TEXT_38 = "Dao dao = getDao();" + NL + "\t\tdao.setConexao(conexao);" + NL + "\t\tList saida = dao.ListaFiltroSimples(getFiltro());" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "" + NL + "\tpublic ";
  protected final String TEXT_39 = " PreInsercao(";
  protected final String TEXT_40 = " item) {" + NL + "\t\treturn item;" + NL + "\t}" + NL + "" + NL + "\tpublic ";
  protected final String TEXT_41 = " PreAlteracao(";
  protected final String TEXT_42 = " item) {" + NL + "\t\treturn item;" + NL + "\t}" + NL + "" + NL + "\tpublic ";
  protected final String TEXT_43 = " obtemPorChave(long chave) throws DaoException {" + NL + "\t\t";
  protected final String TEXT_44 = "Dao dao = getDao();" + NL + "\t\tDaoConexao conexao = dao.criaConexao();" + NL + "\t\tdao.setConexao(conexao);" + NL + "\t\t";
  protected final String TEXT_45 = " saida = obtemPorChave(chave, conexao);" + NL + "\t\tdao.liberaConexao(conexao);" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "" + NL + "\tpublic ";
  protected final String TEXT_46 = " obtemPorChave(long chave, DaoConexao conexao)" + NL + "\t\t\tthrows DaoException {" + NL + "\t\t";
  protected final String TEXT_47 = "Dao dao = getDao();" + NL + "\t\tdao.setConexao(conexao);" + NL + "\t\t";
  protected final String TEXT_48 = " saida = dao.obtemPorChave(chave);" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "" + NL + "\tpublic DaoConexao CriaConexao() throws DaoException {" + NL + "\t\t";
  protected final String TEXT_49 = "Dao dao = getDao();" + NL + "\t\tDaoConexao conexao = dao.criaConexao();" + NL + "\t\treturn conexao;" + NL + "\t}" + NL + "" + NL + "\tpublic void LiberaConexao(DaoConexao conexao) throws DaoException {" + NL + "\t\t";
  protected final String TEXT_50 = "Dao dao = getDao();" + NL + "\t\tdao.liberaConexao(conexao);" + NL + "\t}" + NL + "" + NL + "\tpublic List ListaCorrente() throws DaoException {" + NL + "\t\t";
  protected final String TEXT_51 = "Dao dao = getDao();" + NL + "\t\tDaoConexao conexao = null;" + NL + "\t\tList saida = null;" + NL + "\t\tconexao = dao.criaConexao();" + NL + "\t\tsaida = ListaCorrente(conexao);" + NL + "\t\tdao.liberaConexao(conexao);" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "" + NL + "" + NL + "\tpublic ";
  protected final String TEXT_52 = " excluiItem(";
  protected final String TEXT_53 = " item) throws DaoException {" + NL + "\t\t";
  protected final String TEXT_54 = "Dao dao = getDao();" + NL + "\t\tDaoConexao conexao = null;" + NL + "\t\t";
  protected final String TEXT_55 = " saida = null;" + NL + "\t\tconexao = dao.criaConexao();" + NL + "\t\tsaida = excluiItem(item, conexao);" + NL + "\t\tdao.liberaConexao(conexao);" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "\tpublic ";
  protected final String TEXT_56 = " excluiItem(";
  protected final String TEXT_57 = " item, DaoConexao conexao) throws DaoException {" + NL + "\t\t";
  protected final String TEXT_58 = "Dao dao = getDao();" + NL + "\t\tdao.setConexao(conexao);" + NL + "\t\tdao.excluiItem(item);" + NL + "\t\treturn item;" + NL + "\t}" + NL + "\t" + NL + "" + NL + "\tpublic ";
  protected final String TEXT_59 = " alteraItem(";
  protected final String TEXT_60 = " item) throws DaoException {" + NL + "\t\t";
  protected final String TEXT_61 = "Dao dao = getDao();" + NL + "\t\tDaoConexao conexao = null;" + NL + "\t\t";
  protected final String TEXT_62 = " saida = null;" + NL + "\t\tconexao = dao.criaConexao();" + NL + "\t\tsaida = alteraItem(item, conexao);" + NL + "\t\tdao.liberaConexao(conexao);" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "\tpublic ";
  protected final String TEXT_63 = " alteraItem(";
  protected final String TEXT_64 = " item, DaoConexao conexao) throws DaoException {" + NL + "\t\t";
  protected final String TEXT_65 = "Dao dao = getDao();" + NL + "\t\tdao.setConexao(conexao);" + NL + "\t\tdao.alteraItem(item);" + NL + "\t\treturn item;" + NL + "\t}" + NL + "\t" + NL + "\tpublic ";
  protected final String TEXT_66 = " insereItemLoad(";
  protected final String TEXT_67 = " item) throws DaoException {" + NL + "\t\t";
  protected final String TEXT_68 = "Dao dao = getDao();" + NL + "\t\tDaoConexao conexao = null;" + NL + "\t\t";
  protected final String TEXT_69 = " saida = null;" + NL + "\t\tconexao = dao.criaConexao();" + NL + "\t\tsaida = insereItemLoad(item, conexao);" + NL + "\t\tdao.liberaConexao(conexao);" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "\tpublic ";
  protected final String TEXT_70 = " insereItemLoad(";
  protected final String TEXT_71 = " item, DaoConexao conexao) throws DaoException {" + NL + "\t\t";
  protected final String TEXT_72 = "Dao dao = getDao();" + NL + "\t\tdao.setConexao(conexao);" + NL + "\t\tdao.insereItemLoad(item);" + NL + "\t\treturn item;" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\t\t";
  protected final String TEXT_73 = NL + "\t";
  protected final String TEXT_74 = NL + "\t// Tratamento de objetos que possuem FK nesse objeto para objetos nao associativos" + NL + "\tpublic List getPor";
  protected final String TEXT_75 = "(long id) throws DaoException {" + NL + "\t\t// Existe no DAO" + NL + "\t\t";
  protected final String TEXT_76 = "Dao dao = getDao();" + NL + "\t\tDaoConexao conn = dao.criaConexao();" + NL + "\t\tdao.setConexao(conn);" + NL + "\t\treturn dao.ListaPor";
  protected final String TEXT_77 = "(id);" + NL + "\t}" + NL + "\tpublic boolean excluiPor";
  protected final String TEXT_78 = "(long id) throws DaoException{" + NL + "\t\t// Existe no DAO" + NL + "       \treturn true;" + NL + "\t}" + NL + "\t";
  protected final String TEXT_79 = NL + "\t// Tratamento de objetos que possuem FK nesse objeto para objetos associativos" + NL + "\t";
  protected final String TEXT_80 = NL + "\t//public List getPor";
  protected final String TEXT_81 = "(long id) throws DaoException{ // Padrao" + NL + "\tpublic List ListaPor";
  protected final String TEXT_82 = "(long id, DaoConexao conexao) throws DaoException{ // Combinar com Interface" + NL + "\t\t";
  protected final String TEXT_83 = "Dao dao = getDao(conexao);" + NL + "\t\tList saida = null;" + NL + "\t\tsaida = dao.ListaPor";
  protected final String TEXT_84 = "(id);" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "\tpublic boolean excluiPor";
  protected final String TEXT_85 = "(long id) throws DaoException{" + NL + "\t\t// Existe no DAO" + NL + "       \treturn true;" + NL + "\t}" + NL + "\t";
  protected final String TEXT_86 = NL + "\t" + NL + "\t";
  protected final String TEXT_87 = NL + "\t" + NL + "}";
  protected final String TEXT_88 = NL;

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
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getNomeParaClasse() );
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
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_20);
    
	Iterator<RegraColecao> iteradorRegra = classe.getListaRegraColecao().iterator();
	while (iteradorRegra.hasNext()) {
	RegraColecao regra = iteradorRegra.next();
	if (regra.getAtivoJava()) {
		String tipoRetorno = null;
		String param = null;
		String paramConn = null;
		if (regra.getRetornaColecao()) tipoRetorno = "List<" + classe.getNomeParaClasse() + ">";
		else tipoRetorno = classe.getNomeParaClasse();
		if (regra.getRecebeColecao()) { 
			param = "List<" + classe.getNomeParaClasse() + "> lista";
			paramConn = "List<" + classe.getNomeParaClasse() + "> lista, DaoConexao conexao";
		} else {
			param = "";
			paramConn = "DaoConexao conexao";
		}

    stringBuffer.append(TEXT_21);
    stringBuffer.append( tipoRetorno );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( tipoRetorno );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_25);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( tipoRetorno );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_28);
    
	}
	}

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
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_62);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_63);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_64);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_65);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_66);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_67);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_68);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_69);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_70);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_71);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_72);
     if (!classe.isAssociativa()) { 
    stringBuffer.append(TEXT_73);
    
	Iterator<RelacionamentoWrapper> iteradorRel1 = classe.obtemListaComChaveEstrangeira().iterator();
	while (iteradorRel1.hasNext()) {
		RelacionamentoWrapper relCorrente1 = iteradorRel1.next();
	
    stringBuffer.append(TEXT_74);
    stringBuffer.append( relCorrente1.getNome() );
    stringBuffer.append(TEXT_75);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_76);
    stringBuffer.append( relCorrente1.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append( relCorrente1.getNomeRelacionamento() );
    stringBuffer.append(TEXT_77);
    stringBuffer.append( relCorrente1.getNome() );
    stringBuffer.append(TEXT_78);
    
	}
	} else { 
	
    stringBuffer.append(TEXT_79);
    
	Iterator<RelacionamentoWrapper> iteradorRel2 = classe.obtemListaComChaveEstrangeira().iterator();
	while (iteradorRel2.hasNext()) {
		RelacionamentoWrapper relCorrente2 = iteradorRel2.next();
		RelacionamentoWrapper relOutro = classe.outroRel(relCorrente2);
	
    stringBuffer.append(TEXT_80);
    stringBuffer.append( relCorrente2.getNome() );
    stringBuffer.append(TEXT_81);
    stringBuffer.append( relCorrente2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append( relCorrente2.getNomeRelacionamento() );
    stringBuffer.append(TEXT_82);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_83);
    stringBuffer.append( relCorrente2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append( relCorrente2.getNomeRelacionamento() );
    stringBuffer.append(TEXT_84);
    stringBuffer.append( relCorrente2.getNome() );
    stringBuffer.append(TEXT_85);
    
	}
	
    stringBuffer.append(TEXT_86);
    
	}
	
    stringBuffer.append(TEXT_87);
    stringBuffer.append(TEXT_88);
    return stringBuffer.toString();
  }
}
