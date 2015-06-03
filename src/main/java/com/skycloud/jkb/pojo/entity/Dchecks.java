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
 * Dchecks generated by hbm2java
 */
@Entity
@Table(name = "dchecks", catalog = "skycloud")
public class Dchecks implements java.io.Serializable {

	private long dcheckid;
	private Drules drules;
	private int type;
	private String key;
	private String snmpCommunity;
	private String ports;
	private String snmpv3Securityname;
	private int snmpv3Securitylevel;
	private String snmpv3Authpassphrase;
	private String snmpv3Privpassphrase;
	private int uniq;
	private Set<Dservices> dserviceses = new HashSet<Dservices>(0);

	public Dchecks() {
	}

	public Dchecks(long dcheckid, Drules drules, int type, String key, String snmpCommunity, String ports,
			String snmpv3Securityname, int snmpv3Securitylevel, String snmpv3Authpassphrase,
			String snmpv3Privpassphrase, int uniq) {
		this.dcheckid = dcheckid;
		this.drules = drules;
		this.type = type;
		this.key = key;
		this.snmpCommunity = snmpCommunity;
		this.ports = ports;
		this.snmpv3Securityname = snmpv3Securityname;
		this.snmpv3Securitylevel = snmpv3Securitylevel;
		this.snmpv3Authpassphrase = snmpv3Authpassphrase;
		this.snmpv3Privpassphrase = snmpv3Privpassphrase;
		this.uniq = uniq;
	}

	public Dchecks(long dcheckid, Drules drules, int type, String key, String snmpCommunity, String ports,
			String snmpv3Securityname, int snmpv3Securitylevel, String snmpv3Authpassphrase,
			String snmpv3Privpassphrase, int uniq, Set<Dservices> dserviceses) {
		this.dcheckid = dcheckid;
		this.drules = drules;
		this.type = type;
		this.key = key;
		this.snmpCommunity = snmpCommunity;
		this.ports = ports;
		this.snmpv3Securityname = snmpv3Securityname;
		this.snmpv3Securitylevel = snmpv3Securitylevel;
		this.snmpv3Authpassphrase = snmpv3Authpassphrase;
		this.snmpv3Privpassphrase = snmpv3Privpassphrase;
		this.uniq = uniq;
		this.dserviceses = dserviceses;
	}

	@Id
	@Column(name = "dcheckid", unique = true, nullable = false)
	public long getDcheckid() {
		return this.dcheckid;
	}

	public void setDcheckid(long dcheckid) {
		this.dcheckid = dcheckid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "druleid", nullable = false)
	public Drules getDrules() {
		return this.drules;
	}

	public void setDrules(Drules drules) {
		this.drules = drules;
	}

	@Column(name = "type", nullable = false)
	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Column(name = "key_", nullable = false)
	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Column(name = "snmp_community", nullable = false)
	public String getSnmpCommunity() {
		return this.snmpCommunity;
	}

	public void setSnmpCommunity(String snmpCommunity) {
		this.snmpCommunity = snmpCommunity;
	}

	@Column(name = "ports", nullable = false)
	public String getPorts() {
		return this.ports;
	}

	public void setPorts(String ports) {
		this.ports = ports;
	}

	@Column(name = "snmpv3_securityname", nullable = false, length = 64)
	public String getSnmpv3Securityname() {
		return this.snmpv3Securityname;
	}

	public void setSnmpv3Securityname(String snmpv3Securityname) {
		this.snmpv3Securityname = snmpv3Securityname;
	}

	@Column(name = "snmpv3_securitylevel", nullable = false)
	public int getSnmpv3Securitylevel() {
		return this.snmpv3Securitylevel;
	}

	public void setSnmpv3Securitylevel(int snmpv3Securitylevel) {
		this.snmpv3Securitylevel = snmpv3Securitylevel;
	}

	@Column(name = "snmpv3_authpassphrase", nullable = false, length = 64)
	public String getSnmpv3Authpassphrase() {
		return this.snmpv3Authpassphrase;
	}

	public void setSnmpv3Authpassphrase(String snmpv3Authpassphrase) {
		this.snmpv3Authpassphrase = snmpv3Authpassphrase;
	}

	@Column(name = "snmpv3_privpassphrase", nullable = false, length = 64)
	public String getSnmpv3Privpassphrase() {
		return this.snmpv3Privpassphrase;
	}

	public void setSnmpv3Privpassphrase(String snmpv3Privpassphrase) {
		this.snmpv3Privpassphrase = snmpv3Privpassphrase;
	}

	@Column(name = "uniq", nullable = false)
	public int getUniq() {
		return this.uniq;
	}

	public void setUniq(int uniq) {
		this.uniq = uniq;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dchecks")
	public Set<Dservices> getDserviceses() {
		return this.dserviceses;
	}

	public void setDserviceses(Set<Dservices> dserviceses) {
		this.dserviceses = dserviceses;
	}

}