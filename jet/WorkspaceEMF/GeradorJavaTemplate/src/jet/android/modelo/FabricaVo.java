package jet.android.modelo;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class FabricaVo
{
  protected static String nl;
  public static synchronized FabricaVo create(String lineSeparator)
  {
    nl = lineSeparator;
    FabricaVo result = new FabricaVo();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".modelo.vo;" + NL + "" + NL + "import android.content.Context;" + NL + "import org.json.JSONObject;" + NL + "import org.json.JSONException;" + NL + "import ";
  protected final String TEXT_3 = ".modelo.*;" + NL + "import ";
  protected final String TEXT_4 = ".modelo.derivada.impl.*;" + NL + "" + NL + "public class FabricaVo {" + NL;
  protected final String TEXT_5 = NL + "\tpublic static ";
  protected final String TEXT_6 = " cria";
  protected final String TEXT_7 = "() {" + NL + "\t\treturn new ";
  protected final String TEXT_8 = "Vo();" + NL + "\t}" + NL + "\tpublic static ";
  protected final String TEXT_9 = " cria";
  protected final String TEXT_10 = "(JSONObject json) throws JSONException {" + NL + "\t\treturn new ";
  protected final String TEXT_11 = "Vo(json);" + NL + "\t}";
  protected final String TEXT_12 = NL + "}" + NL;
  protected final String TEXT_13 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
List<ClasseWrapper> classes = recursos.getListaClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_4);
    
	Iterator<ClasseWrapper> iterador = classes.iterator();
	while (iterador.hasNext()) {
		ClasseWrapper corrente = iterador.next();

    stringBuffer.append(TEXT_5);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_6);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_7);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( corrente.getNomeParaClasse() );
    stringBuffer.append(TEXT_11);
    
	}

    stringBuffer.append(TEXT_12);
    stringBuffer.append(TEXT_13);
    return stringBuffer.toString();
  }
}
