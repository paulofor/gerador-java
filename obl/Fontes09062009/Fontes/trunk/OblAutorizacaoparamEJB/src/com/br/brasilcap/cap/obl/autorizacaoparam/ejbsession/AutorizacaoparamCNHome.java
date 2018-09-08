package com.br.brasilcap.cap.obl.autorizacaoparam.ejbsession;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface AutorizacaoparamCNHome extends EJBHome
{
AutorizacaoparamCN create() throws RemoteException, CreateException;
}
