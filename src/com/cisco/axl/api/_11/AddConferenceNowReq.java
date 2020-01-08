
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddConferenceNowReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddConferenceNowReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="conferenceNow" type="{http://www.cisco.com/AXL/API/11.0}XConferenceNow"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddConferenceNowReq", propOrder = {
    "conferenceNow"
})
public class AddConferenceNowReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XConferenceNow conferenceNow;

    /**
     * Gets the value of the conferenceNow property.
     * 
     * @return
     *     possible object is
     *     {@link XConferenceNow }
     *     
     */
    public XConferenceNow getConferenceNow() {
        return conferenceNow;
    }

    /**
     * Sets the value of the conferenceNow property.
     * 
     * @param value
     *     allowed object is
     *     {@link XConferenceNow }
     *     
     */
    public void setConferenceNow(XConferenceNow value) {
        this.conferenceNow = value;
    }

}
