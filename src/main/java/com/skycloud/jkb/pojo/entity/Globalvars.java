package com.skycloud.jkb.pojo.entity;

// Generated 2013-12-31 14:44:24 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Globalvars generated by hbm2java
 */
@Entity
@Table(name = "globalvars", catalog = "skycloud")
public class Globalvars implements java.io.Serializable {

	private long globalvarid;
	private int snmpLastsize;

	public Globalvars() {
	}

	public Globalvars(long globalvarid, int snmpLastsize) {
		this.globalvarid = globalvarid;
		this.snmpLastsize = snmpLastsize;
	}

	@Id
	@Column(name = "globalvarid", unique = true, nullable = false)
	public long getGlobalvarid() {
		return this.globalvarid;
	}

	public void setGlobalvarid(long globalvarid) {
		this.globalvarid = globalvarid;
	}

	@Column(name = "snmp_lastsize", nullable = false)
	public int getSnmpLastsize() {
		return this.snmpLastsize;
	}

	public void setSnmpLastsize(int snmpLastsize) {
		this.snmpLastsize = snmpLastsize;
	}

}