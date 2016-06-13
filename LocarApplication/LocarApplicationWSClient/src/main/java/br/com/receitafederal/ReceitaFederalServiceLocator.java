/**
 * ReceitaFederalServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.receitafederal;

public class ReceitaFederalServiceLocator extends org.apache.axis.client.Service implements br.com.receitafederal.ReceitaFederalService {

    public ReceitaFederalServiceLocator() {
    }


    public ReceitaFederalServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ReceitaFederalServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ReceitaFederalPort
    private java.lang.String ReceitaFederalPort_address = "http://Note-PC:8088/mockReceitaFederalServiceSoapBinding";

    public java.lang.String getReceitaFederalPortAddress() {
        return ReceitaFederalPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ReceitaFederalPortWSDDServiceName = "ReceitaFederalPort";

    public java.lang.String getReceitaFederalPortWSDDServiceName() {
        return ReceitaFederalPortWSDDServiceName;
    }

    public void setReceitaFederalPortWSDDServiceName(java.lang.String name) {
        ReceitaFederalPortWSDDServiceName = name;
    }

    public br.com.receitafederal.ReceitaFederal getReceitaFederalPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ReceitaFederalPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getReceitaFederalPort(endpoint);
    }

    public br.com.receitafederal.ReceitaFederal getReceitaFederalPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.receitafederal.ReceitaFederalServiceSoapBindingStub _stub = new br.com.receitafederal.ReceitaFederalServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getReceitaFederalPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setReceitaFederalPortEndpointAddress(java.lang.String address) {
        ReceitaFederalPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.receitafederal.ReceitaFederal.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.receitafederal.ReceitaFederalServiceSoapBindingStub _stub = new br.com.receitafederal.ReceitaFederalServiceSoapBindingStub(new java.net.URL(ReceitaFederalPort_address), this);
                _stub.setPortName(getReceitaFederalPortWSDDServiceName());
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
        if ("ReceitaFederalPort".equals(inputPortName)) {
            return getReceitaFederalPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://receita.locar.pucsp.br/", "ReceitaFederalService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://receita.locar.pucsp.br/", "ReceitaFederalPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ReceitaFederalPort".equals(portName)) {
            setReceitaFederalPortEndpointAddress(address);
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
