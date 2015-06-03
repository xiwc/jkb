/**
 * AlarmServiceImpl.java
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
import com.skycloud.jkb.dao.IAlarmDao;
import com.skycloud.jkb.pojo.model.Alarm;
import com.skycloud.jkb.pojo.vo.PageResult;
import com.skycloud.jkb.service.IAlarmService;

/**
 * 【告警】业务逻辑实现.
 * 
 * @creation 2014年01月15日 03:59:48
 * @modification 2014年01月15日 03:59:48
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Service
@Transactional
public class AlarmServiceImpl extends BaseServiceImpl implements IAlarmService {

	private static Logger logger = Logger.getLogger(AlarmServiceImpl.class);

	@Autowired
	IAlarmDao alarmDao;

	@Autowired
	ApiInvoker apiInvoker;

	@Override
	public boolean save(Locale locale, Alarm alarm) {
		
		logger.debug("[业务逻辑层]添加【告警】");
		
		// TODO
		return true;
	}

	@Override
	public boolean delete(Locale locale, Alarm alarm) {
		
		logger.debug("[业务逻辑层]删除【告警】");
		
		// TODO
		return true;
	}

	@Override
	public Alarm get(Locale locale, Alarm alarm) {
		
		logger.debug("[业务逻辑层]获取【告警】");
		
		// TODO
		return null;
	}

	@Override
	public boolean update(Locale locale, Alarm alarm) {
		
		logger.debug("[业务逻辑层]更新【告警】");
		
		// TODO
		return true;
	}
	
	@Override
	public List<Alarm> list(Locale locale) {

		logger.debug("[业务逻辑层]列举【告警】");

		// TODO
		return null;
	}
	
	@Override
	public List<Map<String, Object>> query(Locale locale, Alarm alarm) {

		logger.debug("[业务逻辑层]查询【告警】(不分页)");

		// TODO
		return null;
	}

	@Override
	public PageResult paging(Locale locale, Alarm alarm, Long start, Long limit) {

		logger.debug("[业务逻辑层]查询【告警】(分页)");

		PageResult pageResult = new PageResult();
	
		long AlarmTotal = alarmDao.queryCount(locale, alarm);
		List<Map<String, Object>> alarmList = alarmDao.query(locale, alarm, start, limit);
		
		pageResult.setList(alarmList);
		pageResult.setTotal(AlarmTotal);

		// TODO
		return pageResult;
	}
	
	@Override
	public boolean exists(Locale locale, Alarm alarm) {
		
		logger.debug("[业务逻辑层]判断【告警】是否存在");
		
		// TODO
		return true;
	}
	
}