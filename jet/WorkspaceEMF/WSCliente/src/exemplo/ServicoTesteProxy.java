package exemplo;

public class ServicoTesteProxy implements exemplo.ServicoTeste {
  private String _endpoint = null;
  private exemplo.ServicoTeste servicoTeste = null;
  
  public ServicoTesteProxy() {
    _initServicoTesteProxy();
  }
  
  public ServicoTesteProxy(String endpoint) {
    _endpoint = endpoint;
    _initServicoTesteProxy();
  }
  
  private void _initServicoTesteProxy() {
    try {
      servicoTeste = (new exemplo.ServicoTesteServiceLocator()).getServicoTestePort();
      if (servicoTeste != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)servicoTeste)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)servicoTeste)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (servicoTeste != null)
      ((javax.xml.rpc.Stub)servicoTeste)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public exemplo.ServicoTeste getServicoTeste() {
    if (servicoTeste == null)
      _initServicoTesteProxy();
    return servicoTeste;
  }
  
  public java.lang.String obtemNome() throws java.rmi.RemoteException{
    if (servicoTeste == null)
      _initServicoTesteProxy();
    return servicoTeste.obtemNome();
  }
  
  public java.lang.String recebeNumero(long num) throws java.rmi.RemoteException{
    if (servicoTeste == null)
      _initServicoTesteProxy();
    return servicoTeste.recebeNumero(num);
  }
  
  
}