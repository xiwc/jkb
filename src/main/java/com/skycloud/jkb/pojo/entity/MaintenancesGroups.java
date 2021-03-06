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
 * MaintenancesGroups generated by hbm2java
 */
@Entity
@Table(name = "maintenances_groups", catalog = "skycloud", uniqueConstraints = @UniqueConstraint(columnNames = {
		"maintenanceid", "groupid" }))
public class MaintenancesGroups implements java.io.Serializable {

	private long maintenanceGroupid;
	private Groups groups;
	private Maintenances maintenances;

	public MaintenancesGroups() {
	}

	public MaintenancesGroups(long maintenanceGroupid, Groups groups, Maintenances maintenances) {
		this.maintenanceGroupid = maintenanceGroupid;
		this.groups = groups;
		this.maintenances = maintenances;
	}

	@Id
	@Column(name = "maintenance_groupid", unique = true, nullable = false)
	public long getMaintenanceGroupid() {
		return this.maintenanceGroupid;
	}

	public void setMaintenanceGroupid(long maintenanceGroupid) {
		this.maintenanceGroupid = maintenanceGroupid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "groupid", nullable = false)
	public Groups getGroups() {
		return this.groups;
	}

	public void setGroups(Groups groups) {
		this.groups = groups;
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
