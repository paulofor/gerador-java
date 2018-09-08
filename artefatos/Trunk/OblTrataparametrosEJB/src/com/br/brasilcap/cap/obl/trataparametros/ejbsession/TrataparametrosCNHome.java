package com.br.brasilcap.cap.obl.trataparametros.ejbsession;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;

public interface TrataparametrosCNHome extends EJBHome {
    TrataparametrosCN create() throws RemoteException, CreateException;
}

