package com.skycloud.jkb.service.impl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.skycloud.jkb.base.BaseServiceTest;
import com.skycloud.jkb.pojo.model.WebSite;
import com.skycloud.jkb.pojo.vo.PageResult;
import com.skycloud.jkb.service.IWebSiteService;

/**
 * 
 * 
 * @creation 2014年1月15日 上午10:40:56
 * @modification 2014年1月15日 上午10:40:56
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
public class WebSiteServiceImplTest extends BaseServiceTest {

	@Autowired
	IWebSiteService webSiteService;

	@Test
	public void testPaging() {
		WebSite webSite = new WebSite();
		PageResult paging = webSiteService.paging(locale, webSite, 0L, 50L);

		System.out.println(paging);
	}

}
