package registerClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.rmi.RemoteException;

import javax.servlet.http.HttpServlet;
import javax.xml.rpc.ServiceException;

public class test extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	public OperationType queryServiceOperation(java.lang.String serviceId, java.lang.String opName) throws ServiceException, RemoteException{
		RegisterService_Service registerService = new RegisterService_ServiceLocator();
		RegisterBindingStub s = (RegisterBindingStub)registerService.getregisterService();
		OperationType type = s.queryServiceOperation(serviceId, opName);
		return type;
	}
	
	public String[] listOperation(String serviceId) throws ServiceException, RemoteException{
		RegisterService_Service registerService = new RegisterService_ServiceLocator();
		RegisterBindingStub s = (RegisterBindingStub)registerService.getregisterService();
		String[] list = s.listOperations(serviceId);
		return list;
	}
	
	public String[] queryDependOnService(String serviceId) throws ServiceException, RemoteException
	{
		RegisterService_Service registerService = new RegisterService_ServiceLocator();
		RegisterBindingStub s = (RegisterBindingStub)registerService.getregisterService();
		String[] list = s.queryServiceList(serviceId);
		return list;
	}
	
	public String UpdateService(ServiceResponseType serviceResponse)throws ServiceException, RemoteException
	{
		RegisterService_Service registerService = new RegisterService_ServiceLocator();
		RegisterBindingStub s = (RegisterBindingStub)registerService.getregisterService();
		String response = s.updataService(serviceResponse);
		return response;
	}

	public  String register(ServiceRegisterType registerIn,String filePath) throws ServiceException, RemoteException
	{
		RegisterService_Service registerService = new RegisterService_ServiceLocator();
		RegisterBindingStub s = (RegisterBindingStub)registerService.getregisterService();
		//add 2014-2-18
    	FileClient file=new FileClient();
		String[] filelist=registerIn.getFileList();
		System.out.println("transfer to ServiceStorage read from:" + filePath);
		boolean isAxisService = registerIn.isIsAxisService();
		System.out.println("isAxisService=" + isAxisService);
		for(int i=0;i<filelist.length;i++)
		{	
			try {
				file.start("localhost", filePath, isAxisService);
			} catch (IOException e) {
				e.printStackTrace();
				return "transfer fail";
			}
		}
		String ID=s.register(registerIn);
		if(ID==null)
		{
			return "ID=null";
		}
		else
		{
			return ID;
		}
		
	}
	public  ServiceResponseType querry(String id) throws ServiceException, RemoteException
	{
		RegisterService_Service registerService = new RegisterService_ServiceLocator();
		RegisterBindingStub s = (RegisterBindingStub)registerService.getregisterService();
		ServiceResponseType response = s.query(id);
		if(response!=null){
		System.out.println(response.getServiceName_CH());
		}
		return response;
	}
	public  java.lang.String[] serviceList() throws ServiceException, RemoteException
	{
		RegisterService_Service registerService = new RegisterService_ServiceLocator();
		RegisterBindingStub s = (RegisterBindingStub)registerService.getregisterService();
		/*int L=s.getServicelist().length;
		
		String services[]= new String[L];
		for(int i=0;i<L;i++)
		{
			services[i]=s.getServicelist()[i];
		}
		return services;*/
		return s.getServicelist();
	}
	public boolean removeService(String id) throws ServiceException, RemoteException
	{
		RegisterService_Service registerService = new RegisterService_ServiceLocator();
		RegisterBindingStub s = (RegisterBindingStub)registerService.getregisterService();
		boolean result = s.removeService(id);
		return result;
		
	}
	public java.lang.String getServiceURL(java.lang.String serviceId) throws java.rmi.RemoteException, ServiceException {
		RegisterService_Service registerService = new RegisterService_ServiceLocator();
		RegisterBindingStub s = (RegisterBindingStub)registerService.getregisterService();
		return s.getServiceURL(serviceId);
    }
	public StringBuilder getServiceWSDL(String serviceid) throws IOException, ServiceException
	{
		StringBuilder strContext=null;
		BufferedReader br=null;
		String str=null;
		String serviceUrl=getServiceURL(serviceid);
		URL getUrl=new URL(serviceUrl);
		HttpURLConnection connection = (HttpURLConnection) getUrl.openConnection();
		connection.setConnectTimeout(5000);  
		connection.setReadTimeout(5000);
		//connection.connect();
		try {
			br = new BufferedReader(new InputStreamReader(connection.getInputStream(),"utf-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			System.out.println("UnsupportedEncodingException");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(serviceid + " undeploy" +"\n鍦板潃锛� + serviceUrl ");//鏈変簺鍋囩殑鏈嶅姟娌″彂甯冧細鍑鸿繖涓敊
		}
		strContext=new StringBuilder("");
		if(br!=null)
		{
			while((str=br.readLine())!=null)
			{
				strContext.append(str+'\n');
				
			}
			br.close();
			
		}else{
			strContext.append("this service cannot be used");
		}
		connection.disconnect();
		return strContext;
	}
	
	public static void main(String args[]) throws IOException {
		test t = new test();
		try {
			t.removeService("eee");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*try {
			String[] a = t.serviceList();
			for(String b : a) {
				System.out.println(b);
			}
			StringBuilder dd = t.getServiceWSDL("JLGWebService");
			System.out.println(dd);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}
}
