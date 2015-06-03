/**
 * UserDaoImplTest.java
 */
package com.skycloud.jkb.dao.impl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.skycloud.jkb.base.BaseDaoTest;
import com.skycloud.jkb.dao.IUserDao;

/**
 * 
 * 
 * @creation 2013年12月31日 上午11:06:39
 * @modification 2013年12月31日 上午11:06:39
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
public class UserDaoImplTest extends BaseDaoTest {

	@Autowired
	IUserDao userDao;

	@Test
	public void testExistsUser() {
		userDao.exists(locale, "xiweicheng_");
	}

}
