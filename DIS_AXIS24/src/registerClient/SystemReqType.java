/**
 * SystemReqType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package registerClient;


/**
 * SystemRequirement Type
 */
public class SystemReqType  implements java.io.Serializable {
    private java.lang.String OS;

    private int CPUNumber;

    private int memorySize;

    private int diskSize;

    public SystemReqType() {
    }

    public SystemReqType(
           java.lang.String OS,
           int CPUNumber,
           int memorySize,
           int diskSize) {
           this.OS = OS;
           this.CPUNumber = CPUNumber;
           this.memorySize = memorySize;
           this.diskSize = diskSize;
    }


    /**
     * Gets the OS value for this SystemReqType.
     * 
     * @return OS
     */
    public java.lang.String getOS() {
        return OS;
    }


    /**
     * Sets the OS value for this SystemReqType.
     * 
     * @param OS
     */
    public void setOS(java.lang.String OS) {
        this.OS = OS;
    }


    /**
     * Gets the CPUNumber value for this SystemReqType.
     * 
     * @return CPUNumber
     */
    public int getCPUNumber() {
        return CPUNumber;
    }


    /**
     * Sets the CPUNumber value for this SystemReqType.
     * 
     * @param CPUNumber
     */
    public void setCPUNumber(int CPUNumber) {
        this.CPUNumber = CPUNumber;
    }


    /**
     * Gets the memorySize value for this SystemReqType.
     * 
     * @return memorySize
     */
    public int getMemorySize() {
        return memorySize;
    }


    /**
     * Sets the memorySize value for this SystemReqType.
     * 
     * @param memorySize
     */
    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }


    /**
     * Gets the diskSize value for this SystemReqType.
     * 
     * @return diskSize
     */
    public int getDiskSize() {
        return diskSize;
    }


    /**
     * Sets the diskSize value for this SystemReqType.
     * 
     * @param diskSize
     */
    public void setDiskSize(int diskSize) {
        this.diskSize = diskSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SystemReqType)) return false;
        SystemReqType other = (SystemReqType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.OS==null && other.getOS()==null) || 
             (this.OS!=null &&
              this.OS.equals(other.getOS()))) &&
            this.CPUNumber == other.getCPUNumber() &&
            this.memorySize == other.getMemorySize() &&
            this.diskSize == other.getDiskSize();
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
        if (getOS() != null) {
            _hashCode += getOS().hashCode();
        }
        _hashCode += getCPUNumber();
        _hashCode += getMemorySize();
        _hashCode += getDiskSize();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SystemReqType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/service", "SystemReqType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/service", "OS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CPUNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/service", "CPUNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memorySize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/service", "memorySize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/service", "diskSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
