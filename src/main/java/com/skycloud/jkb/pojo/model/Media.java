/**
 * Media.java
 */
package com.skycloud.jkb.pojo.model;

import java.io.Serializable;

/**
 * 告警媒介请求参数.
 * 
 * @creation 2014年01月02日 02:38:05
 * @modification 2014年01月02日 02:38:05
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
public class Media extends com.skycloud.api.domain.base.Media implements Serializable {
	/** serialVersionUID [long] */
	private static final long serialVersionUID = -224062730256906033L;
	/** alias [String] 用户ID */
	private String alias;
	/** email [String] E-mail */
	private String email;
	/** phoneNumber [String] 手机号 */
	private String phoneNumber;

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

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
