
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSyslogConfigurationRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSyslogConfigurationRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="syslogConfiguration" type="{http://www.cisco.com/AXL/API/11.0}RSyslogConfiguration"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSyslogConfigurationRes", propOrder = {
    "_return"
})
public class GetSyslogConfigurationRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetSyslogConfigurationRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetSyslogConfigurationRes.Return }
     *     
     */
    public GetSyslogConfigurationRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSyslogConfigurationRes.Return }
     *     
     */
    public void setReturn(GetSyslogConfigurationRes.Return value) {
        this._return = value;
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
     *       &lt;sequence>
     *         &lt;element name="syslogConfiguration" type="{http://www.cisco.com/AXL/API/11.0}RSyslogConfiguration"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "syslogConfiguration"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RSyslogConfiguration syslogConfiguration;

        /**
         * Gets the value of the syslogConfiguration property.
         * 
         * @return
         *     possible object is
         *     {@link RSyslogConfiguration }
         *     
         */
        public RSyslogConfiguration getSyslogConfiguration() {
            return syslogConfiguration;
        }

        /**
         * Sets the value of the syslogConfiguration property.
         * 
         * @param value
         *     allowed object is
         *     {@link RSyslogConfiguration }
         *     
         */
        public void setSyslogConfiguration(RSyslogConfiguration value) {
            this.syslogConfiguration = value;
        }

    }

}
