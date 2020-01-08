
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetHttpProfileRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetHttpProfileRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="httpProfile" type="{http://www.cisco.com/AXL/API/11.0}RHttpProfile"/>
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
@XmlType(name = "GetHttpProfileRes", propOrder = {
    "_return"
})
public class GetHttpProfileRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetHttpProfileRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetHttpProfileRes.Return }
     *     
     */
    public GetHttpProfileRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetHttpProfileRes.Return }
     *     
     */
    public void setReturn(GetHttpProfileRes.Return value) {
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
     *         &lt;element name="httpProfile" type="{http://www.cisco.com/AXL/API/11.0}RHttpProfile"/>
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
        "httpProfile"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RHttpProfile httpProfile;

        /**
         * Gets the value of the httpProfile property.
         * 
         * @return
         *     possible object is
         *     {@link RHttpProfile }
         *     
         */
        public RHttpProfile getHttpProfile() {
            return httpProfile;
        }

        /**
         * Sets the value of the httpProfile property.
         * 
         * @param value
         *     allowed object is
         *     {@link RHttpProfile }
         *     
         */
        public void setHttpProfile(RHttpProfile value) {
            this.httpProfile = value;
        }

    }

}
