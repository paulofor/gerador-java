package jet.android.view;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class ListUsoAdapter
{
  protected static String nl;
  public static synchronized ListUsoAdapter create(String lineSeparator)
  {
    nl = lineSeparator;
    ListUsoAdapter result = new ListUsoAdapter();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package  ";
  protected final String TEXT_2 = ".view.adapter.listauso;" + NL + "" + NL + "import java.util.List;" + NL + "import br.com.digicom.activity.DigicomContexto;" + NL + "import ";
  protected final String TEXT_3 = ".modelo.";
  protected final String TEXT_4 = ";" + NL + "import ";
  protected final String TEXT_5 = ".view.adapter.listauso.base.";
  protected final String TEXT_6 = "ListUsoAdapterBase;" + NL + "" + NL + "" + NL + "public class ";
  protected final String TEXT_7 = "ListUsoAdapter extends ";
  protected final String TEXT_8 = "ListUsoAdapterBase {" + NL + "\t" + NL + "\tpublic ";
  protected final String TEXT_9 = "ListUsoAdapter(List<";
  protected final String TEXT_10 = "> lista, DigicomContexto context) {" + NL + "\t\tsuper(lista, context);" + NL + "\t}" + NL + "\t" + NL + "}";
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
