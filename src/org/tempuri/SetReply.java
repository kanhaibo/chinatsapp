package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="infoid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "uid", "typeid", "infoid", "content" })
@XmlRootElement(name = "SetReply")
public class SetReply {

	protected String uid;
	protected String typeid;
	protected String infoid;
	protected String content;

	/**
	 * Gets the value of the uid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUid() {
		return uid;
	}

	/**
	 * Sets the value of the uid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUid(String value) {
		this.uid = value;
	}

	/**
	 * Gets the value of the typeid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTypeid() {
		return typeid;
	}

	/**
	 * Sets the value of the typeid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTypeid(String value) {
		this.typeid = value;
	}

	/**
	 * Gets the value of the infoid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInfoid() {
		return infoid;
	}

	/**
	 * Sets the value of the infoid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInfoid(String value) {
		this.infoid = value;
	}

	/**
	 * Gets the value of the content property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getContent() {
		return content;
	}

	/**
	 * Sets the value of the content property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setContent(String value) {
		this.content = value;
	}

}
