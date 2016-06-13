/**
 * SeguradoraServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.seguradora;

public class SeguradoraServiceLocator extends org.apache.axis.client.Service implements br.com.seguradora.SeguradoraService {

    public SeguradoraServiceLocator() {
    }


    public SeguradoraServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SeguradoraServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SeguradoraPort
    private java.lang.String SeguradoraPort_address = "http://Note-PC:8088/mockSeguradoraServiceSoapBinding";

    public java.lang.String getSeguradoraPortAddress() {
        return SeguradoraPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SeguradoraPortWSDDServiceName = "SeguradoraPort";

    public java.lang.String getSeguradoraPortWSDDServiceName() {
        return SeguradoraPortWSDDServiceName;
    }

    public void setSeguradoraPortWSDDServiceName(java.lang.String name) {
        SeguradoraPortWSDDServiceName = name;
    }

    public br.com.seguradora.Seguradora getSeguradoraPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SeguradoraPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSeguradoraPort(endpoint);
    }

    public br.com.seguradora.Seguradora getSeguradoraPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.seguradora.SeguradoraServiceSoapBindingStub _stub = new br.com.seguradora.SeguradoraServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getSeguradoraPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSeguradoraPortEndpointAddress(java.lang.String address) {
        SeguradoraPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.seguradora.Seguradora.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.seguradora.SeguradoraServiceSoapBindingStub _stub = new br.com.seguradora.SeguradoraServiceSoapBindingStub(new java.net.URL(SeguradoraPort_address), this);
                _stub.setPortName(getSeguradoraPortWSDDServiceName());
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
        if ("SeguradoraPort".equals(inputPortName)) {
            return getSeguradoraPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://seguradora.locar.pucsp.br/", "SeguradoraService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://seguradora.locar.pucsp.br/", "SeguradoraPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SeguradoraPort".equals(portName)) {
            setSeguradoraPortEndpointAddress(address);
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
