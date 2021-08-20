
package com.api.isms.org.csapi.schema.parlayx.sms.send.v2_2.local;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.api.isms.org.csapi.schema.parlayx.common.v2_1.ChargingInformation;
import com.api.isms.org.csapi.schema.parlayx.common.v2_1.SimpleReference;
import com.api.isms.org.csapi.schema.parlayx.sms.v2_2.SmsFormat;


/**
 * <p>Classe Java pour sendSmsLogo complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="sendSmsLogo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addresses" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/>
 *         &lt;element name="senderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="charging" type="{http://www.csapi.org/schema/parlayx/common/v2_1}ChargingInformation" minOccurs="0"/>
 *         &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="smsFormat" type="{http://www.csapi.org/schema/parlayx/sms/v2_2}SmsFormat"/>
 *         &lt;element name="receiptRequest" type="{http://www.csapi.org/schema/parlayx/common/v2_1}SimpleReference" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendSmsLogo", propOrder = {
    "addresses",
    "senderName",
    "charging",
    "image",
    "smsFormat",
    "receiptRequest"
})
public class SendSmsLogo {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> addresses;
    protected String senderName;
    protected ChargingInformation charging;
    @XmlElement(required = true)
    protected byte[] image;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SmsFormat smsFormat;
    protected SimpleReference receiptRequest;

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
     * Obtient la valeur de la propri�t� image.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImage() {
        return image;
    }

    /**
     * D�finit la valeur de la propri�t� image.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImage(byte[] value) {
        this.image = value;
    }

    /**
     * Obtient la valeur de la propri�t� smsFormat.
     * 
     * @return
     *     possible object is
     *     {@link SmsFormat }
     *     
     */
    public SmsFormat getSmsFormat() {
        return smsFormat;
    }

    /**
     * D�finit la valeur de la propri�t� smsFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link SmsFormat }
     *     
     */
    public void setSmsFormat(SmsFormat value) {
        this.smsFormat = value;
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

}
