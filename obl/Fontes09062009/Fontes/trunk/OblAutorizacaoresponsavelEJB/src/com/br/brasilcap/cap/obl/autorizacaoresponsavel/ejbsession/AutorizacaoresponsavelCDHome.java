package com.br.brasilcap.cap.obl.autorizacaoresponsavel.ejbsession;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface AutorizacaoresponsavelCDHome extends EJBHome
{
AutorizacaoresponsavelCD create() throws RemoteException, CreateException;
}
