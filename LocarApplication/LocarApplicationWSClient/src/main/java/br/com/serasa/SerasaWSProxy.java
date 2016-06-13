package br.com.serasa;

public class SerasaWSProxy implements br.com.serasa.SerasaWS {
  private String _endpoint = null;
  private br.com.serasa.SerasaWS serasaWS = null;
  
  public SerasaWSProxy() {
    _initSerasaWSProxy();
  }
  
  public SerasaWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initSerasaWSProxy();
  }
  
  private void _initSerasaWSProxy() {
    try {
      serasaWS = (new br.com.serasa.SerasaWSServiceLocator()).getSerasaWSPort();
      if (serasaWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)serasaWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)serasaWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (serasaWS != null)
      ((javax.xml.rpc.Stub)serasaWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.serasa.SerasaWS getSerasaWS() {
    if (serasaWS == null)
      _initSerasaWSProxy();
    return serasaWS;
  }
  
  public java.lang.String consultarDadosSerasa(java.lang.String arg0) throws java.rmi.RemoteException{
    if (serasaWS == null)
      _initSerasaWSProxy();
    return serasaWS.consultarDadosSerasa(arg0);
  }
  
  
}