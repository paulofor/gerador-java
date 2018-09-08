package jet.android.data;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class ContentProviderAplicacao
{
  protected static String nl;
  public static synchronized ContentProviderAplicacao create(String lineSeparator)
  {
    nl = lineSeparator;
    ContentProviderAplicacao result = new ContentProviderAplicacao();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package  ";
  protected final String TEXT_3 = ".data.provider;" + NL + "" + NL + "import ";
  protected final String TEXT_4 = ".data.helper.AplicacaoDbHelper;" + NL + "import android.content.ContentProvider;" + NL + "import android.content.ContentValues;" + NL + "import android.content.UriMatcher;" + NL + "import android.database.Cursor;" + NL + "import android.database.sqlite.SQLiteDatabase;" + NL + "import android.net.Uri;" + NL + "import java.util.List;" + NL + "" + NL + "public abstract class AplicacaoProvider extends ContentProvider {" + NL + "" + NL + "\tprivate static final UriMatcher sUriMatcher = buildUriMatcher();" + NL + "\t";
  protected final String TEXT_5 = NL + "\tprivate ";
  protected final String TEXT_6 = "Provider ";
  protected final String TEXT_7 = "Provider = cria";
  protected final String TEXT_8 = "Provider();" + NL + "\tprotected abstract ";
  protected final String TEXT_9 = "Provider cria";
  protected final String TEXT_10 = "Provider();" + NL + "\t\t";
  protected final String TEXT_11 = NL + NL + "\tpublic static UriMatcher buildUriMatcher() {" + NL + "" + NL + "        final UriMatcher matcher = new UriMatcher(UriMatcher.NO_MATCH);" + NL + "        //final String authority = AplicacaoContract.CONTENTI_AUTHORITY;" + NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_12 = NL + "\t\t";
  protected final String TEXT_13 = "Provider.buildUriMatcher(matcher);" + NL + "\t\t";
  protected final String TEXT_14 = NL + "        //matcher.addURI(authority, WeatherContract.PATH_WEATHER, WEATHER);" + NL + "        //matcher.addURI(authority, WeatherContract.PATH_WEATHER + \"/*\", WEATHER_WITH_LOCATION);" + NL + "        //matcher.addURI(authority, WeatherContract.PATH_WEATHER + \"/*/#\", WEATHER_WITH_LOCATION_AND_DATE);" + NL + "        //matcher.addURI(authority, WeatherContract.PATH_LOCATION, LOCATION);" + NL + "        return matcher;" + NL + "    }" + NL + "" + NL + "" + NL + "\tprivate AplicacaoDbHelper mOpenHelper;" + NL + "" + NL + "\t@Override" + NL + "\tpublic boolean onCreate() {" + NL + "\t\tmOpenHelper = new AplicacaoDbHelper(getContext());" + NL + "\t\t";
  protected final String TEXT_15 = NL + "\t\t";
  protected final String TEXT_16 = "Provider.setAplicacaoDbHelper(mOpenHelper);" + NL + "\t\t";
  protected final String TEXT_17 = "Provider.setContentProvider(this);" + NL + "\t\t";
  protected final String TEXT_18 = NL + "\t    return true;" + NL + "\t}" + NL + "" + NL + "\t@Override" + NL + "\tpublic Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {" + NL + "\t\tList<String> lista = uri.getPathSegments();" + NL + "\t\tCursor retCursor = null;" + NL + "\t\t";
  protected final String TEXT_19 = NL + "\t\tif (\"";
  protected final String TEXT_20 = "\".equals(lista.get(0)))" + NL + "\t\t\tretCursor = ";
  protected final String TEXT_21 = "Provider.query(sUriMatcher, uri, projection, selection, selectionArgs, sortOrder);" + NL + "\t\t";
  protected final String TEXT_22 = NL + "\t\tif (retCursor==null)" + NL + "\t\t\t throw new UnsupportedOperationException(\"Uri desconhecida: \" + uri);" + NL + "\t\t" + NL + "\t\t" + NL + "\t\tretCursor.setNotificationUri(getContext().getContentResolver(), uri);" + NL + "        return retCursor;" + NL + "\t}" + NL + "" + NL + "\t@Override" + NL + "\tpublic String getType(Uri uri) {" + NL + "\t\tList<String> lista = uri.getPathSegments();" + NL + "\t\tfinal int match = sUriMatcher.match(uri);" + NL + "        String tipo = null;" + NL + "\t\t";
  protected final String TEXT_23 = NL + "\t\tif (tipo==null) " + NL + "\t\t\ttipo = ";
  protected final String TEXT_24 = "Provider.getType(sUriMatcher, uri);" + NL + "\t\t";
  protected final String TEXT_25 = NL + "\t\tif (tipo==null)" + NL + "\t\t\t throw new UnsupportedOperationException(\"Uri desconhecida: \" + uri);" + NL + "        return tipo;" + NL + "\t}" + NL + "" + NL + "\t@Override" + NL + "\tpublic Uri insert(Uri uri, ContentValues values) {" + NL + "\t\tList<String> lista = uri.getPathSegments();" + NL + "\t\tfinal SQLiteDatabase db = mOpenHelper.getWritableDatabase();" + NL + "        final int match = sUriMatcher.match(uri);" + NL + "        Uri returnUri = null;" + NL + "\t\t";
  protected final String TEXT_26 = NL + "\t\tif (\"";
  protected final String TEXT_27 = "\".equals(lista.get(0)))" + NL + "\t\t\treturnUri = ";
  protected final String TEXT_28 = "Provider.insert(uri, values);" + NL + "\t\t";
  protected final String TEXT_29 = NL + "\t\tif (returnUri==null)" + NL + "\t\t\t throw new UnsupportedOperationException(\"Uri desconhecida: \" + uri);" + NL + "\t\t// Como essa notifica??o funciona ?" + NL + "\t\tgetContext().getContentResolver().notifyChange(uri, null);" + NL + "        return returnUri;" + NL + "\t}" + NL + "" + NL + "\t@Override" + NL + "\tpublic int delete(Uri uri, String selection, String[] selectionArgs) {" + NL + "\t\tList<String> lista = uri.getPathSegments();" + NL + "\t\tfinal SQLiteDatabase db = mOpenHelper.getWritableDatabase();" + NL + "        final int match = sUriMatcher.match(uri);" + NL + "        int rowsDeleted = 0;" + NL + "        boolean matchOk = false;" + NL + "\t\t";
  protected final String TEXT_30 = NL + "\t\tif (\"";
  protected final String TEXT_31 = "\".equals(lista.get(0))) " + NL + "\t\t\tmatchOk = ";
  protected final String TEXT_32 = "Provider.delete(sUriMatcher, uri, selection, selectionArgs);" + NL + "\t\t\tif (matchOk) rowsDeleted = ";
  protected final String TEXT_33 = "Provider.getLinhas();" + NL + "\t\t";
  protected final String TEXT_34 = NL + "\t\tif (!matchOk)" + NL + "\t\t\t throw new UnsupportedOperationException(\"Uri desconhecida: \" + uri);" + NL + "\t\t// Rever" + NL + "\t\tif (rowsDeleted != 0) {" + NL + "            getContext().getContentResolver().notifyChange(uri, null);" + NL + "        }" + NL + "        return rowsDeleted;" + NL + "\t}" + NL + "" + NL + "\t@Override" + NL + "\tpublic int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {" + NL + "\t\tList<String> lista = uri.getPathSegments();" + NL + "\t\tfinal SQLiteDatabase db = mOpenHelper.getWritableDatabase();" + NL + "        final int match = sUriMatcher.match(uri);" + NL + "        int rowsUpdated = 0;" + NL + "        boolean matchOk = false;" + NL + "\t\t";
  protected final String TEXT_35 = NL + "\t\tif (\"";
  protected final String TEXT_36 = "\".equals(lista.get(0))) { " + NL + "\t\t\tif (selection==null) {" + NL + "\t\t\t\tmatchOk = ";
  protected final String TEXT_37 = "Provider.update(uri, values);" + NL + "\t\t\t} else {" + NL + "\t\t\t\tmatchOk = ";
  protected final String TEXT_38 = "Provider.update(uri, values, selection, selectionArgs);" + NL + "\t\t\t}" + NL + "\t\t\tif (matchOk) rowsUpdated = ";
  protected final String TEXT_39 = "Provider.getLinhas();" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_40 = NL + "\t\tif (!matchOk)" + NL + "\t\t\t throw new UnsupportedOperationException(\"Uri desconhecida: \" + uri);" + NL + "\t\t// Rever" + NL + "\t\tif (rowsUpdated != 0) {" + NL + "            getContext().getContentResolver().notifyChange(uri, null);" + NL + "        }" + NL + "        return rowsUpdated;" + NL + "\t}" + NL + "\t@Override" + NL + "\tpublic int bulkInsert(Uri uri, ContentValues[] values) {" + NL + "\t\tList<String> lista = uri.getPathSegments();" + NL + "\t\tString path = uri.getPath();" + NL + "\t\tfinal SQLiteDatabase db = mOpenHelper.getWritableDatabase();" + NL + "\t\tfinal int match = sUriMatcher.match(uri);" + NL + "\t\tint rowsUpdated = 0;" + NL + "\t\tboolean matchOk = false;";
  protected final String TEXT_41 = NL + "\t\tif (\"";
  protected final String TEXT_42 = "\".equals(lista.get(0)))" + NL + "\t\t\trowsUpdated =  ";
  protected final String TEXT_43 = "Provider.bulkInsert(uri, values);" + NL + "\t\t";
  protected final String TEXT_44 = NL + "\t\treturn rowsUpdated;" + NL + "\t}" + NL + "\t" + NL + "}";

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
    
		Iterator<ClasseWrapper> iterador = classes.iterator();
		while (iterador.hasNext()) {
			ClasseWrapper corrente = iterador.next();
		
    stringBuffer.append(TEXT_5);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( corrente.getNomeParaVariavel() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_10);
    
		}
		
    stringBuffer.append(TEXT_11);
    
		iterador = classes.iterator();
		while (iterador.hasNext()) {
			ClasseWrapper corrente = iterador.next();
		
    stringBuffer.append(TEXT_12);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_13);
    
		}
		
    stringBuffer.append(TEXT_14);
    
		iterador = classes.iterator();
		while (iterador.hasNext()) {
			ClasseWrapper corrente = iterador.next();
		
    stringBuffer.append(TEXT_15);
    stringBuffer.append( corrente.getNomeParaVariavel() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( corrente.getNomeParaVariavel() );
    stringBuffer.append(TEXT_17);
    
		}
		
    stringBuffer.append(TEXT_18);
    
		iterador = classes.iterator();
		while (iterador.hasNext()) {
			ClasseWrapper corrente = iterador.next();
		
    stringBuffer.append(TEXT_19);
    stringBuffer.append( corrente.getNomeParaTabela() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( corrente.getNomeParaVariavel() );
    stringBuffer.append(TEXT_21);
    
		}
		
    stringBuffer.append(TEXT_22);
    
		iterador = classes.iterator();
		while (iterador.hasNext()) {
			ClasseWrapper corrente = iterador.next();
		
    stringBuffer.append(TEXT_23);
    stringBuffer.append( corrente.getNomeParaVariavel() );
    stringBuffer.append(TEXT_24);
    
		}
		
    stringBuffer.append(TEXT_25);
    
		iterador = classes.iterator();
		while (iterador.hasNext()) {
			ClasseWrapper corrente = iterador.next();
		
    stringBuffer.append(TEXT_26);
    stringBuffer.append( corrente.getNomeParaTabela() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( corrente.getNomeParaVariavel() );
    stringBuffer.append(TEXT_28);
    
		}
		
    stringBuffer.append(TEXT_29);
    
		iterador = classes.iterator();
		while (iterador.hasNext()) {
			ClasseWrapper corrente = iterador.next();
		
    stringBuffer.append(TEXT_30);
    stringBuffer.append( corrente.getNomeParaTabela() );
    stringBuffer.append(TEXT_31);
    stringBuffer.append( corrente.getNomeParaVariavel() );
    stringBuffer.append(TEXT_32);
    stringBuffer.append( corrente.getNomeParaVariavel() );
    stringBuffer.append(TEXT_33);
    
		}
		
    stringBuffer.append(TEXT_34);
    
		iterador = classes.iterator();
		while (iterador.hasNext()) {
			ClasseWrapper corrente = iterador.next();
		
    stringBuffer.append(TEXT_35);
    stringBuffer.append( corrente.getNomeParaTabela() );
    stringBuffer.append(TEXT_36);
    stringBuffer.append( corrente.getNomeParaVariavel() );
    stringBuffer.append(TEXT_37);
    stringBuffer.append( corrente.getNomeParaVariavel() );
    stringBuffer.append(TEXT_38);
    stringBuffer.append( corrente.getNomeParaVariavel() );
    stringBuffer.append(TEXT_39);
    
		}
		
    stringBuffer.append(TEXT_40);
    
		iterador = classes.iterator();
		while (iterador.hasNext()) {
			ClasseWrapper corrente = iterador.next();
		
    stringBuffer.append(TEXT_41);
    stringBuffer.append( corrente.getNomeParaTabela() );
    stringBuffer.append(TEXT_42);
    stringBuffer.append( corrente.getNomeParaVariavel() );
    stringBuffer.append(TEXT_43);
    
		}
		
    stringBuffer.append(TEXT_44);
    return stringBuffer.toString();
  }
}
