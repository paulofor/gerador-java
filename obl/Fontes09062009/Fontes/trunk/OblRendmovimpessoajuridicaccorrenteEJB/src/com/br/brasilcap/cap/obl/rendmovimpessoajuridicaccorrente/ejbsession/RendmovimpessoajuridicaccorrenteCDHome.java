package com.br.brasilcap.cap.obl.rendmovimpessoajuridicaccorrente.ejbsession;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface RendmovimpessoajuridicaccorrenteCDHome extends EJBHome
{
RendmovimpessoajuridicaccorrenteCD create() throws RemoteException, CreateException;
}
