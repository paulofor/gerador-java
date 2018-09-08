/**
 * ServicoTesteService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package exemplo;

public interface ServicoTesteService extends javax.xml.rpc.Service {
    public java.lang.String getServicoTestePortAddress();

    public exemplo.ServicoTeste getServicoTestePort() throws javax.xml.rpc.ServiceException;

    public exemplo.ServicoTeste getServicoTestePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
