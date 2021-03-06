package com.skycloud.jkb.pojo.entity;

// Generated 2013-12-31 14:44:24 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * OpmessageGrp generated by hbm2java
 */
@Entity
@Table(name = "opmessage_grp", catalog = "skycloud", uniqueConstraints = @UniqueConstraint(columnNames = {
		"operationid", "usrgrpid" }))
public class OpmessageGrp implements java.io.Serializable {

	private long opmessageGrpid;
	private Operations operations;
	private Usrgrp usrgrp;

	public OpmessageGrp() {
	}

	public OpmessageGrp(long opmessageGrpid, Operations operations, Usrgrp usrgrp) {
		this.opmessageGrpid = opmessageGrpid;
		this.operations = operations;
		this.usrgrp = usrgrp;
	}

	@Id
	@Column(name = "opmessage_grpid", unique = true, nullable = false)
	public long getOpmessageGrpid() {
		return this.opmessageGrpid;
	}

	public void setOpmessageGrpid(long opmessageGrpid) {
		this.opmessageGrpid = opmessageGrpid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "operationid", nullable = false)
	public Operations getOperations() {
		return this.operations;
	}

	public void setOperations(Operations operations) {
		this.operations = operations;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "usrgrpid", nullable = false)
	public Usrgrp getUsrgrp() {
		return this.usrgrp;
	}

	public void setUsrgrp(Usrgrp usrgrp) {
		this.usrgrp = usrgrp;
	}

}
