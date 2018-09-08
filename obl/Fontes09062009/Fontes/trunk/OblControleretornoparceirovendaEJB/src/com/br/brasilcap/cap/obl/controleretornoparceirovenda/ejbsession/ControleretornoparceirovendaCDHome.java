package com.br.brasilcap.cap.obl.controleretornoparceirovenda.ejbsession;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ControleretornoparceirovendaCDHome extends EJBHome
{
ControleretornoparceirovendaCD create() throws RemoteException, CreateException;
}
