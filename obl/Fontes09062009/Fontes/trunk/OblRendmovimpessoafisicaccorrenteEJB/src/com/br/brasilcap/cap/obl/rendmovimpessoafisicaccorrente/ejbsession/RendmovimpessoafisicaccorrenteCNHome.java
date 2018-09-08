package com.br.brasilcap.cap.obl.rendmovimpessoafisicaccorrente.ejbsession;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface RendmovimpessoafisicaccorrenteCNHome extends EJBHome
{
RendmovimpessoafisicaccorrenteCN create() throws RemoteException, CreateException;
}
