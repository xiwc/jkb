package com.skycloud.jkb.pojo.entity;

// Generated 2013-12-31 14:44:24 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Rights generated by hbm2java
 */
@Entity
@Table(name = "rights", catalog = "skycloud")
public class Rights implements java.io.Serializable {

	private long rightid;
	private Usrgrp usrgrp;
	private Groups groups;
	private int permission;

	public Rights() {
	}

	public Rights(long rightid, Usrgrp usrgrp, Groups groups, int permission) {
		this.rightid = rightid;
		this.usrgrp = usrgrp;
		this.groups = groups;
		this.permission = permission;
	}

	@Id
	@Column(name = "rightid", unique = true, nullable = false)
	public long getRightid() {
		return this.rightid;
	}

	public void setRightid(long rightid) {
		this.rightid = rightid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "groupid", nullable = false)
	public Usrgrp getUsrgrp() {
		return this.usrgrp;
	}

	public void setUsrgrp(Usrgrp usrgrp) {
		this.usrgrp = usrgrp;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id", nullable = false)
	public Groups getGroups() {
		return this.groups;
	}

	public void setGroups(Groups groups) {
		this.groups = groups;
	}

	@Column(name = "permission", nullable = false)
	public int getPermission() {
		return this.permission;
	}

	public void setPermission(int permission) {
		this.permission = permission;
	}

}
