package jet.android.view;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class View
{
  protected static String nl;
  public static synchronized View create(String lineSeparator)
  {
    nl = lineSeparator;
    View result = new View();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package  ";
  protected final String TEXT_3 = ".view;" + NL + "" + NL + "import android.content.Context;" + NL + "import ";
  protected final String TEXT_4 = ".view.base.";
  protected final String TEXT_5 = "ViewBase;" + NL + "import ";
  protected final String TEXT_6 = ".modelo.*;" + NL + "" + NL + "public class ";
  protected final String TEXT_7 = "View extends  ";
  protected final String TEXT_8 = "ViewBase{" + NL + "" + NL + "\tpublic ";
  protected final String TEXT_9 = "View(";
  protected final String TEXT_10 = " item) {" + NL + "\t\tsuper(item);" + NL + "\t}" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_10);
    return stringBuffer.toString();
  }
}
