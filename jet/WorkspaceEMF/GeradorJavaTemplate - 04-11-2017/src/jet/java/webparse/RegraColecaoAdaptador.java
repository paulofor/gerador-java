package jet.java.webparse;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.java.*;
import gerapp.modelo.*;

public class RegraColecaoAdaptador
{
  protected static String nl;
  public static synchronized RegraColecaoAdaptador create(String lineSeparator)
  {
    nl = lineSeparator;
    RegraColecaoAdaptador result = new RegraColecaoAdaptador();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".parse.regracolecaoadaptador;" + NL + "" + NL + "import java.util.Iterator;" + NL + "import java.util.List;" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".dao.*;" + NL + "import ";
  protected final String TEXT_4 = ".modelo.*;" + NL + "import ";
  protected final String TEXT_5 = ".parse.callback.";
  protected final String TEXT_6 = "ListaCallbackHtml;" + NL + "import ";
  protected final String TEXT_7 = ".parse.callback.";
  protected final String TEXT_8 = "DetalheCallbackHtml;" + NL + "import ";
  protected final String TEXT_9 = ".parse.dados.";
  protected final String TEXT_10 = "DadosParse;" + NL + "import br.com.digicom.lib.dao.DaoConexao;" + NL + "import br.com.digicom.lib.dao.DaoException;" + NL + "import br.com.digicom.parse.ExecutadorParse;" + NL + "import br.com.digicom.parse.callback.ICallbackParse;" + NL + "" + NL + "" + NL + "public class ";
  protected final String TEXT_11 = "RegraColecaoAdaptador  {" + NL + "" + NL + "" + NL + "\tprotected ExecutadorParse exec = null;" + NL + "\tprotected ICallbackParse callbackLista = null;" + NL + "\tprotected ICallbackParse callbackDetalhe = null;" + NL + "\tprotected ";
  protected final String TEXT_12 = "DadosParse dadosParse = null;" + NL + "\t" + NL + "\tpublic ";
  protected final String TEXT_13 = "RegraColecaoAdaptador() {" + NL + "\t\texec = new ExecutadorParse();" + NL + "\t\t//callbackLista = criaListaCallbackHtml();" + NL + "\t\t//callbackDetalhe = criaDetalheCallbackHtml();" + NL + "\t\tdadosParse = new ";
  protected final String TEXT_14 = "DadosParse();" + NL + "\t}" + NL + "\tprivate ICallbackParse getCallbackLista() {" + NL + "\t\tif (callbackLista==null) {" + NL + "\t\t\tcallbackLista = criaListaCallbackHtml();" + NL + "\t\t}" + NL + "\t\treturn callbackLista;" + NL + "\t}" + NL + "\tprivate ICallbackParse getCallbackDetalhe() {" + NL + "\t\tif (callbackDetalhe==null) {" + NL + "\t\t\tcallbackDetalhe = criaDetalheCallbackHtml();" + NL + "\t\t}" + NL + "\t\treturn callbackDetalhe;" + NL + "\t}" + NL + "\tprotected ICallbackParse criaListaCallbackHtml() {" + NL + "\t\treturn new ";
  protected final String TEXT_15 = "ListaCallbackHtml();" + NL + "\t}" + NL + "\tprotected ICallbackParse criaDetalheCallbackHtml() {" + NL + "\t\treturn new ";
  protected final String TEXT_16 = "DetalheCallbackHtml();" + NL + "\t}" + NL + "" + NL + "\t// Atualizar uma lista de objeto em uma p?gina sem referencia de objeto pai." + NL + "\t// Exemplo Categorias em uma loja Virtual" + NL + "\tpublic final void atualizaLista(DaoConexao conexao)" + NL + "\t\t\tthrows DaoException {" + NL + "\t\t" + NL + "\t\tdadosParse.setConexao(conexao);" + NL + "\t\tpreparaDadosLista(dadosParse);" + NL + "\t\texec.setCallbackParse(getCallbackLista()); // Callback recebe dados parse -> manter ordem." + NL + "\t\texec.setDadosParse(dadosParse);" + NL + "\t\texec.executa();" + NL + "\t\treturn;" + NL + "\t\t" + NL + "\t\t/*" + NL + "\t\t// Passo 2 - Montagem da fonte das urls" + NL + "\t\t";
  protected final String TEXT_17 = NL + "\t\t";
  protected final String TEXT_18 = "Dao daoFonte = DBB.getInstancia().get";
  protected final String TEXT_19 = "Dao(); // Dependente ?" + NL + "\t\tdaoFonte.setConexao(conexao);" + NL + "\t\tList<";
  protected final String TEXT_20 = "> lista = daoFonte.ListaCorrente();" + NL + "\t\tIterator<";
  protected final String TEXT_21 = "> itLista = lista.iterator();" + NL + "\t\twhile (itLista.hasNext()) {" + NL + "\t\t\t";
  protected final String TEXT_22 = " corrente = itLista.next();" + NL + "\t\t\tdadosParse.set";
  protected final String TEXT_23 = "_";
  protected final String TEXT_24 = "(corrente);" + NL + "\t\t\texec.setDadosParse(dadosParse);" + NL + "\t\t\texec.executa();" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_25 = NL + "\t\treturn;" + NL + "\t\t*/" + NL + "\t}" + NL + "\t" + NL + "\tprotected void preparaDadosLista(";
  protected final String TEXT_26 = "DadosParse dados) {" + NL + "\t}" + NL + "\t" + NL + "\t// Atualiza todos os objetos do banco (retornado pelo dao.ListaCorrente )" + NL + "\tpublic void atualizaDetalhe(DaoConexao conexao) throws DaoException {" + NL + "\t\t";
  protected final String TEXT_27 = "Dao daoFonte = DBB.getInstancia().get";
  protected final String TEXT_28 = "Dao(); // " + NL + "\t\tdaoFonte.setConexao(conexao);" + NL + "\t\tList<";
  protected final String TEXT_29 = "> lista = daoFonte.ListaCorrente();" + NL + "\t\tIterator<";
  protected final String TEXT_30 = "> itLista = lista.iterator();" + NL + "\t\twhile (itLista.hasNext()) {" + NL + "\t\t\t";
  protected final String TEXT_31 = " corrente = itLista.next();" + NL + "\t\t\tatualizaDetalhe(corrente,conexao);" + NL + "\t\t\t" + NL + "\t\t}" + NL + "\t\treturn;" + NL + "\t}" + NL + "\t" + NL + "\t// Atualiza apenas um objeto" + NL + "\tpublic final void atualizaDetalhe(";
  protected final String TEXT_32 = " itemRaiz, DaoConexao conexao) throws DaoException {" + NL + "\t\tdadosParse.setItemDetalhe(itemRaiz);" + NL + "\t\tdadosParse.setConexao(conexao);" + NL + "\t\tpreparaDadosDetalhe(dadosParse);" + NL + "\t\texec.setCallbackParse(getCallbackDetalhe()); // Callback recebe dados parse -> manter ordem." + NL + "\t\texec.setDadosParse(dadosParse);" + NL + "\t\texec.executa();" + NL + "\t}" + NL + "\tprotected void preparaDadosDetalhe(";
  protected final String TEXT_33 = "DadosParse dados) {" + NL + "\t}" + NL + "\t" + NL + "\t// Candidato para nao mais ser usado." + NL + "\tprivate void atualizaItens(DaoConexao conexao) throws DaoException {" + NL + "\t\t// Passo 1 - Montagem do parse do objeto" + NL + "\t\tExecutadorParse exec = new ExecutadorParse();" + NL + "\t\tICallbackParse callback = new ";
  protected final String TEXT_34 = "ListaCallbackHtml();" + NL + "\t\t";
  protected final String TEXT_35 = "DadosParse dadosParse = new ";
  protected final String TEXT_36 = "DadosParse();" + NL + "\t\tdadosParse.setConexao(conexao);" + NL + "\t\texec.setCallbackParse(callback);" + NL + "\t\t" + NL + "\t\t// Passo 2 - Montagem da fonte das urls" + NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_37 = "Dao daoFonte = DBB.getInstancia().get";
  protected final String TEXT_38 = "Dao(); // " + NL + "\t\tdaoFonte.setConexao(conexao);" + NL + "\t\tList<";
  protected final String TEXT_39 = "> lista = daoFonte.ListaCorrente();" + NL + "\t\tIterator<";
  protected final String TEXT_40 = "> itLista = lista.iterator();" + NL + "\t\twhile (itLista.hasNext()) {" + NL + "\t\t\t";
  protected final String TEXT_41 = " corrente = itLista.next();" + NL + "\t\t\tdadosParse.setItemDetalhe(corrente);" + NL + "\t\t\texec.setDadosParse(dadosParse);" + NL + "\t\t\texec.executa();" + NL + "\t\t}" + NL + "\t\treturn;" + NL + "\t} " + NL + "" + NL + "}";

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
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( conf.getNamespace() );
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
    
		Iterator<RelacionamentoWrapper> it1 = classe.obtemListaDependentePai().iterator();
		while (it1.hasNext()) {
			RelacionamentoWrapper relac = it1.next();
		
    stringBuffer.append(TEXT_17);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_21);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( relac.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_24);
    
		}
		
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
    return stringBuffer.toString();
  }
}
