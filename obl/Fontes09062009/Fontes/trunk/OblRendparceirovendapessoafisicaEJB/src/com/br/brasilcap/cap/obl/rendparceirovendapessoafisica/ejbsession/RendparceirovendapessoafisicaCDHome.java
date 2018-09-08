package com.br.brasilcap.cap.obl.rendparceirovendapessoafisica.ejbsession;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface RendparceirovendapessoafisicaCDHome extends EJBHome
{
RendparceirovendapessoafisicaCD create() throws RemoteException, CreateException;
}
