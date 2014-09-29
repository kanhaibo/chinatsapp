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
 *         &lt;element name="RegistResult" type="{http://tempuri.org/}LoginUser" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "registResult" })
@XmlRootElement(name = "RegistResponse")
public class RegistResponse {

	@XmlElement(name = "RegistResult")
	protected LoginUser registResult;

	/**
	 * Gets the value of the registResult property.
	 * 
	 * @return possible object is {@link LoginUser }
	 * 
	 */
	public LoginUser getRegistResult() {
		return registResult;
	}

	/**
	 * Sets the value of the registResult property.
	 * 
	 * @param value
	 *            allowed object is {@link LoginUser }
	 * 
	 */
	public void setRegistResult(LoginUser value) {
		this.registResult = value;
	}

}
