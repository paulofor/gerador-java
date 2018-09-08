/**
 * ServicoTesteServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package exemplo;

public class ServicoTesteServiceLocator extends org.apache.axis.client.Service implements exemplo.ServicoTesteService {

    public ServicoTesteServiceLocator() {
    }


    public ServicoTesteServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ServicoTesteServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ServicoTestePort
    private java.lang.String ServicoTestePort_address = "http://127.0.0.1:8080/teste/ServicoTeste";

    public java.lang.String getServicoTestePortAddress() {
        return ServicoTestePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ServicoTestePortWSDDServiceName = "ServicoTestePort";

    public java.lang.String getServicoTestePortWSDDServiceName() {
        return ServicoTestePortWSDDServiceName;
    }

    public void setServicoTestePortWSDDServiceName(java.lang.String name) {
        ServicoTestePortWSDDServiceName = name;
    }

    public exemplo.ServicoTeste getServicoTestePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ServicoTestePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getServicoTestePort(endpoint);
    }

    public exemplo.ServicoTeste getServicoTestePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            exemplo.ServicoTesteBindingStub _stub = new exemplo.ServicoTesteBindingStub(portAddress, this);
            _stub.setPortName(getServicoTestePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setServicoTestePortEndpointAddress(java.lang.String address) {
        ServicoTestePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (exemplo.ServicoTeste.class.isAssignableFrom(serviceEndpointInterface)) {
                exemplo.ServicoTesteBindingStub _stub = new exemplo.ServicoTesteBindingStub(new java.net.URL(ServicoTestePort_address), this);
                _stub.setPortName(getServicoTestePortWSDDServiceName());
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
        if ("ServicoTestePort".equals(inputPortName)) {
            return getServicoTestePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://exemplo/", "ServicoTesteService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://exemplo/", "ServicoTestePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ServicoTestePort".equals(portName)) {
            setServicoTestePortEndpointAddress(address);
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
