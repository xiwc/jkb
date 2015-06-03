package com.skycloud.api.domain.base;
public class DiscoveredService{
	private String dserviceid;
	private String dcheckid;
	private String dhostid;
	private String dns;
	private String ip;
	private String key_;
	private String lastdown;
	private String lastup;
	private Integer port;
	private Integer status;
	private Integer type;
	private String value;
	public void setDserviceid(String dserviceid) {
		this.dserviceid = dserviceid;
	}
	public String getDserviceid() {
		return dserviceid;
	}
	public void setDcheckid(String dcheckid) {
		this.dcheckid = dcheckid;
	}
	public String getDcheckid() {
		return dcheckid;
	}
	public void setDhostid(String dhostid) {
		this.dhostid = dhostid;
	}
	public String getDhostid() {
		return dhostid;
	}
	public void setDns(String dns) {
		this.dns = dns;
	}
	public String getDns() {
		return dns;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getIp() {
		return ip;
	}
	public void setKey_(String key_) {
		this.key_ = key_;
	}
	public String getKey_() {
		return key_;
	}
	public void setLastdown(String lastdown) {
		this.lastdown = lastdown;
	}
	public String getLastdown() {
		return lastdown;
	}
	public void setLastup(String lastup) {
		this.lastup = lastup;
	}
	public String getLastup() {
		return lastup;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	public Integer getPort() {
		return port;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getStatus() {
		return status;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getType() {
		return type;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getValue() {
		return value;
	}
}
