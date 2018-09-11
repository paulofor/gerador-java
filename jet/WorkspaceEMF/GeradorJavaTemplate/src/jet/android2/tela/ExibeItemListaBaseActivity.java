package jet.android2.tela;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class ExibeItemListaBaseActivity
{
  protected static String nl;
  public static synchronized ExibeItemListaBaseActivity create(String lineSeparator)
  {
    nl = lineSeparator;
    ExibeItemListaBaseActivity result = new ExibeItemListaBaseActivity();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package ";
  protected final String TEXT_3 = ".tela.base.activity.detalhe;" + NL + "" + NL + "import android.database.Cursor;" + NL + "import android.net.Uri;" + NL + "import android.os.Bundle;" + NL + "import android.support.v4.app.LoaderManager;" + NL + "import android.support.v4.content.Loader;" + NL + "import android.support.v7.app.ActionBar;" + NL + "import android.support.v7.app.AppCompatActivity;" + NL + "import android.support.v7.widget.Toolbar;" + NL + "import android.widget.TextView;" + NL + "import android.content.SharedPreferences;" + NL + "" + NL + "import android.widget.ImageView;" + NL + "import ";
  protected final String TEXT_4 = ".data.contract.";
  protected final String TEXT_5 = "Contract;" + NL + "import ";
  protected final String TEXT_6 = ".framework.dao.MontadorDaoI;" + NL + "import ";
  protected final String TEXT_7 = ".framework.data.DCCursorLoader;" + NL + "import ";
  protected final String TEXT_8 = ".framework.tela.ResourceObj;" + NL + "import ";
  protected final String TEXT_9 = ".modelo.";
  protected final String TEXT_10 = ";" + NL + "import ";
  protected final String TEXT_11 = ".framework.data.MontadorDaoComposite;" + NL + "import ";
  protected final String TEXT_12 = ".tela.base.activity.Constantes;" + NL + "import ";
  protected final String TEXT_13 = ".framework.storage.DownloadImageTask;" + NL + "" + NL + "" + NL + "" + NL + "public abstract class ";
  protected final String TEXT_14 = "ExibeItemListaBaseActivity extends ";
  protected final String TEXT_15 = "DetalheBaseActivity implements LoaderManager.LoaderCallbacks<Cursor> {" + NL + "" + NL + "\t" + NL + "}";

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
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( conf.getNamespaceExtendido() );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_15);
    return stringBuffer.toString();
  }
}
