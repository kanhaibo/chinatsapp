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
 *         &lt;element name="EditUserResult" type="{http://tempuri.org/}CM" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "editUserResult" })
@XmlRootElement(name = "EditUserResponse")
public class EditUserResponse {

	@XmlElement(name = "EditUserResult")
	protected CM editUserResult;

	/**
	 * Gets the value of the editUserResult property.
	 * 
	 * @return possible object is {@link CM }
	 * 
	 */
	public CM getEditUserResult() {
		return editUserResult;
	}

	/**
	 * Sets the value of the editUserResult property.
	 * 
	 * @param value
	 *            allowed object is {@link CM }
	 * 
	 */
	public void setEditUserResult(CM value) {
		this.editUserResult = value;
	}

}
