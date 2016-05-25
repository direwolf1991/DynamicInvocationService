/**
 * DynamicInvocationServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package DynamicInvocationService;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Iterator;

import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.impl.builder.StAXOMBuilder;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;

import zc.ws.dynamicinvocationservice.axis.services.dynamicinvocationservice.GetDynamicInvocationResponse;

/**
 * DynamicInvocationServiceSkeleton java skeleton for the axisService
 */
public class DynamicInvocationServiceSkeleton implements
		DynamicInvocationServiceSkeletonInterface {
	/**
	 * Auto generated method signature
	 * 
	 * @param getDynamicInvocation0
	 * @return getDynamicInvocationResponse1
	 */
	public zc.ws.dynamicinvocationservice.axis.services.dynamicinvocationservice.GetDynamicInvocationResponse getDynamicInvocation(
			zc.ws.dynamicinvocationservice.axis.services.dynamicinvocationservice.GetDynamicInvocation getDynamicInvocation0) {
		// TODO : fill this with the necessary business logic

		String serviceName = getDynamicInvocation0.getServiceName();
		String operationName = getDynamicInvocation0.getOperationName();
		String[] parameterList = getDynamicInvocation0.getParameterList();
		OMElement inputElement = this.String2Axiom(serviceName, operationName,parameterList);
		ServiceClient sender;
		sender = new ServiceClient();
		String url = "http://192.168.5.248:8080/axis/services/SumService2";// 以后需要根据servicename来获取url;
		
		Options options = new Options();
		EndpointReference targetEPR = new EndpointReference(url);
		options.setTo(targetEPR);
		sender.setOptions(options);
		System.out.println(om);
		// OMElement result = sender.sendReceive(om);
		// System.out.println(result);
		// this.addSoapEnv(inputElement, method, rootName);
		return null;

		GetDynamicInvocationResponse response = new GetDynamicInvocationResponse();
		String result = "";
		String result1 = "";
		response.setResult(result);
		response.setResult1(result1);
		return response;
		/*
		 * throw new java.lang.UnsupportedOperationException("Please implement "
		 * + this.getClass().getName() + "#getDynamicInvocation");
		 */
	}
	
    public OMElement String2Axiom(String serviceName,String operationName,String [] parameterList) {// 单元测试的时候不能有返回值，也不能申明为static
		InputStream xmlFile = null;
		// dxmlFile = new FileInputStream("output.xml");// 得放在工程的目录下；作为输入源
		xmlFile = new ByteArrayInputStream(serviceName.getBytes());
		XMLStreamReader parser = null;
		try {
			parser = XMLInputFactory.newInstance().createXMLStreamReader(
					xmlFile);
		} catch (XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FactoryConfigurationError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		StAXOMBuilder builder = new StAXOMBuilder(parser);
		OMElement doc = builder.getDocumentElement();
		// System.out.println(doc);
		//doc.setLocalName("create");
		doc.setLocalName(operationName);
		Iterator<OMElement> it_doc = doc.getChildElements();
		
		while (it_doc.hasNext()) {
			OMElement first = it_doc.next();
			//first.setLocalName("createInput");
			first.setLocalName(parameterList);
		}
		System.out.println(doc);
		return doc;
	}
}
