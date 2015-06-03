package com.skycloud.api.domain.base;

public class User {

	private String userid;
	private String alias;
	private String attempt_clock;
	private Integer attempt_failed;
	private String attempt_ip;
	private Integer autologin;
	private Integer autologout;
	private String lang;
	private String name;
	private Integer refresh;
	private Integer rows_per_page;
	private String surname;
	private String theme;
	private Integer type;
	private String url;

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserid() {
		return userid;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getAlias() {
		return alias;
	}

	public void setAttempt_clock(String attempt_clock) {
		this.attempt_clock = attempt_clock;
	}

	public String getAttempt_clock() {
		return attempt_clock;
	}

	public void setAttempt_failed(Integer attempt_failed) {
		this.attempt_failed = attempt_failed;
	}

	public Integer getAttempt_failed() {
		return attempt_failed;
	}

	public void setAttempt_ip(String attempt_ip) {
		this.attempt_ip = attempt_ip;
	}

	public String getAttempt_ip() {
		return attempt_ip;
	}

	public void setAutologin(Integer autologin) {
		this.autologin = autologin;
	}

	public Integer getAutologin() {
		return autologin;
	}

	public void setAutologout(Integer autologout) {
		this.autologout = autologout;
	}

	public Integer getAutologout() {
		return autologout;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getLang() {
		return lang;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setRefresh(Integer refresh) {
		this.refresh = refresh;
	}

	public Integer getRefresh() {
		return refresh;
	}

	public void setRows_per_page(Integer rows_per_page) {
		this.rows_per_page = rows_per_page;
	}

	public Integer getRows_per_page() {
		return rows_per_page;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSurname() {
		return surname;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getTheme() {
		return theme;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getType() {
		return type;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}
}
