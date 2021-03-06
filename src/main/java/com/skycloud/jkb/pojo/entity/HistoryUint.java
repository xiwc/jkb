package com.skycloud.jkb.pojo.entity;

// Generated 2013-12-31 14:44:24 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * HistoryUint generated by hbm2java
 */
@Entity
@Table(name = "history_uint", catalog = "skycloud")
public class HistoryUint implements java.io.Serializable {

	private HistoryUintId id;

	public HistoryUint() {
	}

	public HistoryUint(HistoryUintId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "itemid", column = @Column(name = "itemid", nullable = false)),
			@AttributeOverride(name = "clock", column = @Column(name = "clock", nullable = false)),
			@AttributeOverride(name = "value", column = @Column(name = "value", nullable = false)),
			@AttributeOverride(name = "ns", column = @Column(name = "ns", nullable = false)) })
	public HistoryUintId getId() {
		return this.id;
	}

	public void setId(HistoryUintId id) {
		this.id = id;
	}

}
