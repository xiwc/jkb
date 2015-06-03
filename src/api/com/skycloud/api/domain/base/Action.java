package com.skycloud.api.domain.base;

public class Action {
	private String actionid;
	private Integer esc_period;
	private Integer evaltype;
	private Integer eventsource;
	private String name;
	private String def_longdata;
	private String def_shortdata;
	private String r_longdata;
	private String r_shortdata;
	private Integer recovery_msg;
	private Integer status;

	public void setActionid(String actionid) {
		this.actionid = actionid;
	}

	public String getActionid() {
		return actionid;
	}

	public void setEsc_period(Integer esc_period) {
		this.esc_period = esc_period;
	}

	public Integer getEsc_period() {
		return esc_period;
	}

	public void setEvaltype(Integer evaltype) {
		this.evaltype = evaltype;
	}

	public Integer getEvaltype() {
		return evaltype;
	}

	public void setEventsource(Integer eventsource) {
		this.eventsource = eventsource;
	}

	public Integer getEventsource() {
		return eventsource;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setDef_longdata(String def_longdata) {
		this.def_longdata = def_longdata;
	}

	public String getDef_longdata() {
		return def_longdata;
	}

	public void setDef_shortdata(String def_shortdata) {
		this.def_shortdata = def_shortdata;
	}

	public String getDef_shortdata() {
		return def_shortdata;
	}

	public void setR_longdata(String r_longdata) {
		this.r_longdata = r_longdata;
	}

	public String getR_longdata() {
		return r_longdata;
	}

	public void setR_shortdata(String r_shortdata) {
		this.r_shortdata = r_shortdata;
	}

	public String getR_shortdata() {
		return r_shortdata;
	}

	public void setRecovery_msg(Integer recovery_msg) {
		this.recovery_msg = recovery_msg;
	}

	public Integer getRecovery_msg() {
		return recovery_msg;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getStatus() {
		return status;
	}
}
