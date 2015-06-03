/**
 * BaseServiceTest.java
 */
package com.skycloud.jkb.base;

import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.web.WebAppConfiguration;

import com.skycloud.jkb.component.ApiInvoker;
import com.skycloud.jkb.component.ZabbixApiUtil;

/**
 * api调用测试基类.
 * 
 * @creation 2013年12月26日 下午3:44:55
 * @modification 2013年12月26日 下午3:44:55
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@WebAppConfiguration
public class BaseApiTest extends BaseTest {

	@Autowired
	ZabbixApiUtil zabbixApiUtil;

	@Autowired
	protected ApiInvoker apiInvoker;

	@Before
	public void setup() {
		zabbixApiUtil.login();
	}
}
