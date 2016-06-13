package br.com.seguradora;

public class SeguradoraProxy implements br.com.seguradora.Seguradora {
  private String _endpoint = null;
  private br.com.seguradora.Seguradora seguradora = null;
  
  public SeguradoraProxy() {
    _initSeguradoraProxy();
  }
  
  public SeguradoraProxy(String endpoint) {
    _endpoint = endpoint;
    _initSeguradoraProxy();
  }
  
  private void _initSeguradoraProxy() {
    try {
      seguradora = (new br.com.seguradora.SeguradoraServiceLocator()).getSeguradoraPort();
      if (seguradora != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)seguradora)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)seguradora)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (seguradora != null)
      ((javax.xml.rpc.Stub)seguradora)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.seguradora.Seguradora getSeguradora() {
    if (seguradora == null)
      _initSeguradoraProxy();
    return seguradora;
  }
  
  public java.lang.String realizarAvaliacaoRisco(java.lang.String arg0) throws java.rmi.RemoteException{
    if (seguradora == null)
      _initSeguradoraProxy();
    return seguradora.realizarAvaliacaoRisco(arg0);
  }
  
  
}