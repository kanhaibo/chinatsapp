package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for dxmsgInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="dxmsgInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="msgid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msginfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datetime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "dxmsgInfo", propOrder = { "msgid", "msginfo", "datetime",
		"replynum", "flag" })
public class DxmsgInfo {

	protected String msgid;
	protected String msginfo;
	protected String datetime;
	protected String replynum;
	protected String flag;

	/**
	 * Gets the value of the msgid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMsgid() {
		return msgid;
	}

	/**
	 * Sets the value of the msgid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMsgid(String value) {
		this.msgid = value;
	}

	/**
	 * Gets the value of the msginfo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMsginfo() {
		return msginfo;
	}

	/**
	 * Sets the value of the msginfo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMsginfo(String value) {
		this.msginfo = value;
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
