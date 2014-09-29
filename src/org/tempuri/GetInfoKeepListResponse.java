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
 *         &lt;element name="GetInfoKeepListResult" type="{http://tempuri.org/}InfoList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "getInfoKeepListResult" })
@XmlRootElement(name = "GetInfoKeepListResponse")
public class GetInfoKeepListResponse {

	@XmlElement(name = "GetInfoKeepListResult")
	protected InfoList getInfoKeepListResult;

	/**
	 * Gets the value of the getInfoKeepListResult property.
	 * 
	 * @return possible object is {@link InfoList }
	 * 
	 */
	public InfoList getGetInfoKeepListResult() {
		return getInfoKeepListResult;
	}

	/**
	 * Sets the value of the getInfoKeepListResult property.
	 * 
	 * @param value
	 *            allowed object is {@link InfoList }
	 * 
	 */
	public void setGetInfoKeepListResult(InfoList value) {
		this.getInfoKeepListResult = value;
	}

}
