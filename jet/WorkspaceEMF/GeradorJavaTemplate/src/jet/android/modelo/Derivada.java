package jet.android.modelo;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class Derivada
{
  protected static String nl;
  public static synchronized Derivada create(String lineSeparator)
  {
    nl = lineSeparator;
    Derivada result = new Derivada();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".modelo.derivada.impl;" + NL + "" + NL + "import  ";
  protected final String TEXT_3 = ".modelo.derivada.*;" + NL + "import  ";
  protected final String TEXT_4 = ".modelo.*;" + NL + "import org.json.JSONObject;" + NL + "import org.json.JSONException;" + NL + "" + NL + "public class ";
  protected final String TEXT_5 = "Derivada implements ";
  protected final String TEXT_6 = "DerivadaI{ " + NL + "  " + NL + "  \tprivate ";
  protected final String TEXT_7 = " principal;" + NL + "  " + NL + "  \t/*" + NL + "  \tpublic ";
  protected final String TEXT_8 = "Derivada(JSONObject json) throws JSONException{" + NL + "\t\tsuper(json);" + NL + "  \t} " + NL + "  \tpublic ";
  protected final String TEXT_9 = "Derivada() {" + NL + "\t\tsuper();" + NL + "  \t}" + NL + "  \t*/" + NL + "  \t" + NL + "  \tpublic ";
  protected final String TEXT_10 = "Derivada(";
  protected final String TEXT_11 = " item) {" + NL + "  \t\tprincipal = item;" + NL + "  \t}" + NL + "  \t" + NL + "  \t@Override" + NL + "\tpublic String getTituloTela() {" + NL + "\t\treturn \"";
  protected final String TEXT_12 = "Derivada sem getTituloTela()\";" + NL + "\t}" + NL + "}";

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
    stringBuffer.append( conf.getNamespace() );
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
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_12);
    return stringBuffer.toString();
  }
}
