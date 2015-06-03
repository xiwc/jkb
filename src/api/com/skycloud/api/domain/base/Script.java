package com.skycloud.api.domain.base;
public class Script{
	private Integer scriptid;
	private String name;
	private String command;
	private Integer host_access;
	private Integer usrgrpid;
	private Integer groupid;
	private String description;
	private String question;
	private Integer type;
	private Integer execute_on;
	public void setScriptid(Integer scriptid) {
		this.scriptid = scriptid;
	}
	public Integer getScriptid() {
		return scriptid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public String getCommand() {
		return command;
	}
	public void setHost_access(Integer host_access) {
		this.host_access = host_access;
	}
	public Integer getHost_access() {
		return host_access;
	}
	public void setUsrgrpid(Integer usrgrpid) {
		this.usrgrpid = usrgrpid;
	}
	public Integer getUsrgrpid() {
		return usrgrpid;
	}
	public void setGroupid(Integer groupid) {
		this.groupid = groupid;
	}
	public Integer getGroupid() {
		return groupid;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getQuestion() {
		return question;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getType() {
		return type;
	}
	public void setExecute_on(Integer execute_on) {
		this.execute_on = execute_on;
	}
	public Integer getExecute_on() {
		return execute_on;
	}
}
