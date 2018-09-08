package jet.android2.framework.xml;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class SyncadapterXml
{
  protected static String nl;
  public static synchronized SyncadapterXml create(String lineSeparator)
  {
    nl = lineSeparator;
    SyncadapterXml result = new SyncadapterXml();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"utf-8\"?>" + NL + "<sync-adapter xmlns:android=\"http://schemas.android.com/apk/res/android\"" + NL + "    android:contentAuthority=\"@string/content_authority\"" + NL + "    android:accountType=\"@string/sync_account_type\"" + NL + "    android:userVisible=\"false\"" + NL + "    android:supportsUploading=\"false\"" + NL + "    android:allowParallelSyncs=\"false\"" + NL + "    android:isAlwaysSyncable=\"true\" />";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    return stringBuffer.toString();
  }
}
