package br.com.detran;

public class DetranWSProxy implements br.com.detran.DetranWS {
  private String _endpoint = null;
  private br.com.detran.DetranWS detranWS = null;
  
  public DetranWSProxy() {
    _initDetranWSProxy();
  }
  
  public DetranWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initDetranWSProxy();
  }
  
  private void _initDetranWSProxy() {
    try {
      detranWS = (new br.com.detran.DetranWSServiceLocator()).getDetranWSPort();
      if (detranWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)detranWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)detranWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (detranWS != null)
      ((javax.xml.rpc.Stub)detranWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.detran.DetranWS getDetranWS() {
    if (detranWS == null)
      _initDetranWSProxy();
    return detranWS;
  }
  
  public java.lang.String consultarDadosDetran(java.lang.String arg0) throws java.rmi.RemoteException{
    if (detranWS == null)
      _initDetranWSProxy();
    return detranWS.consultarDadosDetran(arg0);
  }
  
  
}