//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.02 at 12:49:59 PM IST 
//


package in.gov.uidai.kyc.uid_kyc_response._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UidDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UidDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Poi" type="{http://www.uidai.gov.in/kyc/uid-kyc-response/2.5}PoiType"/&gt;
 *         &lt;element name="Poa" type="{http://www.uidai.gov.in/kyc/uid-kyc-response/2.5}PoaType"/&gt;
 *         &lt;element name="LData" type="{http://www.uidai.gov.in/kyc/uid-kyc-response/2.5}LDataType"/&gt;
 *         &lt;element name="Pht" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="Prn" type="{http://www.uidai.gov.in/kyc/uid-kyc-response/2.5}PrnType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="uid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UidDataType", propOrder = {
    "poi",
    "poa",
    "lData",
    "pht",
    "prn"
})
public class UidDataType {

    @XmlElement(name = "Poi", required = true)
    protected PoiType poi;
    @XmlElement(name = "Poa", required = true)
    protected PoaType poa;
    @XmlElement(name = "LData", required = true)
    protected LDataType lData;
    @XmlElement(name = "Pht", required = true)
    protected byte[] pht;
    @XmlElement(name = "Prn", required = true)
    protected PrnType prn;
    @XmlAttribute(name = "uid")
    protected String uid;

    /**
     * Gets the value of the poi property.
     * 
     * @return
     *     possible object is
     *     {@link PoiType }
     *     
     */
    public PoiType getPoi() {
        return poi;
    }

    /**
     * Sets the value of the poi property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoiType }
     *     
     */
    public void setPoi(PoiType value) {
        this.poi = value;
    }

    /**
     * Gets the value of the poa property.
     * 
     * @return
     *     possible object is
     *     {@link PoaType }
     *     
     */
    public PoaType getPoa() {
        return poa;
    }

    /**
     * Sets the value of the poa property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoaType }
     *     
     */
    public void setPoa(PoaType value) {
        this.poa = value;
    }

    /**
     * Gets the value of the lData property.
     * 
     * @return
     *     possible object is
     *     {@link LDataType }
     *     
     */
    public LDataType getLData() {
        return lData;
    }

    /**
     * Sets the value of the lData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LDataType }
     *     
     */
    public void setLData(LDataType value) {
        this.lData = value;
    }

    /**
     * Gets the value of the pht property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPht() {
        return pht;
    }

    /**
     * Sets the value of the pht property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPht(byte[] value) {
        this.pht = value;
    }

    /**
     * Gets the value of the prn property.
     * 
     * @return
     *     possible object is
     *     {@link PrnType }
     *     
     */
    public PrnType getPrn() {
        return prn;
    }

    /**
     * Sets the value of the prn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrnType }
     *     
     */
    public void setPrn(PrnType value) {
        this.prn = value;
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

}
