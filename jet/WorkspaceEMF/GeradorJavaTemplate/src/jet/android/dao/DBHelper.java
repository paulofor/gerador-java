package jet.android.dao;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class DBHelper
{
  protected static String nl;
  public static synchronized DBHelper create(String lineSeparator)
  {
    nl = lineSeparator;
    DBHelper result = new DBHelper();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".dao.base;" + NL + "" + NL + "" + NL + "import java.io.PrintWriter;" + NL + "import java.io.StringWriter;" + NL + "import java.util.ArrayList;" + NL + "import java.util.List;" + NL + "import br.com.digicom.Constants;" + NL + "import br.com.digicom.dao.DBHelperBase;" + NL + "import br.com.digicom.dao.MontadorDaoComposite;" + NL + "import br.com.digicom.dao.MontadorDaoI;" + NL + "import br.com.digicom.modelo.ObjetoSinc;" + NL + "import br.com.digicom.modelo.DCIObjetoDominio;" + NL + "import br.com.digicom.dao.DaoException;" + NL + "import br.com.digicom.log.DCLog;" + NL + "import br.com.digicom.dao.DaoSincronismo;" + NL + "import android.content.ContentValues;" + NL + "import android.content.Context;" + NL + "import android.database.Cursor;" + NL + "import android.database.SQLException;" + NL + "import android.database.sqlite.SQLiteDatabase;" + NL + "import android.database.sqlite.SQLiteOpenHelper;" + NL + "import android.database.sqlite.SQLiteCantOpenDatabaseException;" + NL + "import android.util.Log;" + NL + "import ";
  protected final String TEXT_3 = ".modelo.*;" + NL + "import ";
  protected final String TEXT_4 = ".modelo.vo.";
  protected final String TEXT_5 = "Vo;" + NL + "import ";
  protected final String TEXT_6 = ".modelo.vo.FabricaVo;" + NL + "import ";
  protected final String TEXT_7 = ".dao.*;" + NL + "import ";
  protected final String TEXT_8 = ".dao.montador.*;" + NL + "import ";
  protected final String TEXT_9 = ".dao.datasource.DataSourceAplicacao;" + NL + "import ";
  protected final String TEXT_10 = ".app.TrataErro;" + NL + "" + NL + "public abstract class ";
  protected final String TEXT_11 = "DBHelperBase extends DBHelperBase" + NL + "\timplements DaoSincronismo // coloquei aqui para evitar impacto de arquitetura" + NL + "{" + NL + "" + NL + "    private static final String DB_NAME = \"w_alert\";" + NL + "    public static final String DB_TABLE = \"";
  protected final String TEXT_12 = "\";" + NL + "    public static final String DB_TABLE_SINC = \"";
  protected final String TEXT_13 = "_sinc\";" + NL + "    public static final int DB_VERSION = 3;" + NL + "" + NL + "    protected static final String CLASSNAME = ";
  protected final String TEXT_14 = "DBHelperBase.class.getSimpleName();" + NL + "    protected static final String[] COLS = new String[] { ";
  protected final String TEXT_15 = NL + "        ";
  protected final String TEXT_16 = "\"";
  protected final String TEXT_17 = "\"";
  protected final String TEXT_18 = NL + "\t\t, \"";
  protected final String TEXT_19 = "\"" + NL + "\t";
  protected final String TEXT_20 = NL + "    };" + NL + "" + NL + "\t@Override" + NL + "\tpublic void erroException(Exception e, DBHelperBase dao) {" + NL + "\t\tTrataErro.getInstancia().setErro(e, dao);" + NL + "\t}" + NL + "" + NL + "\tprotected static final String[] COLS_SINC = new String[] { ";
  protected final String TEXT_21 = NL + "        ";
  protected final String TEXT_22 = "\"";
  protected final String TEXT_23 = "\"";
  protected final String TEXT_24 = NL + "\t\t, \"";
  protected final String TEXT_25 = "\"" + NL + "\t";
  protected final String TEXT_26 = "\t, \"operacao_sinc\"" + NL + "    };" + NL + "" + NL + "    protected SQLiteDatabase db;" + NL + "    protected final DBOpenHelper dbOpenHelper;" + NL + "" + NL + "\t@Override" + NL + "\tprotected MontadorDaoI criaMontadorPadrao() {" + NL + "\t\treturn new ";
  protected final String TEXT_27 = "Montador();" + NL + "\t}" + NL + "\t" + NL + "\tprotected String getSqlIndices() {" + NL + "\t\treturn \"\";" + NL + "\t}" + NL + "\tprotected String getSqlCreate(){" + NL + "\t\treturn  \"CREATE TABLE \"" + NL + "        + ";
  protected final String TEXT_28 = "DBHelperBase.DB_TABLE + \" (\"";
  protected final String TEXT_29 = NL + "        + \" ";
  protected final String TEXT_30 = " ";
  protected final String TEXT_31 = " ";
  protected final String TEXT_32 = " \"";
  protected final String TEXT_33 = NL + "\t\t+ \" , ";
  protected final String TEXT_34 = " INTEGER \"" + NL + "\t\t";
  protected final String TEXT_35 = NL + "\t\t+ getSqlIndices()" + NL + "        + \");\";" + NL + "\t}" + NL + "" + NL + "\t";
  protected final String TEXT_36 = NL + "\tpublic ";
  protected final String TEXT_37 = " getCorrente() {" + NL + "\t\tString sql = \" select \" + camposOrdenados() + \" from \" + DB_TABLE +" + NL + "\t\t\t\t\" limit 1\";" + NL + "\t\treturn (";
  protected final String TEXT_38 = ") this.geObjetoSql(sql);" + NL + "\t}" + NL + "\t";
  protected final String TEXT_39 = NL + NL + "\tpublic static final String DB_CREATE_SINCRONIZADA = \"CREATE TABLE IF NOT EXISTS \"" + NL + "        + ";
  protected final String TEXT_40 = "DBHelperBase.DB_TABLE_SINC + \" (\"";
  protected final String TEXT_41 = NL + "        + \" ";
  protected final String TEXT_42 = " ";
  protected final String TEXT_43 = " ";
  protected final String TEXT_44 = " \"";
  protected final String TEXT_45 = NL + "\t\t+ \" , ";
  protected final String TEXT_46 = " INTEGER \"" + NL + "\t\t";
  protected final String TEXT_47 = NL + "        + \", operacao_sinc TEXT);\";" + NL + "" + NL + "" + NL + "    public static final String DB_CREATE = \"CREATE TABLE IF NOT EXISTS \"" + NL + "        + ";
  protected final String TEXT_48 = "DBHelperBase.DB_TABLE + \" (\"";
  protected final String TEXT_49 = NL + "        + \" ";
  protected final String TEXT_50 = " ";
  protected final String TEXT_51 = " ";
  protected final String TEXT_52 = " \"";
  protected final String TEXT_53 = NL + "\t\t+ \" , ";
  protected final String TEXT_54 = " INTEGER \"" + NL + "\t\t";
  protected final String TEXT_55 = NL + "        + \");\";" + NL + "    " + NL + "    private static final String DB_DELETE_ALL = \"DELETE FROM \" + DB_TABLE;" + NL + "    private static final String DB_DROP = \"DROP TABLE IF EXISTS \" + DB_TABLE;" + NL + "    private static final String DB_DROP_SINCRONIZADA = \"DROP TABLE IF EXISTS \" + DB_TABLE_SINC;" + NL + "    " + NL + "    private static class DBOpenHelper extends SQLiteOpenHelper {" + NL + "" + NL + "       " + NL + "" + NL + "        public DBOpenHelper(final Context context) {" + NL + "            super(context, ";
  protected final String TEXT_56 = "DBHelperBase.DB_NAME, null, ";
  protected final String TEXT_57 = "DBHelperBase.DB_VERSION);" + NL + "        }" + NL + "" + NL + "        @Override" + NL + "        public void onCreate(final SQLiteDatabase db) {" + NL + "            try {" + NL + "                db.execSQL(DB_CREATE);" + NL + "            } catch (SQLException e) {" + NL + "                Log.e(Constants.LOGTAG, ";
  protected final String TEXT_58 = "DBHelperBase.CLASSNAME, e);" + NL + "            }" + NL + "        }" + NL + "" + NL + "        @Override" + NL + "        public void onOpen(final SQLiteDatabase db) {" + NL + "            super.onOpen(db);" + NL + "        }" + NL + "" + NL + "        @Override" + NL + "        public void onUpgrade(final SQLiteDatabase db, final int oldVersion, final int newVersion) {" + NL + "            db.execSQL(\"DROP TABLE IF EXISTS \" + ";
  protected final String TEXT_59 = "DBHelperBase.DB_TABLE);" + NL + "            onCreate(db);" + NL + "        }" + NL + "    }" + NL + "" + NL + "    //" + NL + "    // end inner classes" + NL + "    //" + NL + "    " + NL + "    // Versao Nova" + NL + " \tpublic ";
  protected final String TEXT_60 = "DBHelperBase() {" + NL + "    \tthis.dbOpenHelper = null;" + NL + "    \tsetDataSource(DataSourceAplicacao.getInstancia());" + NL + "    }" + NL + "    " + NL + "   " + NL + "\t" + NL + "\tprotected ContentValues montaValores(final DCIObjetoDominio valor) {" + NL + "\t\t";
  protected final String TEXT_61 = " item = (";
  protected final String TEXT_62 = ") valor;" + NL + "\t\tContentValues valores = new ContentValues();";
  protected final String TEXT_63 = NL + "\t \tputValorDataHora(valores,\"";
  protected final String TEXT_64 = "\",item.get";
  protected final String TEXT_65 = "());" + NL + "        \t\t";
  protected final String TEXT_66 = NL + "       \tputValorData(valores,\"";
  protected final String TEXT_67 = "\",item.get";
  protected final String TEXT_68 = "());" + NL + "        \t\t";
  protected final String TEXT_69 = NL + "       \tputValor(valores,\"";
  protected final String TEXT_70 = "\",item.get";
  protected final String TEXT_71 = "());" + NL + "       \t";
  protected final String TEXT_72 = NL + "        return valores;" + NL + "\t}" + NL + "" + NL + "" + NL + "    // **** Chamadas Diretas Objeto Banco de Dados" + NL + "    private void registraErroChamadaDireta(Exception e) {" + NL + "    \tLog.e(Constants.LOGTAG, ";
  protected final String TEXT_73 = "DBHelperBase.CLASSNAME, e);" + NL + "    }" + NL + "   " + NL + "    public final void insert(final ";
  protected final String TEXT_74 = " item) {" + NL + "\t    try {" + NL + "\t        getDb().insert(";
  protected final String TEXT_75 = "DBHelperBase.DB_TABLE, null, montaValores(item));" + NL + "\t    } catch (SQLiteCantOpenDatabaseException e) {" + NL + "\t    \tregistraErroChamadaDireta(e);" + NL + "\t    }" + NL + "    }" + NL + "    public final void update(final ";
  protected final String TEXT_76 = " item) {" + NL + "\t    try {" + NL + "\t        getDb().update(";
  protected final String TEXT_77 = "DBHelperBase.DB_TABLE, montaValores(item), \"";
  protected final String TEXT_78 = "=\" + item.get";
  protected final String TEXT_79 = "(), null);" + NL + "\t    } catch (SQLiteCantOpenDatabaseException e) {" + NL + "\t    \tregistraErroChamadaDireta(e);" + NL + "\t    }" + NL + "    }" + NL + "     // Nao pode ser final o parametro para retornar o objeto com seu Id" + NL + "    public final void insertSinc(";
  protected final String TEXT_80 = " item) {" + NL + "        try {" + NL + "        \titem.set";
  protected final String TEXT_81 = "((int)getMaxId() + 1);" + NL + "        \tDCLog.d(DCLog.DATABASE_ADM, this, \"insertSinc: \" + item.debug());" + NL + "\t        long id = getDb().insert(";
  protected final String TEXT_82 = "DBHelperBase.DB_TABLE, null, montaValores(item));" + NL + "    \t    ((ObjetoSinc)item).setOperacaoSinc(\"I\");" + NL + "        \tgetDb().insert(";
  protected final String TEXT_83 = "DBHelperBase.DB_TABLE_SINC, null, montaValoresSinc(item));" + NL + "\t    } catch (SQLiteCantOpenDatabaseException e) {" + NL + "\t    \tregistraErroChamadaDireta(e);" + NL + "\t    }" + NL + "    }" + NL + "     public final void updateSinc(final ";
  protected final String TEXT_84 = " item) {" + NL + "        try {" + NL + "\t        DCLog.d(DCLog.DATABASE_ADM, this, \"updateSinc: \" + item.debug());" + NL + "\t        getDb().update(";
  protected final String TEXT_85 = "DBHelperBase.DB_TABLE, montaValores(item), \"";
  protected final String TEXT_86 = "=\" + item.get";
  protected final String TEXT_87 = "(), null);" + NL + "\t        ((ObjetoSinc)item).setOperacaoSinc(\"A\");" + NL + "\t        ";
  protected final String TEXT_88 = " atual = this.getSincById(item.getId());" + NL + "\t        if (atual==null) {" + NL + "\t        \tgetDb().insert(";
  protected final String TEXT_89 = "DBHelperBase.DB_TABLE_SINC, null, montaValoresSinc(item));" + NL + "\t        } else {" + NL + "\t        \tif (\"I\".equals(((ObjetoSinc)atual).getOperacaoSinc()))" + NL + "\t        \t\t((ObjetoSinc)item).setOperacaoSinc(\"I\");" + NL + "\t        \tgetDb().update(";
  protected final String TEXT_90 = "DBHelperBase.DB_TABLE_SINC, montaValoresSinc(item), \"";
  protected final String TEXT_91 = "=\" + item.get";
  protected final String TEXT_92 = "(), null);" + NL + "\t        }" + NL + "\t    } catch (SQLiteCantOpenDatabaseException e) {" + NL + "\t    \tregistraErroChamadaDireta(e);" + NL + "\t    }" + NL + "    }" + NL + "    protected final void delete(final long id) {" + NL + "        try {" + NL + "\t\t\tgetDb().delete(";
  protected final String TEXT_93 = "DBHelperBase.DB_TABLE, \"";
  protected final String TEXT_94 = "=\" + id, null);" + NL + "\t    } catch (SQLiteCantOpenDatabaseException e) {" + NL + "\t    \tregistraErroChamadaDireta(e);" + NL + "\t    }" + NL + "    }" + NL + "    /*" + NL + "    private void deleteSinc(final long id) {" + NL + "        try {" + NL + "\t\t\tgetDb().delete(";
  protected final String TEXT_95 = "DBHelperBase.DB_TABLE_SINC, \"";
  protected final String TEXT_96 = "=\" + id, null);" + NL + "\t    } catch (SQLiteCantOpenDatabaseException e) {" + NL + "\t    \tregistraErroChamadaDireta(e);" + NL + "\t    }" + NL + "    }" + NL + "\t*/" + NL + "    public void limpaSinc(final ";
  protected final String TEXT_97 = " item) {" + NL + "    \ttry {" + NL + "\t\t\tgetDb().delete(";
  protected final String TEXT_98 = "DBHelperBase.DB_TABLE_SINC, \"";
  protected final String TEXT_99 = "=\" + item.getId(), null);" + NL + "\t    } catch (SQLiteCantOpenDatabaseException e) {" + NL + "\t    \tregistraErroChamadaDireta(e);" + NL + "\t    }" + NL + "    }" + NL + "    " + NL + "    public void deleteSinc(final ";
  protected final String TEXT_100 = " item) {" + NL + "    \ttry {" + NL + "\t        DCLog.dStack(DCLog.DATABASE_ADM, this, \"deleteSinc: \" + item.debug());" + NL + "\t        delete(item.getId());" + NL + "\t        ((ObjetoSinc)item).setOperacaoSinc(\"D\");" + NL + "        \tgetDb().insert(";
  protected final String TEXT_101 = "DBHelperBase.DB_TABLE_SINC, null, montaValoresSinc(item));" + NL + "\t    } catch (SQLiteCantOpenDatabaseException e) {" + NL + "\t    \tregistraErroChamadaDireta(e);" + NL + "\t    }" + NL + "    }" + NL + "   " + NL + "    " + NL + "\tpublic void criaTabelaSincronizacao() {" + NL + "\t    try {" + NL + "\t\t\tgetDb().execSQL(DB_CREATE_SINCRONIZADA);" + NL + "\t\t";
  protected final String TEXT_102 = NL + "\t\t\t// Dependente" + NL + "\t\t\t//getDb().execSQL(";
  protected final String TEXT_103 = "DBHelperBase.DB_CREATE_SINCRONIZADA);" + NL + "\t\t\t";
  protected final String TEXT_104 = NL + "\t\t\t// Dependente2" + NL + "\t\t\t//getDb().execSQL(";
  protected final String TEXT_105 = "DBHelperBase.DB_CREATE_SINCRONIZADA);" + NL + "\t\t\t";
  protected final String TEXT_106 = NL + "\t\t";
  protected final String TEXT_107 = NL + "\t    } catch (SQLiteCantOpenDatabaseException e) {" + NL + "\t    \tregistraErroChamadaDireta(e);" + NL + "\t    }" + NL + "\t}" + NL + "    public void criaTabela() {" + NL + "        try {" + NL + "\t        getDb().execSQL(DB_CREATE);" + NL + "\t    ";
  protected final String TEXT_108 = NL + "\t\t\t// Dependente" + NL + "\t\t\t//getDb().execSQL(";
  protected final String TEXT_109 = "DBHelperBase.DB_CREATE);" + NL + "\t\t\t";
  protected final String TEXT_110 = NL + "\t\t\t// Dependente2" + NL + "\t\t\t//getDb().execSQL(";
  protected final String TEXT_111 = "DBHelperBase.DB_CREATE);" + NL + "\t\t\t";
  protected final String TEXT_112 = NL + "\t\t";
  protected final String TEXT_113 = NL + "\t    } catch (SQLiteCantOpenDatabaseException e) {" + NL + "\t    \tregistraErroChamadaDireta(e);" + NL + "\t    }" + NL + "    }" + NL + "    public void deleteAll() {" + NL + "        try {" + NL + "\t        getDb().execSQL(DB_DELETE_ALL);" + NL + "\t    } catch (SQLiteCantOpenDatabaseException e) {" + NL + "\t    \tregistraErroChamadaDireta(e);" + NL + "\t    }" + NL + "    }" + NL + "    public void dropTable() {" + NL + "        try {" + NL + "\t        getDb().execSQL(DB_DROP);" + NL + "\t    } catch (SQLiteCantOpenDatabaseException e) {" + NL + "\t    \tregistraErroChamadaDireta(e);" + NL + "\t    }" + NL + "    }" + NL + "  " + NL + "    public void dropTableSincronizacao() {" + NL + "        try {" + NL + "        \tgetDb().execSQL(DB_DROP_SINCRONIZADA);" + NL + "\t    } catch (SQLiteCantOpenDatabaseException e) {" + NL + "\t    \tregistraErroChamadaDireta(e);" + NL + "\t    }" + NL + "     }" + NL + "" + NL + "\t// *** Chamadas Indireta ( via Digicom - Base )\t" + NL + "    public ";
  protected final String TEXT_114 = " getById(final long id) {" + NL + "    \tsetMontador(null); // A consulta anterior pode ter usado um MontadorDaoComposite" + NL + "    \treturn (";
  protected final String TEXT_115 = ") getItemQuery(true, ";
  protected final String TEXT_116 = "DBHelperBase.DB_TABLE, ";
  protected final String TEXT_117 = "DBHelperBase.COLS, \"";
  protected final String TEXT_118 = " = \" + id + \"\", null, null, null, null,null);" + NL + "    }" + NL + "    " + NL + "    // Esta com orderBy que pode ser bom para exibicoes em tela" + NL + "    // mas nao e bom para sincronizacao, pensar em ter um metodo para tela e outro para sinc." + NL + "    public List<";
  protected final String TEXT_119 = "> getAll() {" + NL + "    \tsetMontador(null); // A consulta anterior pode ter usado um MontadorDaoComposite" + NL + "    \treturn getListaQuery(DB_TABLE, COLS, null, null, null, null, null);" + NL + "    }" + NL + "    public List<";
  protected final String TEXT_120 = "> getAllTela() {" + NL + "    \tsetMontador(null); // A consulta anterior pode ter usado um MontadorDaoComposite" + NL + "    \treturn getListaQuery(DB_TABLE, COLS, null, null, null, null, orderByColuna());" + NL + "    }" + NL + "    " + NL + "    private ";
  protected final String TEXT_121 = " getByRowId(final long id) {" + NL + "    \tsetMontador(null); // A consulta anterior pode ter usado um MontadorDaoComposite" + NL + "    \treturn (";
  protected final String TEXT_122 = ") getItemQuery(true, ";
  protected final String TEXT_123 = "DBHelperBase.DB_TABLE, ";
  protected final String TEXT_124 = "DBHelperBase.COLS, \"ROWID = \" + id + \"\", null, null, null, null,null);" + NL + "    }" + NL + "    private ";
  protected final String TEXT_125 = " getSincById(final long id) {" + NL + "    \tsetMontador(null); // A consulta anterior pode ter usado um MontadorDaoComposite" + NL + "    \treturn (";
  protected final String TEXT_126 = ") getItemQuerySinc(true, ";
  protected final String TEXT_127 = "DBHelperBase.DB_TABLE_SINC, ";
  protected final String TEXT_128 = "DBHelperBase.COLS_SINC, \"";
  protected final String TEXT_129 = " = \" + id + \"\", null, null, null, null,null);" + NL + "    }" + NL + "    " + NL + "    " + NL + "    public long getMaxId() {" + NL + "\t\tString sql = \"select max(";
  protected final String TEXT_130 = ") from \" + DB_TABLE;" + NL + "\t\treturn this.getNumeroSql(sql);" + NL + "\t}" + NL + "\tprotected String orderByColuna() {" + NL + "    \treturn null;" + NL + "    }" + NL + "\t";
  protected final String TEXT_131 = NL + "\t";
  protected final String TEXT_132 = NL + "\tpublic List<";
  protected final String TEXT_133 = "> getPor";
  protected final String TEXT_134 = "(Context contexto, long id) throws DaoException{" + NL + "\t\treturn getListaQuery(DB_TABLE, COLS, \"";
  protected final String TEXT_135 = " = \" + id, null, null, null, orderByColuna());" + NL + "\t}" + NL + "\tpublic List<";
  protected final String TEXT_136 = "> getPor";
  protected final String TEXT_137 = "(long id) throws DaoException{" + NL + "\t\treturn getListaQuery(DB_TABLE, COLS, \"";
  protected final String TEXT_138 = " = \" + id, null, null, null, orderByColuna());" + NL + "\t}" + NL + "\t";
  protected final String TEXT_139 = NL + "\t// Classe e relacionamento" + NL + "\tpublic List<";
  protected final String TEXT_140 = "> getPor";
  protected final String TEXT_141 = "(Context contexto, long id) throws DaoException{" + NL + "\t\tString sql = \"select \" + camposOrdenados() + " + NL + "\t\t\t\t\" , \" + ";
  protected final String TEXT_142 = "DBHelperBase.camposOrdenados() +" + NL + "\t\t\t\t\" from \" + DB_TABLE + \" \" +" + NL + "\t\t\t\tthis.innerJoin";
  protected final String TEXT_143 = "_";
  protected final String TEXT_144 = "() +" + NL + "\t\t\t\t\" where ";
  protected final String TEXT_145 = " = \" + id;" + NL + "\t\tMontadorDaoComposite montador = new MontadorDaoComposite();" + NL + "\t\tmontador.adicionaMontador(new ";
  protected final String TEXT_146 = "Montador(), null);" + NL + "\t\tmontador.adicionaMontador(new ";
  protected final String TEXT_147 = "Montador(), \"";
  protected final String TEXT_148 = "_";
  protected final String TEXT_149 = "\");" + NL + "\t\tsetMontador(montador);" + NL + "\t\treturn this.getListaSqlListaInterna(sql);" + NL + "\t\t\t" + NL + "\t}" + NL + "\tpublic List<";
  protected final String TEXT_150 = "> getPor";
  protected final String TEXT_151 = "(long id) throws DaoException{" + NL + "\t\tString sql = \"select \" + camposOrdenados() + " + NL + "\t\t\t\t\" , \" + ";
  protected final String TEXT_152 = "DBHelperBase.camposOrdenados() +" + NL + "\t\t\t\t\" from \" + DB_TABLE + \" \" +" + NL + "\t\t\t\tthis.innerJoin";
  protected final String TEXT_153 = "_";
  protected final String TEXT_154 = "() +" + NL + "\t\t\t\t\" where ";
  protected final String TEXT_155 = " = \" + id;" + NL + "\t\tMontadorDaoComposite montador = new MontadorDaoComposite();" + NL + "\t\tmontador.adicionaMontador(new ";
  protected final String TEXT_156 = "Montador(), null);" + NL + "\t\tmontador.adicionaMontador(new ";
  protected final String TEXT_157 = "Montador(), \"";
  protected final String TEXT_158 = "_";
  protected final String TEXT_159 = "\");" + NL + "\t\tsetMontador(montador);" + NL + "\t\treturn this.getListaSqlListaInterna(sql);" + NL + "\t\t\t" + NL + "\t}" + NL + "\tpublic List<";
  protected final String TEXT_160 = "> get";
  protected final String TEXT_161 = "Por";
  protected final String TEXT_162 = "(Context contexto, long id) throws DaoException{" + NL + "\t\tString sql = \"select \" + ";
  protected final String TEXT_163 = "DBHelperBase.camposOrdenados() +" + NL + "\t\t\t\t\" from \" + DB_TABLE + \" \" +" + NL + "\t\t\t\tthis.innerJoin";
  protected final String TEXT_164 = "_";
  protected final String TEXT_165 = "() +" + NL + "\t\t\t\t\" where ";
  protected final String TEXT_166 = " = \" + id;" + NL + "\t\tsetMontador(new ";
  protected final String TEXT_167 = "Montador());" + NL + "\t\tList<";
  protected final String TEXT_168 = "> saida = this.getListaSql(sql);" + NL + "\t\tsetMontador(null);" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "\t";
  protected final String TEXT_169 = NL + "\t";
  protected final String TEXT_170 = NL + "  " + NL + "  \t";
  protected final String TEXT_171 = NL + "\tpublic ";
  protected final String TEXT_172 = " getPor";
  protected final String TEXT_173 = "(long idXXXX, long idYYYYY) {" + NL + "\t\treturn null;" + NL + "\t}" + NL + "\t";
  protected final String TEXT_174 = NL + "  " + NL + "  " + NL + "  \t";
  protected final String TEXT_175 = NL + "\t/*" + NL + "\tpublic ";
  protected final String TEXT_176 = " obtemPor";
  protected final String TEXT_177 = "(long id) {" + NL + "\t\tstring sql;" + NL + "\t\tsql = \"select \" + camposOrdenados() +" + NL + "\t\t\t\" from \" + tabelaSelect() +" + NL + "\t\t\tinnerJoin";
  protected final String TEXT_178 = "_";
  protected final String TEXT_179 = "() + " + NL + "\t\t\t\" where ";
  protected final String TEXT_180 = " = \" + id;" + NL + "\t\treturn (";
  protected final String TEXT_181 = ") getObjeto(sql);" + NL + "\t}" + NL + "\t*/" + NL + "\tpublic static String innerJoin";
  protected final String TEXT_182 = "_";
  protected final String TEXT_183 = "() {" + NL + "\t\treturn \" inner join \" + ";
  protected final String TEXT_184 = "DBHelperBase.DB_TABLE + \" on \" + ";
  protected final String TEXT_185 = "DBHelperBase.DB_TABLE + \".";
  protected final String TEXT_186 = " = \" + DB_TABLE + \".";
  protected final String TEXT_187 = " \";  " + NL + "\t}" + NL + "\tpublic static String innerJoinSinc";
  protected final String TEXT_188 = "_";
  protected final String TEXT_189 = "() {" + NL + "\t\treturn \" inner join \" + ";
  protected final String TEXT_190 = "DBHelperBase.DB_TABLE_SINC + \" on \" + ";
  protected final String TEXT_191 = "DBHelperBase.DB_TABLE_SINC + \".";
  protected final String TEXT_192 = " = \" + DB_TABLE_SINC + \".";
  protected final String TEXT_193 = " \";  " + NL + "\t}" + NL + "\tpublic static String outerJoin";
  protected final String TEXT_194 = "_";
  protected final String TEXT_195 = "() {" + NL + "\t\treturn \" left outer join \" + ";
  protected final String TEXT_196 = "DBHelperBase.DB_TABLE + \" on \" + ";
  protected final String TEXT_197 = "DBHelperBase.DB_TABLE + \".";
  protected final String TEXT_198 = " = \" + DB_TABLE + \".";
  protected final String TEXT_199 = " \";  " + NL + "\t}" + NL + "\tpublic static String outerJoinSinc";
  protected final String TEXT_200 = "_";
  protected final String TEXT_201 = "() {" + NL + "\t\treturn \" left outer join \" + ";
  protected final String TEXT_202 = "DBHelperBase.DB_TABLE_SINC + \" on \" + ";
  protected final String TEXT_203 = "DBHelperBase.DB_TABLE_SINC + \".";
  protected final String TEXT_204 = " = \" + DB_TABLE_SINC + \".";
  protected final String TEXT_205 = " \";  " + NL + "\t}" + NL + " \t";
  protected final String TEXT_206 = NL + "\t" + NL + "\t" + NL + "\t// Relacionamento onde esse objeto ? chave estrangeira de outro. ????" + NL + "\t";
  protected final String TEXT_207 = NL + "\tprivate boolean _obtem";
  protected final String TEXT_208 = "_";
  protected final String TEXT_209 = " = false;" + NL + "\tpublic void setObtem";
  protected final String TEXT_210 = "_";
  protected final String TEXT_211 = "() {" + NL + "\t\t_obtem";
  protected final String TEXT_212 = "_";
  protected final String TEXT_213 = " = true;" + NL + "\t}" + NL + "\tprotected String outterJoin";
  protected final String TEXT_214 = "_";
  protected final String TEXT_215 = "() {" + NL + "\t\treturn \" left outer join \" + ";
  protected final String TEXT_216 = "DBHelperBase.DB_TABLE + \" on \" + ";
  protected final String TEXT_217 = "DBHelperBase.DB_TABLE + \".";
  protected final String TEXT_218 = " = \" + DB_TABLE + \".";
  protected final String TEXT_219 = " \";  " + NL + "\t}" + NL + "\tpublic boolean atualiza";
  protected final String TEXT_220 = "(long ";
  protected final String TEXT_221 = ", long ";
  protected final String TEXT_222 = ") {" + NL + "\t\tString sql;" + NL + "      \tsql = \"update \" + DB_TABLE + " + NL + "      \t\" set ";
  protected final String TEXT_223 = "  = \" + ";
  protected final String TEXT_224 = " +" + NL + "        \" where ";
  protected final String TEXT_225 = " = \" +  ";
  protected final String TEXT_226 = ";" + NL + "       \t//this.executaSql(sql);" + NL + "       \treturn true;" + NL + "\t}" + NL + "\tpublic ";
  protected final String TEXT_227 = " obtemPorIds";
  protected final String TEXT_228 = "(long ";
  protected final String TEXT_229 = ", long ";
  protected final String TEXT_230 = ") {" + NL + "       \tString sql;" + NL + "\t\tsql = \"select \" + camposOrdenados() + \" from \" + DB_TABLE +" + NL + "\t\t\t  \"where \" +" + NL + "\t\t\t  \" ";
  protected final String TEXT_231 = " = \" + ";
  protected final String TEXT_232 = " + \" and \" +" + NL + "\t\t\t  \" ";
  protected final String TEXT_233 = " = \" + ";
  protected final String TEXT_234 = ";" + NL + "\t\treturn (";
  protected final String TEXT_235 = ") this.geObjetoSql(sql);" + NL + "\t}" + NL + "\t" + NL + "\t";
  protected final String TEXT_236 = NL + "\tpublic static String innerJoin";
  protected final String TEXT_237 = "_";
  protected final String TEXT_238 = "() {" + NL + "\t\treturn \" inner join \" + ";
  protected final String TEXT_239 = "DBHelperBase.DB_TABLE + \" on \" + ";
  protected final String TEXT_240 = "DBHelperBase.DB_TABLE + \".";
  protected final String TEXT_241 = " = \" + DB_TABLE + \".";
  protected final String TEXT_242 = " \";  " + NL + "\t}" + NL + "\tpublic static String outerJoin";
  protected final String TEXT_243 = "_";
  protected final String TEXT_244 = "() {" + NL + "\t\treturn \" left outer join \" + ";
  protected final String TEXT_245 = "DBHelperBase.DB_TABLE + \" on \" + ";
  protected final String TEXT_246 = "DBHelperBase.DB_TABLE + \".";
  protected final String TEXT_247 = " = \" + DB_TABLE + \".";
  protected final String TEXT_248 = " \";  " + NL + "\t}" + NL + "\tpublic static String innerJoinSinc";
  protected final String TEXT_249 = "_";
  protected final String TEXT_250 = "() {" + NL + "\t\treturn \" inner join \" + ";
  protected final String TEXT_251 = "DBHelperBase.DB_TABLE_SINC + \" on \" + ";
  protected final String TEXT_252 = "DBHelperBase.DB_TABLE_SINC + \".";
  protected final String TEXT_253 = " = \" + DB_TABLE_SINC + \".";
  protected final String TEXT_254 = " \";  " + NL + "\t}" + NL + "\tpublic static String outerJoinSinc";
  protected final String TEXT_255 = "_";
  protected final String TEXT_256 = "() {" + NL + "\t\treturn \" left outer join \" + ";
  protected final String TEXT_257 = "DBHelperBase.DB_TABLE_SINC + \" on \" + ";
  protected final String TEXT_258 = "DBHelperBase.DB_TABLE_SINC + \".";
  protected final String TEXT_259 = " = \" + DB_TABLE_SINC + \".";
  protected final String TEXT_260 = " \";  " + NL + "\t}" + NL + "\t";
  protected final String TEXT_261 = NL + " \t";
  protected final String TEXT_262 = NL + "\t// ********************************************************************\t" + NL + "\t" + NL + "\t" + NL + "\tpublic static String camposOrdenados() " + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_263 = "\" ";
  protected final String TEXT_264 = " \" " + NL + "\t\t";
  protected final String TEXT_265 = "+ \" ,";
  protected final String TEXT_266 = " \" " + NL + "\t\t";
  protected final String TEXT_267 = ";" + NL + "\t}" + NL + "\tpublic static String camposOrdenadosSinc() " + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_268 = "\" ";
  protected final String TEXT_269 = " \" " + NL + "\t\t";
  protected final String TEXT_270 = "+ \" ,";
  protected final String TEXT_271 = " \" " + NL + "\t\t";
  protected final String TEXT_272 = NL + "\t\t+ \" ,";
  protected final String TEXT_273 = "_sinc.operacao_sinc \"" + NL + "\t\t;" + NL + "\t}" + NL + "\tpublic static String camposOrdenadosAlias(String nomeTabela) " + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_274 = " ";
  protected final String TEXT_275 = " \" " + NL + "\t\t";
  protected final String TEXT_276 = "+ \" , \" + ";
  protected final String TEXT_277 = " \" " + NL + "\t\t";
  protected final String TEXT_278 = ";" + NL + "\t}" + NL + "\t" + NL + "\tprotected String camposOrdenadosJoin()" + NL + "    {" + NL + "        String saida = camposOrdenados();";
  protected final String TEXT_279 = NL + "\t\tsaida += (this._obtem";
  protected final String TEXT_280 = "_";
  protected final String TEXT_281 = "?\" , \" +";
  protected final String TEXT_282 = "DBHelperBase.camposOrdenados():\"\");";
  protected final String TEXT_283 = NL + "        return saida;" + NL + "    }" + NL + "    " + NL + "        " + NL + "    public void limpaObtem()" + NL + "    {";
  protected final String TEXT_284 = NL + "\t\t_obtem";
  protected final String TEXT_285 = "_";
  protected final String TEXT_286 = " = false;";
  protected final String TEXT_287 = NL + "    }" + NL + "    " + NL + "\tprotected String outterJoinAgrupado()" + NL + "    {" + NL + "        String saida = \" \";";
  protected final String TEXT_288 = NL + "\t\tsaida += (this._obtem";
  protected final String TEXT_289 = "_";
  protected final String TEXT_290 = "? outterJoin";
  protected final String TEXT_291 = "_";
  protected final String TEXT_292 = "() + \" \":\"\");";
  protected final String TEXT_293 = NL + "        return saida;" + NL + "    }" + NL + "    protected MontadorDaoI getMontadorAgrupado()" + NL + "    {" + NL + "        MontadorDaoComposite montador = new MontadorDaoComposite();" + NL + "        montador.adicionaMontador(new ";
  protected final String TEXT_294 = "Montador(), null);";
  protected final String TEXT_295 = NL + "\t\tif (this._obtem";
  protected final String TEXT_296 = "_";
  protected final String TEXT_297 = ")" + NL + "            montador.adicionaMontador(new ";
  protected final String TEXT_298 = "Montador(), \"";
  protected final String TEXT_299 = "_";
  protected final String TEXT_300 = "\");";
  protected final String TEXT_301 = NL + "         return montador;" + NL + "    }" + NL + "\t" + NL + "    " + NL + "   \t// Poderia passar para classe abstrata." + NL + "    public final List<";
  protected final String TEXT_302 = "> getAllSinc() throws DaoException {" + NL + "    \tthis.setMontador(null);" + NL + "    \tList<";
  protected final String TEXT_303 = "> saida = null;" + NL + "    \ttry {" + NL + "    \t\tsaida = this.getAllSincImpl();" + NL + "    \t} catch (SQLException e) {" + NL + "    \t\tif (e.getMessage().indexOf(\"\")!=-1) {" + NL + "    \t\t\tsaida = new ArrayList<";
  protected final String TEXT_304 = ">();" + NL + "    \t\t}" + NL + "    \t\t//N?o pode colocar o ErroException porque pode n?o existir tabela. " + NL + "    \t\t//a nao ser que seja o primeiro a ser atualizado. Mas aqui n?o se trata de um erro." + NL + "    \t\tDCLog.e(DCLog.DATABASE_ERRO, this, e);" + NL + "    \t\tthis.criaTabelaSincronizacao();" + NL + "    \t\tDCLog.d(DCLog.SINCRONIZACAO_DAO, this, \"Criando tabela\" + e.getMessage());" + NL + "    \t}" + NL + "    \tif (saida==null) {" + NL + "    \t\tsaida = getListaQuerySinc(DB_TABLE_SINC, COLS_SINC, null, null, null, null, null);" + NL + "    \t\tDCLog.d(DCLog.SINCRONIZACAO_DAO, this, \"getListaQuerySinc() -> \" + saida.size() + \" elementos.\");" + NL + "    \t} else {" + NL + "    \t\tDCLog.d(DCLog.SINCRONIZACAO_DAO, this, \"getAllSincImpl() -> \" + saida.size() + \" elementos.\");" + NL + "    \t}" + NL + "    \treturn saida;" + NL + "\t}" + NL + "\t" + NL + "\t// Poderia passar para classe abstrata." + NL + "    public final List<";
  protected final String TEXT_305 = "> getAllSincSoAlteracao() throws DaoException {" + NL + "    \tList<";
  protected final String TEXT_306 = "> saida = null;" + NL + "    \ttry {" + NL + "    \t\tsaida = this.getAllSincImpl();" + NL + "    \t\tsaida = null; // Melhorar aqui !!!!" + NL + "    \t} catch (SQLException e) {" + NL + "    \t\tif (e.getMessage().indexOf(\"\")!=-1) {" + NL + "    \t\t\tsaida = new ArrayList<";
  protected final String TEXT_307 = ">();" + NL + "    \t\t}" + NL + "    \t\tDCLog.e(DCLog.DATABASE_ERRO, this, e);" + NL + "    \t\tTrataErro.getInstancia().setErro(e, this);" + NL + "    \t\tthis.criaTabelaSincronizacao(); // Faltando dependentes." + NL + "    \t\tDCLog.d(DCLog.SINCRONIZACAO_DAO, this, \"Criando tabela ( falta dependentes ) \" + e.getMessage());" + NL + "    \t}" + NL + "    \tif (saida==null) {" + NL + "    \t\tsaida = getListaQuerySinc(DB_TABLE_SINC, COLS_SINC, \"operacao_sinc='A'\", null, null, null, null);" + NL + "    \t\tDCLog.d(DCLog.SINCRONIZACAO_DAO, this, \"getListaQuerySinc() -> \" + saida.size() + \" elementos.\");" + NL + "    \t} else {" + NL + "    \t\tDCLog.d(DCLog.SINCRONIZACAO_DAO, this, \"getAllSincImpl() -> \" + saida.size() + \" elementos.\");" + NL + "    \t}" + NL + "    \treturn saida;" + NL + "\t}" + NL + "\t" + NL + "\tpublic final List<";
  protected final String TEXT_308 = "> getAllSincImpl() throws DaoException {" + NL + "   \t\tString sql = \"select \" + camposOrdenadosSinc()   " + NL + "   \t\t\t+ \" from \" + this.DB_TABLE_SINC;" + NL + "   \t\t";
  protected final String TEXT_309 = "Montador montador = new ";
  protected final String TEXT_310 = "Montador(true); // sinc ligado" + NL + "   \t\tthis.setMontador(montador);" + NL + "   \t\tList<";
  protected final String TEXT_311 = "> saida = this.getListaSql(sql);" + NL + "   \t\treturn saida;" + NL + "   \t}" + NL + "   \t" + NL + "\tpublic long getQtdeSinc() {" + NL + "\t\tString sql = \"select count(*) from \" + DB_TABLE_SINC;" + NL + "\t\treturn this.getNumeroSql(sql);" + NL + "\t}" + NL + "\tpublic boolean tabelaSincVazia() {" + NL + "\t\treturn (this.getQtdeSinc() == 0);" + NL + "\t}" + NL + "\t" + NL + "\t// DaoSincronizacao" + NL + "\t@Override" + NL + "\tpublic final void insere(DCIObjetoDominio obj) {" + NL + "\t\tthis.insert((";
  protected final String TEXT_312 = ") obj);" + NL + "\t}" + NL + "\t@Override" + NL + "\tpublic final void dropCreate() {" + NL + "\t\tthis.dropTable();" + NL + "\t\tthis.criaTabela();" + NL + "\t}" + NL + "}";
  protected final String TEXT_313 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    
	AtributoWrapper atributoW = new AtributoWrapperAndroid();
	AtributoWrapper chaveW = new AtributoWrapperAndroid();
	chaveW.setBase(classe.getChave());
	

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
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( classe.getNomeParaTabela() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( classe.getNomeParaTabela() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_14);
     
    Iterator<AtributoEntidade> iterador = classe.getListaAtributoEntidade().iterator(); 
    String virgula = "";
    while (iterador.hasNext()) {
     	atributoW.setBase(iterador.next());
    
    stringBuffer.append(TEXT_15);
    stringBuffer.append( virgula );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( atributoW.getNomeCampoTabela() );
    stringBuffer.append(TEXT_17);
    
    	if (virgula.equals("")) virgula = ",";
    }
    
    
	Iterator<RelacionamentoWrapper> iteradorRel1 = classe.obtemListaComChaveEstrangeiraComUsuario().iterator();
	while (iteradorRel1.hasNext()) {
		RelacionamentoWrapper relCorrente = iteradorRel1.next();
	
    stringBuffer.append(TEXT_18);
    stringBuffer.append( relCorrente.getNomeCampoTabela() );
    stringBuffer.append(TEXT_19);
    
	}
	
    stringBuffer.append(TEXT_20);
     
    iterador = classe.getListaAtributoEntidade().iterator(); 
    virgula = "";
    while (iterador.hasNext()) {
     	atributoW.setBase(iterador.next());
    
    stringBuffer.append(TEXT_21);
    stringBuffer.append( virgula );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( atributoW.getNomeCampoTabela() );
    stringBuffer.append(TEXT_23);
    
    	if (virgula.equals("")) virgula = ",";
    }
    
    
	iteradorRel1 = classe.obtemListaComChaveEstrangeiraComUsuario().iterator();
	while (iteradorRel1.hasNext()) {
		RelacionamentoWrapper relCorrente = iteradorRel1.next();
	
    stringBuffer.append(TEXT_24);
    stringBuffer.append( relCorrente.getNomeCampoTabela() );
    stringBuffer.append(TEXT_25);
    
	}
	
    stringBuffer.append(TEXT_26);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_28);
     
        iterador = classe.getListaAtributoEntidade().iterator(); 
        virgula = "";
        while (iterador.hasNext()) {
        	atributoW.setBase(iterador.next());
        
    stringBuffer.append(TEXT_29);
    stringBuffer.append( virgula );
    stringBuffer.append(TEXT_30);
    stringBuffer.append( atributoW.getNomeCampoTabela() );
    stringBuffer.append(TEXT_31);
    stringBuffer.append( atributoW.getTipoSqlite() );
    stringBuffer.append(TEXT_32);
    
        	if (virgula.length()==0) virgula = ",";
        }
        
    
		iteradorRel1 = classe.obtemListaComChaveEstrangeiraComUsuario().iterator();
		while (iteradorRel1.hasNext()) {
			RelacionamentoWrapper relCorrente = iteradorRel1.next();
		
    stringBuffer.append(TEXT_33);
    stringBuffer.append( relCorrente.getNomeCampoTabela() );
    stringBuffer.append(TEXT_34);
    
		}
		
    stringBuffer.append(TEXT_35);
     if (classe.ehUsuario() || classe.ehDispositivo()) { 
    stringBuffer.append(TEXT_36);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_37);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_38);
     } 
    stringBuffer.append(TEXT_39);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_40);
     
        iterador = classe.getListaAtributoEntidade().iterator(); 
        virgula = "";
        while (iterador.hasNext()) {
        	atributoW.setBase(iterador.next());
        
    stringBuffer.append(TEXT_41);
    stringBuffer.append( virgula );
    stringBuffer.append(TEXT_42);
    stringBuffer.append( atributoW.getNomeCampoTabela() );
    stringBuffer.append(TEXT_43);
    stringBuffer.append( atributoW.getTipoSqliteSinc() );
    stringBuffer.append(TEXT_44);
    
        	if (virgula.length()==0) virgula = ",";
        }
        
    
		iteradorRel1 = classe.obtemListaComChaveEstrangeiraComUsuario().iterator();
		while (iteradorRel1.hasNext()) {
			RelacionamentoWrapper relCorrente = iteradorRel1.next();
		
    stringBuffer.append(TEXT_45);
    stringBuffer.append( relCorrente.getNomeCampoTabela() );
    stringBuffer.append(TEXT_46);
    
		}
		
    stringBuffer.append(TEXT_47);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_48);
     
        iterador = classe.getListaAtributoEntidadeSemChave().iterator(); 
        virgula = "";
        while (iterador.hasNext()) {
        	atributoW.setBase(iterador.next());
        
    stringBuffer.append(TEXT_49);
    stringBuffer.append( virgula );
    stringBuffer.append(TEXT_50);
    stringBuffer.append( atributoW.getNomeCampoTabela() );
    stringBuffer.append(TEXT_51);
    stringBuffer.append( atributoW.getTipoSqlite() );
    stringBuffer.append(TEXT_52);
    
        	if (virgula.length()==0) virgula = ",";
        }
        
    
		iteradorRel1 = classe.obtemListaComChaveEstrangeiraComUsuario().iterator();
		while (iteradorRel1.hasNext()) {
			RelacionamentoWrapper relCorrente = iteradorRel1.next();
		
    stringBuffer.append(TEXT_53);
    stringBuffer.append( relCorrente.getNomeCampoTabela() );
    stringBuffer.append(TEXT_54);
    
		}
		
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
     
        Iterator<AtributoTotalI> iteradorTotal = classe.getListaAtributoTotal().iterator(); 
        while (iteradorTotal.hasNext()) {
	        AtributoTotalI atributo = iteradorTotal.next();
	        if (atributo.ehData()) {  
	        	if (atributo.ehHora()) {  
    stringBuffer.append(TEXT_63);
    stringBuffer.append( atributo.getNomeCampoTabela() );
    stringBuffer.append(TEXT_64);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_65);
     } else { 
    stringBuffer.append(TEXT_66);
    stringBuffer.append( atributo.getNomeCampoTabela() );
    stringBuffer.append(TEXT_67);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_68);
     }  
        	} else { 
    stringBuffer.append(TEXT_69);
    stringBuffer.append( atributo.getNomeCampoTabela() );
    stringBuffer.append(TEXT_70);
    stringBuffer.append( atributo.getNomePropriedade() );
    stringBuffer.append(TEXT_71);
     } 
        }
        
    stringBuffer.append(TEXT_72);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_73);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_74);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_75);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_76);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_77);
    stringBuffer.append( chaveW.getNomeCampoTabela() );
    stringBuffer.append(TEXT_78);
    stringBuffer.append( chaveW.getNomePropriedade() );
    stringBuffer.append(TEXT_79);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_80);
    stringBuffer.append( classe.getChaveW().getNomePropriedade() );
    stringBuffer.append(TEXT_81);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_82);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_83);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_84);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_85);
    stringBuffer.append( classe.getChaveW().getNomeCampoTabela() );
    stringBuffer.append(TEXT_86);
    stringBuffer.append( classe.getChaveW().getNomePropriedade() );
    stringBuffer.append(TEXT_87);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_88);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_89);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_90);
    stringBuffer.append( classe.getChaveW().getNomeCampoTabela() );
    stringBuffer.append(TEXT_91);
    stringBuffer.append( classe.getChaveW().getNomePropriedade() );
    stringBuffer.append(TEXT_92);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_93);
    stringBuffer.append( chaveW.getNomeCampoTabela() );
    stringBuffer.append(TEXT_94);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_95);
    stringBuffer.append( chaveW.getNomeCampoTabela() );
    stringBuffer.append(TEXT_96);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_97);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_98);
    stringBuffer.append( chaveW.getNomeCampoTabela() );
    stringBuffer.append(TEXT_99);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_100);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_101);
    
		RelacionamentoWrapper relacDep = classe.getUnicoDependenteLista();
		if (relacDep!=null) {
		
    stringBuffer.append(TEXT_102);
    stringBuffer.append( relacDep.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_103);
     
			RelacionamentoWrapper relac2 = relacDep.getClasseOposta().getUnicoDependenteLista();
			if (relac2!=null) {
			
    stringBuffer.append(TEXT_104);
    stringBuffer.append( relac2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_105);
    
			}
			
    stringBuffer.append(TEXT_106);
    
		}
		
    stringBuffer.append(TEXT_107);
    
		relacDep = classe.getUnicoDependenteLista();
		if (relacDep!=null) {
		
    stringBuffer.append(TEXT_108);
    stringBuffer.append( relacDep.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_109);
     
			RelacionamentoWrapper relac2 = relacDep.getClasseOposta().getUnicoDependenteLista();
			if (relac2!=null) {
			
    stringBuffer.append(TEXT_110);
    stringBuffer.append( relac2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_111);
    
			}
			
    stringBuffer.append(TEXT_112);
    
		}
		
    stringBuffer.append(TEXT_113);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_114);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_115);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_116);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_117);
    stringBuffer.append( chaveW.getNomeCampoTabela() );
    stringBuffer.append(TEXT_118);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_119);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_120);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_121);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_122);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_123);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_124);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_125);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_126);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_127);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_128);
    stringBuffer.append( chaveW.getNomeCampoTabela() );
    stringBuffer.append(TEXT_129);
    stringBuffer.append( classe.getChaveW().getNomeCampoTabela() );
    stringBuffer.append(TEXT_130);
    
	Iterator<RelacionamentoWrapper> iteradorRel = classe.obtemListaComChaveEstrangeira().iterator();
	while (iteradorRel.hasNext()) {
		RelacionamentoWrapper relCorrente = iteradorRel.next();
		
	
    stringBuffer.append(TEXT_131);
    
	if (!classe.isAssociativa()) {
	
    stringBuffer.append(TEXT_132);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_133);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_134);
    stringBuffer.append( relCorrente.getNomeCampoTabela() );
    stringBuffer.append(TEXT_135);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_136);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_137);
    stringBuffer.append( relCorrente.getNomeCampoTabela() );
    stringBuffer.append(TEXT_138);
     } else { 
		RelacionamentoWrapper relOutro = classe.outroRel(relCorrente);
	
    stringBuffer.append(TEXT_139);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_140);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_141);
    stringBuffer.append( relOutro.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_142);
    stringBuffer.append( relOutro.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_143);
    stringBuffer.append( relOutro.getNomeRelacionamento() );
    stringBuffer.append(TEXT_144);
    stringBuffer.append( relCorrente.getNomeCampoTabela() );
    stringBuffer.append(TEXT_145);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_146);
    stringBuffer.append( relOutro.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_147);
    stringBuffer.append( relOutro.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_148);
    stringBuffer.append( relOutro.getNomeRelacionamento() );
    stringBuffer.append(TEXT_149);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_150);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_151);
    stringBuffer.append( relOutro.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_152);
    stringBuffer.append( relOutro.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_153);
    stringBuffer.append( relOutro.getNomeRelacionamento() );
    stringBuffer.append(TEXT_154);
    stringBuffer.append( relCorrente.getNomeCampoTabela() );
    stringBuffer.append(TEXT_155);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_156);
    stringBuffer.append( relOutro.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_157);
    stringBuffer.append( relOutro.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_158);
    stringBuffer.append( relOutro.getNomeRelacionamento() );
    stringBuffer.append(TEXT_159);
    stringBuffer.append( relOutro.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_160);
    stringBuffer.append( relOutro.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_161);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_162);
    stringBuffer.append( relOutro.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_163);
    stringBuffer.append( relOutro.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_164);
    stringBuffer.append( relOutro.getNomeRelacionamento() );
    stringBuffer.append(TEXT_165);
    stringBuffer.append( relCorrente.getNomeCampoTabela() );
    stringBuffer.append(TEXT_166);
    stringBuffer.append( relOutro.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_167);
    stringBuffer.append( relOutro.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_168);
     } 
    stringBuffer.append(TEXT_169);
    
	}
	
    stringBuffer.append(TEXT_170);
    
	if (classe.isAssociativa()) {
	List<RelacionamentoWrapper> rels = classe.obtemListaComChaveEstrangeira();
	RelacionamentoWrapper rel1 = rels.get(0);
	RelacionamentoWrapper rel2 = rels.get(1);
	
    stringBuffer.append(TEXT_171);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_172);
    stringBuffer.append( rel1.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append( rel2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_173);
    
	}
	
    stringBuffer.append(TEXT_174);
    
	Iterator<RelacionamentoWrapper> itSemChave = classe.obtemListaSemChaveEstrangeira().iterator();
	while (itSemChave.hasNext()) {
	RelacionamentoWrapper relac = itSemChave.next();
	ClasseWrapper classeOposta = relac.getClasseOposta();
	AtributoWrapper chaveOposta = classeOposta.getChaveW();
	
    stringBuffer.append(TEXT_175);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_176);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_177);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_178);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_179);
    stringBuffer.append( classeOposta.getChaveW().getNomeCampoTabela() );
    stringBuffer.append(TEXT_180);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_181);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_182);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_183);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_184);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_185);
    stringBuffer.append( relac.getNomeCampoTabelaEntidadeOposta() );
    stringBuffer.append(TEXT_186);
    stringBuffer.append( classe.getChaveW().getNomeCampoTabela() );
    stringBuffer.append(TEXT_187);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_188);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_189);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_190);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_191);
    stringBuffer.append( relac.getNomeCampoTabelaEntidadeOposta() );
    stringBuffer.append(TEXT_192);
    stringBuffer.append( classe.getChaveW().getNomeCampoTabela() );
    stringBuffer.append(TEXT_193);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_194);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_195);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_196);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_197);
    stringBuffer.append( relac.getNomeCampoTabelaEntidadeOposta() );
    stringBuffer.append(TEXT_198);
    stringBuffer.append( classe.getChaveW().getNomeCampoTabela() );
    stringBuffer.append(TEXT_199);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_200);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_201);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_202);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_203);
    stringBuffer.append( relac.getNomeCampoTabelaEntidadeOposta() );
    stringBuffer.append(TEXT_204);
    stringBuffer.append( classe.getChaveW().getNomeCampoTabela() );
    stringBuffer.append(TEXT_205);
    
		}
	
    stringBuffer.append(TEXT_206);
    
	Iterator<RelacionamentoWrapper> iterador2 = classe.obtemListaComChaveEstrangeira().iterator();
	while (iterador2.hasNext()) {
	RelacionamentoWrapper relac = iterador2.next();
	ClasseWrapper classeOposta = relac.getClasseOposta();
	AtributoWrapper chaveOposta = classeOposta.getChaveW();
	
    stringBuffer.append(TEXT_207);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_208);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_209);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_210);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_211);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_212);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_213);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_214);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_215);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_216);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_217);
    stringBuffer.append( chaveOposta.getNomeCampoTabela() );
    stringBuffer.append(TEXT_218);
    stringBuffer.append( relac.getNomeCampoTabela() );
    stringBuffer.append(TEXT_219);
    stringBuffer.append( relac.getNome() );
    stringBuffer.append(TEXT_220);
    stringBuffer.append( classe.getChaveW().getNomeVariavel() );
    stringBuffer.append(TEXT_221);
    stringBuffer.append( relac.getNomeVariavel() );
    stringBuffer.append(TEXT_222);
    stringBuffer.append( relac.getNomeCampoTabela() );
    stringBuffer.append(TEXT_223);
    stringBuffer.append( relac.getNomeVariavel() );
    stringBuffer.append(TEXT_224);
    stringBuffer.append( classe.getChaveW().getNomeCampoTabela() );
    stringBuffer.append(TEXT_225);
    stringBuffer.append( classe.getChaveW().getNomeVariavel() );
    stringBuffer.append(TEXT_226);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_227);
    stringBuffer.append( relac.getNome() );
    stringBuffer.append(TEXT_228);
    stringBuffer.append( classe.getChaveW().getNomeVariavel() );
    stringBuffer.append(TEXT_229);
    stringBuffer.append( relac.getNomeVariavel() );
    stringBuffer.append(TEXT_230);
    stringBuffer.append( relac.getNomeCampoTabela() );
    stringBuffer.append(TEXT_231);
    stringBuffer.append( relac.getNomeVariavel() );
    stringBuffer.append(TEXT_232);
    stringBuffer.append( classe.getChaveW().getNomeCampoTabela() );
    stringBuffer.append(TEXT_233);
    stringBuffer.append( classe.getChaveW().getNomeVariavel() );
    stringBuffer.append(TEXT_234);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_235);
     if (!relac.ehAuto()) { 
    stringBuffer.append(TEXT_236);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_237);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_238);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_239);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_240);
    stringBuffer.append( chaveOposta.getNomeCampoTabela() );
    stringBuffer.append(TEXT_241);
    stringBuffer.append( relac.getNomeCampoTabela() );
    stringBuffer.append(TEXT_242);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_243);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_244);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_245);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_246);
    stringBuffer.append( chaveOposta.getNomeCampoTabela() );
    stringBuffer.append(TEXT_247);
    stringBuffer.append( relac.getNomeCampoTabela() );
    stringBuffer.append(TEXT_248);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_249);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_250);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_251);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_252);
    stringBuffer.append( chaveOposta.getNomeCampoTabela() );
    stringBuffer.append(TEXT_253);
    stringBuffer.append( relac.getNomeCampoTabela() );
    stringBuffer.append(TEXT_254);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_255);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_256);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_257);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_258);
    stringBuffer.append( chaveOposta.getNomeCampoTabela() );
    stringBuffer.append(TEXT_259);
    stringBuffer.append( relac.getNomeCampoTabela() );
    stringBuffer.append(TEXT_260);
     } 
    stringBuffer.append(TEXT_261);
    
		}
	
    stringBuffer.append(TEXT_262);
    
		Iterator<AtributoTotalI> iterador10 = classe.getListaAtributoTotal().iterator();
		boolean primeiro = true;
		while (iterador10.hasNext()) {
		AtributoTotalI atributo = iterador10.next();
		String campo = classe.getNomeParaTabela() + "." + atributo.getNomeCampoTabela();
		if (primeiro) {
		
    stringBuffer.append(TEXT_263);
    stringBuffer.append( campo );
    stringBuffer.append(TEXT_264);
     } else { 
    stringBuffer.append(TEXT_265);
    stringBuffer.append( campo );
    stringBuffer.append(TEXT_266);
    
		}
		primeiro = false;
		}
		
    stringBuffer.append(TEXT_267);
    
		Iterator<AtributoTotalI> iterador11 = classe.getListaAtributoTotal().iterator();
		primeiro = true;
		while (iterador11.hasNext()) {
		AtributoTotalI atributo = iterador11.next();
		String campo = classe.getNomeParaTabela() + "_sinc." + atributo.getNomeCampoTabela();
		if (primeiro) {
		
    stringBuffer.append(TEXT_268);
    stringBuffer.append( campo );
    stringBuffer.append(TEXT_269);
     } else { 
    stringBuffer.append(TEXT_270);
    stringBuffer.append( campo );
    stringBuffer.append(TEXT_271);
    
		}
		primeiro = false;
		}
		
    stringBuffer.append(TEXT_272);
    stringBuffer.append( classe.getNomeParaTabela() );
    stringBuffer.append(TEXT_273);
    
		Iterator<AtributoTotalI> iteradorAtt = classe.getListaAtributoTotal().iterator();
		primeiro = true;
		while (iteradorAtt.hasNext()) {
		AtributoTotalI atributo = iteradorAtt.next();
		String campo = "nomeTabela + \"." + atributo.getNomeCampoTabela();
		if (atributo.getTipoOriginal().compareTo("Tempo")==0)
			campo = " \"DATE_FORMAT(\" + " + campo + ",'%H:%i')";
		if (atributo.getTipoOriginal().compareTo("Data")==0)
			campo = " \"DATE_FORMAT(\" + " + campo + ",'%d-%m-%Y')";
		if (atributo.getTipoOriginal().compareTo("DTemp")==0)
			campo = " \"DATE_FORMAT(\" + " + campo + ",'%d-%m-%Y %H:%i:%s')";
		if (primeiro) {
		
    stringBuffer.append(TEXT_274);
    stringBuffer.append( campo );
    stringBuffer.append(TEXT_275);
     } else { 
    stringBuffer.append(TEXT_276);
    stringBuffer.append( campo );
    stringBuffer.append(TEXT_277);
    
		}
		primeiro = false;
		}
		
    stringBuffer.append(TEXT_278);
    
		Iterator<RelacionamentoWrapper> iterador3 = classe.obtemListaComChaveEstrangeira().iterator();
		while (iterador3.hasNext()) {
		RelacionamentoWrapper relac = iterador3.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		AtributoWrapper chaveOposta = classeOposta.getChaveW();
		
    stringBuffer.append(TEXT_279);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_280);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_281);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_282);
    
		}
		
    stringBuffer.append(TEXT_283);
    
		Iterator<RelacionamentoWrapper> iterador7 = classe.obtemListaComChaveEstrangeira().iterator();
		while (iterador7.hasNext()) {
		RelacionamentoWrapper relac = iterador7.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		AtributoWrapper chaveOposta = classeOposta.getChaveW();
		
    stringBuffer.append(TEXT_284);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_285);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_286);
    
		}
		
    stringBuffer.append(TEXT_287);
    
		Iterator<RelacionamentoWrapper> iterador4 = classe.obtemListaComChaveEstrangeira().iterator();
		while (iterador4.hasNext()) {
		RelacionamentoWrapper relac = iterador4.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		AtributoWrapper chaveOposta = classeOposta.getChaveW();
		
    stringBuffer.append(TEXT_288);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_289);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_290);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_291);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_292);
    
		}
		
    stringBuffer.append(TEXT_293);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_294);
    
		Iterator<RelacionamentoWrapper> iterador5 = classe.obtemListaComChaveEstrangeira().iterator();
		while (iterador5.hasNext()) {
		RelacionamentoWrapper relac = iterador5.next();
		ClasseWrapper classeOposta = relac.getClasseOposta();
		AtributoWrapper chaveOposta = classeOposta.getChaveW();
		
    stringBuffer.append(TEXT_295);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_296);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_297);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_298);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_299);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_300);
    
		}
		
    stringBuffer.append(TEXT_301);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_302);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_303);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_304);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_305);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_306);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_307);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_308);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_309);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_310);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_311);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_312);
    stringBuffer.append(TEXT_313);
    return stringBuffer.toString();
  }
}
