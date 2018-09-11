package jet.android.servico;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class ServicoSqliteBase
{
  protected static String nl;
  public static synchronized ServicoSqliteBase create(String lineSeparator)
  {
    nl = lineSeparator;
    ServicoSqliteBase result = new ServicoSqliteBase();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "package ";
  protected final String TEXT_2 = ".servico.sqlite.base;" + NL + "" + NL + "" + NL + "import java.util.List;" + NL + "import java.util.ArrayList;" + NL + "" + NL + "import br.com.digicom.servico.WifiServicoI;" + NL + "import br.com.digicom.network.WifiListenerReceiver;" + NL + "import br.com.digicom.servico.ServicoLocal;" + NL + "import br.com.digicom.multimidia.AudioRecurso;" + NL + "import br.com.digicom.multimidia.DigicomAudioPlayer;" + NL + "import br.com.digicom.activity.DigicomContexto;" + NL + "import br.com.digicom.dao.DaoException;" + NL + "import br.com.digicom.dao.DaoSincronismo;" + NL + "import br.com.digicom.log.DCLog;" + NL + "import br.com.digicom.modelo.DCIObjetoDominio;" + NL + "import ";
  protected final String TEXT_3 = ".modelo.vo.FabricaVo;" + NL + "import ";
  protected final String TEXT_4 = ".modelo.*;" + NL + "import ";
  protected final String TEXT_5 = ".servico.*;" + NL + "import ";
  protected final String TEXT_6 = ".app.TrataErro;" + NL + "import android.content.Context;" + NL + "import android.util.Log;" + NL + "import android.media.MediaPlayer;" + NL + "import android.media.MediaPlayer.OnCompletionListener;" + NL + "import ";
  protected final String TEXT_7 = ".dao.";
  protected final String TEXT_8 = "DBHelper;" + NL + "import ";
  protected final String TEXT_9 = ".servico.";
  protected final String TEXT_10 = "Servico;" + NL + "" + NL + "public abstract class ";
  protected final String TEXT_11 = "ServicoSqliteBase extends  ";
  protected final String TEXT_12 = "Servico " + NL + "\timplements ServicoLocal<";
  protected final String TEXT_13 = ">, WifiServicoI{" + NL + "" + NL + "" + NL + "\t@Override" + NL + "\tpublic List<";
  protected final String TEXT_14 = "> listaSincronizadaAlteracaoV2(Context contexto) {" + NL + "\t\tthrow new RuntimeException();" + NL + "\t}" + NL + "" + NL + "" + NL + "\t@Override" + NL + "\tpublic void insertLocal(";
  protected final String TEXT_15 = " item) {" + NL + "\t\t";
  protected final String TEXT_16 = "DBHelper dao = getDao();" + NL + "\t\tdao.insert(item);" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\tpublic DaoSincronismo getDaoSincronismo() {" + NL + "\t\treturn (DaoSincronismo) getDao();" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\t// Multimidia" + NL + "\t// Multimidia" + NL + "\tDigicomAudioPlayer player = null;" + NL + "\tprotected void reproduzAudioRaw(DigicomContexto ctx, AudioRecurso recurso) {" + NL + "\t\tif (player==null)" + NL + "\t\t\tplayer = new DigicomAudioPlayer();" + NL + "\t\tplayer.reproduzAudioRaw(ctx, recurso);" + NL + "\t}" + NL + "\t" + NL + "\t// Rede" + NL + "\t// Registra Wifi" + NL + "\tprotected void registraWifi(Context ctx) {" + NL + "\t\tWifiListenerReceiver wifi = new WifiListenerReceiver();" + NL + "\t\twifi.setServico(this);" + NL + "\t\twifi.registraReceiver(ctx);" + NL + "\t}" + NL + "\t" + NL + "\t";
  protected final String TEXT_17 = NL + "\tprivate ";
  protected final String TEXT_18 = " corrente = null;" + NL + "\tpublic ";
  protected final String TEXT_19 = " getCorrente() {" + NL + "\t\tif (corrente==null) {" + NL + "\t\t\tcorrente = getDao().getCorrente();" + NL + "\t\t}" + NL + "\t\treturn corrente;" + NL + "\t}" + NL + "\t";
  protected final String TEXT_20 = NL + NL + NL + "\tprivate ";
  protected final String TEXT_21 = "DBHelper dao = null; " + NL + "\tprotected ";
  protected final String TEXT_22 = "DBHelper getDao() {" + NL + "\t\tif (dao==null) {" + NL + "\t\t\tdao = new ";
  protected final String TEXT_23 = "DBHelper();" + NL + "\t\t}" + NL + "\t\treturn dao;" + NL + "\t}" + NL + "\t" + NL + "\t@Override" + NL + "\tpublic List<";
  protected final String TEXT_24 = "> listaSincronizadaAlteracao(Context contexto) {" + NL + "\t\tList<";
  protected final String TEXT_25 = "> saida = null; " + NL + "\t\ttry {" + NL + "\t\t\tsaida = getDao().getAllSinc();" + NL + "\t\t\tDCLog.dStack(DCLog.SERVICO_OPERACAO_PADRAO, this, \"listaSincronizadaAlteracao : \" +  saida.size() + \" itens\" );" + NL + "\t\t} catch (DaoException e) {" + NL + "\t\t\tDCLog.e(DCLog.DATABASE_ERRO, this, e);" + NL + "\t\t\tTrataErro.getInstancia().setErro(e);" + NL + "\t\t}" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "\t@Override" + NL + "\tpublic List<";
  protected final String TEXT_26 = "> listaSincronizadaDependenteSoAlteracao(Context contexto) {" + NL + "\t\tList<";
  protected final String TEXT_27 = "> saida = null; " + NL + "\t\ttry {" + NL + "\t\t\tsaida = getDao().getAllSincSoAlteracao();" + NL + "\t\t\tDCLog.dStack(DCLog.SERVICO_OPERACAO_PADRAO, this, \"listaSincronizadaDependenteSoAlteracao : \" +  saida.size() + \" itens\" );" + NL + "\t\t} catch (DaoException e) {" + NL + "\t\t\tDCLog.e(DCLog.DATABASE_ERRO, this, e);" + NL + "\t\t\tTrataErro.getInstancia().setErro(e);" + NL + "\t\t}" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "\t" + NL + "\t";
  protected final String TEXT_28 = NL + "\t//public List<";
  protected final String TEXT_29 = "> ";
  protected final String TEXT_30 = "(Context contexto){}";
  protected final String TEXT_31 = NL + "\t" + NL + "\t" + NL + "" + NL + "" + NL + "" + NL + "" + NL + "\tpublic List<";
  protected final String TEXT_32 = "> getAll(Context contexto) {" + NL + "\t\tList<";
  protected final String TEXT_33 = "> saida = getDao().getAll();" + NL + "\t\tDCLog.dStack(DCLog.SERVICO_OPERACAO_PADRAO, this, \"getAll : \" +  saida.size() + \" itens\" );" + NL + "\t\t//dao.cleanup(); ??? que isso ?" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "\tpublic List<";
  protected final String TEXT_34 = "> getAllTela(Context contexto) {" + NL + "\t\tList<";
  protected final String TEXT_35 = "> saida = getDao().getAllTela();" + NL + "\t\tDCLog.dStack(DCLog.SERVICO_OPERACAO_PADRAO, this, \"getAllTela : \" +  saida.size() + \" itens\" );" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "\tpublic void alteraParaSincronizacao(";
  protected final String TEXT_36 = " item) {" + NL + "\t\t//DCLog.d(DCLog.DATABASE_ADM, this, \"updateSinc:\" + item.JSon());" + NL + "\t\tgetDao().updateSinc(item);" + NL + "\t}" + NL + "\tpublic void excluiParaSincronizacao(";
  protected final String TEXT_37 = " item) {" + NL + "\t\tgetDao().deleteSinc(item);" + NL + "\t}" + NL + "\tpublic void insereParaSincronizacao(";
  protected final String TEXT_38 = " item) {" + NL + "\t\t//DCLog.d(DCLog.DATABASE_ADM, this, \"insertSinc:\" + item.JSon());" + NL + "\t\t";
  protected final String TEXT_39 = NL + "\t\tUsuarioServico usuarioSrv = FabricaServico.getInstancia().getUsuarioServico(FabricaServico.TIPO_SQLITE);" + NL + "\t\tUsuario usuario = usuarioSrv.getCorrente();" + NL + "\t\titem.setUsuario_Sincroniza(usuario);" + NL + "\t\t";
  protected final String TEXT_40 = NL + "\t\tgetDao().insertSinc(item);" + NL + "\t\titem.setSomenteMemoria(false);" + NL + "\t}" + NL + "\tpublic void insertAll(List<";
  protected final String TEXT_41 = "> lista, Context contexto) {" + NL + "\t\t";
  protected final String TEXT_42 = "DBHelper dao = getDao();" + NL + "\t\tfor (int i=0;i<lista.size();i++) {" + NL + "\t\t\tdao.insert(lista.get(i));" + NL + "\t\t}" + NL + "\t\t//dao.cleanup();" + NL + "\t}\t" + NL + "\tpublic void insertSincAll(List<";
  protected final String TEXT_43 = "> lista, Context contexto) {" + NL + "\t\t";
  protected final String TEXT_44 = "DBHelper dao = getDao();" + NL + "\t\tfor (int i=0;i<lista.size();i++) {" + NL + "\t\t\tgetDao().insertSinc(lista.get(i));" + NL + "\t\t}" + NL + "\t\t//dao.cleanup();" + NL + "\t}" + NL + "\tpublic void criaTabelaSincronizacao() {" + NL + "\t\t";
  protected final String TEXT_45 = "DBHelper dao = getDao();" + NL + "\t\tdao.criaTabelaSincronizacao();" + NL + "\t}" + NL + "\t" + NL + "\tpublic void CriaSeNaoExiste(Context contexto) {" + NL + "\t\t";
  protected final String TEXT_46 = "DBHelper dao = getDao();" + NL + "\t\tdao.criaTabela();" + NL + "\t\tdao.criaTabelaSincronizacao();" + NL + "\t}\t" + NL + "\tpublic void dropCreate(Context contexto) {" + NL + "\t\t";
  protected final String TEXT_47 = "DBHelper dao = getDao();" + NL + "\t\tdao.dropTable();" + NL + "\t\tdao.criaTabela();" + NL + "\t\tif (dao.tabelaSincVazia()) {" + NL + "\t\t\tdao.dropTableSincronizacao();" + NL + "\t\t\tdao.criaTabelaSincronizacao();" + NL + "\t\t}" + NL + "\t\t//dao.cleanup();" + NL + "\t}" + NL + "\t\t" + NL + "\t";
  protected final String TEXT_48 = NL + "\t@Override" + NL + "\tpublic List<";
  protected final String TEXT_49 = "> getPor";
  protected final String TEXT_50 = "(Context contexto, long id) {" + NL + "\t\tList<";
  protected final String TEXT_51 = "> saida = null; " + NL + "\t\ttry {" + NL + "\t\t\tsaida = getDao().getPor";
  protected final String TEXT_52 = "(contexto, id);" + NL + "\t\t\tDCLog.dStack(DCLog.SERVICO_OPERACAO_PADRAO, this, \"getPor";
  protected final String TEXT_53 = " : \" +  saida.size() + \" itens\" );" + NL + "\t\t} catch (DaoException e) {" + NL + "\t\t\tDCLog.e(DCLog.DATABASE_ERRO, this, e);" + NL + "\t\t\tTrataErro.getInstancia().setErro(e);" + NL + "\t\t}" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "\tpublic List<";
  protected final String TEXT_54 = "> getPor";
  protected final String TEXT_55 = "(Context contexto, long id, int qtde) {" + NL + "\t\tList<";
  protected final String TEXT_56 = "> saida = null; " + NL + "\t\ttry {" + NL + "\t\t\tsaida = getDao().getPor";
  protected final String TEXT_57 = "(contexto, id);" + NL + "\t\t\tDCLog.dStack(DCLog.SERVICO_OPERACAO_PADRAO, this, \"getPor";
  protected final String TEXT_58 = " : \" +  saida.size() + \" itens\" );" + NL + "\t\t} catch (DaoException e) {" + NL + "\t\t\tDCLog.e(DCLog.DATABASE_ERRO, this, e);" + NL + "\t\t\tTrataErro.getInstancia().setErro(e);" + NL + "\t\t}" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "\t@Override" + NL + "\tpublic List<";
  protected final String TEXT_59 = "> getPor";
  protected final String TEXT_60 = "(long id) {" + NL + "\t\tList<";
  protected final String TEXT_61 = "> saida = null; " + NL + "\t\ttry {" + NL + "\t\t\tsaida = getDao().getPor";
  protected final String TEXT_62 = "(id);" + NL + "\t\t\tDCLog.dStack(DCLog.SERVICO_OPERACAO_PADRAO, this, \"getPor";
  protected final String TEXT_63 = " : \" +  saida.size() + \" itens (";
  protected final String TEXT_64 = "=\" + id + \")\" );" + NL + "\t\t} catch (DaoException e) {" + NL + "\t\t\tDCLog.e(DCLog.DATABASE_ERRO, this, e);" + NL + "\t\t\tTrataErro.getInstancia().setErro(e);" + NL + "\t\t}" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "\tpublic List<";
  protected final String TEXT_65 = "> getPor";
  protected final String TEXT_66 = "(long id, int qtde) {" + NL + "\t\tList<";
  protected final String TEXT_67 = "> saida = null; " + NL + "\t\ttry {" + NL + "\t\t\tsaida = getDao().getPor";
  protected final String TEXT_68 = "(id);" + NL + "\t\t\tDCLog.dStack(DCLog.SERVICO_OPERACAO_PADRAO, this, \"getPor";
  protected final String TEXT_69 = " : \" +  saida.size() + \" itens\" );" + NL + "\t\t} catch (DaoException e) {" + NL + "\t\t\tDCLog.e(DCLog.DATABASE_ERRO, this, e);" + NL + "\t\t\tTrataErro.getInstancia().setErro(e);" + NL + "\t\t}" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "\t";
  protected final String TEXT_70 = NL + NL + "\t" + NL + "\t// Servicos Wifi" + NL + "\t@Override" + NL + "\tpublic void entrouWifi() {" + NL + "\t}" + NL + "" + NL + "\t@Override" + NL + "\tpublic void saiuWifi() {" + NL + "\t}\t" + NL + "\t" + NL + "\t// Itens Tela itemTela" + NL + "\tprivate ";
  protected final String TEXT_71 = " ultimoInicializado = null;" + NL + "\tpublic final ";
  protected final String TEXT_72 = " inicializaItemTela(DigicomContexto contexto) {" + NL + "\t\tultimoInicializado = inicializaItemTelaImpl(contexto);" + NL + "\t\treturn ultimoInicializado;" + NL + "\t}" + NL + "\tpublic final ";
  protected final String TEXT_73 = " inicializaItemTela(";
  protected final String TEXT_74 = " itemTela, DigicomContexto contexto) {" + NL + "\t\tultimoInicializado = inicializaItemTelaImpl(itemTela, contexto);" + NL + "\t\treturn ultimoInicializado;" + NL + "\t}" + NL + "\tpublic final void finalizaItemTela(";
  protected final String TEXT_75 = " itemTela, boolean insercao, DigicomContexto contexto){" + NL + "\t\t";
  protected final String TEXT_76 = NL + "\t\tif (insercao) {" + NL + "\t\t\tUsuarioServico userSrv = FabricaServico.getInstancia().getUsuarioServico(FabricaServico.TIPO_SQLITE);" + NL + "\t\t\tUsuario user = userSrv.getCorrente();" + NL + "\t\t\titemTela.setUsuario_Sincroniza(user);" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_77 = NL + "\t\tfinalizaItemTelaImpl(itemTela, insercao, contexto);" + NL + "\t}" + NL + "\tpublic final void processaItemTela(";
  protected final String TEXT_78 = " itemTela, DigicomContexto contexto){" + NL + "\t\tprocessaItemTelaImpl(itemTela, contexto);" + NL + "\t}" + NL + "\t" + NL + "\tpublic final ";
  protected final String TEXT_79 = " getById(long id, Context contexto) {" + NL + "\t\treturn getDao().getById(id);" + NL + "\t}" + NL + "\tpublic final ";
  protected final String TEXT_80 = " getById(long id) {" + NL + "\t\treturn getDao().getById(id);" + NL + "\t}" + NL + "\t" + NL + "\t@Deprecated" + NL + "\tprotected ";
  protected final String TEXT_81 = " inicializaItemTelaImpl(DigicomContexto contexto) {" + NL + "\t\tthrow new UnsupportedOperationException(\"Fazer override de inicializaItemTelaImpl em ";
  protected final String TEXT_82 = "ServicoSqliteImpl \");" + NL + "\t}" + NL + "\tprotected ";
  protected final String TEXT_83 = " inicializaItemTelaImpl(";
  protected final String TEXT_84 = " itemTela, DigicomContexto contexto) {" + NL + "\t\tthrow new UnsupportedOperationException(\"Fazer override de inicializaItemTelaImpl em ";
  protected final String TEXT_85 = "ServicoSqliteImpl \");" + NL + "\t}" + NL + "\tprotected void finalizaItemTelaImpl(";
  protected final String TEXT_86 = " itemTela, boolean insercao, DigicomContexto contexto){" + NL + "\t\tthrow new UnsupportedOperationException(\"Fazer override de finalizaItemTelaImpl em ";
  protected final String TEXT_87 = "ServicoSqliteImpl \");" + NL + "\t}" + NL + "\tprotected void processaItemTelaImpl(";
  protected final String TEXT_88 = " itemTela, DigicomContexto contexto){" + NL + "\t\tthrow new UnsupportedOperationException(\"Fazer override de processaItemTelaImpl em ";
  protected final String TEXT_89 = "ServicoSqliteImpl \");" + NL + "\t}" + NL + "\t" + NL + "\tpublic ";
  protected final String TEXT_90 = " ultimoInicializado(){" + NL + "\t\treturn ultimoInicializado;" + NL + "\t}" + NL + "\t" + NL + "\t// Operacoes de Servico" + NL + "\t";
  protected final String TEXT_91 = NL + "\tpublic final ";
  protected final String TEXT_92 = " ";
  protected final String TEXT_93 = "(";
  protected final String TEXT_94 = ") {" + NL + "\t\t";
  protected final String TEXT_95 = " saida = null;" + NL + "\t\ttry {" + NL + "\t\t\tsaida =  ";
  protected final String TEXT_96 = "Impl(";
  protected final String TEXT_97 = ");" + NL + "\t\t\tDCLog.dStack(DCLog.SERVICO_OPERACAO, this, \"";
  protected final String TEXT_98 = " : \" + ";
  protected final String TEXT_99 = ");" + NL + "\t\t} catch (Exception e) {" + NL + "\t\t\tTrataErro.getInstancia().setErro(e);" + NL + "\t\t}" + NL + "\t\treturn saida;" + NL + "\t}" + NL + "\tprotected abstract ";
  protected final String TEXT_100 = " ";
  protected final String TEXT_101 = "Impl(";
  protected final String TEXT_102 = ") throws DaoException;";
  protected final String TEXT_103 = NL + "\t@Override" + NL + "\tpublic void limpaSinc(List lista) {" + NL + "\t\t";
  protected final String TEXT_104 = "DBHelper dao = getDao();" + NL + "\t\tList<";
  protected final String TEXT_105 = "> listaItem = lista;" + NL + "\t\tfor (";
  protected final String TEXT_106 = " item : listaItem) {" + NL + "\t\t\tdao.limpaSinc(item);" + NL + "\t\t}" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\t";
  protected final String TEXT_107 = NL + "\tpublic void atualizaRelacionamento(List<DCIObjetoDominio> inclusao, List<DCIObjetoDominio> exclusao) {" + NL + "\t\tfor (DCIObjetoDominio item : inclusao) {" + NL + "\t\t}" + NL + "\t\tfor (DCIObjetoDominio item : exclusao) {" + NL + "\t\t}" + NL + "\t}" + NL + "\t";
  protected final String TEXT_108 = NL + "\t" + NL + "\tpublic void atualizaRelacionamento(";
  protected final String TEXT_109 = " item, List<DCIObjetoDominio> listaEscolhidos) {" + NL + "\t\t";
  protected final String TEXT_110 = " novo = FabricaVo.cria";
  protected final String TEXT_111 = "();" + NL + "\t\tList<";
  protected final String TEXT_112 = "> listaBanco = this.getPor";
  protected final String TEXT_113 = "(null, item.getId());" + NL + "\t\t// lista insercao" + NL + "\t\tList<";
  protected final String TEXT_114 = "> listaInsercao = new ArrayList<";
  protected final String TEXT_115 = ">();" + NL + "\t\tfor (DCIObjetoDominio obj : listaEscolhidos) {" + NL + "\t\t\tboolean existe = false;" + NL + "\t\t\tfor (";
  protected final String TEXT_116 = " rel : listaBanco) {" + NL + "\t\t\t\tif (obj.getId()==rel.get";
  protected final String TEXT_117 = "()) {" + NL + "\t\t\t\t\texiste = true;" + NL + "\t\t\t\t\tbreak;" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t\tif (!existe) {" + NL + "\t\t\t\t";
  protected final String TEXT_118 = " novoRel = FabricaVo.cria";
  protected final String TEXT_119 = "();" + NL + "\t\t\t\tnovoRel.set";
  protected final String TEXT_120 = "_";
  protected final String TEXT_121 = "(item);" + NL + "\t\t\t\tnovoRel.set";
  protected final String TEXT_122 = "_";
  protected final String TEXT_123 = "((";
  protected final String TEXT_124 = ")obj);" + NL + "\t\t\t\tlistaInsercao.add(novoRel);" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\t// *********************************************************************************************" + NL + "\t\t// Lista Exclusao" + NL + "\t\tList<";
  protected final String TEXT_125 = "> listaExclusao = new ArrayList<";
  protected final String TEXT_126 = ">();" + NL + "\t\tfor (";
  protected final String TEXT_127 = " itemBanco : listaBanco) {" + NL + "\t\t\tboolean existe = false;" + NL + "\t\t\tfor (DCIObjetoDominio obj : listaEscolhidos) {" + NL + "\t\t\t\tif (obj.getId()==itemBanco.get";
  protected final String TEXT_128 = "()) {" + NL + "\t\t\t\t\texiste = true;" + NL + "\t\t\t\t\tbreak;" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t\tif (!existe) {" + NL + "\t\t\t\tlistaExclusao.add(itemBanco);" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\t//  ***********************************************************************************************" + NL + "\t\tDCLog.d(DCLog.SERVICO_TRATAMENTO_DADOS_TELA, this, \"ListaInsercao: \" + listaInsercao.size());" + NL + "\t\tDCLog.d(DCLog.SERVICO_TRATAMENTO_DADOS_TELA, this, \"ListaExclusao: \" + listaExclusao.size());" + NL + "\t\t//  ***********************************************************************************************" + NL + "\t\t";
  protected final String TEXT_129 = "DBHelper dao = getDao();" + NL + "\t\tfor (DCIObjetoDominio obj : listaInsercao) {" + NL + "\t\t\t";
  protected final String TEXT_130 = " novoRel = (";
  protected final String TEXT_131 = ") obj;" + NL + "\t\t\tnovoRel.set";
  protected final String TEXT_132 = "_";
  protected final String TEXT_133 = "(item);" + NL + "\t\t\tdao.insertSinc(novoRel);" + NL + "\t\t}\t" + NL + "\t\tfor (";
  protected final String TEXT_134 = " obj : listaExclusao) {" + NL + "\t\t\tdao.deleteSinc(obj);" + NL + "\t\t}\t" + NL + "\t}" + NL + "\t";
  protected final String TEXT_135 = NL + "\tpublic boolean comparaRelacionamentoComItem(Object item, Object relacionamento) {" + NL + "\t\tboolean saida = false;" + NL + "\t\tif (item instanceof ";
  protected final String TEXT_136 = ") {" + NL + "\t\t\t";
  protected final String TEXT_137 = " obj = (";
  protected final String TEXT_138 = ") item;" + NL + "\t\t\t";
  protected final String TEXT_139 = " rel = (";
  protected final String TEXT_140 = ") relacionamento;" + NL + "\t\t\tsaida = rel.get";
  protected final String TEXT_141 = "()== obj.getId();" + NL + "\t\t}" + NL + "\t\tif (item instanceof ";
  protected final String TEXT_142 = ") {" + NL + "\t\t\t";
  protected final String TEXT_143 = " obj = (";
  protected final String TEXT_144 = ") item;" + NL + "\t\t\t";
  protected final String TEXT_145 = " rel = (";
  protected final String TEXT_146 = ") relacionamento;" + NL + "\t\t\tsaida = rel.get";
  protected final String TEXT_147 = "()== obj.getId();" + NL + "\t\t}" + NL + "\t\treturn saida;" + NL + "\t}";
  protected final String TEXT_148 = NL;
  protected final String TEXT_149 = NL + NL + "\t@Override" + NL + "\tpublic ";
  protected final String TEXT_150 = " atribuiUsuario(";
  protected final String TEXT_151 = " item) {" + NL + "\t\t";
  protected final String TEXT_152 = NL + "\t\tUsuarioServico userSrv = FabricaServico.getInstancia().getUsuarioServico(FabricaServico.TIPO_SQLITE);" + NL + "\t\tUsuario usuario = userSrv.getCorrente();" + NL + "\t\titem.setUsuario_Sincroniza(usuario);" + NL + "\t\t";
  protected final String TEXT_153 = NL + "\t\treturn item;" + NL + "\t}" + NL + "}";

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
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( classe.getNomeParaClasse() );
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
     if (classe.ehUsuario() || classe.ehDispositivo()) { 
    stringBuffer.append(TEXT_17);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_19);
     } 
    stringBuffer.append(TEXT_20);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_21);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_25);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_26);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_27);
    
	Iterator<RegraColecao> iteradorRegra = classe.getListaRegraColecao().iterator();
	while (iteradorRegra.hasNext()) {
	RegraColecao regra = iteradorRegra.next();
	if (regra.getAtivoFlex()) {

    stringBuffer.append(TEXT_28);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_29);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_30);
    
	}
	}

    stringBuffer.append(TEXT_31);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_32);
    stringBuffer.append( classe.getNomeParaClasse() );
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
     if (classe.possuiRelacionamentoUsuario()) { 
    stringBuffer.append(TEXT_39);
     } 
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
    
	Iterator<RelacionamentoWrapper> iterador = classe.obtemListaComChaveEstrangeira().iterator();
	while (iterador.hasNext()) {
		RelacionamentoWrapper relCorrente = iterador.next();
	
    stringBuffer.append(TEXT_48);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_49);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_50);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_51);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_52);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_53);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_54);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_55);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_56);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_57);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_58);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_59);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_60);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_61);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_62);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_63);
    stringBuffer.append( classe.getChaveW().getNomeCampoTabela() );
    stringBuffer.append(TEXT_64);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_65);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_66);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_67);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_68);
    stringBuffer.append( relCorrente.getNome() );
    stringBuffer.append(TEXT_69);
    
	}
	
    stringBuffer.append(TEXT_70);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_71);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_72);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_73);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_74);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_75);
     if (classe.possuiRelacionamentoUsuario()) { 
    stringBuffer.append(TEXT_76);
     } 
    stringBuffer.append(TEXT_77);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_78);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_79);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_80);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_81);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_82);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_83);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_84);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_85);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_86);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_87);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_88);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_89);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_90);
    
	Iterator<RegraColecao> iteradorRegra2 = classe.getListaRegraColecao().iterator();
	while (iteradorRegra2.hasNext()) {
	RegraColecao regra = iteradorRegra2.next();
	if (regra.getAtivoFlex()) {
		String tipoRetorno = null;
		String param = null;
		String paramConn = null;
		String msgLog = null;
		if (regra.getRetornaColecao()) {
			tipoRetorno = "List<" + classe.getNomeParaClasse() + ">";
			msgLog = " saida.size() + \" itens\" ";
		} else {
			tipoRetorno = classe.getNomeParaClasse();
			msgLog = " (saida!=null?saida.toString():\"null\") ";
		}
		if (regra.getRecebeColecao()) { 
			param = "DigicomContexto contexto , List<" + classe.getNomeParaClasse() + "> lista";
			paramConn = "contexto, lista";
			
		} else {
			param = "DigicomContexto contexto ";
			paramConn = "contexto";
			
		}

    stringBuffer.append(TEXT_91);
    stringBuffer.append( tipoRetorno );
    stringBuffer.append(TEXT_92);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_93);
    stringBuffer.append( param );
    stringBuffer.append(TEXT_94);
    stringBuffer.append( tipoRetorno );
    stringBuffer.append(TEXT_95);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_96);
    stringBuffer.append( paramConn );
    stringBuffer.append(TEXT_97);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_98);
    stringBuffer.append( msgLog );
    stringBuffer.append(TEXT_99);
    stringBuffer.append( tipoRetorno );
    stringBuffer.append(TEXT_100);
    stringBuffer.append( regra.getNome() );
    stringBuffer.append(TEXT_101);
    stringBuffer.append( param );
    stringBuffer.append(TEXT_102);
    
	}
	}

    stringBuffer.append(TEXT_103);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_104);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_105);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_106);
    
	if (classe.isAssociativa()) {
	
    stringBuffer.append(TEXT_107);
     
	Iterator<RelacionamentoWrapper> iteradorRel2 = classe.obtemListaComChaveEstrangeira().iterator();
	while (iteradorRel2.hasNext()) {
		RelacionamentoWrapper relCorrente2 = iteradorRel2.next();
		RelacionamentoWrapper relOutro = classe.outroRel(relCorrente2);
		if (relOutro.getClasseOposta().getId()!= relCorrente2.getClasseOposta().getId()) {
	
    stringBuffer.append(TEXT_108);
    stringBuffer.append( relOutro.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_109);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_110);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_111);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_112);
    stringBuffer.append( relOutro.getNomeRelacionamento() );
    stringBuffer.append( relOutro.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_113);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_114);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_115);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_116);
    stringBuffer.append( relCorrente2.getNomePropriedade() );
    stringBuffer.append(TEXT_117);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_118);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_119);
    stringBuffer.append( relOutro.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_120);
    stringBuffer.append( relOutro.getNomeRelacionamento() );
    stringBuffer.append(TEXT_121);
    stringBuffer.append( relCorrente2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_122);
    stringBuffer.append( relCorrente2.getNomeRelacionamento() );
    stringBuffer.append(TEXT_123);
    stringBuffer.append( relCorrente2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_124);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_125);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_126);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_127);
    stringBuffer.append( relCorrente2.getNomePropriedade() );
    stringBuffer.append(TEXT_128);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_129);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_130);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_131);
    stringBuffer.append( relOutro.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_132);
    stringBuffer.append( relOutro.getNomeRelacionamento() );
    stringBuffer.append(TEXT_133);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_134);
    
		} // if do auto relacionamento
	}
	}

    
	if (classe.isAssociativa()) {
	List<RelacionamentoWrapper> listaRel = classe.obtemListaComChaveEstrangeira();
	RelacionamentoWrapper rel1 = listaRel.get(0);
	RelacionamentoWrapper rel2 = listaRel.get(1);

    stringBuffer.append(TEXT_135);
    stringBuffer.append( rel1.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_136);
    stringBuffer.append( rel1.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_137);
    stringBuffer.append( rel1.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_138);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_139);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_140);
    stringBuffer.append( rel1.getNomePropriedade() );
    stringBuffer.append(TEXT_141);
    stringBuffer.append( rel2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_142);
    stringBuffer.append( rel2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_143);
    stringBuffer.append( rel2.getClasseOposta().getNomeParaClasse() );
    stringBuffer.append(TEXT_144);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_145);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_146);
    stringBuffer.append( rel2.getNomePropriedade() );
    stringBuffer.append(TEXT_147);
    
	}

    stringBuffer.append(TEXT_148);
    
	RelacionamentoWrapper relUsuario = classe.getRelacionamentoUsuario();

    stringBuffer.append(TEXT_149);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_150);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_151);
     if (relUsuario!=null && !classe.ehDispositivo()) {
    stringBuffer.append(TEXT_152);
     } 
    stringBuffer.append(TEXT_153);
    return stringBuffer.toString();
  }
}
