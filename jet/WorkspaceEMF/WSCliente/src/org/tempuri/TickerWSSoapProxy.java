package org.tempuri;

public class TickerWSSoapProxy implements org.tempuri.TickerWSSoap {
  private String _endpoint = null;
  private org.tempuri.TickerWSSoap tickerWSSoap = null;
  
  public TickerWSSoapProxy() {
    _initTickerWSSoapProxy();
  }
  
  public TickerWSSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initTickerWSSoapProxy();
  }
  
  private void _initTickerWSSoapProxy() {
    try {
      tickerWSSoap = (new org.tempuri.TickerWSLocator()).getTickerWSSoap();
      if (tickerWSSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)tickerWSSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)tickerWSSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (tickerWSSoap != null)
      ((javax.xml.rpc.Stub)tickerWSSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.TickerWSSoap getTickerWSSoap() {
    if (tickerWSSoap == null)
      _initTickerWSSoapProxy();
    return tickerWSSoap;
  }
  
  public org.tempuri.TickerObjetoWs[] listaCorrente() throws java.rmi.RemoteException{
    if (tickerWSSoap == null)
      _initTickerWSSoapProxy();
    return tickerWSSoap.listaCorrente();
  }
  
  public org.tempuri.TickerObjetoWs[] insereTicker(org.tempuri.TickerObjetoWs ticker, org.tempuri.TickerFiltro filtro) throws java.rmi.RemoteException{
    if (tickerWSSoap == null)
      _initTickerWSSoapProxy();
    return tickerWSSoap.insereTicker(ticker, filtro);
  }
  
  public org.tempuri.TickerObjetoWs[] alteraTicker(org.tempuri.TickerObjetoWs ticker, org.tempuri.TickerFiltro filtro) throws java.rmi.RemoteException{
    if (tickerWSSoap == null)
      _initTickerWSSoapProxy();
    return tickerWSSoap.alteraTicker(ticker, filtro);
  }
  
  public org.tempuri.TickerObjetoWs[] listaAtivoOpcao(org.tempuri.TickerFiltro filtro) throws java.rmi.RemoteException{
    if (tickerWSSoap == null)
      _initTickerWSSoapProxy();
    return tickerWSSoap.listaAtivoOpcao(filtro);
  }
  
  public org.tempuri.TickerObjetoWs obtemPorNomeTicker(org.tempuri.TickerFiltro filtro) throws java.rmi.RemoteException{
    if (tickerWSSoap == null)
      _initTickerWSSoapProxy();
    return tickerWSSoap.obtemPorNomeTicker(filtro);
  }
  
  public org.tempuri.TickerObjetoWs[] listaAtivo(org.tempuri.TickerFiltro filtro) throws java.rmi.RemoteException{
    if (tickerWSSoap == null)
      _initTickerWSSoapProxy();
    return tickerWSSoap.listaAtivo(filtro);
  }
  
  public org.tempuri.TickerObjetoWs[] listaNaoRelacionadaEmCombinacaoExecucaoCompraListaGerou(long idCombinacaoExecucaoCompra) throws java.rmi.RemoteException{
    if (tickerWSSoap == null)
      _initTickerWSSoapProxy();
    return tickerWSSoap.listaNaoRelacionadaEmCombinacaoExecucaoCompraListaGerou(idCombinacaoExecucaoCompra);
  }
  
  public org.tempuri.TickerObjetoWs[] listaNaoRelacionadaEmSplitListaPossui(long idSplit) throws java.rmi.RemoteException{
    if (tickerWSSoap == null)
      _initTickerWSSoapProxy();
    return tickerWSSoap.listaNaoRelacionadaEmSplitListaPossui(idSplit);
  }
  
  public org.tempuri.TickerObjetoWs[] listaNaoRelacionadaEmOpcaoSisacaoListaGera(long idOpcaoSisacao) throws java.rmi.RemoteException{
    if (tickerWSSoap == null)
      _initTickerWSSoapProxy();
    return tickerWSSoap.listaNaoRelacionadaEmOpcaoSisacaoListaGera(idOpcaoSisacao);
  }
  
  public org.tempuri.TickerObjetoWs[] listaNaoRelacionadaEmOpcaoSisacaoSerieTickerListaRelacionadoCom(long idOpcaoSisacaoSerie) throws java.rmi.RemoteException{
    if (tickerWSSoap == null)
      _initTickerWSSoapProxy();
    return tickerWSSoap.listaNaoRelacionadaEmOpcaoSisacaoSerieTickerListaRelacionadoCom(idOpcaoSisacaoSerie);
  }
  
  public org.tempuri.TickerObjetoWs[] listaPorFiltroObjeto(org.tempuri.TickerFiltro filtro) throws java.rmi.RemoteException{
    if (tickerWSSoap == null)
      _initTickerWSSoapProxy();
    return tickerWSSoap.listaPorFiltroObjeto(filtro);
  }
  
  public org.tempuri.TickerObjetoWs obtemPorChave(long id) throws java.rmi.RemoteException{
    if (tickerWSSoap == null)
      _initTickerWSSoapProxy();
    return tickerWSSoap.obtemPorChave(id);
  }
  
  
}