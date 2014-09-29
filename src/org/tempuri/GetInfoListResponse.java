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
 *         &lt;element name="GetInfoListResult" type="{http://tempuri.org/}InfoList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "getInfoListResult" })
@XmlRootElement(name = "GetInfoListResponse")
public class GetInfoListResponse {

	@XmlElement(name = "GetInfoListResult")
	protected InfoList getInfoListResult;

	/**
	 * Gets the value of the getInfoListResult property.
	 * 
	 * @return possible object is {@link InfoList }
	 * 
	 */
	public InfoList getGetInfoListResult() {
		return getInfoListResult;
	}

	/**
	 * Sets the value of the getInfoListResult property.
	 * 
	 * @param value
	 *            allowed object is {@link InfoList }
	 * 
	 */
	public void setGetInfoListResult(InfoList value) {
		this.getInfoListResult = value;
	}

}
