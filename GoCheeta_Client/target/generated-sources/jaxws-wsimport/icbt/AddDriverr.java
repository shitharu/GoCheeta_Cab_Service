
package icbt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addDriverr complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addDriverr">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dvr" type="{http://icbt/}driverr" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addDriverr", propOrder = {
    "dvr"
})
public class AddDriverr {

    protected Driverr dvr;

    /**
     * Gets the value of the dvr property.
     * 
     * @return
     *     possible object is
     *     {@link Driverr }
     *     
     */
    public Driverr getDvr() {
        return dvr;
    }

    /**
     * Sets the value of the dvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Driverr }
     *     
     */
    public void setDvr(Driverr value) {
        this.dvr = value;
    }

}
