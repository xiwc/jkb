package com.skycloud.jkb.pojo.entity;

// Generated 2013-12-31 14:44:24 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Httptest generated by hbm2java
 */
@Entity
@Table(name = "httptest", catalog = "skycloud")
public class Httptest implements java.io.Serializable {

	private long httptestid;
	private Applications applications;
	private String name;
	private int nextcheck;
	private int delay;
	private int status;
	private String macros;
	private String agent;
	private int authentication;
	private String httpUser;
	private String httpPassword;
	private Set<Httpstep> httpsteps = new HashSet<Httpstep>(0);
	private Set<Httptestitem> httptestitems = new HashSet<Httptestitem>(0);

	public Httptest() {
	}

	public Httptest(long httptestid, Applications applications, String name, int nextcheck, int delay, int status,
			String macros, String agent, int authentication, String httpUser, String httpPassword) {
		this.httptestid = httptestid;
		this.applications = applications;
		this.name = name;
		this.nextcheck = nextcheck;
		this.delay = delay;
		this.status = status;
		this.macros = macros;
		this.agent = agent;
		this.authentication = authentication;
		this.httpUser = httpUser;
		this.httpPassword = httpPassword;
	}

	public Httptest(long httptestid, Applications applications, String name, int nextcheck, int delay, int status,
			String macros, String agent, int authentication, String httpUser, String httpPassword,
			Set<Httpstep> httpsteps, Set<Httptestitem> httptestitems) {
		this.httptestid = httptestid;
		this.applications = applications;
		this.name = name;
		this.nextcheck = nextcheck;
		this.delay = delay;
		this.status = status;
		this.macros = macros;
		this.agent = agent;
		this.authentication = authentication;
		this.httpUser = httpUser;
		this.httpPassword = httpPassword;
		this.httpsteps = httpsteps;
		this.httptestitems = httptestitems;
	}

	@Id
	@Column(name = "httptestid", unique = true, nullable = false)
	public long getHttptestid() {
		return this.httptestid;
	}

	public void setHttptestid(long httptestid) {
		this.httptestid = httptestid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "applicationid", nullable = false)
	public Applications getApplications() {
		return this.applications;
	}

	public void setApplications(Applications applications) {
		this.applications = applications;
	}

	@Column(name = "name", nullable = false, length = 64)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "nextcheck", nullable = false)
	public int getNextcheck() {
		return this.nextcheck;
	}

	public void setNextcheck(int nextcheck) {
		this.nextcheck = nextcheck;
	}

	@Column(name = "delay", nullable = false)
	public int getDelay() {
		return this.delay;
	}

	public void setDelay(int delay) {
		this.delay = delay;
	}

	@Column(name = "status", nullable = false)
	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Column(name = "macros", nullable = false, length = 65535)
	public String getMacros() {
		return this.macros;
	}

	public void setMacros(String macros) {
		this.macros = macros;
	}

	@Column(name = "agent", nullable = false)
	public String getAgent() {
		return this.agent;
	}

	public void setAgent(String agent) {
		this.agent = agent;
	}

	@Column(name = "authentication", nullable = false)
	public int getAuthentication() {
		return this.authentication;
	}

	public void setAuthentication(int authentication) {
		this.authentication = authentication;
	}

	@Column(name = "http_user", nullable = false, length = 64)
	public String getHttpUser() {
		return this.httpUser;
	}

	public void setHttpUser(String httpUser) {
		this.httpUser = httpUser;
	}

	@Column(name = "http_password", nullable = false, length = 64)
	public String getHttpPassword() {
		return this.httpPassword;
	}

	public void setHttpPassword(String httpPassword) {
		this.httpPassword = httpPassword;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "httptest")
	public Set<Httpstep> getHttpsteps() {
		return this.httpsteps;
	}

	public void setHttpsteps(Set<Httpstep> httpsteps) {
		this.httpsteps = httpsteps;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "httptest")
	public Set<Httptestitem> getHttptestitems() {
		return this.httptestitems;
	}

	public void setHttptestitems(Set<Httptestitem> httptestitems) {
		this.httptestitems = httptestitems;
	}

}