package com.br.brasilcap.cap.obl.rendmovimpessoajuridicacnpj.ejbsession;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface RendmovimpessoajuridicacnpjCDHome extends EJBHome
{
RendmovimpessoajuridicacnpjCD create() throws RemoteException, CreateException;
}
