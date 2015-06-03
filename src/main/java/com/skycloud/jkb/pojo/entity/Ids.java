package com.skycloud.jkb.pojo.entity;

// Generated 2013-12-31 14:44:24 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Ids generated by hbm2java
 */
@Entity
@Table(name = "ids", catalog = "skycloud")
public class Ids implements java.io.Serializable {

	private IdsId id;
	private long nextid;

	public Ids() {
	}

	public Ids(IdsId id, long nextid) {
		this.id = id;
		this.nextid = nextid;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "nodeid", column = @Column(name = "nodeid", nullable = false)),
			@AttributeOverride(name = "tableName", column = @Column(name = "table_name", nullable = false, length = 64)),
			@AttributeOverride(name = "fieldName", column = @Column(name = "field_name", nullable = false, length = 64)) })
	public IdsId getId() {
		return this.id;
	}

	public void setId(IdsId id) {
		this.id = id;
	}

	@Column(name = "nextid", nullable = false)
	public long getNextid() {
		return this.nextid;
	}

	public void setNextid(long nextid) {
		this.nextid = nextid;
	}

}
