package com.br.brasilcap.cap.obl.trataparametros.ejbsession;

import com.br.brasilcap.arq.glb.persistencia.standard.AbstractDTO;

import com.br.brasilcap.arq.glb.util.standard.BusinessException;

import java.rmi.RemoteException;

import javax.ejb.EJBObject;

import javax.sql.RowSet;

public interface TrataparametrosCN extends EJBObject {
    RowSet listaParametros(AbstractDTO o, 
                           Object credencial) throws BusinessException, 
                                                     RemoteException;

}
