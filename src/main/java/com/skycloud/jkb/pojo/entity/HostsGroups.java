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
 * HostsGroups generated by hbm2java
 */
@Entity
@Table(name = "hosts_groups", catalog = "skycloud", uniqueConstraints = @UniqueConstraint(columnNames = { "hostid",
		"groupid" }))
public class HostsGroups implements java.io.Serializable {

	private long hostgroupid;
	private Hosts hosts;
	private Groups groups;

	public HostsGroups() {
	}

	public HostsGroups(long hostgroupid, Hosts hosts, Groups groups) {
		this.hostgroupid = hostgroupid;
		this.hosts = hosts;
		this.groups = groups;
	}

	@Id
	@Column(name = "hostgroupid", unique = true, nullable = false)
	public long getHostgroupid() {
		return this.hostgroupid;
	}

	public void setHostgroupid(long hostgroupid) {
		this.hostgroupid = hostgroupid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "hostid", nullable = false)
	public Hosts getHosts() {
		return this.hosts;
	}

	public void setHosts(Hosts hosts) {
		this.hosts = hosts;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "groupid", nullable = false)
	public Groups getGroups() {
		return this.groups;
	}

	public void setGroups(Groups groups) {
		this.groups = groups;
	}

}