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
 *         &lt;element name="GetClass1Result" type="{http://tempuri.org/}dxPzInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "getClass1Result" })
@XmlRootElement(name = "GetClass1Response")
public class GetClass1Response {

	@XmlElement(name = "GetClass1Result")
	protected DxPzInfo getClass1Result;

	/**
	 * Gets the value of the getClass1Result property.
	 * 
	 * @return possible object is {@link DxPzInfo }
	 * 
	 */
	public DxPzInfo getGetClass1Result() {
		return getClass1Result;
	}

	/**
	 * Sets the value of the getClass1Result property.
	 * 
	 * @param value
	 *            allowed object is {@link DxPzInfo }
	 * 
	 */
	public void setGetClass1Result(DxPzInfo value) {
		this.getClass1Result = value;
	}

}
