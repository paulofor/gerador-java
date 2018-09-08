package com.br.brasilcap.cap.obl.consultacodretencao.ejbsession;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ConsultacodretencaoCNHome extends EJBHome
{
ConsultacodretencaoCN create() throws RemoteException, CreateException;
}
