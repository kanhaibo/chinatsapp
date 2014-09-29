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
 *         &lt;element name="GetSteelMsgDzClassResult" type="{http://tempuri.org/}CMD" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "getSteelMsgDzClassResult" })
@XmlRootElement(name = "GetSteelMsgDzClassResponse")
public class GetSteelMsgDzClassResponse {

	@XmlElement(name = "GetSteelMsgDzClassResult")
	protected CMD getSteelMsgDzClassResult;

	/**
	 * Gets the value of the getSteelMsgDzClassResult property.
	 * 
	 * @return possible object is {@link CMD }
	 * 
	 */
	public CMD getGetSteelMsgDzClassResult() {
		return getSteelMsgDzClassResult;
	}

	/**
	 * Sets the value of the getSteelMsgDzClassResult property.
	 * 
	 * @param value
	 *            allowed object is {@link CMD }
	 * 
	 */
	public void setGetSteelMsgDzClassResult(CMD value) {
		this.getSteelMsgDzClassResult = value;
	}

}
