package br.com.receitafederal;

public class ReceitaFederalProxy implements br.com.receitafederal.ReceitaFederal {
  private String _endpoint = null;
  private br.com.receitafederal.ReceitaFederal receitaFederal = null;
  
  public ReceitaFederalProxy() {
    _initReceitaFederalProxy();
  }
  
  public ReceitaFederalProxy(String endpoint) {
    _endpoint = endpoint;
    _initReceitaFederalProxy();
  }
  
  private void _initReceitaFederalProxy() {
    try {
      receitaFederal = (new br.com.receitafederal.ReceitaFederalServiceLocator()).getReceitaFederalPort();
      if (receitaFederal != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)receitaFederal)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)receitaFederal)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (receitaFederal != null)
      ((javax.xml.rpc.Stub)receitaFederal)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.receitafederal.ReceitaFederal getReceitaFederal() {
    if (receitaFederal == null)
      _initReceitaFederalProxy();
    return receitaFederal;
  }
  
  public java.lang.String consultarDadosReceitaFederal(java.lang.String arg0) throws java.rmi.RemoteException{
    if (receitaFederal == null)
      _initReceitaFederalProxy();
    return receitaFederal.consultarDadosReceitaFederal(arg0);
  }
  
  
}