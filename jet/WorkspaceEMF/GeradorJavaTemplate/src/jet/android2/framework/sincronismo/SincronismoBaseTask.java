package jet.android2.framework.sincronismo;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class SincronismoBaseTask
{
  protected static String nl;
  public static synchronized SincronismoBaseTask create(String lineSeparator)
  {
    nl = lineSeparator;
    SincronismoBaseTask result = new SincronismoBaseTask();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".framework.sincronismo;" + NL + "" + NL + "import android.content.Context;" + NL + "import android.os.AsyncTask;" + NL + "" + NL + "public abstract class SincronismoBaseTask extends AsyncTask<Context, Void, Void> {" + NL + "" + NL + "    public interface CallbackSincronismo {" + NL + "        public void onConcluido();" + NL + "    }" + NL + "" + NL + "    private CallbackSincronismo callbackSincronismo = null;" + NL + "" + NL + "    public void setCallback(CallbackSincronismo callback) {" + NL + "        callbackSincronismo = callback;" + NL + "    }" + NL + "    " + NL + "    @Override" + NL + "    protected void onPostExecute(Void aVoid) {" + NL + "        super.onPostExecute(aVoid);" + NL + "        callbackSincronismo.onConcluido();" + NL + "    }" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
List<ClasseWrapper> classes = recursos.getListaClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
