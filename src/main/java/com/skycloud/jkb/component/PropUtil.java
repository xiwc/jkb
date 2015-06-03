package com.skycloud.jkb.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 对配置属性文件的读取.
 * 
 * @creation 2014年3月31日 下午1:54:18
 * @modification 2014年3月31日 下午1:54:18
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Component
public class PropUtil {

	@Value("#{systemProperties['api.url']}")
	private String apiUrl;

	@Value("#{systemProperties['jkb.api.url']}")
	private String jbkApiUrl;

	@Value("#{systemProperties['zabbix.api.login.userid']}")
	private String zabbixApiLoginUserId;

	@Value("#{systemProperties['zabbix.api.login.password']}")
	private String zabbixApiLoginPassword;

	@Value("#{systemProperties['default.agent.port']}")
	private String defaultAgentPort;

	@Value("#{systemProperties['default.windows.server.tpl.id']}")
	private String defaultWinServerTplId;

	@Value("#{systemProperties['default.linux.server.tpl.id']}")
	private String defaultLinuxServerTplId;

	@Value("#{systemProperties['default.host.group.id']}")
	private String defaultHostGroupId;

	public String getApiUrl() {
		return apiUrl;
	}

	public String getJbkApiUrl() {
		return jbkApiUrl;
	}

	public String getZabbixApiLoginUserId() {
		return zabbixApiLoginUserId;
	}

	public String getZabbixApiLoginPassword() {
		return zabbixApiLoginPassword;
	}

	public String getDefaultAgentPort() {
		return defaultAgentPort;
	}

	public String getDefaultWinServerTplId() {
		return defaultWinServerTplId;
	}

	public String getDefaultLinuxServerTplId() {
		return defaultLinuxServerTplId;
	}

	public String getDefaultHostGroupId() {
		return defaultHostGroupId;
	}

}
