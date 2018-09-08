package compiledtemplates;

import java.util.*;
import util.wrappers.*;

public class EjbCD
{
  protected static String nl;
  public static synchronized EjbCD create(String lineSeparator)
  {
    nl = lineSeparator;
    EjbCD result = new EjbCD();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import javax.ejb.EJBObject;" + NL + "" + NL + "public interface ";
  protected final String TEXT_3 = "CD extends EJBObject {" + NL + "}";
  protected final String TEXT_4 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
RecursosClasse recursos = (RecursosClasse) argument;  
ClasseFuncionalidade classe = (ClasseFuncionalidade) recursos.getClasse();
ConfiguracaoWrapper conf = recursos.getConfiguracao();

    stringBuffer.append(TEXT_1);
    stringBuffer.append( classe.getPacoteEjb() );
    stringBuffer.append(TEXT_2);
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_3);
    stringBuffer.append(TEXT_4);
    return stringBuffer.toString();
  }
}
