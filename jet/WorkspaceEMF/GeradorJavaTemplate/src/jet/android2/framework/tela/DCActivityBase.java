package jet.android2.framework.tela;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class DCActivityBase
{
  protected static String nl;
  public static synchronized DCActivityBase create(String lineSeparator)
  {
    nl = lineSeparator;
    DCActivityBase result = new DCActivityBase();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package ";
  protected final String TEXT_3 = ".framework.tela;" + NL + "" + NL + "import android.support.v7.app.AppCompatActivity;" + NL + "import android.os.Bundle;" + NL + "import android.support.v7.widget.Toolbar;" + NL + "import android.view.MenuItem;" + NL + "import ";
  protected final String TEXT_4 = ".framework.log.DCLog;" + NL + "import ";
  protected final String TEXT_5 = ".framework.tela.ResourceObj;" + NL + "" + NL + "" + NL + "public abstract class DCActivityBase extends AppCompatActivity {" + NL + "" + NL + "\tprotected ResourceObj resourceObj = getLayoutResource();" + NL + "\t" + NL + "\t" + NL + "\t" + NL + "\t@Override" + NL + "    protected final void onCreate(Bundle savedInstanceState) {" + NL + "    \tDCLog.d(DCLog.TRACE_DISPLAY,this,getClass().getSimpleName() + \" (\" + getLayoutResource().getNome() + \")\" );" + NL + "        super.onCreate(savedInstanceState);" + NL + "        setContentView(getLayoutResource().getCodigo());" + NL + "        onCreateComplemento(savedInstanceState);" + NL + "         //criaToolbar(\"Lista de Espera\",R.id.toolbar_lista_espera);" + NL + "    }" + NL + "\t" + NL + "\t" + NL + "    protected void criaToolbar(String texto, int idToolbar) {" + NL + "        Toolbar toolbar = (Toolbar) this.findViewById(idToolbar);" + NL + "        toolbar.setTitle(texto);" + NL + "        setSupportActionBar(toolbar);" + NL + "        getSupportActionBar().setDisplayHomeAsUpEnabled(true);" + NL + "    }" + NL + "\t" + NL + "\t@Override" + NL + "    public boolean onOptionsItemSelected(MenuItem item) {" + NL + "        if (item.getItemId()==android.R.id.home) {" + NL + "            finish();" + NL + "            return true;" + NL + "        }" + NL + "        return super.onOptionsItemSelected(item);" + NL + "    }" + NL + "    " + NL + "\tprotected abstract void onCreateComplemento(Bundle savedInstanceState);" + NL + "\tprotected abstract ResourceObj getLayoutResource();" + NL + "}";

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
    return stringBuffer.toString();
  }
}
