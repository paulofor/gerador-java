package jet.android.servico;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class ServicoJsonImpl
{
  protected static String nl;
  public static synchronized ServicoJsonImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    ServicoJsonImpl result = new ServicoJsonImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".*;" + NL + "" + NL + "public class ";
  protected final String TEXT_4 = "ServicoWsJsonImpl extends ";
  protected final String TEXT_5 = "ServicoWsJsonBase {" + NL + "" + NL + "\t" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNomePacoteServicoWsJsonImpl() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNomePacoteServicoWsJsonBase() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_5);
    return stringBuffer.toString();
  }
}
