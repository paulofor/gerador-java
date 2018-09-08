package jet.android2.sync;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class SyncService
{
  protected static String nl;
  public static synchronized SyncService create(String lineSeparator)
  {
    nl = lineSeparator;
    SyncService result = new SyncService();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package  ";
  protected final String TEXT_3 = ".sync;" + NL + "" + NL + "import android.app.Service;" + NL + "import android.content.Intent;" + NL + "import android.os.IBinder;" + NL + "import android.util.Log;" + NL + "import android.content.Context;" + NL + "" + NL + "public abstract class AplicacaoSyncService extends Service {" + NL + "    private static final Object sSyncAdapterLock = new Object();" + NL + "    private static AplicacaoSyncAdapter sAppSyncAdapter = null;" + NL + "" + NL + "    @Override" + NL + "    public void onCreate() {" + NL + "          synchronized (sSyncAdapterLock) {" + NL + "            if (sAppSyncAdapter == null) {" + NL + "                sAppSyncAdapter = criaAdapter(getApplicationContext(), true);" + NL + "            }" + NL + "        }" + NL + "    }" + NL + "" + NL + "" + NL + "\tprotected abstract AplicacaoSyncAdapter criaAdapter(Context ctx, boolean valor);" + NL + "\t" + NL + "" + NL + "    @Override" + NL + "    public IBinder onBind(Intent intent) {" + NL + "        return sAppSyncAdapter.getSyncAdapterBinder();" + NL + "    }" + NL + "}";

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
