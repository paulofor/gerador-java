package jet.android.complementares;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class Sincronizador
{
  protected static String nl;
  public static synchronized Sincronizador create(String lineSeparator)
  {
    nl = lineSeparator;
    Sincronizador result = new Sincronizador();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".app;" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".app.base.SincronizadorBase;" + NL + "import android.content.Context;" + NL + "" + NL + "public class Sincronizador extends SincronizadorBase{" + NL + "" + NL + "\tpublic void principal(Context contexto) {" + NL + "\t\to que vai ser sincronizado" + NL + "\t}" + NL + "\t" + NL + "\t" + NL + "\t" + NL + "\t" + NL + "}";

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
    return stringBuffer.toString();
  }
}
