package jet.android.servico;

import java.util.*;
import gerapp.app.*;
import jet.wrappers.base.*;
import jet.wrappers.android.*;
import gerapp.modelo.*;

public class ServicoSqliteImpl
{
  protected static String nl;
  public static synchronized ServicoSqliteImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    ServicoSqliteImpl result = new ServicoSqliteImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".*;" + NL + "" + NL + "public class ";
  protected final String TEXT_4 = "ServicoSqliteImpl extends ";
  protected final String TEXT_5 = "ServicoSqliteBase {" + NL + "" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
Recursos recursos = (Recursos) argument;  
ClasseWrapper classe = recursos.getClasse();
Configuracao conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( conf.getNomePacoteServicoSqliteImpl() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( conf.getNomePacoteServicoSqliteBase() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_5);
    return stringBuffer.toString();
  }
}
