package com.skycloud.api.domain.base;
public class ActionOperationCommand{
	private String operationid;
	private String command;
	private Integer type;
	private Integer authtype;
	private Integer execute_on;
	private String password;
	private String port;
	private String privatekey;
	private String publickey;
	private String scriptid;
	private String username;
	public void setOperationid(String operationid) {
		this.operationid = operationid;
	}
	public String getOperationid() {
		return operationid;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public String getCommand() {
		return command;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getType() {
		return type;
	}
	public void setAuthtype(Integer authtype) {
		this.authtype = authtype;
	}
	public Integer getAuthtype() {
		return authtype;
	}
	public void setExecute_on(Integer execute_on) {
		this.execute_on = execute_on;
	}
	public Integer getExecute_on() {
		return execute_on;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getPort() {
		return port;
	}
	public void setPrivatekey(String privatekey) {
		this.privatekey = privatekey;
	}
	public String getPrivatekey() {
		return privatekey;
	}
	public void setPublickey(String publickey) {
		this.publickey = publickey;
	}
	public String getPublickey() {
		return publickey;
	}
	public void setScriptid(String scriptid) {
		this.scriptid = scriptid;
	}
	public String getScriptid() {
		return scriptid;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsername() {
		return username;
	}
}
