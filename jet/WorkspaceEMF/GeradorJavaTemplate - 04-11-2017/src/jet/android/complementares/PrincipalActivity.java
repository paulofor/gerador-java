package jet.android.complementares;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class PrincipalActivity
{
  protected static String nl;
  public static synchronized PrincipalActivity create(String lineSeparator)
  {
    nl = lineSeparator;
    PrincipalActivity result = new PrincipalActivity();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "package  ";
  protected final String TEXT_3 = ".app;" + NL + "" + NL + "import ";
  protected final String TEXT_4 = ".app.base.PrincipalActivityBase;" + NL + "import br.com.digicom.modelo.DCIObjetoDominio;" + NL + "import br.com.digicom.quadro.IFragment;" + NL + "" + NL + "public class ";
  protected final String TEXT_5 = "PrincipalActivity extends PrincipalActivityBase {" + NL + "\t" + NL + "" + NL + "\t@Override" + NL + "\tprotected void inicializaServicos() {" + NL + "\t}" + NL + "\t" + NL + "}";

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
    stringBuffer.append( conf.getNomeAplicacao() );
    stringBuffer.append(TEXT_5);
    return stringBuffer.toString();
  }
}
