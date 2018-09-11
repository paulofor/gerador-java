package jet.android2.framework.tela;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class MainActivityBase
{
  protected static String nl;
  public static synchronized MainActivityBase create(String lineSeparator)
  {
    nl = lineSeparator;
    MainActivityBase result = new MainActivityBase();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package ";
  protected final String TEXT_3 = ".tela;" + NL + "" + NL + "import android.content.Intent;" + NL + "import android.os.Bundle;" + NL + "import android.support.v7.app.AppCompatActivity;" + NL + "import android.support.v7.widget.Toolbar;" + NL + "" + NL + "import ";
  protected final String TEXT_4 = ".framework.log.DCLog;" + NL + "import ";
  protected final String TEXT_5 = ".framework.tela.ResourceObj;" + NL + "import ";
  protected final String TEXT_6 = ".template.R;" + NL + "" + NL + "import com.google.android.gms.common.ConnectionResult;" + NL + "import com.google.android.gms.common.GoogleApiAvailability;" + NL + "" + NL + "/**" + NL + " * Created by Paulo on 04/01/16." + NL + " */" + NL + "public abstract class MainActivityBase extends AppCompatActivity {" + NL + "" + NL + "    private static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;" + NL + "    private ResourceObj resourceObj = getActivityMainResource();" + NL + "" + NL + "    @Override" + NL + "    protected void onCreate(Bundle savedInstanceState) {" + NL + "        super.onCreate(savedInstanceState);" + NL + "        DCLog.d(DCLog.DISPLAY,this,\"(\" + resourceObj.getNome() + \")\");" + NL + "        setContentView(resourceObj.getCodigo());" + NL + "        " + NL + "        Toolbar toolbar = (Toolbar) findViewById(getToolbarId());" + NL + "        setSupportActionBar(toolbar);" + NL + "" + NL + "" + NL + "        if (checkPlayServices()) {" + NL + "            // Start IntentService to register this application with GCM." + NL + "            Intent intent = new Intent(this, getRegistrationIntentService());" + NL + "            startService(intent);" + NL + "        }" + NL + "        sincronizacaoManual();" + NL + "    }" + NL + "" + NL + "    protected void sincronizacaoManual() {" + NL + "" + NL + "    }" + NL + "" + NL + "    protected abstract Class<?> getRegistrationIntentService();" + NL + "" + NL + "    //protected abstract int getActivityMainId();" + NL + "    protected abstract ResourceObj getActivityMainResource();" + NL + "    protected abstract int getToolbarId();" + NL + "   " + NL + "" + NL + "" + NL + "    private boolean checkPlayServices() {" + NL + "        GoogleApiAvailability apiAvailability = GoogleApiAvailability.getInstance();" + NL + "        int resultCode = apiAvailability.isGooglePlayServicesAvailable(this);" + NL + "        if (resultCode != ConnectionResult.SUCCESS) {" + NL + "            if (apiAvailability.isUserResolvableError(resultCode)) {" + NL + "                apiAvailability.getErrorDialog(this, resultCode, PLAY_SERVICES_RESOLUTION_REQUEST).show();" + NL + "            } else {" + NL + "                finish();" + NL + "            }" + NL + "            return false;" + NL + "        }" + NL + "        return true;" + NL + "    }" + NL + "" + NL + "" + NL + "}";
  protected final String TEXT_7 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append(TEXT_7);
    return stringBuffer.toString();
  }
}
