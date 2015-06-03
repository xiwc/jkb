package com.skycloud.api.domain.base;
public class Proxy{
	private String proxyid;
	private String host;
	private Integer status;
	private String lastaccess;
	public void setProxyid(String proxyid) {
		this.proxyid = proxyid;
	}
	public String getProxyid() {
		return proxyid;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getHost() {
		return host;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getStatus() {
		return status;
	}
	public void setLastaccess(String lastaccess) {
		this.lastaccess = lastaccess;
	}
	public String getLastaccess() {
		return lastaccess;
	}
}
