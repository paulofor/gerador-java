package com.br.brasilcap.cap.obl.controlebaseparceirovenda.ejbsession;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ControlebaseparceirovendaCNHome extends EJBHome
{
ControlebaseparceirovendaCN create() throws RemoteException, CreateException;
}
