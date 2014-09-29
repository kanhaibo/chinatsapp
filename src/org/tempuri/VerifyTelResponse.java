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
 *         &lt;element name="VerifyTelResult" type="{http://tempuri.org/}CMD" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "verifyTelResult" })
@XmlRootElement(name = "VerifyTelResponse")
public class VerifyTelResponse {

	@XmlElement(name = "VerifyTelResult")
	protected CMD verifyTelResult;

	/**
	 * Gets the value of the verifyTelResult property.
	 * 
	 * @return possible object is {@link CMD }
	 * 
	 */
	public CMD getVerifyTelResult() {
		return verifyTelResult;
	}

	/**
	 * Sets the value of the verifyTelResult property.
	 * 
	 * @param value
	 *            allowed object is {@link CMD }
	 * 
	 */
	public void setVerifyTelResult(CMD value) {
		this.verifyTelResult = value;
	}

}
