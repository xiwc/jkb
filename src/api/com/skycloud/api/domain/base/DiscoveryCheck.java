package com.skycloud.api.domain.base;
public class DiscoveryCheck{
	private String dcheckid;
	private String druleid;
	private String key_;
	private String ports;
	private String snmp_community;
	private String snmpv3_authpassphrase;
	private String snmpv3_privpassphrase;
	private String snmpv3_securitylevel;
	private String snmpv3_securityname;
	private Integer type;
	private Integer uniq;
	public void setDcheckid(String dcheckid) {
		this.dcheckid = dcheckid;
	}
	public String getDcheckid() {
		return dcheckid;
	}
	public void setDruleid(String druleid) {
		this.druleid = druleid;
	}
	public String getDruleid() {
		return druleid;
	}
	public void setKey_(String key_) {
		this.key_ = key_;
	}
	public String getKey_() {
		return key_;
	}
	public void setPorts(String ports) {
		this.ports = ports;
	}
	public String getPorts() {
		return ports;
	}
	public void setSnmp_community(String snmp_community) {
		this.snmp_community = snmp_community;
	}
	public String getSnmp_community() {
		return snmp_community;
	}
	public void setSnmpv3_authpassphrase(String snmpv3_authpassphrase) {
		this.snmpv3_authpassphrase = snmpv3_authpassphrase;
	}
	public String getSnmpv3_authpassphrase() {
		return snmpv3_authpassphrase;
	}
	public void setSnmpv3_privpassphrase(String snmpv3_privpassphrase) {
		this.snmpv3_privpassphrase = snmpv3_privpassphrase;
	}
	public String getSnmpv3_privpassphrase() {
		return snmpv3_privpassphrase;
	}
	public void setSnmpv3_securitylevel(String snmpv3_securitylevel) {
		this.snmpv3_securitylevel = snmpv3_securitylevel;
	}
	public String getSnmpv3_securitylevel() {
		return snmpv3_securitylevel;
	}
	public void setSnmpv3_securityname(String snmpv3_securityname) {
		this.snmpv3_securityname = snmpv3_securityname;
	}
	public String getSnmpv3_securityname() {
		return snmpv3_securityname;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getType() {
		return type;
	}
	public void setUniq(Integer uniq) {
		this.uniq = uniq;
	}
	public Integer getUniq() {
		return uniq;
	}
}
