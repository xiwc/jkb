/**
 * AppServiceServiceImpl.java
 */
package com.skycloud.jkb.service.impl;

import java.util.List; 
import java.util.Locale;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.skycloud.jkb.base.impl.BaseServiceImpl;
import com.skycloud.jkb.component.ApiInvoker;
import com.skycloud.jkb.dao.IAppServiceDao;
import com.skycloud.jkb.pojo.model.AppService;
import com.skycloud.jkb.pojo.vo.PageResult;
import com.skycloud.jkb.service.IAppServiceService;

/**
 * 【应用服务】业务逻辑实现.
 * 
 * @creation 2014年01月15日 03:56:46
 * @modification 2014年01月15日 03:56:46
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Service
@Transactional
public class AppServiceServiceImpl extends BaseServiceImpl implements IAppServiceService {

	private static Logger logger = Logger.getLogger(AppServiceServiceImpl.class);

	@Autowired
	IAppServiceDao appServiceDao;

	@Autowired
	ApiInvoker apiInvoker;

	@Override
	public boolean save(Locale locale, AppService appService) {
		
		logger.debug("[业务逻辑层]添加【应用服务】");
		
		// TODO
		return true;
	}

	@Override
	public boolean delete(Locale locale, AppService appService) {
		
		logger.debug("[业务逻辑层]删除【应用服务】");
		
		// TODO
		return true;
	}

	@Override
	public AppService get(Locale locale, AppService appService) {
		
		logger.debug("[业务逻辑层]获取【应用服务】");
		
		// TODO
		return null;
	}

	@Override
	public boolean update(Locale locale, AppService appService) {
		
		logger.debug("[业务逻辑层]更新【应用服务】");
		
		// TODO
		return true;
	}
	
	@Override
	public List<AppService> list(Locale locale) {

		logger.debug("[业务逻辑层]列举【应用服务】");

		// TODO
		return null;
	}
	
	@Override
	public List<Map<String, Object>> query(Locale locale, AppService appService) {

		logger.debug("[业务逻辑层]查询【应用服务】(不分页)");

		// TODO
		return null;
	}

	@Override
	public PageResult paging(Locale locale, AppService appService, Long start, Long limit) {

		logger.debug("[业务逻辑层]查询【应用服务】(分页)");

		PageResult pageResult = new PageResult();

		// TODO
		return pageResult;
	}
	
	@Override
	public boolean exists(Locale locale, AppService appService) {
		
		logger.debug("[业务逻辑层]判断【应用服务】是否存在");
		
		// TODO
		return true;
	}
	
}