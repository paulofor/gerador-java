package jet.android.complementares;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class MenuFragment
{
  protected static String nl;
  public static synchronized MenuFragment create(String lineSeparator)
  {
    nl = lineSeparator;
    MenuFragment result = new MenuFragment();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".app;" + NL + "" + NL + "// Geracao Inicial" + NL + "" + NL + "import android.os.Bundle;" + NL + "import android.view.LayoutInflater;" + NL + "import android.view.View;" + NL + "import android.view.ViewGroup;" + NL + "import br.com.digicom.multimidia.AudioRecurso;" + NL + "import br.com.digicom.quadro.BaseMenuFragment;" + NL + "" + NL + "" + NL + "public class MenuFragment extends BaseMenuFragment {" + NL + "" + NL + "\tpublic final static String ITEM_MENU_SINCRONIZACAO = \"Sincronizacao\";" + NL + "\tpublic final static String ITEM_MENU_DIA_TREINO = \"DiaTreino\";" + NL + "\t" + NL + "\t" + NL + "\tprotected void setEscutadores() {" + NL + "\t\tthis.setOnClick(R.id.btnSincronizacao,ITEM_MENU_SINCRONIZACAO);" + NL + "\t\tthis.setOnClick(R.id.btnTreinar,ITEM_MENU_DIA_TREINO);" + NL + "\t}" + NL + "" + NL + "\tpublic View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {" + NL + "\t\tsuper.onCreateView(inflater, container, savedInstanceState);" + NL + "\t\tView tela = inflater.inflate(R.layout.main_menu, container, false);" + NL + "\t\treturn tela;" + NL + "\t}" + NL + "" + NL + "\tprotected void setBarraTopo() {" + NL + "\t\t//final ActionBar topBar = (ActionBar) this.getActivity().findViewById(R.id.topbarMenu);" + NL + "\t\t//topBar.setTitle(\"GerProj - Inicial\");" + NL + "\t}" + NL + "" + NL + "\t@Override" + NL + "\tpublic void audioRawConcluido(AudioRecurso audioRecurso) {" + NL + "\t\t// TODO Auto-generated method stub" + NL + "\t\t" + NL + "\t}" + NL + "" + NL + "\t" + NL + "\t" + NL + "}";
  protected final String TEXT_3 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
List<ClasseWrapper> classes = recursos.getListaClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}
