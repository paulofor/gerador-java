package jet.android2.res;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class Build
{
  protected static String nl;
  public static synchronized Build create(String lineSeparator)
  {
    nl = lineSeparator;
    Build result = new Build();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"utf-8\"?>" + NL + "<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\"" + NL + "    package=\"";
  protected final String TEXT_2 = "\" >" + NL + "" + NL + "" + NL + "    <uses-permission android:name=\"android.permission.READ_SYNC_SETTINGS\" />" + NL + "    <uses-permission android:name=\"android.permission.WRITE_SYNC_SETTINGS\" />" + NL + "    <uses-permission android:name=\"android.permission.AUTHENTICATE_ACCOUNTS\" />" + NL + "    <uses-permission android:name=\"android.permission.INTERNET\" />" + NL + "    <uses-permission android:name=\"android.permission.WRITE_EXTERNAL_STORAGE\" />" + NL + "    <uses-permission android:name=\"android.permission.READ_PHONE_STATE\" />" + NL + "    <uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" />" + NL + "    <uses-permission android:name=\"android.permission.VIBRATE\" />" + NL + "" + NL + "    " + NL + "    <application" + NL + "        android:allowBackup=\"true\"" + NL + "        android:icon=\"@mipmap/ic_launcher\"" + NL + "        android:label=\"@string/app_name\"" + NL + "        android:supportsRtl=\"true\"" + NL + "        android:theme=\"@style/AppTheme\" >" + NL + "        <activity" + NL + "            android:name=\".app.MainActivity\"" + NL + "            android:label=\"@string/app_name\"" + NL + "            android:theme=\"@style/AppTheme.NoActionBar\" >" + NL + "            <intent-filter>" + NL + "                <action android:name=\"android.intent.action.MAIN\" />" + NL + "" + NL + "                <category android:name=\"android.intent.category.LAUNCHER\" />" + NL + "            </intent-filter>" + NL + "        </activity>" + NL + "" + NL + "        <provider" + NL + "            android:authorities=\"br.com.lojadigicom.";
  protected final String TEXT_3 = "\"" + NL + "            android:name=\"br.com.lojadigicom.";
  protected final String TEXT_4 = ".data.provider.AplicacaoProvider\"" + NL + "            android:exported=\"false\"" + NL + "            android:syncable=\"true\" />" + NL + "" + NL + "        <!-- SyncAdapter's dummy authentication service -->" + NL + "        <service android:name=\".sync.AplicacaoAuthenticatorService\" >" + NL + "            <intent-filter>" + NL + "                <action android:name=\"android.accounts.AccountAuthenticator\" />" + NL + "            </intent-filter>" + NL + "" + NL + "            <meta-data" + NL + "                android:name=\"android.accounts.AccountAuthenticator\"" + NL + "                android:resource=\"@xml/authenticator\" />" + NL + "        </service>" + NL + "" + NL + "        <!-- The SyncAdapter service -->" + NL + "        <service" + NL + "            android:name=\".sync.AplicacaoSyncService\"" + NL + "            android:exported=\"true\" >" + NL + "            <intent-filter>" + NL + "                <action android:name=\"android.content.SyncAdapter\" />" + NL + "            </intent-filter>" + NL + "" + NL + "            <meta-data" + NL + "                android:name=\"android.content.SyncAdapter\"" + NL + "                android:resource=\"@xml/syncadapter\" />" + NL + "        </service>" + NL + "" + NL + "        " + NL + "    </application>" + NL + "    " + NL + "" + NL + "</manifest>";
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
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(TEXT_5);
    return stringBuffer.toString();
  }
}
