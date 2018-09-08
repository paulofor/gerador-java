package jet.android2.sync;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class SyncAuthenticator
{
  protected static String nl;
  public static synchronized SyncAuthenticator create(String lineSeparator)
  {
    nl = lineSeparator;
    SyncAuthenticator result = new SyncAuthenticator();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package  ";
  protected final String TEXT_3 = ".sync;" + NL + "" + NL + "import android.accounts.AbstractAccountAuthenticator;" + NL + "import android.accounts.Account;" + NL + "import android.accounts.AccountAuthenticatorResponse;" + NL + "import android.accounts.NetworkErrorException;" + NL + "import android.content.Context;" + NL + "import android.os.Bundle;" + NL + "" + NL + "public class AplicacaoAuthenticator extends AbstractAccountAuthenticator{" + NL + "" + NL + "\tpublic AplicacaoAuthenticator(Context context) {" + NL + "        super(context);" + NL + "    }" + NL + "    " + NL + "     // No properties to edit." + NL + "    @Override" + NL + "    public Bundle editProperties(" + NL + "            AccountAuthenticatorResponse r, String s) {" + NL + "        throw new UnsupportedOperationException();" + NL + "    }" + NL + "" + NL + "    // Because we're not actually adding an account to the device, just return null." + NL + "    @Override" + NL + "    public Bundle addAccount(" + NL + "            AccountAuthenticatorResponse r," + NL + "            String s," + NL + "            String s2," + NL + "            String[] strings," + NL + "            Bundle bundle) throws NetworkErrorException {" + NL + "        return null;" + NL + "    }" + NL + "" + NL + "    // Ignore attempts to confirm credentials" + NL + "    @Override" + NL + "    public Bundle confirmCredentials(" + NL + "            AccountAuthenticatorResponse r," + NL + "            Account account," + NL + "            Bundle bundle) throws NetworkErrorException {" + NL + "        return null;" + NL + "    }" + NL + "" + NL + "    // Getting an authentication token is not supported" + NL + "    @Override" + NL + "    public Bundle getAuthToken(" + NL + "            AccountAuthenticatorResponse r," + NL + "            Account account," + NL + "            String s," + NL + "            Bundle bundle) throws NetworkErrorException {" + NL + "        throw new UnsupportedOperationException();" + NL + "    }" + NL + "" + NL + "    // Getting a label for the auth token is not supported" + NL + "    @Override" + NL + "    public String getAuthTokenLabel(String s) {" + NL + "        throw new UnsupportedOperationException();" + NL + "    }" + NL + "" + NL + "    // Updating user credentials is not supported" + NL + "    @Override" + NL + "    public Bundle updateCredentials(" + NL + "            AccountAuthenticatorResponse r," + NL + "            Account account," + NL + "            String s, Bundle bundle) throws NetworkErrorException {" + NL + "        throw new UnsupportedOperationException();" + NL + "    }" + NL + "" + NL + "    // Checking features for the account is not supported" + NL + "    @Override" + NL + "    public Bundle hasFeatures(" + NL + "            AccountAuthenticatorResponse r," + NL + "            Account account, String[] strings) throws NetworkErrorException {" + NL + "        throw new UnsupportedOperationException();" + NL + "    }" + NL + "\t" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
Recursos recursos = (Recursos) argument;  
List<ClasseWrapper> classes = recursos.getListaClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}
