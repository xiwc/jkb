/**
 * ZabbixApiUtil.java
 */
package com.skycloud.jkb.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.skycloud.api.domain.user.UserLoginRequest;
import com.skycloud.api.domain.user.UserLoginRequest.UserLoginParamsParams;
import com.skycloud.jkb.pojo.vo.ApiResult;
import com.skycloud.jkb.pojo.vo.SysConfig;

/**
 * zabbix api调用工具类.
 * 
 * @creation 2013年12月30日 下午6:07:04
 * @modification 2013年12月30日 下午6:07:04
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Component
public class ZabbixApiUtil {

	@Autowired
	PropUtil propUtil;

	@Autowired
	ApiInvoker apiInvoker;

	protected ZabbixApiUtil() {
	}

	/**
	 * zabbix默认用户登录.
	 * 
	 * @author xiweicheng
	 * @creation 2013年12月30日 下午6:16:15
	 * @modification 2013年12月30日 下午6:16:15
	 * @return
	 */
	public String login() {
		UserLoginRequest userLoginRequest = new UserLoginRequest();
		UserLoginParamsParams params = userLoginRequest.getParams();
		params.setUser(propUtil.getZabbixApiLoginUserId());
		params.setPassword(propUtil.getZabbixApiLoginPassword());

		ApiResult invoke = apiInvoker.invoke(userLoginRequest);

		if (invoke.failed()) {
			throw new RuntimeException("zabbix user login failed!");
		}

		String sessionid = invoke.getStringResult();

		SysConfig.sessionid = sessionid;

		return sessionid;
	}

}
