/**
 * RegisterPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package registerClient;

public interface RegisterPort extends java.rmi.Remote {
    public boolean pushServicesToVm(registerClient.VmIpAndServicesType vmIpAndServicesType) throws java.rmi.RemoteException;
    public java.lang.String getServiceURL(java.lang.String serviceId) throws java.rmi.RemoteException;
    public java.lang.String[] listOperations(java.lang.String serviceId) throws java.rmi.RemoteException;
    public registerClient.OperationType queryServiceOperation(java.lang.String serviceId, java.lang.String opName) throws java.rmi.RemoteException;
    public java.lang.String queryDataType(java.lang.String serviceId, java.lang.String dataType) throws java.rmi.RemoteException;
    public java.lang.String[] getServicelist() throws java.rmi.RemoteException;
    public java.lang.String updataService(registerClient.ServiceResponseType updataRequest) throws java.rmi.RemoteException;
    public registerClient.ServiceResponseType query(java.lang.String id) throws java.rmi.RemoteException;
    public java.lang.String register(registerClient.ServiceRegisterType serviceRegister) throws java.rmi.RemoteException;
    public boolean removeService(java.lang.String serviceId) throws java.rmi.RemoteException;
    public java.lang.String queryNameSpace(java.lang.String serviceId, java.lang.String nsPrefix) throws java.rmi.RemoteException;
    public java.lang.String[] queryServiceList(java.lang.String id) throws java.rmi.RemoteException;
}
