package com.skycloud.api.domain.base;
public class ProxyInterface{
	private String interfaceid;
	private String dns;
	private String ip;
	private String port;
	private Integer useip;
	private String hostid;
	public void setInterfaceid(String interfaceid) {
		this.interfaceid = interfaceid;
	}
	public String getInterfaceid() {
		return interfaceid;
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
	public void setPort(String port) {
		this.port = port;
	}
	public String getPort() {
		return port;
	}
	public void setUseip(Integer useip) {
		this.useip = useip;
	}
	public Integer getUseip() {
		return useip;
	}
	public void setHostid(String hostid) {
		this.hostid = hostid;
	}
	public String getHostid() {
		return hostid;
	}
}
