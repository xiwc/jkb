package com.skycloud.api.domain.base;

public class HostGroup {
	private String groupid;
	private String name;
	private Integer internal;

	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}

	public String getGroupid() {
		return groupid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setInternal(Integer internal) {
		this.internal = internal;
	}

	public Integer getInternal() {
		return internal;
	}
}
