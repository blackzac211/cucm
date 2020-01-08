
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetConferenceNowRes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetConferenceNowRes">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.0}APIResponse">
 *       &lt;sequence>
 *         &lt;element name="return">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="conferenceNow" type="{http://www.cisco.com/AXL/API/11.0}RConferenceNow"/>
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
@XmlType(name = "GetConferenceNowRes", propOrder = {
    "_return"
})
public class GetConferenceNowRes
    extends APIResponse
{

    @XmlElement(name = "return", required = true)
    protected GetConferenceNowRes.Return _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link GetConferenceNowRes.Return }
     *     
     */
    public GetConferenceNowRes.Return getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetConferenceNowRes.Return }
     *     
     */
    public void setReturn(GetConferenceNowRes.Return value) {
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
     *         &lt;element name="conferenceNow" type="{http://www.cisco.com/AXL/API/11.0}RConferenceNow"/>
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
        "conferenceNow"
    })
    public static class Return {

        @XmlElement(required = true)
        protected RConferenceNow conferenceNow;

        /**
         * Gets the value of the conferenceNow property.
         * 
         * @return
         *     possible object is
         *     {@link RConferenceNow }
         *     
         */
        public RConferenceNow getConferenceNow() {
            return conferenceNow;
        }

        /**
         * Sets the value of the conferenceNow property.
         * 
         * @param value
         *     allowed object is
         *     {@link RConferenceNow }
         *     
         */
        public void setConferenceNow(RConferenceNow value) {
            this.conferenceNow = value;
        }

    }

}
