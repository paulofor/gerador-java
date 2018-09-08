/**
 * OpcaoSisacaoSerieTickerWSSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface OpcaoSisacaoSerieTickerWSSoap extends java.rmi.Remote {
    public org.tempuri.OpcaoSisacaoSerieTickerObjetoWs[] listaCorrente() throws java.rmi.RemoteException;
    public org.tempuri.OpcaoSisacaoSerieTickerObjetoWs[] insereOpcaoSisacaoSerieTicker(org.tempuri.OpcaoSisacaoSerieTickerObjetoWs opcaoSisacaoSerieTicker, org.tempuri.OpcaoSisacaoSerieTickerFiltro filtro) throws java.rmi.RemoteException;
    public org.tempuri.OpcaoSisacaoSerieTickerObjetoWs[] alteraOpcaoSisacaoSerieTicker(org.tempuri.OpcaoSisacaoSerieTickerObjetoWs opcaoSisacaoSerieTicker, org.tempuri.OpcaoSisacaoSerieTickerFiltro filtro) throws java.rmi.RemoteException;
    public org.tempuri.OpcaoSisacaoSerieTickerObjetoWs criaOpcaoSisacaoTicker(org.tempuri.OpcaoSisacaoSerieTickerFiltro filtro) throws java.rmi.RemoteException;
    public org.tempuri.OpcaoSisacaoSerieTickerObjetoWs[] alteracaoLoteOpcaoSisacaoSerieTicker(org.tempuri.OpcaoSisacaoSerieTickerObjetoWs[] listaInsercao, org.tempuri.OpcaoSisacaoSerieTickerObjetoWs[] listaRemocao, int codigoPerfil, int codigoParaRetorno) throws java.rmi.RemoteException;
    public org.tempuri.OpcaoSisacaoSerieTickerObjetoWs[] listaPorTickerReferenteA(long idItem) throws java.rmi.RemoteException;
    public org.tempuri.OpcaoSisacaoSerieTickerObjetoWs[] listaPorOpcaoSisacaoSerieReferenteA(long idItem) throws java.rmi.RemoteException;
    public org.tempuri.OpcaoSisacaoSerieTickerObjetoWs[] listaPorFiltroObjeto(org.tempuri.OpcaoSisacaoSerieTickerFiltro filtro) throws java.rmi.RemoteException;
    public org.tempuri.OpcaoSisacaoSerieTickerObjetoWs obtemPorChave(long id) throws java.rmi.RemoteException;
}
