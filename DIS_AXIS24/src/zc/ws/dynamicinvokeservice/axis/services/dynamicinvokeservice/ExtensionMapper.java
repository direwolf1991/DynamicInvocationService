/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:18:31 BST)
 */
package zc.ws.dynamicinvokeservice.axis.services.dynamicinvokeservice;


/**
 *  ExtensionMapper class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class ExtensionMapper {
    public static java.lang.Object getTypeObject(
        java.lang.String namespaceURI, java.lang.String typeName,
        javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
        if ("http://DynamicInvokeService.ws.zc:8080/axis/services/DynamicInvokeService/".equals(
                    namespaceURI) && "FaultType".equals(typeName)) {
            return zc.ws.dynamicinvokeservice.axis.services.dynamicinvokeservice.FaultType.Factory.parse(reader);
        }

        if ("http://DynamicInvokeService.ws.zc:8080/axis/services/DynamicInvokeService/".equals(
                    namespaceURI) && "ResultListType".equals(typeName)) {
            return zc.ws.dynamicinvokeservice.axis.services.dynamicinvokeservice.ResultListType.Factory.parse(reader);
        }

        if ("http://DynamicInvokeService.ws.zc:8080/axis/services/DynamicInvokeService/".equals(
                    namespaceURI) && "ParameterListType".equals(typeName)) {
            return zc.ws.dynamicinvokeservice.axis.services.dynamicinvokeservice.ParameterListType.Factory.parse(reader);
        }

        if ("http://DynamicInvokeService.ws.zc:8080/axis/services/DynamicInvokeService/".equals(
                    namespaceURI) && "ParameterType".equals(typeName)) {
            return zc.ws.dynamicinvokeservice.axis.services.dynamicinvokeservice.ParameterType.Factory.parse(reader);
        }

        if ("http://DynamicInvokeService.ws.zc:8080/axis/services/DynamicInvokeService/".equals(
                    namespaceURI) && "ExceptionListType".equals(typeName)) {
            return zc.ws.dynamicinvokeservice.axis.services.dynamicinvokeservice.ExceptionListType.Factory.parse(reader);
        }

        throw new org.apache.axis2.databinding.ADBException("Unsupported type " +
            namespaceURI + " " + typeName);
    }
}
