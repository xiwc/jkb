/**
 * IAppServiceService.java
 */
package com.skycloud.jkb.service;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.skycloud.jkb.base.IBaseService;
import com.skycloud.jkb.pojo.model.AppService;
import com.skycloud.jkb.pojo.vo.PageResult;

/**
 * 【应用服务】业务逻辑接口.
 * 
 * @creation 2014年01月15日 03:56:46
 * @modification 2014年01月15日 03:56:46
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
public interface IAppServiceService extends IBaseService {

	/**
	 * 创建【应用服务】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 03:56:46
	 * @modification 2014年01月15日 03:56:46
	 * @param appService
	 * @return
	 */
	boolean save(Locale locale, AppService appService);

	/**
	 * 删除【应用服务】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 03:56:46
	 * @modification 2014年01月15日 03:56:46
	 * @param appService
	 * @return
	 */
	boolean delete(Locale locale, AppService appService);

	/**
	 * 获取【应用服务】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 03:56:46
	 * @modification 2014年01月15日 03:56:46
	 * @param appService
	 * @return
	 */
	AppService get(Locale locale, AppService appService);
	
	/**
	 * 更新【应用服务】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 03:56:46
	 * @modification 2014年01月15日 03:56:46
	 * @param appService
	 * @return
	 */
	boolean update(Locale locale, AppService appService);
	
	/**
	 * 列举【应用服务】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 03:56:46
	 * @modification 2014年01月15日 03:56:46
	 * @param appService
	 * @return
	 */
	List<AppService> list(Locale locale);

	/**
	 * 查询【应用服务】(不分页).
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 03:56:46
	 * @modification 2014年01月15日 03:56:46
	 * @param appService
	 * @return
	 */
	List<Map<String, Object>> query(Locale locale, AppService appService);

	/**
	 * 查询【应用服务】(分页).
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 03:56:46
	 * @modification 2014年01月15日 03:56:46
	 * @param appService
	 * @return
	 */
	PageResult paging(Locale locale, AppService appService, Long start, Long limit);

	/**
	 * 判断【应用服务】是否存在.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 03:56:46
	 * @modification 2014年01月15日 03:56:46
	 * @param appService
	 * @return
	 */
	boolean exists(Locale locale, AppService appService);
}
