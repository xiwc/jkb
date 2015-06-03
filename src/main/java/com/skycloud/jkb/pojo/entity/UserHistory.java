package com.skycloud.jkb.pojo.entity;

// Generated 2013-12-31 14:44:24 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * UserHistory generated by hbm2java
 */
@Entity
@Table(name = "user_history", catalog = "skycloud", uniqueConstraints = @UniqueConstraint(columnNames = "userid"))
public class UserHistory implements java.io.Serializable {

	private long userhistoryid;
	private Users users;
	private String title1;
	private String url1;
	private String title2;
	private String url2;
	private String title3;
	private String url3;
	private String title4;
	private String url4;
	private String title5;
	private String url5;

	public UserHistory() {
	}

	public UserHistory(long userhistoryid, Users users, String title1, String url1, String title2, String url2,
			String title3, String url3, String title4, String url4, String title5, String url5) {
		this.userhistoryid = userhistoryid;
		this.users = users;
		this.title1 = title1;
		this.url1 = url1;
		this.title2 = title2;
		this.url2 = url2;
		this.title3 = title3;
		this.url3 = url3;
		this.title4 = title4;
		this.url4 = url4;
		this.title5 = title5;
		this.url5 = url5;
	}

	@Id
	@Column(name = "userhistoryid", unique = true, nullable = false)
	public long getUserhistoryid() {
		return this.userhistoryid;
	}

	public void setUserhistoryid(long userhistoryid) {
		this.userhistoryid = userhistoryid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userid", unique = true, nullable = false)
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Column(name = "title1", nullable = false)
	public String getTitle1() {
		return this.title1;
	}

	public void setTitle1(String title1) {
		this.title1 = title1;
	}

	@Column(name = "url1", nullable = false)
	public String getUrl1() {
		return this.url1;
	}

	public void setUrl1(String url1) {
		this.url1 = url1;
	}

	@Column(name = "title2", nullable = false)
	public String getTitle2() {
		return this.title2;
	}

	public void setTitle2(String title2) {
		this.title2 = title2;
	}

	@Column(name = "url2", nullable = false)
	public String getUrl2() {
		return this.url2;
	}

	public void setUrl2(String url2) {
		this.url2 = url2;
	}

	@Column(name = "title3", nullable = false)
	public String getTitle3() {
		return this.title3;
	}

	public void setTitle3(String title3) {
		this.title3 = title3;
	}

	@Column(name = "url3", nullable = false)
	public String getUrl3() {
		return this.url3;
	}

	public void setUrl3(String url3) {
		this.url3 = url3;
	}

	@Column(name = "title4", nullable = false)
	public String getTitle4() {
		return this.title4;
	}

	public void setTitle4(String title4) {
		this.title4 = title4;
	}

	@Column(name = "url4", nullable = false)
	public String getUrl4() {
		return this.url4;
	}

	public void setUrl4(String url4) {
		this.url4 = url4;
	}

	@Column(name = "title5", nullable = false)
	public String getTitle5() {
		return this.title5;
	}

	public void setTitle5(String title5) {
		this.title5 = title5;
	}

	@Column(name = "url5", nullable = false)
	public String getUrl5() {
		return this.url5;
	}

	public void setUrl5(String url5) {
		this.url5 = url5;
	}

}