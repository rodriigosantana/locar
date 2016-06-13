/**
 * DetranWSService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.detran;

public interface DetranWSService extends javax.xml.rpc.Service {
    public java.lang.String getDetranWSPortAddress();

    public br.com.detran.DetranWS getDetranWSPort() throws javax.xml.rpc.ServiceException;

    public br.com.detran.DetranWS getDetranWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
