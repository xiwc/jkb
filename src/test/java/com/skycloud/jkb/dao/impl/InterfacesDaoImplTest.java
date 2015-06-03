package com.skycloud.jkb.dao.impl;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.skycloud.jkb.base.BaseDaoTest;
import com.skycloud.jkb.dao.IInterfacesDao;

public class InterfacesDaoImplTest extends BaseDaoTest {

	@Autowired
	IInterfacesDao interfacesDao;

	@Test
	public void testQueryByHostId() {
		Assert.assertNotNull(interfacesDao.queryByHostId(10971L));

	}

}
