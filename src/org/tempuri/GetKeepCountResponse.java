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
 *         &lt;element name="GetKeepCountResult" type="{http://tempuri.org/}KeepCount" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "getKeepCountResult" })
@XmlRootElement(name = "GetKeepCountResponse")
public class GetKeepCountResponse {

	@XmlElement(name = "GetKeepCountResult")
	protected KeepCount getKeepCountResult;

	/**
	 * Gets the value of the getKeepCountResult property.
	 * 
	 * @return possible object is {@link KeepCount }
	 * 
	 */
	public KeepCount getGetKeepCountResult() {
		return getKeepCountResult;
	}

	/**
	 * Sets the value of the getKeepCountResult property.
	 * 
	 * @param value
	 *            allowed object is {@link KeepCount }
	 * 
	 */
	public void setGetKeepCountResult(KeepCount value) {
		this.getKeepCountResult = value;
	}

}
