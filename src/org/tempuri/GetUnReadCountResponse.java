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
 *         &lt;element name="GetUnReadCountResult" type="{http://tempuri.org/}UnReadNumList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "getUnReadCountResult" })
@XmlRootElement(name = "GetUnReadCountResponse")
public class GetUnReadCountResponse {

	@XmlElement(name = "GetUnReadCountResult")
	protected UnReadNumList getUnReadCountResult;

	/**
	 * Gets the value of the getUnReadCountResult property.
	 * 
	 * @return possible object is {@link UnReadNumList }
	 * 
	 */
	public UnReadNumList getGetUnReadCountResult() {
		return getUnReadCountResult;
	}

	/**
	 * Sets the value of the getUnReadCountResult property.
	 * 
	 * @param value
	 *            allowed object is {@link UnReadNumList }
	 * 
	 */
	public void setGetUnReadCountResult(UnReadNumList value) {
		this.getUnReadCountResult = value;
	}

}
