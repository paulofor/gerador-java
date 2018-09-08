package jet.android2.sincronismo;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class ObjetoSincronismo
{
  protected static String nl;
  public static synchronized ObjetoSincronismo create(String lineSeparator)
  {
    nl = lineSeparator;
    ObjetoSincronismo result = new ObjetoSincronismo();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package  ";
  protected final String TEXT_2 = ".remoto;" + NL + "" + NL + "import android.content.ContentResolver;" + NL + "import android.content.Context;" + NL + "import android.database.Cursor;" + NL + "import android.net.Uri;" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".data.contract.AplicacaoContract;" + NL + "import ";
  protected final String TEXT_4 = ".data.contract.";
  protected final String TEXT_5 = "Contract;" + NL + "import ";
  protected final String TEXT_6 = ".framework.log.DCLog;" + NL + "" + NL + "public class ";
  protected final String TEXT_7 = "Sincronismo {" + NL + "\t";
  protected final String TEXT_8 = NL + "\t// Versao tradicional sempre com atualizacao local." + NL + "    public void sincroniza(Context contexto, boolean forcaAtualizacao) {" + NL + "        sincroniza(contexto,forcaAtualizacao,true,true);" + NL + "    }";
  protected final String TEXT_9 = NL + "    public void sincroniza(Context contexto, boolean forcaAtualizacao, boolean delete, boolean atualizaLocal) {" + NL + "    \tString codigoAplicacao = AplicacaoContract.getCodigoAplicacaoSinc();" + NL + " \t \t";
  protected final String TEXT_10 = "Remote servicoRemoto = new  ";
  protected final String TEXT_11 = "Remote(); // fazer estatico ?" + NL + "        try {" + NL + "             ContentResolver resolver = contexto.getContentResolver();" + NL + "             Cursor cursor = resolver.query(";
  protected final String TEXT_12 = "Contract.buildAllSinc(), ";
  protected final String TEXT_13 = "Contract.COLS_SINC, null, null, null);" + NL + "             int tam = cursor.getCount();" + NL + "             if (cursor.getCount() > 0 ) {" + NL + "                  servicoRemoto.listaSincronizadaAlteracao(cursor, contexto);" + NL + "                  DCLog.d(DCLog.SINCRONIZACAO_SINCRONIZADOR, this, \"";
  protected final String TEXT_14 = ": \" + tam +  \" >> \");" + NL + "                  resolver.delete(";
  protected final String TEXT_15 = "Contract.buildDeleteAllSinc(),null,null);" + NL + "             }" + NL + "             if ((atualizaLocal) && (forcaAtualizacao || (tam>0))) {" + NL + "                 int tamLista = 0;" + NL + "                 tamLista = servicoRemoto.listaSincronizadaDao(contexto,delete,codigoAplicacao);" + NL + "                 DCLog.d(DCLog.SINCRONIZACAO_SINCRONIZADOR, this, \"";
  protected final String TEXT_16 = ": \" + tamLista +  \" << \");" + NL + "             }" + NL + "        } catch (Exception e) {" + NL + "         \t DCLog.e(DCLog.SINCRONIZACAO_SINCRONIZADOR,this,e);" + NL + "             e.printStackTrace();" + NL + "        }" + NL + "    }" + NL + "    " + NL + "    // Chama outro metodo de DAO - Fazendo apenas updates. Ex: InteresseProduto" + NL + "    public void sincronizaAtualizaPorId(Context contexto, boolean forcaAtualizacao, boolean delete, boolean atualizaLocal) {" + NL + "    \tString codigoAplicacao = AplicacaoContract.getCodigoAplicacaoSinc();" + NL + " \t \t";
  protected final String TEXT_17 = "Remote servicoRemoto = new  ";
  protected final String TEXT_18 = "Remote(); // fazer estatico ?" + NL + "        try {" + NL + "             ContentResolver resolver = contexto.getContentResolver();" + NL + "             Cursor cursor = resolver.query(";
  protected final String TEXT_19 = "Contract.buildAllSinc(), ";
  protected final String TEXT_20 = "Contract.COLS_SINC, null, null, null);" + NL + "             int tam = cursor.getCount();" + NL + "             if (cursor.getCount() > 0 ) {" + NL + "                  servicoRemoto.listaSincronizadaAlteracao(cursor, contexto);" + NL + "                  DCLog.d(DCLog.SINCRONIZACAO_SINCRONIZADOR, this, \"";
  protected final String TEXT_21 = ": \" + tam +  \" >> \");" + NL + "                  resolver.delete(";
  protected final String TEXT_22 = "Contract.buildDeleteAllSinc(),null,null);" + NL + "             }" + NL + "             if ((atualizaLocal) && (forcaAtualizacao || (tam>0))) {" + NL + "                 int tamLista = 0;" + NL + "                 tamLista = servicoRemoto.listaSincronizadaDaoAtualizaPorId(contexto,delete,codigoAplicacao);" + NL + "                 DCLog.d(DCLog.SINCRONIZACAO_SINCRONIZADOR, this, \"";
  protected final String TEXT_23 = ": \" + tamLista +  \" << \");" + NL + "             }" + NL + "        } catch (Exception e) {" + NL + "         \t DCLog.e(DCLog.SINCRONIZACAO_SINCRONIZADOR,this,e);" + NL + "             e.printStackTrace();" + NL + "        }" + NL + "        " + NL + "    }" + NL + "}";

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
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_7);
     if (classe.ehDispositivo()) { 
    stringBuffer.append(TEXT_8);
     } else { 
     } 
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
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_17);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_21);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_23);
    return stringBuffer.toString();
  }
}
