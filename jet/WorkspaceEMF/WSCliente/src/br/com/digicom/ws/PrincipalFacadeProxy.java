package br.com.digicom.ws;

public class PrincipalFacadeProxy implements br.com.digicom.ws.PrincipalFacade {
  private String _endpoint = null;
  private br.com.digicom.ws.PrincipalFacade principalFacade = null;
  
  public PrincipalFacadeProxy() {
    _initPrincipalFacadeProxy();
  }
  
  public PrincipalFacadeProxy(String endpoint) {
    _endpoint = endpoint;
    _initPrincipalFacadeProxy();
  }
  
  private void _initPrincipalFacadeProxy() {
    try {
      principalFacade = (new br.com.digicom.ws.PrincipalFacadeServiceLocator()).getPrincipalFacadePort();
      if (principalFacade != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)principalFacade)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)principalFacade)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (principalFacade != null)
      ((javax.xml.rpc.Stub)principalFacade)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.digicom.ws.PrincipalFacade getPrincipalFacade() {
    if (principalFacade == null)
      _initPrincipalFacadeProxy();
    return principalFacade;
  }
  
  public void geraTemplatesJava(long idAplicacao) throws java.rmi.RemoteException{
    if (principalFacade == null)
      _initPrincipalFacadeProxy();
    principalFacade.geraTemplatesJava(idAplicacao);
  }
  
  
}