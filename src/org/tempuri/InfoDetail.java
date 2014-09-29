package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for InfoDetail complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="InfoDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imgpath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="replynum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoDetail", propOrder = { "id", "title", "content",
		"datetime", "imgpath", "replynum", "flag" })
public class InfoDetail {

	protected String id;
	protected String title;
	protected String content;
	protected String datetime;
	protected String imgpath;
	protected String replynum;
	protected String flag;

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setId(String value) {
		this.id = value;
	}

	/**
	 * Gets the value of the title property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the value of the title property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTitle(String value) {
		this.title = value;
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

	/**
	 * Gets the value of the datetime property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDatetime() {
		return datetime;
	}

	/**
	 * Sets the value of the datetime property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDatetime(String value) {
		this.datetime = value;
	}

	/**
	 * Gets the value of the imgpath property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getImgpath() {
		return imgpath;
	}

	/**
	 * Sets the value of the imgpath property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setImgpath(String value) {
		this.imgpath = value;
	}

	/**
	 * Gets the value of the replynum property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReplynum() {
		return replynum;
	}

	/**
	 * Sets the value of the replynum property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setReplynum(String value) {
		this.replynum = value;
	}

	/**
	 * Gets the value of the flag property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFlag() {
		return flag;
	}

	/**
	 * Sets the value of the flag property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFlag(String value) {
		this.flag = value;
	}

}
