package com.br.brasilcap.cap.obl.consultarotinas.ejbsession;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ConsultarotinasCNHome extends EJBHome
{
ConsultarotinasCN create() throws RemoteException, CreateException;
}
