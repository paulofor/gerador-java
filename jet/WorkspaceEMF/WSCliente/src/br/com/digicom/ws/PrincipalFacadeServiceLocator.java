/**
 * PrincipalFacadeServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.digicom.ws;

public class PrincipalFacadeServiceLocator extends org.apache.axis.client.Service implements br.com.digicom.ws.PrincipalFacadeService {

    public PrincipalFacadeServiceLocator() {
    }


    public PrincipalFacadeServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PrincipalFacadeServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PrincipalFacadePort
    private java.lang.String PrincipalFacadePort_address = "http://127.0.0.1:8080/GerJTemplate/PrincipalFacade";

    public java.lang.String getPrincipalFacadePortAddress() {
        return PrincipalFacadePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PrincipalFacadePortWSDDServiceName = "PrincipalFacadePort";

    public java.lang.String getPrincipalFacadePortWSDDServiceName() {
        return PrincipalFacadePortWSDDServiceName;
    }

    public void setPrincipalFacadePortWSDDServiceName(java.lang.String name) {
        PrincipalFacadePortWSDDServiceName = name;
    }

    public br.com.digicom.ws.PrincipalFacade getPrincipalFacadePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PrincipalFacadePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPrincipalFacadePort(endpoint);
    }

    public br.com.digicom.ws.PrincipalFacade getPrincipalFacadePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.digicom.ws.PrincipalFacadeBindingStub _stub = new br.com.digicom.ws.PrincipalFacadeBindingStub(portAddress, this);
            _stub.setPortName(getPrincipalFacadePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPrincipalFacadePortEndpointAddress(java.lang.String address) {
        PrincipalFacadePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.digicom.ws.PrincipalFacade.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.digicom.ws.PrincipalFacadeBindingStub _stub = new br.com.digicom.ws.PrincipalFacadeBindingStub(new java.net.URL(PrincipalFacadePort_address), this);
                _stub.setPortName(getPrincipalFacadePortWSDDServiceName());
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
        if ("PrincipalFacadePort".equals(inputPortName)) {
            return getPrincipalFacadePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.digicom.com.br/", "PrincipalFacadeService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.digicom.com.br/", "PrincipalFacadePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PrincipalFacadePort".equals(portName)) {
            setPrincipalFacadePortEndpointAddress(address);
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
