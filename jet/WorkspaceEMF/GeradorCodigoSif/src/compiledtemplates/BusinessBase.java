package compiledtemplates;

import java.util.*;
import br.com.probid.gerador.execucao.wrappers.*;
import br.com.probid.gerador.interfaces.*;

public class BusinessBase
{
  protected static String nl;
  public static synchronized BusinessBase create(String lineSeparator)
  {
    nl = lineSeparator;
    BusinessBase result = new BusinessBase();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".business.base;" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".business.base.busUtils;" + NL + "import ";
  protected final String TEXT_4 = ".bean.bean";
  protected final String TEXT_5 = ";" + NL + "import ";
  protected final String TEXT_6 = ".dao.dao";
  protected final String TEXT_7 = ";" + NL + "import java.sql.Connection;" + NL + "import java.util.Vector;" + NL + "import java.sql.Timestamp;" + NL + "import ";
  protected final String TEXT_8 = ".bean.*;" + NL + "" + NL + "public abstract class busBase";
  protected final String TEXT_9 = " extends busUtils {" + NL + "" + NL + "\tpublic static final String LISTA_TELA = \"listaTela";
  protected final String TEXT_10 = "\";" + NL + "" + NL + "\tpublic static dao";
  protected final String TEXT_11 = " getDao() {" + NL + "\t\treturn new dao";
  protected final String TEXT_12 = "();" + NL + "\t}";
  protected final String TEXT_13 = NL + "\tpublic abstract ";
  protected final String TEXT_14 = " ";
  protected final String TEXT_15 = "(";
  protected final String TEXT_16 = ");" + NL + "\tpublic ";
  protected final String TEXT_17 = " ";
  protected final String TEXT_18 = "(";
  protected final String TEXT_19 = ") {" + NL + "\t\tdao";
  protected final String TEXT_20 = " dao = getDao();" + NL + "        Connection conn = getConexao();" + NL + "        try {";
  protected final String TEXT_21 = NL + "            ";
  protected final String TEXT_22 = " ";
  protected final String TEXT_23 = "(";
  protected final String TEXT_24 = ");" + NL + "        } finally {" + NL + "            commit(conn);" + NL + "            fechaConexao(conn);" + NL + "        }" + NL + "\t}";
  protected final String TEXT_25 = NL + " \tpublic bean";
  protected final String TEXT_26 = " obtemPorChave(bean";
  protected final String TEXT_27 = " bean) {" + NL + " \t\tdao";
  protected final String TEXT_28 = " dao = getDao();" + NL + "        Connection conn = getConexao();" + NL + "        try {" + NL + "            return obtemPorChave(bean,conn);" + NL + "        } finally {" + NL + "            commit(conn);" + NL + "            fechaConexao(conn);" + NL + "        }" + NL + " \t} " + NL + "  \tpublic bean";
  protected final String TEXT_29 = " obtemPorChave(bean";
  protected final String TEXT_30 = " bean, Connection conn) {" + NL + " \t\tdao";
  protected final String TEXT_31 = " dao = getDao();" + NL + "        return dao.obtemPorChave(bean,conn);" + NL + " \t}" + NL + " \t" + NL + " " + NL + " " + NL + " \tpublic int criaListaItens(Vector<bean";
  protected final String TEXT_32 = "> listaBean) {" + NL + " \t\tdao";
  protected final String TEXT_33 = " dao = getDao();" + NL + "        Connection conn = getConexao();" + NL + "        try {" + NL + "            return criaListaItens(listaBean,conn);" + NL + "        } finally {" + NL + "            commit(conn);" + NL + "            fechaConexao(conn);" + NL + "        }" + NL + " \t} " + NL + " \tpublic int criaListaItens(Vector<bean";
  protected final String TEXT_34 = "> listaBean, Connection conn) {" + NL + " \t\tdao";
  protected final String TEXT_35 = " dao = getDao();" + NL + "        return dao.criaListaItens(listaBean,conn);" + NL + " \t} " + NL + " \t" + NL + "" + NL + "" + NL + " \tpublic int criaItem(bean";
  protected final String TEXT_36 = " bean) {" + NL + " \t\tdao";
  protected final String TEXT_37 = " dao = getDao();" + NL + "        Connection conn = getConexao();" + NL + "        try {" + NL + "            return criaItem(bean,conn);" + NL + "        } finally {" + NL + "            commit(conn);" + NL + "            fechaConexao(conn);" + NL + "        }" + NL + " \t} " + NL + " \tpublic int criaItem(bean";
  protected final String TEXT_38 = " bean,  Connection conn) {" + NL + " \t\tdao";
  protected final String TEXT_39 = " dao = getDao();" + NL + "        return dao.criaItem(bean,conn);" + NL + " \t} " + NL + " \t" + NL + "" + NL + "" + NL + " \tpublic void alteraItem(bean";
  protected final String TEXT_40 = " bean) {" + NL + " \t\tdao";
  protected final String TEXT_41 = " dao = getDao();" + NL + "        Connection conn = getConexao();" + NL + "        try {" + NL + "            alteraItem(bean,conn);" + NL + "        } finally {" + NL + "            commit(conn);" + NL + "            fechaConexao(conn);" + NL + "        }" + NL + " \t} " + NL + " \tpublic void alteraItem(bean";
  protected final String TEXT_42 = " bean, Connection conn) {" + NL + " \t\tdao";
  protected final String TEXT_43 = " dao = getDao();" + NL + "        dao.alteraItem(bean,conn);" + NL + " \t} " + NL + " \t" + NL + " \t" + NL + " \t" + NL + " \tpublic Vector<bean";
  protected final String TEXT_44 = "> getLista() {" + NL + " \t\tdao";
  protected final String TEXT_45 = " dao = getDao();" + NL + "        Connection conn = getConexao();" + NL + "        try {" + NL + "            return getLista(conn);" + NL + "        } finally {" + NL + "            commit(conn);" + NL + "            fechaConexao(conn);" + NL + "        }" + NL + " \t}" + NL + " \tpublic Vector<bean";
  protected final String TEXT_46 = "> getLista(Connection conn) {" + NL + " \t\tdao";
  protected final String TEXT_47 = " dao = getDao();" + NL + "        return dao.getLista(conn);" + NL + " \t}" + NL + " \t" + NL + " \t " + NL + " \t  " + NL + "}" + NL;
  protected final String TEXT_48 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
RecursosClasse recursos = (RecursosClasse) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
ConfiguracaoWrapper conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNomePacoteModel() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNomePacoteModel() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( conf.getNomePacoteModel() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( conf.getNomePacoteModel() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( conf.getNomePacoteModel() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_12);
    
	Iterator listaOperacao = classe.getBase().getListaOperacao().iterator();
	OperacaoWrapper opW = new OperacaoWrapper();
	while (listaOperacao.hasNext()) {
		OperacaoI operacao = (OperacaoI) listaOperacao.next();
		opW.setBase(operacao);

    stringBuffer.append(TEXT_13);
    stringBuffer.append( operacao.getTipoRetorno() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( operacao.getNome() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( opW.getAssinaturaJava("Connection conn") );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( operacao.getTipoRetorno() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( operacao.getNome() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( opW.getAssinaturaJava() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append(TEXT_21);
    stringBuffer.append( (operacao.tipoVoid()?"":"return") );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( operacao.getNome() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( opW.getAssinaturaJavaSemTipo("conn") );
    stringBuffer.append(TEXT_24);
    
	}

    stringBuffer.append(TEXT_25);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_29);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_30);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_31);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_32);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_34);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_35);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_36);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_37);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_38);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_39);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_40);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_41);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_42);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_43);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_44);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_45);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_46);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_47);
    stringBuffer.append(TEXT_48);
    return stringBuffer.toString();
  }
}
