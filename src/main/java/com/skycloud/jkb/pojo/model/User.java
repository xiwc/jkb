/**
 * User.java
 */
package com.skycloud.jkb.pojo.model;

import java.io.Serializable;

import com.skycloud.jkb.pojo.entity.Users;

/**
 * 
 * 
 * @creation 2013年12月25日 下午5:24:56
 * @modification 2013年12月25日 下午5:24:56
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
public class User extends Users implements Serializable {

	/** serialVersionUID [long] */
	private static final long serialVersionUID = 2068620122878310613L;

	/** email [String] E-mail */
	private String email;
	/** phoneNumber [String] 手机号 */
	private String phoneNumber;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
