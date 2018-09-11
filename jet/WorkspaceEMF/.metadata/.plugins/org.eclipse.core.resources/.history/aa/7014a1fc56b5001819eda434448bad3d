package jet.csdn35.dao;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.cs.*;
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
  protected final String TEXT_1 = "using System;" + NL + "using System.Collections;" + NL + "using System.Collections.Generic;" + NL + "using br.com.digicom.lib.dao;" + NL + "using br.com.digicom.lib;" + NL + "using br.com.digicom.lib.util;" + NL + "using ";
  protected final String TEXT_2 = ".modelo;" + NL + "using ";
  protected final String TEXT_3 = ".dao.montador;" + NL + "" + NL + "" + NL + "" + NL + "namespace ";
  protected final String TEXT_4 = ".dao.basico {" + NL + "" + NL + "public abstract class ";
  protected final String TEXT_5 = "DaoBase : DaoAplicacao{" + NL + "\t" + NL + "\tpublic ";
  protected final String TEXT_6 = "DaoBase() : base()" + NL + "    {" + NL + "\t}" + NL + "    public ";
  protected final String TEXT_7 = "DaoBase( DataFonte dataSource ): base( dataSource )" + NL + "    {" + NL + "\t}" + NL + "\tprotected override MontadorDaoI criaMontadorPadrao()  " + NL + "\t{" + NL + "      return new ";
  protected final String TEXT_8 = "Montador();" + NL + "\t}" + NL + "\t" + NL + "\t";
  protected final String TEXT_9 = NL + "\tpublic virtual ArrayList ObtemPorUsuario(Usuario usuario) {" + NL + " \t\t String sql = \"select \" + camposOrdenados() + \" from \" + tabelaSelect() +" + NL + "                \" where \" + tabelaSelect() + \".id_usuario_s = \" + usuario.IdObj;" + NL + "         return getListaSql(sql);" + NL + " \t}" + NL + " \t";
  protected final String TEXT_10 = NL + "\t" + NL + "\t";
  protected final String TEXT_11 = NL + "\t/*" + NL + "\tpublic ";
  protected final String TEXT_12 = " obtemPor";
  protected final String TEXT_13 = "(long id) {" + NL + "\t\tstring sql;" + NL + "\t\tsql = \"select \" + camposOrdenados() +" + NL + "\t\t\t\" from \" + tabelaSelect() +" + NL + "\t\t\tinnerJoin";
  protected final String TEXT_14 = "_";
  protected final String TEXT_15 = "() + " + NL + "\t\t\t\" where ";
  protected final String TEXT_16 = " = \" + id;" + NL + "\t\treturn (";
  protected final String TEXT_17 = ") getObjeto(sql);" + NL + "\t}" + NL + "\t*/" + NL + "\tpublic static String innerJoin";
  protected final String TEXT_18 = "_";
  protected final String TEXT_19 = "() {" + NL + "\t\treturn \" inner join \" + ";
  protected final String TEXT_20 = "Dao.tabelaSelect() + \" on \" + ";
  protected final String TEXT_21 = "Dao.tabelaSelect() + \".";
  protected final String TEXT_22 = " = \" + tabelaSelect() + \".";
  protected final String TEXT_23 = " \";  " + NL + "\t}" + NL + " \t";
  protected final String TEXT_24 = NL + "\t" + NL + "\t" + NL + "\tpublic virtual ";
  protected final String TEXT_25 = " getCompletoPorId(long id) {" + NL + "\t\tthrow new NotImplementedException();" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\tpublic virtual ";
  protected final String TEXT_26 = " getPorId(long id) {" + NL + "\t\tstring sql;" + NL + "        sql = \"select \" + camposOrdenados() + " + NL + "        \t\" from \" + tabelaSelect() +" + NL + "         \t\" where ";
  protected final String TEXT_27 = " = \" + id;" + NL + "        return (";
  protected final String TEXT_28 = ") getObjeto(sql);" + NL + "\t}" + NL + "\tpublic virtual void excluiPorId(long id) {" + NL + "\t\tstring sql;" + NL + "        sql = \"delete from \" + tabelaSelect() +" + NL + "         \t\" where ";
  protected final String TEXT_29 = " = \" + id;" + NL + "        executaSql(sql);" + NL + "\t}" + NL + "\tpublic virtual bool  criaLoad(";
  protected final String TEXT_30 = " item) {" + NL + "\t\tstring sql;" + NL + "        sql = \"insert into \" + tabelaSelect() +" + NL + "            camposInsertSemChave() + \" values \" + valoresInsertSemChave(item);" + NL + "        this.executaSql(sql);" + NL + "        sql = \" SELECT MAX(";
  protected final String TEXT_31 = ") from \" + tabelaSelect();" + NL + "        item.";
  protected final String TEXT_32 = " = this.getValorLong(sql);" + NL + "        return true;" + NL + "\t}" + NL + "\tpublic virtual bool  cria(";
  protected final String TEXT_33 = " item) {" + NL + "\t\tstring sql;" + NL + "        sql = \"insert into \" + tabelaSelect() +" + NL + "            camposInsert() + \" values \" + valoresInsert(item);" + NL + "        this.executaSql(sql);" + NL + "        return true;" + NL + "\t}" + NL + "\tpublic virtual bool  criaSemChave(";
  protected final String TEXT_34 = " item) {" + NL + "\t\tstring sql;" + NL + "        sql = \"insert into \" + tabelaSelect() +" + NL + "            camposInsertSemChave() + \" values \" + valoresInsertSemChave(item);" + NL + "        this.executaSql(sql);" + NL + "        return true;" + NL + "\t}" + NL + "" + NL + "\t";
  protected final String TEXT_35 = NL + "\t/* sincronismo com chave composta */" + NL + "\tpublic virtual bool  atualizaCompostaUsuario(";
  protected final String TEXT_36 = " item) {" + NL + "\t\tstring sql;" + NL + "        sql = \"update \" + tabelaSelect() +" + NL + "            \" set \" + camposValoresUpdate(item) + " + NL + "            \" where ";
  protected final String TEXT_37 = " = \" + item.";
  protected final String TEXT_38 = " +" + NL + "            \" and id_usuario_s = \" + item.IdUsuarioS;" + NL + "        this.executaSql(sql);" + NL + "        return true;" + NL + "\t}" + NL + "\tpublic virtual bool  apagaCompostaUsuario(";
  protected final String TEXT_39 = " item) {" + NL + "\t\tstring sql;" + NL + "        sql = \"delete from \" + tabelaSelect() +" + NL + "            \" where ";
  protected final String TEXT_40 = " = \" + item.";
  protected final String TEXT_41 = " +" + NL + "            \" and id_usuario_s = \" + item.IdUsuarioS;" + NL + "        this.executaSql(sql);" + NL + "        return true;" + NL + "\t}" + NL + "\t";
  protected final String TEXT_42 = NL + NL + NL + NL + "\t" + NL + "\tpublic virtual bool  atualiza(";
  protected final String TEXT_43 = " item) {" + NL + "\t\tstring sql;" + NL + "        sql = \"update \" + tabelaSelect() +" + NL + "            \" set \" + camposValoresUpdate(item) + " + NL + "            \" where ";
  protected final String TEXT_44 = " = \" + item.";
  protected final String TEXT_45 = ";" + NL + "        this.executaSql(sql);" + NL + "        return true;" + NL + "\t}" + NL + "\tpublic virtual bool  apaga(";
  protected final String TEXT_46 = " item) {" + NL + "\t\tstring sql;" + NL + "        sql = \"delete from \" + tabelaSelect() +" + NL + "            \" where ";
  protected final String TEXT_47 = " = \" + item.";
  protected final String TEXT_48 = ";" + NL + "        this.executaSql(sql);" + NL + "        return true;" + NL + "\t}" + NL + "\tpublic virtual bool  atualizaCamposEdicao(";
  protected final String TEXT_49 = " item) {" + NL + "\t\tstring sql;" + NL + "        sql = \"update \" + tabelaSelect() +" + NL + "            \" set \" + camposValoresUpdateEdicao(item) + " + NL + "            \" where ";
  protected final String TEXT_50 = " = \" + item.";
  protected final String TEXT_51 = ";" + NL + "        this.executaSql(sql);" + NL + "        return true;" + NL + "\t}" + NL + "\t" + NL + "\tprotected string camposValoresUpdate(";
  protected final String TEXT_52 = " item) {" + NL + "\t\treturn ";
  protected final String TEXT_53 = "\" ";
  protected final String TEXT_54 = " = ";
  protected final String TEXT_55 = " \" " + NL + "\t\t";
  protected final String TEXT_56 = "+ \" , ";
  protected final String TEXT_57 = " = ";
  protected final String TEXT_58 = " \"" + NL + "\t\t";
  protected final String TEXT_59 = ";" + NL + "\t}" + NL + "\tprotected String camposValoresUpdateEdicao(";
  protected final String TEXT_60 = " item) {" + NL + "\t\treturn ";
  protected final String TEXT_61 = "\" ";
  protected final String TEXT_62 = " = ";
  protected final String TEXT_63 = " \" " + NL + "\t\t";
  protected final String TEXT_64 = "+ \" , ";
  protected final String TEXT_65 = " = ";
  protected final String TEXT_66 = " \" " + NL + "\t\t";
  protected final String TEXT_67 = "\"\"";
  protected final String TEXT_68 = ";" + NL + "\t}" + NL + "\t" + NL + "\tprotected virtual string valoresInsert(";
  protected final String TEXT_69 = " item) {" + NL + "\t\treturn ";
  protected final String TEXT_70 = "\" ( ";
  protected final String TEXT_71 = " \" " + NL + "\t\t";
  protected final String TEXT_72 = "+ \" ,";
  protected final String TEXT_73 = " \"" + NL + "\t\t";
  protected final String TEXT_74 = "+ \" ) \";" + NL + "\t}" + NL + "\tprotected virtual string valoresInsertSemChave(";
  protected final String TEXT_75 = " item) {" + NL + "\t\treturn ";
  protected final String TEXT_76 = "\" ( ";
  protected final String TEXT_77 = " \" " + NL + "\t\t\t\t";
  protected final String TEXT_78 = "+ \" ,";
  protected final String TEXT_79 = " \"" + NL + "\t\t\t\t";
  protected final String TEXT_80 = "+ \" ) \";";
  protected final String TEXT_81 = " null; ";
  protected final String TEXT_82 = NL + "\t}" + NL + "\t" + NL + "\t/*" + NL + "\tprotected string consultaJoin()  " + NL + "\t{" + NL + "     \tstring tabelas;" + NL + "  \t\ttabelas =  tabelaSelect() ;" + NL + "  \t\treturn tabelas;" + NL + "\t}" + NL + "\tprotected string camposSelectJoin()  " + NL + "\t{" + NL + "     \tstring select;" + NL + "  \t\tselect =  camposOrdenados() ;" + NL + "  \t\treturn select;" + NL + "\t}" + NL + "\t*/" + NL + "\t" + NL + "\t" + NL + "\t// Relacionamento onde esse objeto ? chave estrangeira de outro. ????" + NL + "\t";
  protected final String TEXT_83 = NL + "\tprivate bool _obtem";
  protected final String TEXT_84 = "_";
  protected final String TEXT_85 = " = false;" + NL + "\tpublic void setObtem";
  protected final String TEXT_86 = "_";
  protected final String TEXT_87 = "() {" + NL + "\t\t_obtem";
  protected final String TEXT_88 = "_";
  protected final String TEXT_89 = " = true;" + NL + "\t}" + NL + "\tprotected String outterJoin";
  protected final String TEXT_90 = "_";
  protected final String TEXT_91 = "() {" + NL + "\t\treturn \" left outer join \" + ";
  protected final String TEXT_92 = "Dao.tabelaSelect() + \" on \" + ";
  protected final String TEXT_93 = "Dao.tabelaSelect() + \".";
  protected final String TEXT_94 = " = \" + tabelaSelect() + \".";
  protected final String TEXT_95 = " \";  " + NL + "\t}" + NL + "\tpublic virtual bool atualiza";
  protected final String TEXT_96 = "(long ";
  protected final String TEXT_97 = ", long ";
  protected final String TEXT_98 = ") {" + NL + "\t\tstring sql;" + NL + "      \tsql = \"update \" + tabelaSelect() + " + NL + "      \t\" set ";
  protected final String TEXT_99 = "  = \" + ";
  protected final String TEXT_100 = " +" + NL + "        \" where ";
  protected final String TEXT_101 = " = \" +  ";
  protected final String TEXT_102 = ";" + NL + "       \tthis.executaSql(sql);" + NL + "       \treturn true;" + NL + "\t}" + NL + "\t";
  protected final String TEXT_103 = NL + "\tpublic static String innerJoin";
  protected final String TEXT_104 = "_";
  protected final String TEXT_105 = "() {" + NL + "\t\treturn \" inner join \" + ";
  protected final String TEXT_106 = "Dao.tabelaSelect() + \" on \" + ";
  protected final String TEXT_107 = "Dao.tabelaSelect() + \".";
  protected final String TEXT_108 = " = \" + tabelaSelect() + \".";
  protected final String TEXT_109 = " \";  " + NL + "\t}" + NL + "\t";
  protected final String TEXT_110 = NL + " \t";
  protected final String TEXT_111 = NL + "\t// ********************************************************************\t" + NL + "\t" + NL + "\tpublic virtual string orderByLista()  " + NL + "\t{" + NL + "      return orderBy();" + NL + "\t}" + NL + "\tpublic virtual string whereLista()  " + NL + "\t{" + NL + "      return \"\";" + NL + "\t}" + NL + "\tpublic virtual string whereListaConcatenado()  " + NL + "\t{" + NL + "      return \"\";" + NL + "\t}" + NL + "\tpublic static string orderBy()  " + NL + "\t{" + NL + "      return \"\" ;" + NL + "\t}" + NL + "\t" + NL + "\tpublic static string tabelaSelect()  " + NL + "\t{" + NL + "      return \" ";
  protected final String TEXT_112 = "\" ;" + NL + "\t}" + NL + "\t" + NL + "\tprotected string camposInsert() " + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_113 = "\" ( ";
  protected final String TEXT_114 = " \" " + NL + "\t\t";
  protected final String TEXT_115 = "+ \" ,";
  protected final String TEXT_116 = " \" " + NL + "\t\t";
  protected final String TEXT_117 = " + \" ) \";" + NL + "\t}" + NL + "\tprotected string camposInsertSemChave() " + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_118 = "\" ( ";
  protected final String TEXT_119 = " \" " + NL + "\t\t\t\t";
  protected final String TEXT_120 = "+ \" ,";
  protected final String TEXT_121 = " \" " + NL + "\t\t\t\t";
  protected final String TEXT_122 = " + \" ) \";";
  protected final String TEXT_123 = " null; ";
  protected final String TEXT_124 = NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\tprivate string ConverteDataHoraVo2Sql(string campo)" + NL + "    {" + NL + "        // AAAA-MM-DD HH:MM:SS" + NL + "        // 01234567890123456789" + NL + "        //string dia = campo.Substring(8, 2);" + NL + "        //string mes = campo.Substring(5, 2);" + NL + "        //string ano = campo.Substring(0, 4);" + NL + "        //string hora = campo.Substring(11, 2);" + NL + "        //string min = campo.Substring(14, 2);" + NL + "        //string seg = campo.Substring(17, 2);" + NL + "        //LogArquivo.Display(\"ConverteDataHora2Sql:\" + campo);" + NL + "        // AAAAMMDDHHMMSS" + NL + "        // 01234567890123" + NL + "        //string dia = campo.Substring(6, 2);" + NL + "        //string mes = campo.Substring(4, 2);" + NL + "        //string ano = campo.Substring(0, 4);" + NL + "        //string hora = campo.Substring(8, 2);" + NL + "        //string min = campo.Substring(10, 2);" + NL + "        //string seg = campo.Substring(12, 2);" + NL + "" + NL + "        // DD-MM-AAAA HH:MM:SS" + NL + "        // 0123456789012345678" + NL + "        string dia = campo.Substring(0, 2);" + NL + "        string mes = campo.Substring(3, 2);" + NL + "        string ano = campo.Substring(6, 4);" + NL + "        string hora = campo.Substring(11, 2);" + NL + "        string min = campo.Substring(14, 2);" + NL + "        string seg = campo.Substring(17, 2);" + NL + "        return ano + \"-\" + mes + \"-\" + dia + \" \" + hora + \":\" + min + \":\" + seg;" + NL + "    }" + NL + "\tprivate string ConverteData2Sql(string campo)" + NL + "    {" + NL + "    \tLogArquivo.Display(\"ConverteData2Sql:\" + campo);" + NL + "        // AAAA-MM-DD HH:MM:SS" + NL + "        // 01234567890123456789" + NL + "        string dia = campo.Substring(8, 2);" + NL + "        string mes = campo.Substring(5, 2);" + NL + "        string ano = campo.Substring(0, 4);" + NL + "        return ano + \"-\" + mes + \"-\" + dia;" + NL + "    }" + NL + "\tpublic static string camposOrdenados() " + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_125 = "\" ";
  protected final String TEXT_126 = " \" " + NL + "\t\t";
  protected final String TEXT_127 = "+ \" ,";
  protected final String TEXT_128 = " \" " + NL + "\t\t";
  protected final String TEXT_129 = ";" + NL + "\t}" + NL + "\tpublic static string camposOrdenadosAlias(string nomeTabela) " + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_130 = " ";
  protected final String TEXT_131 = " \" " + NL + "\t\t";
  protected final String TEXT_132 = "+ \" , \" + ";
  protected final String TEXT_133 = " \" " + NL + "\t\t";
  protected final String TEXT_134 = ";" + NL + "\t}" + NL + "\t" + NL + "\tprotected string camposOrdenadosJoin()" + NL + "    {" + NL + "        string saida = camposOrdenados();";
  protected final String TEXT_135 = NL + "\t\tsaida += (this._obtem";
  protected final String TEXT_136 = "_";
  protected final String TEXT_137 = "?\" , \" +";
  protected final String TEXT_138 = "Dao.camposOrdenados():\"\");";
  protected final String TEXT_139 = NL + "        return saida;" + NL + "    }" + NL + "    " + NL + "    public void limpaObtem()" + NL + "    {";
  protected final String TEXT_140 = NL + "\t\t_obtem";
  protected final String TEXT_141 = "_";
  protected final String TEXT_142 = " = false;";
  protected final String TEXT_143 = NL + "    }" + NL + "    " + NL + "\tprotected string outterJoinAgrupado()" + NL + "    {" + NL + "        string saida = \" \";";
  protected final String TEXT_144 = NL + "\t\tsaida += (this._obtem";
  protected final String TEXT_145 = "_";
  protected final String TEXT_146 = "? outterJoin";
  protected final String TEXT_147 = "_";
  protected final String TEXT_148 = "() + \" \":\"\");";
  protected final String TEXT_149 = NL + "        return saida;" + NL + "    }" + NL + "    protected MontadorDaoI getMontadorAgrupado()" + NL + "    {" + NL + "        MontadorDaoComposite montador = new MontadorDaoComposite();" + NL + "        montador.adicionaMontador(new ";
  protected final String TEXT_150 = "Montador(), null);";
  protected final String TEXT_151 = NL + "\t\tif (this._obtem";
  protected final String TEXT_152 = "_";
  protected final String TEXT_153 = ")" + NL + "            montador.adicionaMontador(new ";
  protected final String TEXT_154 = "Montador(), \"";
  protected final String TEXT_155 = "_";
  protected final String TEXT_156 = "\");";
  protected final String TEXT_157 = NL + "         return montador;" + NL + "    }" + NL + "\t" + NL + "\tpublic virtual ArrayList listaTotal()  " + NL + "\t{" + NL + "     \tstring sql;" + NL + "      \tsql = \"select \" + camposOrdenados() + \" from \" + tabelaSelect() + orderByLista();" + NL + "      \treturn getListaSql(sql);" + NL + "\t}" + NL + "\tpublic virtual ArrayList listaTotalPorApp(string app)" + NL + "    {" + NL + "        throw new NotImplementedException();" + NL + "    }" + NL + "" + NL + "\t";
  protected final String TEXT_158 = NL + "\t";
  protected final String TEXT_159 = NL + "\t// Tratamento de objetos que possuem FK nesse objeto para objetos nao associativos" + NL + "\tpublic virtual ArrayList getPor";
  protected final String TEXT_160 = "(long id) {" + NL + "\t\tstring sql;" + NL + "      \tsql = \"select \" + camposOrdenadosJoin() + \" from \" + tabelaSelect() + " + NL + "        outterJoinAgrupado() +" + NL + "       \t\" where ";
  protected final String TEXT_161 = " = \" + id + orderByLista();" + NL + "       \tsetMontador(getMontadorAgrupado());" + NL + "      \treturn getListaSql(sql);" + NL + "\t}" + NL + "\tpublic virtual bool excluiPor";
  protected final String TEXT_162 = "(long id) {" + NL + "\t\tstring sql;" + NL + "      \tsql = \"delete from \" + tabelaSelect() + " + NL + "       \t\" where ";
  protected final String TEXT_163 = " = \" + id;" + NL + "       \tthis.executaSql(sql);" + NL + "       \treturn true;" + NL + "\t}" + NL + "\t";
  protected final String TEXT_164 = NL + "\t// Tratamento de objetos que possuem FK nesse objeto para objetos associativos" + NL + "\t";
  protected final String TEXT_165 = NL + "\tpublic virtual ArrayList getPor";
  protected final String TEXT_166 = "(long id) {" + NL + "\t\tstring sql;" + NL + "        sql = \"select \" + camposOrdenados() + \" , \" +" + NL + "        \t";
  protected final String TEXT_167 = "DaoBase.camposOrdenados() +" + NL + "        \t\" from \" + tabelaSelect() +" + NL + "        \t\" inner join \" + ";
  protected final String TEXT_168 = "DaoBase.tabelaSelect() +" + NL + "            \" on \" + ";
  protected final String TEXT_169 = "DaoBase.tabelaSelect() + \".";
  protected final String TEXT_170 = " = \" +" + NL + "            tabelaSelect() + \".";
  protected final String TEXT_171 = "\" +" + NL + "            \" where ";
  protected final String TEXT_172 = " = \" + id + orderByLista();" + NL + "        MontadorDaoComposite montador = new MontadorDaoComposite();" + NL + "        montador.adicionaMontador(new ";
  protected final String TEXT_173 = "Montador(),null);" + NL + "        montador.adicionaMontador(new ";
  protected final String TEXT_174 = "Montador(), \"";
  protected final String TEXT_175 = "_";
  protected final String TEXT_176 = "\");" + NL + "        setMontador(montador);" + NL + "        return getListaSql(sql);" + NL + "\t}" + NL + "\tpublic virtual bool excluiPor";
  protected final String TEXT_177 = "(long id) {" + NL + "\t\tstring sql;" + NL + "      \tsql = \"delete from \" + tabelaSelect() + " + NL + "        \" where ";
  protected final String TEXT_178 = " = \" + id;" + NL + "       \tthis.executaSql(sql);" + NL + "       \treturn true;" + NL + "\t}" + NL + "\t" + NL + "\t";
  protected final String TEXT_179 = NL + "\t" + NL + "\t";
  protected final String TEXT_180 = NL + "\t" + NL + "\t";
  protected final String TEXT_181 = NL + "\t" + NL + "\tpublic ArrayList listaFiltroChaves(";
  protected final String TEXT_182 = ") {" + NL + "\t\tstring sql = \"select \" + camposOrdenados() + \" from \" + tabelaSelect();" + NL + "\t\tstring where = \"\";" + NL + "\t\t";
  protected final String TEXT_183 = NL + "        if (codigo";
  protected final String TEXT_184 = "_";
  protected final String TEXT_185 = " != 0)" + NL + "        {" + NL + "            where += (where.Length > 0 ? \" and \" : \" where \");" + NL + "            where += \"";
  protected final String TEXT_186 = " = \" + codigo";
  protected final String TEXT_187 = "_";
  protected final String TEXT_188 = ";" + NL + "        }";
  protected final String TEXT_189 = NL + "\t\treturn getListaSql(sql + where + orderByLista());" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\t" + NL + "\tpublic ";
  protected final String TEXT_190 = " ConverteItem(Object item)" + NL + "    {" + NL + "        return (";
  protected final String TEXT_191 = ")item;" + NL + "    }" + NL + "    " + NL + "    public ";
  protected final String TEXT_192 = " ConverteItem(Object item, DaoConexao conexao)" + NL + "    {" + NL + "       \t";
  protected final String TEXT_193 = " novo = (";
  protected final String TEXT_194 = ") item;" + NL + "       \tnovo.setConexaoCarregador(conexao);" + NL + "        return novo;" + NL + "    }" + NL + "\t" + NL + "\t" + NL + "\tpublic static List<";
  protected final String TEXT_195 = "> ConverteLista(ArrayList lista)" + NL + "    {" + NL + "        List<";
  protected final String TEXT_196 = "> saida = new List<";
  protected final String TEXT_197 = ">();" + NL + "        foreach (object item in lista) {" + NL + "            saida.Add((";
  protected final String TEXT_198 = ")item);" + NL + "        }" + NL + "        return saida;" + NL + "    }" + NL + "    " + NL + "    public List<";
  protected final String TEXT_199 = "> ConverteLista(ArrayList lista, DaoConexao conexao)" + NL + "    {" + NL + "        List<";
  protected final String TEXT_200 = "> saida = new List<";
  protected final String TEXT_201 = ">();" + NL + "        foreach (object item in lista) {" + NL + "        \t";
  protected final String TEXT_202 = " novo = (";
  protected final String TEXT_203 = ") item;" + NL + "        \tnovo.setConexaoCarregador(conexao);" + NL + "            saida.Add(novo);" + NL + "        }" + NL + "        return saida;" + NL + "    }" + NL + "    ";
  protected final String TEXT_204 = NL + "\tpublic ArrayList lista";
  protected final String TEXT_205 = "NaoAssociada_";
  protected final String TEXT_206 = "(long id";
  protected final String TEXT_207 = ") {" + NL + "    \tstring sql = \"select \" + ";
  protected final String TEXT_208 = "Dao.camposOrdenados() +" + NL + "        \t\" from \" + ";
  protected final String TEXT_209 = "Dao.tabelaSelect() +" + NL + "            \" where ";
  protected final String TEXT_210 = " not in (\" +" + NL + "            \" select ";
  protected final String TEXT_211 = " from \" +" + NL + "        \ttabelaSelect() + \" where ";
  protected final String TEXT_212 = " = \" + id";
  protected final String TEXT_213 = " + \")\";" + NL + "        setMontador(new ";
  protected final String TEXT_214 = "Montador());" + NL + "        return this.getListaSql(sql);" + NL + "    }" + NL + "\tpublic ArrayList lista";
  protected final String TEXT_215 = "NaoAssociada_";
  protected final String TEXT_216 = "(long id";
  protected final String TEXT_217 = ") {" + NL + "    \tstring sql = \"select \" + ";
  protected final String TEXT_218 = "Dao.camposOrdenados() +" + NL + "        \t\" from \" + ";
  protected final String TEXT_219 = "Dao.tabelaSelect() +" + NL + "            \" where ";
  protected final String TEXT_220 = " not in (\" +" + NL + "            \" select ";
  protected final String TEXT_221 = " from \" +" + NL + "        \ttabelaSelect() + \" where ";
  protected final String TEXT_222 = " = \" + id";
  protected final String TEXT_223 = " + \")\";" + NL + "        setMontador(new ";
  protected final String TEXT_224 = "Montador());" + NL + "        return this.getListaSql(sql);" + NL + "    }" + NL + "       " + NL + "    public ";
  protected final String TEXT_225 = " obtemPorCodigoDuplo(long id";
  protected final String TEXT_226 = ",long id";
  protected final String TEXT_227 = ") {" + NL + "    \tstring sql = \"select \" + camposOrdenados() + \" from \" + tabelaSelect() +" + NL + "                \" where \" +" + NL + "               \" ";
  protected final String TEXT_228 = " = \" + id";
  protected final String TEXT_229 = " + \" and \" +" + NL + "                \" ";
  protected final String TEXT_230 = " = \" + id";
  protected final String TEXT_231 = ";" + NL + "        return (";
  protected final String TEXT_232 = ")getObjeto(sql);" + NL + "    }" + NL + "    " + NL + "\t";
  protected final String TEXT_233 = NL + "    " + NL + "    ";
  protected final String TEXT_234 = NL + "\t// Usuario" + NL + "\tpublic ";
  protected final String TEXT_235 = " ObtemPorCodigoImei(string codigo)" + NL + "    {" + NL + "    \tstring sql = \"select \" + camposOrdenados() + \" from \" + tabelaSelect() +" + NL + "\t    \t\" inner join \" + DispositivoUsuarioDao.tabelaSelect() + \" on \" + DispositivoUsuarioDao.tabelaSelect() + \".id_usuario_ra = \" + tabelaSelect() + \".id_usuario \" +" + NL + "        \t//innerJoinDispositivoUsuario_Usa() +" + NL + "            \" where dispositivo_usuario.codigo_dispositivo = '\" + codigo + \"'\";" + NL + "        return (Usuario) this.getObjeto(sql);" + NL + "\t}" + NL + "\tpublic ";
  protected final String TEXT_236 = " ObtemPorCodigoImeiApp(string app, string codigo)" + NL + "    {" + NL + "    \tstring sql = \"select \" + camposOrdenados() + \" from \" + tabelaSelect() +" + NL + "\t    \t\" inner join \" + DispositivoUsuarioDao.tabelaSelect() + \" on \" + DispositivoUsuarioDao.tabelaSelect() + \".id_usuario_ra = \" + tabelaSelect() + \".id_usuario \" +" + NL + "        \t\" inner join app_produto on app_produto.id_app_produto = dispositivo_usuario.id_app_produto_u \" +" + NL + "            \" where dispositivo_usuario.codigo_dispositivo = '\" + codigo + \"' and app_produto.codigo_hash = '\" + app + \"'\";" + NL + "        return (Usuario) this.getObjeto(sql);" + NL + "\t}" + NL + "\tpublic ";
  protected final String TEXT_237 = " ObtemPorCodigoTelApp(string app, string codigo)" + NL + "    {" + NL + "    \tstring sql = \"select \" + camposOrdenados() + \" from \" + tabelaSelect() +" + NL + "\t    \t\" inner join \" + DispositivoUsuarioDao.tabelaSelect() + \" on \" + DispositivoUsuarioDao.tabelaSelect() + \".id_usuario_ra = \" + tabelaSelect() + \".id_usuario \" +" + NL + "        \t\" inner join app_produto on app_produto.id_app_produto = dispositivo_usuario.id_app_produto_u \" +" + NL + "            \" where dispositivo_usuario.numero_celular = '\" + codigo + \"' and app_produto.codigo_hash = '\" + app + \"'\";" + NL + "        return (Usuario) this.getObjeto(sql);" + NL + "\t}" + NL + "\tpublic ";
  protected final String TEXT_238 = " ObtemPorCodigoTel(string codigo)" + NL + "    {" + NL + "\t\tstring sql = \"select \" + camposOrdenados() + \" from \" + tabelaSelect() +" + NL + "\t\t\t\" inner join \" + DispositivoUsuarioDao.tabelaSelect() + \" on \" + DispositivoUsuarioDao.tabelaSelect() + \".id_usuario_ra = \" + tabelaSelect() + \".id_usuario \" +" + NL + "        \t//innerJoinDispositivoUsuario_Usa() +" + NL + "            \" where dispositivo_usuario.numero_celular = '\" + codigo + \"'\";" + NL + "        return (Usuario)this.getObjeto(sql);\t}";
  protected final String TEXT_239 = NL + "\t// DispositivoUsuario" + NL + "\tpublic ";
  protected final String TEXT_240 = " ObtemPorCodigoTel(string codigo)" + NL + "    {" + NL + "    \tstring sql = \"select \" + camposOrdenados() + \" from \" + " + NL + "        \t\ttabelaSelect() + \" where numero_celular = '\" + codigo + \"'\";" + NL + "        return (";
  protected final String TEXT_241 = ") this.getObjeto(sql);" + NL + "\t}" + NL + "\tpublic ";
  protected final String TEXT_242 = " ObtemPorCodigoTelApp(string app, string codigo)" + NL + "    {" + NL + "    \tstring sql = \"select \" + camposOrdenados() + \" from \" + " + NL + "        \t\ttabelaSelect() + " + NL + "        \t\t\" inner join app_produto on app_produto.id_app_produto = dispositivo_usuario.id_app_produto_u \" +" + NL + "\t            \" where dispositivo_usuario.numero_celular = '\" + codigo + \"' and app_produto.codigo_hash = '\" + app + \"'\";" + NL + "        return (";
  protected final String TEXT_243 = ") this.getObjeto(sql);" + NL + "\t}" + NL + "\tpublic ";
  protected final String TEXT_244 = " ObtemPorCodigoImei(string codigo)" + NL + "    {" + NL + "    \tstring sql = \"select \" + camposOrdenados() + \" from \" + " + NL + "        \t\ttabelaSelect() + \" where codigo_dispositivo = '\" + codigo + \"'\";" + NL + "        return (";
  protected final String TEXT_245 = ") this.getObjeto(sql);" + NL + "\t}" + NL + "\tpublic ";
  protected final String TEXT_246 = " ObtemPorCodigoImeiApp(string app, string codigo)" + NL + "    {" + NL + "    \tstring sql = \"select \" + camposOrdenados() + \" from \" + " + NL + "        \t\ttabelaSelect() + " + NL + "        \t\t\" inner join app_produto on app_produto.id_app_produto = dispositivo_usuario.id_app_produto_u \" +" + NL + "\t            \" where dispositivo_usuario.codigo_dispositivo = '\" + codigo + \"' and app_produto.codigo_hash = '\" + app + \"'\";" + NL + "        return (";
  protected final String TEXT_247 = ") this.getObjeto(sql);" + NL + "\t}";
  protected final String TEXT_248 = NL + NL + NL + "\t" + NL + "}" + NL + "  \t" + NL + "}";

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
    
	if (classe.possuiRelacionamentoUsuario() && !classe.ehDispositivo()) {
	
    stringBuffer.append(TEXT_9);
    
 	}
 	
    stringBuffer.append(TEXT_10);
    
	Iterator<RelacionamentoWrapper> itSemChave = classe.obtemListaSemChaveEstrangeira().iterator();
	while (itSemChave.hasNext()) {
	RelacionamentoWrapper relac = itSemChave.next();
	ClasseWrapper classeOposta = relac.getClasseOposta();
	AtributoWrapper chaveOposta = classeOposta.getChaveW();
	
    stringBuffer.append(TEXT_11);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( classeOposta.getChaveW().getNomeCampoTabela() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_21);
    stringBuffer.append( relac.getNomeCampoTabelaEntidadeOposta() );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( classe.getChaveW().getNomeCampoTabela() );
    stringBuffer.append(TEXT_23);
    
		}
	
    stringBuffer.append(TEXT_24);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_25);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( classe.getChaveW().getNomeCampoTabela() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append( classe.getChaveW().getNomeCampoTabela() );
    stringBuffer.append(TEXT_29);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_30);
    stringBuffer.append( classe.getChaveW().getNomeCampoTabela() );
    stringBuffer.append(TEXT_31);
    stringBuffer.append( classe.getChaveW().getNomePropriedade() );
    stringBuffer.append(TEXT_32);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_34);
    
	if (classe.possuiRelacionamentoUsuario()) {
	
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
    stringBuffer.append( classe.getChaveW().getNomePropriedade() );
    stringBuffer.append(TEXT_41);
    
	}
	
    stringBuffer.append(TEXT_42);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_43);
    stringBuffer.append( classe.getChaveW().getNomeCampoTabela() );
    stringBuffer.append(TEXT_44);
    stringBuffer.append( classe.getChaveW().getNomePropriedade() );
    stringBuffer.append(TEXT_45);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_46);
    stringBuffer.append( classe.getChaveW().getNomeCampoTabela() );
    stringBuffer.append(TEXT_47);
    stringBuffer.append( classe.getChaveW().getNomePropriedade() );
    stringBuffer.append(TEXT_48);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_49);
    stringBuffer.append( classe.getChaveW().getNomeCampoTabela() );
    stringBuffer.append(TEXT_50);
    stringBuffer.append( classe.getChaveW().getNomePropriedade() );
    stringBuffer.append(TEXT_51);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_52);
    
		Iterator<AtributoTotalI> iteradorUpd = classe.getListaAtributoTotal().iterator();
		boolean primeiro4 = true;
		while (iteradorUpd.hasNext()) {
		AtributoTotalI atributo = iteradorUpd.next();
		String campo = atributo.formatoUpdateInsert("item");
		if (primeiro4) {
		
    stringBuffer.append(TEXT_53);
    stringBuffer.append( atributo.getNomeCampoTabela() );
    stringBuffer.append(TEXT_54);
    stringBuffer.append( campo );
    stringBuffer.append(TEXT_55);
     } else { 
    stringBuffer.append(TEXT_56);
    stringBuffer.append( atributo.getNomeCampoTabela() );
    stringBuffer.append(TEXT_57);
    stringBuffer.append( campo );
    stringBuffer.append(TEXT_58);
    
		}
		primeiro4 = false;
		}
		
    stringBuffer.append(TEXT_59);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_60);
    
		Iterator<AtributoTotalI> iteradorUpdEd = classe.getListaAtributoTotal().iterator();
		boolean primeiro5 = true;
		while (iteradorUpdEd.hasNext()) {
		AtributoTotalI atributo = iteradorUpdEd.next();
		String campo = atributo.formatoUpdateInsert("item");
		if (primeiro5) {
		primeiro5 = false;
		
    stringBuffer.append(TEXT_61);
    stringBuffer.append( atributo.getNomeCampoTabela() );
    stringBuffer.append(TEXT_62);
    stringBuffer.append( campo );
    stringBuffer.append(TEXT_63);
     } else { 
    stringBuffer.append(TEXT_64);
    stringBuffer.append( atributo.getNomeCampoTabela() );
    stringBuffer.append(TEXT_65);
    stringBuffer.append( campo );
    stringBuffer.append(TEXT_66);
    
		}// else
		}// fim do if do while
		if (primeiro5) {
    stringBuffer.append(TEXT_67);
    }
		
    stringBuffer.append(TEXT_68);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_69);
    
		Iterator<AtributoTotalI> iteradorIns = classe.getListaAtributoTotal().iterator();
		boolean primeiro3 = true;
		while (iteradorIns.hasNext()) {
		AtributoTotalI atributo = iteradorIns.next();
		String campo = atributo.formatoUpdateInsert("item");
		if (primeiro3) {
		
    stringBuffer.append(TEXT_70);
    stringBuffer.append( campo );
    stringBuffer.append(TEXT_71);
     } else { 
    stringBuffer.append(TEXT_72);
    stringBuffer.append( campo );
    stringBuffer.append(TEXT_73);
    
		}
		primeiro3 = false;
		}
		
    stringBuffer.append(TEXT_74);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_75);
    
		if (classe.getListaAtributoTotal().size()>1) {
			iteradorIns = classe.getListaAtributoTotal().iterator();
			primeiro3 = true;
			while (iteradorIns.hasNext()) {
			AtributoTotalI atributo = iteradorIns.next();
			String campo = atributo.formatoUpdateInsert("item");
			if (!atributo.ehChave()) {
				if (primeiro3) {
				
    stringBuffer.append(TEXT_76);
    stringBuffer.append( campo );
    stringBuffer.append(TEXT_77);
     } else { 
    stringBuffer.append(TEXT_78);
    stringBuffer.append( campo );
    stringBuffer.append(TEXT_79);
    
				}
				primeiro3 = false;
				}
			}
			
    stringBuffer.append(TEXT_80);
    		} else {  
    stringBuffer.append(TEXT_81);
     } 
    stringBuffer.append(TEXT_82);
    
	Iterator<RelacionamentoWrapper> iterador2 = classe.obtemListaComChaveEstrangeiraComUsuario().iterator();
	while (iterador2.hasNext()) {
	RelacionamentoWrapper relac = iterador2.next();
	ClasseWrapper classeOposta = relac.getClasseOposta();
	AtributoWrapper chaveOposta = classeOposta.getChaveW();
	
    stringBuffer.append(TEXT_83);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_84);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_85);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_86);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_87);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_88);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_89);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_90);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_91);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_92);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_93);
    stringBuffer.append( chaveOposta.getNomeCampoTabela() );
    stringBuffer.append(TEXT_94);
    stringBuffer.append( relac.getNomeCampoTabela() );
    stringBuffer.append(TEXT_95);
    stringBuffer.append( relac.getNome() );
    stringBuffer.append(TEXT_96);
    stringBuffer.append( classe.getChaveW().getNomeVariavel() );
    stringBuffer.append(TEXT_97);
    stringBuffer.append( relac.getNomeVariavel() );
    stringBuffer.append(TEXT_98);
    stringBuffer.append( relac.getNomeCampoTabela() );
    stringBuffer.append(TEXT_99);
    stringBuffer.append( relac.getNomeVariavel() );
    stringBuffer.append(TEXT_100);
    stringBuffer.append( classe.getChaveW().getNomeCampoTabela() );
    stringBuffer.append(TEXT_101);
    stringBuffer.append( classe.getChaveW().getNomeVariavel() );
    stringBuffer.append(TEXT_102);
     if (!relac.ehAuto()) { 
    stringBuffer.append(TEXT_103);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_104);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_105);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_106);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_107);
    stringBuffer.append( chaveOposta.getNomeCampoTabela() );
    stringBuffer.append(TEXT_108);
    stringBuffer.append( relac.getNomeCampoTabela() );
    stringBuffer.append(TEXT_109);
     } 
    stringBuffer.append(TEXT_110);
    
		}
	
    stringBuffer.append(TEXT_111);
    stringBuffer.append( classe.getNomeParaTabela() );
    stringBuffer.append(TEXT_112);
    
		Iterator<AtributoTotalI> iterador = classe.getListaAtributoTotal().iterator();
		boolean primeiro2 = true;
		while (iterador.hasNext()) {
		AtributoTotalI atributo = iterador.next();
		String campo = atributo.getNomeCampoTabela();
		if (primeiro2) {
		
    stringBuffer.append(TEXT_113);
    stringBuffer.append( campo );
    stringBuffer.append(TEXT_114);
     } else { 
    stringBuffer.append(TEXT_115);
    stringBuffer.append( campo );
    stringBuffer.append(TEXT_116);
    
		}
		primeiro2 = false;
		}
		
    stringBuffer.append(TEXT_117);
    
		if (classe.getListaAtributoTotal().size()>1) {
			iterador = classe.getListaAtributoTotal().iterator();
			primeiro2 = true;
			while (iterador.hasNext()) {
			AtributoTotalI atributo = iterador.next();
			String campo = atributo.getNomeCampoTabela();
			if (!atributo.ehChave()) {
				if (primeiro2) {
				
    stringBuffer.append(TEXT_118);
    stringBuffer.append( campo );
    stringBuffer.append(TEXT_119);
     } else { 
    stringBuffer.append(TEXT_120);
    stringBuffer.append( campo );
    stringBuffer.append(TEXT_121);
    
				}
				primeiro2 = false;
				}
			}
			
    stringBuffer.append(TEXT_122);
    		} else { 
    stringBuffer.append(TEXT_123);
     } 
    stringBuffer.append(TEXT_124);
    
		Iterator<AtributoTotalI> iterador10 = classe.getListaAtributoTotal().iterator();
		boolean primeiro = true;
		while (iterador10.hasNext()) {
		AtributoTotalI atributo = iterador10.next();
		String campo = classe.getNomeParaTabela() + "." + atributo.getNomeCampoTabela();
		if (atributo.getTipoOriginal().compareTo("Tempo")==0)
			campo = " DATE_FORMAT(" + campo + ",'%H:%i') as " + atributo.getNomeCampoTabela();
		if (atributo.getTipoOriginal().compareTo("Data")==0)
			campo = " DATE_FORMAT(" + campo + ",'%d-%m-%Y') as " + atributo.getNomeCampoTabela();
		if (atributo.getTipoOriginal().compareTo("DTemp")==0)
			campo = " DATE_FORMAT(" + campo + ",'%d-%m-%Y %H:%i:%s') as " + atributo.getNomeCampoTabela();
		if (primeiro) {
		
    stringBuffer.append(TEXT_125);
    stringBuffer.append( campo );
    stringBuffer.append(TEXT_126);
     } else { 
    stringBuffer.append(TEXT_127);
    stringBuffer.append( campo );
    stringBuffer.append(TEXT_128);
    
		}
		primeiro = false;
		}
		
    stringBuffer.append(TEXT_129);
    
		iterador = classe.getListaAtributoTotal().iterator();
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
		
    stringBuffer.append(TEXT_130);
    stringBuffer.append( campo );
    stringBuffer.append(TEXT_131);
     } else { 
    stringBuffer.append(TEXT_132);
    stringBuffer.append( campo );
    stringBuffer.append(TEXT_133);
    
		}
		primeiro = false;
		}
		
    stringBuffer.append(TEXT_134);
    
		Iterator<RelacionamentoWrapper> iterador3 = classe.obtemListaComChaveEstrangeira().iterator();
		while (iterador3.hasNext()) {
		RelacionamentoWrapper relac = iterador3.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		AtributoWrapper chaveOposta = classeOposta.getChaveW();
		
    stringBuffer.append(TEXT_135);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_136);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_137);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_138);
    
		}
		
    stringBuffer.append(TEXT_139);
    
		Iterator<RelacionamentoWrapper> iterador7 = classe.obtemListaComChaveEstrangeira().iterator();
		while (iterador7.hasNext()) {
		RelacionamentoWrapper relac = iterador7.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		AtributoWrapper chaveOposta = classeOposta.getChaveW();
		
    stringBuffer.append(TEXT_140);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_141);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_142);
    
		}
		
    stringBuffer.append(TEXT_143);
    
		Iterator<RelacionamentoWrapper> iterador4 = classe.obtemListaComChaveEstrangeira().iterator();
		while (iterador4.hasNext()) {
		RelacionamentoWrapper relac = iterador4.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		AtributoWrapper chaveOposta = classeOposta.getChaveW();
		
    stringBuffer.append(TEXT_144);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_145);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_146);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_147);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_148);
    
		}
		
    stringBuffer.append(TEXT_149);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_150);
    
		Iterator<RelacionamentoWrapper> iterador5 = classe.obtemListaComChaveEstrangeira().iterator();
		while (iterador5.hasNext()) {
		RelacionamentoWrapper relac = iterador5.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		AtributoWrapper chaveOposta = classeOposta.getChaveW();
		
    stringBuffer.append(TEXT_151);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_152);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_153);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_154);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_155);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_156);
    
		}
		
    stringBuffer.append(TEXT_157);
     if (!classe.isAssociativa()) { 
    stringBuffer.append(TEXT_158);
    
	Iterator<RelacionamentoWrapper> iteradorRel1 = classe.obtemListaComChaveEstrangeira().iterator();
	while (iteradorRel1.hasNext()) {
		RelacionamentoWrapper relCorrente1 = iteradorRel1.next();
	
    stringBuffer.append(TEXT_159);
    stringBuffer.append( relCorrente1.getNome() );
    stringBuffer.append(TEXT_160);
    stringBuffer.append( relCorrente1.getNomeCampoTabela() );
    stringBuffer.append(TEXT_161);
    stringBuffer.append( relCorrente1.getNome() );
    stringBuffer.append(TEXT_162);
    stringBuffer.append( relCorrente1.getNomeCampoTabela() );
    stringBuffer.append(TEXT_163);
    
	}
	} else { 
	
    stringBuffer.append(TEXT_164);
    
	Iterator<RelacionamentoWrapper> iteradorRel2 = classe.obtemListaComChaveEstrangeira().iterator();
	while (iteradorRel2.hasNext()) {
		RelacionamentoWrapper relCorrente2 = iteradorRel2.next();
		RelacionamentoWrapper relOutro = classe.outroRel(relCorrente2);
	
    stringBuffer.append(TEXT_165);
    stringBuffer.append( relCorrente2.getNome() );
    stringBuffer.append(TEXT_166);
    stringBuffer.append( relOutro.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_167);
    stringBuffer.append( relOutro.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_168);
    stringBuffer.append( relOutro.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_169);
    stringBuffer.append( relOutro.getClasseOposta().getChaveW().getNomeCampoTabela() );
    stringBuffer.append(TEXT_170);
    stringBuffer.append( relOutro.getNomeCampoTabela() );
    stringBuffer.append(TEXT_171);
    stringBuffer.append( relCorrente2.getNomeCampoTabela() );
    stringBuffer.append(TEXT_172);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_173);
    stringBuffer.append( relOutro.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_174);
    stringBuffer.append( relOutro.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_175);
    stringBuffer.append( relOutro.getNomeRelacionamento() );
    stringBuffer.append(TEXT_176);
    stringBuffer.append( relCorrente2.getNome() );
    stringBuffer.append(TEXT_177);
    stringBuffer.append( relCorrente2.getNomeCampoTabela() );
    stringBuffer.append(TEXT_178);
    
	}
	
    stringBuffer.append(TEXT_179);
    
	}
	
    stringBuffer.append(TEXT_180);
    
		String parametros = "";
		Iterator<RelacionamentoWrapper> itRel = classe.obtemListaComChaveEstrangeira().iterator();
		while (itRel.hasNext()) {
		RelacionamentoWrapper relac = itRel.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		if (parametros.length()>0) parametros += " , ";
		parametros += "long codigo" + classeOposta.getNomeParaClasse() + "_" + relac.getNomeRelacionamento() ;
		}
	
    stringBuffer.append(TEXT_181);
    stringBuffer.append( parametros );
    stringBuffer.append(TEXT_182);
    
		Iterator<RelacionamentoWrapper> itRel2 = classe.obtemListaComChaveEstrangeira().iterator();
		while (itRel2.hasNext()) {
		RelacionamentoWrapper relac = itRel2.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		
    stringBuffer.append(TEXT_183);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_184);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_185);
    stringBuffer.append( relac.getNomeCampoTabela() );
    stringBuffer.append(TEXT_186);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_187);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_188);
    
        }
        
    stringBuffer.append(TEXT_189);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_190);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_191);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_192);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_193);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_194);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_195);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_196);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_197);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_198);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_199);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_200);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_201);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_202);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_203);
    
	// *****  Somente associativas ********
	if (classe.isAssociativa()) {
	List<RelacionamentoWrapper> relac = classe.obtemListaComChaveEstrangeira();
	RelacionamentoWrapper rel1 = relac.get(0);
	RelacionamentoWrapper rel2 = relac.get(1);
	
    stringBuffer.append(TEXT_204);
    stringBuffer.append( rel1.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_205);
    stringBuffer.append( rel1.getNomeRelacionamento() );
    stringBuffer.append(TEXT_206);
    stringBuffer.append( rel2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_207);
    stringBuffer.append( rel1.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_208);
    stringBuffer.append( rel1.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_209);
    stringBuffer.append( rel1.getClasseOposta().getChaveW().getNomeCampoTabela() );
    stringBuffer.append(TEXT_210);
    stringBuffer.append( rel1.getNomeCampoTabela() );
    stringBuffer.append(TEXT_211);
    stringBuffer.append( rel2.getNomeCampoTabela() );
    stringBuffer.append(TEXT_212);
    stringBuffer.append( rel2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_213);
    stringBuffer.append( rel1.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_214);
    stringBuffer.append( rel2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_215);
    stringBuffer.append( rel2.getNomeRelacionamento() );
    stringBuffer.append(TEXT_216);
    stringBuffer.append( rel1.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_217);
    stringBuffer.append( rel2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_218);
    stringBuffer.append( rel2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_219);
    stringBuffer.append( rel2.getClasseOposta().getChaveW().getNomeCampoTabela() );
    stringBuffer.append(TEXT_220);
    stringBuffer.append( rel2.getNomeCampoTabela() );
    stringBuffer.append(TEXT_221);
    stringBuffer.append( rel1.getNomeCampoTabela() );
    stringBuffer.append(TEXT_222);
    stringBuffer.append( rel1.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_223);
    stringBuffer.append( rel2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_224);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_225);
    stringBuffer.append( rel1.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append( rel2.getNomeRelacionamento() );
    stringBuffer.append(TEXT_226);
    stringBuffer.append( rel2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append( rel1.getNomeRelacionamento() );
    stringBuffer.append(TEXT_227);
    stringBuffer.append( rel2.getNomeCampoTabela() );
    stringBuffer.append(TEXT_228);
    stringBuffer.append( rel1.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append( rel2.getNomeRelacionamento() );
    stringBuffer.append(TEXT_229);
    stringBuffer.append( rel1.getNomeCampoTabela() );
    stringBuffer.append(TEXT_230);
    stringBuffer.append( rel2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append( rel1.getNomeRelacionamento() );
    stringBuffer.append(TEXT_231);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_232);
    
	}
	
    stringBuffer.append(TEXT_233);
    	if(classe.ehUsuario()) { 
    stringBuffer.append(TEXT_234);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_235);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_236);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_237);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_238);
    	} 
    	if(classe.ehDispositivo()) { 
    stringBuffer.append(TEXT_239);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_240);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_241);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_242);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_243);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_244);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_245);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_246);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_247);
    	} 
    stringBuffer.append(TEXT_248);
    return stringBuffer.toString();
  }
}
