package jet.android.view;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class ListEdicaoAdapter
{
  protected static String nl;
  public static synchronized ListEdicaoAdapter create(String lineSeparator)
  {
    nl = lineSeparator;
    ListEdicaoAdapter result = new ListEdicaoAdapter();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package  ";
  protected final String TEXT_2 = ".view.adapter.listaedicao;" + NL + "" + NL + "import java.util.List;" + NL + "import android.content.Context;" + NL + "import br.com.digicom.quadro.IQuadroListaEdicao;" + NL + "import ";
  protected final String TEXT_3 = ".modelo.";
  protected final String TEXT_4 = ";" + NL + "import ";
  protected final String TEXT_5 = ".view.adapter.listaedicao.base.";
  protected final String TEXT_6 = "ListEdicaoAdapterBase;" + NL + "" + NL + "public class ";
  protected final String TEXT_7 = "ListEdicaoAdapter extends ";
  protected final String TEXT_8 = "ListEdicaoAdapterBase {" + NL + "\t" + NL + "\t" + NL + "\tpublic ";
  protected final String TEXT_9 = "ListEdicaoAdapter(List<";
  protected final String TEXT_10 = "> lista,IQuadroListaEdicao origem, Context context) {" + NL + "\t\tsuper(lista, origem, context);" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "}";
  protected final String TEXT_11 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(TEXT_11);
    return stringBuffer.toString();
  }
}
