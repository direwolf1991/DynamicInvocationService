/**
 * OperationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package registerClient;

public class OperationType  implements java.io.Serializable {
    private registerClient.InputType[] inputList;

    private registerClient.OutputType[] outputList;

    private registerClient.FaultType[] faultList;

    public OperationType() {
    }

    public OperationType(
           registerClient.InputType[] inputList,
           registerClient.OutputType[] outputList,
           registerClient.FaultType[] faultList) {
           this.inputList = inputList;
           this.outputList = outputList;
           this.faultList = faultList;
    }


    /**
     * Gets the inputList value for this OperationType.
     * 
     * @return inputList
     */
    public registerClient.InputType[] getInputList() {
        return inputList;
    }


    /**
     * Sets the inputList value for this OperationType.
     * 
     * @param inputList
     */
    public void setInputList(registerClient.InputType[] inputList) {
        this.inputList = inputList;
    }

    public registerClient.InputType getInputList(int i) {
        return this.inputList[i];
    }

    public void setInputList(int i, registerClient.InputType _value) {
        this.inputList[i] = _value;
    }


    /**
     * Gets the outputList value for this OperationType.
     * 
     * @return outputList
     */
    public registerClient.OutputType[] getOutputList() {
        return outputList;
    }


    /**
     * Sets the outputList value for this OperationType.
     * 
     * @param outputList
     */
    public void setOutputList(registerClient.OutputType[] outputList) {
        this.outputList = outputList;
    }

    public registerClient.OutputType getOutputList(int i) {
        return this.outputList[i];
    }

    public void setOutputList(int i, registerClient.OutputType _value) {
        this.outputList[i] = _value;
    }


    /**
     * Gets the faultList value for this OperationType.
     * 
     * @return faultList
     */
    public registerClient.FaultType[] getFaultList() {
        return faultList;
    }


    /**
     * Sets the faultList value for this OperationType.
     * 
     * @param faultList
     */
    public void setFaultList(registerClient.FaultType[] faultList) {
        this.faultList = faultList;
    }

    public registerClient.FaultType getFaultList(int i) {
        return this.faultList[i];
    }

    public void setFaultList(int i, registerClient.FaultType _value) {
        this.faultList[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperationType)) return false;
        OperationType other = (OperationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.inputList==null && other.getInputList()==null) || 
             (this.inputList!=null &&
              java.util.Arrays.equals(this.inputList, other.getInputList()))) &&
            ((this.outputList==null && other.getOutputList()==null) || 
             (this.outputList!=null &&
              java.util.Arrays.equals(this.outputList, other.getOutputList()))) &&
            ((this.faultList==null && other.getFaultList()==null) || 
             (this.faultList!=null &&
              java.util.Arrays.equals(this.faultList, other.getFaultList())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getInputList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInputList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInputList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOutputList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOutputList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOutputList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFaultList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFaultList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFaultList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OperationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/service", "OperationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/service", "InputList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/service", "InputType"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outputList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/service", "OutputList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/service", "OutputType"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/service", "FaultList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/service", "FaultType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
