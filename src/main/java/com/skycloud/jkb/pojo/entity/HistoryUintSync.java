package com.skycloud.jkb.pojo.entity;

// Generated 2013-12-31 14:44:24 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * HistoryUintSync generated by hbm2java
 */
@Entity
@Table(name = "history_uint_sync", catalog = "skycloud")
public class HistoryUintSync implements java.io.Serializable {

	private Long id;
	private int nodeid;
	private long itemid;
	private int clock;
	private long value;
	private int ns;

	public HistoryUintSync() {
	}

	public HistoryUintSync(int nodeid, long itemid, int clock, long value, int ns) {
		this.nodeid = nodeid;
		this.itemid = itemid;
		this.clock = clock;
		this.value = value;
		this.ns = ns;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "nodeid", nullable = false)
	public int getNodeid() {
		return this.nodeid;
	}

	public void setNodeid(int nodeid) {
		this.nodeid = nodeid;
	}

	@Column(name = "itemid", nullable = false)
	public long getItemid() {
		return this.itemid;
	}

	public void setItemid(long itemid) {
		this.itemid = itemid;
	}

	@Column(name = "clock", nullable = false)
	public int getClock() {
		return this.clock;
	}

	public void setClock(int clock) {
		this.clock = clock;
	}

	@Column(name = "value", nullable = false)
	public long getValue() {
		return this.value;
	}

	public void setValue(long value) {
		this.value = value;
	}

	@Column(name = "ns", nullable = false)
	public int getNs() {
		return this.ns;
	}

	public void setNs(int ns) {
		this.ns = ns;
	}

}