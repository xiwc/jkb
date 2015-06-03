package com.skycloud.jkb.pojo.entity;

// Generated 2013-12-31 14:44:24 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Slideshows generated by hbm2java
 */
@Entity
@Table(name = "slideshows", catalog = "skycloud")
public class Slideshows implements java.io.Serializable {

	private long slideshowid;
	private String name;
	private int delay;
	private Set<Slides> slideses = new HashSet<Slides>(0);

	public Slideshows() {
	}

	public Slideshows(long slideshowid, String name, int delay) {
		this.slideshowid = slideshowid;
		this.name = name;
		this.delay = delay;
	}

	public Slideshows(long slideshowid, String name, int delay, Set<Slides> slideses) {
		this.slideshowid = slideshowid;
		this.name = name;
		this.delay = delay;
		this.slideses = slideses;
	}

	@Id
	@Column(name = "slideshowid", unique = true, nullable = false)
	public long getSlideshowid() {
		return this.slideshowid;
	}

	public void setSlideshowid(long slideshowid) {
		this.slideshowid = slideshowid;
	}

	@Column(name = "name", nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "delay", nullable = false)
	public int getDelay() {
		return this.delay;
	}

	public void setDelay(int delay) {
		this.delay = delay;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "slideshows")
	public Set<Slides> getSlideses() {
		return this.slideses;
	}

	public void setSlideses(Set<Slides> slideses) {
		this.slideses = slideses;
	}

}
