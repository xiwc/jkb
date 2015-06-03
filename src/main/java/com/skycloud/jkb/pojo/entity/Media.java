package com.skycloud.jkb.pojo.entity;

// Generated 2013-12-31 14:44:24 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Media generated by hbm2java
 */
@Entity
@Table(name = "media", catalog = "skycloud")
public class Media implements java.io.Serializable {

	private long mediaid;
	private Users users;
	private MediaType mediaType;
	private String sendto;
	private int active;
	private int severity;
	private String period;

	public Media() {
	}

	public Media(long mediaid, Users users, MediaType mediaType, String sendto, int active, int severity, String period) {
		this.mediaid = mediaid;
		this.users = users;
		this.mediaType = mediaType;
		this.sendto = sendto;
		this.active = active;
		this.severity = severity;
		this.period = period;
	}

	@Id
	@Column(name = "mediaid", unique = true, nullable = false)
	public long getMediaid() {
		return this.mediaid;
	}

	public void setMediaid(long mediaid) {
		this.mediaid = mediaid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userid", nullable = false)
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mediatypeid", nullable = false)
	public MediaType getMediaType() {
		return this.mediaType;
	}

	public void setMediaType(MediaType mediaType) {
		this.mediaType = mediaType;
	}

	@Column(name = "sendto", nullable = false, length = 100)
	public String getSendto() {
		return this.sendto;
	}

	public void setSendto(String sendto) {
		this.sendto = sendto;
	}

	@Column(name = "active", nullable = false)
	public int getActive() {
		return this.active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	@Column(name = "severity", nullable = false)
	public int getSeverity() {
		return this.severity;
	}

	public void setSeverity(int severity) {
		this.severity = severity;
	}

	@Column(name = "period", nullable = false, length = 100)
	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

}