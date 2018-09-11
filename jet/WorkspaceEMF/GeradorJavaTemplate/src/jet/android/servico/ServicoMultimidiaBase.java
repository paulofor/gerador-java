package jet.android.servico;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class ServicoMultimidiaBase
{
  protected static String nl;
  public static synchronized ServicoMultimidiaBase create(String lineSeparator)
  {
    nl = lineSeparator;
    ServicoMultimidiaBase result = new ServicoMultimidiaBase();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".servico.multimidia.base;" + NL + "" + NL + "" + NL + "" + NL + "public abstract class ";
  protected final String TEXT_3 = "ServicoMultimidiaBase {" + NL + "\t" + NL + "" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNamespace() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}
