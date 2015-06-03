/**
 * IAlarmService.java
 */
package com.skycloud.jkb.service;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.skycloud.jkb.base.IBaseService;
import com.skycloud.jkb.pojo.model.Alarm;
import com.skycloud.jkb.pojo.vo.PageResult;

/**
 * 【告警】业务逻辑接口.
 * 
 * @creation 2014年01月15日 03:59:48
 * @modification 2014年01月15日 03:59:48
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
public interface IAlarmService extends IBaseService {

	/**
	 * 创建【告警】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 03:59:48
	 * @modification 2014年01月15日 03:59:48
	 * @param alarm
	 * @return
	 */
	boolean save(Locale locale, Alarm alarm);

	/**
	 * 删除【告警】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 03:59:48
	 * @modification 2014年01月15日 03:59:48
	 * @param alarm
	 * @return
	 */
	boolean delete(Locale locale, Alarm alarm);

	/**
	 * 获取【告警】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 03:59:48
	 * @modification 2014年01月15日 03:59:48
	 * @param alarm
	 * @return
	 */
	Alarm get(Locale locale, Alarm alarm);
	
	/**
	 * 更新【告警】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 03:59:48
	 * @modification 2014年01月15日 03:59:48
	 * @param alarm
	 * @return
	 */
	boolean update(Locale locale, Alarm alarm);
	
	/**
	 * 列举【告警】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 03:59:48
	 * @modification 2014年01月15日 03:59:48
	 * @param alarm
	 * @return
	 */
	List<Alarm> list(Locale locale);

	/**
	 * 查询【告警】(不分页).
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 03:59:48
	 * @modification 2014年01月15日 03:59:48
	 * @param alarm
	 * @return
	 */
	List<Map<String, Object>> query(Locale locale, Alarm alarm);

	/**
	 * 查询【告警】(分页).
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 03:59:48
	 * @modification 2014年01月15日 03:59:48
	 * @param alarm
	 * @return
	 */
	PageResult paging(Locale locale, Alarm alarm, Long start, Long limit);

	/**
	 * 判断【告警】是否存在.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 03:59:48
	 * @modification 2014年01月15日 03:59:48
	 * @param alarm
	 * @return
	 */
	boolean exists(Locale locale, Alarm alarm);
}
