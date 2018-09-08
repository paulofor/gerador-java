package org.tempuri;

public class OpcaoSisacaoSerieTickerWSSoapProxy implements org.tempuri.OpcaoSisacaoSerieTickerWSSoap {
  private String _endpoint = null;
  private org.tempuri.OpcaoSisacaoSerieTickerWSSoap opcaoSisacaoSerieTickerWSSoap = null;
  
  public OpcaoSisacaoSerieTickerWSSoapProxy() {
    _initOpcaoSisacaoSerieTickerWSSoapProxy();
  }
  
  public OpcaoSisacaoSerieTickerWSSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initOpcaoSisacaoSerieTickerWSSoapProxy();
  }
  
  private void _initOpcaoSisacaoSerieTickerWSSoapProxy() {
    try {
      opcaoSisacaoSerieTickerWSSoap = (new org.tempuri.OpcaoSisacaoSerieTickerWSLocator()).getOpcaoSisacaoSerieTickerWSSoap();
      if (opcaoSisacaoSerieTickerWSSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)opcaoSisacaoSerieTickerWSSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)opcaoSisacaoSerieTickerWSSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (opcaoSisacaoSerieTickerWSSoap != null)
      ((javax.xml.rpc.Stub)opcaoSisacaoSerieTickerWSSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.OpcaoSisacaoSerieTickerWSSoap getOpcaoSisacaoSerieTickerWSSoap() {
    if (opcaoSisacaoSerieTickerWSSoap == null)
      _initOpcaoSisacaoSerieTickerWSSoapProxy();
    return opcaoSisacaoSerieTickerWSSoap;
  }
  
  public org.tempuri.OpcaoSisacaoSerieTickerObjetoWs[] listaCorrente() throws java.rmi.RemoteException{
    if (opcaoSisacaoSerieTickerWSSoap == null)
      _initOpcaoSisacaoSerieTickerWSSoapProxy();
    return opcaoSisacaoSerieTickerWSSoap.listaCorrente();
  }
  
  public org.tempuri.OpcaoSisacaoSerieTickerObjetoWs[] insereOpcaoSisacaoSerieTicker(org.tempuri.OpcaoSisacaoSerieTickerObjetoWs opcaoSisacaoSerieTicker, org.tempuri.OpcaoSisacaoSerieTickerFiltro filtro) throws java.rmi.RemoteException{
    if (opcaoSisacaoSerieTickerWSSoap == null)
      _initOpcaoSisacaoSerieTickerWSSoapProxy();
    return opcaoSisacaoSerieTickerWSSoap.insereOpcaoSisacaoSerieTicker(opcaoSisacaoSerieTicker, filtro);
  }
  
  public org.tempuri.OpcaoSisacaoSerieTickerObjetoWs[] alteraOpcaoSisacaoSerieTicker(org.tempuri.OpcaoSisacaoSerieTickerObjetoWs opcaoSisacaoSerieTicker, org.tempuri.OpcaoSisacaoSerieTickerFiltro filtro) throws java.rmi.RemoteException{
    if (opcaoSisacaoSerieTickerWSSoap == null)
      _initOpcaoSisacaoSerieTickerWSSoapProxy();
    return opcaoSisacaoSerieTickerWSSoap.alteraOpcaoSisacaoSerieTicker(opcaoSisacaoSerieTicker, filtro);
  }
  
  public org.tempuri.OpcaoSisacaoSerieTickerObjetoWs criaOpcaoSisacaoTicker(org.tempuri.OpcaoSisacaoSerieTickerFiltro filtro) throws java.rmi.RemoteException{
    if (opcaoSisacaoSerieTickerWSSoap == null)
      _initOpcaoSisacaoSerieTickerWSSoapProxy();
    return opcaoSisacaoSerieTickerWSSoap.criaOpcaoSisacaoTicker(filtro);
  }
  
  public org.tempuri.OpcaoSisacaoSerieTickerObjetoWs[] alteracaoLoteOpcaoSisacaoSerieTicker(org.tempuri.OpcaoSisacaoSerieTickerObjetoWs[] listaInsercao, org.tempuri.OpcaoSisacaoSerieTickerObjetoWs[] listaRemocao, int codigoPerfil, int codigoParaRetorno) throws java.rmi.RemoteException{
    if (opcaoSisacaoSerieTickerWSSoap == null)
      _initOpcaoSisacaoSerieTickerWSSoapProxy();
    return opcaoSisacaoSerieTickerWSSoap.alteracaoLoteOpcaoSisacaoSerieTicker(listaInsercao, listaRemocao, codigoPerfil, codigoParaRetorno);
  }
  
  public org.tempuri.OpcaoSisacaoSerieTickerObjetoWs[] listaPorTickerReferenteA(long idItem) throws java.rmi.RemoteException{
    if (opcaoSisacaoSerieTickerWSSoap == null)
      _initOpcaoSisacaoSerieTickerWSSoapProxy();
    return opcaoSisacaoSerieTickerWSSoap.listaPorTickerReferenteA(idItem);
  }
  
  public org.tempuri.OpcaoSisacaoSerieTickerObjetoWs[] listaPorOpcaoSisacaoSerieReferenteA(long idItem) throws java.rmi.RemoteException{
    if (opcaoSisacaoSerieTickerWSSoap == null)
      _initOpcaoSisacaoSerieTickerWSSoapProxy();
    return opcaoSisacaoSerieTickerWSSoap.listaPorOpcaoSisacaoSerieReferenteA(idItem);
  }
  
  public org.tempuri.OpcaoSisacaoSerieTickerObjetoWs[] listaPorFiltroObjeto(org.tempuri.OpcaoSisacaoSerieTickerFiltro filtro) throws java.rmi.RemoteException{
    if (opcaoSisacaoSerieTickerWSSoap == null)
      _initOpcaoSisacaoSerieTickerWSSoapProxy();
    return opcaoSisacaoSerieTickerWSSoap.listaPorFiltroObjeto(filtro);
  }
  
  public org.tempuri.OpcaoSisacaoSerieTickerObjetoWs obtemPorChave(long id) throws java.rmi.RemoteException{
    if (opcaoSisacaoSerieTickerWSSoap == null)
      _initOpcaoSisacaoSerieTickerWSSoapProxy();
    return opcaoSisacaoSerieTickerWSSoap.obtemPorChave(id);
  }
  
  
}