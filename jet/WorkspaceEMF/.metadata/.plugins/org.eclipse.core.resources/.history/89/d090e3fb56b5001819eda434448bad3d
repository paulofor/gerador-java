package jet.android2.framework.sincronismo;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class FCMIdServico
{
  protected static String nl;
  public static synchronized FCMIdServico create(String lineSeparator)
  {
    nl = lineSeparator;
    FCMIdServico result = new FCMIdServico();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".framework.fcm;" + NL + "" + NL + "import com.google.firebase.iid.FirebaseInstanceId;" + NL + "import com.google.firebase.iid.FirebaseInstanceIdService;" + NL + "import ";
  protected final String TEXT_3 = ".framework.log.DCLog;" + NL + "" + NL + "import android.content.ContentResolver;" + NL + "import android.database.Cursor;" + NL + "import android.net.Uri;" + NL + "" + NL + "import com.google.firebase.iid.FirebaseInstanceId;" + NL + "import com.google.firebase.iid.FirebaseInstanceIdService;" + NL + "" + NL + "import ";
  protected final String TEXT_4 = ".data.contract.DispositivoUsuarioContract;" + NL + "import ";
  protected final String TEXT_5 = ".framework.log.DCLog;" + NL + "import ";
  protected final String TEXT_6 = ".framework.telefonia.Telefone;" + NL + "import ";
  protected final String TEXT_7 = ".modelo.DispositivoUsuario;" + NL + "import ";
  protected final String TEXT_8 = ".modelo.montador.DispositivoUsuarioMontador;" + NL + "import ";
  protected final String TEXT_9 = ".remoto.DispositivoUsuarioSincronismo;" + NL + "import ";
  protected final String TEXT_10 = ".remoto.UsuarioSincronismo;" + NL + "import ";
  protected final String TEXT_11 = ".data.contract.AplicacaoContract;" + NL + "" + NL + "" + NL + "public class DCFirebaseInstanceIDService extends FirebaseInstanceIdService {" + NL + "" + NL + "\tprivate static DCSincronizador sincronizador = null;" + NL + "" + NL + "    @Override" + NL + "    public void onTokenRefresh() {" + NL + "        String refreshedToken = FirebaseInstanceId.getInstance().getToken();" + NL + "        DCLog.d(DCLog.SINCRONIZACAO_GCM,this,\"token:\" + refreshedToken);" + NL + "        sincronizador.sincronizaUsuarioDispositivoFcmId(this);" + NL + "        processaAtualizacao(refreshedToken);" + NL + "        sincronizador.sincronizaDispositivoFcmId(this);" + NL + "        sincronizador.executaDiario(this,AplicacaoContract.getCodigoAplicacaoSinc());" + NL + "   \t}" + NL + "" + NL + "\tpublic static void setSincronizador(DCSincronizador valor) {" + NL + "        sincronizador = valor;" + NL + "    }" + NL + "\t" + NL + "\tprivate void processaAtualizacao(String token) {" + NL + "        Uri uriDispositivo = DispositivoUsuarioContract.buildAll();" + NL + "        ContentResolver resolver = getContentResolver();" + NL + "        Cursor cursor = resolver.query(uriDispositivo, null, null, null, null);" + NL + "        DispositivoUsuario dispositivoUsuario = null;" + NL + "        if (cursor.moveToFirst()) {" + NL + "            DispositivoUsuarioMontador montador = new DispositivoUsuarioMontador();" + NL + "            dispositivoUsuario = (DispositivoUsuario) montador.getItem(cursor);" + NL + "            dispositivoUsuario.setTokenGcm(token);" + NL + "            dispositivoUsuario.setCodigoDispositivo(Telefone.getModelo(this));" + NL + "            uriDispositivo = DispositivoUsuarioContract.buildDispositivoUsuarioUri(dispositivoUsuario.getIdObj());" + NL + "            resolver.update(uriDispositivo, dispositivoUsuario.getContentValues(), null, null);" + NL + "        }" + NL + "\t}" + NL + "\t" + NL + "" + NL + "   " + NL + "}";
  protected final String TEXT_12 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
List<ClasseWrapper> classes = recursos.getListaClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(TEXT_12);
    return stringBuffer.toString();
  }
}
