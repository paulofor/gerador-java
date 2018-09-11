package jet.android2.framework.tela;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class DCAplicacao
{
  protected static String nl;
  public static synchronized DCAplicacao create(String lineSeparator)
  {
    nl = lineSeparator;
    DCAplicacao result = new DCAplicacao();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package ";
  protected final String TEXT_3 = ".framework.tela;" + NL + "" + NL + "import ";
  protected final String TEXT_4 = ".framework.faturamento.ConstantesBilling;" + NL + "import android.app.Application;" + NL + "" + NL + "public abstract class DCAplicacao extends Application {" + NL + "" + NL + "\tprivate ConstantesBilling billing = null;" + NL + "" + NL + "\tpublic DCAplicacao() {" + NL + "\t\tsuper();" + NL + "\t\tbilling = criaBilling();" + NL + "\t}" + NL + "" + NL + "\tpublic ConstantesBilling getBilling() {" + NL + "\t\treturn billing;" + NL + "\t}\t" + NL + "" + NL + "   \tpublic abstract String getLinkFacebook();" + NL + "   " + NL + "   \tpublic abstract Class activityInicio();" + NL + "   \t" + NL + "   \tprotected abstract ConstantesBilling criaBilling();" + NL + "}";
  protected final String TEXT_5 = NL;

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
    stringBuffer.append(TEXT_5);
    return stringBuffer.toString();
  }
}
