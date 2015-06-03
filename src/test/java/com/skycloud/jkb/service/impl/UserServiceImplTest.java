/**
 * UserServiceImplTest.java
 */
package com.skycloud.jkb.service.impl;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.skycloud.jkb.base.BaseServiceTest;
import com.skycloud.jkb.component.ZabbixApiUtil;
import com.skycloud.jkb.pojo.model.User;
import com.skycloud.jkb.service.IUserService;

/**
 * 
 * 
 * @creation 2013年12月30日 下午5:36:49
 * @modification 2013年12月30日 下午5:36:49
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
public class UserServiceImplTest extends BaseServiceTest {

	@Autowired
	IUserService userService;

	@Autowired
	ZabbixApiUtil zabbixApiUtil;

	@Test
	public void testSaveUser() {

		User user = new User();
		user.setAlias("xiweicheng");
		user.setPasswd("skycloud");
		Assert.assertTrue(userService.save(locale, user));
	}

	@Test
	public void testDeleteUser() {

		User user = new User();
		user.setAlias("xiweicheng");
		userService.delete(locale, user);
	}

}
