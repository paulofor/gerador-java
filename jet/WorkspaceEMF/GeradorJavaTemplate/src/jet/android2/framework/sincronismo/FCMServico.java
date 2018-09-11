package jet.android2.framework.sincronismo;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class FCMServico
{
  protected static String nl;
  public static synchronized FCMServico create(String lineSeparator)
  {
    nl = lineSeparator;
    FCMServico result = new FCMServico();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".framework.fcm;" + NL + "" + NL + "import android.app.NotificationManager;" + NL + "import android.app.PendingIntent;" + NL + "import android.content.Context;" + NL + "import android.content.Intent;" + NL + "import android.media.RingtoneManager;" + NL + "import android.net.Uri;" + NL + "import android.support.v4.app.NotificationCompat;" + NL + "" + NL + "import com.google.firebase.messaging.FirebaseMessagingService;" + NL + "import com.google.firebase.messaging.RemoteMessage;" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".framework.log.DCLog;" + NL + "import ";
  protected final String TEXT_4 = ".template.R;" + NL + "" + NL + "" + NL + "" + NL + "public class DCFirebaseMessagingService extends FirebaseMessagingService {" + NL + "" + NL + "\t// Para evoluir :" + NL + "\t// https://developer.android.com/training/notify-user/build-notification.html" + NL + "" + NL + "\tprivate static DCSincronizador sincronizador = null;" + NL + "\tprivate static DCNotificacaoParam notificacao = null;" + NL + "" + NL + "    @Override" + NL + "    public void onMessageReceived(RemoteMessage remoteMessage) {" + NL + "        DCLog.d(DCLog.SINCRONIZACAO_GCM,this,\"Recebeu mensagem servidor\");" + NL + "" + NL + "        if (remoteMessage.getData().size() > 0) {" + NL + "            DCLog.d(DCLog.SINCRONIZACAO_GCM,this,\"Mensagem dados: \" + remoteMessage.getData());" + NL + "        }" + NL + "" + NL + "        if (remoteMessage.getNotification() != null) {" + NL + "            DCLog.d(DCLog.SINCRONIZACAO_GCM,this,\"Mensagem notificacao: \" + remoteMessage.getNotification().getBody());" + NL + "        }" + NL + "        sincronizador.executaServerToMobile(this);" + NL + "        if (notificacao.existeAlteracao())" + NL + "\t        sendNotification();" + NL + "" + NL + "    }" + NL + "" + NL + "    private void sendNotification() {" + NL + "        Intent intent = new Intent(this, notificacao.getMainClass());" + NL + "        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);" + NL + "        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0 /* Request code */, intent," + NL + "                PendingIntent.FLAG_ONE_SHOT);" + NL + "" + NL + "        Uri defaultSoundUri= RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);" + NL + "" + NL + "        DCLog.d(DCLog.SINCRONIZACAO_GCM,this,\"Criando notificacao\");" + NL + "        NotificationCompat.Builder mBuilder =" + NL + "                new NotificationCompat.Builder(this)" + NL + "                        .setSmallIcon(notificacao.getIdIcone())" + NL + "                        .setContentTitle(notificacao.getTitulo())" + NL + "                        .setContentText(notificacao.getTexto())" + NL + "                        .setAutoCancel(true)" + NL + "                        .setSound(defaultSoundUri)" + NL + "                        .setContentIntent(pendingIntent);" + NL + "" + NL + "        DCLog.d(DCLog.SINCRONIZACAO_GCM,this,\"Notificacao manager\");" + NL + "        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);" + NL + "        notificationManager.notify(0 /* ID of notification */, mBuilder.build());" + NL + "    }" + NL + "" + NL + " \tpublic static void setSincronizador(DCSincronizador valor) {" + NL + "        sincronizador = valor;" + NL + "    }" + NL + "    public static void setNotificador(DCNotificacaoParam valor) {" + NL + "        notificacao = valor;" + NL + "    }" + NL + "}";
  protected final String TEXT_5 = NL;

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
    stringBuffer.append(TEXT_5);
    return stringBuffer.toString();
  }
}
