/**
 * DynamicInvokeServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package DynamicInvokeService;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashSet;

import javax.xml.rpc.ServiceException;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axiom.om.impl.builder.StAXOMBuilder;
import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.junit.Test;

import registerClient.RegisterBindingStub;
import registerClient.RegisterService_Service;
import registerClient.RegisterService_ServiceLocator;
import zc.ws.dynamicinvokeservice.axis.services.dynamicinvokeservice.ExceptionListType;
import zc.ws.dynamicinvokeservice.axis.services.dynamicinvokeservice.GetDynamicInvokeResponse;
import zc.ws.dynamicinvokeservice.axis.services.dynamicinvokeservice.ParameterListType;
import zc.ws.dynamicinvokeservice.axis.services.dynamicinvokeservice.ParameterType;
import zc.ws.dynamicinvokeservice.axis.services.dynamicinvokeservice.ResultListType;


/**
 *  DynamicInvokeServiceSkeleton java skeleton for the axisService
 */
public class DynamicInvokeServiceSkeleton
    implements DynamicInvokeServiceSkeletonInterface {
    /**
     * Auto generated method signature
     *
     * @param getDynamicInvokeRequest0
     * @return getDynamicInvokeResponse1
     * @throws UserFault
     */
    public zc.ws.dynamicinvokeservice.axis.services.dynamicinvokeservice.GetDynamicInvokeResponse getDynamicInvoke(
        zc.ws.dynamicinvokeservice.axis.services.dynamicinvokeservice.GetDynamicInvokeRequest getDynamicInvokeRequest0)
        throws UserFault {
    	/*
		 * throw new java.lang.UnsupportedOperationException("Please implement "
		 * + this.getClass().getName() + "#getDynamicInvocation");
		 */

		// �ӽӿ����������ȡ��Ҫ����Ϣ

		String serviceName = getDynamicInvokeRequest0.getServiceName();
		String operationName = getDynamicInvokeRequest0.getOperationName();
		ParameterListType parameterList = getDynamicInvokeRequest0
				.getParameterList();

		/*
		 * ParameterListType parameterList = null; String serviceName = "";
		 * String operationName = "create";
		 */
		// ParameterType []
		// parameters=parameterList.getParameter();//��ȡ��������ÿ��������ֵ���OMElement����
		/*
		 * ParameterType[] parameters1 = new ParameterType[1]; parameters1[0] =
		 * new ParameterType(); parameters1[0].setName("create"); String value1
		 * =
		 * "<gm:Router_C xsi:schemaLocation=\"http://www.ws.zc/xml-namespace/informationModel/zcGenericModel zcGenericModel.xsd\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:gm=\"http://www.ws.zc/xml-namespace/informationModel/zcGenericModel\"><gm:objectClass>String</gm:objectClass><gm:objectInstance>String</gm:objectInstance><gm:routerId>String</gm:routerId><gm:routerName>String</gm:routerName><gm:deviceType>String</gm:deviceType><gm:manufacture>String</gm:manufacture><gm:level>String</gm:level></gm:Router_C>"
		 * ; parameters1[0].setValue(value1);
		 * parameterList.setParameter(parameters1);
		 */
		/*
		 * parameters1[1] =new ParameterType();
		 * parameters1[1].setName("delete"); String value2=
		 * "<gm:Router_C xsi:schemaLocation=\"http://www.ws.zc/xml-namespace/informationModel/zcGenericModel zcGenericModel.xsd\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:gm=\"http://www.ws.zc/xml-namespace/informationModel/zcGenericModel\"><gm:objectClass>String</gm:objectClass><gm:objectInstance>String</gm:objectInstance><gm:routerId>String</gm:routerId><gm:routerName>String</gm:routerName><gm:deviceType>String</gm:deviceType><gm:manufacture>String</gm:manufacture><gm:level>String</gm:level></gm:Router_C>"
		 * ; parameters1[1].setValue(value2);
		 */

		OMElement input = this.String2Axiom(serviceName, operationName,
				parameterList);
		ServiceClient sender;// �������soap��Ϣ������ȡ���ؽ����
		OMElement output = null;
		try {
			sender = new ServiceClient();
			String url = "http://localhost:8091/WSCXF/Router_DataServiceImpl";// �Ժ���Ҫ����servicename����ȡurl;����Ͷ�ע�ᣡ
			Options options = new Options();
			EndpointReference targetEPR = new EndpointReference(url);
			options.setTo(targetEPR);
			sender.setOptions(options);
			System.out.println(input);
			output = sender.sendReceive(input);
			System.out.println(output.toString());
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ��װ������֣��������ؽ�����쳣��Ϣ��
		GetDynamicInvokeResponse response = new GetDynamicInvokeResponse();
		ResultListType result = new ResultListType();
		ExceptionListType exception = new ExceptionListType();
		String[] paramE = new String[1];
		String[] paramR = new String[1];
		paramR[0] = output.toString();
		exception.setException(paramE);
		result.setResult(paramR);
		response.setResultList(result);//
		response.setExceptionList(exception);// ���ط�����ʲô�쳣���ɣ�
		return response;
    }
    
    public static void main(String[] args) {
		DynamicInvokeServiceSkeleton ds=new DynamicInvokeServiceSkeleton();
		ds.test4();
	}
	public static void test1() {//CXF \ create ����
		//���ݷ�װ
		GetDynamicInvokeResponse response = new GetDynamicInvokeResponse();
		ResultListType result = new ResultListType();
		ExceptionListType exception = new ExceptionListType();
		String[] paramE = new String[1];
		String[] paramR = new String[1];

		DynamicInvokeServiceSkeleton dis = new DynamicInvokeServiceSkeleton();
		ParameterListType parameterList = new ParameterListType();
		String serviceName = "";
		String operationName = "create";
		ParameterType[] parameters1 = new ParameterType[1];
		parameters1[0] = new ParameterType();
		parameters1[0].setName("createInput");
		String value1 = "<gm:Router_C xsi:schemaLocation=\"http://www.ws.zc/xml-namespace/informationModel/zcGenericModel zcGenericModel.xsd\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:gm=\"http://www.ws.zc/xml-namespace/informationModel/zcGenericModel\"><gm:objectClass>String</gm:objectClass><gm:objectInstance>String21</gm:objectInstance><gm:routerId>String</gm:routerId><gm:routerName>String</gm:routerName><gm:deviceType>String</gm:deviceType><gm:manufacture>String</gm:manufacture><gm:level>String</gm:level></gm:Router_C>";
		parameters1[0].setValue(value1);
		parameterList.setParameter(parameters1);
		OMElement input = dis.String2Axiom(serviceName, operationName,
				parameterList);
		ServiceClient sender;// �������soap��Ϣ������ȡ���ؽ����
		OMElement output = null;
		try {
			sender = new ServiceClient();
			String url = "http://localhost:8091/WSCXF/Router_DataServiceImpl";// �Ժ���Ҫ����servicename����ȡurl;
			Options options = new Options();
			EndpointReference targetEPR = new EndpointReference(url);
			options.setTo(targetEPR);
			sender.setOptions(options);
			System.out.println("input" + input);
			output = sender.sendReceive(input);
			System.out.println("output.toString()" + output.toString());
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();// ��Ҫ���쳣��Ϣ���ظ����÷�
			// ��Ҫ��ExceptionList��ֵ
			paramR[0] = e.getReason();// �����쳣ԭ��Connection refused: connect
										// �����ڷ���û�п���
			System.out.println(paramR[0]);
		}catch(Exception ex){
			
		}
		// ��װ������֣��������ؽ�����쳣��Ϣ��
		/*
		 * GetDynamicInvocationResponse response = new
		 * GetDynamicInvocationResponse(); ResultListType result = new
		 * ResultListType(); ExceptionListType exception = new
		 * ExceptionListType(); String[] paramE = new String[1]; String[] paramR
		 * = new String[1];
		 */

		paramR[0] = output.toString();
		exception.setException(paramE);
		result.setResult(paramR);
		response.setResultList(result);
		response.setExceptionList(exception);
		System.out.println(response.getResultList().getResult()[0]
				+ "***********");
		System.out.println(response.getExceptionList().getException()[0]
				+ "***********");
	}

	public static void test2() {//Axis2 \ singleInput ����
		//���ݷ�װ
		GetDynamicInvokeResponse response = new GetDynamicInvokeResponse();
		ResultListType result = new ResultListType();
		ExceptionListType exception = new ExceptionListType();
		String[] paramE = new String[1];
		String[] paramR = new String[1];

		DynamicInvokeServiceSkeleton dis = new DynamicInvokeServiceSkeleton();
		ParameterListType parameterList = new ParameterListType();
		String serviceName = "TestService";
		String operationName = "singleInput";
		ParameterType[] parameters1 = new ParameterType[2];
		parameters1[0] = new ParameterType();
		parameters1[0].setName("routerName");
		String value1 = "<routerName xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"tes:routerType\"><serviceName xsi:type=\"xsd:string\">1</serviceName><operationName xsi:type=\"xsd:string\">2</operationName></routerName>";
		parameters1[0].setValue(value1);
		parameters1[1] = new ParameterType();
		parameters1[1].setName("linkName");
		String value2 = "<linkName xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"tes:linkType\"><name xsi:type=\"xsd:string\">3</name><value xsi:type=\"xsd:string\">4</value></linkName>";
		parameters1[1].setValue(value2);
		parameterList.setParameter(parameters1);
		OMElement input = dis.String2Axiom(serviceName, operationName,
				parameterList);
		ServiceClient sender;// �������soap��Ϣ������ȡ���ؽ����
		OMElement output = null;
		try {
			sender = new ServiceClient();
			String url = "http://localhost:8080/axis2/services/TestService?wsdl";// �Ժ���Ҫ����servicename����ȡurl;
			Options options = new Options();
			EndpointReference targetEPR = new EndpointReference(url);
			options.setTo(targetEPR);
			sender.setOptions(options);
			System.out.println("input" + input);
			output = sender.sendReceive(input);
			System.out.println("output.toString()" + output.toString());
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();// ��Ҫ���쳣��Ϣ���ظ����÷�
			// ��Ҫ��ExceptionList��ֵ
			paramR[0] = e.getReason();// �����쳣ԭ��Connection refused: connect
										// �����ڷ���û�п���
			//System.out.println(paramR[0]);
		}
		// ��װ������֣��������ؽ�����쳣��Ϣ��
		/*
		 * GetDynamicInvocationResponse response = new
		 * GetDynamicInvocationResponse(); ResultListType result = new
		 * ResultListType(); ExceptionListType exception = new
		 * ExceptionListType(); String[] paramE = new String[1]; String[] paramR
		 * = new String[1];
		 */

		paramR[0] = output.toString();
		exception.setException(paramE);
		result.setResult(paramR);
		response.setResultList(result);
		response.setExceptionList(exception);
		System.out.println(response.getResultList().getResult()[0]
				+ "***********");
		System.out.println(response.getExceptionList().getException()[0]
				+ "***********");
	}
	
	public static void test3() {//Axis2 \ complexInput ����
		//���ݷ�װ
		GetDynamicInvokeResponse response = new GetDynamicInvokeResponse();
		ResultListType result = new ResultListType();
		ExceptionListType exception = new ExceptionListType();
		String[] paramE = new String[1];
		String[] paramR = new String[1];

		DynamicInvokeServiceSkeleton dis = new DynamicInvokeServiceSkeleton();
		ParameterListType parameterList = new ParameterListType();
		String serviceName = "TestService";
		String operationName = "complexInput";
		ParameterType[] parameters1 = new ParameterType[2];
		parameters1[0] = new ParameterType();
		parameters1[0].setName("routerName");
		String value1 = "<routerName xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"tes:cRouterType\"><router xsi:type=\"tes:routerType\"><serviceName xsi:type=\"xsd:string\">1</serviceName><operationName xsi:type=\"xsd:string\">2</operationName></router><terminal xsi:type=\"tes:terminalType\"><name xsi:type=\"xsd:string\">3</name><value xsi:type=\"xsd:string\">4</value><link xsi:type=\"tes:linkType\"><name xsi:type=\"xsd:string\">5</name><value xsi:type=\"xsd:string\">6</value></link></terminal></routerName>";
		parameters1[0].setValue(value1);
		parameters1[1] = new ParameterType();
		parameters1[1].setName("linkName");
		String value2 = "<linkName xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"tes:cLinkType\"><link xsi:type=\"tes:linkType\"><name xsi:type=\"xsd:string\">7</name><value xsi:type=\"xsd:string\">8</value></link><value xsi:type=\"xsd:string\">9</value></linkName>";
		parameters1[1].setValue(value2);
		parameterList.setParameter(parameters1);
		OMElement input = dis.String2Axiom(serviceName, operationName,
				parameterList);
		ServiceClient sender;// �������soap��Ϣ������ȡ���ؽ����
		OMElement output = null;
		try {
			sender = new ServiceClient();
			String url = "http://localhost:8080/axis2/services/TestService?wsdl";// �Ժ���Ҫ����servicename����ȡurl;
			Options options = new Options();
			EndpointReference targetEPR = new EndpointReference(url);
			options.setTo(targetEPR);
			sender.setOptions(options);
			System.out.println("input" + input);
			output = sender.sendReceive(input);
			System.out.println("output.toString()" + output.toString());
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();// ��Ҫ���쳣��Ϣ���ظ����÷�
			// ��Ҫ��ExceptionList��ֵ
			paramR[0] = e.getReason();// �����쳣ԭ��Connection refused: connect
										// �����ڷ���û�п���
			//System.out.println(paramR[0]);
		}
		// ��װ������֣��������ؽ�����쳣��Ϣ��
		/*
		 * GetDynamicInvocationResponse response = new
		 * GetDynamicInvocationResponse(); ResultListType result = new
		 * ResultListType(); ExceptionListType exception = new
		 * ExceptionListType(); String[] paramE = new String[1]; String[] paramR
		 * = new String[1];
		 */

		paramR[0] = output.toString();
		exception.setException(paramE);
		result.setResult(paramR);
		response.setResultList(result);
		response.setExceptionList(exception);
		System.out.println(response.getResultList().getResult()[0]
				+ "***********");
		System.out.println(response.getExceptionList().getException()[0]
				+ "***********");
	}
	
	public static void test4() {//Axis2 \ emptyInput ����
		//���ݷ�װ
		GetDynamicInvokeResponse response = new GetDynamicInvokeResponse();
		ResultListType result = new ResultListType();
		ExceptionListType exception = new ExceptionListType();
		String[] paramE = new String[1];
		String[] paramR = new String[1];

		DynamicInvokeServiceSkeleton dis = new DynamicInvokeServiceSkeleton();
		ParameterListType parameterList = null;
		String serviceName = "TestService";
		String operationName = "emptyInput";
		
		/*ParameterType[] parameters1 = new ParameterType[2];
		parameters1[0] = new ParameterType();
		parameters1[0].setName("routerName");
		String value1 = "<routerName xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"tes:cRouterType\"><router xsi:type=\"tes:routerType\"><serviceName xsi:type=\"xsd:string\">1</serviceName><operationName xsi:type=\"xsd:string\">2</operationName></router><terminal xsi:type=\"tes:terminalType\"><name xsi:type=\"xsd:string\">3</name><value xsi:type=\"xsd:string\">4</value><link xsi:type=\"tes:linkType\"><name xsi:type=\"xsd:string\">5</name><value xsi:type=\"xsd:string\">6</value></link></terminal></routerName>";
		parameters1[0].setValue(value1);
		parameters1[1] = new ParameterType();
		parameters1[1].setName("linkName");
		String value2 = "<linkName xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"tes:cLinkType\"><link xsi:type=\"tes:linkType\"><name xsi:type=\"xsd:string\">7</name><value xsi:type=\"xsd:string\">8</value></link><value xsi:type=\"xsd:string\">9</value></linkName>";
		parameters1[1].setValue(value2);
		parameterList.setParameter(parameters1);*/
		
		OMElement input = dis.String2Axiom(serviceName, operationName,
				parameterList);
		ServiceClient sender;// �������soap��Ϣ������ȡ���ؽ����
		OMElement output = null;
		try {
			sender = new ServiceClient();
			//String url = "http://localhost:8080/axis2/services/TestService?wsdl";// �Ժ���Ҫ����servicename����ȡurl;
			//ͨ��ע���������ȡurl;
			String url = dis.getUrl(serviceName);
			Options options = new Options();
			EndpointReference targetEPR = new EndpointReference(url);
			options.setTo(targetEPR);
			sender.setOptions(options);
			System.out.println("input" + input);
			output = sender.sendReceive(input);
			//sender.
			System.out.println("output.toString()" + output.toString());
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();// ��Ҫ���쳣��Ϣ���ظ����÷�
			// ��Ҫ��ExceptionList��ֵ
			paramR[0] = e.getReason();// �����쳣ԭ��Connection refused: connect
										// �����ڷ���û�п���
			//System.out.println(paramR[0]);
		}
		// ��װ������֣��������ؽ�����쳣��Ϣ��
		/*
		 * GetDynamicInvocationResponse response = new
		 * GetDynamicInvocationResponse(); ResultListType result = new
		 * ResultListType(); ExceptionListType exception = new
		 * ExceptionListType(); String[] paramE = new String[1]; String[] paramR
		 * = new String[1];
		 */

		paramR[0] = output.toString();
		exception.setException(paramE);
		result.setResult(paramR);
		response.setResultList(result);
		response.setExceptionList(exception);
		System.out.println(response.getResultList().getResult()[0]
				+ "***********");
		System.out.println(response.getExceptionList().getException()[0]
				+ "***********");
	}
	
	/*
	 * public static void getDynamicInvocationTest() {//��Ԫ���Բ����з���ֵ�Ͳ��� //TODO :
	 * fill this with the necessary business logic throw new
	 * java.lang.UnsupportedOperationException("Please implement " +
	 * this.getClass().getName() + "#getDynamicInvocation");
	 * 
	 * //�ӽӿ����������ȡ��Ҫ����Ϣ String serviceName =
	 * getDynamicInvocationRequest0.getServiceName(); String operationName =
	 * getDynamicInvocationRequest0.getOperationName(); ParameterListType
	 * parameterList = getDynamicInvocationRequest0.getParameterList();
	 * 
	 * 
	 * //ParameterType []
	 * parameters=parameterList.getParameter();//��ȡ��������ÿ��������ֵ���OMElement����
	 * 
	 * parameters1[1] =new ParameterType(); parameters1[1].setName("delete");
	 * String value2=
	 * "<gm:Router_C xsi:schemaLocation=\"http://www.ws.zc/xml-namespace/informationModel/zcGenericModel zcGenericModel.xsd\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:gm=\"http://www.ws.zc/xml-namespace/informationModel/zcGenericModel\"><gm:objectClass>String</gm:objectClass><gm:objectInstance>String</gm:objectInstance><gm:routerId>String</gm:routerId><gm:routerName>String</gm:routerName><gm:deviceType>String</gm:deviceType><gm:manufacture>String</gm:manufacture><gm:level>String</gm:level></gm:Router_C>"
	 * ; parameters1[1].setValue(value2);
	 * 
	 * DynamicInvocationServiceSkeleton dis=new
	 * DynamicInvocationServiceSkeleton(); //OMElement input =
	 * dis.String2Axiom(serviceName, operationName,parameterList);
	 * 
	 * }
	 */

	@Test
	public void test() {// String serviceName,String
						// operationName,ParameterListType parameterList
		ParameterListType parameterList = new ParameterListType();
		String operationName = "create";
		// ParameterType []
		// parameters=parameterList.getParameter();//��ȡ��������ÿ��������ֵ���OMElement����
		ParameterType[] parameters1 = new ParameterType[2];
		parameters1[0] = new ParameterType();
		parameters1[0].setName("create");
		String value1 = "<gm:Router_C xsi:schemaLocation=\"http://www.ws.zc/xml-namespace/informationModel/zcGenericModel zcGenericModel.xsd\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:gm=\"http://www.ws.zc/xml-namespace/informationModel/zcGenericModel\"><gm:objectClass>String</gm:objectClass><gm:objectInstance>String</gm:objectInstance><gm:routerId>String</gm:routerId><gm:routerName>String</gm:routerName><gm:deviceType>String</gm:deviceType><gm:manufacture>String</gm:manufacture><gm:level>String</gm:level></gm:Router_C>";
		parameters1[0].setValue(value1);
		parameters1[1] = new ParameterType();
		parameters1[1].setName("delete");
		String value2 = "<gm:Router_C xsi:schemaLocation=\"http://www.ws.zc/xml-namespace/informationModel/zcGenericModel zcGenericModel.xsd\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:gm=\"http://www.ws.zc/xml-namespace/informationModel/zcGenericModel\"><gm:objectClass>String</gm:objectClass><gm:objectInstance>String</gm:objectInstance><gm:routerId>String</gm:routerId><gm:routerName>String</gm:routerName><gm:deviceType>String</gm:deviceType><gm:manufacture>String</gm:manufacture><gm:level>String</gm:level></gm:Router_C>";
		parameters1[1].setValue(value2);
		// parameterList.setParameter(parameters1);
		// parameterList=null;
		// ����һ��OMElement���ڵ㣻
		OMFactory fac = OMAbstractFactory.getOMFactory();// �����ڴ�����νṹ�ĵ�һ���Ǵ���һ�����󹤳���
		String targetNamespace = "http://Router_DataService.ws.zc:8080/axis/services/Router_DataService/";// �Ժ���Ҫͨ��serviceName����ȡ�����ռ䡣
		OMNamespace omNs = fac.createOMNamespace(targetNamespace, "ns1");
		OMElement method1 = fac.createOMElement(operationName, omNs);
		// ��������ǿգ���Ҫ�����ӽڵ㣻
		if (parameterList != null) {
			ParameterType[] parameters = parameterList.getParameter();// ��ȡ��������ÿ��������ֵ���OMElement����
			ArrayList<OMElement> omList = new ArrayList<OMElement>();
			for (ParameterType para : parameters) {
				String name = para.getName();
				String value = para.getValue();
				InputStream xmlFile = null;
				xmlFile = new ByteArrayInputStream(value.getBytes());
				XMLStreamReader parser = null;
				try {
					parser = XMLInputFactory.newInstance()
							.createXMLStreamReader(xmlFile);
				} catch (XMLStreamException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (FactoryConfigurationError e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				StAXOMBuilder builder = new StAXOMBuilder(parser);
				OMElement doc = builder.getDocumentElement();
				doc.setLocalName(name);
				omList.add(doc);
			}
			/*
			 * OMFactory fac = OMAbstractFactory.getOMFactory();//
			 * �����ڴ�����νṹ�ĵ�һ���Ǵ���һ�����󹤳��� String targetNamespace =
			 * "http://Router_DataService.ws.zc:8080/axis/services/Router_DataService/"
			 * ;//�Ժ������Ҫͨ��serviceName����ȡ�� OMNamespace omNs =
			 * fac.createOMNamespace(targetNamespace, "ns1"); OMElement method1
			 * = fac.createOMElement(operationName, omNs);
			 */
			for (OMElement i : omList) {
				method1.addChild(i);
				// System.out.println(i);
			}
		}
		System.out.println(method1);
	}

	public OMElement String2Axiom(String serviceName, String operationName,
			ParameterListType parameterList) {
		// ����һ��OMElement���ڵ㣻
		OMFactory fac = OMAbstractFactory.getOMFactory();// �����ڴ�����νṹ�ĵ�һ���Ǵ���һ�����󹤳���
		//String targetNamespace = "http://Router_DataService.ws.zc:8080/axis/services/Router_DataService/";// �Ժ���Ҫͨ��serviceName����ȡ�����ռ䡣//������Ϊһ������
		String targetNamespace = "http://TestService.ws.zc:8080/axis/services/TestService/";//��ʲô�ط���ȡ���Լ�дһ������wsdl�ķ���
		OMNamespace omNs = fac.createOMNamespace(targetNamespace, "ns1");
		OMElement method1 = fac.createOMElement(operationName, omNs);
		// ��������ǿգ���Ҫ�����ӽڵ㣻
		if (null != parameterList) {
			ParameterType[] parameters = parameterList.getParameter();// ��ȡ��������ÿ��������ֵ���OMElement����
			ArrayList<OMElement> omList = new ArrayList<OMElement>();
			for (ParameterType para : parameters) {
				String name = para.getName();
				String value = para.getValue();
				InputStream xmlFile = null;
				xmlFile = new ByteArrayInputStream(value.getBytes());
				XMLStreamReader parser = null;
				try {
					parser = XMLInputFactory.newInstance()
							.createXMLStreamReader(xmlFile);
				} catch (XMLStreamException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (FactoryConfigurationError e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				StAXOMBuilder builder = new StAXOMBuilder(parser);
				OMElement doc = builder.getDocumentElement();
				doc.setLocalName(name);
				omList.add(doc);
			}
			/*
			 * OMFactory fac = OMAbstractFactory.getOMFactory();//
			 * �����ڴ�����νṹ�ĵ�һ���Ǵ���һ�����󹤳��� String targetNamespace =
			 * "http://Router_DataService.ws.zc:8080/axis/services/Router_DataService/"
			 * ;//�Ժ������Ҫͨ��serviceName����ȡ�� OMNamespace omNs =
			 * fac.createOMNamespace(targetNamespace, "ns1"); OMElement method1
			 * = fac.createOMElement(operationName, omNs);
			 */
			for (OMElement i : omList) {
				method1.addChild(i);
				// System.out.println(i);
			}
			System.out.println("method1" + method1);
			// return method1;
		}
		return method1;
	}

	public String getTargetNamespace(String serviceName){
		
		return serviceName;	
	}
	public String getUrl(String serviceName){
		ExceptionType exception=new ExceptionType();
		RegisterService_Service registerService = new RegisterService_ServiceLocator();
		RegisterBindingStub s;
		String url="";
		try {
			s = (RegisterBindingStub)registerService.getregisterService();
			try {
				//url= s.getServiceURL("TestService");//��Ҫ���ж�����ķ������Ƿ��Ѿ�ע���ˣ�
				String [] list=s.getServicelist();
				HashSet <String> servicelist=new HashSet<String>();
				for (String i : list){
					servicelist.add(i);
				}
				if (servicelist.contains(serviceName)){
					url=s.getServiceURL(serviceName);
				}
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				exception.setServiceName(serviceName);
				//exception.setOperationName(this.operationName);
				exception.setFaultReason(e.getMessage());
				System.out.println(e.toString());
			}
		} catch (ServiceException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return url;
	}

}
class ExceptionType{
	String serviceName;
	String operationName;
	String faultReason;
	String faultCode;
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getOperationName() {
		return operationName;
	}
	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}
	public String getFaultReason() {
		return faultReason;
	}
	public void setFaultReason(String faultReason) {
		this.faultReason = faultReason;
	}
	public String getFaultCode() {
		return faultCode;
	}
	public void setFaultCode(String faultCode) {
		this.faultCode = faultCode;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "serviceName:"+this.serviceName+"operationName:"+this.operationName+"faultReason:"+this.faultReason+"faultCode:"+this.faultCode;
	}
}

