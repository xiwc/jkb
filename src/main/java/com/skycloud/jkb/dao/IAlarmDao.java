/**
 * IAlarmDao.java
 */
package com.skycloud.jkb.dao;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.skycloud.jkb.pojo.model.Alarm;

/**
 * 【告警】持久化接口层.
 * 
 * @creation 2014年01月15日 03:59:48
 * @modification 2014年01月15日 03:59:48
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
public interface IAlarmDao {

	/**
	 * 查询【告警】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 03:59:48
	 * @modification 2014年01月15日 03:59:48
	 * @param locale
	 * @param alarm
	 * @param start
	 * @param limit
	 * @return
	 */
	List<Map<String, Object>> query(Locale locale, Alarm alarm, Long start, Long limit);

	/**
	 * 查询总数查询【告警】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 03:59:48
	 * @modification 2014年01月15日 03:59:48
	 * @param locale
	 * @param alarm
	 * @return
	 */
	long queryCount(Locale locale, Alarm alarm);
	
}
