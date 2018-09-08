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
  protected final String TEXT_5 = ".data.DatabaseConst;" + NL + "" + NL + "public class AplicacaoDbHelper extends SQLiteOpenHelper{" + NL + "" + NL + "\t/*" + NL + "\tprivate static final int DATABASE_VERSION = 1;" + NL + "\tpublic static String DATABASE_NAME = \"";
  protected final String TEXT_6 = ".db\";" + NL + "\t*/" + NL + "\t//public static String DATABASE_NAME = \"/mnt/extSdCard/digidata/";
  protected final String TEXT_7 = ".db\";" + NL + "" + NL + "\tprivate static DatabaseConst databaseConst = null;" + NL + "" + NL + "\tpublic static void setDatabaseConst(DatabaseConst dbConst) {" + NL + "\t\tdatabaseConst = dbConst;" + NL + "\t}" + NL + "" + NL + "\tpublic static String getNomeBanco() {" + NL + "\t\treturn databaseConst.getName();" + NL + "\t}" + NL + "\t" + NL + "\tpublic AplicacaoDbHelper(Context context) {" + NL + "\t\t//super(context, DATABASE_NAME , null, DATABASE_VERSION);" + NL + "\t\tsuper(context,databaseConst.getName(),null,databaseConst.getVersion());" + NL + "\t}" + NL + "\t" + NL + "\t@Override" + NL + "\tpublic void onCreate(SQLiteDatabase db) {" + NL + "\t\tDCLog.d(DCLog.DATABASE_ADM,this,\"Create database em \" + databaseConst.getName());" + NL + "\t" + NL + "\t\tString CREATE_SQL = null;" + NL + "\t";
  protected final String TEXT_8 = NL + "\t\tCREATE_SQL = ";
  protected final String TEXT_9 = "DbHelper.getSqlCreate();" + NL + "\t\tdb.execSQL(CREATE_SQL);" + NL + "\t\tCREATE_SQL = ";
  protected final String TEXT_10 = "DbHelper.getSqlCreateSinc();" + NL + "\t\tdb.execSQL(CREATE_SQL);" + NL + "\t";
  protected final String TEXT_11 = NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\t@Override" + NL + "\tpublic void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {" + NL + "\t\tDCLog.d(DCLog.DATABASE_ADM,this,\"Upgrade database em \" + databaseConst.getName());" + NL + "\t\tString UPDATE_SQL = null;" + NL + "\t";
  protected final String TEXT_12 = NL + "\t\t//UPDATE_SQL = ";
  protected final String TEXT_13 = "DbHelper.onUpgrade(oldVersion,newVersion);" + NL + "\t\t//db.execSQL(UPDATE_SQL);" + NL + "\t\t//UPDATE_SQL = ";
  protected final String TEXT_14 = "DbHelper.onUpgradeSinc(oldVersion,newVersion);" + NL + "\t\t//db.execSQL(UPDATE_SQL);" + NL + "\t\tUPDATE_SQL = ";
  protected final String TEXT_15 = "DbHelper.getSqlDrop();" + NL + "\t\tdb.execSQL(UPDATE_SQL);" + NL + "\t\tUPDATE_SQL = ";
  protected final String TEXT_16 = "DbHelper.getSqlCreate();" + NL + "\t\tdb.execSQL(UPDATE_SQL);" + NL + "\t\tUPDATE_SQL = ";
  protected final String TEXT_17 = "DbHelper.getSqlDropSinc();" + NL + "\t\tdb.execSQL(UPDATE_SQL);" + NL + "\t\tUPDATE_SQL = ";
  protected final String TEXT_18 = "DbHelper.getSqlCreateSinc();" + NL + "\t\tdb.execSQL(UPDATE_SQL);" + NL + "\t";
  protected final String TEXT_19 = NL + "\t" + NL + "\t";
  protected final String TEXT_20 = NL + "\t\t//SQlite nao permite isso ?" + NL + "\t\t//UPDATE_SQL = ";
  protected final String TEXT_21 = "DbHelper.getSqlChavesEstrangeiras();" + NL + "\t\t//db.execSQL(UPDATE_SQL);" + NL + "\t";
  protected final String TEXT_22 = NL + "\t}" + NL + "\t" + NL + "}";

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
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_7);
    
	Iterator<ClasseWrapper> iterador = classes.iterator();
	while (iterador.hasNext()) {
		ClasseWrapper corrente = iterador.next();
	
    stringBuffer.append(TEXT_8);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_10);
    
	}
	
    stringBuffer.append(TEXT_11);
    
	for (ClasseWrapper corrente : classes) {
	
    stringBuffer.append(TEXT_12);
    stringBuffer.append( corrente.getNomeParaClasse() );
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
    
	}
	
    stringBuffer.append(TEXT_19);
    
	for (ClasseWrapper corrente : classes) {
	
    stringBuffer.append(TEXT_20);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_21);
    
	}
	
    stringBuffer.append(TEXT_22);
    return stringBuffer.toString();
  }
}
