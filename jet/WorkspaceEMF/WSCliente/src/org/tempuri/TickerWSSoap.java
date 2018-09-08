/**
 * TickerWSSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface TickerWSSoap extends java.rmi.Remote {
    public org.tempuri.TickerObjetoWs[] listaCorrente() throws java.rmi.RemoteException;
    public org.tempuri.TickerObjetoWs[] insereTicker(org.tempuri.TickerObjetoWs ticker, org.tempuri.TickerFiltro filtro) throws java.rmi.RemoteException;
    public org.tempuri.TickerObjetoWs[] alteraTicker(org.tempuri.TickerObjetoWs ticker, org.tempuri.TickerFiltro filtro) throws java.rmi.RemoteException;
    public org.tempuri.TickerObjetoWs[] listaAtivoOpcao(org.tempuri.TickerFiltro filtro) throws java.rmi.RemoteException;
    public org.tempuri.TickerObjetoWs obtemPorNomeTicker(org.tempuri.TickerFiltro filtro) throws java.rmi.RemoteException;
    public org.tempuri.TickerObjetoWs[] listaAtivo(org.tempuri.TickerFiltro filtro) throws java.rmi.RemoteException;
    public org.tempuri.TickerObjetoWs[] listaNaoRelacionadaEmCombinacaoExecucaoCompraListaGerou(long idCombinacaoExecucaoCompra) throws java.rmi.RemoteException;
    public org.tempuri.TickerObjetoWs[] listaNaoRelacionadaEmSplitListaPossui(long idSplit) throws java.rmi.RemoteException;
    public org.tempuri.TickerObjetoWs[] listaNaoRelacionadaEmOpcaoSisacaoListaGera(long idOpcaoSisacao) throws java.rmi.RemoteException;
    public org.tempuri.TickerObjetoWs[] listaNaoRelacionadaEmOpcaoSisacaoSerieTickerListaRelacionadoCom(long idOpcaoSisacaoSerie) throws java.rmi.RemoteException;
    public org.tempuri.TickerObjetoWs[] listaPorFiltroObjeto(org.tempuri.TickerFiltro filtro) throws java.rmi.RemoteException;
    public org.tempuri.TickerObjetoWs obtemPorChave(long id) throws java.rmi.RemoteException;
}
