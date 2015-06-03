package com.skycloud.api.domain.base;
public class Application{
	private String applicationid;
	private String hostid;
	private String name;
	private String templateid;
	public void setApplicationid(String applicationid) {
		this.applicationid = applicationid;
	}
	public String getApplicationid() {
		return applicationid;
	}
	public void setHostid(String hostid) {
		this.hostid = hostid;
	}
	public String getHostid() {
		return hostid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setTemplateid(String templateid) {
		this.templateid = templateid;
	}
	public String getTemplateid() {
		return templateid;
	}
}
