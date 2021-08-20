
package com.api.isms.cn.com.huawei.schema.common.v2_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour RequestSOAPHeader complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RequestSOAPHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="spId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oauth_token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="watcher" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="presentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="presentid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bundleID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestSOAPHeader", propOrder = {
    "spId",
    "spPassword",
    "serviceId",
    "timeStamp",
    "oa",
    "oauthToken",
    "fa",
    "token",
    "watcher",
    "presentity",
    "authId",
    "linkid",
    "presentid",
    "bundleID"
})
public class RequestSOAPHeader {

    protected String spId;
    protected String spPassword;
    protected String serviceId;
    protected String timeStamp;
    @XmlElement(name = "OA")
    protected String oa;
    @XmlElement(name = "oauth_token")
    protected String oauthToken;
    @XmlElement(name = "FA")
    protected String fa;
    protected String token;
    protected String watcher;
    protected String presentity;
    protected String authId;
    protected String linkid;
    protected String presentid;
    protected String bundleID;

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
     * Obtient la valeur de la propri�t� spPassword.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpPassword() {
        return spPassword;
    }

    /**
     * D�finit la valeur de la propri�t� spPassword.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpPassword(String value) {
        this.spPassword = value;
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
     * Obtient la valeur de la propri�t� oa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOA() {
        return oa;
    }

    /**
     * D�finit la valeur de la propri�t� oa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOA(String value) {
        this.oa = value;
    }

    /**
     * Obtient la valeur de la propri�t� oauthToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOauthToken() {
        return oauthToken;
    }

    /**
     * D�finit la valeur de la propri�t� oauthToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOauthToken(String value) {
        this.oauthToken = value;
    }

    /**
     * Obtient la valeur de la propri�t� fa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFA() {
        return fa;
    }

    /**
     * D�finit la valeur de la propri�t� fa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFA(String value) {
        this.fa = value;
    }

    /**
     * Obtient la valeur de la propri�t� token.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * D�finit la valeur de la propri�t� token.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Obtient la valeur de la propri�t� watcher.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWatcher() {
        return watcher;
    }

    /**
     * D�finit la valeur de la propri�t� watcher.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWatcher(String value) {
        this.watcher = value;
    }

    /**
     * Obtient la valeur de la propri�t� presentity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentity() {
        return presentity;
    }

    /**
     * D�finit la valeur de la propri�t� presentity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentity(String value) {
        this.presentity = value;
    }

    /**
     * Obtient la valeur de la propri�t� authId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthId() {
        return authId;
    }

    /**
     * D�finit la valeur de la propri�t� authId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthId(String value) {
        this.authId = value;
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
     * Obtient la valeur de la propri�t� presentid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentid() {
        return presentid;
    }

    /**
     * D�finit la valeur de la propri�t� presentid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentid(String value) {
        this.presentid = value;
    }

    /**
     * Obtient la valeur de la propri�t� bundleID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundleID() {
        return bundleID;
    }

    /**
     * D�finit la valeur de la propri�t� bundleID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundleID(String value) {
        this.bundleID = value;
    }

}
