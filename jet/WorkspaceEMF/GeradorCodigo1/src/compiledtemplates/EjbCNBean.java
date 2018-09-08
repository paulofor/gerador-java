package compiledtemplates;

import java.util.*;
import util.wrappers.*;

public class EjbCNBean
{
  protected static String nl;
  public static synchronized EjbCNBean create(String lineSeparator)
  {
    nl = lineSeparator;
    EjbCNBean result = new EjbCNBean();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import com.br.brasilcap.arq.glb.log.standard.Log;" + NL + "import com.br.brasilcap.arq.glb.persistencia.standard.AbstractDTO;" + NL + "import com.br.brasilcap.arq.glb.persistencia.standard.Command;" + NL + "import com.br.brasilcap.arq.glb.persistencia.standard.CommandFactory;" + NL + "import com.br.brasilcap.arq.glb.persistencia.standard.ConcreteCommandFactory;" + NL + "import com.br.brasilcap.arq.glb.util.standard.BusinessException;" + NL + "import com.br.brasilcap.arq.glb.util.standard.CatalogoGlobal;" + NL + "" + NL + "import com.br.brasilcap.cap.obl.trataparametros.dto.Cap_lista_parametros_sps;" + NL + "" + NL + "import java.rmi.RemoteException;" + NL + "" + NL + "import javax.ejb.EJBException;" + NL + "import javax.ejb.SessionBean;" + NL + "import javax.ejb.SessionContext;" + NL + "" + NL + "import javax.sql.RowSet;" + NL + "" + NL + "public class ";
  protected final String TEXT_3 = "CNBean implements SessionBean {" + NL + "    private SessionContext _context;" + NL + "    private Log log = null;" + NL + "" + NL + "    public void ejbCreate() {" + NL + "        final String CST_METODO = \"ejbCreate\";" + NL + "        log = new Log(CatalogoGlobal.CST_MODULO_OBRIGACAO_LEGAL, this.getClass());" + NL + "        log.setInfo(CatalogoGlobal.CST_MENSAGEM_CRIAOBJ, CST_METODO);" + NL + "    }" + NL + "" + NL + "    public void setSessionContext(SessionContext context) throws EJBException {" + NL + "        _context = context;" + NL + "    }" + NL + "" + NL + "    public void ejbRemove() throws EJBException {" + NL + "    }" + NL + "" + NL + "    public void ejbActivate() throws EJBException {" + NL + "    }" + NL + "" + NL + "    public void ejbPassivate() throws EJBException {" + NL + "    }" + NL + "" + NL + "    public String getJNDI() {" + NL + "        return CatalogoGlobal.CST_JNDI_OBRIGACAO_LEGAL;" + NL + "    }" + NL + "" + NL + "    public RowSet listaParametros(AbstractDTO o, Object credencial) throws BusinessException, RemoteException{" + NL + "        String CST_METODO = \"listaParametros\";" + NL + "        log.setInfo(CatalogoGlobal.CST_MENSAGEM_METODOINI, CST_METODO);" + NL + "        return null;" + NL + "    }" + NL + "}" + NL;
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
