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
 * Triggers generated by hbm2java
 */
@Entity
@Table(name = "triggers", catalog = "skycloud")
public class Triggers implements java.io.Serializable {

	private long triggerid;
	private Triggers triggers;
	private String expression;
	private String description;
	private String url;
	private int status;
	private int value;
	private int priority;
	private int lastchange;
	private String comments;
	private String error;
	private int type;
	private int valueFlags;
	private int flags;
	private Set<TriggerDiscovery> triggerDiscoveriesForParentTriggerid = new HashSet<TriggerDiscovery>(0);
	private Set<TriggerDiscovery> triggerDiscoveriesForTriggerid = new HashSet<TriggerDiscovery>(0);
	private Set<Functions> functionses = new HashSet<Functions>(0);
	private Set<SysmapsLinkTriggers> sysmapsLinkTriggerses = new HashSet<SysmapsLinkTriggers>(0);
	private Set<Triggers> triggerses = new HashSet<Triggers>(0);
	private Set<TriggerDepends> triggerDependsesForTriggeridDown = new HashSet<TriggerDepends>(0);
	private Set<TriggerDepends> triggerDependsesForTriggeridUp = new HashSet<TriggerDepends>(0);
	private Set<Services> serviceses = new HashSet<Services>(0);

	public Triggers() {
	}

	public Triggers(long triggerid, String expression, String description, String url, int status, int value,
			int priority, int lastchange, String comments, String error, int type, int valueFlags, int flags) {
		this.triggerid = triggerid;
		this.expression = expression;
		this.description = description;
		this.url = url;
		this.status = status;
		this.value = value;
		this.priority = priority;
		this.lastchange = lastchange;
		this.comments = comments;
		this.error = error;
		this.type = type;
		this.valueFlags = valueFlags;
		this.flags = flags;
	}

	public Triggers(long triggerid, Triggers triggers, String expression, String description, String url, int status,
			int value, int priority, int lastchange, String comments, String error, int type, int valueFlags,
			int flags, Set<TriggerDiscovery> triggerDiscoveriesForParentTriggerid,
			Set<TriggerDiscovery> triggerDiscoveriesForTriggerid, Set<Functions> functionses,
			Set<SysmapsLinkTriggers> sysmapsLinkTriggerses, Set<Triggers> triggerses,
			Set<TriggerDepends> triggerDependsesForTriggeridDown, Set<TriggerDepends> triggerDependsesForTriggeridUp,
			Set<Services> serviceses) {
		this.triggerid = triggerid;
		this.triggers = triggers;
		this.expression = expression;
		this.description = description;
		this.url = url;
		this.status = status;
		this.value = value;
		this.priority = priority;
		this.lastchange = lastchange;
		this.comments = comments;
		this.error = error;
		this.type = type;
		this.valueFlags = valueFlags;
		this.flags = flags;
		this.triggerDiscoveriesForParentTriggerid = triggerDiscoveriesForParentTriggerid;
		this.triggerDiscoveriesForTriggerid = triggerDiscoveriesForTriggerid;
		this.functionses = functionses;
		this.sysmapsLinkTriggerses = sysmapsLinkTriggerses;
		this.triggerses = triggerses;
		this.triggerDependsesForTriggeridDown = triggerDependsesForTriggeridDown;
		this.triggerDependsesForTriggeridUp = triggerDependsesForTriggeridUp;
		this.serviceses = serviceses;
	}

	@Id
	@Column(name = "triggerid", unique = true, nullable = false)
	public long getTriggerid() {
		return this.triggerid;
	}

	public void setTriggerid(long triggerid) {
		this.triggerid = triggerid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "templateid")
	public Triggers getTriggers() {
		return this.triggers;
	}

	public void setTriggers(Triggers triggers) {
		this.triggers = triggers;
	}

	@Column(name = "expression", nullable = false)
	public String getExpression() {
		return this.expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	@Column(name = "description", nullable = false)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "url", nullable = false)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "status", nullable = false)
	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Column(name = "value", nullable = false)
	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Column(name = "priority", nullable = false)
	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Column(name = "lastchange", nullable = false)
	public int getLastchange() {
		return this.lastchange;
	}

	public void setLastchange(int lastchange) {
		this.lastchange = lastchange;
	}

	@Column(name = "comments", nullable = false, length = 65535)
	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Column(name = "error", nullable = false, length = 128)
	public String getError() {
		return this.error;
	}

	public void setError(String error) {
		this.error = error;
	}

	@Column(name = "type", nullable = false)
	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Column(name = "value_flags", nullable = false)
	public int getValueFlags() {
		return this.valueFlags;
	}

	public void setValueFlags(int valueFlags) {
		this.valueFlags = valueFlags;
	}

	@Column(name = "flags", nullable = false)
	public int getFlags() {
		return this.flags;
	}

	public void setFlags(int flags) {
		this.flags = flags;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "triggersByParentTriggerid")
	public Set<TriggerDiscovery> getTriggerDiscoveriesForParentTriggerid() {
		return this.triggerDiscoveriesForParentTriggerid;
	}

	public void setTriggerDiscoveriesForParentTriggerid(Set<TriggerDiscovery> triggerDiscoveriesForParentTriggerid) {
		this.triggerDiscoveriesForParentTriggerid = triggerDiscoveriesForParentTriggerid;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "triggersByTriggerid")
	public Set<TriggerDiscovery> getTriggerDiscoveriesForTriggerid() {
		return this.triggerDiscoveriesForTriggerid;
	}

	public void setTriggerDiscoveriesForTriggerid(Set<TriggerDiscovery> triggerDiscoveriesForTriggerid) {
		this.triggerDiscoveriesForTriggerid = triggerDiscoveriesForTriggerid;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "triggers")
	public Set<Functions> getFunctionses() {
		return this.functionses;
	}

	public void setFunctionses(Set<Functions> functionses) {
		this.functionses = functionses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "triggers")
	public Set<SysmapsLinkTriggers> getSysmapsLinkTriggerses() {
		return this.sysmapsLinkTriggerses;
	}

	public void setSysmapsLinkTriggerses(Set<SysmapsLinkTriggers> sysmapsLinkTriggerses) {
		this.sysmapsLinkTriggerses = sysmapsLinkTriggerses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "triggers")
	public Set<Triggers> getTriggerses() {
		return this.triggerses;
	}

	public void setTriggerses(Set<Triggers> triggerses) {
		this.triggerses = triggerses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "triggersByTriggeridDown")
	public Set<TriggerDepends> getTriggerDependsesForTriggeridDown() {
		return this.triggerDependsesForTriggeridDown;
	}

	public void setTriggerDependsesForTriggeridDown(Set<TriggerDepends> triggerDependsesForTriggeridDown) {
		this.triggerDependsesForTriggeridDown = triggerDependsesForTriggeridDown;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "triggersByTriggeridUp")
	public Set<TriggerDepends> getTriggerDependsesForTriggeridUp() {
		return this.triggerDependsesForTriggeridUp;
	}

	public void setTriggerDependsesForTriggeridUp(Set<TriggerDepends> triggerDependsesForTriggeridUp) {
		this.triggerDependsesForTriggeridUp = triggerDependsesForTriggeridUp;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "triggers")
	public Set<Services> getServiceses() {
		return this.serviceses;
	}

	public void setServiceses(Set<Services> serviceses) {
		this.serviceses = serviceses;
	}

}