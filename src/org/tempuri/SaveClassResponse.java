package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SaveClassResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "saveClassResult" })
@XmlRootElement(name = "SaveClassResponse")
public class SaveClassResponse {

	@XmlElement(name = "SaveClassResult")
	protected String saveClassResult;

	/**
	 * Gets the value of the saveClassResult property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSaveClassResult() {
		return saveClassResult;
	}

	/**
	 * Sets the value of the saveClassResult property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSaveClassResult(String value) {
		this.saveClassResult = value;
	}

}
