package jet.android2.res;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class ManifestXml
{
  protected static String nl;
  public static synchronized ManifestXml create(String lineSeparator)
  {
    nl = lineSeparator;
    ManifestXml result = new ManifestXml();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"utf-8\"?>" + NL + "<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\"" + NL + "          package=\"";
  protected final String TEXT_2 = ".template\">" + NL + "" + NL + "    <uses-permission android:name=\"android.permission.AUTHENTICATE_ACCOUNTS\" />" + NL + "    <uses-permission android:name=\"android.permission.WRITE_SYNC_SETTINGS\" />" + NL + "    <uses-permission android:name=\"android.permission.WRITE_EXTERNAL_STORAGE\"/>" + NL + "" + NL + "    <application" + NL + "        android:allowBackup=\"true\"" + NL + "        android:label=\"@string/app_name\"" + NL + "        android:supportsRtl=\"true\">" + NL + "" + NL + "        <service" + NL + "            android:name=\"";
  protected final String TEXT_3 = ".fcm.FirebaseMessagingServiceBase\">" + NL + "            <intent-filter>" + NL + "                <action android:name=\"com.google.firebase.MESSAGING_EVENT\"/>" + NL + "            </intent-filter>" + NL + "        </service>" + NL + "" + NL + "        <service" + NL + "            android:name=\".MyFirebaseInstanceIDService\">" + NL + "            <intent-filter>" + NL + "                <action android:name=\"com.google.firebase.INSTANCE_ID_EVENT\"/>" + NL + "            </intent-filter>" + NL + "        </service>" + NL + "" + NL + "</application>" + NL + "" + NL + "</manifest>" + NL;
  protected final String TEXT_4 = NL;

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
    stringBuffer.append(TEXT_4);
    return stringBuffer.toString();
  }
}
