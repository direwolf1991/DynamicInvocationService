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

		// 从接口输入参数获取需要的信息

		String serviceName = getDynamicInvokeRequest0.getServiceName();
		String operationName = getDynamicInvokeRequest0.getOperationName();
		ParameterListType parameterList = getDynamicInvokeRequest0
				.getParameterList();

		/*
		 * ParameterListType parameterList = null; String serviceName = "";
		 * String operationName = "create";
		 */
		// ParameterType []
		// parameters=parameterList.getParameter();//获取参数，将每个参数的值变成OMElement类型
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
		ServiceClient sender;// 向服务发送soap消息，并获取返回结果；
		OMElement output = null;
		try {
			sender = new ServiceClient();
			String url = "http://localhost:8091/WSCXF/Router_DataServiceImpl";// 以后需要根据servicename来获取url;找徐和东注册！
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
		// 封装输出部分，包含返回结果和异常信息；
		GetDynamicInvokeResponse response = new GetDynamicInvokeResponse();
		ResultListType result = new ResultListType();
		ExceptionListType exception = new ExceptionListType();
		String[] paramE = new String[1];
		String[] paramR = new String[1];
		paramR[0] = output.toString();
		exception.setException(paramE);
		result.setResult(paramR);
		response.setResultList(result);//
		response.setExceptionList(exception);// 返回发生了什么异常即可，
		return response;
    }
    
    public static void main(String[] args) {
		DynamicInvokeServiceSkeleton ds=new DynamicInvokeServiceSkeleton();
		ds.test4();
	}
	public static void test1() {//CXF \ create 测试
		//数据封装
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
		ServiceClient sender;// 向服务发送soap消息，并获取返回结果；
		OMElement output = null;
		try {
			sender = new ServiceClient();
			String url = "http://localhost:8091/WSCXF/Router_DataServiceImpl";// 以后需要根据servicename来获取url;
			Options options = new Options();
			EndpointReference targetEPR = new EndpointReference(url);
			options.setTo(targetEPR);
			sender.setOptions(options);
			System.out.println("input" + input);
			output = sender.sendReceive(input);
			System.out.println("output.toString()" + output.toString());
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();// 需要将异常信息返回给调用方
			// 需要对ExceptionList赋值
			paramR[0] = e.getReason();// 返回异常原因：Connection refused: connect
										// 是由于服务没有开启
			System.out.println(paramR[0]);
		}catch(Exception ex){
			
		}
		// 封装输出部分，包含返回结果和异常信息；
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

	public static void test2() {//Axis2 \ singleInput 测试
		//数据封装
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
		ServiceClient sender;// 向服务发送soap消息，并获取返回结果；
		OMElement output = null;
		try {
			sender = new ServiceClient();
			String url = "http://localhost:8080/axis2/services/TestService?wsdl";// 以后需要根据servicename来获取url;
			Options options = new Options();
			EndpointReference targetEPR = new EndpointReference(url);
			options.setTo(targetEPR);
			sender.setOptions(options);
			System.out.println("input" + input);
			output = sender.sendReceive(input);
			System.out.println("output.toString()" + output.toString());
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();// 需要将异常信息返回给调用方
			// 需要对ExceptionList赋值
			paramR[0] = e.getReason();// 返回异常原因：Connection refused: connect
										// 是由于服务没有开启
			//System.out.println(paramR[0]);
		}
		// 封装输出部分，包含返回结果和异常信息；
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
	
	public static void test3() {//Axis2 \ complexInput 测试
		//数据封装
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
		ServiceClient sender;// 向服务发送soap消息，并获取返回结果；
		OMElement output = null;
		try {
			sender = new ServiceClient();
			String url = "http://localhost:8080/axis2/services/TestService?wsdl";// 以后需要根据servicename来获取url;
			Options options = new Options();
			EndpointReference targetEPR = new EndpointReference(url);
			options.setTo(targetEPR);
			sender.setOptions(options);
			System.out.println("input" + input);
			output = sender.sendReceive(input);
			System.out.println("output.toString()" + output.toString());
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();// 需要将异常信息返回给调用方
			// 需要对ExceptionList赋值
			paramR[0] = e.getReason();// 返回异常原因：Connection refused: connect
										// 是由于服务没有开启
			//System.out.println(paramR[0]);
		}
		// 封装输出部分，包含返回结果和异常信息；
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
	
	public static void test4() {//Axis2 \ emptyInput 测试
		//数据封装
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
		ServiceClient sender;// 向服务发送soap消息，并获取返回结果；
		OMElement output = null;
		try {
			sender = new ServiceClient();
			//String url = "http://localhost:8080/axis2/services/TestService?wsdl";// 以后需要根据servicename来获取url;
			//通过注册服务来获取url;
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
			e.printStackTrace();// 需要将异常信息返回给调用方
			// 需要对ExceptionList赋值
			paramR[0] = e.getReason();// 返回异常原因：Connection refused: connect
										// 是由于服务没有开启
			//System.out.println(paramR[0]);
		}
		// 封装输出部分，包含返回结果和异常信息；
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
	 * public static void getDynamicInvocationTest() {//单元测试不能有返回值和参数 //TODO :
	 * fill this with the necessary business logic throw new
	 * java.lang.UnsupportedOperationException("Please implement " +
	 * this.getClass().getName() + "#getDynamicInvocation");
	 * 
	 * //从接口输入参数获取需要的信息 String serviceName =
	 * getDynamicInvocationRequest0.getServiceName(); String operationName =
	 * getDynamicInvocationRequest0.getOperationName(); ParameterListType
	 * parameterList = getDynamicInvocationRequest0.getParameterList();
	 * 
	 * 
	 * //ParameterType []
	 * parameters=parameterList.getParameter();//获取参数，将每个参数的值变成OMElement类型
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
		// parameters=parameterList.getParameter();//获取参数，将每个参数的值变成OMElement类型
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
		// 创建一个OMElement父节点；
		OMFactory fac = OMAbstractFactory.getOMFactory();// 创建内存对象层次结构的第一步是创建一个对象工厂：
		String targetNamespace = "http://Router_DataService.ws.zc:8080/axis/services/Router_DataService/";// 以后需要通过serviceName来获取命名空间。
		OMNamespace omNs = fac.createOMNamespace(targetNamespace, "ns1");
		OMElement method1 = fac.createOMElement(operationName, omNs);
		// 如果参数非空，需要挂载子节点；
		if (parameterList != null) {
			ParameterType[] parameters = parameterList.getParameter();// 获取参数，将每个参数的值变成OMElement类型
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
			 * 创建内存对象层次结构的第一步是创建一个对象工厂： String targetNamespace =
			 * "http://Router_DataService.ws.zc:8080/axis/services/Router_DataService/"
			 * ;//以后可能需要通过serviceName来获取。 OMNamespace omNs =
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
		// 创建一个OMElement父节点；
		OMFactory fac = OMAbstractFactory.getOMFactory();// 创建内存对象层次结构的第一步是创建一个对象工厂：
		//String targetNamespace = "http://Router_DataService.ws.zc:8080/axis/services/Router_DataService/";// 以后需要通过serviceName来获取命名空间。//将它改为一个函数
		String targetNamespace = "http://TestService.ws.zc:8080/axis/services/TestService/";//从什么地方获取？自己写一个解析wsdl的服务；
		OMNamespace omNs = fac.createOMNamespace(targetNamespace, "ns1");
		OMElement method1 = fac.createOMElement(operationName, omNs);
		// 如果参数非空，需要挂载子节点；
		if (null != parameterList) {
			ParameterType[] parameters = parameterList.getParameter();// 获取参数，将每个参数的值变成OMElement类型
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
			 * 创建内存对象层次结构的第一步是创建一个对象工厂： String targetNamespace =
			 * "http://Router_DataService.ws.zc:8080/axis/services/Router_DataService/"
			 * ;//以后可能需要通过serviceName来获取。 OMNamespace omNs =
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
				//url= s.getServiceURL("TestService");//需要先判断输入的服务名是否已经注册了？
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

