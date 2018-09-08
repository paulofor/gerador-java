package com.br.brasilcap.cap.obl.controlebasegrafica.ejbsession;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ControlebasegraficaCNHome extends EJBHome
{
ControlebasegraficaCN create() throws RemoteException, CreateException;
}
