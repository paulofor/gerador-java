package com.br.brasilcap.cap.obl.consultaperiodicidades.ejbsession;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ConsultaperiodicidadesCDHome extends EJBHome
{
ConsultaperiodicidadesCD create() throws RemoteException, CreateException;
}
