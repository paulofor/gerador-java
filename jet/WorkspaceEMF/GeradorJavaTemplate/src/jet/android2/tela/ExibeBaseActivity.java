package jet.android2.tela;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class ExibeBaseActivity
{
  protected static String nl;
  public static synchronized ExibeBaseActivity create(String lineSeparator)
  {
    nl = lineSeparator;
    ExibeBaseActivity result = new ExibeBaseActivity();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package ";
  protected final String TEXT_3 = ".tela.base.activity.exibe;" + NL + "" + NL + "import android.support.v7.app.AppCompatActivity;" + NL + "" + NL + "public abstract class ";
  protected final String TEXT_4 = "ExibeBaseActivity extends AppCompatActivity  {" + NL + "" + NL + "\t" + NL + "}";

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
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_4);
    return stringBuffer.toString();
  }
}
