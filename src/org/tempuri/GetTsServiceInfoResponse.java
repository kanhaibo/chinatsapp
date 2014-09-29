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
 *         &lt;element name="GetTsServiceInfoResult" type="{http://tempuri.org/}Info" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "getTsServiceInfoResult" })
@XmlRootElement(name = "GetTsServiceInfoResponse")
public class GetTsServiceInfoResponse {

	@XmlElement(name = "GetTsServiceInfoResult")
	protected Info getTsServiceInfoResult;

	/**
	 * Gets the value of the getTsServiceInfoResult property.
	 * 
	 * @return possible object is {@link Info }
	 * 
	 */
	public Info getGetTsServiceInfoResult() {
		return getTsServiceInfoResult;
	}

	/**
	 * Sets the value of the getTsServiceInfoResult property.
	 * 
	 * @param value
	 *            allowed object is {@link Info }
	 * 
	 */
	public void setGetTsServiceInfoResult(Info value) {
		this.getTsServiceInfoResult = value;
	}

}
