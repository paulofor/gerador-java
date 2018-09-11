package jet.android2.sync;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class SyncAuthenticatorService
{
  protected static String nl;
  public static synchronized SyncAuthenticatorService create(String lineSeparator)
  {
    nl = lineSeparator;
    SyncAuthenticatorService result = new SyncAuthenticatorService();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package  ";
  protected final String TEXT_3 = ".sync;" + NL + "" + NL + "import android.app.Service;" + NL + "import android.content.Intent;" + NL + "import android.os.IBinder;" + NL + "" + NL + "public class AplicacaoAuthenticatorService extends Service{" + NL + "\t// Instance field that stores the authenticator object" + NL + "    private AplicacaoAuthenticator mAuthenticator;" + NL + "" + NL + "    @Override" + NL + "    public void onCreate() {" + NL + "        // Create a new authenticator object" + NL + "        mAuthenticator = new AplicacaoAuthenticator(this);" + NL + "    }" + NL + "" + NL + "    /*" + NL + "     * When the system binds to this Service to make the RPC call" + NL + "     * return the authenticator's IBinder." + NL + "     */" + NL + "    @Override" + NL + "    public IBinder onBind(Intent intent) {" + NL + "        return mAuthenticator.getIBinder();" + NL + "    }" + NL + "}";

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
