
package com.cisco.axl.api._11;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XConferenceNow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XConferenceNow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="conferenceNowNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="routePartitionName" type="{http://www.cisco.com/AXL/API/11.0}XFkType" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxWaitTimeForHost" type="{http://www.cisco.com/AXL/API/11.0}XInteger"/>
 *         &lt;element name="MohAudioSourceId" type="{http://www.cisco.com/AXL/API/11.0}XMOHAudioSourceId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XConferenceNow", propOrder = {
    "conferenceNowNumber",
    "routePartitionName",
    "description",
    "maxWaitTimeForHost",
    "mohAudioSourceId"
})
public class XConferenceNow {

    protected String conferenceNowNumber;
    @XmlElementRef(name = "routePartitionName", type = JAXBElement.class, required = false)
    protected JAXBElement<XFkType> routePartitionName;
    protected String description;
    @XmlElement(defaultValue = "15")
    protected String maxWaitTimeForHost;
    @XmlElementRef(name = "MohAudioSourceId", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mohAudioSourceId;

    /**
     * Gets the value of the conferenceNowNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConferenceNowNumber() {
        return conferenceNowNumber;
    }

    /**
     * Sets the value of the conferenceNowNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConferenceNowNumber(String value) {
        this.conferenceNowNumber = value;
    }

    /**
     * Gets the value of the routePartitionName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public JAXBElement<XFkType> getRoutePartitionName() {
        return routePartitionName;
    }

    /**
     * Sets the value of the routePartitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XFkType }{@code >}
     *     
     */
    public void setRoutePartitionName(JAXBElement<XFkType> value) {
        this.routePartitionName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the maxWaitTimeForHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxWaitTimeForHost() {
        return maxWaitTimeForHost;
    }

    /**
     * Sets the value of the maxWaitTimeForHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxWaitTimeForHost(String value) {
        this.maxWaitTimeForHost = value;
    }

    /**
     * Gets the value of the mohAudioSourceId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMohAudioSourceId() {
        return mohAudioSourceId;
    }

    /**
     * Sets the value of the mohAudioSourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMohAudioSourceId(JAXBElement<String> value) {
        this.mohAudioSourceId = value;
    }

}
