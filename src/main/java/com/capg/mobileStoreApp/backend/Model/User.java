package com.capg.mobileStoreApp.backend.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	
	@Column(name = "UserName")
	private String userName;
	
	@Column(name = "Password")
	private String userPassword;
	
	@Column(name = "Phone Number")
	private Integer userNumber;
	
	@Column(name = "Email Id")
	private String emailId;
	
	private String userRole;
	
	public User() {
		super();
	}

	public User(String userName, String userPassword, Integer userNumber, String emailId, String userRole) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
		this.userNumber = userNumber;
		this.emailId = emailId;
		this.userRole = userRole;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Integer getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(Integer userNumber) {
		this.userNumber = userNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	
}