package com.br.brasilcap.cap.obl.rendgraficapessoafisica.ejbsession;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface RendgraficapessoafisicaCDHome extends EJBHome
{
RendgraficapessoafisicaCD create() throws RemoteException, CreateException;
}
