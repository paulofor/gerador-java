package com.br.brasilcap.cap.obl.rendgraficapessoafisica.ejbsession;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface RendgraficapessoafisicaCNHome extends EJBHome
{
RendgraficapessoafisicaCN create() throws RemoteException, CreateException;
}
