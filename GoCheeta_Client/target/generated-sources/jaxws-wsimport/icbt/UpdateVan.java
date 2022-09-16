
package icbt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateVan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateVan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="van" type="{http://icbt/}van" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateVan", propOrder = {
    "van"
})
public class UpdateVan {

    protected Van van;

    /**
     * Gets the value of the van property.
     * 
     * @return
     *     possible object is
     *     {@link Van }
     *     
     */
    public Van getVan() {
        return van;
    }

    /**
     * Sets the value of the van property.
     * 
     * @param value
     *     allowed object is
     *     {@link Van }
     *     
     */
    public void setVan(Van value) {
        this.van = value;
    }

}
