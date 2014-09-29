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
 *         &lt;element name="GetTsServiceThumbPicResult" type="{http://tempuri.org/}InfoPic" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "getTsServiceThumbPicResult" })
@XmlRootElement(name = "GetTsServiceThumbPicResponse")
public class GetTsServiceThumbPicResponse {

	@XmlElement(name = "GetTsServiceThumbPicResult")
	protected InfoPic getTsServiceThumbPicResult;

	/**
	 * Gets the value of the getTsServiceThumbPicResult property.
	 * 
	 * @return possible object is {@link InfoPic }
	 * 
	 */
	public InfoPic getGetTsServiceThumbPicResult() {
		return getTsServiceThumbPicResult;
	}

	/**
	 * Sets the value of the getTsServiceThumbPicResult property.
	 * 
	 * @param value
	 *            allowed object is {@link InfoPic }
	 * 
	 */
	public void setGetTsServiceThumbPicResult(InfoPic value) {
		this.getTsServiceThumbPicResult = value;
	}

}
