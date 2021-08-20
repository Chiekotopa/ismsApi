
package com.api.isms.org.csapi.schema.parlayx.common.v2_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TimeMetric complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TimeMetric">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="metric" type="{http://www.csapi.org/schema/parlayx/common/v2_1}TimeMetrics"/>
 *         &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeMetric", propOrder = {
    "metric",
    "units"
})
public class TimeMetric {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TimeMetrics metric;
    protected int units;

    /**
     * Obtient la valeur de la propri�t� metric.
     * 
     * @return
     *     possible object is
     *     {@link TimeMetrics }
     *     
     */
    public TimeMetrics getMetric() {
        return metric;
    }

    /**
     * D�finit la valeur de la propri�t� metric.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeMetrics }
     *     
     */
    public void setMetric(TimeMetrics value) {
        this.metric = value;
    }

    /**
     * Obtient la valeur de la propri�t� units.
     * 
     */
    public int getUnits() {
        return units;
    }

    /**
     * D�finit la valeur de la propri�t� units.
     * 
     */
    public void setUnits(int value) {
        this.units = value;
    }

}
