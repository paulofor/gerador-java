package com.br.brasilcap.cap.obl.solicitacaoverificacaofutura.ejbsession;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface SolicitacaoverificacaofuturaCDHome extends EJBHome
{
SolicitacaoverificacaofuturaCD create() throws RemoteException, CreateException;
}
