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
 *         &lt;element name="ChangPwdResult" type="{http://tempuri.org/}CM" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "changPwdResult" })
@XmlRootElement(name = "ChangPwdResponse")
public class ChangPwdResponse {

	@XmlElement(name = "ChangPwdResult")
	protected CM changPwdResult;

	/**
	 * Gets the value of the changPwdResult property.
	 * 
	 * @return possible object is {@link CM }
	 * 
	 */
	public CM getChangPwdResult() {
		return changPwdResult;
	}

	/**
	 * Sets the value of the changPwdResult property.
	 * 
	 * @param value
	 *            allowed object is {@link CM }
	 * 
	 */
	public void setChangPwdResult(CM value) {
		this.changPwdResult = value;
	}

}
