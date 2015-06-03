package com.skycloud.api.domain.base;

public class ActionCondition {
	private String conditionid;
	private Integer conditiontype;
	private String value;
	private String actionid;
	private Integer operator;
	public void setConditionid(String conditionid) {
		this.conditionid = conditionid;
	}
	public String getConditionid() {
		return conditionid;
	}
	public void setConditiontype(Integer conditiontype) {
		this.conditiontype = conditiontype;
	}
	public Integer getConditiontype() {
		return conditiontype;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getValue() {
		return value;
	}
	public void setActionid(String actionid) {
		this.actionid = actionid;
	}
	public String getActionid() {
		return actionid;
	}
	public void setOperator(Integer operator) {
		this.operator = operator;
	}
	public Integer getOperator() {
		return operator;
	}
}
