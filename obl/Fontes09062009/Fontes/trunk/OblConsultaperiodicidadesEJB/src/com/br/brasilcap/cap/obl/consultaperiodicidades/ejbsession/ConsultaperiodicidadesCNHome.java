package com.br.brasilcap.cap.obl.consultaperiodicidades.ejbsession;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ConsultaperiodicidadesCNHome extends EJBHome
{
ConsultaperiodicidadesCN create() throws RemoteException, CreateException;
}
