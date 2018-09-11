package jet.android.res;

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
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"utf-8\"?>" + NL + "<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\"" + NL + "    package=\"";
  protected final String TEXT_2 = ".app\"" + NL + "    android:versionCode=\"1\"" + NL + "    android:versionName=\"1.0\" >" + NL + "" + NL + "    <uses-sdk" + NL + "        android:minSdkVersion=\"14\"" + NL + "        android:targetSdkVersion=\"16\" />" + NL + "" + NL + "\t<uses-permission android:name=\"android.permission.INTERNET\" />" + NL + "    <uses-permission android:name=\"android.permission.WRITE_EXTERNAL_STORAGE\" />" + NL + "    <uses-permission android:name=\"android.permission.READ_PHONE_STATE\"/>" + NL + "    <uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\"/>" + NL + "    <uses-permission android:name=\"android.permission.VIBRATE\"/>" + NL + "" + NL + "    <application" + NL + "        android:allowBackup=\"true\"" + NL + "        android:icon=\"@drawable/ic_launcher\"" + NL + "        android:label=\"@string/app_name\"" + NL + "        android:theme=\"@style/AppTheme\" >" + NL + "        <activity" + NL + "            android:name=\"";
  protected final String TEXT_3 = ".app.";
  protected final String TEXT_4 = "PrincipalActivity\"" + NL + "            " + NL + "            android:label=\"@string/app_name\"" + NL + "             >" + NL + "            <intent-filter>" + NL + "                <action android:name=\"android.intent.action.MAIN\" />" + NL + "\t            <category android:name=\"android.intent.category.LAUNCHER\" />" + NL + "            </intent-filter>" + NL + "        </activity>" + NL + "    </application>" + NL + "" + NL + "</manifest>";
  protected final String TEXT_5 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
List<ClasseWrapper> classes = recursos.getListaClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( conf.getNomeAplicacao() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(TEXT_5);
    return stringBuffer.toString();
  }
}
