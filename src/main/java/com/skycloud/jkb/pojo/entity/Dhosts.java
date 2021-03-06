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
 * Dhosts generated by hbm2java
 */
@Entity
@Table(name = "dhosts", catalog = "skycloud")
public class Dhosts implements java.io.Serializable {

	private long dhostid;
	private Drules drules;
	private int status;
	private int lastup;
	private int lastdown;
	private Set<Dservices> dserviceses = new HashSet<Dservices>(0);

	public Dhosts() {
	}

	public Dhosts(long dhostid, Drules drules, int status, int lastup, int lastdown) {
		this.dhostid = dhostid;
		this.drules = drules;
		this.status = status;
		this.lastup = lastup;
		this.lastdown = lastdown;
	}

	public Dhosts(long dhostid, Drules drules, int status, int lastup, int lastdown, Set<Dservices> dserviceses) {
		this.dhostid = dhostid;
		this.drules = drules;
		this.status = status;
		this.lastup = lastup;
		this.lastdown = lastdown;
		this.dserviceses = dserviceses;
	}

	@Id
	@Column(name = "dhostid", unique = true, nullable = false)
	public long getDhostid() {
		return this.dhostid;
	}

	public void setDhostid(long dhostid) {
		this.dhostid = dhostid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "druleid", nullable = false)
	public Drules getDrules() {
		return this.drules;
	}

	public void setDrules(Drules drules) {
		this.drules = drules;
	}

	@Column(name = "status", nullable = false)
	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Column(name = "lastup", nullable = false)
	public int getLastup() {
		return this.lastup;
	}

	public void setLastup(int lastup) {
		this.lastup = lastup;
	}

	@Column(name = "lastdown", nullable = false)
	public int getLastdown() {
		return this.lastdown;
	}

	public void setLastdown(int lastdown) {
		this.lastdown = lastdown;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dhosts")
	public Set<Dservices> getDserviceses() {
		return this.dserviceses;
	}

	public void setDserviceses(Set<Dservices> dserviceses) {
		this.dserviceses = dserviceses;
	}

}
