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
 *         &lt;element name="CancelKeepResult" type="{http://tempuri.org/}CM" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "cancelKeepResult" })
@XmlRootElement(name = "CancelKeepResponse")
public class CancelKeepResponse {

	@XmlElement(name = "CancelKeepResult")
	protected CM cancelKeepResult;

	/**
	 * Gets the value of the cancelKeepResult property.
	 * 
	 * @return possible object is {@link CM }
	 * 
	 */
	public CM getCancelKeepResult() {
		return cancelKeepResult;
	}

	/**
	 * Sets the value of the cancelKeepResult property.
	 * 
	 * @param value
	 *            allowed object is {@link CM }
	 * 
	 */
	public void setCancelKeepResult(CM value) {
		this.cancelKeepResult = value;
	}

}
