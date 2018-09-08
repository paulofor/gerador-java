package com.br.brasilcap.cap.obl.controlemovimentoirrf.ejbsession;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ControlemovimentoirrfCDHome extends EJBHome
{
ControlemovimentoirrfCD create() throws RemoteException, CreateException;
}
