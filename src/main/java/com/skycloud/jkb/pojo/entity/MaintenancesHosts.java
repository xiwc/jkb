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
 * MaintenancesHosts generated by hbm2java
 */
@Entity
@Table(name = "maintenances_hosts", catalog = "skycloud", uniqueConstraints = @UniqueConstraint(columnNames = {
		"maintenanceid", "hostid" }))
public class MaintenancesHosts implements java.io.Serializable {

	private long maintenanceHostid;
	private Hosts hosts;
	private Maintenances maintenances;

	public MaintenancesHosts() {
	}

	public MaintenancesHosts(long maintenanceHostid, Hosts hosts, Maintenances maintenances) {
		this.maintenanceHostid = maintenanceHostid;
		this.hosts = hosts;
		this.maintenances = maintenances;
	}

	@Id
	@Column(name = "maintenance_hostid", unique = true, nullable = false)
	public long getMaintenanceHostid() {
		return this.maintenanceHostid;
	}

	public void setMaintenanceHostid(long maintenanceHostid) {
		this.maintenanceHostid = maintenanceHostid;
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
	@JoinColumn(name = "maintenanceid", nullable = false)
	public Maintenances getMaintenances() {
		return this.maintenances;
	}

	public void setMaintenances(Maintenances maintenances) {
		this.maintenances = maintenances;
	}

}
