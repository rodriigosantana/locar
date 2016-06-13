/**
 * DetranWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.detran;

public class DetranWSServiceLocator extends org.apache.axis.client.Service implements br.com.detran.DetranWSService {

    public DetranWSServiceLocator() {
    }


    public DetranWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DetranWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DetranWSPort
    private java.lang.String DetranWSPort_address = "http://Note-PC:8088/mockDetranWSServiceSoapBinding";

    public java.lang.String getDetranWSPortAddress() {
        return DetranWSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DetranWSPortWSDDServiceName = "DetranWSPort";

    public java.lang.String getDetranWSPortWSDDServiceName() {
        return DetranWSPortWSDDServiceName;
    }

    public void setDetranWSPortWSDDServiceName(java.lang.String name) {
        DetranWSPortWSDDServiceName = name;
    }

    public br.com.detran.DetranWS getDetranWSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DetranWSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDetranWSPort(endpoint);
    }

    public br.com.detran.DetranWS getDetranWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.detran.DetranWSServiceSoapBindingStub _stub = new br.com.detran.DetranWSServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getDetranWSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDetranWSPortEndpointAddress(java.lang.String address) {
        DetranWSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.detran.DetranWS.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.detran.DetranWSServiceSoapBindingStub _stub = new br.com.detran.DetranWSServiceSoapBindingStub(new java.net.URL(DetranWSPort_address), this);
                _stub.setPortName(getDetranWSPortWSDDServiceName());
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
        if ("DetranWSPort".equals(inputPortName)) {
            return getDetranWSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://detran.locar.pucsp.br/", "DetranWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://detran.locar.pucsp.br/", "DetranWSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DetranWSPort".equals(portName)) {
            setDetranWSPortEndpointAddress(address);
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
