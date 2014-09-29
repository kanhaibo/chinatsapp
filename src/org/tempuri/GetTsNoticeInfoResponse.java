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
 *         &lt;element name="GetTsNoticeInfoResult" type="{http://tempuri.org/}Info" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "getTsNoticeInfoResult" })
@XmlRootElement(name = "GetTsNoticeInfoResponse")
public class GetTsNoticeInfoResponse {

	@XmlElement(name = "GetTsNoticeInfoResult")
	protected Info getTsNoticeInfoResult;

	/**
	 * Gets the value of the getTsNoticeInfoResult property.
	 * 
	 * @return possible object is {@link Info }
	 * 
	 */
	public Info getGetTsNoticeInfoResult() {
		return getTsNoticeInfoResult;
	}

	/**
	 * Sets the value of the getTsNoticeInfoResult property.
	 * 
	 * @param value
	 *            allowed object is {@link Info }
	 * 
	 */
	public void setGetTsNoticeInfoResult(Info value) {
		this.getTsNoticeInfoResult = value;
	}

}
