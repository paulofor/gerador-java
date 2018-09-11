package jet.android2.sincronismo;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class ObjetoRemote
{
  protected static String nl;
  public static synchronized ObjetoRemote create(String lineSeparator)
  {
    nl = lineSeparator;
    ObjetoRemote result = new ObjetoRemote();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package  ";
  protected final String TEXT_2 = ".remoto;" + NL + "" + NL + "" + NL + "import android.content.ContentValues;" + NL + "import android.content.Context;" + NL + "import android.database.Cursor;" + NL + "import android.net.Uri;" + NL + "" + NL + "import org.json.JSONArray;" + NL + "import org.json.JSONException;" + NL + "import org.json.JSONObject;" + NL + "" + NL + "import java.io.BufferedReader;" + NL + "import java.io.IOException;" + NL + "import java.io.InputStream;" + NL + "import java.io.InputStreamReader;" + NL + "import java.io.UnsupportedEncodingException;" + NL + "import java.net.HttpURLConnection;" + NL + "import java.net.URL;" + NL + "import java.net.URLEncoder;" + NL + "import java.util.HashMap;" + NL + "import java.util.Map;" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".data.contract.";
  protected final String TEXT_4 = "Contract;" + NL + "import ";
  protected final String TEXT_5 = ".framework.util.UtilDatas;" + NL + "" + NL + "import ";
  protected final String TEXT_6 = ".framework.log.DCLog;" + NL + "import ";
  protected final String TEXT_7 = ".framework.telefonia.Telefone;" + NL + "" + NL + "public class ";
  protected final String TEXT_8 = "Remote {" + NL + "\t" + NL + "\tprivate int getVersaoSincronizacao() {" + NL + "        return 3;" + NL + "    }" + NL + "" + NL + "    // Alterado" + NL + "    public void listaSincronizadaAlteracao(Cursor cursor, Context contexto) throws JSONException {" + NL + "        Map<String,String> params = new HashMap<String,String>();" + NL + "        String url = getUrl(\"ListaSincronizadaAlteracao\");" + NL + "        String saida = \" [ \";" + NL + "        boolean primeiro = true;" + NL + "        cursor.moveToFirst();" + NL + "        while (cursor.isAfterLast() == false) {" + NL + "            if (primeiro) {" + NL + "                primeiro = false;" + NL + "            } else {" + NL + "                saida += \" , \";" + NL + "            }" + NL + "            // saida += \" \" + ((ObjetoSinc)item).JSonSinc() + \" \";" + NL + "            saida += \" \" + JSonAtributosSinc(cursor).toString();" + NL + "            cursor.moveToNext();" + NL + "        }" + NL + "        saida += \" ] \";" + NL + "        params.put(\"lista\", saida);" + NL + "        params.put(\"versao\",String.valueOf(getVersaoSincronizacao()));" + NL + "        //if (!Dispositivo.isTablet(contexto)) {" + NL + "        params.put(\"tmp\",Telefone.getNumero(contexto));" + NL + "        //} else {" + NL + "        //    params.put(\"cod\",Dispositivo.getId(contexto));" + NL + "        //}" + NL + "        DCLog.d(DCLog.SINCRONIZACAO_JSON,this,\"Enviando...lista<NaturezaProduto>:\" + saida);" + NL + "        String resultado = getHttpResponse(url,params);" + NL + "        // mensagem, recebi lista com dois elementos." + NL + "    }" + NL + "" + NL + "    private byte[] montaParametros(Map<String,String> params) throws UnsupportedEncodingException {" + NL + "        StringBuilder postData = new StringBuilder();" + NL + "        for (Map.Entry<String, String> param : params.entrySet()) {" + NL + "            if (postData.length() != 0) postData.append('&');" + NL + "            postData.append(URLEncoder.encode(param.getKey(), \"UTF-8\"));" + NL + "            postData.append('=');" + NL + "            postData.append(URLEncoder.encode(String.valueOf(param.getValue()), \"UTF-8\"));" + NL + "        }" + NL + "        byte[] postDataBytes = postData.toString().getBytes(\"UTF-8\");" + NL + "        return postDataBytes;" + NL + "    }" + NL + "" + NL + "    private String getHttpResponse(String urlEnt, Map<String,String> params) {" + NL + "        HttpURLConnection urlConnection = null;" + NL + "        BufferedReader reader = null;" + NL + "" + NL + "        try {" + NL + "            byte[] parametros = montaParametros(params);" + NL + "            URL url = new URL(urlEnt);" + NL + "\t\t\tDCLog.d(DCLog.SINCRONIZACAO_JSON,this,urlEnt);" + NL + "\t\t\t" + NL + "            urlConnection = (HttpURLConnection) url.openConnection();" + NL + "            urlConnection.setRequestMethod(\"POST\");" + NL + "            urlConnection.setRequestProperty(\"Content-Type\", \"application/x-www-form-urlencoded\");" + NL + "            urlConnection.setRequestProperty(\"Content-Length\", String.valueOf(parametros.length));" + NL + "            urlConnection.setDoOutput(true);" + NL + "            urlConnection.getOutputStream().write(parametros);" + NL + "" + NL + "            // Read the input stream into a String" + NL + "            InputStream inputStream = urlConnection.getInputStream();" + NL + "            StringBuffer buffer = new StringBuffer();" + NL + "            if (inputStream == null) {" + NL + "                // Nothing to do." + NL + "                return null;" + NL + "            }" + NL + "            reader = new BufferedReader(new InputStreamReader(inputStream));" + NL + "" + NL + "            String line;" + NL + "            while ((line = reader.readLine()) != null) {" + NL + "                buffer.append(line + \"\\n\");" + NL + "            }" + NL + "" + NL + "            if (buffer.length() == 0) {" + NL + "                return null;" + NL + "            }" + NL + "            return buffer.toString();" + NL + "        } catch (IOException e) {" + NL + "        \tDCLog.e(DCLog.SINCRONIZACAO_JSON,this,e);" + NL + "        } finally {" + NL + "            if (urlConnection != null) {" + NL + "                urlConnection.disconnect();" + NL + "            }" + NL + "            if (reader != null) {" + NL + "                try {" + NL + "                    reader.close();" + NL + "                } catch (final IOException e) {" + NL + "                }" + NL + "            }" + NL + "        }" + NL + "        return null;" + NL + "    }" + NL + "" + NL + "   " + NL + "" + NL + "    private String getUrl(String metodo) {" + NL + "        String objeto = \"";
  protected final String TEXT_9 = "\";" + NL + "        String ultimaUrl = \"http://\" + DataSourceRemoto.getServer() + \"/\" + (DataSourceRemoto.getAplicacao()!=null?DataSourceRemoto.getAplicacao() + \"/\":\"\") + objeto + \"WS/\" + metodo + getRequest();" + NL + "        return ultimaUrl;" + NL + "        //return \"http://\" + server + \"/\" + aplicacao + \"/\" + objeto + \"/\" + metodo + getFiltro().getRequest();" + NL + "    }" + NL + "" + NL + "    public String getRequest() {" + NL + "        String saida = \"\";" + NL + "        //if (_CodigoPesquisa!=null)" + NL + "        //    saida += \"&CodigoPesquisa=\"+_CodigoPesquisa;" + NL + "        return saida;" + NL + "    }" + NL + "" + NL + "    public int listaSincronizadaDao(Context contexto, boolean delete) throws JSONException {" + NL + "        " + NL + "" + NL + "        int tam = 0;" + NL + "        String urlEnt = getUrl(\"ListaSincronizada\");" + NL + "        //if (!Dispositivo.isTablet(contexto)) {" + NL + "        String numeroTel = Telefone.getNumero(contexto);" + NL + "        urlEnt += \"?tmp=\" + numeroTel + \"&versao=\" + getVersaoSincronizacao();" + NL + "        //} else {" + NL + "        //    String codId = Dispositivo.getId(contexto);" + NL + "        //    url += \"?cod=\" + codId + \"&versao=\" + getVersaoSincronizacao();" + NL + "        //}" + NL + "        HttpURLConnection urlConnection = null;" + NL + "        BufferedReader reader = null;" + NL + "" + NL + "        try {" + NL + "" + NL + "            URL url = new URL(urlEnt);" + NL + "" + NL + "            urlConnection = (HttpURLConnection) url.openConnection();" + NL + "            urlConnection.setRequestMethod(\"GET\");" + NL + "            urlConnection.setRequestProperty(\"Content-Type\", \"application/x-www-form-urlencoded\");" + NL + "" + NL + "            // Read the input stream into a String" + NL + "            InputStream inputStream = urlConnection.getInputStream();" + NL + "            StringBuffer buffer = new StringBuffer();" + NL + "            if (inputStream == null) {" + NL + "                // Nothing to do." + NL + "                return tam;" + NL + "            }" + NL + "            reader = new BufferedReader(new InputStreamReader(inputStream));" + NL + "" + NL + "            String line;" + NL + "            JSONObject obj = null;" + NL + "            if ((line = reader.readLine()) != null) {" + NL + "                obj = new JSONObject(line);" + NL + "                buffer.append(line + \"\\n\");" + NL + "            }" + NL + "            if (buffer.length() == 0) {" + NL + "                return tam;" + NL + "            }" + NL + "" + NL + "            JSONArray lista = obj.getJSONArray(\"Lista\");" + NL + "            tam = lista.length();" + NL + "         " + NL + "            ContentValues[] vetor = new ContentValues[lista.length()];" + NL + "            for (int x = 0 ; x < lista.length() ; x++) {" + NL + "                JSONObject item = lista.getJSONObject(x);" + NL + "                ContentValues valor = this.ContentValuesAtributos(item);" + NL + "                vetor[x] = valor;" + NL + "            }" + NL + "            if (delete) {" + NL + "                contexto.getContentResolver().delete(";
  protected final String TEXT_10 = "Contract.buildDeleteAllRecreate(), null, null);" + NL + "            }" + NL + "            contexto.getContentResolver().bulkInsert(";
  protected final String TEXT_11 = "Contract.getContentUri(), vetor);" + NL + "" + NL + " \t\t\tDCLog.d(DCLog.SINCRONIZACAO_JSON, this, \"Url:\" + url);" + NL + "            DCLog.d(DCLog.SINCRONIZACAO_JSON,this,buffer.toString());" + NL + "            " + NL + "            return tam;" + NL + "        } catch (Exception e) {" + NL + "        \tDCLog.e(DCLog.SINCRONIZACAO_JSON,this,\"Url:\" + urlEnt);" + NL + "        \tDCLog.e(DCLog.SINCRONIZACAO_JSON,this,e);" + NL + "        } finally {" + NL + "            if (urlConnection != null) {" + NL + "                urlConnection.disconnect();" + NL + "            }" + NL + "            if (reader != null) {" + NL + "                try {" + NL + "                    reader.close();" + NL + "                } catch (final IOException e) {" + NL + "                }" + NL + "            }" + NL + "        }" + NL + "        return tam;" + NL + "    }" + NL + "" + NL + "  \tpublic int listaSincronizadaDaoAtualizaPorId(Context contexto, boolean delete, String codigoAplicacao) throws JSONException {" + NL + "        int tam = 0;" + NL + "        String urlEnt = getUrl(\"ListaSincronizada\");" + NL + "        String numeroTel = Telefone.getNumero(contexto);" + NL + "        urlEnt += \"?tmp=\" + numeroTel + \"&versao=\" + getVersaoSincronizacao() + \"&app=\" + codigoAplicacao;" + NL + "        HttpURLConnection urlConnection = null;" + NL + "        BufferedReader reader = null;" + NL + "        try {" + NL + "            URL url = new URL(urlEnt);" + NL + "            urlConnection = (HttpURLConnection) url.openConnection();" + NL + "            urlConnection.setRequestMethod(\"GET\");" + NL + "            urlConnection.setRequestProperty(\"Content-Type\", \"application/x-www-form-urlencoded\");" + NL + "            InputStream inputStream = urlConnection.getInputStream();" + NL + "            StringBuffer buffer = new StringBuffer();" + NL + "            if (inputStream == null) {" + NL + "                return tam;" + NL + "            }" + NL + "            reader = new BufferedReader(new InputStreamReader(inputStream));" + NL + "            String line;" + NL + "            JSONObject obj = null;" + NL + "            if ((line = reader.readLine()) != null) {" + NL + "                obj = new JSONObject(line);" + NL + "                buffer.append(line + \"\\n\");" + NL + "            }" + NL + "            if (buffer.length() == 0) {" + NL + "                return tam;" + NL + "            }" + NL + "            JSONArray lista = obj.getJSONArray(\"Lista\");" + NL + "            tam = lista.length();" + NL + "            ContentValues[] vetor = new ContentValues[lista.length()];" + NL + "            for (int x = 0 ; x < lista.length() ; x++) {" + NL + "                JSONObject item = lista.getJSONObject(x);" + NL + "                ContentValues valor = this.ContentValuesAtributos(item);" + NL + "                //vetor[x] = valor;" + NL + "                String where = \"";
  protected final String TEXT_12 = "=\" + valor.getAsString(\"";
  protected final String TEXT_13 = "\");" + NL + "                contexto.getContentResolver().update(";
  protected final String TEXT_14 = "Contract.buildAtualiza(),valor,where,null);" + NL + "            }" + NL + "" + NL + "            DCLog.d(DCLog.SINCRONIZACAO_JSON, this, \"Url:\" + url);" + NL + "            DCLog.d(DCLog.SINCRONIZACAO_JSON,this,buffer.toString());" + NL + "            return tam;" + NL + "        } catch (Exception e) {" + NL + "            DCLog.e(DCLog.SINCRONIZACAO_JSON,this,\"Url:\" + urlEnt);" + NL + "            DCLog.e(DCLog.SINCRONIZACAO_JSON,this,e);" + NL + "        } finally {" + NL + "            if (urlConnection != null) {" + NL + "                urlConnection.disconnect();" + NL + "            }" + NL + "            if (reader != null) {" + NL + "                try {" + NL + "                    reader.close();" + NL + "                } catch (final IOException e) {" + NL + "                }" + NL + "            }" + NL + "        }" + NL + "        return tam;" + NL + "    }" + NL + "" + NL + "    public int listaSincronizadaDao(Context contexto, boolean delete, String codigoAplicacao) throws JSONException {" + NL + "        int tam = 0;" + NL + "        String urlEnt = getUrl(\"ListaSincronizada\");" + NL + "        String numeroTel = Telefone.getNumero(contexto);" + NL + "        urlEnt += \"?tmp=\" + numeroTel + \"&versao=\" + getVersaoSincronizacao() + \"&app=\" + codigoAplicacao;" + NL + "        HttpURLConnection urlConnection = null;" + NL + "        BufferedReader reader = null;" + NL + "        try {" + NL + "            URL url = new URL(urlEnt);" + NL + "            urlConnection = (HttpURLConnection) url.openConnection();" + NL + "            urlConnection.setRequestMethod(\"GET\");" + NL + "            urlConnection.setRequestProperty(\"Content-Type\", \"application/x-www-form-urlencoded\");" + NL + "            InputStream inputStream = urlConnection.getInputStream();" + NL + "            StringBuffer buffer = new StringBuffer();" + NL + "            if (inputStream == null) {" + NL + "                return tam;" + NL + "            }" + NL + "            reader = new BufferedReader(new InputStreamReader(inputStream));" + NL + "            String line;" + NL + "            JSONObject obj = null;" + NL + "            if ((line = reader.readLine()) != null) {" + NL + "                obj = new JSONObject(line);" + NL + "                buffer.append(line + \"\\n\");" + NL + "            }" + NL + "            if (buffer.length() == 0) {" + NL + "                return tam;" + NL + "            }" + NL + "            JSONArray lista = obj.getJSONArray(\"Lista\");" + NL + "            tam = lista.length();" + NL + "            ContentValues[] vetor = new ContentValues[lista.length()];" + NL + "            for (int x = 0 ; x < lista.length() ; x++) {" + NL + "                JSONObject item = lista.getJSONObject(x);" + NL + "                ContentValues valor = this.ContentValuesAtributos(item);" + NL + "                vetor[x] = valor;" + NL + "            }" + NL + "            if (delete) {" + NL + "                contexto.getContentResolver().delete(";
  protected final String TEXT_15 = "Contract.buildDeleteAllRecreate(), null, null);" + NL + "            }" + NL + "            contexto.getContentResolver().bulkInsert(";
  protected final String TEXT_16 = "Contract.getContentUri(), vetor);" + NL + " \t\t\tDCLog.d(DCLog.SINCRONIZACAO_JSON, this, \"Url:\" + url);" + NL + "            DCLog.d(DCLog.SINCRONIZACAO_JSON,this,buffer.toString());" + NL + "            return tam;" + NL + "        } catch (Exception e) {" + NL + "        \tDCLog.e(DCLog.SINCRONIZACAO_JSON,this,\"Url:\" + urlEnt);" + NL + "        \tDCLog.e(DCLog.SINCRONIZACAO_JSON,this,e);" + NL + "        } finally {" + NL + "            if (urlConnection != null) {" + NL + "                urlConnection.disconnect();" + NL + "            }" + NL + "            if (reader != null) {" + NL + "                try {" + NL + "                    reader.close();" + NL + "                } catch (final IOException e) {" + NL + "                }" + NL + "            }" + NL + "        }" + NL + "        return tam;" + NL + "    }" + NL + "" + NL + "" + NL + "" + NL + " \t" + NL + "    private JSONObject JSonAtributos(Cursor c) throws JSONException {" + NL + "        int pos = 0;" + NL + "        JSONObject json = new JSONObject();" + NL + "        ";
  protected final String TEXT_17 = "\t" + NL + "\t\t";
  protected final String TEXT_18 = NL + "\t\t// Tipo Logico precisa ser convertido para a leitura correta no servidor." + NL + "\t\tjson.put(\"";
  protected final String TEXT_19 = "\",c.getInt(";
  protected final String TEXT_20 = "Contract.COL_";
  protected final String TEXT_21 = ")==1);" + NL + "\t\t";
  protected final String TEXT_22 = NL + "\t\tjson.put(\"";
  protected final String TEXT_23 = "\",c.getString(";
  protected final String TEXT_24 = "Contract.COL_";
  protected final String TEXT_25 = "));" + NL + "\t\t";
  protected final String TEXT_26 = NL + "\t\t";
  protected final String TEXT_27 = NL + "        return json;" + NL + "    }" + NL + "     private JSONObject JSonAtributosSinc(Cursor c) throws JSONException {" + NL + "        JSONObject json = JSonAtributos(c);" + NL + "        json.put(\"OperacaoSinc\",c.getString(";
  protected final String TEXT_28 = "Contract.COL_OPERACAO_SINC));" + NL + "        return json;" + NL + "    }" + NL + "    " + NL + "" + NL + "    private ContentValues ContentValuesAtributos(JSONObject obj) throws JSONException {" + NL + "        ContentValues valores = new ContentValues();";
  protected final String TEXT_29 = NL + "\t\tvalores.put(";
  protected final String TEXT_30 = "Contract.COLUNA_";
  protected final String TEXT_31 = ", obj.getLong(\"";
  protected final String TEXT_32 = "\"));" + NL + "\t\t";
  protected final String TEXT_33 = NL + "\t\tvalores.put(";
  protected final String TEXT_34 = "Contract.COLUNA_";
  protected final String TEXT_35 = ", obj.getLong(\"";
  protected final String TEXT_36 = "\"));" + NL + "\t\t";
  protected final String TEXT_37 = "\t" + NL + "\t\tint val";
  protected final String TEXT_38 = " = 0;" + NL + "\t\tif (\"True\".equals(obj.getString(\"";
  protected final String TEXT_39 = "\"))) {" + NL + "\t\t\tval";
  protected final String TEXT_40 = " = 1;" + NL + "\t\t}" + NL + "\t\tvalores.put(";
  protected final String TEXT_41 = "Contract.COLUNA_";
  protected final String TEXT_42 = ", val";
  protected final String TEXT_43 = ");" + NL + "\t\t";
  protected final String TEXT_44 = NL + "\t\tvalores.put(";
  protected final String TEXT_45 = "Contract.COLUNA_";
  protected final String TEXT_46 = ", obj.getString(\"";
  protected final String TEXT_47 = "\"));" + NL + "\t\t";
  protected final String TEXT_48 = NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_49 = NL + "\t\t";
  protected final String TEXT_50 = "\t" + NL + "\t\tint val";
  protected final String TEXT_51 = " = 0;" + NL + "\t\tif (\"True\".equals(obj.getString(\"";
  protected final String TEXT_52 = "\"))) {" + NL + "\t\t\tval";
  protected final String TEXT_53 = " = 1;" + NL + "\t\t}" + NL + "\t\tvalores.put(";
  protected final String TEXT_54 = "Contract.COLUNA_";
  protected final String TEXT_55 = ", val";
  protected final String TEXT_56 = ");" + NL + "\t\t";
  protected final String TEXT_57 = NL + "\t\tvalores.put(";
  protected final String TEXT_58 = "Contract.COLUNA_";
  protected final String TEXT_59 = ", obj.getString(\"";
  protected final String TEXT_60 = "\"));" + NL + "\t\t";
  protected final String TEXT_61 = NL + "\t\t";
  protected final String TEXT_62 = NL + "        return valores;" + NL + "    }" + NL + "" + NL + "}" + NL + NL;
  protected final String TEXT_63 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( classe.getChaveW().getNomeCampoTabela() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( classe.getChaveW().getNomeCampoTabela());
    stringBuffer.append(TEXT_13);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_16);
    
		Iterator<AtributoTotalI> iteradorAtt1 = classe.getListaAtributoTotal().iterator();
		while (iteradorAtt1.hasNext()) {
		AtributoTotalI atributoJson = iteradorAtt1.next();
		
    stringBuffer.append(TEXT_17);
     if (atributoJson.ehLogico()) { 
    stringBuffer.append(TEXT_18);
    stringBuffer.append( atributoJson.getNomePropriedade() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( atributoJson.getNomeConstante() );
    stringBuffer.append(TEXT_21);
     } else { 
    stringBuffer.append(TEXT_22);
    stringBuffer.append( atributoJson.getNomePropriedade() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( atributoJson.getNomeConstante() );
    stringBuffer.append(TEXT_25);
     } 
    stringBuffer.append(TEXT_26);
    
		}
		
    stringBuffer.append(TEXT_27);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_28);
    
        iteradorAtt1 = classe.getListaAtributoTotal().iterator();
		while (iteradorAtt1.hasNext()) {
		AtributoTotalI atributoJson = iteradorAtt1.next();
		if (atributoJson.ehData() ) {
			if (atributoJson.ehHora() ) {
			// DataHora
		
    stringBuffer.append(TEXT_29);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_30);
    stringBuffer.append( atributoJson.getNomeConstante() );
    stringBuffer.append(TEXT_31);
    stringBuffer.append( atributoJson.getNomePropriedade() );
    stringBuffer.append(TEXT_32);
    
			} else {
			// Data
		
    stringBuffer.append(TEXT_33);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_34);
    stringBuffer.append( atributoJson.getNomeConstante() );
    stringBuffer.append(TEXT_35);
    stringBuffer.append( atributoJson.getNomePropriedade() );
    stringBuffer.append(TEXT_36);
    
			}
		} else {
		if (atributoJson.ehLogico()) {
		
    stringBuffer.append(TEXT_37);
    stringBuffer.append( atributoJson.getNomePropriedade() );
    stringBuffer.append(TEXT_38);
    stringBuffer.append( atributoJson.getNomePropriedade() );
    stringBuffer.append(TEXT_39);
    stringBuffer.append( atributoJson.getNomePropriedade() );
    stringBuffer.append(TEXT_40);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_41);
    stringBuffer.append( atributoJson.getNomeConstante() );
    stringBuffer.append(TEXT_42);
    stringBuffer.append( atributoJson.getNomePropriedade() );
    stringBuffer.append(TEXT_43);
     } else { 
    stringBuffer.append(TEXT_44);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_45);
    stringBuffer.append( atributoJson.getNomeConstante() );
    stringBuffer.append(TEXT_46);
    stringBuffer.append( atributoJson.getNomePropriedade() );
    stringBuffer.append(TEXT_47);
    
		}
		}
		}
		
    stringBuffer.append(TEXT_48);
     for (ProcValorWrapper proc : classe.getListaDerivadaDemanda() ) { 
    stringBuffer.append(TEXT_49);
    
		if (proc.ehLogico()) {
		
    stringBuffer.append(TEXT_50);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_51);
    stringBuffer.append( proc.getNomePropriedade() );
    stringBuffer.append(TEXT_52);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_53);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_54);
    stringBuffer.append( proc.getNomeConstante() );
    stringBuffer.append(TEXT_55);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_56);
     } else { 
    stringBuffer.append(TEXT_57);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_58);
    stringBuffer.append( proc.getNomeConstante() );
    stringBuffer.append(TEXT_59);
    stringBuffer.append( proc.getNomePropriedade() );
    stringBuffer.append(TEXT_60);
    
		}
		
    stringBuffer.append(TEXT_61);
     } 
    stringBuffer.append(TEXT_62);
    stringBuffer.append(TEXT_63);
    return stringBuffer.toString();
  }
}
