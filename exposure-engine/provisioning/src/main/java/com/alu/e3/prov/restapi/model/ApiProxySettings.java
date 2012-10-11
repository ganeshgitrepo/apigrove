/**
 * Copyright © 2012 Alcatel-Lucent.
 *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * Licensed to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-27 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.20 at 03:08:31 PM CEST 
//


package com.alu.e3.prov.restapi.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The Proxy settings on an API to use when calling the south-bound target hosts by a E3 on-boarded API. 
 * If local settings are provided they will be used.
 * else if global settings are provided, they will be get from E3 system settings.
 * Otherwise no Proxy settings will be used.
 * 
 * Note: Only  one setting is allowed, global xor local.
 *   
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApiProxySettingsType", propOrder = {
    "globalProxy",
    "localProxy"
})
public class ApiProxySettings {

    protected ApiProxySettings.GlobalProxy globalProxy;
    protected ForwardProxy localProxy;

    /**
     * Gets the value of the globalProxy property.
     * 
     * @return
     *     possible object is
     *     {@link ApiProxySettings.GlobalProxy }
     *     
     */
    public ApiProxySettings.GlobalProxy getGlobalProxy() {
        return globalProxy;
    }

    /**
     * Sets the value of the globalProxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApiProxySettings.GlobalProxy }
     *     
     */
    public void setGlobalProxy(ApiProxySettings.GlobalProxy value) {
        this.globalProxy = value;
    }

    /**
     * Gets the value of the localProxy property.
     * 
     * @return
     *     possible object is
     *     {@link ForwardProxyType }
     *     
     */
    public ForwardProxy getLocalProxy() {
        return localProxy;
    }

    /**
     * Sets the value of the localProxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForwardProxyType }
     *     
     */
    public void setLocalProxy(ForwardProxy value) {
        this.localProxy = value;
    }
    
    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class GlobalProxy {


    }
}