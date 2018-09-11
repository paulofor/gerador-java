package jet.android.data;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class DBHelperAplicacao
{
  protected static String nl;
  public static synchronized DBHelperAplicacao create(String lineSeparator)
  {
    nl = lineSeparator;
    DBHelperAplicacao result = new DBHelperAplicacao();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package  ";
  protected final String TEXT_3 = ".data.helper;" + NL + "" + NL + "import android.content.Context;" + NL + "import android.database.DatabaseErrorHandler;" + NL + "import android.database.sqlite.SQLiteDatabase;" + NL + "import android.database.sqlite.SQLiteDatabase.CursorFactory;" + NL + "import android.database.sqlite.SQLiteOpenHelper;" + NL + "import ";
  protected final String TEXT_4 = ".framework.log.DCLog;" + NL + "import ";
  protected final String TEXT_5 = ".data.DatabaseConst;" + NL + "import ";
  protected final String TEXT_6 = ".framework.fcm.DCSincronizador;" + NL + "" + NL + "public class AplicacaoDbHelper extends SQLiteOpenHelper{" + NL + "" + NL + "\t/*" + NL + "\tprivate static final int DATABASE_VERSION = 1;" + NL + "\tpublic static String DATABASE_NAME = \"";
  protected final String TEXT_7 = ".db\";" + NL + "\t*/" + NL + "\t//public static String DATABASE_NAME = \"/mnt/extSdCard/digidata/";
  protected final String TEXT_8 = ".db\";" + NL + "" + NL + "\tprivate static DatabaseConst databaseConst = null;" + NL + "\tprivate static DCSincronizador sincronizador = null;" + NL + "" + NL + "\tpublic static void setSincronizador(DCSincronizador valor) {" + NL + "\t\tsincronizador = valor;" + NL + "\t}" + NL + "" + NL + "\tpublic static void setDatabaseConst(DatabaseConst dbConst) {" + NL + "\t\tdatabaseConst = dbConst;" + NL + "\t}" + NL + "" + NL + "\tpublic static String getNomeBanco() {" + NL + "\t\treturn databaseConst.getName();" + NL + "\t}" + NL + "\t" + NL + "\tpublic AplicacaoDbHelper(Context context) {" + NL + "\t\t//super(context, DATABASE_NAME , null, DATABASE_VERSION);" + NL + "\t\tsuper(context,databaseConst.getName(),null,databaseConst.getVersion());" + NL + "\t}" + NL + "\t" + NL + "\t@Override" + NL + "\tpublic void onCreate(SQLiteDatabase db) {" + NL + "\t\tDCLog.d(DCLog.DATABASE_ADM,this,\"Create database em \" + databaseConst.getName());" + NL + "\t" + NL + "\t\tString CREATE_SQL = null;" + NL + "\t";
  protected final String TEXT_9 = NL + "\t\tCREATE_SQL = ";
  protected final String TEXT_10 = "DbHelper.getSqlCreate();" + NL + "\t\tdb.execSQL(CREATE_SQL);" + NL + "\t\tCREATE_SQL = ";
  protected final String TEXT_11 = "DbHelper.getSqlCreateSinc();" + NL + "\t\tdb.execSQL(CREATE_SQL);" + NL + "\t";
  protected final String TEXT_12 = NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\t@Override" + NL + "\tpublic void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {" + NL + "\t\tDCLog.d(DCLog.DATABASE_ADM,this,\"Upgrade database em \" + databaseConst.getName());" + NL + "\t\tString UPDATE_SQL = null;" + NL + "\t";
  protected final String TEXT_13 = NL + "\t\t//UPDATE_SQL = ";
  protected final String TEXT_14 = "DbHelper.onUpgrade(oldVersion,newVersion);" + NL + "\t\t//db.execSQL(UPDATE_SQL);" + NL + "\t\t//UPDATE_SQL = ";
  protected final String TEXT_15 = "DbHelper.onUpgradeSinc(oldVersion,newVersion);" + NL + "\t\t//db.execSQL(UPDATE_SQL);" + NL + "\t\tUPDATE_SQL = ";
  protected final String TEXT_16 = "DbHelper.getSqlDrop();" + NL + "\t\tdb.execSQL(UPDATE_SQL);" + NL + "\t\tUPDATE_SQL = ";
  protected final String TEXT_17 = "DbHelper.getSqlCreate();" + NL + "\t\tdb.execSQL(UPDATE_SQL);" + NL + "\t\tUPDATE_SQL = ";
  protected final String TEXT_18 = "DbHelper.getSqlDropSinc();" + NL + "\t\tdb.execSQL(UPDATE_SQL);" + NL + "\t\tUPDATE_SQL = ";
  protected final String TEXT_19 = "DbHelper.getSqlCreateSinc();" + NL + "\t\tdb.execSQL(UPDATE_SQL);" + NL + "\t";
  protected final String TEXT_20 = NL + "\t" + NL + "\t\t//sincronizador.sincronizacaoUpgradeBd();" + NL + "\t\t/*Fica dando erro:                                                                                    java.lang.IllegalStateException: getDatabase called recursively" + NL + "                           at android.database.sqlite.SQLiteOpenHelper.getDatabaseLocked(SQLiteOpenHelper.java:203)" + NL + "                           at android.database.sqlite.SQLiteOpenHelper.getReadableDatabase(SQLiteOpenHelper.java:187)" + NL + "                           at br.com.lojadigicom.coletorprecocliente.data.provider.OportunidadeDiaProvider.querySinc(OportunidadeDiaProvider.java:264)" + NL + "                           at br.com.lojadigicom.coletorprecocliente.data.provider.OportunidadeDiaProvider.query(OportunidadeDiaProvider.java:123)" + NL + "                           at br.com.lojadigicom.coletorprecocliente.data.provider.AplicacaoProvider.query(AplicacaoProvider.java:146)" + NL + "                           at android.content.ContentProvider.query(ContentProvider.java:1017)" + NL + "                           at android.content.ContentProvider$Transport.query(ContentProvider.java:238)" + NL + "                           at android.content.ContentResolver.query(ContentResolver.java:491)" + NL + "                           at android.content.ContentResolver.query(ContentResolver.java:434)" + NL + "                           at br.com.lojadigicom.coletorprecocliente.remoto.OportunidadeDiaSincronismo.sincroniza(OportunidadeDiaSincronismo.java:90)" + NL + "                           at br.com.lojadigicom.coletorprecocliente.sync.Sincronizador.sincronizacaoUpgradeBd(Sincronizador.java:113)" + NL + "                           at br.com.lojadigicom.coletorprecocliente.data.helper.AplicacaoDbHelper.onUpgrade(AplicacaoDbHelper.java:272)" + NL + "                           at android.database.sqlite.SQLiteOpenHelper.getDatabaseLocked(SQLiteOpenHelper.java:256)" + NL + "                           at android.database.sqlite.SQLiteOpenHelper.getReadableDatabase(SQLiteOpenHelper.java:187)" + NL + "                           at br.com.lojadigicom.coletorprecocliente.data.provider.ProdutoClienteProvider.queryRaw(ProdutoClienteProvider.java:338)" + NL + "                           at br.com.lojadigicom.coletorprecocliente.data.provider.ProdutoClienteProvider.query(ProdutoClienteProvider.java:207)" + NL + "                           at br.com.lojadigicom.coletorprecocliente.data.provider.AplicacaoProvider.query(AplicacaoProvider.java:161)" + NL + "                           at android.content.ContentProvider.query(ContentProvider.java:1017)" + NL + "                           at android.content.ContentProvider$Transport.query(ContentProvider.java:238)" + NL + "                           at android.content.ContentResolver.query(ContentResolver.java:491)" + NL + "                           at android.support.v4.content.ContentResolverCompatJellybean.query(ContentResolverCompatJellybean.java:29)" + NL + "                           at android.support.v4.content.ContentResolverCompat$ContentResolverCompatImplJB.query(ContentResolverCompat.java:57)" + NL + "                           at android.support.v4.content.ContentResolverCompat.query(ContentResolverCompat.java:125)" + NL + "                           at android.support.v4.content.CursorLoader.loadInBackground(CursorLoader.java:59)" + NL + "                           at android.support.v4.content.CursorLoader.loadInBackground(CursorLoader.java:37)" + NL + "                           at android.support.v4.content.AsyncTaskLoader.onLoadInBackground(AsyncTaskLoader.java:299)" + NL + "                           at android.support.v4.content.AsyncTaskLoader$LoadTask.doInBackground(AsyncTaskLoader.java:57)" + NL + "                           at android.support.v4.content.AsyncTaskLoader$LoadTask.doInBackground(AsyncTaskLoader.java:45)" + NL + "                           at android.support.v4.content.ModernAsyncTask$2.call(ModernAsyncTask.java:138)" + NL + "                           at java.util.concurrent.FutureTask.run(FutureTask.java:237)" + NL + "                           at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1113)" + NL + "                           at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:588)" + NL + "                           at java.lang.Thread.run(Thread.java:818) */";
  protected final String TEXT_21 = NL + "\t\t//SQlite nao permite isso ?" + NL + "\t\t//UPDATE_SQL = ";
  protected final String TEXT_22 = "DbHelper.getSqlChavesEstrangeiras();" + NL + "\t\t//db.execSQL(UPDATE_SQL);" + NL + "\t";
  protected final String TEXT_23 = NL + "\t}" + NL + "\t" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
Recursos recursos = (Recursos) argument;  
List<ClasseWrapper> classes = recursos.getListaClasse();
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
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_8);
    
	Iterator<ClasseWrapper> iterador = classes.iterator();
	while (iterador.hasNext()) {
		ClasseWrapper corrente = iterador.next();
	
    stringBuffer.append(TEXT_9);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_11);
    
	}
	
    stringBuffer.append(TEXT_12);
    
	for (ClasseWrapper corrente : classes) {
	
    stringBuffer.append(TEXT_13);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_19);
    
	}
	
    stringBuffer.append(TEXT_20);
    
	for (ClasseWrapper corrente : classes) {
	
    stringBuffer.append(TEXT_21);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_22);
    
	}
	
    stringBuffer.append(TEXT_23);
    return stringBuffer.toString();
  }
}
