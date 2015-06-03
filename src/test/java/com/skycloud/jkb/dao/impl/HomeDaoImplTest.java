/**
 * HomeDaoImplTest.java
 */
package com.skycloud.jkb.dao.impl;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.skycloud.jkb.base.BaseTest;
import com.skycloud.jkb.dao.IHomeDao;
import com.skycloud.jkb.util.MapUtil;

/**
 * 
 * 
 * @creation 2013年12月30日 下午3:28:41
 * @modification 2013年12月30日 下午3:28:41
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
public class HomeDaoImplTest extends BaseTest {

	@Autowired
	IHomeDao homeDao;

	@Test
	public void testGetOrders() {
		List<Map<String, Object>> orders = homeDao.getOrders(MapUtil.objArr2Map("customer", "xiwc"));
		Assert.assertTrue(orders.size() > 0);
	}

}
