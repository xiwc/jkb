package com.skycloud.api.domain.base;
public class ActionOperationCondition{
	private String opconditionid;
	private Integer conditiontype;
	private String value;
	private String operationid;
	private Integer operator;
	public void setOpconditionid(String opconditionid) {
		this.opconditionid = opconditionid;
	}
	public String getOpconditionid() {
		return opconditionid;
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
	public void setOperationid(String operationid) {
		this.operationid = operationid;
	}
	public String getOperationid() {
		return operationid;
	}
	public void setOperator(Integer operator) {
		this.operator = operator;
	}
	public Integer getOperator() {
		return operator;
	}
}
