package compiledtemplates;

import java.util.*;
import br.com.probid.gerador.execucao.wrappers.*;
import br.com.probid.gerador.interfaces.*;

public class DaoBase
{
  protected static String nl;
  public static synchronized DaoBase create(String lineSeparator)
  {
    nl = lineSeparator;
    DaoBase result = new DaoBase();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".dao.base;" + NL + "" + NL + "import br.org.fplf.Utils.Utilitarios;" + NL + "import ";
  protected final String TEXT_3 = ".bean.bean";
  protected final String TEXT_4 = ";" + NL + "import ";
  protected final String TEXT_5 = ".bean.base.FabricaBean;" + NL + "import br.org.fplf.logSistema;" + NL + "import java.sql.Connection;" + NL + "import java.sql.PreparedStatement;" + NL + "import java.sql.ResultSet;" + NL + "import java.sql.SQLException;" + NL + "import java.util.Vector;" + NL + "import java.sql.Date;" + NL + "import java.sql.Types;" + NL + "" + NL + "public abstract class daoBase";
  protected final String TEXT_6 = " extends daoUtils {" + NL + "" + NL + "\tprotected void preInsercao(bean";
  protected final String TEXT_7 = " item) {" + NL + "\t}" + NL + "" + NL + "\tpublic static int quantidadeCampos() {" + NL + "\t\treturn ";
  protected final String TEXT_8 = ";" + NL + "\t}" + NL + "" + NL + "\tpublic static String camposOrdenados() {" + NL + "\t\tString saida = \"\";";
  protected final String TEXT_9 = "\t\t" + NL + "\t\tsaida += \" ";
  protected final String TEXT_10 = " \";";
  protected final String TEXT_11 = NL + "\t\tsaida += \", ";
  protected final String TEXT_12 = " \";";
  protected final String TEXT_13 = NL + "\t\treturn saida;" + NL + "\t}" + NL + "\tpublic static String camposOrdenados(String tabela) {" + NL + "\t\tString saida = \"\";";
  protected final String TEXT_14 = "\t\t" + NL + "\t\tsaida += \" \" + tabela + \".";
  protected final String TEXT_15 = " \";";
  protected final String TEXT_16 = NL + "\t\tsaida += \", \" + tabela + \".";
  protected final String TEXT_17 = " \";";
  protected final String TEXT_18 = NL + "\t\treturn saida;" + NL + "\t}" + NL + "" + NL + "" + NL + "\tpublic static bean";
  protected final String TEXT_19 = " extraiItem(ResultSet rs) throws SQLException {" + NL + "\t\tbean";
  protected final String TEXT_20 = " novo = FabricaBean.criaBean";
  protected final String TEXT_21 = "();";
  protected final String TEXT_22 = NL + "\t\tnovo.set";
  protected final String TEXT_23 = "(rs.get";
  protected final String TEXT_24 = "(\"";
  protected final String TEXT_25 = "\"));";
  protected final String TEXT_26 = NL + "\t\treturn novo;" + NL + "\t}" + NL + "\t" + NL + "\tpublic static bean";
  protected final String TEXT_27 = " extraiItem(ResultSet rs, int inicial) throws SQLException {" + NL + "\t\tbean";
  protected final String TEXT_28 = " novo = FabricaBean.criaBean";
  protected final String TEXT_29 = "();";
  protected final String TEXT_30 = NL + "\t\tnovo.set";
  protected final String TEXT_31 = "(rs.get";
  protected final String TEXT_32 = "(inicial++));";
  protected final String TEXT_33 = NL + "\t\treturn novo;" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\tpublic static bean";
  protected final String TEXT_34 = " extraiItem(ResultSet rs, String nomeTabela) throws SQLException {" + NL + "\t\tbean";
  protected final String TEXT_35 = " novo = FabricaBean.criaBean";
  protected final String TEXT_36 = "();";
  protected final String TEXT_37 = NL + "\t\tnovo.set";
  protected final String TEXT_38 = "(rs.get";
  protected final String TEXT_39 = "(nomeTabela + \".";
  protected final String TEXT_40 = "\"));";
  protected final String TEXT_41 = NL + "\t\treturn novo;" + NL + "\t}" + NL + "\t" + NL + "\tprivate PreparedStatement preencheParametros(bean";
  protected final String TEXT_42 = " bean, PreparedStatement ps)  throws SQLException {" + NL + "\t\t";
  protected final String TEXT_43 = NL + "\t\tif (bean.get";
  protected final String TEXT_44 = "()!=null) ps.set";
  protected final String TEXT_45 = "(";
  protected final String TEXT_46 = ",bean.get";
  protected final String TEXT_47 = "());" + NL + "        else ps.setNull(";
  protected final String TEXT_48 = ", ";
  protected final String TEXT_49 = ");" + NL + "\t\t";
  protected final String TEXT_50 = NL + "\t\tps.set";
  protected final String TEXT_51 = "(";
  protected final String TEXT_52 = ",bean.get";
  protected final String TEXT_53 = "());";
  protected final String TEXT_54 = NL + "\t\treturn ps;" + NL + "\t}" + NL + "\t" + NL + "\tprivate PreparedStatement preencheParametrosChave(bean";
  protected final String TEXT_55 = " bean, int posicao, PreparedStatement ps)  throws SQLException {" + NL + "\t\t";
  protected final String TEXT_56 = NL + "\t\tps.set";
  protected final String TEXT_57 = "(++posicao,bean.get";
  protected final String TEXT_58 = "());";
  protected final String TEXT_59 = NL + "\t\treturn ps;" + NL + "\t}" + NL + "\t" + NL + "" + NL + "\tpublic int criaItem(bean";
  protected final String TEXT_60 = " item, Connection conn) {" + NL + "\t" + NL + "\t\t";
  protected final String TEXT_61 = NL + "\t\tString sqlMax = \"select ISNULL(max(";
  protected final String TEXT_62 = "), 0) from ";
  protected final String TEXT_63 = "\";" + NL + "\t\t";
  protected final String TEXT_64 = NL + "\t" + NL + "        String sql = \"insert into ";
  protected final String TEXT_65 = " \" +" + NL + "        \t\" ";
  protected final String TEXT_66 = " \" + " + NL + "        \t\"values ";
  protected final String TEXT_67 = "\";" + NL + "        PreparedStatement ps = null;" + NL + "        ResultSet rs = null;" + NL + "        try {" + NL + "           \t";
  protected final String TEXT_68 = NL + "        \tps = conn.prepareStatement(sqlMax);" + NL + "            rs = ps.executeQuery();" + NL + "            rs.next();" + NL + "            int maximo = rs.getInt(1);" + NL + "            int proximo = maximo + 1;" + NL + "            item.set";
  protected final String TEXT_69 = "(proximo);" + NL + "        \t";
  protected final String TEXT_70 = NL + "            ps = conn.prepareStatement(sql);" + NL + "            preInsercao(item);" + NL + "            ps = preencheParametros(item,ps);" + NL + "            ps.executeUpdate();" + NL + "            " + NL + "        } catch (Exception e) {" + NL + "            logSistema.escreveLog(\"daoBase";
  protected final String TEXT_71 = ".criaItem\", Utilitarios.StackTraceToString(e));" + NL + "            return 0;" + NL + "        } finally {" + NL + "            fechaObjetos(ps, rs);" + NL + "        }" + NL + "\t\treturn 1;" + NL + "\t}" + NL + "\t" + NL + "\tpublic int criaListaItens(Vector<bean";
  protected final String TEXT_72 = "> item, Connection conn) {" + NL + "\t\treturn 0;" + NL + "\t}" + NL + "\t" + NL + "\tpublic void alteraItem(bean";
  protected final String TEXT_73 = " item, Connection conn) {" + NL + "\t\tString sql = \"update ";
  protected final String TEXT_74 = " set \" +" + NL + "        \t";
  protected final String TEXT_75 = "\" ";
  protected final String TEXT_76 = " = ? \" +" + NL + "\t\t\t";
  protected final String TEXT_77 = "\" ,";
  protected final String TEXT_78 = " = ? \" +" + NL + "\t\t\t";
  protected final String TEXT_79 = "\" where ";
  protected final String TEXT_80 = " \";" + NL + "        PreparedStatement ps = null;" + NL + "        ResultSet rs = null;" + NL + "        try {" + NL + "            ps = conn.prepareStatement(sql);" + NL + "            ps = preencheParametros(item,ps);" + NL + "            ps = preencheParametrosChave(item,quantidadeCampos(),ps);" + NL + "            ps.executeUpdate();" + NL + "            " + NL + "        } catch (Exception e) {" + NL + "            logSistema.escreveLog(\"daoBase";
  protected final String TEXT_81 = ".alteraItem\", Utilitarios.StackTraceToString(e));" + NL + "            //return 0;" + NL + "        } finally {" + NL + "            fechaObjetos(ps, rs);" + NL + "        }" + NL + "\t\t//return 1;" + NL + "\t} " + NL + "" + NL + "\tpublic bean";
  protected final String TEXT_82 = " obtemPorChave(bean";
  protected final String TEXT_83 = " pesquisa, Connection conn) {" + NL + "        String sql = \"select * from ";
  protected final String TEXT_84 = " \" +" + NL + "        \t\" where ";
  protected final String TEXT_85 = " \";" + NL + "        PreparedStatement ps = null;" + NL + "        ResultSet rs = null;" + NL + "        try {" + NL + "            ps = conn.prepareStatement(sql);";
  protected final String TEXT_86 = NL + "\t\t\tps.set";
  protected final String TEXT_87 = "(";
  protected final String TEXT_88 = ", pesquisa.get";
  protected final String TEXT_89 = "());" + NL + "\t\t\t";
  protected final String TEXT_90 = NL + "\t\t\trs = ps.executeQuery();" + NL + "            bean";
  protected final String TEXT_91 = " saida = null;" + NL + "" + NL + "            if (rs.next()) {" + NL + "            \tsaida = extraiItem(rs);" + NL + "            }" + NL + "" + NL + "            return saida;" + NL + "        } catch (Exception e) {" + NL + "            logSistema.escreveLog(\"daoBase";
  protected final String TEXT_92 = ".obtemPorChave\", Utilitarios.StackTraceToString(e));" + NL + "            return null;" + NL + "        } finally {" + NL + "            fechaObjetos(ps, rs);" + NL + "        }" + NL + "    }" + NL + "    " + NL + "    protected String orderBy() {" + NL + "        return \"\";" + NL + "    }" + NL + "    " + NL + "    public Vector<bean";
  protected final String TEXT_93 = "> getLista(Connection conn) {" + NL + "    \tVector<bean";
  protected final String TEXT_94 = "> listaSaida = new Vector<bean";
  protected final String TEXT_95 = ">();" + NL + "        String sql = \"select * from ";
  protected final String TEXT_96 = " \"  + orderBy();" + NL + "        \t" + NL + "        PreparedStatement ps = null;" + NL + "        ResultSet rs = null;" + NL + "        try {" + NL + "            ps = conn.prepareStatement(sql);" + NL + "\t\t\trs = ps.executeQuery();" + NL + "" + NL + "            while (rs.next()) {" + NL + "            \tlistaSaida.add(extraiItem(rs));" + NL + "            }" + NL + "" + NL + "            return listaSaida;" + NL + "        } catch (Exception e) {" + NL + "            logSistema.escreveLog(\"daoBase";
  protected final String TEXT_97 = ".getLista\", Utilitarios.StackTraceToString(e));" + NL + "            return null;" + NL + "        } finally {" + NL + "            fechaObjetos(ps, rs);" + NL + "        }" + NL + "    }" + NL + "    " + NL + "}" + NL;
  protected final String TEXT_98 = NL;

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
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( conf.getNomePacoteModel() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getBase().getListaAtributo().size() );
    stringBuffer.append(TEXT_8);
    
		AtributoWrapper atributoW = new AtributoWrapper();
		Iterator iterador = classe.getBase().getListaAtributo().iterator();
		boolean primeiro = true;
		while (iterador.hasNext()) {
			atributoW.setBase((AtributoI) iterador.next());
			if (primeiro) {
				primeiro = false;
		
    stringBuffer.append(TEXT_9);
    stringBuffer.append( atributoW.getNomeCampoTabela() );
    stringBuffer.append(TEXT_10);
    
			} else { 
    stringBuffer.append(TEXT_11);
    stringBuffer.append( atributoW.getNomeCampoTabela() );
    stringBuffer.append(TEXT_12);
    
		}
		}
		
    stringBuffer.append(TEXT_13);
    
		atributoW = new AtributoWrapper();
		iterador = classe.getBase().getListaAtributo().iterator();
		primeiro = true;
		while (iterador.hasNext()) {
			atributoW.setBase((AtributoI) iterador.next());
			if (primeiro) {
				primeiro = false;
		
    stringBuffer.append(TEXT_14);
    stringBuffer.append( atributoW.getNomeCampoTabela() );
    stringBuffer.append(TEXT_15);
    
			} else { 
    stringBuffer.append(TEXT_16);
    stringBuffer.append( atributoW.getNomeCampoTabela() );
    stringBuffer.append(TEXT_17);
    
		}
		}
		
    stringBuffer.append(TEXT_18);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_21);
    
		atributoW = new AtributoWrapper();
		iterador = classe.getBase().getListaAtributo().iterator();
		while (iterador.hasNext()) {
			atributoW.setBase((AtributoI) iterador.next());
		
    stringBuffer.append(TEXT_22);
    stringBuffer.append( atributoW.getNomeMetodo() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( atributoW.getTipoParametroSql() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( atributoW.getNomeCampoTabela() );
    stringBuffer.append(TEXT_25);
    
		}
		
    stringBuffer.append(TEXT_26);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_29);
    
		atributoW = new AtributoWrapper();
		iterador = classe.getBase().getListaAtributo().iterator();
		while (iterador.hasNext()) {
			atributoW.setBase((AtributoI) iterador.next());
		
    stringBuffer.append(TEXT_30);
    stringBuffer.append( atributoW.getNomeMetodo() );
    stringBuffer.append(TEXT_31);
    stringBuffer.append( atributoW.getTipoParametroSql() );
    stringBuffer.append(TEXT_32);
    
		}
		
    stringBuffer.append(TEXT_33);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_34);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_35);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_36);
    
		atributoW = new AtributoWrapper();
		iterador = classe.getBase().getListaAtributo().iterator();
		while (iterador.hasNext()) {
			atributoW.setBase((AtributoI) iterador.next());
		
    stringBuffer.append(TEXT_37);
    stringBuffer.append( atributoW.getNomeMetodo() );
    stringBuffer.append(TEXT_38);
    stringBuffer.append( atributoW.getTipoParametroSql() );
    stringBuffer.append(TEXT_39);
    stringBuffer.append( atributoW.getNomeCampoTabela() );
    stringBuffer.append(TEXT_40);
    
		}
		
    stringBuffer.append(TEXT_41);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_42);
    
		atributoW = new AtributoWrapper();
		iterador = classe.getBase().getListaAtributo().iterator();
		int contador = 0;
		while (iterador.hasNext()) {
			atributoW.setBase((AtributoI) iterador.next());
			if (atributoW.precisaTratarNullSql()) {
				++contador;
		
    stringBuffer.append(TEXT_43);
    stringBuffer.append( atributoW.getNomeMetodo() );
    stringBuffer.append(TEXT_44);
    stringBuffer.append( atributoW.getTipoParametroSql() );
    stringBuffer.append(TEXT_45);
    stringBuffer.append( contador );
    stringBuffer.append(TEXT_46);
    stringBuffer.append( atributoW.getNomeMetodo() );
    stringBuffer.append(TEXT_47);
    stringBuffer.append( contador );
    stringBuffer.append(TEXT_48);
    stringBuffer.append( atributoW.getSqlTypes() );
    stringBuffer.append(TEXT_49);
     	} else {
    stringBuffer.append(TEXT_50);
    stringBuffer.append( atributoW.getTipoParametroSql() );
    stringBuffer.append(TEXT_51);
    stringBuffer.append( ++contador );
    stringBuffer.append(TEXT_52);
    stringBuffer.append( atributoW.getNomeMetodo() );
    stringBuffer.append(TEXT_53);
    
			}
		}
		
    stringBuffer.append(TEXT_54);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_55);
    
		atributoW = new AtributoWrapper();
		iterador = classe.getBase().getListaAtributo().iterator();
		while (iterador.hasNext()) {
			AtributoI att = (AtributoI) iterador.next();
			if (att.ehChave()) {
				atributoW.setBase(att);
		
    stringBuffer.append(TEXT_56);
    stringBuffer.append( atributoW.getTipoParametroSql() );
    stringBuffer.append(TEXT_57);
    stringBuffer.append( atributoW.getNomeMetodo() );
    stringBuffer.append(TEXT_58);
    
			}
		}
		
    stringBuffer.append(TEXT_59);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_60);
     if (classe.possuiChaveAuto()) { 
    stringBuffer.append(TEXT_61);
    stringBuffer.append( classe.getChaveAuto().getNomeCampoTabela() );
    stringBuffer.append(TEXT_62);
    stringBuffer.append( classe.getNomeTabela() );
    stringBuffer.append(TEXT_63);
     } 
    stringBuffer.append(TEXT_64);
    stringBuffer.append( classe.getNomeTabela() );
    stringBuffer.append(TEXT_65);
    stringBuffer.append( classe.sqlCampoInsert() );
    stringBuffer.append(TEXT_66);
    stringBuffer.append( classe.sqlConteudoInsert() );
    stringBuffer.append(TEXT_67);
     if (classe.possuiChaveAuto()) { 
    stringBuffer.append(TEXT_68);
    stringBuffer.append( classe.getChaveAuto().getNomeMetodo() );
    stringBuffer.append(TEXT_69);
     } 
    stringBuffer.append(TEXT_70);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_71);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_72);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_73);
    stringBuffer.append( classe.getNomeTabela() );
    stringBuffer.append(TEXT_74);
    
			atributoW = new AtributoWrapper();
			iterador = classe.getBase().getListaAtributo().iterator();
			contador = 0;
			while (iterador.hasNext()) {
				atributoW.setBase((AtributoI) iterador.next());
				contador++;
			
    
			   if (contador==1) {
			
    stringBuffer.append(TEXT_75);
    stringBuffer.append( atributoW.getNomeCampoTabela() );
    stringBuffer.append(TEXT_76);
     } else { 
			
    stringBuffer.append(TEXT_77);
    stringBuffer.append( atributoW.getNomeCampoTabela() );
    stringBuffer.append(TEXT_78);
     } 
			}
			
    stringBuffer.append(TEXT_79);
    stringBuffer.append( classe.sqlComparaPorChave() );
    stringBuffer.append(TEXT_80);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_81);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_82);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_83);
    stringBuffer.append( classe.getNomeTabela() );
    stringBuffer.append(TEXT_84);
    stringBuffer.append( classe.sqlComparaPorChave() );
    stringBuffer.append(TEXT_85);
    
			iterador = classe.getBase().getListaAtributo().iterator();
			int contaItem = 0;
			while (iterador.hasNext()) {
			atributoW.setBase((AtributoI) iterador.next());
			if (atributoW.getBase().ehChave()) {
			
    stringBuffer.append(TEXT_86);
    stringBuffer.append( atributoW.getTipoParametroSql() );
    stringBuffer.append(TEXT_87);
    stringBuffer.append( ++contaItem);
    stringBuffer.append(TEXT_88);
    stringBuffer.append( atributoW.getNomeMetodo() );
    stringBuffer.append(TEXT_89);
    
			}
			}
			
    stringBuffer.append(TEXT_90);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_91);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_92);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_93);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_94);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_95);
    stringBuffer.append( classe.getNomeTabela() );
    stringBuffer.append(TEXT_96);
    stringBuffer.append( classe.getNomeBasico() );
    stringBuffer.append(TEXT_97);
    stringBuffer.append(TEXT_98);
    return stringBuffer.toString();
  }
}
