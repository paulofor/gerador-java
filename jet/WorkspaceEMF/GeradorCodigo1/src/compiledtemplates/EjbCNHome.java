package compiledtemplates;

import java.util.*;
import util.wrappers.*;

public class EjbCNHome
{
  protected static String nl;
  public static synchronized EjbCNHome create(String lineSeparator)
  {
    nl = lineSeparator;
    EjbCNHome result = new EjbCNHome();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import java.rmi.RemoteException;" + NL + "" + NL + "import javax.ejb.CreateException;" + NL + "import javax.ejb.EJBHome;" + NL + "" + NL + "public interface ";
  protected final String TEXT_3 = "CNHome extends EJBHome {";
  protected final String TEXT_4 = NL + "    ";
  protected final String TEXT_5 = "CN create() throws RemoteException, CreateException;" + NL + "}" + NL;
  protected final String TEXT_6 = NL;

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
    stringBuffer.append( classe.getNomeParaClasse() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append(TEXT_6);
    return stringBuffer.toString();
  }
}
