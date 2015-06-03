package com.skycloud.api.domain.base;
public class StringHistory{
	private String clock;
	private String itemid;
	private Integer ns;
	private String value;
	public void setClock(String clock) {
		this.clock = clock;
	}
	public String getClock() {
		return clock;
	}
	public void setItemid(String itemid) {
		this.itemid = itemid;
	}
	public String getItemid() {
		return itemid;
	}
	public void setNs(Integer ns) {
		this.ns = ns;
	}
	public Integer getNs() {
		return ns;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getValue() {
		return value;
	}
}
