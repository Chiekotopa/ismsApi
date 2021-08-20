
package com.api.isms.org.csapi.schema.parlayx.sms.v2_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.api.isms.org.csapi.schema.parlayx.common.v2_1.NamedParameterList;


/**
 * <p>Classe Java pour SmsMessage complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SmsMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="senderAddress" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="smsServiceActivationNumber" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="dateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "SmsMessage", propOrder = {
    "message",
    "senderAddress",
    "smsServiceActivationNumber",
    "dateTime",
    "extensionInfo"
})
public class SmsMessage {

    @XmlElement(required = true)
    protected String message;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String senderAddress;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String smsServiceActivationNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    protected NamedParameterList extensionInfo;

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
     * Obtient la valeur de la propri�t� senderAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderAddress() {
        return senderAddress;
    }

    /**
     * D�finit la valeur de la propri�t� senderAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderAddress(String value) {
        this.senderAddress = value;
    }

    /**
     * Obtient la valeur de la propri�t� smsServiceActivationNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsServiceActivationNumber() {
        return smsServiceActivationNumber;
    }

    /**
     * D�finit la valeur de la propri�t� smsServiceActivationNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsServiceActivationNumber(String value) {
        this.smsServiceActivationNumber = value;
    }

    /**
     * Obtient la valeur de la propri�t� dateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * D�finit la valeur de la propri�t� dateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
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
