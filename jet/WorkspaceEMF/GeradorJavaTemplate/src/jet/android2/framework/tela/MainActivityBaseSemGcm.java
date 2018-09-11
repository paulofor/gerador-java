package jet.android2.framework.tela;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class MainActivityBaseSemGcm
{
  protected static String nl;
  public static synchronized MainActivityBaseSemGcm create(String lineSeparator)
  {
    nl = lineSeparator;
    MainActivityBaseSemGcm result = new MainActivityBaseSemGcm();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package ";
  protected final String TEXT_3 = ".tela;" + NL + "" + NL + "import android.content.Intent;" + NL + "import android.os.Bundle;" + NL + "import android.support.v7.app.AppCompatActivity;" + NL + "import android.support.v7.widget.Toolbar;" + NL + "" + NL + "import ";
  protected final String TEXT_4 = ".framework.log.DCLog;" + NL + "import ";
  protected final String TEXT_5 = ".framework.tela.ResourceObj;" + NL + "import ";
  protected final String TEXT_6 = ".template.R;" + NL + "" + NL + "" + NL + "" + NL + "public abstract class MainActivityBaseSemGcm extends AppCompatActivity {" + NL + "" + NL + "\t@Override" + NL + "    protected final void onCreate(Bundle savedInstanceState) {" + NL + "        super.onCreate(savedInstanceState);" + NL + "        setContentView(getLayoutResource());" + NL + "        inicializaToolbar();" + NL + "    }" + NL + "" + NL + "   \tprivate void inicializaToolbar() {" + NL + "        Toolbar toolbar = (Toolbar) this.findViewById(getToolbarResource());" + NL + "        toolbar.setTitle(getTitulo());" + NL + "        setSupportActionBar(toolbar);" + NL + "    }" + NL + "" + NL + "" + NL + "    protected abstract int getLayoutResource();" + NL + "    protected abstract int getToolbarResource();" + NL + "    protected abstract String getTitulo();" + NL + "" + NL + "}";
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
