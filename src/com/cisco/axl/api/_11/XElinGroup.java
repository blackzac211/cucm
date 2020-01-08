
package com.cisco.axl.api._11;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XElinGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XElinGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="name" type="{http://www.cisco.com/AXL/API/11.0}UniqueString50"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/11.0}String255" minOccurs="0"/>
 *         &lt;element name="elinNumbers">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.cisco.com/AXL/API/11.0}XCommonMembersExtension">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="elinNumber" type="{http://www.cisco.com/AXL/API/11.0}XELINNumber" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XElinGroup", propOrder = {
    "name",
    "description",
    "elinNumbers"
})
public class XElinGroup {

    protected String name;
    @XmlElementRef(name = "description", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    protected XElinGroup.ElinNumbers elinNumbers;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the elinNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link XElinGroup.ElinNumbers }
     *     
     */
    public XElinGroup.ElinNumbers getElinNumbers() {
        return elinNumbers;
    }

    /**
     * Sets the value of the elinNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link XElinGroup.ElinNumbers }
     *     
     */
    public void setElinNumbers(XElinGroup.ElinNumbers value) {
        this.elinNumbers = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.cisco.com/AXL/API/11.0}XCommonMembersExtension">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="elinNumber" type="{http://www.cisco.com/AXL/API/11.0}XELINNumber" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "elinNumber"
    })
    public static class ElinNumbers
        extends XCommonMembersExtension
    {

        protected List<XELINNumber> elinNumber;

        /**
         * Gets the value of the elinNumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the elinNumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getElinNumber().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link XELINNumber }
         * 
         * 
         */
        public List<XELINNumber> getElinNumber() {
            if (elinNumber == null) {
                elinNumber = new ArrayList<XELINNumber>();
            }
            return this.elinNumber;
        }

    }

}
