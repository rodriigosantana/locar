/**
 * SerasaWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.serasa;

public class SerasaWSServiceLocator extends org.apache.axis.client.Service implements br.com.serasa.SerasaWSService {

    public SerasaWSServiceLocator() {
    }


    public SerasaWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SerasaWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SerasaWSPort
    private java.lang.String SerasaWSPort_address = "http://Note-PC:8088/mockSerasaWSServiceSoapBinding";

    public java.lang.String getSerasaWSPortAddress() {
        return SerasaWSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SerasaWSPortWSDDServiceName = "SerasaWSPort";

    public java.lang.String getSerasaWSPortWSDDServiceName() {
        return SerasaWSPortWSDDServiceName;
    }

    public void setSerasaWSPortWSDDServiceName(java.lang.String name) {
        SerasaWSPortWSDDServiceName = name;
    }

    public br.com.serasa.SerasaWS getSerasaWSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SerasaWSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSerasaWSPort(endpoint);
    }

    public br.com.serasa.SerasaWS getSerasaWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.serasa.SerasaWSServiceSoapBindingStub _stub = new br.com.serasa.SerasaWSServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getSerasaWSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSerasaWSPortEndpointAddress(java.lang.String address) {
        SerasaWSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.serasa.SerasaWS.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.serasa.SerasaWSServiceSoapBindingStub _stub = new br.com.serasa.SerasaWSServiceSoapBindingStub(new java.net.URL(SerasaWSPort_address), this);
                _stub.setPortName(getSerasaWSPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SerasaWSPort".equals(inputPortName)) {
            return getSerasaWSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://serasa.locar.pucsp.br/", "SerasaWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://serasa.locar.pucsp.br/", "SerasaWSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SerasaWSPort".equals(portName)) {
            setSerasaWSPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
