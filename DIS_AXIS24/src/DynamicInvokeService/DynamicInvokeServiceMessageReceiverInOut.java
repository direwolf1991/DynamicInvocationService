/**
 * DynamicInvokeServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package DynamicInvokeService;


/**
 *  DynamicInvokeServiceMessageReceiverInOut message receiver
 */
public class DynamicInvokeServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver {
    public void invokeBusinessLogic(
        org.apache.axis2.context.MessageContext msgContext,
        org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault {
        try {
            // get the implementation class for the Web Service
            Object obj = getTheImplementationObject(msgContext);

            DynamicInvokeServiceSkeletonInterface skel = (DynamicInvokeServiceSkeletonInterface) obj;

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
                if ("getDynamicInvoke".equals(methodName)) {
                    zc.ws.dynamicinvokeservice.axis.services.dynamicinvokeservice.GetDynamicInvokeResponse getDynamicInvokeResponse7 =
                        null;
                    zc.ws.dynamicinvokeservice.axis.services.dynamicinvokeservice.GetDynamicInvokeRequest wrappedParam =
                        (zc.ws.dynamicinvokeservice.axis.services.dynamicinvokeservice.GetDynamicInvokeRequest) fromOM(msgContext.getEnvelope()
                                                                                                                                 .getBody()
                                                                                                                                 .getFirstElement(),
                            zc.ws.dynamicinvokeservice.axis.services.dynamicinvokeservice.GetDynamicInvokeRequest.class,
                            getEnvelopeNamespaces(msgContext.getEnvelope()));

                    getDynamicInvokeResponse7 = skel.getDynamicInvoke(wrappedParam);

                    envelope = toEnvelope(getSOAPFactory(msgContext),
                            getDynamicInvokeResponse7, false,
                            new javax.xml.namespace.QName(
                                "http://DynamicInvokeService.ws.zc:8080/axis/services/DynamicInvokeService/",
                                "getDynamicInvoke"));
                } else {
                    throw new java.lang.RuntimeException("method not found");
                }

                newMsgContext.setEnvelope(envelope);
            }
        } catch (GetDynamicInvokeFaultException e) {
            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,
                "getDynamicInvokeFault");

            org.apache.axis2.AxisFault f = createAxisFault(e);

            if (e.getFaultMessage() != null) {
                f.setDetail(toOM(e.getFaultMessage(), false));
            }

            throw f;
        }
        catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    //
    private org.apache.axiom.om.OMElement toOM(
        zc.ws.dynamicinvokeservice.axis.services.dynamicinvokeservice.GetDynamicInvokeRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(zc.ws.dynamicinvokeservice.axis.services.dynamicinvokeservice.GetDynamicInvokeRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        zc.ws.dynamicinvokeservice.axis.services.dynamicinvokeservice.GetDynamicInvokeResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(zc.ws.dynamicinvokeservice.axis.services.dynamicinvokeservice.GetDynamicInvokeResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        zc.ws.dynamicinvokeservice.axis.services.dynamicinvokeservice.GetDynamicInvokeFault param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(zc.ws.dynamicinvokeservice.axis.services.dynamicinvokeservice.GetDynamicInvokeFault.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        zc.ws.dynamicinvokeservice.axis.services.dynamicinvokeservice.GetDynamicInvokeResponse param,
        boolean optimizeContent, javax.xml.namespace.QName methodQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    zc.ws.dynamicinvokeservice.axis.services.dynamicinvokeservice.GetDynamicInvokeResponse.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private zc.ws.dynamicinvokeservice.axis.services.dynamicinvokeservice.GetDynamicInvokeResponse wrapgetDynamicInvoke() {
        zc.ws.dynamicinvokeservice.axis.services.dynamicinvokeservice.GetDynamicInvokeResponse wrappedElement =
            new zc.ws.dynamicinvokeservice.axis.services.dynamicinvokeservice.GetDynamicInvokeResponse();

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
            if (zc.ws.dynamicinvokeservice.axis.services.dynamicinvokeservice.GetDynamicInvokeFault.class.equals(
                        type)) {
                return zc.ws.dynamicinvokeservice.axis.services.dynamicinvokeservice.GetDynamicInvokeFault.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (zc.ws.dynamicinvokeservice.axis.services.dynamicinvokeservice.GetDynamicInvokeRequest.class.equals(
                        type)) {
                return zc.ws.dynamicinvokeservice.axis.services.dynamicinvokeservice.GetDynamicInvokeRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (zc.ws.dynamicinvokeservice.axis.services.dynamicinvokeservice.GetDynamicInvokeResponse.class.equals(
                        type)) {
                return zc.ws.dynamicinvokeservice.axis.services.dynamicinvokeservice.GetDynamicInvokeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
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
