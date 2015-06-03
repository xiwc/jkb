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
 * SysmapsLinkTriggers generated by hbm2java
 */
@Entity
@Table(name = "sysmaps_link_triggers", catalog = "skycloud", uniqueConstraints = @UniqueConstraint(columnNames = {
		"linkid", "triggerid" }))
public class SysmapsLinkTriggers implements java.io.Serializable {

	private long linktriggerid;
	private Triggers triggers;
	private SysmapsLinks sysmapsLinks;
	private int drawtype;
	private String color;

	public SysmapsLinkTriggers() {
	}

	public SysmapsLinkTriggers(long linktriggerid, Triggers triggers, SysmapsLinks sysmapsLinks, int drawtype,
			String color) {
		this.linktriggerid = linktriggerid;
		this.triggers = triggers;
		this.sysmapsLinks = sysmapsLinks;
		this.drawtype = drawtype;
		this.color = color;
	}

	@Id
	@Column(name = "linktriggerid", unique = true, nullable = false)
	public long getLinktriggerid() {
		return this.linktriggerid;
	}

	public void setLinktriggerid(long linktriggerid) {
		this.linktriggerid = linktriggerid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "triggerid", nullable = false)
	public Triggers getTriggers() {
		return this.triggers;
	}

	public void setTriggers(Triggers triggers) {
		this.triggers = triggers;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "linkid", nullable = false)
	public SysmapsLinks getSysmapsLinks() {
		return this.sysmapsLinks;
	}

	public void setSysmapsLinks(SysmapsLinks sysmapsLinks) {
		this.sysmapsLinks = sysmapsLinks;
	}

	@Column(name = "drawtype", nullable = false)
	public int getDrawtype() {
		return this.drawtype;
	}

	public void setDrawtype(int drawtype) {
		this.drawtype = drawtype;
	}

	@Column(name = "color", nullable = false, length = 6)
	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}