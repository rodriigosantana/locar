/**
 * SerasaWSService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.serasa;

public interface SerasaWSService extends javax.xml.rpc.Service {
    public java.lang.String getSerasaWSPortAddress();

    public br.com.serasa.SerasaWS getSerasaWSPort() throws javax.xml.rpc.ServiceException;

    public br.com.serasa.SerasaWS getSerasaWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
