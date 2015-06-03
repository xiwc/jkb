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
 * OpmessageUsr generated by hbm2java
 */
@Entity
@Table(name = "opmessage_usr", catalog = "skycloud", uniqueConstraints = @UniqueConstraint(columnNames = {
		"operationid", "userid" }))
public class OpmessageUsr implements java.io.Serializable {

	/** serialVersionUID [long] */
	private static final long serialVersionUID = 8447201316026044620L;
	private long opmessageUsrid;
	private Operations operations;
	private Users users;

	public OpmessageUsr() {
	}

	public OpmessageUsr(long opmessageUsrid, Operations operations, Users users) {
		this.opmessageUsrid = opmessageUsrid;
		this.operations = operations;
		this.users = users;
	}

	@Id
	@Column(name = "opmessage_usrid", unique = true, nullable = false)
	public long getOpmessageUsrid() {
		return this.opmessageUsrid;
	}

	public void setOpmessageUsrid(long opmessageUsrid) {
		this.opmessageUsrid = opmessageUsrid;
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
	@JoinColumn(name = "userid", nullable = false)
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

}
