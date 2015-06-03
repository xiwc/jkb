package com.skycloud.api.domain.base;
public class ItServiceTime{
	private String timeid;
	private String serviceid;
	private Integer ts_from;
	private Integer ts_to;
	private Integer type;
	private String note;
	public void setTimeid(String timeid) {
		this.timeid = timeid;
	}
	public String getTimeid() {
		return timeid;
	}
	public void setServiceid(String serviceid) {
		this.serviceid = serviceid;
	}
	public String getServiceid() {
		return serviceid;
	}
	public void setTs_from(Integer ts_from) {
		this.ts_from = ts_from;
	}
	public Integer getTs_from() {
		return ts_from;
	}
	public void setTs_to(Integer ts_to) {
		this.ts_to = ts_to;
	}
	public Integer getTs_to() {
		return ts_to;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getType() {
		return type;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getNote() {
		return note;
	}
}
