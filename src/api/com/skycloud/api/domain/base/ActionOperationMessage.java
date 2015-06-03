package com.skycloud.api.domain.base;
public class ActionOperationMessage{
	private String operationid;
	private Integer default_msg;
	private String mediatypeid;
	private String message;
	private String subject;
	public void setOperationid(String operationid) {
		this.operationid = operationid;
	}
	public String getOperationid() {
		return operationid;
	}
	public void setDefault_msg(Integer default_msg) {
		this.default_msg = default_msg;
	}
	public Integer getDefault_msg() {
		return default_msg;
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
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject() {
		return subject;
	}
}
