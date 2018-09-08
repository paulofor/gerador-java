package com.br.brasilcap.cap.obl.rendmovimpessoafisicacpf.ejbsession;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface RendmovimpessoafisicacpfCNHome extends EJBHome
{
RendmovimpessoafisicacpfCN create() throws RemoteException, CreateException;
}
