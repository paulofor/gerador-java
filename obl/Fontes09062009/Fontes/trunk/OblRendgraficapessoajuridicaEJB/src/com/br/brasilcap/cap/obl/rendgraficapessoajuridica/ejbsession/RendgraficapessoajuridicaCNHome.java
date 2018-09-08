package com.br.brasilcap.cap.obl.rendgraficapessoajuridica.ejbsession;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface RendgraficapessoajuridicaCNHome extends EJBHome
{
RendgraficapessoajuridicaCN create() throws RemoteException, CreateException;
}
