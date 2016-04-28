/**
 * ServiceRegisterType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package registerClient;

public class ServiceRegisterType  implements java.io.Serializable {
    private java.lang.String serviceName;

    private java.lang.String serviceName_CH;

    private java.lang.String servicesVersion;

    private java.lang.String serviceType;

    private java.lang.String serviceURL;

    private java.lang.String[] keyWords;

    private java.lang.String serviceTargetNetwork;

    private java.lang.String serviceDescription;

    private registerClient.SystemReqType systemRequirements;

    private java.lang.String[] fileList;

    private java.lang.String[] dependOnServiceLists;

    private java.lang.String registerTime;

    private java.lang.String lastTime;

    private boolean isCombined;

    private boolean isRemovable;

    private boolean isAxisService;

    public ServiceRegisterType() {
    }

    public ServiceRegisterType(
           java.lang.String serviceName,
           java.lang.String serviceName_CH,
           java.lang.String servicesVersion,
           java.lang.String serviceType,
           java.lang.String serviceURL,
           java.lang.String[] keyWords,
           java.lang.String serviceTargetNetwork,
           java.lang.String serviceDescription,
           registerClient.SystemReqType systemRequirements,
           java.lang.String[] fileList,
           java.lang.String[] dependOnServiceLists,
           java.lang.String registerTime,
           java.lang.String lastTime,
           boolean isCombined,
           boolean isRemovable,
           boolean isAxisService) {
           this.serviceName = serviceName;
           this.serviceName_CH = serviceName_CH;
           this.servicesVersion = servicesVersion;
           this.serviceType = serviceType;
           this.serviceURL = serviceURL;
           this.keyWords = keyWords;
           this.serviceTargetNetwork = serviceTargetNetwork;
           this.serviceDescription = serviceDescription;
           this.systemRequirements = systemRequirements;
           this.fileList = fileList;
           this.dependOnServiceLists = dependOnServiceLists;
           this.registerTime = registerTime;
           this.lastTime = lastTime;
           this.isCombined = isCombined;
           this.isRemovable = isRemovable;
           this.isAxisService = isAxisService;
    }


    /**
     * Gets the serviceName value for this ServiceRegisterType.
     * 
     * @return serviceName
     */
    public java.lang.String getServiceName() {
        return serviceName;
    }


    /**
     * Sets the serviceName value for this ServiceRegisterType.
     * 
     * @param serviceName
     */
    public void setServiceName(java.lang.String serviceName) {
        this.serviceName = serviceName;
    }


    /**
     * Gets the serviceName_CH value for this ServiceRegisterType.
     * 
     * @return serviceName_CH
     */
    public java.lang.String getServiceName_CH() {
        return serviceName_CH;
    }


    /**
     * Sets the serviceName_CH value for this ServiceRegisterType.
     * 
     * @param serviceName_CH
     */
    public void setServiceName_CH(java.lang.String serviceName_CH) {
        this.serviceName_CH = serviceName_CH;
    }


    /**
     * Gets the servicesVersion value for this ServiceRegisterType.
     * 
     * @return servicesVersion
     */
    public java.lang.String getServicesVersion() {
        return servicesVersion;
    }


    /**
     * Sets the servicesVersion value for this ServiceRegisterType.
     * 
     * @param servicesVersion
     */
    public void setServicesVersion(java.lang.String servicesVersion) {
        this.servicesVersion = servicesVersion;
    }


    /**
     * Gets the serviceType value for this ServiceRegisterType.
     * 
     * @return serviceType
     */
    public java.lang.String getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this ServiceRegisterType.
     * 
     * @param serviceType
     */
    public void setServiceType(java.lang.String serviceType) {
        this.serviceType = serviceType;
    }


    /**
     * Gets the serviceURL value for this ServiceRegisterType.
     * 
     * @return serviceURL
     */
    public java.lang.String getServiceURL() {
        return serviceURL;
    }


    /**
     * Sets the serviceURL value for this ServiceRegisterType.
     * 
     * @param serviceURL
     */
    public void setServiceURL(java.lang.String serviceURL) {
        this.serviceURL = serviceURL;
    }


    /**
     * Gets the keyWords value for this ServiceRegisterType.
     * 
     * @return keyWords
     */
    public java.lang.String[] getKeyWords() {
        return keyWords;
    }


    /**
     * Sets the keyWords value for this ServiceRegisterType.
     * 
     * @param keyWords
     */
    public void setKeyWords(java.lang.String[] keyWords) {
        this.keyWords = keyWords;
    }


    /**
     * Gets the serviceTargetNetwork value for this ServiceRegisterType.
     * 
     * @return serviceTargetNetwork
     */
    public java.lang.String getServiceTargetNetwork() {
        return serviceTargetNetwork;
    }


    /**
     * Sets the serviceTargetNetwork value for this ServiceRegisterType.
     * 
     * @param serviceTargetNetwork
     */
    public void setServiceTargetNetwork(java.lang.String serviceTargetNetwork) {
        this.serviceTargetNetwork = serviceTargetNetwork;
    }


    /**
     * Gets the serviceDescription value for this ServiceRegisterType.
     * 
     * @return serviceDescription
     */
    public java.lang.String getServiceDescription() {
        return serviceDescription;
    }


    /**
     * Sets the serviceDescription value for this ServiceRegisterType.
     * 
     * @param serviceDescription
     */
    public void setServiceDescription(java.lang.String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }


    /**
     * Gets the systemRequirements value for this ServiceRegisterType.
     * 
     * @return systemRequirements
     */
    public registerClient.SystemReqType getSystemRequirements() {
        return systemRequirements;
    }


    /**
     * Sets the systemRequirements value for this ServiceRegisterType.
     * 
     * @param systemRequirements
     */
    public void setSystemRequirements(registerClient.SystemReqType systemRequirements) {
        this.systemRequirements = systemRequirements;
    }


    /**
     * Gets the fileList value for this ServiceRegisterType.
     * 
     * @return fileList
     */
    public java.lang.String[] getFileList() {
        return fileList;
    }


    /**
     * Sets the fileList value for this ServiceRegisterType.
     * 
     * @param fileList
     */
    public void setFileList(java.lang.String[] fileList) {
        this.fileList = fileList;
    }


    /**
     * Gets the dependOnServiceLists value for this ServiceRegisterType.
     * 
     * @return dependOnServiceLists
     */
    public java.lang.String[] getDependOnServiceLists() {
        return dependOnServiceLists;
    }


    /**
     * Sets the dependOnServiceLists value for this ServiceRegisterType.
     * 
     * @param dependOnServiceLists
     */
    public void setDependOnServiceLists(java.lang.String[] dependOnServiceLists) {
        this.dependOnServiceLists = dependOnServiceLists;
    }


    /**
     * Gets the registerTime value for this ServiceRegisterType.
     * 
     * @return registerTime
     */
    public java.lang.String getRegisterTime() {
        return registerTime;
    }


    /**
     * Sets the registerTime value for this ServiceRegisterType.
     * 
     * @param registerTime
     */
    public void setRegisterTime(java.lang.String registerTime) {
        this.registerTime = registerTime;
    }


    /**
     * Gets the lastTime value for this ServiceRegisterType.
     * 
     * @return lastTime
     */
    public java.lang.String getLastTime() {
        return lastTime;
    }


    /**
     * Sets the lastTime value for this ServiceRegisterType.
     * 
     * @param lastTime
     */
    public void setLastTime(java.lang.String lastTime) {
        this.lastTime = lastTime;
    }


    /**
     * Gets the isCombined value for this ServiceRegisterType.
     * 
     * @return isCombined
     */
    public boolean isIsCombined() {
        return isCombined;
    }


    /**
     * Sets the isCombined value for this ServiceRegisterType.
     * 
     * @param isCombined
     */
    public void setIsCombined(boolean isCombined) {
        this.isCombined = isCombined;
    }


    /**
     * Gets the isRemovable value for this ServiceRegisterType.
     * 
     * @return isRemovable
     */
    public boolean isIsRemovable() {
        return isRemovable;
    }


    /**
     * Sets the isRemovable value for this ServiceRegisterType.
     * 
     * @param isRemovable
     */
    public void setIsRemovable(boolean isRemovable) {
        this.isRemovable = isRemovable;
    }


    /**
     * Gets the isAxisService value for this ServiceRegisterType.
     * 
     * @return isAxisService
     */
    public boolean isIsAxisService() {
        return isAxisService;
    }


    /**
     * Sets the isAxisService value for this ServiceRegisterType.
     * 
     * @param isAxisService
     */
    public void setIsAxisService(boolean isAxisService) {
        this.isAxisService = isAxisService;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceRegisterType)) return false;
        ServiceRegisterType other = (ServiceRegisterType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serviceName==null && other.getServiceName()==null) || 
             (this.serviceName!=null &&
              this.serviceName.equals(other.getServiceName()))) &&
            ((this.serviceName_CH==null && other.getServiceName_CH()==null) || 
             (this.serviceName_CH!=null &&
              this.serviceName_CH.equals(other.getServiceName_CH()))) &&
            ((this.servicesVersion==null && other.getServicesVersion()==null) || 
             (this.servicesVersion!=null &&
              this.servicesVersion.equals(other.getServicesVersion()))) &&
            ((this.serviceType==null && other.getServiceType()==null) || 
             (this.serviceType!=null &&
              this.serviceType.equals(other.getServiceType()))) &&
            ((this.serviceURL==null && other.getServiceURL()==null) || 
             (this.serviceURL!=null &&
              this.serviceURL.equals(other.getServiceURL()))) &&
            ((this.keyWords==null && other.getKeyWords()==null) || 
             (this.keyWords!=null &&
              java.util.Arrays.equals(this.keyWords, other.getKeyWords()))) &&
            ((this.serviceTargetNetwork==null && other.getServiceTargetNetwork()==null) || 
             (this.serviceTargetNetwork!=null &&
              this.serviceTargetNetwork.equals(other.getServiceTargetNetwork()))) &&
            ((this.serviceDescription==null && other.getServiceDescription()==null) || 
             (this.serviceDescription!=null &&
              this.serviceDescription.equals(other.getServiceDescription()))) &&
            ((this.systemRequirements==null && other.getSystemRequirements()==null) || 
             (this.systemRequirements!=null &&
              this.systemRequirements.equals(other.getSystemRequirements()))) &&
            ((this.fileList==null && other.getFileList()==null) || 
             (this.fileList!=null &&
              java.util.Arrays.equals(this.fileList, other.getFileList()))) &&
            ((this.dependOnServiceLists==null && other.getDependOnServiceLists()==null) || 
             (this.dependOnServiceLists!=null &&
              java.util.Arrays.equals(this.dependOnServiceLists, other.getDependOnServiceLists()))) &&
            ((this.registerTime==null && other.getRegisterTime()==null) || 
             (this.registerTime!=null &&
              this.registerTime.equals(other.getRegisterTime()))) &&
            ((this.lastTime==null && other.getLastTime()==null) || 
             (this.lastTime!=null &&
              this.lastTime.equals(other.getLastTime()))) &&
            this.isCombined == other.isIsCombined() &&
            this.isRemovable == other.isIsRemovable() &&
            this.isAxisService == other.isIsAxisService();
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
        if (getServiceName() != null) {
            _hashCode += getServiceName().hashCode();
        }
        if (getServiceName_CH() != null) {
            _hashCode += getServiceName_CH().hashCode();
        }
        if (getServicesVersion() != null) {
            _hashCode += getServicesVersion().hashCode();
        }
        if (getServiceType() != null) {
            _hashCode += getServiceType().hashCode();
        }
        if (getServiceURL() != null) {
            _hashCode += getServiceURL().hashCode();
        }
        if (getKeyWords() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKeyWords());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKeyWords(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServiceTargetNetwork() != null) {
            _hashCode += getServiceTargetNetwork().hashCode();
        }
        if (getServiceDescription() != null) {
            _hashCode += getServiceDescription().hashCode();
        }
        if (getSystemRequirements() != null) {
            _hashCode += getSystemRequirements().hashCode();
        }
        if (getFileList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFileList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFileList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDependOnServiceLists() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDependOnServiceLists());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDependOnServiceLists(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRegisterTime() != null) {
            _hashCode += getRegisterTime().hashCode();
        }
        if (getLastTime() != null) {
            _hashCode += getLastTime().hashCode();
        }
        _hashCode += (isIsCombined() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsRemovable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsAxisService() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceRegisterType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/service", "serviceRegisterType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/service", "serviceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceName_CH");
        elemField.setXmlName(new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/service", "serviceName_CH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicesVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/service", "servicesVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/service", "serviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/service", "serviceURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyWords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/service", "keyWords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/service", "keyWord"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceTargetNetwork");
        elemField.setXmlName(new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/service", "serviceTargetNetwork"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/service", "serviceDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemRequirements");
        elemField.setXmlName(new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/service", "systemRequirements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/service", "SystemReqType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/service", "fileList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/service", "fileName"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dependOnServiceLists");
        elemField.setXmlName(new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/service", "dependOnServiceLists"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/service", "serviceList"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registerTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/service", "registerTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/service", "lastTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCombined");
        elemField.setXmlName(new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/service", "isCombined"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRemovable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/service", "isRemovable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAxisService");
        elemField.setXmlName(new javax.xml.namespace.QName("http://registerService.ws.zc:8080/axis/service", "isAxisService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
