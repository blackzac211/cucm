
package com.cisco.axl.api._11;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateElinGroupReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateElinGroupReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cisco.com/AXL/API/11.0}NameAndGUIDRequest">
 *       &lt;sequence>
 *         &lt;element name="newName" type="{http://www.cisco.com/AXL/API/11.0}UniqueString50" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.cisco.com/AXL/API/11.0}String255" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence minOccurs="0">
 *             &lt;element name="removeElinNumbers" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;extension base="{http://www.cisco.com/AXL/API/11.0}XCommonMembersExtension">
 *                     &lt;sequence minOccurs="0">
 *                       &lt;element name="elinNumber" type="{http://www.cisco.com/AXL/API/11.0}XELINNumber" maxOccurs="unbounded"/>
 *                     &lt;/sequence>
 *                   &lt;/extension>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *             &lt;element name="addElinNumbers" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;extension base="{http://www.cisco.com/AXL/API/11.0}XCommonMembersExtension">
 *                     &lt;sequence minOccurs="0">
 *                       &lt;element name="elinNumber" type="{http://www.cisco.com/AXL/API/11.0}XELINNumber" maxOccurs="unbounded"/>
 *                     &lt;/sequence>
 *                   &lt;/extension>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *           &lt;/sequence>
 *           &lt;element name="elinNumbers" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.cisco.com/AXL/API/11.0}XCommonMembersExtension">
 *                   &lt;sequence minOccurs="0">
 *                     &lt;element name="elinNumber" type="{http://www.cisco.com/AXL/API/11.0}XELINNumber" maxOccurs="unbounded"/>
 *                   &lt;/sequence>
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateElinGroupReq", propOrder = {
    "newName",
    "description",
    "removeElinNumbers",
    "addElinNumbers",
    "elinNumbers"
})
public class UpdateElinGroupReq
    extends NameAndGUIDRequest
{

    protected String newName;
    @XmlElementRef(name = "description", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    protected UpdateElinGroupReq.RemoveElinNumbers removeElinNumbers;
    protected UpdateElinGroupReq.AddElinNumbers addElinNumbers;
    protected UpdateElinGroupReq.ElinNumbers elinNumbers;

    /**
     * Gets the value of the newName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewName() {
        return newName;
    }

    /**
     * Sets the value of the newName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewName(String value) {
        this.newName = value;
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
     * Gets the value of the removeElinNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateElinGroupReq.RemoveElinNumbers }
     *     
     */
    public UpdateElinGroupReq.RemoveElinNumbers getRemoveElinNumbers() {
        return removeElinNumbers;
    }

    /**
     * Sets the value of the removeElinNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateElinGroupReq.RemoveElinNumbers }
     *     
     */
    public void setRemoveElinNumbers(UpdateElinGroupReq.RemoveElinNumbers value) {
        this.removeElinNumbers = value;
    }

    /**
     * Gets the value of the addElinNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateElinGroupReq.AddElinNumbers }
     *     
     */
    public UpdateElinGroupReq.AddElinNumbers getAddElinNumbers() {
        return addElinNumbers;
    }

    /**
     * Sets the value of the addElinNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateElinGroupReq.AddElinNumbers }
     *     
     */
    public void setAddElinNumbers(UpdateElinGroupReq.AddElinNumbers value) {
        this.addElinNumbers = value;
    }

    /**
     * Gets the value of the elinNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateElinGroupReq.ElinNumbers }
     *     
     */
    public UpdateElinGroupReq.ElinNumbers getElinNumbers() {
        return elinNumbers;
    }

    /**
     * Sets the value of the elinNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateElinGroupReq.ElinNumbers }
     *     
     */
    public void setElinNumbers(UpdateElinGroupReq.ElinNumbers value) {
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
    public static class AddElinNumbers
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
    public static class RemoveElinNumbers
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
