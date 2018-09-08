package jet.android.modelo;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class Display
{
  protected static String nl;
  public static synchronized Display create(String lineSeparator)
  {
    nl = lineSeparator;
    Display result = new Display();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".modelo.display.impl;" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".modelo.";
  protected final String TEXT_4 = ";" + NL + "import android.view.View;" + NL + "import br.com.digicom.modelo.DisplayI;" + NL + "import br.com.digicom.modelo.ObjetoDisplay;" + NL + "" + NL + "public class ";
  protected final String TEXT_5 = "Display extends ObjetoDisplay<";
  protected final String TEXT_6 = "> implements DisplayI<";
  protected final String TEXT_7 = "> { " + NL + "  " + NL + "  \tpublic ";
  protected final String TEXT_8 = "Display(";
  protected final String TEXT_9 = " item) {" + NL + "\t\tsuper(item);" + NL + "\t} " + NL + "  \t" + NL + "  \t" + NL + "  }";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = (ClasseWrapper) recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( classe.getNomeParaClasse() );
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
