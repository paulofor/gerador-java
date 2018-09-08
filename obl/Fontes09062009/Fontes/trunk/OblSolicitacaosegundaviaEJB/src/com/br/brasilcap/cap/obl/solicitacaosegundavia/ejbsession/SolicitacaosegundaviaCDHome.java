package com.br.brasilcap.cap.obl.solicitacaosegundavia.ejbsession;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface SolicitacaosegundaviaCDHome extends EJBHome
{
SolicitacaosegundaviaCD create() throws RemoteException, CreateException;
}
