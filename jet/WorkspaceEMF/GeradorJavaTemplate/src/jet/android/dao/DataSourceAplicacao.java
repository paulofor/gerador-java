package jet.android.dao;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class DataSourceAplicacao
{
  protected static String nl;
  public static synchronized DataSourceAplicacao create(String lineSeparator)
  {
    nl = lineSeparator;
    DataSourceAplicacao result = new DataSourceAplicacao();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".dao.datasource;" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".modelo.Usuario;" + NL + "import ";
  protected final String TEXT_4 = ".modelo.vo.FabricaVo;" + NL + "import ";
  protected final String TEXT_5 = ".servico.FabricaServico;" + NL + "import ";
  protected final String TEXT_6 = ".servico.UsuarioServico;" + NL + "" + NL + "" + NL + "import android.content.Context;" + NL + "import android.content.SharedPreferences;" + NL + "import android.database.sqlite.SQLiteDatabase;" + NL + "import android.database.sqlite.SQLiteOpenHelper;" + NL + "import android.util.Log;" + NL + "import br.com.digicom.dao.DataSource;" + NL + "import br.com.digicom.storage.StorageUtil;" + NL + "" + NL + "public class DataSourceAplicacao extends DataSource {" + NL + "" + NL + "\tpublic final static String PASTA_TRABALHO = \"digidata\";" + NL + "\tprivate String TAG = \"DataSource\";" + NL + "\t// COLOCAR !!!" + NL + "\t// <uses-permission android:name=\"android.permission.WRITE_EXTERNAL_STORAGE\"/>" + NL + "\t" + NL + "\t//public static final String DB_NAME = Environment.getExternalStorageDirectory() + \"/digidata/treinoletra.db\";" + NL + "" + NL + "\t// Pattern Singleton" + NL + "\tprivate static DataSourceAplicacao instancia = null;" + NL + "\t" + NL + "    // Objetos de BD" + NL + "\tprivate DBOpenHelper dbOpenHelper; // Classe interna" + NL + "\t" + NL + "\t\t" + NL + "\t/*" + NL + "\tpublic void inicializaPath() {" + NL + "\t\tUsuarioServico usuarioSrv = FabricaServico.getInstancia().getUsuarioServico(FabricaServico.TIPO_SQLITE);" + NL + "\t\tUsuario usuario = usuarioSrv.ObtemReferenciaAndroid(context);" + NL + "\t\tif (usuario==null) {" + NL + "\t\t\tusuario = FabricaVo.criaUsuario();" + NL + "\t\t}" + NL + "\t\tif (usuario.getMelhorPath()==null || (usuario.getMelhorPath().compareTo(usuarioPath)!=0)) {" + NL + "\t\t\tusuario.setMelhorPath(usuarioPath);" + NL + "\t\t\tusuarioSrv.alteraParaSincronizacao(usuario);" + NL + "\t\t}" + NL + "\t}" + NL + "\t*/" + NL + "\t" + NL + "\tpublic String getPathPadrao() {" + NL + "\t\treturn usuarioPath;" + NL + "\t}" + NL + "" + NL + "\tpublic String getDBName() {" + NL + "\t\treturn usuarioPath + \"/\" + this.PASTA_TRABALHO + \"/";
  protected final String TEXT_7 = ".db\";" + NL + "\t}" + NL + "\t" + NL + "\tpublic int getDbVersao() {" + NL + "\t\treturn 1;" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\t" + NL + "\tpublic void inicializa() {" + NL + "\t\trecuperaValorPath();" + NL + "\t\tif (usuarioPath==null) {" + NL + "\t\t\tLog.d(TAG, \"Cria path storage novo\");" + NL + "\t\t\tusuarioPath = StorageUtil.getPathMaisEspaco();" + NL + "\t\t\tsalvaValorPath();" + NL + "\t\t} else {" + NL + "\t\t\tLog.d(TAG, \"Mantem path storage\");" + NL + "\t\t}" + NL + "\t\tdbOpenHelper = new DataSourceAplicacao.DBOpenHelper(context);" + NL + "\t\tLog.d(TAG , \"Database:\" + getDBName());" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\t" + NL + "\t" + NL + "\tpublic static void criaInstancia(Context ctx) {" + NL + "\t\tcontext = ctx;" + NL + "\t\tinstancia = new DataSourceAplicacao();" + NL + "\t\tinstancia.inicializa();" + NL + "\t}" + NL + "\tpublic static DataSource getInstancia() {" + NL + "\t\treturn instancia;" + NL + "\t}" + NL + "\t" + NL + "\t// ??? Quando abre e quando fecha ????" + NL + "\tpublic static void fechaBanco() {" + NL + "\t\tinstancia.getDb().close();" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\t" + NL + "\tpublic SQLiteDatabase getDb() {" + NL + "\t\tif (db==null) {" + NL + "\t\t\tdb = dbOpenHelper.getWritableDatabase();" + NL + "\t\t}" + NL + "\t\treturn db;" + NL + "\t}" + NL + "" + NL + "\t" + NL + "\t" + NL + "\t" + NL + "" + NL + "    private static class DBOpenHelper extends SQLiteOpenHelper {" + NL + "" + NL + "       " + NL + "" + NL + "        public DBOpenHelper(final Context context) {" + NL + "            super(context, instancia.getDBName(), null, instancia.getDbVersao());" + NL + "        }" + NL + "" + NL + "" + NL + "\t\t@Override" + NL + "\t\tpublic void onCreate(SQLiteDatabase db) {" + NL + "\t\t\t// TODO Auto-generated method stub" + NL + "\t\t\t" + NL + "\t\t}" + NL + "" + NL + "\t\t@Override" + NL + "\t\tpublic void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {" + NL + "\t\t\t// TODO Auto-generated method stub" + NL + "\t\t" + NL + "\t\t}" + NL + "" + NL + "       " + NL + "" + NL + "     " + NL + "    }" + NL + "" + NL + "   " + NL + "}";
  protected final String TEXT_8 = NL;

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
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append(TEXT_8);
    return stringBuffer.toString();
  }
}
