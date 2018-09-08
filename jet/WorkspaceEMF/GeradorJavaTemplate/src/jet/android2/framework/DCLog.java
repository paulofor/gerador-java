package jet.android2.framework;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class DCLog
{
  protected static String nl;
  public static synchronized DCLog create(String lineSeparator)
  {
    nl = lineSeparator;
    DCLog result = new DCLog();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package  ";
  protected final String TEXT_3 = ".framework.log;" + NL + "" + NL + "" + NL + "import android.os.Environment;" + NL + "import android.util.Log;" + NL + "import android.view.View;" + NL + "" + NL + "import java.io.BufferedWriter;" + NL + "import java.io.File;" + NL + "import java.io.FileWriter;" + NL + "import java.io.IOException;" + NL + "import java.io.PrintWriter;" + NL + "import java.io.StringWriter;" + NL + "import java.util.Date;" + NL + "" + NL + "/*" + NL + "Displayed (do Android) -> mostra activity com o tempo para montagem." + NL + "" + NL + "TraceLista -> Para resolver problemas de fragment list." + NL + "QuerySql -> Mostra as consultas em sql aao banco." + NL + "TraceDisplay -> Mostra as activitys e fragments da navegacao." + NL + "" + NL + " */" + NL + "" + NL + "public class DCLog {" + NL + "" + NL + "\tpublic static final String BILLING = \"BillingLog\";" + NL + "\tpublic static final String TRACE_LISTA = \"TraceLista\";" + NL + "\tpublic static final String QUERY_SQL = \"QuerySql\";" + NL + "\tpublic static final String TRACE_DISPLAY = \"TraceDisplay\";" + NL + "\tpublic static final String TRACE_CRUD = \"TraceCrud\";" + NL + "\tpublic static final String TRACE_SINC = \"TraceSinc\";" + NL + "\tpublic static final String IMAGEM_CACHE = \"ImagemCache\";" + NL + "\t" + NL + "\tpublic static final String OBJETO_INTERNO = \"ObjetoInterno\";" + NL + "\t" + NL + "\tpublic static final String INICIALIZACAO_OBJETO_TELA = \"InicializacaoObjetoTela\";" + NL + "\tpublic static final String DATABASE_ADM = \"DatabaseAdm\"; // insercoes e updates na base de dados" + NL + "\tpublic static final String DATABASE_ERRO = \"DatabaseAdm\";" + NL + "\tpublic static final String DATABASE_ERRO_CORE = \"DatabaseAdm\"; // Erros no DigicomAndroidLib" + NL + "\t" + NL + "\tpublic static final String DATABASE_CRUD = \"DatabaseCrud\";" + NL + "\t" + NL + "\tpublic static final String DATABASE_COM_STACK = \"DatabaseStack\";" + NL + "\tpublic static final String SERVICO_DATABASE = \"ServicoDatabase\";" + NL + "\t" + NL + "\tpublic static final String SERVICO_OPERACAO = \"ListService\";" + NL + "\tpublic static final String SERVICO_QUADRO_LISTA = \"ListService\";" + NL + "\tpublic static final String SERVICO_OPERACAO_PADRAO = \"ListService\"; // metodos de servico padronizados" + NL + "\tpublic static final String SERVICO_TRATAMENTO_DADOS_TELA = \"ListServiceTela\";" + NL + "\t" + NL + "\tpublic static final String LAZY_LOADER = \"LazyLoader\";" + NL + "\t" + NL + "\tpublic static final String BACK_STACK_TRACE = \"BackStackTrace\";" + NL + "\t" + NL + "\t//public static final String SINCRONIZACAO_MOBILE2SERVER = \"Sincronizacao\";" + NL + "\t//public static final String SINCRONIZACAO_SERVER2MOBILE = \"Sincronizacao\";" + NL + "\t//public static final String SINCRONIZACAO_GERAL = \"Sincronizacao\";" + NL + "\tpublic static final String ITEM_NULL = \"ItemNull\";" + NL + "\tpublic static final String ON_CLICK = \"OnClick\";" + NL + "\t" + NL + "\tpublic static final String SINCRONIZACAO_DAO = \"DaoSinc\";" + NL + "\tpublic static final String SINCRONIZACAO_SINCRONIZADOR = \"Sincronizacao\";" + NL + "\tpublic static final String SINCRONIZACAO_JSON = \"JsonSinc\";" + NL + "\tpublic static final String SINCRONIZACAO_GCM = \"GcmSinc\";" + NL + "\t" + NL + "\tpublic static final String MULTIMIDIA = \"Multimidia\";" + NL + "\tpublic static final String MODELO = \"Modelo\";" + NL + "\tpublic static final String DISPLAY = \"DisplayTela\";" + NL + "\t" + NL + "\tprivate static final String STACK = \"Stack\";" + NL + "\t" + NL + "\tpublic static final String CICLO_VIEW = \"CicloView\";" + NL + "\tpublic static final String ANIMACAO = \"Animacao\";" + NL + "\t" + NL + "\tpublic static final String CRIA_FRAGMENT = \"CriaFragment\";" + NL + "\tpublic static final String STORAGE = \"Storage\";" + NL + "\t" + NL + "\tpublic static final String OPERACAO_DB_TELA = \"OperacaoDbTela\";" + NL + "\t" + NL + "\tpublic static void ciclo(View classe, String metodo) {" + NL + "\t\tLog.d(CICLO_VIEW, classe.toString() + \" \" + metodo);" + NL + "\t}" + NL + "\t" + NL + "\tpublic static void d(String tag, Object classe, String mensagem) {" + NL + "\t\tString msg = tag + \" - \" + classe.getClass().getSimpleName() + \":\" + mensagem;" + NL + "\t\tsalvaLog(msg);" + NL + "\t\tLog.d(tag, classe.getClass().getSimpleName() + \":\" + mensagem);" + NL + "\t}" + NL + "\tpublic static void dStack(String tag, Object classe, String mensagem, int niveis) {" + NL + "\t\tniveis += 5;" + NL + "\t\tString trace = \"\";" + NL + "\t\tfor (int i=5;i<niveis;i++) {" + NL + "\t\t\tStackTraceElement ste = Thread.currentThread().getStackTrace()[i];" + NL + "\t\t\ttrace += \" \" + ste;" + NL + "\t\t}" + NL + "\t\td(tag, classe, mensagem + \" ( \" + trace + \" ) \");" + NL + "\t}" + NL + "\tpublic static void dStack(String tag, Object classe, String mensagem) {" + NL + "\t\tdStack(tag, classe, mensagem, 1);" + NL + "\t\t/*" + NL + "\t\tint niveis = 4;" + NL + "\t\td(tag,classe,mensagem);" + NL + "\t\tfor (int i=3;i<(niveis+3);i++) {" + NL + "\t\t\tStackTraceElement ste = Thread.currentThread().getStackTrace()[i];" + NL + "\t\t\td(tag,classe,\" ---> \" + ste);" + NL + "\t\t}" + NL + "\t\t*/" + NL + "\t}" + NL + "\t" + NL + "\tpublic static void e(String tag, Object classe, String mensagem) {" + NL + "\t\tString msg = tag + \" - \" + classe.getClass().getSimpleName() + \":\" + mensagem;" + NL + "\t\tsalvaErro(msg);" + NL + "\t\tLog.e(tag, classe.getClass().getSimpleName() + \":\" + mensagem);" + NL + "\t}" + NL + "\tpublic static void e(String tag, Object classe, Exception e) {" + NL + "\t\tsalvaErro(tag,classe,e);" + NL + "\t\tLog.e(tag, \"Erro em \" + classe.getClass().getSimpleName(), e);" + NL + "\t\te.printStackTrace();" + NL + "\t}" + NL + "" + NL + "\tprivate static void salvaLog(String mensagem) {" + NL + "\t\t//String dir = Environment.getExternalStorageDirectory() + \"/log\";" + NL + "\t\tBufferedWriter out = null;" + NL + "\t\tFile Root = new File(Environment.getExternalStorageDirectory() + \"/log\");" + NL + "\t\tif(Root.canWrite()){" + NL + "\t\t\tFile  LogFile = new File(Root, \"Debug.log\");" + NL + "\t\t\ttry {" + NL + "\t\t\t\tFileWriter LogWriter = new FileWriter(LogFile, true);" + NL + "\t\t\t\tout = new BufferedWriter(LogWriter);" + NL + "\t\t\t\tDate date = new Date();" + NL + "\t\t\t\tout.write(String.valueOf(date.getHours() + \":\" + date.getMinutes() + \":\" + date.getSeconds() + \"  \"  + mensagem + \"\\n\"));" + NL + "\t\t\t\tout.close();" + NL + "\t\t\t} catch (IOException e) {" + NL + "" + NL + "\t\t}" + NL + "\t}" + NL + "\t}" + NL + "" + NL + "\tprivate static void salvaErro(String mensagem) {" + NL + "\t\t//String dir = Environment.getExternalStorageDirectory() + \"/log\";" + NL + "\t\tBufferedWriter out = null;" + NL + "\t\tFile Root = new File(Environment.getExternalStorageDirectory() + \"/log\");" + NL + "\t\tif(Root.canWrite()){" + NL + "\t\t\tFile  LogFile = new File(Root, \"Erro.log\");" + NL + "\t\t\ttry {" + NL + "\t\t\t\tFileWriter LogWriter = new FileWriter(LogFile, true);" + NL + "\t\t\t\tout = new BufferedWriter(LogWriter);" + NL + "\t\t\t\tDate date = new Date();" + NL + "\t\t\t\tout.write(String.valueOf(date.getHours() + \":\" + date.getMinutes() + \":\" + date.getSeconds() + \"  \"  + mensagem + \"\\n\"));" + NL + "\t\t\t\tout.close();" + NL + "\t\t\t} catch (IOException e) {" + NL + "" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "" + NL + "\tprivate static void salvaErro(String tag, Object classe, Exception e) {" + NL + "\t\t//String dir = Environment.getExternalStorageDirectory() + \"/log\";" + NL + "\t\tBufferedWriter out = null;" + NL + "\t\tFile Root = new File(Environment.getExternalStorageDirectory() + \"/log\");" + NL + "\t\tif(Root.canWrite()){" + NL + "" + NL + "\t\t\tStringWriter sw = new StringWriter();" + NL + "\t\t\te.printStackTrace(new PrintWriter(sw));" + NL + "\t\t\tString exceptionAsString = sw.toString();" + NL + "" + NL + "\t\t\tFile  LogFile = new File(Root, \"Erro.log\");" + NL + "\t\t\ttry {" + NL + "\t\t\t\tFileWriter LogWriter = new FileWriter(LogFile, true);" + NL + "\t\t\t\tout = new BufferedWriter(LogWriter);" + NL + "\t\t\t\tDate date = new Date();" + NL + "" + NL + "\t\t\t\tout.write(String.valueOf(date.getHours() + \":\" + date.getMinutes() + \":\" + date.getSeconds() +" + NL + "\t\t\t\t\t\te.getMessage() + \"\\n\"  + exceptionAsString + \"\\n\"));" + NL + "\t\t\t\tout.close();" + NL + "\t\t\t} catch (IOException eio) {" + NL + "" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "" + NL + "" + NL + "" + NL + "}";
  protected final String TEXT_4 = NL;

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
    stringBuffer.append(TEXT_4);
    return stringBuffer.toString();
  }
}
