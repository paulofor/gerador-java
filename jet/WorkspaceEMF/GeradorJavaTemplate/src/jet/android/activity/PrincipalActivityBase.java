package jet.android.activity;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class PrincipalActivityBase
{
  protected static String nl;
  public static synchronized PrincipalActivityBase create(String lineSeparator)
  {
    nl = lineSeparator;
    PrincipalActivityBase result = new PrincipalActivityBase();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package  ";
  protected final String TEXT_3 = ".app.base;" + NL + "" + NL + "import android.app.Fragment;" + NL + "import android.app.FragmentTransaction;" + NL + "import android.view.View;" + NL + "import br.com.digicom.quadro.IFragment;" + NL + "import br.com.digicom.activity.BaseFragmentActivity;" + NL + "import br.com.digicom.R;" + NL + "import android.app.ActionBar;" + NL + "import ";
  protected final String TEXT_4 = ".app.Sincronizador;" + NL + "//import ";
  protected final String TEXT_5 = ".app.R;" + NL + "import ";
  protected final String TEXT_6 = ".dao.datasource.DataSourceAplicacao;" + NL + "import ";
  protected final String TEXT_7 = ".modelo.Usuario;" + NL + "import ";
  protected final String TEXT_8 = ".modelo.vo.FabricaVo;" + NL + "import ";
  protected final String TEXT_9 = ".servico.FabricaServico;" + NL + "import ";
  protected final String TEXT_10 = ".servico.UsuarioServico;" + NL + "import android.os.Bundle;" + NL + "import br.com.digicom.activity.BaseNavigatorActivity;" + NL + "" + NL + "" + NL + "import android.support.v4.app.FragmentManager;" + NL + "" + NL + "" + NL + "// Nao passei para a arquitetura porque existem" + NL + "// muitas referencias a objetos R.* da aplica??o alem de" + NL + "// referencia a DataSource tambem da aplicacao." + NL + "public abstract class PrincipalActivityBase extends BaseNavigatorActivity {" + NL + "" + NL + "\t" + NL + "\tpublic void posOnCreate(Bundle savedInstanceState) {" + NL + "\t\tDataSourceAplicacao.criaInstancia(getApplication());" + NL + "       \t// Rever o processo de sincronizacao ate 02/06/2014" + NL + "       \tif (sincronizaInicio())" + NL + "       \t\tsincroniza();  " + NL + "       \tthis.inicializaServicos();" + NL + "       \t/*" + NL + "       \t \tgetSupportFragmentManager().addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() {" + NL + "            @Override" + NL + "            public void onBackStackChanged() {" + NL + "                IFragment fragment = (IFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_principal);;" + NL + "                if (fragment!=null && getActionBar()!=null) getActionBar().setTitle(fragment.getTituloTela());" + NL + "            }" + NL + "        });" + NL + "        */" + NL + "\t}" + NL + " " + NL + "\tprotected boolean sincronizaInicio() {" + NL + "\t\treturn true;" + NL + "\t}" + NL + "\t" + NL + "\tprotected void sincroniza() {" + NL + "\t\tSincronizador sinc = new Sincronizador();" + NL + "\t\tsinc.setContexto(getApplication());" + NL + "\t\tsinc.start();" + NL + "\t\ttry {" + NL + "\t\t\tsinc.join();" + NL + "\t\t} catch (InterruptedException e) {" + NL + "\t\t\te.printStackTrace();" + NL + "\t\t}" + NL + "\t}" + NL + "\t" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
Recursos recursos = (Recursos) argument;  
List<ClasseWrapper> classes = recursos.getListaClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_10);
    return stringBuffer.toString();
  }
}
