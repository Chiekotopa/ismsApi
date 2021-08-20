
package com.api.isms.org.csapi.schema.parlayx.sms.v2_2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SmsFormat.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SmsFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ems"/>
 *     &lt;enumeration value="SmartMessaging"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SmsFormat")
@XmlEnum
public enum SmsFormat {

    @XmlEnumValue("Ems")
    EMS("Ems"),
    @XmlEnumValue("SmartMessaging")
    SMART_MESSAGING("SmartMessaging");
    private final String value;

    SmsFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SmsFormat fromValue(String v) {
        for (SmsFormat c: SmsFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
