/**
 * RegisterService_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package registerClient;

public interface RegisterService_Service extends javax.xml.rpc.Service {
    public java.lang.String getregisterServiceAddress();

    public registerClient.RegisterPort getregisterService() throws javax.xml.rpc.ServiceException;

    public registerClient.RegisterPort getregisterService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
