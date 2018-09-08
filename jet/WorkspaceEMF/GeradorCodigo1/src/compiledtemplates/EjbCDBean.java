package compiledtemplates;

import java.util.*;
import util.wrappers.*;

public class EjbCDBean
{
  protected static String nl;
  public static synchronized EjbCDBean create(String lineSeparator)
  {
    nl = lineSeparator;
    EjbCDBean result = new EjbCDBean();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import com.br.brasilcap.arq.glb.log.standard.Log;" + NL + "import com.br.brasilcap.arq.glb.util.standard.CatalogoGlobal;" + NL + "" + NL + "import javax.ejb.EJBException;" + NL + "import javax.ejb.SessionBean;" + NL + "import javax.ejb.SessionContext;" + NL + "" + NL + "public class ";
  protected final String TEXT_3 = "CDBean implements SessionBean {" + NL + "    private SessionContext _context;" + NL + "    private Log log = null;" + NL + "" + NL + "    public void ejbCreate() {" + NL + "        log = " + NL + "new Log(CatalogoGlobal.CST_MODULO_OBRIGACAO_LEGAL, this.getClass());" + NL + "    }" + NL + "" + NL + "    public void setSessionContext(SessionContext context) throws EJBException {" + NL + "        _context = context;" + NL + "    }" + NL + "" + NL + "    public void ejbRemove() throws EJBException {" + NL + "    }" + NL + "" + NL + "    public void ejbActivate() throws EJBException {" + NL + "    }" + NL + "" + NL + "    public void ejbPassivate() throws EJBException {" + NL + "    }" + NL + "" + NL + "    public String getJNDI() {" + NL + "        return CatalogoGlobal.CST_JNDI_OBRIGACAO_LEGAL;" + NL + "    }" + NL + "}" + NL;
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
