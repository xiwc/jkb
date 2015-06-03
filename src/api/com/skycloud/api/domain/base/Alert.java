package com.skycloud.api.domain.base;
public class Alert{
	private String alertid;
	private String actionid;
	private Integer alerttype;
	private String clock;
	private String error;
	private Integer esc_step;
	private String eventid;
	private String mediatypeid;
	private String message;
	private Integer retries;
	private String sendto;
	private Integer status;
	private String subject;
	private String userid;
	public void setAlertid(String alertid) {
		this.alertid = alertid;
	}
	public String getAlertid() {
		return alertid;
	}
	public void setActionid(String actionid) {
		this.actionid = actionid;
	}
	public String getActionid() {
		return actionid;
	}
	public void setAlerttype(Integer alerttype) {
		this.alerttype = alerttype;
	}
	public Integer getAlerttype() {
		return alerttype;
	}
	public void setClock(String clock) {
		this.clock = clock;
	}
	public String getClock() {
		return clock;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getError() {
		return error;
	}
	public void setEsc_step(Integer esc_step) {
		this.esc_step = esc_step;
	}
	public Integer getEsc_step() {
		return esc_step;
	}
	public void setEventid(String eventid) {
		this.eventid = eventid;
	}
	public String getEventid() {
		return eventid;
	}
	public void setMediatypeid(String mediatypeid) {
		this.mediatypeid = mediatypeid;
	}
	public String getMediatypeid() {
		return mediatypeid;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public void setRetries(Integer retries) {
		this.retries = retries;
	}
	public Integer getRetries() {
		return retries;
	}
	public void setSendto(String sendto) {
		this.sendto = sendto;
	}
	public String getSendto() {
		return sendto;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getStatus() {
		return status;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject() {
		return subject;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserid() {
		return userid;
	}
}
