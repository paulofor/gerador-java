package jet.android.servico;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class ServicoJsonBase
{
  protected static String nl;
  public static synchronized ServicoJsonBase create(String lineSeparator)
  {
    nl = lineSeparator;
    ServicoJsonBase result = new ServicoJsonBase();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + NL + "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import java.util.HashMap;" + NL + "import java.util.List;" + NL + "import java.util.Map;" + NL + "import java.util.LinkedList;" + NL + "" + NL + "import org.json.JSONArray;" + NL + "import org.json.JSONException;" + NL + "import org.json.JSONObject;" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".dao.datasource.DataSourceRemoto;" + NL + "import ";
  protected final String TEXT_4 = ".modelo.*;" + NL + "import ";
  protected final String TEXT_5 = ".modelo.vo.FabricaVo;" + NL + "import ";
  protected final String TEXT_6 = ".servico.";
  protected final String TEXT_7 = "Servico;" + NL + "import ";
  protected final String TEXT_8 = ".servico.FabricaServico;" + NL + "import ";
  protected final String TEXT_9 = ".app.Constantes;" + NL + "import ";
  protected final String TEXT_10 = ".app.TrataErro;" + NL + "import android.content.Context;" + NL + "import br.com.digicom.activity.DigicomContexto;" + NL + "import br.com.digicom.log.DCLog;" + NL + "import br.com.digicom.modelo.DCIObjetoDominio;" + NL + "import br.com.digicom.modelo.ObjetoSinc;" + NL + "import br.com.digicom.network.HTTPRequestHelper;" + NL + "import br.com.digicom.servico.DataSourceRemotoI;" + NL + "import br.com.digicom.servico.ServicoLocal;" + NL + "import br.com.digicom.servico.ServicoRemoto;" + NL + "import br.com.digicom.so.Dispositivo;" + NL + "import br.com.digicom.telefonia.Telefone;" + NL + "import br.com.digicom.dao.DaoSincronismo;" + NL + "" + NL + "" + NL + "public abstract class ";
  protected final String TEXT_11 = "ServicoWsJsonBase " + NL + "\t\textends  ";
  protected final String TEXT_12 = "Servico " + NL + "\t\timplements ServicoRemoto<";
  protected final String TEXT_13 = ">{" + NL + "" + NL + "\tprivate List<";
  protected final String TEXT_14 = "> listaSaida = null;" + NL + "\tprivate String ultimaUrl = null;" + NL + "\tprivate DataSourceRemotoI dataSource = null;" + NL + "\t" + NL + "\t//String server = \"192.168.1.2\";" + NL + "\t//String aplicacao = \"CadVideoCli\";" + NL + "\t\t" + NL + "\tpublic void setDataSource(DataSourceRemotoI dataSource) {" + NL + "\t\tthis.dataSource = dataSource;" + NL + "\t}" + NL + "\tpublic ";
  protected final String TEXT_15 = "ServicoWsJsonBase() {" + NL + "\t\tsetDataSource(new DataSourceRemoto());" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\t@Override" + NL + "\tpublic void listaSincronizadaAlteracao(List<";
  protected final String TEXT_16 = "> listaSinc, Context contexto) throws JSONException {" + NL + "\t\tMap<String,String> params = new HashMap<String,String>();" + NL + "\t\tString url = getUrl(\"ListaSincronizadaAlteracao\");" + NL + "\t\tString saida = \" [ \";" + NL + "\t\tboolean primeiro = true;" + NL + "\t\tfor (";
  protected final String TEXT_17 = " item:listaSinc) {" + NL + "\t\t\tif (primeiro) {" + NL + "\t\t\t\tprimeiro = false;" + NL + "\t\t\t} else {" + NL + "\t\t\t\tsaida += \" , \";" + NL + "\t\t\t}" + NL + "\t\t\tsaida += \" \" + ((ObjetoSinc)item).JSonSinc() + \" \";" + NL + "\t\t}" + NL + "\t\tsaida += \" ] \";" + NL + "\t\tparams.put(\"lista\", saida);" + NL + "\t\tparams.put(\"versao\",String.valueOf(getVersaoSincronizacao()));" + NL + "\t\tif (!Dispositivo.isTablet(contexto)) {" + NL + "\t\t\tparams.put(\"tmp\",Telefone.getNumero(contexto));" + NL + "\t\t} else {" + NL + "\t\t\tparams.put(\"cod\",Dispositivo.getId(contexto));" + NL + "\t\t}\t" + NL + "\t\tDCLog.d(DCLog.SINCRONIZACAO_JSON,this,\"Enviando...lista<";
  protected final String TEXT_18 = ">:\" + saida);" + NL + "\t\tString resultado = HTTPRequestHelper.getHttpResponse(url,params);" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\tprivate String getUrl(String metodo) {" + NL + "\t\tString objeto = \"";
  protected final String TEXT_19 = "\";" + NL + "\t\tultimaUrl = \"http://\" + dataSource.getServer() + \"/\" + (dataSource.getAplicacao()!=null?dataSource.getAplicacao() + \"/\":\"\") + objeto + \"WS/\" + metodo + getFiltro().getRequest();" + NL + "\t\treturn ultimaUrl;" + NL + "\t\t//return \"http://\" + server + \"/\" + aplicacao + \"/\" + objeto + \"/\" + metodo + getFiltro().getRequest();" + NL + "  \t}" + NL + "\t" + NL + "\t" + NL + "\tprivate static final String URL_GET_POSTS_RECENT = " + NL + "\t\t\"http://www.lojadigicom.com.br/";
  protected final String TEXT_20 = "/page/";
  protected final String TEXT_21 = "Page.aspx\";" + NL + "\tprivate JSONObject json;" + NL + "\t" + NL + "\t/*" + NL + "\tprivate final Handler handler = new Handler() {" + NL + "\t\tpublic void handleMessage(final Message msg) {" + NL + "\t\t\t//progressDialog.dismiss();" + NL + "\t\t\tString bundleResult = msg.getData().getString(\"RESPONSE\");" + NL + "\t\t\t//output.setText(bundleResult);" + NL + "\t\t\tlistaSaida = new ArrayList<";
  protected final String TEXT_22 = ">();" + NL + "\t\t\ttry {" + NL + "\t\t\t\tjson = new JSONObject(bundleResult);" + NL + "\t\t\t\tJSONArray lista = json.getJSONArray(\"";
  protected final String TEXT_23 = "\");" + NL + "\t\t\t\tint tam = lista.length();" + NL + "\t\t\t\tJSONObject item = null;" + NL + "\t\t\t\tString nome = null;" + NL + "\t\t\t\tfor (int i=0;i<lista.length();i++) {" + NL + "\t\t\t\t\titem = (JSONObject) lista.get(i);" + NL + "\t\t\t\t\tlistaSaida.add(new ";
  protected final String TEXT_24 = "(item));" + NL + "\t\t\t\t}" + NL + "\t\t\t} catch (Exception e) {" + NL + "\t\t\t\te.printStackTrace();" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t};" + NL + "\t*/" + NL + "\t";
  protected final String TEXT_25 = NL + "\tpublic ";
  protected final String TEXT_26 = " ";
  protected final String TEXT_27 = "(DigicomContexto ctx){" + NL + "\t\tString resultado = HTTPRequestHelper.getHttpResponse(getUrl(\"";
  protected final String TEXT_28 = "\"));" + NL + "\t\treturn processaResultadoObjeto(resultado);" + NL + "\t}";
  protected final String TEXT_29 = " " + NL + "\tpublic List<";
  protected final String TEXT_30 = "> ";
  protected final String TEXT_31 = "(DigicomContexto ctx){" + NL + "\t\tString resultado = HTTPRequestHelper.getHttpResponse(getUrl(\"";
  protected final String TEXT_32 = "\"));" + NL + "\t\treturn processaResultado(resultado);" + NL + "\t}";
  protected final String TEXT_33 = NL + NL + "\tprivate int processaResultado(String resultado, DaoSincronismo daoSinc) {" + NL + "\t\tint tam = 0;" + NL + "\t\tint inicio = resultado.indexOf('{');" + NL + "\t\tresultado = resultado.substring(inicio);" + NL + "\t\ttry {" + NL + "\t\t\tdaoSinc.dropCreate();" + NL + "\t\t\tjson = new JSONObject(resultado);" + NL + "\t\t\tJSONArray lista = json.getJSONArray(\"Lista\");" + NL + "\t\t\ttam = lista.length();" + NL + "\t\t\tJSONObject item = null;" + NL + "\t\t\t";
  protected final String TEXT_34 = " obj = null;" + NL + "\t\t\tfor (int i=0;i<lista.length();i++) {" + NL + "\t\t\t\titem = (JSONObject) lista.get(i);" + NL + "\t\t\t\tobj = FabricaVo.cria";
  protected final String TEXT_35 = "(item);" + NL + "\t\t\t\tdaoSinc.insere(obj);" + NL + "\t\t\t}" + NL + "\t\t\tlista = null;" + NL + "\t\t} catch (Exception e) {" + NL + "\t\t\tDCLog.e(DCLog.SINCRONIZACAO_JSON, this, e);" + NL + "\t\t\tTrataErro.getInstancia().setErro(e);" + NL + "\t\t}" + NL + "\t\treturn tam;" + NL + "\t}" + NL + "" + NL + "\t@Deprecated" + NL + "\tprivate List<";
  protected final String TEXT_36 = "> processaResultado(String resultado) {" + NL + "\t\tint inicio = resultado.indexOf('{');" + NL + "\t\tresultado = resultado.substring(inicio);" + NL + "\t\tList<";
  protected final String TEXT_37 = "> listaSaida = new LinkedList<";
  protected final String TEXT_38 = ">();" + NL + "\t\t" + NL + "\t\t//ServicoLocal<";
  protected final String TEXT_39 = "> servicoLocal = (ServicoLocal<";
  protected final String TEXT_40 = ">) FabricaServico.getInstancia().get";
  protected final String TEXT_41 = "Servico(FabricaServico.TIPO_SQLITE);" + NL + "\t\t//";
  protected final String TEXT_42 = " corrente = null;" + NL + "\t\t" + NL + "\t\ttry {" + NL + "\t\t\tjson = new JSONObject(resultado);" + NL + "\t\t\tJSONArray lista = json.getJSONArray(\"Lista\");" + NL + "\t\t\tint tam = lista.length();" + NL + "\t\t\tJSONObject item = null;" + NL + "\t\t\tString nome = null;" + NL + "\t\t\tfor (int i=0;i<lista.length();i++) {" + NL + "\t\t\t\titem = (JSONObject) lista.get(i);" + NL + "\t\t\t\t//corrente = FabricaVo.cria";
  protected final String TEXT_43 = "(item);" + NL + "\t\t\t\t//servicoLocal.insertLocal(corrente);" + NL + "\t\t\t\tlistaSaida.add(FabricaVo.cria";
  protected final String TEXT_44 = "(item));" + NL + "\t\t\t}" + NL + "\t\t\tlista = null;\t\t\t" + NL + "\t\t} catch (Exception e) {" + NL + "\t\t\t//Log.e(\"";
  protected final String TEXT_45 = "ServicoWsJson\", e.getMessage() + \" [ \" + ultimaUrl + \" ]\");" + NL + "\t\t\tDCLog.e(DCLog.SINCRONIZACAO_JSON, this, e);" + NL + "\t\t\tTrataErro.getInstancia().setErro(e);" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\treturn listaSaida;\t" + NL + "\t}" + NL + "" + NL + "\tprivate ";
  protected final String TEXT_46 = " processaResultadoObjeto(String resultado) {" + NL + "\t\tint inicio = resultado.indexOf('{');" + NL + "\t\tresultado = resultado.substring(inicio);" + NL + "\t\t";
  protected final String TEXT_47 = " saida = null;" + NL + "\t\t" + NL + "\t\t" + NL + "\t\ttry {" + NL + "\t\t\tjson = new JSONObject(resultado);" + NL + "\t\t\tJSONObject item = json.getJSONObject(\"Lista\");" + NL + "\t\t\tString nome = null;" + NL + "\t\t\tsaida = FabricaVo.cria";
  protected final String TEXT_48 = "(item);" + NL + "\t\t\t" + NL + "\t\t} catch (Exception e) {" + NL + "\t\t\t//Log.e(\"";
  protected final String TEXT_49 = "ServicoWsJson\", e.getMessage() + \" [ \" + ultimaUrl + \" ]\");" + NL + "\t\t\tDCLog.e(DCLog.SINCRONIZACAO_JSON, this, e);" + NL + "\t\t\tTrataErro.getInstancia().setErro(e);" + NL + "\t\t}" + NL + "\t\t" + NL + "\t\treturn saida;\t" + NL + "\t}" + NL + "" + NL + "\tpublic void dropCreate(Context contexto) {" + NL + "\t}" + NL + "\tpublic void insertAll(List<";
  protected final String TEXT_50 = "> lista, Context contexto) {" + NL + "\t}" + NL + "\tpublic void insertSincAll(List<";
  protected final String TEXT_51 = "> lista, Context contexto) {" + NL + "\t}" + NL + "\t" + NL + "\tpublic final void alteraParaSincronizacao(";
  protected final String TEXT_52 = " item) {" + NL + "\t\tthrow new UnsupportedOperationException();" + NL + "\t}" + NL + "\tpublic final void insereParaSincronizacao(";
  protected final String TEXT_53 = " item) {" + NL + "\t\tthrow new UnsupportedOperationException();" + NL + "\t}" + NL + "\tpublic final void excluiParaSincronizacao(";
  protected final String TEXT_54 = " item) {" + NL + "\t\tthrow new UnsupportedOperationException();" + NL + "\t}" + NL + "\tpublic final void criaTabelaSincronizacao() {" + NL + "\t}" + NL + "\t";
  protected final String TEXT_55 = NL + "\tpublic final ";
  protected final String TEXT_56 = " getCorrente() {" + NL + "\t\tthrow new UnsupportedOperationException();" + NL + "\t}" + NL + "\t";
  protected final String TEXT_57 = NL + "\t" + NL + "\t// Itens Tela" + NL + "\tpublic final ";
  protected final String TEXT_58 = " inicializaItemTela(DigicomContexto contexto) {" + NL + "\t\tthrow new UnsupportedOperationException();" + NL + "\t}" + NL + "\tpublic final ";
  protected final String TEXT_59 = " inicializaItemTela(";
  protected final String TEXT_60 = " itemTela, DigicomContexto contexto) {" + NL + "\t\tthrow new UnsupportedOperationException();" + NL + "\t}" + NL + "\tpublic final void finalizaItemTela(";
  protected final String TEXT_61 = " itemTela, boolean insercao, DigicomContexto contexto){" + NL + "\t\tthrow new UnsupportedOperationException();" + NL + "\t}" + NL + "\tpublic final void processaItemTela(";
  protected final String TEXT_62 = " itemTela, DigicomContexto contexto){" + NL + "\t\tthrow new UnsupportedOperationException();" + NL + "\t}" + NL + "\t" + NL + "\tpublic final ";
  protected final String TEXT_63 = " ultimoInicializado() {" + NL + "\t\tthrow new UnsupportedOperationException();" + NL + "\t}" + NL + "\t" + NL + "\tpublic final ";
  protected final String TEXT_64 = " getById(long id, Context contexto) {" + NL + "\t\tthrow new UnsupportedOperationException();" + NL + "\t}" + NL + "\tpublic final ";
  protected final String TEXT_65 = " getById(long id) {" + NL + "\t\tthrow new UnsupportedOperationException();" + NL + "\t}" + NL + "\t" + NL + "\tpublic List<";
  protected final String TEXT_66 = "> getAll(Context contexto) {" + NL + "\t\tString url = getUrl(\"ListaCorrente\");" + NL + "\t\tString resultado = HTTPRequestHelper.getHttpResponse(url);" + NL + "\t\treturn processaResultado(resultado);" + NL + "\t}" + NL + "\tpublic List<";
  protected final String TEXT_67 = "> getAllTela(Context contexto) {" + NL + "\t\treturn getAll(contexto);" + NL + "\t}" + NL + "\t" + NL + "\t/*" + NL + "\t* Essa nova vers?o da operacao de sincronizacao tem o objetivo de" + NL + "    * reduzir passos colocando a lista vinda do remoto direto no sqlite" + NL + "    * e uma opcao otimizada(Tatico) e o sincronizador gerencia(Estrategico) sua chamada." + NL + "\t* Estrategico -> sincronizador" + NL + "\t* Tatico -> Json" + NL + "\t* Operacional -> http" + NL + "\t*/" + NL + "\tpublic int listaSincronizadaDao(DaoSincronismo dao, Context contexto) {" + NL + "\t\tint tam = 0;" + NL + "\t\tString url = getUrl(\"ListaSincronizada\");" + NL + "\t\tif (!Dispositivo.isTablet(contexto)) {" + NL + "\t\t\tString numeroTel = Telefone.getNumero(contexto);" + NL + "\t\t\turl += \"?tmp=\" + numeroTel + \"&versao=\" + getVersaoSincronizacao();" + NL + "\t\t} else {" + NL + "\t\t\tString codId = Dispositivo.getId(contexto);" + NL + "\t\t\turl += \"?cod=\" + codId + \"&versao=\" + getVersaoSincronizacao(); " + NL + "\t\t}\t" + NL + "\t\tif (getVersaoSincronizacao()==3) {" + NL + "\t\t\tList<String> listaPalavra = HTTPRequestHelper.getHttpResponseList(url); " + NL + "\t\t\ttam = processaResultadoLista(listaPalavra, dao);" + NL + "\t\t} else {" + NL + "\t\t\tString resultado = HTTPRequestHelper.getHttpResponse(url);" + NL + "\t\t\ttam = processaResultado(resultado,dao);" + NL + "\t\t}" + NL + "\t\treturn tam;" + NL + "\t}" + NL + "\t\t" + NL + "\t// Passar para POST depois" + NL + "\tpublic List<";
  protected final String TEXT_68 = "> listaSincronizada(Context contexto) {" + NL + "\t\tList<";
  protected final String TEXT_69 = "> listaSaida = null;" + NL + "\t\tString url = getUrl(\"ListaSincronizada\");" + NL + "\t\tif (!Dispositivo.isTablet(contexto)) {" + NL + "\t\t\tString numeroTel = Telefone.getNumero(contexto);" + NL + "\t\t\turl += \"?tmp=\" + numeroTel + \"&versao=\" + getVersaoSincronizacao();" + NL + "\t\t} else {" + NL + "\t\t\tString codId = Dispositivo.getId(contexto);" + NL + "\t\t\turl += \"?cod=\" + codId + \"&versao=\" + getVersaoSincronizacao(); " + NL + "\t\t}\t" + NL + "\t\tif (getVersaoSincronizacao()==3) {" + NL + "\t\t\tList<String> listaPalavra = HTTPRequestHelper.getHttpResponseList(url); " + NL + "\t\t\tlistaSaida = this.processaResultadoLista(listaPalavra);" + NL + "\t\t} else {" + NL + "\t\t\tString resultado = HTTPRequestHelper.getHttpResponse(url);" + NL + "\t\t\tlistaSaida = processaResultado(resultado);" + NL + "\t\t}" + NL + "\t\treturn listaSaida;" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\tpublic List<";
  protected final String TEXT_70 = "> listaSincronizadaUsuario(Context contexto) {" + NL + "\t\tString url = getUrl(\"ListaSincronizadaUsuario\");" + NL + "\t\tif (!Dispositivo.isTablet(contexto)) {" + NL + "\t\t\tString numeroTel = Telefone.getNumero(contexto);" + NL + "\t\t\turl += \"?tmp=\" + numeroTel + \"&versao=\" + getVersaoSincronizacao();" + NL + "\t\t} else {" + NL + "\t\t\tString codId = Dispositivo.getId(contexto);" + NL + "\t\t\turl += \"?cod=\" + codId + \"&versao=\" + getVersaoSincronizacao(); " + NL + "\t\t}\t" + NL + "\t\tString resultado = HTTPRequestHelper.getHttpResponse(url);" + NL + "\t\treturn processaResultado(resultado);" + NL + "\t}" + NL + "\t" + NL + "" + NL + "\t// Come?ando com vers?o um fazer override ao mudar vers?o." + NL + "\tprotected int getVersaoSincronizacao() {" + NL + "\t\treturn Constantes.VERSAO_SINCRONISMO;" + NL + "\t}" + NL + "\t" + NL + "\t";
  protected final String TEXT_71 = NL + "\t@Override" + NL + "\tpublic List<";
  protected final String TEXT_72 = "> getPor";
  protected final String TEXT_73 = "(Context contexto, long id) {" + NL + "\t\tString url = getUrl(\"";
  protected final String TEXT_74 = "\");" + NL + "\t\tString resultado = HTTPRequestHelper.getHttpResponse(url);" + NL + "\t\treturn processaResultado(resultado);" + NL + "\t}" + NL + "\t// Indo buscar a mesma informa??o ( alterar depois )" + NL + "\t@Override" + NL + "\tpublic List<";
  protected final String TEXT_75 = "> getPor";
  protected final String TEXT_76 = "(Context contexto, long id, int qtde) {" + NL + "\t\tString url = getUrl(\"";
  protected final String TEXT_77 = "\");" + NL + "\t\tString resultado = HTTPRequestHelper.getHttpResponse(url);" + NL + "\t\treturn processaResultado(resultado);" + NL + "\t}" + NL + "\t@Override" + NL + "\tpublic List<";
  protected final String TEXT_78 = "> getPor";
  protected final String TEXT_79 = "(long id) {" + NL + "\t\tString url = getUrl(\"";
  protected final String TEXT_80 = "\");" + NL + "\t\tString resultado = HTTPRequestHelper.getHttpResponse(url);" + NL + "\t\treturn processaResultado(resultado);" + NL + "\t}" + NL + "\t// Indo buscar a mesma informa??o ( alterar depois )" + NL + "\t@Override" + NL + "\tpublic List<";
  protected final String TEXT_81 = "> getPor";
  protected final String TEXT_82 = "(long id, int qtde) {" + NL + "\t\tString url = getUrl(\"";
  protected final String TEXT_83 = "\");" + NL + "\t\tString resultado = HTTPRequestHelper.getHttpResponse(url);" + NL + "\t\treturn processaResultado(resultado);" + NL + "\t}" + NL + "\t";
  protected final String TEXT_84 = NL + "\t" + NL + NL;
  protected final String TEXT_85 = NL + "\tpublic void atualizaRelacionamento(List<DCIObjetoDominio> inclusao, List<DCIObjetoDominio> exclusao) {" + NL + "\t\tthrow new UnsupportedOperationException();\t" + NL + "\t}";
  protected final String TEXT_86 = NL + "\tpublic void atualizaRelacionamento(";
  protected final String TEXT_87 = " item, List<DCIObjetoDominio> listaEscolhidos) {" + NL + "\t\tthrow new UnsupportedOperationException();\t" + NL + "\t}" + NL + "\tpublic void atualizaRelacionamento(";
  protected final String TEXT_88 = " item, List<DCIObjetoDominio> listaEscolhidos) {" + NL + "\t\tthrow new UnsupportedOperationException();\t" + NL + "\t}" + NL + "\tpublic boolean comparaRelacionamentoComItem(Object item, Object relacionamento) {" + NL + "\t\tthrow new UnsupportedOperationException();\t" + NL + "\t}";
  protected final String TEXT_89 = NL + NL + "\t// ------------- Sincronismo Vers?o 2 ---------------------" + NL + "\t" + NL + "" + NL + "\t@Deprecated" + NL + "\tpublic List<";
  protected final String TEXT_90 = "> listaSincronizadaUsuarioV2(Context contexto) {" + NL + "\t\tString url = getUrl(\"listaSincronizadaUsuarioV2\");" + NL + "\t\tif (!Dispositivo.isTablet(contexto)) {" + NL + "\t\t\tString numeroTel = Telefone.getNumero(contexto);" + NL + "\t\t\turl += \"?tmp=\" + numeroTel + \"&versao=\" + getVersaoSincronizacao();" + NL + "\t\t} else {" + NL + "\t\t\tString codId = Dispositivo.getId(contexto);" + NL + "\t\t\turl += \"?cod=\" + codId + \"&versao=\" + getVersaoSincronizacao(); " + NL + "\t\t}\t" + NL + "\t\tString resultado = HTTPRequestHelper.getHttpResponse(url);" + NL + "\t\treturn processaResultado(resultado);" + NL + "\t}" + NL + "\t" + NL + "\t// ----------------------------------------------------------------" + NL + "\t" + NL + "\t" + NL + "\t// Para versao 3 de Sincronismo" + NL + "\tprivate List<";
  protected final String TEXT_91 = "> processaResultadoLista(List<String> lista) {" + NL + "\t\tList<";
  protected final String TEXT_92 = "> listaSaida = new LinkedList<";
  protected final String TEXT_93 = ">();" + NL + "\t\ttry {" + NL + "\t\t\tfor (String palavra : lista) {" + NL + "\t\t\t\tJSONObject json = new JSONObject(palavra);" + NL + "\t\t\t\t";
  protected final String TEXT_94 = " item = FabricaVo.cria";
  protected final String TEXT_95 = "(json);" + NL + "\t\t\t\tlistaSaida.add(item);" + NL + "\t\t\t}" + NL + "\t\t} catch (Exception e) {" + NL + "\t\t\tDCLog.e(DCLog.SINCRONIZACAO_JSON, this, e);" + NL + "\t\t\tTrataErro.getInstancia().setErro(e);" + NL + "\t\t}" + NL + "\t\treturn listaSaida;" + NL + "\t}" + NL + "\tprivate int processaResultadoLista(List<String> lista , DaoSincronismo daoSinc) {" + NL + "\t\t";
  protected final String TEXT_96 = " item = null;" + NL + "\t\ttry {" + NL + "\t\t\tdaoSinc.dropCreate();" + NL + "\t\t\tfor (String palavra : lista) {" + NL + "\t\t\t\tJSONObject json = new JSONObject(palavra);" + NL + "\t\t\t\titem = FabricaVo.cria";
  protected final String TEXT_97 = "(json);" + NL + "\t\t\t\tdaoSinc.insere(item);" + NL + "\t\t\t}" + NL + "\t\t} catch (Exception e) {" + NL + "\t\t\tDCLog.e(DCLog.SINCRONIZACAO_JSON, this, e);" + NL + "\t\t\tTrataErro.getInstancia().setErro(e);" + NL + "\t\t}" + NL + "\t\treturn lista.size();" + NL + "\t}" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNomePacoteServicoWsJsonBase() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_16);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_21);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_24);
    
	Iterator<RegraColecao> iteradorRegra = classe.getListaRegraColecao().iterator();
	while (iteradorRegra.hasNext()) {
	RegraColecao regra = iteradorRegra.next();
	if (regra.getAtivoFlex()) {
		if (!regra.getRetornaColecao()) {

    stringBuffer.append(TEXT_25);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_28);
    		} else  {   
    stringBuffer.append(TEXT_29);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_30);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_31);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_32);
    
		}
	}
	}

    stringBuffer.append(TEXT_33);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_34);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_35);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_36);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_37);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_38);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_39);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_40);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_41);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_42);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_43);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_44);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_45);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_46);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_47);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_48);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_49);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_50);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_51);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_52);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_53);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_54);
     if (classe.ehUsuario() || classe.ehDispositivo()) { 
    stringBuffer.append(TEXT_55);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_56);
     } 
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
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_63);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_64);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_65);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_66);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_67);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_68);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_69);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_70);
    
	Iterator<RelacionamentoWrapper> iterador = classe.obtemListaComChaveEstrangeira().iterator();
	while (iterador.hasNext()) {
		RelacionamentoWrapper relCorrente = iterador.next();
	
    stringBuffer.append(TEXT_71);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_72);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_73);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_74);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_75);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_76);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_77);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_78);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_79);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_80);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_81);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_82);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_83);
    
	}
	
    stringBuffer.append(TEXT_84);
    
	if (classe.isAssociativa()) {

    stringBuffer.append(TEXT_85);
    
	List<RelacionamentoWrapper> lista = classe.obtemListaComChaveEstrangeira();
	RelacionamentoWrapper relCorrente2 = lista.get(0);
	RelacionamentoWrapper relOutro = lista.get(1);
	if (relOutro.getClasseOposta().getId()!= relCorrente2.getClasseOposta().getId()) {
	
    stringBuffer.append(TEXT_86);
    stringBuffer.append( relOutro.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_87);
    stringBuffer.append( relCorrente2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_88);
    
	}
	}

    stringBuffer.append(TEXT_89);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_90);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_91);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_92);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_93);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_94);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_95);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_96);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_97);
    return stringBuffer.toString();
  }
}
