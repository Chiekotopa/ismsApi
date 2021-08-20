
package com.api.isms.cn.com.huawei.schema.common.v2_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour NotifySOAPHeader complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="NotifySOAPHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="spRevId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spRevpassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OperatorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifySOAPHeader", propOrder = {
    "spRevId",
    "spRevpassword",
    "spId",
    "serviceId",
    "timeStamp",
    "linkid",
    "operatorID"
})
public class NotifySOAPHeader {

    protected String spRevId;
    protected String spRevpassword;
    protected String spId;
    protected String serviceId;
    protected String timeStamp;
    protected String linkid;
    @XmlElement(name = "OperatorID")
    protected String operatorID;

    /**
     * Obtient la valeur de la propri�t� spRevId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpRevId() {
        return spRevId;
    }

    /**
     * D�finit la valeur de la propri�t� spRevId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpRevId(String value) {
        this.spRevId = value;
    }

    /**
     * Obtient la valeur de la propri�t� spRevpassword.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpRevpassword() {
        return spRevpassword;
    }

    /**
     * D�finit la valeur de la propri�t� spRevpassword.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpRevpassword(String value) {
        this.spRevpassword = value;
    }

    /**
     * Obtient la valeur de la propri�t� spId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpId() {
        return spId;
    }

    /**
     * D�finit la valeur de la propri�t� spId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpId(String value) {
        this.spId = value;
    }

    /**
     * Obtient la valeur de la propri�t� serviceId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * D�finit la valeur de la propri�t� serviceId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceId(String value) {
        this.serviceId = value;
    }

    /**
     * Obtient la valeur de la propri�t� timeStamp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * D�finit la valeur de la propri�t� timeStamp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeStamp(String value) {
        this.timeStamp = value;
    }

    /**
     * Obtient la valeur de la propri�t� linkid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkid() {
        return linkid;
    }

    /**
     * D�finit la valeur de la propri�t� linkid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkid(String value) {
        this.linkid = value;
    }

    /**
     * Obtient la valeur de la propri�t� operatorID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorID() {
        return operatorID;
    }

    /**
     * D�finit la valeur de la propri�t� operatorID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorID(String value) {
        this.operatorID = value;
    }

}
