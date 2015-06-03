/**
 * IAppServiceDao.java
 */
package com.skycloud.jkb.dao;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.skycloud.jkb.pojo.model.AppService;

/**
 * 【应用服务】持久化接口层.
 * 
 * @creation 2014年01月15日 03:56:46
 * @modification 2014年01月15日 03:56:46
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
public interface IAppServiceDao {

	/**
	 * 查询【应用服务】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 03:56:46
	 * @modification 2014年01月15日 03:56:46
	 * @param locale
	 * @param appService
	 * @param start
	 * @param limit
	 * @return
	 */
	List<Map<String, Object>> query(Locale locale, AppService appService, Long start, Long limit);

	/**
	 * 查询总数查询【应用服务】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 03:56:46
	 * @modification 2014年01月15日 03:56:46
	 * @param locale
	 * @param appService
	 * @return
	 */
	long queryCount(Locale locale, AppService appService);
	
}
