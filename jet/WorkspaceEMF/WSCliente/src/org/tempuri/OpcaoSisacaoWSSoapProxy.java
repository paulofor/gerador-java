package org.tempuri;

public class OpcaoSisacaoWSSoapProxy implements org.tempuri.OpcaoSisacaoWSSoap {
  private String _endpoint = null;
  private org.tempuri.OpcaoSisacaoWSSoap opcaoSisacaoWSSoap = null;
  
  public OpcaoSisacaoWSSoapProxy() {
    _initOpcaoSisacaoWSSoapProxy();
  }
  
  public OpcaoSisacaoWSSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initOpcaoSisacaoWSSoapProxy();
  }
  
  private void _initOpcaoSisacaoWSSoapProxy() {
    try {
      opcaoSisacaoWSSoap = (new org.tempuri.OpcaoSisacaoWSLocator()).getOpcaoSisacaoWSSoap();
      if (opcaoSisacaoWSSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)opcaoSisacaoWSSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)opcaoSisacaoWSSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (opcaoSisacaoWSSoap != null)
      ((javax.xml.rpc.Stub)opcaoSisacaoWSSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.OpcaoSisacaoWSSoap getOpcaoSisacaoWSSoap() {
    if (opcaoSisacaoWSSoap == null)
      _initOpcaoSisacaoWSSoapProxy();
    return opcaoSisacaoWSSoap;
  }
  
  public org.tempuri.OpcaoSisacaoObjetoWs[] listaCorrente() throws java.rmi.RemoteException{
    if (opcaoSisacaoWSSoap == null)
      _initOpcaoSisacaoWSSoapProxy();
    return opcaoSisacaoWSSoap.listaCorrente();
  }
  
  public org.tempuri.OpcaoSisacaoObjetoWs[] insereOpcaoSisacao(org.tempuri.OpcaoSisacaoObjetoWs opcaoSisacao, org.tempuri.OpcaoSisacaoFiltro filtro) throws java.rmi.RemoteException{
    if (opcaoSisacaoWSSoap == null)
      _initOpcaoSisacaoWSSoapProxy();
    return opcaoSisacaoWSSoap.insereOpcaoSisacao(opcaoSisacao, filtro);
  }
  
  public org.tempuri.OpcaoSisacaoObjetoWs[] alteraOpcaoSisacao(org.tempuri.OpcaoSisacaoObjetoWs opcaoSisacao, org.tempuri.OpcaoSisacaoFiltro filtro) throws java.rmi.RemoteException{
    if (opcaoSisacaoWSSoap == null)
      _initOpcaoSisacaoWSSoapProxy();
    return opcaoSisacaoWSSoap.alteraOpcaoSisacao(opcaoSisacao, filtro);
  }
  
  public org.tempuri.OpcaoSisacaoObjetoWs[] listaAtivoOpcao(org.tempuri.OpcaoSisacaoFiltro filtro) throws java.rmi.RemoteException{
    if (opcaoSisacaoWSSoap == null)
      _initOpcaoSisacaoWSSoapProxy();
    return opcaoSisacaoWSSoap.listaAtivoOpcao(filtro);
  }
  
  public org.tempuri.OpcaoSisacaoObjetoWs[] listaAtivoAnoComSerie(org.tempuri.OpcaoSisacaoFiltro filtro) throws java.rmi.RemoteException{
    if (opcaoSisacaoWSSoap == null)
      _initOpcaoSisacaoWSSoapProxy();
    return opcaoSisacaoWSSoap.listaAtivoAnoComSerie(filtro);
  }
  
  public org.tempuri.OpcaoSisacaoObjetoWs[] listaPorTickerDerivativoDe(long idItem) throws java.rmi.RemoteException{
    if (opcaoSisacaoWSSoap == null)
      _initOpcaoSisacaoWSSoapProxy();
    return opcaoSisacaoWSSoap.listaPorTickerDerivativoDe(idItem);
  }
  
  public org.tempuri.OpcaoSisacaoObjetoWs[] listaPorOpcaoSisacaoSeriePertenceA(long idItem) throws java.rmi.RemoteException{
    if (opcaoSisacaoWSSoap == null)
      _initOpcaoSisacaoWSSoapProxy();
    return opcaoSisacaoWSSoap.listaPorOpcaoSisacaoSeriePertenceA(idItem);
  }
  
  public org.tempuri.OpcaoSisacaoObjetoWs[] listaPorFiltroObjeto(org.tempuri.OpcaoSisacaoFiltro filtro) throws java.rmi.RemoteException{
    if (opcaoSisacaoWSSoap == null)
      _initOpcaoSisacaoWSSoapProxy();
    return opcaoSisacaoWSSoap.listaPorFiltroObjeto(filtro);
  }
  
  public org.tempuri.OpcaoSisacaoObjetoWs obtemPorChave(long id) throws java.rmi.RemoteException{
    if (opcaoSisacaoWSSoap == null)
      _initOpcaoSisacaoWSSoapProxy();
    return opcaoSisacaoWSSoap.obtemPorChave(id);
  }
  
  
}