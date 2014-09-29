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
 *         &lt;element name="GetAd1Result" type="{http://tempuri.org/}Adlist" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "getAd1Result" })
@XmlRootElement(name = "GetAd1Response")
public class GetAd1Response {

	@XmlElement(name = "GetAd1Result")
	protected Adlist getAd1Result;

	/**
	 * Gets the value of the getAd1Result property.
	 * 
	 * @return possible object is {@link Adlist }
	 * 
	 */
	public Adlist getGetAd1Result() {
		return getAd1Result;
	}

	/**
	 * Sets the value of the getAd1Result property.
	 * 
	 * @param value
	 *            allowed object is {@link Adlist }
	 * 
	 */
	public void setGetAd1Result(Adlist value) {
		this.getAd1Result = value;
	}

}
