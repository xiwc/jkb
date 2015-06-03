package com.skycloud.api.domain.base;
public class LogHistory{
	private String id;
	private String clock;
	private String itemid;
	private Integer logeventid;
	private Integer ns;
	private Integer severity;
	private String source;
	private String timestamp;
	private String value;
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
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
	public void setLogeventid(Integer logeventid) {
		this.logeventid = logeventid;
	}
	public Integer getLogeventid() {
		return logeventid;
	}
	public void setNs(Integer ns) {
		this.ns = ns;
	}
	public Integer getNs() {
		return ns;
	}
	public void setSeverity(Integer severity) {
		this.severity = severity;
	}
	public Integer getSeverity() {
		return severity;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getSource() {
		return source;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getValue() {
		return value;
	}
}
