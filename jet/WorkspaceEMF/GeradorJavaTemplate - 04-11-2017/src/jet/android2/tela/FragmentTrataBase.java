package jet.android2.tela;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class FragmentTrataBase
{
  protected static String nl;
  public static synchronized FragmentTrataBase create(String lineSeparator)
  {
    nl = lineSeparator;
    FragmentTrataBase result = new FragmentTrataBase();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package  ";
  protected final String TEXT_3 = ".tela.base;" + NL + "" + NL + "import android.content.ContentResolver;" + NL + "import android.net.Uri;" + NL + "import android.provider.BaseColumns;" + NL + "import android.support.v4.app.Fragment;" + NL + "import ";
  protected final String TEXT_4 = ".modelo.";
  protected final String TEXT_5 = ";" + NL + "import android.view.View;" + NL + "" + NL + "public abstract class ";
  protected final String TEXT_6 = "FragmentTrataBase extends Fragment{" + NL + "" + NL + "\tprivate ";
  protected final String TEXT_7 = " item = null;" + NL + "\t" + NL + "\tprotected ";
  protected final String TEXT_8 = " getItem() {" + NL + "\t\treturn item;" + NL + "\t}" + NL + "\tpublic void setItem(";
  protected final String TEXT_9 = " valor) {" + NL + "\t\titem = valor;" + NL + "\t}" + NL + "\t" + NL + "\tprotected abstract void inicializaCamposTela(View v);" + NL + "\t" + NL + "}";

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
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_9);
    return stringBuffer.toString();
  }
}
