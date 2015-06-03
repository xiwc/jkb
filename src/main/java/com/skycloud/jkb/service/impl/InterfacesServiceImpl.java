/**
 * InterfacesServiceImpl.java
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
import com.skycloud.jkb.dao.IInterfacesDao;
import com.skycloud.jkb.pojo.model.Interfaces;
import com.skycloud.jkb.pojo.vo.PageResult;
import com.skycloud.jkb.service.IInterfacesService;

/**
 * 【网络接口】业务逻辑实现.
 * 
 * @creation 2014年04月01日 09:52:37
 * @modification 2014年04月01日 09:52:37
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Service
@Transactional
public class InterfacesServiceImpl extends BaseServiceImpl implements IInterfacesService {

	private static Logger logger = Logger.getLogger(InterfacesServiceImpl.class);

	@Autowired
	IInterfacesDao interfacesDao;

	@Autowired
	ApiInvoker apiInvoker;

	@Override
	public boolean save(Locale locale, Interfaces interfaces) {
		
		logger.debug("[业务逻辑层]添加【网络接口】");
		
		// TODO
		return true;
	}

	@Override
	public boolean delete(Locale locale, Interfaces interfaces) {
		
		logger.debug("[业务逻辑层]删除【网络接口】");
		
		// TODO
		return true;
	}

	@Override
	public Interfaces get(Locale locale, Interfaces interfaces) {
		
		logger.debug("[业务逻辑层]获取【网络接口】");
		
		// TODO
		return null;
	}

	@Override
	public boolean update(Locale locale, Interfaces interfaces) {
		
		logger.debug("[业务逻辑层]更新【网络接口】");
		
		// TODO
		return true;
	}
	
	@Override
	public List<Interfaces> list(Locale locale) {

		logger.debug("[业务逻辑层]列举【网络接口】");

		// TODO
		return null;
	}
	
	@Override
	public List<Map<String, Object>> query(Locale locale, Interfaces interfaces) {

		logger.debug("[业务逻辑层]查询【网络接口】(不分页)");

		// TODO
		return null;
	}

	@Override
	public PageResult paging(Locale locale, Interfaces interfaces, Long start, Long limit) {

		logger.debug("[业务逻辑层]查询【网络接口】(分页)");

		PageResult pageResult = new PageResult();

		// TODO
		return pageResult;
	}
	
	@Override
	public boolean exists(Locale locale, Interfaces interfaces) {
		
		logger.debug("[业务逻辑层]判断【网络接口】是否存在");
		
		// TODO
		return true;
	}
	
}