package com.skycloud.api.domain.base;
public class Event{
	private String eventid;
	private Integer acknowledged;
	private String clock;
	private Integer ns;
	private Integer object;
	private String objectid;
	private Integer source;
	private Integer value;
	private Integer value_changed;
	public void setEventid(String eventid) {
		this.eventid = eventid;
	}
	public String getEventid() {
		return eventid;
	}
	public void setAcknowledged(Integer acknowledged) {
		this.acknowledged = acknowledged;
	}
	public Integer getAcknowledged() {
		return acknowledged;
	}
	public void setClock(String clock) {
		this.clock = clock;
	}
	public String getClock() {
		return clock;
	}
	public void setNs(Integer ns) {
		this.ns = ns;
	}
	public Integer getNs() {
		return ns;
	}
	public void setObject(Integer object) {
		this.object = object;
	}
	public Integer getObject() {
		return object;
	}
	public void setObjectid(String objectid) {
		this.objectid = objectid;
	}
	public String getObjectid() {
		return objectid;
	}
	public void setSource(Integer source) {
		this.source = source;
	}
	public Integer getSource() {
		return source;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue_changed(Integer value_changed) {
		this.value_changed = value_changed;
	}
	public Integer getValue_changed() {
		return value_changed;
	}
}
