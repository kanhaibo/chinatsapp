package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for PzInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="PzInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pz_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PzInfo", propOrder = { "pz", "pzId", "flag" })
public class PzInfo {

	protected String pz;
	@XmlElement(name = "pz_id")
	protected String pzId;
	protected String flag;

	/**
	 * Gets the value of the pz property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPz() {
		return pz;
	}

	/**
	 * Sets the value of the pz property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPz(String value) {
		this.pz = value;
	}

	/**
	 * Gets the value of the pzId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPzId() {
		return pzId;
	}

	/**
	 * Sets the value of the pzId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPzId(String value) {
		this.pzId = value;
	}

	/**
	 * Gets the value of the flag property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFlag() {
		return flag;
	}

	/**
	 * Sets the value of the flag property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFlag(String value) {
		this.flag = value;
	}

}
