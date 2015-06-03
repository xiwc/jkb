package com.skycloud.api.domain.base;
public class DiscoveredHost{
	private String dhostid;
	private String druleid;
	private String lastdown;
	private String lastup;
	private Integer status;
	public void setDhostid(String dhostid) {
		this.dhostid = dhostid;
	}
	public String getDhostid() {
		return dhostid;
	}
	public void setDruleid(String druleid) {
		this.druleid = druleid;
	}
	public String getDruleid() {
		return druleid;
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
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getStatus() {
		return status;
	}
}
