//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.02 at 12:49:59 PM IST 
//


package in.gov.uidai.authentication.otp._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Otp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Otp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Opts" type="{http://www.uidai.gov.in/authentication/otp/2.5}Opts" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="uid" use="required" type="{http://www.uidai.gov.in/authentication/common/types/2.5}uid" /&gt;
 *       &lt;attribute name="ac" use="required" type="{http://www.uidai.gov.in/authentication/common/types/2.5}AuaCode" /&gt;
 *       &lt;attribute name="sa" use="required" type="{http://www.uidai.gov.in/authentication/common/types/2.5}AuaCode" /&gt;
 *       &lt;attribute name="ver" use="required" type="{http://www.uidai.gov.in/authentication/common/types/2.5}Ver" /&gt;
 *       &lt;attribute name="txn" use="required" type="{http://www.uidai.gov.in/authentication/common/types/2.5}Txn" /&gt;
 *       &lt;attribute name="ts" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="lk" use="required" type="{http://www.uidai.gov.in/authentication/common/types/2.5}LicenseKey" /&gt;
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" default="A" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Otp", propOrder = {
    "opts"
})
public class Otp {

    @XmlElement(name = "Opts")
    protected Opts opts;
    @XmlAttribute(name = "uid", required = true)
    protected String uid;
    @XmlAttribute(name = "ac", required = true)
    protected String ac;
    @XmlAttribute(name = "sa", required = true)
    protected String sa;
    @XmlAttribute(name = "ver", required = true)
    protected String ver;
    @XmlAttribute(name = "txn", required = true)
    protected String txn;
    @XmlAttribute(name = "ts", required = true)
    protected String ts;
    @XmlAttribute(name = "lk", required = true)
    protected String lk;
    @XmlAttribute(name = "type")
    protected String type;

    /**
     * Gets the value of the opts property.
     * 
     * @return
     *     possible object is
     *     {@link Opts }
     *     
     */
    public Opts getOpts() {
        return opts;
    }

    /**
     * Sets the value of the opts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Opts }
     *     
     */
    public void setOpts(Opts value) {
        this.opts = value;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUid(String value) {
        this.uid = value;
    }

    /**
     * Gets the value of the ac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAc() {
        return ac;
    }

    /**
     * Sets the value of the ac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAc(String value) {
        this.ac = value;
    }

    /**
     * Gets the value of the sa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSa() {
        return sa;
    }

    /**
     * Sets the value of the sa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSa(String value) {
        this.sa = value;
    }

    /**
     * Gets the value of the ver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVer() {
        return ver;
    }

    /**
     * Sets the value of the ver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVer(String value) {
        this.ver = value;
    }

    /**
     * Gets the value of the txn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxn() {
        return txn;
    }

    /**
     * Sets the value of the txn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxn(String value) {
        this.txn = value;
    }

    /**
     * Gets the value of the ts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTs() {
        return ts;
    }

    /**
     * Sets the value of the ts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTs(String value) {
        this.ts = value;
    }

    /**
     * Gets the value of the lk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLk() {
        return lk;
    }

    /**
     * Sets the value of the lk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLk(String value) {
        this.lk = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        if (type == null) {
            return "A";
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
