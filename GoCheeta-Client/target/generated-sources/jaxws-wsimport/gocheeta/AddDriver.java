
package gocheeta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addDriver complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addDriver">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dv" type="{http://GoCheeta/}driver" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addDriver", propOrder = {
    "dv"
})
public class AddDriver {

    protected Driver dv;

    /**
     * Gets the value of the dv property.
     * 
     * @return
     *     possible object is
     *     {@link Driver }
     *     
     */
    public Driver getDv() {
        return dv;
    }

    /**
     * Sets the value of the dv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Driver }
     *     
     */
    public void setDv(Driver value) {
        this.dv = value;
    }

}
