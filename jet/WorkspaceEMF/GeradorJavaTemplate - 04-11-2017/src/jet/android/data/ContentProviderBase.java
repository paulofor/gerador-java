package jet.android.data;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class ContentProviderBase
{
  protected static String nl;
  public static synchronized ContentProviderBase create(String lineSeparator)
  {
    nl = lineSeparator;
    ContentProviderBase result = new ContentProviderBase();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package  ";
  protected final String TEXT_3 = ".data.provider;" + NL + "" + NL + "" + NL + "import ";
  protected final String TEXT_4 = ".data.contract.*;" + NL + "import ";
  protected final String TEXT_5 = ".data.helper.AplicacaoDbHelper;" + NL + "import android.content.ContentValues;" + NL + "import android.content.UriMatcher;" + NL + "import android.database.Cursor;" + NL + "import android.database.sqlite.SQLiteDatabase;" + NL + "import android.database.sqlite.SQLiteQueryBuilder;" + NL + "import android.database.SQLException;" + NL + "import android.database.DatabaseUtils;" + NL + "import android.net.Uri;" + NL + "import ";
  protected final String TEXT_6 = ".framework.log.DCLog;" + NL + "import java.util.List;" + NL + "import android.content.ContentProvider;" + NL + "" + NL + "public abstract class ";
  protected final String TEXT_7 = "Provider {" + NL + "" + NL + "\tprivate int qtdeLinhas = 0;" + NL + "\t" + NL + "\tpublic static final int ";
  protected final String TEXT_8 = " = ";
  protected final String TEXT_9 = "00;" + NL + "\tpublic static final int ";
  protected final String TEXT_10 = "_ID = ";
  protected final String TEXT_11 = "01;" + NL + "\tpublic static final int ";
  protected final String TEXT_12 = "_SINC = ";
  protected final String TEXT_13 = "03;" + NL + "\tpublic static final int ";
  protected final String TEXT_14 = "_E_COMPLEMENTO = ";
  protected final String TEXT_15 = "04;" + NL + "\tpublic static final int ";
  protected final String TEXT_16 = "_ID_E_COMPLEMENTO = ";
  protected final String TEXT_17 = "05;" + NL + "\t//public static final int ";
  protected final String TEXT_18 = "_OPERACAO = ";
  protected final String TEXT_19 = "02;" + NL + "\t" + NL + "\t// deletes" + NL + "\tpublic static final int ";
  protected final String TEXT_20 = "_DELETE_ALL_SINC = ";
  protected final String TEXT_21 = "06;" + NL + "\tpublic static final int ";
  protected final String TEXT_22 = "_DELETE_RECREATE = ";
  protected final String TEXT_23 = "07;" + NL + "\tpublic static final int ";
  protected final String TEXT_24 = "_DELETE_SINC = ";
  protected final String TEXT_25 = "08;" + NL + "\tpublic static final int ";
  protected final String TEXT_26 = "_E_RETIRADA = ";
  protected final String TEXT_27 = "09;" + NL + "\t" + NL + "\tprivate static final String sPorChaveSel = ";
  protected final String TEXT_28 = "Contract.TABLE_NAME + \".\" + ";
  protected final String TEXT_29 = "Contract.COLUNA_CHAVE + \" = ? \";" + NL + "\t" + NL + "\t";
  protected final String TEXT_30 = NL + "\t";
  protected final String TEXT_31 = NL + "\tpublic static final int ";
  protected final String TEXT_32 = " = ";
  protected final String TEXT_33 = ";" + NL + "\tpublic static final int COM_";
  protected final String TEXT_34 = " = ";
  protected final String TEXT_35 = ";" + NL + "\tprivate static final String sPor";
  protected final String TEXT_36 = "Selecao =";
  protected final String TEXT_37 = NL + "            ";
  protected final String TEXT_38 = "Contract.TABLE_NAME + \".";
  protected final String TEXT_39 = " = ? \";" + NL + "\t";
  protected final String TEXT_40 = NL;
  protected final String TEXT_41 = NL + " \tpublic static final int ";
  protected final String TEXT_42 = " = ";
  protected final String TEXT_43 = ";";
  protected final String TEXT_44 = NL + NL + "\tprivate ContentProvider mProvider = null;" + NL + "" + NL + "" + NL + "\tpublic void setContentProvider(ContentProvider valor) {" + NL + "\t\tmProvider = valor;" + NL + "\t}" + NL + "" + NL + "\tprotected static final SQLiteQueryBuilder sQueryBuilder;" + NL + "\tstatic {" + NL + "\t\tsQueryBuilder = new SQLiteQueryBuilder();" + NL + "\t\tString tabelas = ";
  protected final String TEXT_45 = "Contract.TABLE_NAME;" + NL + "\t\t";
  protected final String TEXT_46 = NL + "\t\t//tabelas += \" inner join \" + ";
  protected final String TEXT_47 = "Contract.TABLE_NAME + \" \";" + NL + "\t\t//tabelas += \" on \" + ";
  protected final String TEXT_48 = "Contract.TABLE_NAME + \".\" + ";
  protected final String TEXT_49 = "Contract.COLUNA_CHAVE + \" = \" + ";
  protected final String TEXT_50 = "Contract.TABLE_NAME + \".\" + ";
  protected final String TEXT_51 = "Contract.COLUNA_";
  protected final String TEXT_52 = "; " + NL + "\t\t";
  protected final String TEXT_53 = NL + "\t\tsQueryBuilder.setTables(tabelas);" + NL + "\t}" + NL + "\tprivate static final SQLiteQueryBuilder sQueryBuilderSinc;" + NL + "\tstatic {" + NL + "\t\tsQueryBuilderSinc = new SQLiteQueryBuilder();" + NL + "\t\tString tabelas = ";
  protected final String TEXT_54 = "Contract.TABLE_NAME_SINC;" + NL + "\t\tsQueryBuilderSinc.setTables(tabelas);" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\tprotected AplicacaoDbHelper mOpenHelper = null;" + NL + "\t" + NL + "\tpublic int getLinhas() {" + NL + "\t\treturn qtdeLinhas;" + NL + "\t}" + NL + "\t" + NL + "\tpublic static void buildUriMatcher(UriMatcher matcher) {" + NL + "\t\tmatcher.addURI(";
  protected final String TEXT_55 = "Contract.getContentAuthority(), ";
  protected final String TEXT_56 = "Contract.PATH, ";
  protected final String TEXT_57 = ");" + NL + "\t\tmatcher.addURI(";
  protected final String TEXT_58 = "Contract.getContentAuthority(), ";
  protected final String TEXT_59 = "Contract.PATH + \"/Sinc\" , ";
  protected final String TEXT_60 = "_SINC);" + NL + "\t\tmatcher.addURI(";
  protected final String TEXT_61 = "Contract.getContentAuthority(), ";
  protected final String TEXT_62 = "Contract.PATH + \"/#\"    , ";
  protected final String TEXT_63 = "_ID);" + NL + "\t" + NL + "\t\tmatcher.addURI(";
  protected final String TEXT_64 = "Contract.getContentAuthority(), ";
  protected final String TEXT_65 = "Contract.PATH + \"/#/\" + ";
  protected final String TEXT_66 = "Contract.COM_COMPLEMENTO + \"/*\" , ";
  protected final String TEXT_67 = "_ID_E_COMPLEMENTO);" + NL + "\t\tmatcher.addURI(";
  protected final String TEXT_68 = "Contract.getContentAuthority(), ";
  protected final String TEXT_69 = "Contract.PATH + \"/\" + ";
  protected final String TEXT_70 = "Contract.COM_COMPLEMENTO + \"/*\" , ";
  protected final String TEXT_71 = "_E_COMPLEMENTO);" + NL + "\t\tmatcher.addURI(";
  protected final String TEXT_72 = "Contract.getContentAuthority(), ";
  protected final String TEXT_73 = "Contract.PATH + \"/\" + ";
  protected final String TEXT_74 = "Contract.COM_RETIRADA + \"/*\" , ";
  protected final String TEXT_75 = "_E_RETIRADA);" + NL + "\t\t" + NL + "\t\t" + NL + "\t\t//matcher.addURI(AplicacaoContract.CONTENT_AUTHORITY, ";
  protected final String TEXT_76 = "Contract.PATH + \"/operacao/*\" , ";
  protected final String TEXT_77 = "_OPERACAO);" + NL + "\t\t";
  protected final String TEXT_78 = NL + "\t\tmatcher.addURI(";
  protected final String TEXT_79 = "Contract.getContentAuthority(), ";
  protected final String TEXT_80 = "Contract.PATH + \"/#/\" + ";
  protected final String TEXT_81 = "Contract.PATH, ";
  protected final String TEXT_82 = ");" + NL + "\t\tmatcher.addURI(";
  protected final String TEXT_83 = "Contract.getContentAuthority(), ";
  protected final String TEXT_84 = "Contract.PATH + \"/Com";
  protected final String TEXT_85 = "/\" , COM_";
  protected final String TEXT_86 = ");" + NL + "\t\t";
  protected final String TEXT_87 = NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_88 = NL + "\t\tmatcher.addURI(";
  protected final String TEXT_89 = "Contract.getContentAuthority(), ";
  protected final String TEXT_90 = "Contract.PATH + \"/";
  protected final String TEXT_91 = "/*\", ";
  protected final String TEXT_92 = ");" + NL + "\t\t";
  protected final String TEXT_93 = NL + "\t\t" + NL + "\t\t// Deletes" + NL + "\t\tmatcher.addURI(";
  protected final String TEXT_94 = "Contract.getContentAuthority(), ";
  protected final String TEXT_95 = "Contract.PATH + \"/DeleteAllSinc\" , \t";
  protected final String TEXT_96 = "_DELETE_ALL_SINC);" + NL + "\t\tmatcher.addURI(";
  protected final String TEXT_97 = "Contract.getContentAuthority(), ";
  protected final String TEXT_98 = "Contract.PATH + \"/DeleteAllRecreate\" , ";
  protected final String TEXT_99 = "_DELETE_RECREATE);" + NL + "\t\tmatcher.addURI(";
  protected final String TEXT_100 = "Contract.getContentAuthority(), ";
  protected final String TEXT_101 = "Contract.PATH + \"/DeleteSinc/#\" , \t\t";
  protected final String TEXT_102 = "_DELETE_SINC);" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\t" + NL + "\t" + NL + "\tpublic void setAplicacaoDbHelper(AplicacaoDbHelper db) {" + NL + "\t\tmOpenHelper = db;" + NL + "\t}" + NL + "\t" + NL + "\tpublic Cursor query(UriMatcher sUriMatcher, Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {" + NL + "\t\tDCLog.d(DCLog.OPERACAO_DB_TELA,this,\"Query Uri:\" + uri.toString());" + NL + "\t\tCursor retCursor = null;" + NL + "\t\tswitch (sUriMatcher.match(uri)) {" + NL + "            case ";
  protected final String TEXT_103 = ":" + NL + "            {" + NL + "            \tDCLog.d(DCLog.OPERACAO_DB_TELA,this,\"Match Provider: ";
  protected final String TEXT_104 = "\");" + NL + "                retCursor = query(projection, selection, selectionArgs, sortOrder);" + NL + "                break;" + NL + "            }" + NL + "            case ";
  protected final String TEXT_105 = "_SINC:" + NL + "            {" + NL + "            \tDCLog.d(DCLog.OPERACAO_DB_TELA,this,\"Match Provider: ";
  protected final String TEXT_106 = "_SINC\");" + NL + "                retCursor = querySinc(projection, selection, selectionArgs, sortOrder);" + NL + "                break;" + NL + "            }" + NL + "            case ";
  protected final String TEXT_107 = "_ID:" + NL + "            {" + NL + "            \tDCLog.d(DCLog.OPERACAO_DB_TELA,this,\"Match Provider: ";
  protected final String TEXT_108 = "_ID\");" + NL + "            \tString[] args = {uri.getPathSegments().get(1)};" + NL + "                retCursor = query(projection, sPorChaveSel, args, sortOrder);" + NL + "                break;" + NL + "            }" + NL + "            case ";
  protected final String TEXT_109 = "_ID_E_COMPLEMENTO:" + NL + "\t\t\t{" + NL + "\t\t\t\tDCLog.d(DCLog.OPERACAO_DB_TELA,this,\"Match Provider: ";
  protected final String TEXT_110 = "_ID_E_COMPLEMENTO\");" + NL + "\t\t\t\tString id = uri.getPathSegments().get(1);\t" + NL + "\t\t\t\tString sql = \"select \" + sqlSelect(uri) +" + NL + "\t\t\t\t\t\t\" from \" + sqlFrom(uri) +" + NL + "\t\t\t\t\t\t\" where \" + ";
  protected final String TEXT_111 = "Contract.COLUNA_CHAVE + \" = \" + id;" + NL + "\t\t\t\tretCursor = queryRaw(sql);" + NL + "\t\t\t\tbreak;" + NL + "\t\t\t}" + NL + "\t\t\tcase ";
  protected final String TEXT_112 = "_E_COMPLEMENTO:" + NL + "\t\t\t{" + NL + "\t\t\t\tDCLog.d(DCLog.OPERACAO_DB_TELA,this,\"Match Provider: ";
  protected final String TEXT_113 = "_E_COMPLEMENTO\");" + NL + "\t\t\t\tString sql = \"select \" + sqlSelect(uri) +" + NL + "\t\t\t\t\t\t\" from \" + sqlFrom(uri);" + NL + "\t\t\t\t\t\t// colocar " + NL + "\t\t\t\tretCursor = queryRaw(sql);" + NL + "\t\t\t\tbreak;" + NL + "\t\t\t}" + NL + "\t\t\tcase ";
  protected final String TEXT_114 = "_E_RETIRADA:" + NL + "\t\t\t{" + NL + "\t\t\t\tDCLog.d(DCLog.OPERACAO_DB_TELA,this,\"Match Provider: ";
  protected final String TEXT_115 = "_E_RETIRADA\");" + NL + "\t\t\t\tString sql = \"select \" +  ";
  protected final String TEXT_116 = "Contract.camposOrdenados() +" + NL + "\t\t\t\t\t\t\" from \" + ";
  protected final String TEXT_117 = "Contract.TABLE_NAME +" + NL + "\t\t\t\t\t\tsqlWhere(uri);" + NL + "\t\t\t\t\t\t// colocar " + NL + "\t\t\t\tretCursor = queryRaw(sql);" + NL + "\t\t\t\tbreak;" + NL + "\t\t\t}";
  protected final String TEXT_118 = NL + "\t\t\tcase ";
  protected final String TEXT_119 = ":" + NL + "            {" + NL + "            \tDCLog.d(DCLog.OPERACAO_DB_TELA,this,\"Match Provider: ";
  protected final String TEXT_120 = "\");" + NL + "\t            String[] args = {uri.getPathSegments().get(1)};" + NL + "                retCursor = query(projection, sPor";
  protected final String TEXT_121 = "Selecao, args, sortOrder);" + NL + "                break;" + NL + "            }" + NL + "            case COM_";
  protected final String TEXT_122 = ":" + NL + "            {" + NL + "            \tDCLog.d(DCLog.OPERACAO_DB_TELA,this,\"Match Provider: COM_";
  protected final String TEXT_123 = "\");" + NL + "            \tString sql = \"select \" + ";
  protected final String TEXT_124 = "Contract.camposOrdenados() + \" , \" +" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_125 = "Contract.camposOrdenados() +" + NL + "\t\t\t\t\t\t\" from \" + ";
  protected final String TEXT_126 = "Contract.TABLE_NAME +" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_127 = "Contract.innerJoin";
  protected final String TEXT_128 = "_";
  protected final String TEXT_129 = "() +" + NL + "\t\t\t\t\t\tgetOrderBy();" + NL + "                retCursor = queryRaw(sql);" + NL + "\t\t\t\tbreak;" + NL + "            }" + NL + "\t\t";
  protected final String TEXT_130 = NL + "\t\t";
  protected final String TEXT_131 = NL + "\t \t\tcase ";
  protected final String TEXT_132 = ":" + NL + "\t\t\t{" + NL + "\t\t\t\tDCLog.d(DCLog.OPERACAO_DB_TELA,this,\"Match Provider: ";
  protected final String TEXT_133 = "\");" + NL + "\t\t\t\tretCursor = query";
  protected final String TEXT_134 = "(uri,projection,sortOrder);" + NL + "\t\t\t\tbreak;" + NL + "\t\t\t}" + NL + "\t\t";
  protected final String TEXT_135 = NL + "\t\t}\t" + NL + "        return retCursor;" + NL + "\t}" + NL + "\t" + NL + "\tprivate String sqlWhere(Uri uri) {" + NL + "\t\tString sql = \" where \";" + NL + "\t\t// SemChaveEstrangeira - Sem Usuario (sempre vai ser o mesmo, redundante)" + NL + "  \t";
  protected final String TEXT_136 = NL + "\t\tif (existeItem(\"Sem";
  protected final String TEXT_137 = "\",uri.getPathSegments())) {" + NL + "\t\t\tsql += ";
  protected final String TEXT_138 = "Contract.COLUNA_CHAVE + \" not in (select \" + " + NL + "\t\t\t\t\t";
  protected final String TEXT_139 = "Contract.COLUNA_";
  protected final String TEXT_140 = " + \" from \" +" + NL + "\t\t\t\t\t";
  protected final String TEXT_141 = "Contract.TABLE_NAME + \")\";" + NL + "\t\t}" + NL + "\t";
  protected final String TEXT_142 = NL + "\t\t" + NL + "\t\treturn sql;" + NL + "\t}" + NL + "\t" + NL + "\tprivate String sqlSelect(Uri uri) {" + NL + "\t\tString sql = ";
  protected final String TEXT_143 = "Contract.camposOrdenados();" + NL + "\t\tList<String> segmentos = uri.getPathSegments();" + NL + "\t\t// ComChaveEstrangeira - Sem Usuario (sempre vai ser o mesmo, redundante)" + NL + "  \t";
  protected final String TEXT_144 = NL + "\t\tif (existeItem(\"Com";
  protected final String TEXT_145 = "\",uri.getPathSegments())) {" + NL + "\t\t\tsql += \",\" +  ";
  protected final String TEXT_146 = "Contract.camposOrdenados();" + NL + "\t\t}" + NL + "\t";
  protected final String TEXT_147 = NL + "\t" + NL + "\t// SemChaveEstrangeira - Sem Usuario (sempre vai ser o mesmo, redundante)" + NL + "  \t";
  protected final String TEXT_148 = NL + "\t\tif (existeItem(\"Com";
  protected final String TEXT_149 = "\",uri.getPathSegments())) {" + NL + "\t\t\tsql += \",\" +  ";
  protected final String TEXT_150 = "Contract.camposOrdenados();" + NL + "\t\t}" + NL + "\t";
  protected final String TEXT_151 = NL + "\t\t" + NL + "\t\t" + NL + "\t\t" + NL + "\t\treturn sql;" + NL + "\t}" + NL + "\tprivate String sqlFrom(Uri uri) {" + NL + "\t\tString sql = ";
  protected final String TEXT_152 = "Contract.TABLE_NAME;" + NL + "\t\tList<String> segmentos = uri.getPathSegments();" + NL + "\t\t//if (existeItem(\"ComEpisodioReferenteA\",uri.getPathSegments())) {" + NL + "\t\t//\tsql += \" \" +  EpisodioUsuarioContract.innerJoinEpisodio_ReferenteA();" + NL + "\t\t//}" + NL + "\t\t" + NL + "\t\t" + NL + "\t\t\t\t// ComChaveEstrangeira" + NL + "  \t";
  protected final String TEXT_153 = NL + "\t\tif (existeItem(\"Com";
  protected final String TEXT_154 = "\",uri.getPathSegments())) {" + NL + "\t\t\tsql += \" \" +  ";
  protected final String TEXT_155 = "Contract.outerJoin";
  protected final String TEXT_156 = "_";
  protected final String TEXT_157 = "();" + NL + "\t\t}" + NL + "\t";
  protected final String TEXT_158 = NL + "\t" + NL + "\t// SemChaveEstrangeira" + NL + "  \t";
  protected final String TEXT_159 = NL + "\t\tif (existeItem(\"Com";
  protected final String TEXT_160 = "\",uri.getPathSegments())) {" + NL + "\t\t\tsql += \" \" +  ";
  protected final String TEXT_161 = "Contract.outerJoin";
  protected final String TEXT_162 = "_";
  protected final String TEXT_163 = "();" + NL + "\t\t}" + NL + "\t";
  protected final String TEXT_164 = NL + "\t\t" + NL + "\t\treturn sql;" + NL + "\t}" + NL + "" + NL + "\tprivate boolean existeItem(String ref, List<String> lista) {" + NL + "\t\tfor (String item : lista) {" + NL + "\t\t\tif (ref.compareToIgnoreCase(item)==0) return true;" + NL + "\t\t}" + NL + "\t\treturn false;" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\t" + NL + "\tprivate String getOrderBy() {" + NL + "\t\tString campoOrder = getCampoOrder();" + NL + "\t\tif (campoOrder==null) return \"\";" + NL + "\t\treturn \" order by \" + campoOrder;" + NL + "\t}" + NL + "\tprotected String getCampoOrder() {" + NL + "\t\treturn null;" + NL + "\t}" + NL + "\t" + NL + "\t";
  protected final String TEXT_165 = NL + "\tprotected abstract Cursor query";
  protected final String TEXT_166 = "(Uri uri, String[] projection, String sortOrder);" + NL + "\t";
  protected final String TEXT_167 = NL + "\t" + NL + "\t" + NL + "\tprotected Cursor query(String[] projection, String selection, String[] selectionArgs, String sortOrder) {" + NL + "\t\t return sQueryBuilder.query(mOpenHelper.getReadableDatabase()," + NL + "\t                projection," + NL + "\t                selection," + NL + "\t                selectionArgs," + NL + "\t                null," + NL + "\t                null," + NL + "\t                sortOrder" + NL + "\t        );" + NL + "\t}" + NL + "\tprotected Cursor querySinc(String[] projection, String selection, String[] selectionArgs, String sortOrder) {" + NL + "\t\t return sQueryBuilderSinc.query(mOpenHelper.getReadableDatabase()," + NL + "\t                projection," + NL + "\t                selection," + NL + "\t                selectionArgs," + NL + "\t                null," + NL + "\t                null," + NL + "\t                sortOrder" + NL + "\t        );" + NL + "\t}" + NL + "\tprotected Cursor queryRaw(String sql) {" + NL + "\t\tDCLog.d(DCLog.DATABASE_ADM,this,sql);" + NL + "\t\tfinal SQLiteDatabase db = mOpenHelper.getReadableDatabase();" + NL + "\t\treturn db.rawQuery(sql,null);" + NL + "\t}" + NL + "\t" + NL + "\tpublic String getType(UriMatcher sUriMatcher, Uri uri) {" + NL + "\t\tswitch (sUriMatcher.match(uri)) {" + NL + "            case ";
  protected final String TEXT_168 = ":" + NL + "            {" + NL + "                return ";
  protected final String TEXT_169 = "Contract.getContentType();" + NL + "            }" + NL + "            case ";
  protected final String TEXT_170 = "_ID:" + NL + "            {" + NL + "            \treturn ";
  protected final String TEXT_171 = "Contract.getContentItemType();" + NL + "            }";
  protected final String TEXT_172 = NL + "\t\t\tcase ";
  protected final String TEXT_173 = ":" + NL + "            {" + NL + "\t            return ";
  protected final String TEXT_174 = "Contract.getContentType();" + NL + "            }" + NL + "\t\t";
  protected final String TEXT_175 = NL + "\t\t}\t" + NL + "\t\treturn null;" + NL + "\t}" + NL + "\t" + NL + "\tpublic Uri insert(Uri uri, ContentValues values) {" + NL + "\t\tfinal SQLiteDatabase db = mOpenHelper.getWritableDatabase();" + NL + "\t\tUri returnUri;" + NL + "\t\tlong idNovo = getMaxId(db)+1;" + NL + "\t\tvalues.put(";
  protected final String TEXT_176 = "Contract.COLUNA_CHAVE, idNovo);" + NL + "\t\tlong _id = db.insert(";
  protected final String TEXT_177 = "Contract.TABLE_NAME, null, values);" + NL + "\t\tif (_id > 0) {" + NL + "\t\t\t//DCLog.d(DCLog.DATABASE_CRUD,this,\"insert \" + ";
  protected final String TEXT_178 = "Contract.TABLE_NAME + \"  \" + values.toString() + \" (id:\" + _id + \")\");" + NL + "\t\t\tDCLog.d(DCLog.DATABASE_CRUD,this,\"insert \" + values.toString() + \" (id:\" + _id + \")\");" + NL + "\t\t\treturnUri = ";
  protected final String TEXT_179 = "Contract.build";
  protected final String TEXT_180 = "Uri(idNovo);" + NL + "\t\t\tvalues.put(";
  protected final String TEXT_181 = "Contract.COLUNA_OPERACAO_SINC,\"I\");" + NL + "\t\t\tinsereSinc(db,values);" + NL + "\t\t\tnotificaUriRelacionadas();" + NL + "\t\t} else {" + NL + "\t\t\tthrow new android.database.SQLException(\"Falha no insert em \" + uri);" + NL + "\t\t}" + NL + "\t\treturn returnUri;" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\t// considerando com o mesmo princ?pio do insert." + NL + "\t// delete na tabela atual e verific" + NL + "\tpublic boolean delete(UriMatcher sUriMatcher, Uri uri, String selection, String[] selectionArgs) {" + NL + "\t\tfinal SQLiteDatabase db = mOpenHelper.getWritableDatabase();" + NL + "\t\tint linhaDelete =0;" + NL + "\t\tswitch (sUriMatcher.match(uri)) {" + NL + "\t\t\tcase ";
  protected final String TEXT_182 = "_DELETE_SINC: {" + NL + "\t\t\t\tString id = uri.getPathSegments().get(2);" + NL + "\t\t\t\tCursor cursor = db.query(";
  protected final String TEXT_183 = "Contract.TABLE_NAME,null,";
  protected final String TEXT_184 = "Contract.COLUNA_CHAVE + \" = ? \",new String[]{id},null,null,null);" + NL + "\t\t\t\tif (cursor.moveToFirst()) {" + NL + "\t\t\t\t\tContentValues valores = new ContentValues();" + NL + "\t\t\t\t\tDatabaseUtils.cursorRowToContentValues(cursor, valores);" + NL + "\t\t\t\t\tlinhaDelete = db.delete(";
  protected final String TEXT_185 = "Contract.TABLE_NAME, ";
  protected final String TEXT_186 = "Contract.COLUNA_CHAVE + \" = ? \", new String[]{id});" + NL + "\t\t\t\t\tDCLog.d(DCLog.DATABASE_CRUD,this,\"delete \" + ";
  protected final String TEXT_187 = "Contract.TABLE_NAME + \"(id:\" + id + \")\");" + NL + "\t\t\t\t\tvalores.put(";
  protected final String TEXT_188 = "Contract.COLUNA_OPERACAO_SINC, \"D\");" + NL + "\t\t\t\t\tinsereSinc(db,valores);" + NL + "\t\t\t\t}" + NL + "\t\t\t\tnotificaUriRelacionadas();" + NL + "\t\t\t\tmProvider.getContext().getContentResolver().notifyChange(";
  protected final String TEXT_189 = "Contract.buildAll(), null);" + NL + "\t\t\t\tbreak;" + NL + "\t\t\t}" + NL + "\t\t\tcase ";
  protected final String TEXT_190 = "_DELETE_ALL_SINC: {" + NL + "\t\t\t\tlinhaDelete = db.delete(";
  protected final String TEXT_191 = "Contract.TABLE_NAME_SINC, null, null);" + NL + "\t\t\t\tbreak;" + NL + "\t\t\t}" + NL + "\t\t\tcase ";
  protected final String TEXT_192 = "_DELETE_RECREATE: {" + NL + "\t\t\t\tlinhaDelete = db.delete(";
  protected final String TEXT_193 = "Contract.TABLE_NAME, null, null);" + NL + "\t\t\t\tbreak;" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn true;" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\tpublic boolean update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {" + NL + "\t\tfinal SQLiteDatabase db = mOpenHelper.getWritableDatabase();" + NL + "\t\tint linhaUpdate =0;" + NL + "\t\tlinhaUpdate = db.update(";
  protected final String TEXT_194 = "Contract.TABLE_NAME, values, selection, selectionArgs);" + NL + "\t\treturn true;" + NL + "\t}" + NL + "\tpublic boolean update(Uri uri, ContentValues values) {" + NL + "\t\tfinal SQLiteDatabase db = mOpenHelper.getWritableDatabase();" + NL + "\t\tint linhaUpdate =0;" + NL + "\t\tString selection = ";
  protected final String TEXT_195 = "Contract.COLUNA_CHAVE + \" = ? \";" + NL + "\t\tString dados[] = {values.get(";
  protected final String TEXT_196 = "Contract.COLUNA_CHAVE).toString()};" + NL + "\t\tlinhaUpdate = db.update(";
  protected final String TEXT_197 = "Contract.TABLE_NAME, values, selection, dados);" + NL + "\t\tvalues.put(";
  protected final String TEXT_198 = "Contract.COLUNA_OPERACAO_SINC,\"A\");" + NL + "\t\tinsereSinc(db,values);" + NL + "\t\treturn true;" + NL + "\t}" + NL + "\t" + NL + "\tprivate void insereSinc(SQLiteDatabase db, ContentValues values) {" + NL + "\t\tdb.insert(";
  protected final String TEXT_199 = "Contract.TABLE_NAME_SINC, null, values);" + NL + "\t}" + NL + "\t" + NL + "\t// Notificar todas as uris de entidades que possuem chave estrangeira dessa entidade." + NL + "\tprivate void notificaUriRelacionadas() {" + NL + "\t\t// ComChaveEstrangeira" + NL + "  \t";
  protected final String TEXT_200 = NL + "\t\tmProvider.getContext().getContentResolver().notifyChange(";
  protected final String TEXT_201 = "Contract.buildAllCom";
  protected final String TEXT_202 = "(), null);" + NL + "\t\tmProvider.getContext().getContentResolver().notifyChange(";
  protected final String TEXT_203 = "Contract.buildAllSem";
  protected final String TEXT_204 = "(), null);" + NL + "\t";
  protected final String TEXT_205 = NL + "\t}" + NL + "\tprivate void notificaUriOperacoes() {" + NL + "\t";
  protected final String TEXT_206 = NL + "\t\tmProvider.getContext().getContentResolver().notifyChange(";
  protected final String TEXT_207 = "Contract.build";
  protected final String TEXT_208 = "(), null);" + NL + "\t";
  protected final String TEXT_209 = NL + "\t}" + NL + "\tprivate void notificaUriRaiz(){" + NL + "\t\t" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\t" + NL + "\tpublic int bulkInsert(Uri uri, ContentValues[] values) {" + NL + "    \tfinal SQLiteDatabase db = mOpenHelper.getWritableDatabase();" + NL + "        db.beginTransaction();" + NL + "        int returnCount = 0;" + NL + "        try {" + NL + "        \tfor (ContentValues value : values) {" + NL + "\t\t\t\tString[] args = {(String)value.get(";
  protected final String TEXT_210 = "Contract.COLUNA_CHAVE)};" + NL + "\t\t\t\tCursor retCursor = query(null, sPorChaveSel, args, null);" + NL + "\t\t\t\tif (retCursor.moveToFirst()) {" + NL + "\t\t\t\t\t\tdb.update(";
  protected final String TEXT_211 = "Contract.TABLE_NAME,value,sPorChaveSel,args);" + NL + "\t\t\t\t\t\t//DCLog.d(DCLog.DATABASE_CRUD,this,\"update (bulk \" + ";
  protected final String TEXT_212 = "Contract.TABLE_NAME + \"  \" + values.toString());" + NL + "\t\t\t\t\t\tDCLog.d(DCLog.DATABASE_CRUD,this,\"update (bulk id:\" + value.get(";
  protected final String TEXT_213 = "Contract.COLUNA_CHAVE) + \")\" + values.toString());" + NL + "\t\t\t\t} else {" + NL + "\t\t\t\t\tlong _id = db.insert(";
  protected final String TEXT_214 = "Contract.TABLE_NAME, null, value);" + NL + "\t\t\t\t\tif (_id != -1) {" + NL + "\t\t\t\t\t\t//DCLog.d(DCLog.DATABASE_CRUD,this,\"insert (bulk)\" + ";
  protected final String TEXT_215 = "Contract.TABLE_NAME + \"  \" + values.toString() + \" (id:\" + _id + \")\");" + NL + "\t\t\t\t\t\tDCLog.d(DCLog.DATABASE_CRUD,this,\"insert (bulk)\" + values.toString() + \" (id:\" + _id + \")\");" + NL + "\t\t\t\t\t\treturnCount++;" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t}" + NL + "            }" + NL + "            db.setTransactionSuccessful();" + NL + "            notificaUriOperacoes();" + NL + "   \t\t} finally {" + NL + " \t\t\tdb.endTransaction();" + NL + "        }" + NL + "        return returnCount;" + NL + "    }" + NL + "\tpublic int bulkInsertOld(Uri uri, ContentValues[] values) {" + NL + "    \tfinal SQLiteDatabase db = mOpenHelper.getWritableDatabase();" + NL + "        db.beginTransaction();" + NL + "        int returnCount = 0;" + NL + "        try {" + NL + "        \tfor (ContentValues value : values) {" + NL + "            \tlong _id = db.insert(";
  protected final String TEXT_216 = "Contract.TABLE_NAME, null, value);" + NL + "            \tif (_id != -1) {" + NL + "            \t\treturnCount++;" + NL + "            \t}" + NL + "            }" + NL + "            db.setTransactionSuccessful();" + NL + "   \t\t} finally {" + NL + " \t\t\tdb.endTransaction();" + NL + "        }" + NL + "        return returnCount;" + NL + "    }" + NL + "    " + NL + "    " + NL + "    public long getMaxId(SQLiteDatabase db) {" + NL + "\t\tString sql = \"select max(\" + ";
  protected final String TEXT_217 = "Contract.COLUNA_CHAVE + \") from \" + ";
  protected final String TEXT_218 = "Contract.TABLE_NAME;" + NL + "\t\treturn this.getNumeroSql(sql,db);" + NL + "\t}" + NL + "\t" + NL + "\t// Arquitetura - Padrao" + NL + "\tprotected long getNumeroSql(String sql,SQLiteDatabase db) {" + NL + "\t\tlong saida = 0;" + NL + "\t\tCursor c = null;" + NL + "\t\ttry {" + NL + "\t\t\tc =db.rawQuery(sql, null);" + NL + "\t\t\tc.moveToFirst();" + NL + "\t\t\tsaida = c.getLong(0);" + NL + "\t\t} catch (SQLException e) {" + NL + "\t\t\tDCLog.e(DCLog.DATABASE_ERRO_CORE, this, e);" + NL + "\t\t} finally {" + NL + "\t\t\tif (c != null && !c.isClosed()) {" + NL + "\t\t\t\tc.close();" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "    " + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( String.valueOf(classe.getId()) );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( String.valueOf(classe.getId()) );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( String.valueOf(classe.getId()) );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( String.valueOf(classe.getId()) );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( String.valueOf(classe.getId()) );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( String.valueOf(classe.getId()) );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( String.valueOf(classe.getId()) );
    stringBuffer.append(TEXT_21);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( String.valueOf(classe.getId()) );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( String.valueOf(classe.getId()) );
    stringBuffer.append(TEXT_25);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( String.valueOf(classe.getId()) );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_29);
     int contConstante = 20; 
    stringBuffer.append(TEXT_30);
    
	Iterator<RelacionamentoWrapper> iterador = classe.obtemListaComChaveEstrangeira().iterator();
	while (iterador.hasNext()) {
		RelacionamentoWrapper relCorrente = iterador.next();
	
    stringBuffer.append(TEXT_31);
    stringBuffer.append( relCorrente.getNomeParaConstante() );
    stringBuffer.append(TEXT_32);
    stringBuffer.append( String.valueOf(classe.getId()) );
    stringBuffer.append( String.format("%02d",contConstante++) );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( relCorrente.getClasseOposta().getNomeParaConstante() );
    stringBuffer.append(TEXT_34);
    stringBuffer.append( String.valueOf(classe.getId()) );
    stringBuffer.append( String.format("%02d",contConstante++) );
    stringBuffer.append(TEXT_35);
    stringBuffer.append( relCorrente.getNomePropriedade() );
    stringBuffer.append(TEXT_36);
    stringBuffer.append(TEXT_37);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_38);
    stringBuffer.append( relCorrente.getNomeCampoTabela() );
    stringBuffer.append(TEXT_39);
    
	}
	
    stringBuffer.append(TEXT_40);
    
 	for (RegraColecao regra : classe.getListaRegraColecao()) {
 	if (regra.getAtivoFlex()) {
 
    stringBuffer.append(TEXT_41);
    stringBuffer.append( regra.getNomeParaConstante() );
    stringBuffer.append(TEXT_42);
    stringBuffer.append( String.valueOf(classe.getId()) );
    stringBuffer.append( String.format("%02d",contConstante++) );
    stringBuffer.append(TEXT_43);
    
 	}
 	}
 
    stringBuffer.append(TEXT_44);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_45);
    
		iterador = classe.obtemListaComChaveEstrangeira().iterator();
		while (iterador.hasNext()) {
			RelacionamentoWrapper relCorrente = iterador.next();
			ClasseWrapper classeOposta = relCorrente.getClasseOposta();
			AtributoWrapper chaveOposta = classeOposta.getChaveW();
		
    stringBuffer.append(TEXT_46);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_47);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_48);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_49);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_50);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_51);
    stringBuffer.append( relCorrente.getNomeConstante() );
    stringBuffer.append(TEXT_52);
    
		}
		
    stringBuffer.append(TEXT_53);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_54);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_55);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_56);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_57);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_58);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_59);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_60);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_61);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_62);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_63);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_64);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_65);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_66);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_67);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_68);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_69);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_70);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_71);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_72);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_73);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_74);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_75);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_76);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_77);
    
		iterador = classe.obtemListaComChaveEstrangeira().iterator();
		while (iterador.hasNext()) {
			RelacionamentoWrapper relCorrente = iterador.next();
		
    stringBuffer.append(TEXT_78);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_79);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_80);
    stringBuffer.append( relCorrente.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_81);
    stringBuffer.append( relCorrente.getNomeParaConstante() );
    stringBuffer.append(TEXT_82);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_83);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_84);
    stringBuffer.append( relCorrente.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append( relCorrente.getNomeRelacionamento() );
    stringBuffer.append(TEXT_85);
    stringBuffer.append( relCorrente.getClasseOposta().getNomeParaConstante() );
    stringBuffer.append(TEXT_86);
    
		}
		
    stringBuffer.append(TEXT_87);
    
	 	for (RegraColecao regra : classe.getListaRegraColecao()) {
 		if (regra.getAtivoFlex()) {
		
    stringBuffer.append(TEXT_88);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_89);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_90);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_91);
    stringBuffer.append( regra.getNomeParaConstante() );
    stringBuffer.append(TEXT_92);
    
 		}
 		}
		
    stringBuffer.append(TEXT_93);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_94);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_95);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_96);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_97);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_98);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_99);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_100);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_101);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_102);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_103);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_104);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_105);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_106);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_107);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_108);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_109);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_110);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_111);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_112);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_113);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_114);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_115);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_116);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_117);
    
		iterador = classe.obtemListaComChaveEstrangeiraSemUsuario().iterator();
		while (iterador.hasNext()) {
			RelacionamentoWrapper relCorrente = iterador.next();
		
    stringBuffer.append(TEXT_118);
    stringBuffer.append( relCorrente.getNomeParaConstante() );
    stringBuffer.append(TEXT_119);
    stringBuffer.append( relCorrente.getNomeParaConstante() );
    stringBuffer.append(TEXT_120);
    stringBuffer.append( relCorrente.getNomePropriedade() );
    stringBuffer.append(TEXT_121);
    stringBuffer.append( relCorrente.getClasseOposta().getNomeParaConstante() );
    stringBuffer.append(TEXT_122);
    stringBuffer.append( relCorrente.getClasseOposta().getNomeParaConstante() );
    stringBuffer.append(TEXT_123);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_124);
    stringBuffer.append( relCorrente.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_125);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_126);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_127);
    stringBuffer.append( relCorrente.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_128);
    stringBuffer.append( relCorrente.getNomeRelacionamento());
    stringBuffer.append(TEXT_129);
    
		}
		
    stringBuffer.append(TEXT_130);
    
	 	for (RegraColecao regra : classe.getListaRegraColecao()) {
 		if (regra.getAtivoFlex()) {
		
    stringBuffer.append(TEXT_131);
    stringBuffer.append( regra.getNomeParaConstante() );
    stringBuffer.append(TEXT_132);
    stringBuffer.append( regra.getNomeParaConstante() );
    stringBuffer.append(TEXT_133);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_134);
    
 		}
 		}
		
    stringBuffer.append(TEXT_135);
    
	Iterator<RelacionamentoWrapper> iteradorRelRet = classe.obtemListaSemChaveEstrangeiraSemUsuario().iterator();
	while (iteradorRelRet.hasNext()) {
	RelacionamentoWrapper relac = iteradorRelRet.next();
	ClasseWrapper classeOposta = relac.getClasseOposta();
	
    stringBuffer.append(TEXT_136);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_137);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_138);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_139);
    stringBuffer.append( relac.getNomeConstanteOposta() );
    stringBuffer.append(TEXT_140);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_141);
    
	}
	
    stringBuffer.append(TEXT_142);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_143);
    
	Iterator<RelacionamentoWrapper> iteradorRel = classe.obtemListaComChaveEstrangeiraSemUsuario().iterator();
	while (iteradorRel.hasNext()) {
	RelacionamentoWrapper relac = iteradorRel.next();
	ClasseWrapper classeOposta = relac.getClasseOposta();
	
    stringBuffer.append(TEXT_144);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_145);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_146);
    
	}
	
    stringBuffer.append(TEXT_147);
    
	Iterator<RelacionamentoWrapper> iteradorRel2 = classe.obtemListaSemChaveEstrangeiraSemUsuario().iterator();
	while (iteradorRel2.hasNext()) {
	RelacionamentoWrapper relac = iteradorRel2.next();
	ClasseWrapper classeOposta = relac.getClasseOposta();
	
    stringBuffer.append(TEXT_148);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_149);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_150);
    
	}
	
    stringBuffer.append(TEXT_151);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_152);
    
	Iterator<RelacionamentoWrapper> iteradorRel3 = classe.obtemListaComChaveEstrangeiraSemUsuario().iterator();
	while (iteradorRel3.hasNext()) {
	RelacionamentoWrapper relac = iteradorRel3.next();
	ClasseWrapper classeOposta = relac.getClasseOposta();
	
    stringBuffer.append(TEXT_153);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_154);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_155);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_156);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_157);
    
	}
	
    stringBuffer.append(TEXT_158);
    
	Iterator<RelacionamentoWrapper> iteradorRel4 = classe.obtemListaSemChaveEstrangeiraSemUsuario().iterator();
	while (iteradorRel4.hasNext()) {
	RelacionamentoWrapper relac = iteradorRel4.next();
	ClasseWrapper classeOposta = relac.getClasseOposta();
	
    stringBuffer.append(TEXT_159);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_160);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_161);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_162);
    stringBuffer.append( relac.getNomeRelacionamento() );
    stringBuffer.append(TEXT_163);
    
	}
	
    stringBuffer.append(TEXT_164);
    
	for (RegraColecao regra : classe.getListaRegraColecao()) {
 	if (regra.getAtivoFlex()) {
	
    stringBuffer.append(TEXT_165);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_166);
    
 	}
 	}
	
    stringBuffer.append(TEXT_167);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_168);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_169);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_170);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_171);
    
		for (RelacionamentoWrapper relCorrente : classe.obtemListaComChaveEstrangeira()) {
		
    stringBuffer.append(TEXT_172);
    stringBuffer.append( relCorrente.getNomeParaConstante() );
    stringBuffer.append(TEXT_173);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_174);
    
		}
		
    stringBuffer.append(TEXT_175);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_176);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_177);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_178);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_179);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_180);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_181);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_182);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_183);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_184);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_185);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_186);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_187);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_188);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_189);
    stringBuffer.append( classe.getNomeParaConstante() );
    stringBuffer.append(TEXT_190);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_191);
    stringBuffer.append( classe.getNomeParaConstante() );
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
    
	Iterator<RelacionamentoWrapper> iteradorRelUri = classe.obtemListaComChaveEstrangeiraSemUsuario().iterator();
	while (iteradorRelUri.hasNext()) {
	RelacionamentoWrapper relac = iteradorRelUri.next();
	ClasseWrapper classeOposta = relac.getClasseOposta();
	
    stringBuffer.append(TEXT_200);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_201);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamentoOposto() );
    stringBuffer.append(TEXT_202);
    stringBuffer.append( classeOposta.getNomeParaClasse() );
    stringBuffer.append(TEXT_203);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append( relac.getNomeRelacionamentoOposto() );
    stringBuffer.append(TEXT_204);
    
	}
	
    stringBuffer.append(TEXT_205);
    
 	for (RegraColecao regra : classe.getListaRegraColecao()) {
 	if (regra.getAtivoFlex()) {
	
    stringBuffer.append(TEXT_206);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_207);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_208);
    
	}
	}
	
    stringBuffer.append(TEXT_209);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_210);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_211);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_212);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_213);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_214);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_215);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_216);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_217);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_218);
    return stringBuffer.toString();
  }
}
