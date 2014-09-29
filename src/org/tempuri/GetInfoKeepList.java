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
 *         &lt;element name="classid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pages" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pageNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "uid", "classid", "pages", "pageNum" })
@XmlRootElement(name = "GetInfoKeepList")
public class GetInfoKeepList {

	protected String uid;
	protected String classid;
	protected String pages;
	protected String pageNum;

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
	 * Gets the value of the pages property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPages() {
		return pages;
	}

	/**
	 * Sets the value of the pages property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPages(String value) {
		this.pages = value;
	}

	/**
	 * Gets the value of the pageNum property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPageNum() {
		return pageNum;
	}

	/**
	 * Sets the value of the pageNum property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPageNum(String value) {
		this.pageNum = value;
	}

}
