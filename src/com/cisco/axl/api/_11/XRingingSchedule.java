
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XRingingSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XRingingSchedule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="startTime" type="{http://www.cisco.com/AXL/API/11.0}XTimeOfDay" minOccurs="0"/>
 *         &lt;element name="endTime" type="{http://www.cisco.com/AXL/API/11.0}XTimeOfDay" minOccurs="0"/>
 *         &lt;element name="startDay" type="{http://www.cisco.com/AXL/API/11.0}XDayOfWeek" minOccurs="0"/>
 *         &lt;element name="endDay" type="{http://www.cisco.com/AXL/API/11.0}XDayOfWeek" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XRingingSchedule", propOrder = {
    "startTime",
    "endTime",
    "startDay",
    "endDay"
})
public class XRingingSchedule {

    @XmlElement(defaultValue = "No Office Hours")
    protected String startTime;
    @XmlElement(defaultValue = "No Office Hours")
    protected String endTime;
    @XmlElement(defaultValue = "None")
    protected String startDay;
    @XmlElement(defaultValue = "None")
    protected String endDay;

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(String value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTime(String value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the startDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDay() {
        return startDay;
    }

    /**
     * Sets the value of the startDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDay(String value) {
        this.startDay = value;
    }

    /**
     * Gets the value of the endDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDay() {
        return endDay;
    }

    /**
     * Sets the value of the endDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDay(String value) {
        this.endDay = value;
    }

}
