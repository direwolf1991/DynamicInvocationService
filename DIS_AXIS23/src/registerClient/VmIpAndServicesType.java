/**
 * VmIpAndServicesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package registerClient;

public class VmIpAndServicesType  implements java.io.Serializable {
    private java.lang.String vmIp;

    private java.lang.String[] servicesListType;

    public VmIpAndServicesType() {
    }

    public VmIpAndServicesType(
           java.lang.String vmIp,
           java.lang.String[] servicesListType) {
           this.vmIp = vmIp;
           this.servicesListType = servicesListType;
    }


    /**
     * Gets the vmIp value for this VmIpAndServicesType.
     * 
     * @return vmIp
     */
    public java.lang.String getVmIp() {
        return vmIp;
    }


    /**
     * Sets the vmIp value for this VmIpAndServicesType.
     * 
     * @param vmIp
     */
    public void setVmIp(java.lang.String vmIp) {
        this.vmIp = vmIp;
    }


    /**
     * Gets the servicesListType value for this VmIpAndServicesType.
     * 
     * @return servicesListType
     */
    public java.lang.String[] getServicesListType() {
        return servicesListType;
    }


    /**
     * Sets the servicesListType value for this VmIpAndServicesType.
     * 
     * @param servicesListType
     */
    public void setServicesListType(java.lang.String[] servicesListType) {
        this.servicesListType = servicesListType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VmIpAndServicesType)) return false;
        VmIpAndServicesType other = (VmIpAndServicesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vmIp==null && other.getVmIp()==null) || 
             (this.vmIp!=null &&
              this.vmIp.equals(other.getVmIp()))) &&
            ((this.servicesListType==null && other.getServicesListType()==null) || 
             (this.servicesListType!=null &&
              java.util.Arrays.equals(this.servicesListType, other.getServicesListType())));
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
        if (getVmIp() != null) {
            _hashCode += getVmIp().hashCode();
        }
        if (getServicesListType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicesListType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServicesListType(), i);
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
        new org.apache.axis.description.TypeDesc(VmIpAndServicesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/service", "VmIpAndServicesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmIp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/service", "vmIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicesListType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/service", "servicesListType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/service", "serviceName"));
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
