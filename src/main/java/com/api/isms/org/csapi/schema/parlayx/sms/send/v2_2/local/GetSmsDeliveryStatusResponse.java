
package com.api.isms.org.csapi.schema.parlayx.sms.send.v2_2.local;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.api.isms.org.csapi.schema.parlayx.sms.v2_2.DeliveryInformation;


/**
 * <p>Classe Java pour getSmsDeliveryStatusResponse complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getSmsDeliveryStatusResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://www.csapi.org/schema/parlayx/sms/v2_2}DeliveryInformation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSmsDeliveryStatusResponse", propOrder = {
    "result"
})
public class GetSmsDeliveryStatusResponse {

    protected List<DeliveryInformation> result;

    /**
     * Gets the value of the result property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the result property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryInformation }
     * 
     * 
     */
    public List<DeliveryInformation> getResult() {
        if (result == null) {
            result = new ArrayList<DeliveryInformation>();
        }
        return this.result;
    }

}
