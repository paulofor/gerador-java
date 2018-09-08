package com.br.brasilcap.cap.obl.consultacodretencao.ejbsession;
import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
public interface ConsultacodretencaoCDHome extends EJBHome
{
ConsultacodretencaoCD create() throws RemoteException, CreateException;
}
