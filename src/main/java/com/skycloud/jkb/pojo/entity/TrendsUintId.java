package com.skycloud.jkb.pojo.entity;

// Generated 2013-12-31 14:44:24 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TrendsUintId generated by hbm2java
 */
@Embeddable
public class TrendsUintId implements java.io.Serializable {

	private long itemid;
	private int clock;

	public TrendsUintId() {
	}

	public TrendsUintId(long itemid, int clock) {
		this.itemid = itemid;
		this.clock = clock;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TrendsUintId))
			return false;
		TrendsUintId castOther = (TrendsUintId) other;

		return (this.getItemid() == castOther.getItemid()) && (this.getClock() == castOther.getClock());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getItemid();
		result = 37 * result + this.getClock();
		return result;
	}

}
