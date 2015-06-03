/**
 * WebSite.java
 */
package com.skycloud.jkb.pojo.model;

import java.io.Serializable;

import com.skycloud.jkb.pojo.entity.Hosts;

/**
 * Web站点请求参数.
 * 
 * @creation 2014年01月02日 06:24:49
 * @modification 2014年01月02日 06:24:49
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
public class WebSite extends Hosts implements Serializable {

	/** serialVersionUID [long] */
	private static final long serialVersionUID = 3018799654022753723L;
	/** url [String] URL */
	private String url;
	/** groupId [String] 监控组ID */
	private String groupId;
	/** requestMethod [String] HTTP请求方法 */
	private String requestMethod;
	/** responseMatchContent [String] 匹配响应内容 */
	private String responseMatchContent;
	/** matchType [String] 匹配方式 */
	private String matchType;
	/** cookies [String] Cookies */
	private String cookies;
	/** requestHeaders [String] HTTP请求头信息 */
	private String requestHeaders;
	/** authUsername [String] HTTP验证用户名 */
	private String authUsername;
	/** authPassword [String] HTTP验证密码 */
	private String authPassword;
	/** serverIp [String] 服务器IP */
	private String serverIp;
	/** isRedirect [String] 是否重定向 */
	private String isRedirect;
	/** freq [String] 监控频率 */
	private String freq;
	/** repeat [String] 重试几次后告警 */
	private String repeat;
	/** sequence [String] 连续告警提醒 */
	private String sequence;
	/** isSnapshot [String] 记录节点故障快照 */
	private String isSnapshot;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getRequestMethod() {
		return requestMethod;
	}

	public void setRequestMethod(String requestMethod) {
		this.requestMethod = requestMethod;
	}

	public String getResponseMatchContent() {
		return responseMatchContent;
	}

	public void setResponseMatchContent(String responseMatchContent) {
		this.responseMatchContent = responseMatchContent;
	}

	public String getMatchType() {
		return matchType;
	}

	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}

	public String getCookies() {
		return cookies;
	}

	public void setCookies(String cookies) {
		this.cookies = cookies;
	}

	public String getRequestHeaders() {
		return requestHeaders;
	}

	public void setRequestHeaders(String requestHeaders) {
		this.requestHeaders = requestHeaders;
	}

	public String getAuthUsername() {
		return authUsername;
	}

	public void setAuthUsername(String authUsername) {
		this.authUsername = authUsername;
	}

	public String getAuthPassword() {
		return authPassword;
	}

	public void setAuthPassword(String authPassword) {
		this.authPassword = authPassword;
	}

	public String getServerIp() {
		return serverIp;
	}

	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}

	public String getIsRedirect() {
		return isRedirect;
	}

	public void setIsRedirect(String isRedirect) {
		this.isRedirect = isRedirect;
	}

	public String getFreq() {
		return freq;
	}

	public void setFreq(String freq) {
		this.freq = freq;
	}

	public String getRepeat() {
		return repeat;
	}

	public void setRepeat(String repeat) {
		this.repeat = repeat;
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public String getIsSnapshot() {
		return isSnapshot;
	}

	public void setIsSnapshot(String isSnapshot) {
		this.isSnapshot = isSnapshot;
	}

}
