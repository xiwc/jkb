package com.skycloud.api.domain.base;

import java.util.ArrayList;
import java.util.List;

public class ActionOperation {
	private String operationid;
	private Integer operationtype;
	private String actionid;
	private Integer esc_period;
	private Integer esc_step_from;
	private Integer esc_step_to;
	private Integer evaltype;
	private Object opcommand;
	private List<ActionOperationSyn> opcommand_grp;
	private List<ActionOperationSyn> opcommand_hst;
	private List<ActionOperationSyn> opconditions;
	private List<ActionOperationSyn> opgroup;
	private ActionOperationMessage opmessage;
	private List<ActionOperationSyn> opmessage_grp;
	private List<ActionOperationSyn> opmessage_usr;
	private List<ActionOperationSyn> optemplate;

	public void setOperationid(String operationid) {
		this.operationid = operationid;
	}

	public String getOperationid() {
		return operationid;
	}

	public void setOperationtype(Integer operationtype) {
		this.operationtype = operationtype;
	}

	public Integer getOperationtype() {
		return operationtype;
	}

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

	public void setEsc_step_from(Integer esc_step_from) {
		this.esc_step_from = esc_step_from;
	}

	public Integer getEsc_step_from() {
		return esc_step_from;
	}

	public void setEsc_step_to(Integer esc_step_to) {
		this.esc_step_to = esc_step_to;
	}

	public Integer getEsc_step_to() {
		return esc_step_to;
	}

	public void setEvaltype(Integer evaltype) {
		this.evaltype = evaltype;
	}

	public Integer getEvaltype() {
		return evaltype;
	}

	public void setOpcommand(Object opcommand) {
		this.opcommand = opcommand;
	}

	public Object getOpcommand() {
		return opcommand;
	}

	public void setOpcommand_grp(List<ActionOperationSyn> opcommand_grp) {
		this.opcommand_grp = opcommand_grp;
	}

	public List<ActionOperationSyn> getOpcommand_grp() {
		if (opcommand_grp == null) {
			opcommand_grp = new ArrayList<ActionOperationSyn>();
			return opcommand_grp;
		}
		return opcommand_grp;
	}

	public void setOpcommand_hst(List<ActionOperationSyn> opcommand_hst) {
		this.opcommand_hst = opcommand_hst;
	}

	public List<ActionOperationSyn> getOpcommand_hst() {
		if (opcommand_hst == null) {
			opcommand_hst = new ArrayList<ActionOperationSyn>();
			return opcommand_hst;
		}
		return opcommand_hst;
	}

	public void setOpconditions(List<ActionOperationSyn> opconditions) {
		this.opconditions = opconditions;
	}

	public List<ActionOperationSyn> getOpconditions() {
		if (opconditions == null) {
			opconditions = new ArrayList<ActionOperationSyn>();
			return opconditions;
		}
		return opconditions;
	}

	public void setOpgroup(List<ActionOperationSyn> opgroup) {
		this.opgroup = opgroup;
	}

	public List<ActionOperationSyn> getOpgroup() {
		if (opgroup == null) {
			opgroup = new ArrayList<ActionOperationSyn>();
			return opgroup;
		}
		return opgroup;
	}

	public void setOpmessage(ActionOperationMessage opmessage) {
		this.opmessage = opmessage;
	}

	public ActionOperationMessage getOpmessage() {
		return opmessage;
	}

	public void setOpmessage_grp(List<ActionOperationSyn> opmessage_grp) {
		this.opmessage_grp = opmessage_grp;
	}

	public List<ActionOperationSyn> getOpmessage_grp() {
		if (opmessage_grp == null) {
			opmessage_grp = new ArrayList<ActionOperationSyn>();
			return opmessage_grp;
		}
		return opmessage_grp;
	}

	public void setOpmessage_usr(List<ActionOperationSyn> opmessage_usr) {
		this.opmessage_usr = opmessage_usr;
	}

	public List<ActionOperationSyn> getOpmessage_usr() {
		if (opmessage_usr == null) {
			opmessage_usr = new ArrayList<ActionOperationSyn>();
			return opmessage_usr;
		}
		return opmessage_usr;
	}

	public void setOptemplate(List<ActionOperationSyn> optemplate) {
		this.optemplate = optemplate;
	}

	public List<ActionOperationSyn> getOptemplate() {
		if (optemplate == null) {
			optemplate = new ArrayList<ActionOperationSyn>();
			return optemplate;
		}
		return optemplate;
	}
}
