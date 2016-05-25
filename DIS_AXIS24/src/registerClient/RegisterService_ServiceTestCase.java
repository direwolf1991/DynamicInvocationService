/**
 * RegisterService_ServiceTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package registerClient;

public class RegisterService_ServiceTestCase extends junit.framework.TestCase {
    public RegisterService_ServiceTestCase(java.lang.String name) {
        super(name);
    }

    public void testregisterServiceWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new registerClient.RegisterService_ServiceLocator().getregisterServiceAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new registerClient.RegisterService_ServiceLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1registerServicePushServicesToVm() throws Exception {
        registerClient.RegisterBindingStub binding;
        try {
            binding = (registerClient.RegisterBindingStub)
                          new registerClient.RegisterService_ServiceLocator().getregisterService();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        boolean value = false;
        value = binding.pushServicesToVm(new registerClient.VmIpAndServicesType());
        // TBD - validate results
    }

    public void test2registerServiceGetServiceURL() throws Exception {
        registerClient.RegisterBindingStub binding;
        try {
            binding = (registerClient.RegisterBindingStub)
                          new registerClient.RegisterService_ServiceLocator().getregisterService();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        java.lang.String value = null;
        value = binding.getServiceURL(new java.lang.String());
        // TBD - validate results
    }

    public void test3registerServiceListOperations() throws Exception {
        registerClient.RegisterBindingStub binding;
        try {
            binding = (registerClient.RegisterBindingStub)
                          new registerClient.RegisterService_ServiceLocator().getregisterService();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        java.lang.String[] value = null;
        value = binding.listOperations(new java.lang.String());
        // TBD - validate results
    }

    public void test4registerServiceQueryServiceOperation() throws Exception {
        registerClient.RegisterBindingStub binding;
        try {
            binding = (registerClient.RegisterBindingStub)
                          new registerClient.RegisterService_ServiceLocator().getregisterService();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        registerClient.OperationType value = null;
        value = binding.queryServiceOperation(new java.lang.String(), new java.lang.String());
        // TBD - validate results
    }

    public void test5registerServiceQueryDataType() throws Exception {
        registerClient.RegisterBindingStub binding;
        try {
            binding = (registerClient.RegisterBindingStub)
                          new registerClient.RegisterService_ServiceLocator().getregisterService();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        java.lang.String value = null;
        value = binding.queryDataType(new java.lang.String(), new java.lang.String());
        // TBD - validate results
    }

    public void test6registerServiceGetServicelist() throws Exception {
        registerClient.RegisterBindingStub binding;
        try {
            binding = (registerClient.RegisterBindingStub)
                          new registerClient.RegisterService_ServiceLocator().getregisterService();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        java.lang.String[] value = null;
        value = binding.getServicelist();
        // TBD - validate results
    }

    public void test7registerServiceUpdataService() throws Exception {
        registerClient.RegisterBindingStub binding;
        try {
            binding = (registerClient.RegisterBindingStub)
                          new registerClient.RegisterService_ServiceLocator().getregisterService();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        java.lang.String value = null;
        value = binding.updataService(new registerClient.ServiceResponseType());
        // TBD - validate results
    }

    public void test8registerServiceQuery() throws Exception {
        registerClient.RegisterBindingStub binding;
        try {
            binding = (registerClient.RegisterBindingStub)
                          new registerClient.RegisterService_ServiceLocator().getregisterService();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        registerClient.ServiceResponseType value = null;
        value = binding.query(new java.lang.String());
        // TBD - validate results
    }

    public void test9registerServiceRegister() throws Exception {
        registerClient.RegisterBindingStub binding;
        try {
            binding = (registerClient.RegisterBindingStub)
                          new registerClient.RegisterService_ServiceLocator().getregisterService();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        java.lang.String value = null;
        value = binding.register(new registerClient.ServiceRegisterType());
        // TBD - validate results
    }

    public void test10registerServiceRemoveService() throws Exception {
        registerClient.RegisterBindingStub binding;
        try {
            binding = (registerClient.RegisterBindingStub)
                          new registerClient.RegisterService_ServiceLocator().getregisterService();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        boolean value = false;
        value = binding.removeService(new java.lang.String());
        // TBD - validate results
    }

    public void test11registerServiceQueryNameSpace() throws Exception {
        registerClient.RegisterBindingStub binding;
        try {
            binding = (registerClient.RegisterBindingStub)
                          new registerClient.RegisterService_ServiceLocator().getregisterService();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        java.lang.String value = null;
        value = binding.queryNameSpace(new java.lang.String(), new java.lang.String());
        // TBD - validate results
    }

    public void test12registerServiceQueryServiceList() throws Exception {
        registerClient.RegisterBindingStub binding;
        try {
            binding = (registerClient.RegisterBindingStub)
                          new registerClient.RegisterService_ServiceLocator().getregisterService();
        }
        catch (javax.xml.rpc.ServiceException jre) {
            if(jre.getLinkedCause()!=null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        java.lang.String[] value = null;
        value = binding.queryServiceList(new java.lang.String());
        // TBD - validate results
    }

}
