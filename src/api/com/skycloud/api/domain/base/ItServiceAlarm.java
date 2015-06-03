package com.skycloud.api.domain.base;
public class ItServiceAlarm{
	private String servicealarmid;
	private String clock;
	private Integer value;
	public void setServicealarmid(String servicealarmid) {
		this.servicealarmid = servicealarmid;
	}
	public String getServicealarmid() {
		return servicealarmid;
	}
	public void setClock(String clock) {
		this.clock = clock;
	}
	public String getClock() {
		return clock;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public Integer getValue() {
		return value;
	}
}
