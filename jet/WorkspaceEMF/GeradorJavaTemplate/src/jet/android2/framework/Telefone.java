package jet.android2.framework;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class Telefone
{
  protected static String nl;
  public static synchronized Telefone create(String lineSeparator)
  {
    nl = lineSeparator;
    Telefone result = new Telefone();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package  ";
  protected final String TEXT_3 = ".framework.telefonia;" + NL + "" + NL + "import android.content.Context;" + NL + "import android.content.Intent;" + NL + "import android.content.IntentFilter;" + NL + "import android.os.BatteryManager;" + NL + "import android.os.Build;" + NL + "import android.telephony.TelephonyManager;" + NL + "" + NL + "public class Telefone {" + NL + "" + NL + "" + NL + "    public static String getNumero(Context ctx) {" + NL + "        TelephonyManager tMgr =(TelephonyManager) ctx.getSystemService(Context.TELEPHONY_SERVICE);" + NL + "        String mPhoneNumber = tMgr.getSimSerialNumber();" + NL + "        return mPhoneNumber.trim();" + NL + "        //return \"+552192902732\";" + NL + "    }" + NL + "" + NL + "" + NL + " \tpublic static String getModelo(Context ctx) {" + NL + "        return Build.MODEL;" + NL + "    }" + NL + "" + NL + "" + NL + "" + NL + "    public static float getNivelBateria(Context ctx) {" + NL + "        IntentFilter ifilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);" + NL + "        Intent batteryStatus = ctx.registerReceiver(null, ifilter);" + NL + "" + NL + "        int level = batteryStatus.getIntExtra(BatteryManager.EXTRA_LEVEL, -1);" + NL + "        int scale = batteryStatus.getIntExtra(BatteryManager.EXTRA_SCALE, -1);" + NL + "" + NL + "        float batteryPct = level / (float)scale;" + NL + "        return batteryPct;" + NL + "    }" + NL + "}";
  protected final String TEXT_4 = NL;

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
    stringBuffer.append(TEXT_4);
    return stringBuffer.toString();
  }
}
