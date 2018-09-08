/**
 * OpcaoSisacaoWSSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface OpcaoSisacaoWSSoap extends java.rmi.Remote {
    public org.tempuri.OpcaoSisacaoObjetoWs[] listaCorrente() throws java.rmi.RemoteException;
    public org.tempuri.OpcaoSisacaoObjetoWs[] insereOpcaoSisacao(org.tempuri.OpcaoSisacaoObjetoWs opcaoSisacao, org.tempuri.OpcaoSisacaoFiltro filtro) throws java.rmi.RemoteException;
    public org.tempuri.OpcaoSisacaoObjetoWs[] alteraOpcaoSisacao(org.tempuri.OpcaoSisacaoObjetoWs opcaoSisacao, org.tempuri.OpcaoSisacaoFiltro filtro) throws java.rmi.RemoteException;
    public org.tempuri.OpcaoSisacaoObjetoWs[] listaAtivoOpcao(org.tempuri.OpcaoSisacaoFiltro filtro) throws java.rmi.RemoteException;
    public org.tempuri.OpcaoSisacaoObjetoWs[] listaAtivoAnoComSerie(org.tempuri.OpcaoSisacaoFiltro filtro) throws java.rmi.RemoteException;
    public org.tempuri.OpcaoSisacaoObjetoWs[] listaPorTickerDerivativoDe(long idItem) throws java.rmi.RemoteException;
    public org.tempuri.OpcaoSisacaoObjetoWs[] listaPorOpcaoSisacaoSeriePertenceA(long idItem) throws java.rmi.RemoteException;
    public org.tempuri.OpcaoSisacaoObjetoWs[] listaPorFiltroObjeto(org.tempuri.OpcaoSisacaoFiltro filtro) throws java.rmi.RemoteException;
    public org.tempuri.OpcaoSisacaoObjetoWs obtemPorChave(long id) throws java.rmi.RemoteException;
}
