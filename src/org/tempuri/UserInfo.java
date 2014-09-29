package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for UserInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="UserInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthday" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="corporation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="profession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="days" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserInfo", propOrder = { "username", "birthday", "sex",
		"mobile", "corporation", "profession", "email", "zt", "days", "qx" })
public class UserInfo {

	protected String username;
	protected String birthday;
	protected String sex;
	protected String mobile;
	protected String corporation;
	protected String profession;
	protected String email;
	protected String zt;
	protected String days;
	protected String qx;

	/**
	 * Gets the value of the username property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Sets the value of the username property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUsername(String value) {
		this.username = value;
	}

	/**
	 * Gets the value of the birthday property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBirthday() {
		return birthday;
	}

	/**
	 * Sets the value of the birthday property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBirthday(String value) {
		this.birthday = value;
	}

	/**
	 * Gets the value of the sex property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * Sets the value of the sex property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSex(String value) {
		this.sex = value;
	}

	/**
	 * Gets the value of the mobile property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * Sets the value of the mobile property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMobile(String value) {
		this.mobile = value;
	}

	/**
	 * Gets the value of the corporation property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCorporation() {
		return corporation;
	}

	/**
	 * Sets the value of the corporation property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCorporation(String value) {
		this.corporation = value;
	}

	/**
	 * Gets the value of the profession property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProfession() {
		return profession;
	}

	/**
	 * Sets the value of the profession property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProfession(String value) {
		this.profession = value;
	}

	/**
	 * Gets the value of the email property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the value of the email property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEmail(String value) {
		this.email = value;
	}

	/**
	 * Gets the value of the zt property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getZt() {
		return zt;
	}

	/**
	 * Sets the value of the zt property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setZt(String value) {
		this.zt = value;
	}

	/**
	 * Gets the value of the days property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDays() {
		return days;
	}

	/**
	 * Sets the value of the days property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDays(String value) {
		this.days = value;
	}

	/**
	 * Gets the value of the qx property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getQx() {
		return qx;
	}

	/**
	 * Sets the value of the qx property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setQx(String value) {
		this.qx = value;
	}

}
