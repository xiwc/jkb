/**
 * ZabbixUserLoginInterceptor.java
 */
package com.skycloud.jkb.component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 拦截请求,进行zabbix登录认证取得会话id,以便zabbix需要授权的接口调用. //TODO 每次请求都认证 是不是太频繁,考虑改进方案.
 * 
 * 
 * @creation 2013年12月30日 下午6:20:17
 * @modification 2013年12月30日 下午6:20:17
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Component
public class ZabbixUserLoginInterceptor extends HandlerInterceptorAdapter {

	@Autowired
	ZabbixApiUtil zabbixApiUtil;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		zabbixApiUtil.login();
		return super.preHandle(request, response, handler);
	}

}
