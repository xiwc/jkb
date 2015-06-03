package com.skycloud.api.domain.base;
public class ItServiceDependency{
	private String linkid;
	private String servicedownid;
	private String serviceupid;
	private Integer soft;
	public void setLinkid(String linkid) {
		this.linkid = linkid;
	}
	public String getLinkid() {
		return linkid;
	}
	public void setServicedownid(String servicedownid) {
		this.servicedownid = servicedownid;
	}
	public String getServicedownid() {
		return servicedownid;
	}
	public void setServiceupid(String serviceupid) {
		this.serviceupid = serviceupid;
	}
	public String getServiceupid() {
		return serviceupid;
	}
	public void setSoft(Integer soft) {
		this.soft = soft;
	}
	public Integer getSoft() {
		return soft;
	}
}
