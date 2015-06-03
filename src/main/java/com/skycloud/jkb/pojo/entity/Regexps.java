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
 * Regexps generated by hbm2java
 */
@Entity
@Table(name = "regexps", catalog = "skycloud")
public class Regexps implements java.io.Serializable {

	private long regexpid;
	private String name;
	private String testString;
	private Set<Expressions> expressionses = new HashSet<Expressions>(0);

	public Regexps() {
	}

	public Regexps(long regexpid, String name, String testString) {
		this.regexpid = regexpid;
		this.name = name;
		this.testString = testString;
	}

	public Regexps(long regexpid, String name, String testString, Set<Expressions> expressionses) {
		this.regexpid = regexpid;
		this.name = name;
		this.testString = testString;
		this.expressionses = expressionses;
	}

	@Id
	@Column(name = "regexpid", unique = true, nullable = false)
	public long getRegexpid() {
		return this.regexpid;
	}

	public void setRegexpid(long regexpid) {
		this.regexpid = regexpid;
	}

	@Column(name = "name", nullable = false, length = 128)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "test_string", nullable = false, length = 65535)
	public String getTestString() {
		return this.testString;
	}

	public void setTestString(String testString) {
		this.testString = testString;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "regexps")
	public Set<Expressions> getExpressionses() {
		return this.expressionses;
	}

	public void setExpressionses(Set<Expressions> expressionses) {
		this.expressionses = expressionses;
	}

}
