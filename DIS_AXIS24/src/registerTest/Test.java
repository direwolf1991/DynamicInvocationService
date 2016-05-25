package registerTest;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import registerClient.RegisterBindingStub;
import registerClient.RegisterService_Service;
import registerClient.RegisterService_ServiceLocator;

public class Test {

	public static void main(String[] args) throws ServiceException {
		Test t=new Test();
		t.test();
	}
	public void test() throws ServiceException{
		RegisterService_Service registerService = new RegisterService_ServiceLocator();
		RegisterBindingStub s = (RegisterBindingStub)registerService.getregisterService();
		try {
			System.out.println(s.getServiceURL("TestService"));;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}
