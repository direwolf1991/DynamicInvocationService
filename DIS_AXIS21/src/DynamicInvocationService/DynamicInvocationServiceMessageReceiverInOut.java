/**
 * DynamicInvocationServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package DynamicInvocationService;


/**
 *  DynamicInvocationServiceMessageReceiverInOut message receiver
 */
public class DynamicInvocationServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver {
    public void invokeBusinessLogic(
        org.apache.axis2.context.MessageContext msgContext,
        org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault {
        try {
            // get the implementation class for the Web Service
            Object obj = getTheImplementationObject(msgContext);

            DynamicInvocationServiceSkeletonInterface skel = (DynamicInvocationServiceSkeletonInterface) obj;

            //Out Envelop
            org.apache.axiom.soap.SOAPEnvelope envelope = null;

            //Find the axisOperation that has been set by the Dispatch phase.
            org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext()
                                                                      .getAxisOperation();

            if (op == null) {
                throw new org.apache.axis2.AxisFault(
                    "Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
            }

            java.lang.String methodName;

            if ((op.getName() != null) &&
                    ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(
                            op.getName().getLocalPart())) != null)) {
                if ("getDynamicInvocation".equals(methodName)) {
                    zc.ws.dynamicinvocationservice.axis.services.dynamicinvocationservice.GetDynamicInvocationResponse getDynamicInvocationResponse7 =
                        null;
                    zc.ws.dynamicinvocationservice.axis.services.dynamicinvocationservice.GetDynamicInvocation wrappedParam =
                        (zc.ws.dynamicinvocationservice.axis.services.dynamicinvocationservice.GetDynamicInvocation) fromOM(msgContext.getEnvelope()
                                                                                                                                      .getBody()
                                                                                                                                      .getFirstElement(),
                            zc.ws.dynamicinvocationservice.axis.services.dynamicinvocationservice.GetDynamicInvocation.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    getDynamicInvocationResponse7 = skel.getDynamicInvocation(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getDynamicInvocationResponse7, false,
                            new javax.xml.namespace.QName(
                                "http://DynamicInvocationService.ws.zc:8080/axis/services/DynamicInvocationService/",
                                "getDynamicInvocation"));
                } else {
                    throw new java.lang.RuntimeException("method not found");
                }

                newMsgContext.setEnvelope(envelope);
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    //
    private org.apache.axiom.om.OMElement toOM(
        zc.ws.dynamicinvocationservice.axis.services.dynamicinvocationservice.GetDynamicInvocation param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(zc.ws.dynamicinvocationservice.axis.services.dynamicinvocationservice.GetDynamicInvocation.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        zc.ws.dynamicinvocationservice.axis.services.dynamicinvocationservice.GetDynamicInvocationResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(zc.ws.dynamicinvocationservice.axis.services.dynamicinvocationservice.GetDynamicInvocationResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        zc.ws.dynamicinvocationservice.axis.services.dynamicinvocationservice.GetDynamicInvocationResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    zc.ws.dynamicinvocationservice.axis.services.dynamicinvocationservice.GetDynamicInvocationResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private zc.ws.dynamicinvocationservice.axis.services.dynamicinvocationservice.GetDynamicInvocationResponse wrapgetDynamicInvocation() {
        zc.ws.dynamicinvocationservice.axis.services.dynamicinvocationservice.GetDynamicInvocationResponse wrappedElement =
            new zc.ws.dynamicinvocationservice.axis.services.dynamicinvocationservice.GetDynamicInvocationResponse();

        return wrappedElement;
    }

    /**
     *  get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    private java.lang.Object fromOM(org.apache.axiom.om.OMElement param,
        java.lang.Class type, java.util.Map extraNamespaces)
        throws org.apache.axis2.AxisFault {
        try {
            if (zc.ws.dynamicinvocationservice.axis.services.dynamicinvocationservice.GetDynamicInvocation.class.equals(
                        type)) {
                return zc.ws.dynamicinvocationservice.axis.services.dynamicinvocationservice.GetDynamicInvocation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (zc.ws.dynamicinvocationservice.axis.services.dynamicinvocationservice.GetDynamicInvocationResponse.class.equals(
                        type)) {
                return zc.ws.dynamicinvocationservice.axis.services.dynamicinvocationservice.GetDynamicInvocationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return null;
    }

    /**
     *  A utility method that copies the namepaces from the SOAPEnvelope
     */
    private java.util.Map getEnvelopeNamespaces(
        org.apache.axiom.soap.SOAPEnvelope env) {
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();

        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
        }

        return returnMap;
    }

    private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();

        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }
} //end of class
