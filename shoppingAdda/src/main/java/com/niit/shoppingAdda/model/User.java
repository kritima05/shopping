package com.niit.shoppingAdda.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User implements Serializable {
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="PH_NUMBER")
	private Long phone;
	
	@Column(name="EMAIL_ID")
	private String emailId;
	
	@Column(name="GENDER")
	private String genDer;
	
	@Column(name="ADDRESS")
	private String addRess;

	public User(){}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the phNumber
	 */
	public Long getPhNumber() {
		return phone;
	}

	/**
	 * @param phNumber the phNumber to set
	 */
	public void setPhNumber(Long phone) {
		this.phone = phone;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the genDer
	 */
	public String getGenDer() {
		return genDer;
	}

	/**
	 * @param genDer the genDer to set
	 */
	public void setGenDer(String genDer) {
		this.genDer = genDer;
	}

	/**
	 * @return the addRess
	 */
	public String getAddRess() {
		return addRess;
	}

	/**
	 * @param addRess the addRess to set
	 */
	public void setAddRess(String addRess) {
		this.addRess = addRess;
	}
	
	
}
