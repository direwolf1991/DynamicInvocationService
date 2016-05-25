/**
 * GetDynamicInvokeFaultException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package DynamicInvokeService;

public class GetDynamicInvokeFaultException extends java.lang.Exception {
    private static final long serialVersionUID = 1461848585709L;
    private zc.ws.dynamicinvokeservice.axis.services.dynamicinvokeservice.GetDynamicInvokeFault faultMessage;

    public GetDynamicInvokeFaultException() {
        super("GetDynamicInvokeFaultException");
    }

    public GetDynamicInvokeFaultException(java.lang.String s) {
        super(s);
    }

    public GetDynamicInvokeFaultException(java.lang.String s,
        java.lang.Throwable ex) {
        super(s, ex);
    }

    public GetDynamicInvokeFaultException(java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        zc.ws.dynamicinvokeservice.axis.services.dynamicinvokeservice.GetDynamicInvokeFault msg) {
        faultMessage = msg;
    }

    public zc.ws.dynamicinvokeservice.axis.services.dynamicinvokeservice.GetDynamicInvokeFault getFaultMessage() {
        return faultMessage;
    }
}
