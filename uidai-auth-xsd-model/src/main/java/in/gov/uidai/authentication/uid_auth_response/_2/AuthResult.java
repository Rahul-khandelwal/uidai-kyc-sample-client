//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.02 at 12:49:59 PM IST 
//


package in.gov.uidai.authentication.uid_auth_response._2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthResult.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthResult"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="y"/&gt;
 *     &lt;enumeration value="n"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AuthResult")
@XmlEnum
public enum AuthResult {

    @XmlEnumValue("y")
    Y("y"),
    @XmlEnumValue("n")
    N("n");
    private final String value;

    AuthResult(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthResult fromValue(String v) {
        for (AuthResult c: AuthResult.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
