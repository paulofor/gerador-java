package com.br.brasilcap.cap.obl.autorizacaoproces.ejbsession;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface AutorizacaoprocesCDHome extends EJBHome
{
AutorizacaoprocesCD create() throws RemoteException, CreateException;
}
