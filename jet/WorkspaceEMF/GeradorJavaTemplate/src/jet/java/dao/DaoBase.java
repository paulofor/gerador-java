package jet.java.dao;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.java.*;
import gerapp.modelo.*;

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
  protected final String TEXT_2 = ".dao.basica;" + NL + "" + NL + "import java.util.List;" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".dao.montador.*;" + NL + "import ";
  protected final String TEXT_4 = ".modelo.";
  protected final String TEXT_5 = ";" + NL + "import ";
  protected final String TEXT_6 = ".regracolecao.filtro.";
  protected final String TEXT_7 = "Filtro;" + NL + "import br.com.digicom.lib.dao.DaoException;" + NL + "import br.com.digicom.lib.dao.DataFonte;" + NL + "import br.com.digicom.lib.dao.MontadorDaoI;" + NL + "import br.com.digicom.lib.util.DCConvert;" + NL + "import br.com.digicom.lib.dao.MontadorDaoComposite;" + NL + "" + NL + "" + NL + "" + NL + "public abstract class ";
  protected final String TEXT_8 = "DaoBase extends DaoAplicacao implements ";
  protected final String TEXT_9 = "DaoBaseI {" + NL + "\t" + NL + "\t" + NL + "\tpublic ";
  protected final String TEXT_10 = "DaoBase() {" + NL + "\t\tsuper();" + NL + "\t}" + NL + "\tpublic ";
  protected final String TEXT_11 = "DaoBase(DataFonte dataSource) {" + NL + "\t\tsuper(dataSource);" + NL + "\t}" + NL + "\tprotected String ConsultaJoin() {" + NL + "\t\tString tabelas;" + NL + "\t\ttabelas = tabelaSelect();" + NL + "\t\treturn tabelas;" + NL + "\t}" + NL + "\tprotected String CamposSelectJoin() {" + NL + "\t\tString select;" + NL + "\t\tselect = camposOrdenados();" + NL + "\t\treturn select;" + NL + "\t}" + NL + "\tprotected  MontadorDaoI criaMontadorPadrao() {" + NL + "\t\treturn new ";
  protected final String TEXT_12 = "Montador();" + NL + "\t}" + NL + "\tpublic static String tabelaSelect() {" + NL + "\t\treturn \" ";
  protected final String TEXT_13 = "\" ;" + NL + "\t}" + NL + "\tpublic  String orderByLista() {" + NL + "\t\treturn orderBy();" + NL + "\t}" + NL + "\tpublic String getLimite() {" + NL + "\t\treturn \"\";" + NL + "\t}" + NL + "\tpublic  String whereLista() {" + NL + "\t\treturn \"\";" + NL + "\t}" + NL + "\tpublic  String whereListaConcatenado() {" + NL + "\t\treturn \"\";" + NL + "\t}" + NL + "\tpublic   static String orderBy() {" + NL + "\t\treturn \" order by \" + tabelaSelect() + \".";
  protected final String TEXT_14 = " \" ;" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\tpublic static String camposOrdenados() {" + NL + "\t\treturn ";
  protected final String TEXT_15 = "\" ";
  protected final String TEXT_16 = " \" " + NL + "\t\t";
  protected final String TEXT_17 = "+ \" ,";
  protected final String TEXT_18 = " \" " + NL + "\t\t";
  protected final String TEXT_19 = ";" + NL + "\t}" + NL + "" + NL + "\tpublic static String camposOrdenadosAlias(String nomeTabela) {" + NL + "\t\treturn ";
  protected final String TEXT_20 = " ";
  protected final String TEXT_21 = " \" " + NL + "\t\t";
  protected final String TEXT_22 = "+ \" , \" + ";
  protected final String TEXT_23 = " \" " + NL + "\t\t";
  protected final String TEXT_24 = ";" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\t@Override" + NL + "\tpublic void insereItem(";
  protected final String TEXT_25 = " item) throws DaoException {" + NL + "\t\tString sql;" + NL + "        sql = \"insert into \" + tabelaSelect() +" + NL + "            camposInsert() + \" values \" + valoresInsert(item);" + NL + "        this.executaSql(sql);" + NL + "\t}" + NL + "\t@Override" + NL + "\tpublic void insereItemCompleto(";
  protected final String TEXT_26 = " item) throws DaoException {" + NL + "\t\t// mesmo que anterior com a chave" + NL + "\t\tthrow new UnsupportedOperationException ();" + NL + "\t}" + NL + "\t@Override" + NL + "\tpublic boolean insereSeNaoExiste(";
  protected final String TEXT_27 = " item) throws DaoException {" + NL + "\t\t";
  protected final String TEXT_28 = " teste = this.obtemPorChave(item.get";
  protected final String TEXT_29 = "());" + NL + "      \tif (teste == null)" + NL + "      \t{" + NL + "        \tinsereItemCompleto(item);" + NL + "          \treturn true;" + NL + "      \t}" + NL + "      \telse" + NL + "      \t{" + NL + "          \treturn false;" + NL + "      \t}" + NL + "\t}" + NL + "\t@Override" + NL + "\tpublic void insereItemLoad(";
  protected final String TEXT_30 = " item) throws DaoException {" + NL + "\t\tString sql;" + NL + "        sql = \"insert into \" + tabelaSelect() +" + NL + "            camposInsert() + \" values \" + valoresInsert(item);" + NL + "        this.executaSql(sql);" + NL + "        sql = \" SELECT MAX(";
  protected final String TEXT_31 = ") from \" + tabelaSelect();" + NL + "        long id = this.getValorLong(sql);" + NL + "        item.set";
  protected final String TEXT_32 = "(id);\t" + NL + "\t}" + NL + "\t@Override" + NL + "\tpublic void alteraItem(";
  protected final String TEXT_33 = " item) throws DaoException {" + NL + "\t\tString sql;" + NL + "        sql = \"update \" + tabelaSelect() +" + NL + "            \" set \" + camposValoresUpdateEdicao(item) + " + NL + "            \" where ";
  protected final String TEXT_34 = " = \" + item.get";
  protected final String TEXT_35 = "();" + NL + "        this.executaSql(sql);" + NL + " \t}" + NL + "\t@Override" + NL + "\tpublic void excluiItem(";
  protected final String TEXT_36 = " item) throws DaoException {" + NL + "\t\tString query = null;" + NL + "\t\tquery = \" delete from \" + tabelaSelect() + \" where ";
  protected final String TEXT_37 = " = \" + item.get";
  protected final String TEXT_38 = "();" + NL + "\t\texecutaSql(query);" + NL + "\t}" + NL + "\t@Override" + NL + "\tpublic ";
  protected final String TEXT_39 = " obtemPorChave(long id) throws DaoException {" + NL + "\t\tsetMontador(null);" + NL + "\t\tString sql;" + NL + "        sql = \"select \" + camposOrdenados() + " + NL + "        \t\" from \" + tabelaSelect() +" + NL + "         \t\" where ";
  protected final String TEXT_40 = " = \" + id;" + NL + "        return (";
  protected final String TEXT_41 = ") getObjeto(sql);" + NL + "\t}" + NL + "\t@Override" + NL + "\tpublic List ListaFiltro(";
  protected final String TEXT_42 = "Filtro filtro) throws DaoException {" + NL + "\t\tsetMontador(null);" + NL + "\t\tString sql;" + NL + "      \tsql = \"select \" + CamposSelectJoin() + \" from \" + ConsultaJoin();" + NL + "      \tString where;" + NL + "      \twhere = WhereFiltro(filtro) + whereListaConcatenado();" + NL + "      \tif (where.length() > 0)" + NL + "        \tsql += \" where \" + where;" + NL + "      \tsql += orderByLista();" + NL + "      \treturn getListaSql(sql);" + NL + "\t}" + NL + "\t" + NL + "\tprotected  String WhereFiltro( ";
  protected final String TEXT_43 = "Filtro filtro ) {" + NL + "    \tString saida = \"\";" + NL + "      \tboolean primeiro;" + NL + "      \tprimeiro = true;" + NL + "      \t";
  protected final String TEXT_44 = NL + "\t\tif (filtro.getCodigo";
  protected final String TEXT_45 = "() != -1)" + NL + "      \t{" + NL + "        \tif (!primeiro) saida += \" and \";" + NL + "          \telse primeiro = false;" + NL + "          \tsaida += \" \" + tabelaSelect() + \".";
  protected final String TEXT_46 = " = \" + filtro.getCodigo";
  protected final String TEXT_47 = "();" + NL + "      \t}" + NL + "      \t";
  protected final String TEXT_48 = NL + "      \treturn saida;" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\t@Override" + NL + "\tpublic List ListaFiltroSimples(";
  protected final String TEXT_49 = "Filtro filtro)" + NL + "\t\t\tthrows DaoException {" + NL + "\t\tsetMontador(null);" + NL + "\t\tString sql;" + NL + "\t\tsql = \"select \" + camposOrdenados() + \" from \" + tabelaSelect();" + NL + "      \tString where;" + NL + "\t\twhere = WhereFiltro(filtro)  + whereListaConcatenado();" + NL + "\t\tif (where.length() > 0)" + NL + "\t\t\tsql += \" where \" + where;" + NL + "\t\tsql += orderByLista();" + NL + "\t\treturn getListaSql(sql);" + NL + "\t}" + NL + "\t" + NL + "\t@Override" + NL + "\tpublic List ListaCorrente() throws DaoException {" + NL + "\t\tsetMontador(null);" + NL + "\t\tString sql;" + NL + "      \tsql = \"select \" + camposOrdenados() + \" from \" + tabelaSelect() + orderByLista();" + NL + "      \treturn getListaSql(sql);" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\tprotected String valoresInsert(";
  protected final String TEXT_50 = " item) {" + NL + "\t\treturn ";
  protected final String TEXT_51 = "\" ( ";
  protected final String TEXT_52 = " \" " + NL + "\t\t";
  protected final String TEXT_53 = "+ \" ,";
  protected final String TEXT_54 = " \"" + NL + "\t\t";
  protected final String TEXT_55 = "+ \" ) \";" + NL + "\t}" + NL + "\tprotected String camposInsert() " + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_56 = "\" ( ";
  protected final String TEXT_57 = " \" " + NL + "\t\t";
  protected final String TEXT_58 = "+ \" ,";
  protected final String TEXT_59 = " \" " + NL + "\t\t";
  protected final String TEXT_60 = " + \" ) \";" + NL + "\t}" + NL + "\t" + NL + "\tprotected String camposValoresUpdate(";
  protected final String TEXT_61 = " item) {" + NL + "\t\treturn ";
  protected final String TEXT_62 = "\" ";
  protected final String TEXT_63 = " = ";
  protected final String TEXT_64 = " \" " + NL + "\t\t";
  protected final String TEXT_65 = "+ \" , ";
  protected final String TEXT_66 = " = ";
  protected final String TEXT_67 = " \"" + NL + "\t\t";
  protected final String TEXT_68 = ";" + NL + "\t}" + NL + "\tprotected String camposValoresUpdateEdicao(";
  protected final String TEXT_69 = " item) {" + NL + "\t\treturn ";
  protected final String TEXT_70 = "\" ";
  protected final String TEXT_71 = " = ";
  protected final String TEXT_72 = " \" " + NL + "\t\t";
  protected final String TEXT_73 = "+ \" , ";
  protected final String TEXT_74 = " = ";
  protected final String TEXT_75 = " \" " + NL + "\t\t";
  protected final String TEXT_76 = "\"\"";
  protected final String TEXT_77 = ";" + NL + "\t}" + NL + "\t" + NL + "\t//** Lista Sem chave Estrangeira" + NL + "\t";
  protected final String TEXT_78 = NL + "\t/*" + NL + "\tpublic ";
  protected final String TEXT_79 = " obtemPor";
  protected final String TEXT_80 = "(long id) {" + NL + "\t\tstring sql;" + NL + "\t\tsql = \"select \" + camposOrdenados() +" + NL + "\t\t\t\" from \" + tabelaSelect() +" + NL + "\t\t\tinnerJoin";
  protected final String TEXT_81 = "_";
  protected final String TEXT_82 = "() + " + NL + "\t\t\t\" where ";
  protected final String TEXT_83 = " = \" + id;" + NL + "\t\treturn (";
  protected final String TEXT_84 = ") getObjeto(sql);" + NL + "\t}" + NL + "\t*/" + NL + "\tpublic static String innerJoin";
  protected final String TEXT_85 = "_";
  protected final String TEXT_86 = "() {" + NL + "\t\treturn \" inner join \" + ";
  protected final String TEXT_87 = "DaoBase.tabelaSelect() + \" on \" + ";
  protected final String TEXT_88 = "DaoBase.tabelaSelect() + \".";
  protected final String TEXT_89 = " = \" + tabelaSelect() + \".";
  protected final String TEXT_90 = " \";  " + NL + "\t}" + NL + "\tpublic static String outerJoin";
  protected final String TEXT_91 = "_";
  protected final String TEXT_92 = "() {" + NL + "\t\treturn \" left outer join \" + ";
  protected final String TEXT_93 = "DaoBase.tabelaSelect() + \" on \" + ";
  protected final String TEXT_94 = "DaoBase.tabelaSelect() + \".";
  protected final String TEXT_95 = " = \" + tabelaSelect() + \".";
  protected final String TEXT_96 = " \";  " + NL + "\t}" + NL + " \t";
  protected final String TEXT_97 = NL + "\t//** Final Lista Sem chave Estrangeira" + NL + "\t" + NL + "\t";
  protected final String TEXT_98 = NL + "\t";
  protected final String TEXT_99 = NL + "\t// Tratamento de objetos que possuem FK nesse objeto para objetos nao associativos" + NL + "\tpublic List getPor";
  protected final String TEXT_100 = "(long id) throws DaoException {" + NL + "\t\tsetMontador(null);" + NL + "\t\tString sql;" + NL + "      \tsql = \"select \" + camposOrdenadosJoin() + \" from \" + tabelaSelect() + " + NL + "        outterJoinAgrupado() +" + NL + "       \t\" where ";
  protected final String TEXT_101 = " = \" + id + orderByLista() + \" \" + getLimite();" + NL + "       \tsetMontador(getMontadorAgrupado());" + NL + "      \treturn getListaSql(sql);" + NL + "\t}" + NL + "\t// Estavam no Extendida - Depois colocar como final (tratar order e limit) -> limite 08/01/2016" + NL + "\tpublic List ListaPor";
  protected final String TEXT_102 = "(long id) throws DaoException {" + NL + "\t\treturn getPor";
  protected final String TEXT_103 = "(id);" + NL + "\t}" + NL + "\tpublic boolean excluiPor";
  protected final String TEXT_104 = "(long id) throws DaoException{" + NL + "\t\tsetMontador(null);" + NL + "\t\tString sql;" + NL + "      \tsql = \"delete from \" + tabelaSelect() + " + NL + "       \t\" where ";
  protected final String TEXT_105 = " = \" + id;" + NL + "       \tthis.executaSql(sql);" + NL + "       \treturn true;" + NL + "\t}" + NL + "\t//public static String innerJoin";
  protected final String TEXT_106 = "_";
  protected final String TEXT_107 = "() {" + NL + "\t//\treturn \" inner join \" + ";
  protected final String TEXT_108 = "DaoBase.tabelaSelect() + \" on \" + ";
  protected final String TEXT_109 = "DaoBase.tabelaSelect() + \".";
  protected final String TEXT_110 = " = \" + tabelaSelect() + \".";
  protected final String TEXT_111 = " \";  " + NL + "\t//}" + NL + "\t";
  protected final String TEXT_112 = NL + "\t" + NL + "\t";
  protected final String TEXT_113 = NL + "\t@Override" + NL + "\tpublic ";
  protected final String TEXT_114 = " obtemPorRel(long ";
  protected final String TEXT_115 = ", long ";
  protected final String TEXT_116 = ") throws DaoException {" + NL + "\t\tString sql = \"select \" + camposOrdenados() + \" from \" + tabelaSelect() +" + NL + "\t\t\t\t\" where ";
  protected final String TEXT_117 = " = \" + ";
  protected final String TEXT_118 = " + " + NL + "\t\t\t\t\" and ";
  protected final String TEXT_119 = " = \" + ";
  protected final String TEXT_120 = ";" + NL + "\t\treturn (";
  protected final String TEXT_121 = ") this.getObjeto(sql);" + NL + "\t}" + NL + "\t";
  protected final String TEXT_122 = NL + "\t" + NL + "\t// Tratamento de objetos que possuem FK nesse objeto para objetos associativos" + NL + "\t";
  protected final String TEXT_123 = NL + "\t//public List getPor";
  protected final String TEXT_124 = "(long id) throws DaoException{ // Padrao" + NL + "\tpublic List ListaPor";
  protected final String TEXT_125 = "(long id) throws DaoException{ // Combinar com Interface" + NL + "\t\tString sql;" + NL + "        sql = \"select \" + camposOrdenados() + \" , \" +" + NL + "        \t";
  protected final String TEXT_126 = "DaoBase.camposOrdenados() +" + NL + "        \t\" from \" + tabelaSelect() +" + NL + "        \t\" inner join \" + ";
  protected final String TEXT_127 = "DaoBase.tabelaSelect() +" + NL + "            \" on \" + ";
  protected final String TEXT_128 = "DaoBase.tabelaSelect() + \".";
  protected final String TEXT_129 = " = \" +" + NL + "            tabelaSelect() + \".";
  protected final String TEXT_130 = "\" +" + NL + "            \" where ";
  protected final String TEXT_131 = " = \" + id + \" \" +" + NL + "            criterioExclusao";
  protected final String TEXT_132 = "() + \" \" +" + NL + "            orderByLista();" + NL + "        MontadorDaoComposite montador = new MontadorDaoComposite();" + NL + "        montador.adicionaMontador(new ";
  protected final String TEXT_133 = "Montador(),null);" + NL + "        montador.adicionaMontador(new ";
  protected final String TEXT_134 = "Montador(), \"";
  protected final String TEXT_135 = "\");" + NL + "        setMontador(montador);" + NL + "        return getListaSqlListaInterna(sql);" + NL + "\t}" + NL + "\tpublic boolean excluiPor";
  protected final String TEXT_136 = "(long id) throws DaoException{" + NL + "\t\tString sql;" + NL + "      \tsql = \"delete from \" + tabelaSelect() + " + NL + "        \" where ";
  protected final String TEXT_137 = " = \" + id;" + NL + "       \tthis.executaSql(sql);" + NL + "       \treturn true;" + NL + "\t}" + NL + "\tprotected String criterioExclusao";
  protected final String TEXT_138 = "() {" + NL + "\t\treturn \"\";" + NL + "\t}" + NL + "\t";
  protected final String TEXT_139 = NL + "\t" + NL + "\t";
  protected final String TEXT_140 = NL + "\t" + NL + "\t" + NL + "\t" + NL + "\t// Relacionamento onde esse objeto ? chave estrangeira de outro. ????" + NL + "\t";
  protected final String TEXT_141 = NL + "\tprivate boolean _obtem";
  protected final String TEXT_142 = "_";
  protected final String TEXT_143 = " = false;" + NL + "\tpublic void setObtem";
  protected final String TEXT_144 = "_";
  protected final String TEXT_145 = "() {" + NL + "\t\t_obtem";
  protected final String TEXT_146 = "_";
  protected final String TEXT_147 = " = true;" + NL + "\t}" + NL + "\tprotected String outterJoin";
  protected final String TEXT_148 = "_";
  protected final String TEXT_149 = "() {" + NL + "\t\treturn \" left outer join \" + ";
  protected final String TEXT_150 = "DaoBase.tabelaSelect() + \" on \" + ";
  protected final String TEXT_151 = "DaoBase.tabelaSelect() + \".";
  protected final String TEXT_152 = " = \" + tabelaSelect() + \".";
  protected final String TEXT_153 = " \";  " + NL + "\t}" + NL + "\tpublic boolean atualiza";
  protected final String TEXT_154 = "(long ";
  protected final String TEXT_155 = ", long ";
  protected final String TEXT_156 = ") throws DaoException{" + NL + "\t\tString sql;" + NL + "      \tsql = \"update \" + tabelaSelect() + " + NL + "      \t\" set ";
  protected final String TEXT_157 = "  = \" + ";
  protected final String TEXT_158 = " +" + NL + "        \" where ";
  protected final String TEXT_159 = " = \" +  ";
  protected final String TEXT_160 = ";" + NL + "       \tthis.executaSql(sql);" + NL + "       \treturn true;" + NL + "\t}" + NL + "\t";
  protected final String TEXT_161 = NL + "\tpublic static String innerJoin";
  protected final String TEXT_162 = "_";
  protected final String TEXT_163 = "() {" + NL + "\t\treturn \" inner join \" + ";
  protected final String TEXT_164 = "DaoBase.tabelaSelect() + \" on \" + ";
  protected final String TEXT_165 = "DaoBase.tabelaSelect() + \".";
  protected final String TEXT_166 = " = \" + tabelaSelect() + \".";
  protected final String TEXT_167 = " \";  " + NL + "\t}" + NL + "\t";
  protected final String TEXT_168 = NL + " \t";
  protected final String TEXT_169 = NL + "\t// ********************************************************************\t" + NL + "\t" + NL + "\t" + NL + "\t" + NL + "\tprotected String camposOrdenadosJoin()" + NL + "    {" + NL + "        String saida = camposOrdenados();";
  protected final String TEXT_170 = NL + "\t\tsaida += (this._obtem";
  protected final String TEXT_171 = "_";
  protected final String TEXT_172 = "?\" , \" +";
  protected final String TEXT_173 = "DaoBase.camposOrdenados():\"\");";
  protected final String TEXT_174 = NL + "        return saida;" + NL + "    }" + NL + "    " + NL + "    public void limpaObtem()" + NL + "    {";
  protected final String TEXT_175 = NL + "\t\t_obtem";
  protected final String TEXT_176 = "_";
  protected final String TEXT_177 = " = false;";
  protected final String TEXT_178 = NL + "    }" + NL + "    " + NL + "\tprotected String outterJoinAgrupado()" + NL + "    {" + NL + "        String saida = \" \";";
  protected final String TEXT_179 = NL + "\t\tsaida += (this._obtem";
  protected final String TEXT_180 = "_";
  protected final String TEXT_181 = "? outterJoin";
  protected final String TEXT_182 = "_";
  protected final String TEXT_183 = "() + \" \":\"\");";
  protected final String TEXT_184 = NL + "        return saida;" + NL + "    }" + NL + "    protected MontadorDaoI getMontadorAgrupado()" + NL + "    {" + NL + "        MontadorDaoComposite montador = new MontadorDaoComposite();" + NL + "        montador.adicionaMontador(new ";
  protected final String TEXT_185 = "Montador(), null);";
  protected final String TEXT_186 = NL + "\t\tif (this._obtem";
  protected final String TEXT_187 = "_";
  protected final String TEXT_188 = ")" + NL + "            montador.adicionaMontador(new ";
  protected final String TEXT_189 = "Montador(), \"";
  protected final String TEXT_190 = "_";
  protected final String TEXT_191 = "\");";
  protected final String TEXT_192 = NL + "         return montador;" + NL + "    }" + NL + "\t" + NL + "\t" + NL + "}";
  protected final String TEXT_193 = NL;

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
    stringBuffer.append( conf.getNamespace() );
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
    stringBuffer.append( classe.getNomeParaTabela() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( classe.getIdentificadorW().getNomeCampoTabela() );
    stringBuffer.append(TEXT_14);
    
		Iterator<AtributoTotalI> iterador10 = classe.getListaAtributoTotal().iterator();
		boolean primeiro = true;
		while (iterador10.hasNext()) {
		AtributoTotalI atributo = iterador10.next();
		String campo = classe.getNomeParaTabela() + "." + atributo.getNomeCampoTabela();
		if (atributo.getTipoOriginal().compareTo("Tempo")==0)
			campo = " DATE_FORMAT(" + campo + ",'%H:%i')";
		if (atributo.getTipoOriginal().compareTo("Data")==0)
			campo = " DATE_FORMAT(" + campo + ",'%d-%m-%Y')";
		if (atributo.getTipoOriginal().compareTo("DTemp")==0)
			campo = " DATE_FORMAT(" + campo + ",'%d-%m-%Y %H:%i:%s')";
		if (primeiro) {
		
    stringBuffer.append(TEXT_15);
    stringBuffer.append( campo );
    stringBuffer.append(TEXT_16);
     } else { 
    stringBuffer.append(TEXT_17);
    stringBuffer.append( campo );
    stringBuffer.append(TEXT_18);
    
		}
		primeiro = false;
		}
		
    stringBuffer.append(TEXT_19);
    
		Iterator<AtributoTotalI> iterador = classe.getListaAtributoTotal().iterator();
		primeiro = true;
		while (iterador.hasNext()) {
		AtributoTotalI atributo = iterador.next();
		String campo = "nomeTabela + \"." + atributo.getNomeCampoTabela();
		if (atributo.getTipoOriginal().compareTo("Tempo")==0)
			campo = " \"DATE_FORMAT(\" + " + campo + ",'%H:%i')";
		if (atributo.getTipoOriginal().compareTo("Data")==0)
			campo = " \"DATE_FORMAT(\" + " + campo + ",'%d-%m-%Y')";
		if (atributo.getTipoOriginal().compareTo("DTemp")==0)
			campo = " \"DATE_FORMAT(\" + " + campo + ",'%d-%m-%Y %H:%i:%s')";
		if (primeiro) {
		
    stringBuffer.append(TEXT_20);
    stringBuffer.append( campo );
    stringBuffer.append(TEXT_21);
     } else { 
    stringBuffer.append(TEXT_22);
    stringBuffer.append( campo );
    stringBuffer.append(TEXT_23);
    
		}
		primeiro = false;
		}
		
    stringBuffer.append(TEXT_24);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_25);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append( classe.getChaveW().getNomePropriedade() );
    stringBuffer.append(TEXT_29);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_30);
    stringBuffer.append( classe.getChaveW().getNomeCampoTabela() );
    stringBuffer.append(TEXT_31);
    stringBuffer.append( classe.getChaveW().getNomePropriedade() );
    stringBuffer.append(TEXT_32);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( classe.getChaveW().getNomeCampoTabela() );
    stringBuffer.append(TEXT_34);
    stringBuffer.append( classe.getChaveW().getNomePropriedade() );
    stringBuffer.append(TEXT_35);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_36);
    stringBuffer.append( classe.getChaveW().getNomeCampoTabela() );
    stringBuffer.append(TEXT_37);
    stringBuffer.append( classe.getChaveW().getNomePropriedade() );
    stringBuffer.append(TEXT_38);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_39);
    stringBuffer.append( classe.getChaveW().getNomeCampoTabela() );
    stringBuffer.append(TEXT_40);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_41);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_42);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_43);
    
		Iterator<RelacionamentoWrapper> it1 = classe.obtemListaComChaveEstrangeira().iterator();
		while (it1.hasNext()) {
		RelacionamentoWrapper relac = it1.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
    stringBuffer.append(TEXT_44);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_45);
    stringBuffer.append( relac.getNomeCampoTabela() );
    stringBuffer.append(TEXT_46);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_47);
    
		}
		
    stringBuffer.append(TEXT_48);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_49);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_50);
    
		Iterator<AtributoTotalI> iteradorIns = classe.getListaAtributoTotal().iterator();
		boolean primeiro3 = true;
		while (iteradorIns.hasNext()) {
		AtributoTotalI atributo = iteradorIns.next();
		String campo = atributo.formatoUpdateInsert("item");
		if (primeiro3) {
		
    stringBuffer.append(TEXT_51);
    stringBuffer.append( campo );
    stringBuffer.append(TEXT_52);
     } else { 
    stringBuffer.append(TEXT_53);
    stringBuffer.append( campo );
    stringBuffer.append(TEXT_54);
    
		}
		primeiro3 = false;
		}
		
    stringBuffer.append(TEXT_55);
    
		Iterator<AtributoTotalI> iteradorCi = classe.getListaAtributoTotal().iterator();
		boolean primeiro2 = true;
		while (iteradorCi.hasNext()) {
		AtributoTotalI atributo = iteradorCi.next();
		String campo = atributo.getNomeCampoTabela();
		if (primeiro2) {
		
    stringBuffer.append(TEXT_56);
    stringBuffer.append( campo );
    stringBuffer.append(TEXT_57);
     } else { 
    stringBuffer.append(TEXT_58);
    stringBuffer.append( campo );
    stringBuffer.append(TEXT_59);
    
		}
		primeiro2 = false;
		}
		
    stringBuffer.append(TEXT_60);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_61);
    
		Iterator<AtributoTotalI> iteradorUpd = classe.getListaAtributoTotal().iterator();
		boolean primeiro4 = true;
		while (iteradorUpd.hasNext()) {
		AtributoTotalI atributo = iteradorUpd.next();
		String campo = atributo.formatoUpdateInsert("item");
		if (primeiro4) {
		
    stringBuffer.append(TEXT_62);
    stringBuffer.append( atributo.getNomeCampoTabela() );
    stringBuffer.append(TEXT_63);
    stringBuffer.append( campo );
    stringBuffer.append(TEXT_64);
     } else { 
    stringBuffer.append(TEXT_65);
    stringBuffer.append( atributo.getNomeCampoTabela() );
    stringBuffer.append(TEXT_66);
    stringBuffer.append( campo );
    stringBuffer.append(TEXT_67);
    
		}
		primeiro4 = false;
		}
		
    stringBuffer.append(TEXT_68);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_69);
    
		Iterator<AtributoTotalI> iteradorUpdEd = classe.getListaAtributoTotal().iterator();
		boolean primeiro5 = true;
		while (iteradorUpdEd.hasNext()) {
		AtributoTotalI atributo = iteradorUpdEd.next();
		String campo = atributo.formatoUpdateInsert("item");
		if (primeiro5) {
		primeiro5 = false;
		
    stringBuffer.append(TEXT_70);
    stringBuffer.append( atributo.getNomeCampoTabela() );
    stringBuffer.append(TEXT_71);
    stringBuffer.append( campo );
    stringBuffer.append(TEXT_72);
     } else { 
    stringBuffer.append(TEXT_73);
    stringBuffer.append( atributo.getNomeCampoTabela() );
    stringBuffer.append(TEXT_74);
    stringBuffer.append( campo );
    stringBuffer.append(TEXT_75);
    
		}// else
		}// fim do if do while
		if (primeiro5) {
    stringBuffer.append(TEXT_76);
    }
		
    stringBuffer.append(TEXT_77);
    
	Iterator<RelacionamentoWrapper> itSemChave = classe.obtemListaSemChaveEstrangeiraComUsuario().iterator();
	while (itSemChave.hasNext()) {
	RelacionamentoWrapper relac = itSemChave.next();
	ClasseWrapper classeOposta = relac.getClasseOposta();
	AtributoWrapper chaveOposta = classeOposta.getChaveW();
	
    stringBuffer.append(TEXT_78);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_79);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_80);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_81);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_82);
    stringBuffer.append( classeOposta.getChaveW().getNomeCampoTabela() );
    stringBuffer.append(TEXT_83);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_84);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_85);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_86);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_87);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_88);
    stringBuffer.append( relac.getNomeCampoTabelaEntidadeOposta() );
    stringBuffer.append(TEXT_89);
    stringBuffer.append( classe.getChaveW().getNomeCampoTabela() );
    stringBuffer.append(TEXT_90);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_91);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_92);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_93);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_94);
    stringBuffer.append( relac.getNomeCampoTabelaEntidadeOposta() );
    stringBuffer.append(TEXT_95);
    stringBuffer.append( classe.getChaveW().getNomeCampoTabela() );
    stringBuffer.append(TEXT_96);
    
		}
	
    stringBuffer.append(TEXT_97);
     if (!classe.isAssociativa()) { 
    stringBuffer.append(TEXT_98);
    
	Iterator<RelacionamentoWrapper> iteradorRel1 = classe.obtemListaComChaveEstrangeiraComUsuario().iterator();
	while (iteradorRel1.hasNext()) {
		RelacionamentoWrapper relCorrente1 = iteradorRel1.next();
		ClasseWrapper classeOposta = relCorrente1.getClasseOposta();
		AtributoWrapper chaveOposta = classeOposta.getChaveW();
	
    stringBuffer.append(TEXT_99);
    stringBuffer.append( relCorrente1.getNome() );
    stringBuffer.append(TEXT_100);
    stringBuffer.append( relCorrente1.getNomeCampoTabela() );
    stringBuffer.append(TEXT_101);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relCorrente1.getNomeRelacionamento() );
    stringBuffer.append(TEXT_102);
    stringBuffer.append( relCorrente1.getNome() );
    stringBuffer.append(TEXT_103);
    stringBuffer.append( relCorrente1.getNome() );
    stringBuffer.append(TEXT_104);
    stringBuffer.append( relCorrente1.getNomeCampoTabela() );
    stringBuffer.append(TEXT_105);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_106);
    stringBuffer.append( relCorrente1.getNomeRelacionamento() );
    stringBuffer.append(TEXT_107);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_108);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_109);
    stringBuffer.append( relCorrente1.getNomeCampoTabelaEntidadeOposta() );
    stringBuffer.append(TEXT_110);
    stringBuffer.append( classe.getChaveW().getNomeCampoTabela() );
    stringBuffer.append(TEXT_111);
    
	}
	} else { 
	
    stringBuffer.append(TEXT_112);
    
	List<RelacionamentoWrapper> lista = classe.obtemListaComChaveEstrangeira();
	RelacionamentoWrapper rel1 = lista.get(0);
	RelacionamentoWrapper rel2 = lista.get(1);
	if (rel1.getClasseOposta().getId()!= rel2.getClasseOposta().getId()) {
	
    stringBuffer.append(TEXT_113);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_114);
    stringBuffer.append( rel1.getNomeVariavel() );
    stringBuffer.append(TEXT_115);
    stringBuffer.append( rel2.getNomeVariavel() );
    stringBuffer.append(TEXT_116);
    stringBuffer.append( rel1.getNomeCampoTabela() );
    stringBuffer.append(TEXT_117);
    stringBuffer.append( rel1.getNomeVariavel() );
    stringBuffer.append(TEXT_118);
    stringBuffer.append( rel2.getNomeCampoTabela() );
    stringBuffer.append(TEXT_119);
    stringBuffer.append( rel2.getNomeVariavel() );
    stringBuffer.append(TEXT_120);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_121);
    
	}
	
    stringBuffer.append(TEXT_122);
    
	Iterator<RelacionamentoWrapper> iteradorRel2 = classe.obtemListaComChaveEstrangeira().iterator();
	while (iteradorRel2.hasNext()) {
		RelacionamentoWrapper relCorrente2 = iteradorRel2.next();
		RelacionamentoWrapper relOutro = classe.outroRel(relCorrente2);
	
    stringBuffer.append(TEXT_123);
    stringBuffer.append( relCorrente2.getNome() );
    stringBuffer.append(TEXT_124);
    stringBuffer.append( relCorrente2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append( relCorrente2.getNomeRelacionamento() );
    stringBuffer.append(TEXT_125);
    stringBuffer.append( relOutro.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_126);
    stringBuffer.append( relOutro.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_127);
    stringBuffer.append( relOutro.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_128);
    stringBuffer.append( relOutro.getClasseOposta().getChaveW().getNomeCampoTabela() );
    stringBuffer.append(TEXT_129);
    stringBuffer.append( relOutro.getNomeCampoTabela() );
    stringBuffer.append(TEXT_130);
    stringBuffer.append( relCorrente2.getNomeCampoTabela() );
    stringBuffer.append(TEXT_131);
    stringBuffer.append( relCorrente2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append( relCorrente2.getNomeRelacionamento() );
    stringBuffer.append(TEXT_132);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_133);
    stringBuffer.append( relOutro.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_134);
    stringBuffer.append( relOutro.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append( relOutro.getNomeRelacionamento() );
    stringBuffer.append(TEXT_135);
    stringBuffer.append( relCorrente2.getNome() );
    stringBuffer.append(TEXT_136);
    stringBuffer.append( relCorrente2.getNomeCampoTabela() );
    stringBuffer.append(TEXT_137);
    stringBuffer.append( relCorrente2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append( relCorrente2.getNomeRelacionamento() );
    stringBuffer.append(TEXT_138);
    
	}
	
    stringBuffer.append(TEXT_139);
    
	}
	
    stringBuffer.append(TEXT_140);
    
	Iterator<RelacionamentoWrapper> iterador2 = classe.obtemListaComChaveEstrangeiraComUsuario().iterator();
	while (iterador2.hasNext()) {
	RelacionamentoWrapper relac = iterador2.next();
	ClasseWrapper classeOposta = relac.getClasseOposta();
	AtributoWrapper chaveOposta = classeOposta.getChaveW();
	
    stringBuffer.append(TEXT_141);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_142);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_143);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_144);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_145);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_146);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_147);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_148);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_149);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_150);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_151);
    stringBuffer.append( chaveOposta.getNomeCampoTabela() );
    stringBuffer.append(TEXT_152);
    stringBuffer.append( relac.getNomeCampoTabela() );
    stringBuffer.append(TEXT_153);
    stringBuffer.append( relac.getNome() );
    stringBuffer.append(TEXT_154);
    stringBuffer.append( classe.getChaveW().getNomeVariavel() );
    stringBuffer.append(TEXT_155);
    stringBuffer.append( relac.getNomeVariavel() );
    stringBuffer.append(TEXT_156);
    stringBuffer.append( relac.getNomeCampoTabela() );
    stringBuffer.append(TEXT_157);
    stringBuffer.append( relac.getNomeVariavel() );
    stringBuffer.append(TEXT_158);
    stringBuffer.append( classe.getChaveW().getNomeCampoTabela() );
    stringBuffer.append(TEXT_159);
    stringBuffer.append( classe.getChaveW().getNomeVariavel() );
    stringBuffer.append(TEXT_160);
     if (!relac.ehAuto()) { 
    stringBuffer.append(TEXT_161);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_162);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_163);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_164);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_165);
    stringBuffer.append( chaveOposta.getNomeCampoTabela() );
    stringBuffer.append(TEXT_166);
    stringBuffer.append( relac.getNomeCampoTabela() );
    stringBuffer.append(TEXT_167);
     } 
    stringBuffer.append(TEXT_168);
    
		}
	
    stringBuffer.append(TEXT_169);
    
		Iterator<RelacionamentoWrapper> iterador3 = classe.obtemListaComChaveEstrangeira().iterator();
		while (iterador3.hasNext()) {
		RelacionamentoWrapper relac = iterador3.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		AtributoWrapper chaveOposta = classeOposta.getChaveW();
		
    stringBuffer.append(TEXT_170);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_171);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_172);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_173);
    
		}
		
    stringBuffer.append(TEXT_174);
    
		Iterator<RelacionamentoWrapper> iterador7 = classe.obtemListaComChaveEstrangeira().iterator();
		while (iterador7.hasNext()) {
		RelacionamentoWrapper relac = iterador7.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		AtributoWrapper chaveOposta = classeOposta.getChaveW();
		
    stringBuffer.append(TEXT_175);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_176);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_177);
    
		}
		
    stringBuffer.append(TEXT_178);
    
		Iterator<RelacionamentoWrapper> iterador4 = classe.obtemListaComChaveEstrangeira().iterator();
		while (iterador4.hasNext()) {
		RelacionamentoWrapper relac = iterador4.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		AtributoWrapper chaveOposta = classeOposta.getChaveW();
		
    stringBuffer.append(TEXT_179);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_180);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_181);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_182);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_183);
    
		}
		
    stringBuffer.append(TEXT_184);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_185);
    
		Iterator<RelacionamentoWrapper> iterador5 = classe.obtemListaComChaveEstrangeira().iterator();
		while (iterador5.hasNext()) {
		RelacionamentoWrapper relac = iterador5.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		AtributoWrapper chaveOposta = classeOposta.getChaveW();
		
    stringBuffer.append(TEXT_186);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_187);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_188);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_189);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_190);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_191);
    
		}
		
    stringBuffer.append(TEXT_192);
    stringBuffer.append(TEXT_193);
    return stringBuffer.toString();
  }
}
