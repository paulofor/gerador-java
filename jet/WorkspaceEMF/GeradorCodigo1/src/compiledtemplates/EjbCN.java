package compiledtemplates;

import java.util.*;
import util.wrappers.*;

public class EjbCN
{
  protected static String nl;
  public static synchronized EjbCN create(String lineSeparator)
  {
    nl = lineSeparator;
    EjbCN result = new EjbCN();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import com.br.brasilcap.arq.glb.persistencia.standard.AbstractDTO;" + NL + "" + NL + "import com.br.brasilcap.arq.glb.util.standard.BusinessException;" + NL + "" + NL + "import java.rmi.RemoteException;" + NL + "" + NL + "import javax.ejb.EJBObject;" + NL + "" + NL + "import javax.sql.RowSet;" + NL + "" + NL + "public interface ";
  protected final String TEXT_3 = "CN extends EJBObject {" + NL + "    RowSet listaParametros(AbstractDTO o, " + NL + "                           Object credencial) throws BusinessException, " + NL + "                                                     RemoteException;" + NL + "" + NL + "}";
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
