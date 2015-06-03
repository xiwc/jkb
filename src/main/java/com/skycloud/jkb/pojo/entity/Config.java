package com.skycloud.jkb.pojo.entity;

// Generated 2013-12-31 14:44:24 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Config generated by hbm2java
 */
@Entity
@Table(name = "config", catalog = "skycloud")
public class Config implements java.io.Serializable {

	private long configid;
	private Groups groups;
	private Usrgrp usrgrp;
	private int alertHistory;
	private int eventHistory;
	private int refreshUnsupported;
	private String workPeriod;
	private int eventAckEnable;
	private int eventExpire;
	private int eventShowMax;
	private String defaultTheme;
	private int authenticationType;
	private String ldapHost;
	private int ldapPort;
	private String ldapBaseDn;
	private String ldapBindDn;
	private String ldapBindPassword;
	private String ldapSearchAttribute;
	private int dropdownFirstEntry;
	private int dropdownFirstRemember;
	private int maxInTable;
	private int searchLimit;
	private String severityColor0;
	private String severityColor1;
	private String severityColor2;
	private String severityColor3;
	private String severityColor4;
	private String severityColor5;
	private String severityName0;
	private String severityName1;
	private String severityName2;
	private String severityName3;
	private String severityName4;
	private String severityName5;
	private int okPeriod;
	private int blinkPeriod;
	private String problemUnackColor;
	private String problemAckColor;
	private String okUnackColor;
	private String okAckColor;
	private int problemUnackStyle;
	private int problemAckStyle;
	private int okUnackStyle;
	private int okAckStyle;
	private int snmptrapLogging;
	private int serverCheckInterval;

	public Config() {
	}

	public Config(long configid, Groups groups, int alertHistory, int eventHistory, int refreshUnsupported,
			String workPeriod, int eventAckEnable, int eventExpire, int eventShowMax, String defaultTheme,
			int authenticationType, String ldapHost, int ldapPort, String ldapBaseDn, String ldapBindDn,
			String ldapBindPassword, String ldapSearchAttribute, int dropdownFirstEntry, int dropdownFirstRemember,
			int maxInTable, int searchLimit, String severityColor0, String severityColor1, String severityColor2,
			String severityColor3, String severityColor4, String severityColor5, String severityName0,
			String severityName1, String severityName2, String severityName3, String severityName4,
			String severityName5, int okPeriod, int blinkPeriod, String problemUnackColor, String problemAckColor,
			String okUnackColor, String okAckColor, int problemUnackStyle, int problemAckStyle, int okUnackStyle,
			int okAckStyle, int snmptrapLogging, int serverCheckInterval) {
		this.configid = configid;
		this.groups = groups;
		this.alertHistory = alertHistory;
		this.eventHistory = eventHistory;
		this.refreshUnsupported = refreshUnsupported;
		this.workPeriod = workPeriod;
		this.eventAckEnable = eventAckEnable;
		this.eventExpire = eventExpire;
		this.eventShowMax = eventShowMax;
		this.defaultTheme = defaultTheme;
		this.authenticationType = authenticationType;
		this.ldapHost = ldapHost;
		this.ldapPort = ldapPort;
		this.ldapBaseDn = ldapBaseDn;
		this.ldapBindDn = ldapBindDn;
		this.ldapBindPassword = ldapBindPassword;
		this.ldapSearchAttribute = ldapSearchAttribute;
		this.dropdownFirstEntry = dropdownFirstEntry;
		this.dropdownFirstRemember = dropdownFirstRemember;
		this.maxInTable = maxInTable;
		this.searchLimit = searchLimit;
		this.severityColor0 = severityColor0;
		this.severityColor1 = severityColor1;
		this.severityColor2 = severityColor2;
		this.severityColor3 = severityColor3;
		this.severityColor4 = severityColor4;
		this.severityColor5 = severityColor5;
		this.severityName0 = severityName0;
		this.severityName1 = severityName1;
		this.severityName2 = severityName2;
		this.severityName3 = severityName3;
		this.severityName4 = severityName4;
		this.severityName5 = severityName5;
		this.okPeriod = okPeriod;
		this.blinkPeriod = blinkPeriod;
		this.problemUnackColor = problemUnackColor;
		this.problemAckColor = problemAckColor;
		this.okUnackColor = okUnackColor;
		this.okAckColor = okAckColor;
		this.problemUnackStyle = problemUnackStyle;
		this.problemAckStyle = problemAckStyle;
		this.okUnackStyle = okUnackStyle;
		this.okAckStyle = okAckStyle;
		this.snmptrapLogging = snmptrapLogging;
		this.serverCheckInterval = serverCheckInterval;
	}

	public Config(long configid, Groups groups, Usrgrp usrgrp, int alertHistory, int eventHistory,
			int refreshUnsupported, String workPeriod, int eventAckEnable, int eventExpire, int eventShowMax,
			String defaultTheme, int authenticationType, String ldapHost, int ldapPort, String ldapBaseDn,
			String ldapBindDn, String ldapBindPassword, String ldapSearchAttribute, int dropdownFirstEntry,
			int dropdownFirstRemember, int maxInTable, int searchLimit, String severityColor0, String severityColor1,
			String severityColor2, String severityColor3, String severityColor4, String severityColor5,
			String severityName0, String severityName1, String severityName2, String severityName3,
			String severityName4, String severityName5, int okPeriod, int blinkPeriod, String problemUnackColor,
			String problemAckColor, String okUnackColor, String okAckColor, int problemUnackStyle, int problemAckStyle,
			int okUnackStyle, int okAckStyle, int snmptrapLogging, int serverCheckInterval) {
		this.configid = configid;
		this.groups = groups;
		this.usrgrp = usrgrp;
		this.alertHistory = alertHistory;
		this.eventHistory = eventHistory;
		this.refreshUnsupported = refreshUnsupported;
		this.workPeriod = workPeriod;
		this.eventAckEnable = eventAckEnable;
		this.eventExpire = eventExpire;
		this.eventShowMax = eventShowMax;
		this.defaultTheme = defaultTheme;
		this.authenticationType = authenticationType;
		this.ldapHost = ldapHost;
		this.ldapPort = ldapPort;
		this.ldapBaseDn = ldapBaseDn;
		this.ldapBindDn = ldapBindDn;
		this.ldapBindPassword = ldapBindPassword;
		this.ldapSearchAttribute = ldapSearchAttribute;
		this.dropdownFirstEntry = dropdownFirstEntry;
		this.dropdownFirstRemember = dropdownFirstRemember;
		this.maxInTable = maxInTable;
		this.searchLimit = searchLimit;
		this.severityColor0 = severityColor0;
		this.severityColor1 = severityColor1;
		this.severityColor2 = severityColor2;
		this.severityColor3 = severityColor3;
		this.severityColor4 = severityColor4;
		this.severityColor5 = severityColor5;
		this.severityName0 = severityName0;
		this.severityName1 = severityName1;
		this.severityName2 = severityName2;
		this.severityName3 = severityName3;
		this.severityName4 = severityName4;
		this.severityName5 = severityName5;
		this.okPeriod = okPeriod;
		this.blinkPeriod = blinkPeriod;
		this.problemUnackColor = problemUnackColor;
		this.problemAckColor = problemAckColor;
		this.okUnackColor = okUnackColor;
		this.okAckColor = okAckColor;
		this.problemUnackStyle = problemUnackStyle;
		this.problemAckStyle = problemAckStyle;
		this.okUnackStyle = okUnackStyle;
		this.okAckStyle = okAckStyle;
		this.snmptrapLogging = snmptrapLogging;
		this.serverCheckInterval = serverCheckInterval;
	}

	@Id
	@Column(name = "configid", unique = true, nullable = false)
	public long getConfigid() {
		return this.configid;
	}

	public void setConfigid(long configid) {
		this.configid = configid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "discovery_groupid", nullable = false)
	public Groups getGroups() {
		return this.groups;
	}

	public void setGroups(Groups groups) {
		this.groups = groups;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "alert_usrgrpid")
	public Usrgrp getUsrgrp() {
		return this.usrgrp;
	}

	public void setUsrgrp(Usrgrp usrgrp) {
		this.usrgrp = usrgrp;
	}

	@Column(name = "alert_history", nullable = false)
	public int getAlertHistory() {
		return this.alertHistory;
	}

	public void setAlertHistory(int alertHistory) {
		this.alertHistory = alertHistory;
	}

	@Column(name = "event_history", nullable = false)
	public int getEventHistory() {
		return this.eventHistory;
	}

	public void setEventHistory(int eventHistory) {
		this.eventHistory = eventHistory;
	}

	@Column(name = "refresh_unsupported", nullable = false)
	public int getRefreshUnsupported() {
		return this.refreshUnsupported;
	}

	public void setRefreshUnsupported(int refreshUnsupported) {
		this.refreshUnsupported = refreshUnsupported;
	}

	@Column(name = "work_period", nullable = false, length = 100)
	public String getWorkPeriod() {
		return this.workPeriod;
	}

	public void setWorkPeriod(String workPeriod) {
		this.workPeriod = workPeriod;
	}

	@Column(name = "event_ack_enable", nullable = false)
	public int getEventAckEnable() {
		return this.eventAckEnable;
	}

	public void setEventAckEnable(int eventAckEnable) {
		this.eventAckEnable = eventAckEnable;
	}

	@Column(name = "event_expire", nullable = false)
	public int getEventExpire() {
		return this.eventExpire;
	}

	public void setEventExpire(int eventExpire) {
		this.eventExpire = eventExpire;
	}

	@Column(name = "event_show_max", nullable = false)
	public int getEventShowMax() {
		return this.eventShowMax;
	}

	public void setEventShowMax(int eventShowMax) {
		this.eventShowMax = eventShowMax;
	}

	@Column(name = "default_theme", nullable = false, length = 128)
	public String getDefaultTheme() {
		return this.defaultTheme;
	}

	public void setDefaultTheme(String defaultTheme) {
		this.defaultTheme = defaultTheme;
	}

	@Column(name = "authentication_type", nullable = false)
	public int getAuthenticationType() {
		return this.authenticationType;
	}

	public void setAuthenticationType(int authenticationType) {
		this.authenticationType = authenticationType;
	}

	@Column(name = "ldap_host", nullable = false)
	public String getLdapHost() {
		return this.ldapHost;
	}

	public void setLdapHost(String ldapHost) {
		this.ldapHost = ldapHost;
	}

	@Column(name = "ldap_port", nullable = false)
	public int getLdapPort() {
		return this.ldapPort;
	}

	public void setLdapPort(int ldapPort) {
		this.ldapPort = ldapPort;
	}

	@Column(name = "ldap_base_dn", nullable = false)
	public String getLdapBaseDn() {
		return this.ldapBaseDn;
	}

	public void setLdapBaseDn(String ldapBaseDn) {
		this.ldapBaseDn = ldapBaseDn;
	}

	@Column(name = "ldap_bind_dn", nullable = false)
	public String getLdapBindDn() {
		return this.ldapBindDn;
	}

	public void setLdapBindDn(String ldapBindDn) {
		this.ldapBindDn = ldapBindDn;
	}

	@Column(name = "ldap_bind_password", nullable = false, length = 128)
	public String getLdapBindPassword() {
		return this.ldapBindPassword;
	}

	public void setLdapBindPassword(String ldapBindPassword) {
		this.ldapBindPassword = ldapBindPassword;
	}

	@Column(name = "ldap_search_attribute", nullable = false, length = 128)
	public String getLdapSearchAttribute() {
		return this.ldapSearchAttribute;
	}

	public void setLdapSearchAttribute(String ldapSearchAttribute) {
		this.ldapSearchAttribute = ldapSearchAttribute;
	}

	@Column(name = "dropdown_first_entry", nullable = false)
	public int getDropdownFirstEntry() {
		return this.dropdownFirstEntry;
	}

	public void setDropdownFirstEntry(int dropdownFirstEntry) {
		this.dropdownFirstEntry = dropdownFirstEntry;
	}

	@Column(name = "dropdown_first_remember", nullable = false)
	public int getDropdownFirstRemember() {
		return this.dropdownFirstRemember;
	}

	public void setDropdownFirstRemember(int dropdownFirstRemember) {
		this.dropdownFirstRemember = dropdownFirstRemember;
	}

	@Column(name = "max_in_table", nullable = false)
	public int getMaxInTable() {
		return this.maxInTable;
	}

	public void setMaxInTable(int maxInTable) {
		this.maxInTable = maxInTable;
	}

	@Column(name = "search_limit", nullable = false)
	public int getSearchLimit() {
		return this.searchLimit;
	}

	public void setSearchLimit(int searchLimit) {
		this.searchLimit = searchLimit;
	}

	@Column(name = "severity_color_0", nullable = false, length = 6)
	public String getSeverityColor0() {
		return this.severityColor0;
	}

	public void setSeverityColor0(String severityColor0) {
		this.severityColor0 = severityColor0;
	}

	@Column(name = "severity_color_1", nullable = false, length = 6)
	public String getSeverityColor1() {
		return this.severityColor1;
	}

	public void setSeverityColor1(String severityColor1) {
		this.severityColor1 = severityColor1;
	}

	@Column(name = "severity_color_2", nullable = false, length = 6)
	public String getSeverityColor2() {
		return this.severityColor2;
	}

	public void setSeverityColor2(String severityColor2) {
		this.severityColor2 = severityColor2;
	}

	@Column(name = "severity_color_3", nullable = false, length = 6)
	public String getSeverityColor3() {
		return this.severityColor3;
	}

	public void setSeverityColor3(String severityColor3) {
		this.severityColor3 = severityColor3;
	}

	@Column(name = "severity_color_4", nullable = false, length = 6)
	public String getSeverityColor4() {
		return this.severityColor4;
	}

	public void setSeverityColor4(String severityColor4) {
		this.severityColor4 = severityColor4;
	}

	@Column(name = "severity_color_5", nullable = false, length = 6)
	public String getSeverityColor5() {
		return this.severityColor5;
	}

	public void setSeverityColor5(String severityColor5) {
		this.severityColor5 = severityColor5;
	}

	@Column(name = "severity_name_0", nullable = false, length = 32)
	public String getSeverityName0() {
		return this.severityName0;
	}

	public void setSeverityName0(String severityName0) {
		this.severityName0 = severityName0;
	}

	@Column(name = "severity_name_1", nullable = false, length = 32)
	public String getSeverityName1() {
		return this.severityName1;
	}

	public void setSeverityName1(String severityName1) {
		this.severityName1 = severityName1;
	}

	@Column(name = "severity_name_2", nullable = false, length = 32)
	public String getSeverityName2() {
		return this.severityName2;
	}

	public void setSeverityName2(String severityName2) {
		this.severityName2 = severityName2;
	}

	@Column(name = "severity_name_3", nullable = false, length = 32)
	public String getSeverityName3() {
		return this.severityName3;
	}

	public void setSeverityName3(String severityName3) {
		this.severityName3 = severityName3;
	}

	@Column(name = "severity_name_4", nullable = false, length = 32)
	public String getSeverityName4() {
		return this.severityName4;
	}

	public void setSeverityName4(String severityName4) {
		this.severityName4 = severityName4;
	}

	@Column(name = "severity_name_5", nullable = false, length = 32)
	public String getSeverityName5() {
		return this.severityName5;
	}

	public void setSeverityName5(String severityName5) {
		this.severityName5 = severityName5;
	}

	@Column(name = "ok_period", nullable = false)
	public int getOkPeriod() {
		return this.okPeriod;
	}

	public void setOkPeriod(int okPeriod) {
		this.okPeriod = okPeriod;
	}

	@Column(name = "blink_period", nullable = false)
	public int getBlinkPeriod() {
		return this.blinkPeriod;
	}

	public void setBlinkPeriod(int blinkPeriod) {
		this.blinkPeriod = blinkPeriod;
	}

	@Column(name = "problem_unack_color", nullable = false, length = 6)
	public String getProblemUnackColor() {
		return this.problemUnackColor;
	}

	public void setProblemUnackColor(String problemUnackColor) {
		this.problemUnackColor = problemUnackColor;
	}

	@Column(name = "problem_ack_color", nullable = false, length = 6)
	public String getProblemAckColor() {
		return this.problemAckColor;
	}

	public void setProblemAckColor(String problemAckColor) {
		this.problemAckColor = problemAckColor;
	}

	@Column(name = "ok_unack_color", nullable = false, length = 6)
	public String getOkUnackColor() {
		return this.okUnackColor;
	}

	public void setOkUnackColor(String okUnackColor) {
		this.okUnackColor = okUnackColor;
	}

	@Column(name = "ok_ack_color", nullable = false, length = 6)
	public String getOkAckColor() {
		return this.okAckColor;
	}

	public void setOkAckColor(String okAckColor) {
		this.okAckColor = okAckColor;
	}

	@Column(name = "problem_unack_style", nullable = false)
	public int getProblemUnackStyle() {
		return this.problemUnackStyle;
	}

	public void setProblemUnackStyle(int problemUnackStyle) {
		this.problemUnackStyle = problemUnackStyle;
	}

	@Column(name = "problem_ack_style", nullable = false)
	public int getProblemAckStyle() {
		return this.problemAckStyle;
	}

	public void setProblemAckStyle(int problemAckStyle) {
		this.problemAckStyle = problemAckStyle;
	}

	@Column(name = "ok_unack_style", nullable = false)
	public int getOkUnackStyle() {
		return this.okUnackStyle;
	}

	public void setOkUnackStyle(int okUnackStyle) {
		this.okUnackStyle = okUnackStyle;
	}

	@Column(name = "ok_ack_style", nullable = false)
	public int getOkAckStyle() {
		return this.okAckStyle;
	}

	public void setOkAckStyle(int okAckStyle) {
		this.okAckStyle = okAckStyle;
	}

	@Column(name = "snmptrap_logging", nullable = false)
	public int getSnmptrapLogging() {
		return this.snmptrapLogging;
	}

	public void setSnmptrapLogging(int snmptrapLogging) {
		this.snmptrapLogging = snmptrapLogging;
	}

	@Column(name = "server_check_interval", nullable = false)
	public int getServerCheckInterval() {
		return this.serverCheckInterval;
	}

	public void setServerCheckInterval(int serverCheckInterval) {
		this.serverCheckInterval = serverCheckInterval;
	}

}