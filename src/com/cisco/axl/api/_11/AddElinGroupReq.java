
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddElinGroupReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddElinGroupReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.0}APIRequest">
 *       &lt;sequence>
 *         &lt;element name="elinGroup" type="{http://www.cisco.com/AXL/API/11.0}XElinGroup"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddElinGroupReq", propOrder = {
    "elinGroup"
})
public class AddElinGroupReq
    extends APIRequest
{

    @XmlElement(required = true)
    protected XElinGroup elinGroup;

    /**
     * Gets the value of the elinGroup property.
     * 
     * @return
     *     possible object is
     *     {@link XElinGroup }
     *     
     */
    public XElinGroup getElinGroup() {
        return elinGroup;
    }

    /**
     * Sets the value of the elinGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link XElinGroup }
     *     
     */
    public void setElinGroup(XElinGroup value) {
        this.elinGroup = value;
    }

}
