package com.br.brasilcap.cap.obl.consultacodretencao.ejbsession;
import com.br.brasilcap.arq.glb.log.standard.Log;
import com.br.brasilcap.arq.glb.util.standard.CatalogoGlobal;
import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
public class ConsultacodretencaoCNBean implements SessionBean
{
private SessionContext _context;
private Log log = null;
public void ejbCreate()
{
log = new Log(CatalogoGlobal.CST_MODULO_OBRIGACAO_LEGAL, this.getClass());
}
public void setSessionContext(SessionContext context) throws EJBException
{
_context = context;
}
public void ejbRemove() throws EJBException
{
}
public void ejbActivate() throws EJBException
{
}
public void ejbPassivate() throws EJBException
{
}
public String getJNDI()
{
return CatalogoGlobal.CST_JNDI_OBRIGACAO_LEGAL;
}
}
