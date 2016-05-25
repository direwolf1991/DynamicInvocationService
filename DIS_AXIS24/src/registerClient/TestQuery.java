package registerClient;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class TestQuery {
	public static void main(String[] args) throws ServiceException, RemoteException {
		
			RegisterService_Service registerService = new RegisterService_ServiceLocator();
			RegisterBindingStub s = (RegisterBindingStub)registerService.getregisterService();
			ServiceResponseType response = s.query("WS011");
			System.out.println(response.getServiceName());
			String[] fileNameList = response.getFileList();
			for(int i=0;i<fileNameList.length;i++) {
				System.out.println("fileNameList[i]=" + fileNameList[i]);
			}
	}
}
