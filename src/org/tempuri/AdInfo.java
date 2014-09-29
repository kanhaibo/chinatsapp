package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for AdInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="AdInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="classname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imgpath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkpath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdInfo", propOrder = { "classid", "classname", "imgpath",
		"title", "linkpath", "info", "endtime" })
public class AdInfo {

	protected String classid;
	protected String classname;
	protected String imgpath;
	protected String title;
	protected String linkpath;
	protected String info;
	protected String endtime;

	/**
	 * Gets the value of the classid property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getClassid() {
		return classid;
	}

	/**
	 * Sets the value of the classid property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setClassid(String value) {
		this.classid = value;
	}

	/**
	 * Gets the value of the classname property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getClassname() {
		return classname;
	}

	/**
	 * Sets the value of the classname property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setClassname(String value) {
		this.classname = value;
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
	 * Gets the value of the linkpath property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLinkpath() {
		return linkpath;
	}

	/**
	 * Sets the value of the linkpath property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLinkpath(String value) {
		this.linkpath = value;
	}

	/**
	 * Gets the value of the info property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInfo() {
		return info;
	}

	/**
	 * Sets the value of the info property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInfo(String value) {
		this.info = value;
	}

	/**
	 * Gets the value of the endtime property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEndtime() {
		return endtime;
	}

	/**
	 * Sets the value of the endtime property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEndtime(String value) {
		this.endtime = value;
	}

}
