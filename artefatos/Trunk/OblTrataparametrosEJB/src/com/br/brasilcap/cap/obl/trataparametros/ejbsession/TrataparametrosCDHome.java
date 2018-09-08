package com.br.brasilcap.cap.obl.trataparametros.ejbsession;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;

public interface TrataparametrosCDHome extends EJBHome {
    TrataparametrosCD create() throws RemoteException, CreateException;
}

