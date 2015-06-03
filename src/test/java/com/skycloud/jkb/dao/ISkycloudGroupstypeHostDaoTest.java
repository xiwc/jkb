package com.skycloud.jkb.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.skycloud.jkb.base.BaseDaoTest;

/**
 * 
 * 
 * @creation 2014年1月15日 下午1:52:42
 * @modification 2014年1月15日 下午1:52:42
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
public class ISkycloudGroupstypeHostDaoTest extends BaseDaoTest {

	@Autowired
	ISkycloudGroupstypeHostDao skycloudGroupstypeHostDao;

	@Test
	public void test() {
		Boolean deleteByhostId = skycloudGroupstypeHostDao.deleteByhostId("111");

		System.out.println(deleteByhostId);
	}

}
