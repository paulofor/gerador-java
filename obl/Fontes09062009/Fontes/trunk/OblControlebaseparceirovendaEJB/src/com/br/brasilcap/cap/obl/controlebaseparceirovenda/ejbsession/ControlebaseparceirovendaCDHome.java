package com.br.brasilcap.cap.obl.controlebaseparceirovenda.ejbsession;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ControlebaseparceirovendaCDHome extends EJBHome
{
ControlebaseparceirovendaCD create() throws RemoteException, CreateException;
}
