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
 *         &lt;element name="GetSteelKeepListResult" type="{http://tempuri.org/}dxmsglist" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "getSteelKeepListResult" })
@XmlRootElement(name = "GetSteelKeepListResponse")
public class GetSteelKeepListResponse {

	@XmlElement(name = "GetSteelKeepListResult")
	protected Dxmsglist getSteelKeepListResult;

	/**
	 * Gets the value of the getSteelKeepListResult property.
	 * 
	 * @return possible object is {@link Dxmsglist }
	 * 
	 */
	public Dxmsglist getGetSteelKeepListResult() {
		return getSteelKeepListResult;
	}

	/**
	 * Sets the value of the getSteelKeepListResult property.
	 * 
	 * @param value
	 *            allowed object is {@link Dxmsglist }
	 * 
	 */
	public void setGetSteelKeepListResult(Dxmsglist value) {
		this.getSteelKeepListResult = value;
	}

}
