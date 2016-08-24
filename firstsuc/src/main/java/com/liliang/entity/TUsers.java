package com.liliang.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TUsers entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_users", catalog = "fb_database")
public class TUsers implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String userName;
	private String password;

	// Constructors

	/** default constructor */
	public TUsers() {
	}

	/** full constructor */
	public TUsers(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "user_id", unique = true, nullable = false)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "user_name")
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "password")
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}