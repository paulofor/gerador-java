package jet.android2.framework.xml;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class AuthenticatorXml
{
  protected static String nl;
  public static synchronized AuthenticatorXml create(String lineSeparator)
  {
    nl = lineSeparator;
    AuthenticatorXml result = new AuthenticatorXml();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<?xml version=\"1.0\" encoding=\"utf-8\"?>" + NL + "<account-authenticator xmlns:android=\"http://schemas.android.com/apk/res/android\"" + NL + "    android:accountType=\"@string/sync_account_type\"" + NL + "    android:icon=\"@mipmap/ic_launcher\"" + NL + "    android:label=\"@string/app_name\"" + NL + "    android:smallIcon=\"@mipmap/ic_launcher\" />";

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
