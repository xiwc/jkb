package com.skycloud.jkb.pojo.entity;

// Generated 2013-12-31 14:44:24 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Services generated by hbm2java
 */
@Entity
@Table(name = "services", catalog = "skycloud")
public class Services implements java.io.Serializable {

	private long serviceid;
	private Triggers triggers;
	private String name;
	private int status;
	private int algorithm;
	private int showsla;
	private double goodsla;
	private int sortorder;
	private Set<ServicesTimes> servicesTimeses = new HashSet<ServicesTimes>(0);
	private Set<ServiceAlarms> serviceAlarmses = new HashSet<ServiceAlarms>(0);
	private Set<ServicesLinks> servicesLinksesForServiceupid = new HashSet<ServicesLinks>(0);
	private Set<ServicesLinks> servicesLinksesForServicedownid = new HashSet<ServicesLinks>(0);

	public Services() {
	}

	public Services(long serviceid, String name, int status, int algorithm, int showsla, double goodsla, int sortorder) {
		this.serviceid = serviceid;
		this.name = name;
		this.status = status;
		this.algorithm = algorithm;
		this.showsla = showsla;
		this.goodsla = goodsla;
		this.sortorder = sortorder;
	}

	public Services(long serviceid, Triggers triggers, String name, int status, int algorithm, int showsla,
			double goodsla, int sortorder, Set<ServicesTimes> servicesTimeses, Set<ServiceAlarms> serviceAlarmses,
			Set<ServicesLinks> servicesLinksesForServiceupid, Set<ServicesLinks> servicesLinksesForServicedownid) {
		this.serviceid = serviceid;
		this.triggers = triggers;
		this.name = name;
		this.status = status;
		this.algorithm = algorithm;
		this.showsla = showsla;
		this.goodsla = goodsla;
		this.sortorder = sortorder;
		this.servicesTimeses = servicesTimeses;
		this.serviceAlarmses = serviceAlarmses;
		this.servicesLinksesForServiceupid = servicesLinksesForServiceupid;
		this.servicesLinksesForServicedownid = servicesLinksesForServicedownid;
	}

	@Id
	@Column(name = "serviceid", unique = true, nullable = false)
	public long getServiceid() {
		return this.serviceid;
	}

	public void setServiceid(long serviceid) {
		this.serviceid = serviceid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "triggerid")
	public Triggers getTriggers() {
		return this.triggers;
	}

	public void setTriggers(Triggers triggers) {
		this.triggers = triggers;
	}

	@Column(name = "name", nullable = false, length = 128)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "status", nullable = false)
	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Column(name = "algorithm", nullable = false)
	public int getAlgorithm() {
		return this.algorithm;
	}

	public void setAlgorithm(int algorithm) {
		this.algorithm = algorithm;
	}

	@Column(name = "showsla", nullable = false)
	public int getShowsla() {
		return this.showsla;
	}

	public void setShowsla(int showsla) {
		this.showsla = showsla;
	}

	@Column(name = "goodsla", nullable = false, precision = 16, scale = 4)
	public double getGoodsla() {
		return this.goodsla;
	}

	public void setGoodsla(double goodsla) {
		this.goodsla = goodsla;
	}

	@Column(name = "sortorder", nullable = false)
	public int getSortorder() {
		return this.sortorder;
	}

	public void setSortorder(int sortorder) {
		this.sortorder = sortorder;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "services")
	public Set<ServicesTimes> getServicesTimeses() {
		return this.servicesTimeses;
	}

	public void setServicesTimeses(Set<ServicesTimes> servicesTimeses) {
		this.servicesTimeses = servicesTimeses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "services")
	public Set<ServiceAlarms> getServiceAlarmses() {
		return this.serviceAlarmses;
	}

	public void setServiceAlarmses(Set<ServiceAlarms> serviceAlarmses) {
		this.serviceAlarmses = serviceAlarmses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "servicesByServiceupid")
	public Set<ServicesLinks> getServicesLinksesForServiceupid() {
		return this.servicesLinksesForServiceupid;
	}

	public void setServicesLinksesForServiceupid(Set<ServicesLinks> servicesLinksesForServiceupid) {
		this.servicesLinksesForServiceupid = servicesLinksesForServiceupid;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "servicesByServicedownid")
	public Set<ServicesLinks> getServicesLinksesForServicedownid() {
		return this.servicesLinksesForServicedownid;
	}

	public void setServicesLinksesForServicedownid(Set<ServicesLinks> servicesLinksesForServicedownid) {
		this.servicesLinksesForServicedownid = servicesLinksesForServicedownid;
	}

}
