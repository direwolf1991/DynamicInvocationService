/**
 * RegisterService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package registerClient;

public class RegisterService_ServiceLocator extends org.apache.axis.client.Service implements registerClient.RegisterService_Service {

    public RegisterService_ServiceLocator() {
    }


    public RegisterService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RegisterService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for registerService
    private java.lang.String registerService_address = "http://192.168.5.118:8080/axis/services/registerService";

    public java.lang.String getregisterServiceAddress() {
        return registerService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String registerServiceWSDDServiceName = "registerService";

    public java.lang.String getregisterServiceWSDDServiceName() {
        return registerServiceWSDDServiceName;
    }

    public void setregisterServiceWSDDServiceName(java.lang.String name) {
        registerServiceWSDDServiceName = name;
    }

    public registerClient.RegisterPort getregisterService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(registerService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getregisterService(endpoint);
    }

    public registerClient.RegisterPort getregisterService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            registerClient.RegisterBindingStub _stub = new registerClient.RegisterBindingStub(portAddress, this);
            _stub.setPortName(getregisterServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setregisterServiceEndpointAddress(java.lang.String address) {
        registerService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (registerClient.RegisterPort.class.isAssignableFrom(serviceEndpointInterface)) {
                registerClient.RegisterBindingStub _stub = new registerClient.RegisterBindingStub(new java.net.URL(registerService_address), this);
                _stub.setPortName(getregisterServiceWSDDServiceName());
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
        if ("registerService".equals(inputPortName)) {
            return getregisterService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/services/registerService", "registerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/services/registerService", "registerService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("registerService".equals(portName)) {
            setregisterServiceEndpointAddress(address);
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
