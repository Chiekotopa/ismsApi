
package com.api.isms.org.csapi.schema.parlayx.sms.send.v2_2.local;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.api.isms.org.csapi.schema.parlayx.common.v2_1.ChargingInformation;
import com.api.isms.org.csapi.schema.parlayx.common.v2_1.NamedParameterList;
import com.api.isms.org.csapi.schema.parlayx.common.v2_1.SimpleReference;


/**
 * <p>Classe Java pour sendSms complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="sendSms">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addresses" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/>
 *         &lt;element name="senderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="charging" type="{http://www.csapi.org/schema/parlayx/common/v2_1}ChargingInformation" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="receiptRequest" type="{http://www.csapi.org/schema/parlayx/common/v2_1}SimpleReference" minOccurs="0"/>
 *         &lt;element name="encode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceport" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="destinationport" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="esm_class" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="data_coding" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="extensionInfo" type="{http://www.csapi.org/schema/parlayx/common/v2_1}NamedParameterList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendSms", propOrder = {
    "addresses",
    "senderName",
    "charging",
    "message",
    "receiptRequest",
    "encode",
    "sourceport",
    "destinationport",
    "esmClass",
    "dataCoding",
    "extensionInfo"
})
public class SendSms {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> addresses;
    protected String senderName;
    protected ChargingInformation charging;
    @XmlElement(required = true)
    protected String message;
    protected SimpleReference receiptRequest;
    protected String encode;
    protected Integer sourceport;
    protected Integer destinationport;
    @XmlElement(name = "esm_class")
    protected Integer esmClass;
    @XmlElement(name = "data_coding")
    protected Integer dataCoding;
    protected NamedParameterList extensionInfo;

    /**
     * Gets the value of the addresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddresses() {
        if (addresses == null) {
            addresses = new ArrayList<String>();
        }
        return this.addresses;
    }

    /**
     * Obtient la valeur de la propri�t� senderName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderName() {
        return senderName;
    }

    /**
     * D�finit la valeur de la propri�t� senderName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderName(String value) {
        this.senderName = value;
    }

    /**
     * Obtient la valeur de la propri�t� charging.
     * 
     * @return
     *     possible object is
     *     {@link ChargingInformation }
     *     
     */
    public ChargingInformation getCharging() {
        return charging;
    }

    /**
     * D�finit la valeur de la propri�t� charging.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargingInformation }
     *     
     */
    public void setCharging(ChargingInformation value) {
        this.charging = value;
    }

    /**
     * Obtient la valeur de la propri�t� message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * D�finit la valeur de la propri�t� message.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Obtient la valeur de la propri�t� receiptRequest.
     * 
     * @return
     *     possible object is
     *     {@link SimpleReference }
     *     
     */
    public SimpleReference getReceiptRequest() {
        return receiptRequest;
    }

    /**
     * D�finit la valeur de la propri�t� receiptRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleReference }
     *     
     */
    public void setReceiptRequest(SimpleReference value) {
        this.receiptRequest = value;
    }

    /**
     * Obtient la valeur de la propri�t� encode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncode() {
        return encode;
    }

    /**
     * D�finit la valeur de la propri�t� encode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncode(String value) {
        this.encode = value;
    }

    /**
     * Obtient la valeur de la propri�t� sourceport.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSourceport() {
        return sourceport;
    }

    /**
     * D�finit la valeur de la propri�t� sourceport.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSourceport(Integer value) {
        this.sourceport = value;
    }

    /**
     * Obtient la valeur de la propri�t� destinationport.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDestinationport() {
        return destinationport;
    }

    /**
     * D�finit la valeur de la propri�t� destinationport.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDestinationport(Integer value) {
        this.destinationport = value;
    }

    /**
     * Obtient la valeur de la propri�t� esmClass.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEsmClass() {
        return esmClass;
    }

    /**
     * D�finit la valeur de la propri�t� esmClass.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEsmClass(Integer value) {
        this.esmClass = value;
    }

    /**
     * Obtient la valeur de la propri�t� dataCoding.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataCoding() {
        return dataCoding;
    }

    /**
     * D�finit la valeur de la propri�t� dataCoding.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataCoding(Integer value) {
        this.dataCoding = value;
    }

    /**
     * Obtient la valeur de la propri�t� extensionInfo.
     * 
     * @return
     *     possible object is
     *     {@link NamedParameterList }
     *     
     */
    public NamedParameterList getExtensionInfo() {
        return extensionInfo;
    }

    /**
     * D�finit la valeur de la propri�t� extensionInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedParameterList }
     *     
     */
    public void setExtensionInfo(NamedParameterList value) {
        this.extensionInfo = value;
    }

}
