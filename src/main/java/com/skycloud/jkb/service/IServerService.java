/**
 * IServerService.java
 */
package com.skycloud.jkb.service;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.skycloud.jkb.base.IBaseService;
import com.skycloud.jkb.pojo.model.Server;
import com.skycloud.jkb.pojo.vo.PageResult;

/**
 * 【服务器】业务逻辑接口.
 * 
 * @creation 2014年01月15日 12:00:07
 * @modification 2014年01月15日 12:00:07
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
public interface IServerService extends IBaseService {

	/**
	 * 创建【服务器】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 12:00:07
	 * @modification 2014年01月15日 12:00:07
	 * @param server
	 * @return
	 */
	boolean save(Locale locale, Server server);

	/**
	 * 删除【服务器】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 12:00:07
	 * @modification 2014年01月15日 12:00:07
	 * @param server
	 * @return
	 */
	boolean delete(Locale locale, Server server);

	/**
	 * 获取【服务器】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 12:00:07
	 * @modification 2014年01月15日 12:00:07
	 * @param server
	 * @return
	 */
	Server get(Locale locale, Server server);
	
	/**
	 * 更新【服务器】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 12:00:07
	 * @modification 2014年01月15日 12:00:07
	 * @param server
	 * @return
	 */
	boolean update(Locale locale, Server server);
	
	/**
	 * 列举【服务器】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 12:00:07
	 * @modification 2014年01月15日 12:00:07
	 * @param server
	 * @return
	 */
	List<Server> list(Locale locale);

	/**
	 * 查询【服务器】(不分页).
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 12:00:07
	 * @modification 2014年01月15日 12:00:07
	 * @param server
	 * @return
	 */
	List<Map<String, Object>> query(Locale locale, Server server);

	/**
	 * 查询【服务器】(分页).
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 12:00:07
	 * @modification 2014年01月15日 12:00:07
	 * @param server
	 * @return
	 */
	PageResult paging(Locale locale, Server server, Long start, Long limit);

	/**
	 * 判断【服务器】是否存在.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 12:00:07
	 * @modification 2014年01月15日 12:00:07
	 * @param server
	 * @return
	 */
	boolean exists(Locale locale, Server server);

	/**
	 * 获取主机实时监控数据.
	 * 
	 * @author xiweicheng
	 * @creation 2014年4月1日 上午11:30:58
	 * @modification 2014年4月1日 上午11:30:58
	 * @param locale
	 * @param server
	 * @return
	 */
	Map<String, Object> getRT(Locale locale, Server server);

	/**
	 * 获取主机的主要监控项.
	 * 
	 * @author xiweicheng
	 * @creation 2014年4月1日 下午3:58:29
	 * @modification 2014年4月1日 下午3:58:29
	 * @param server
	 * @return
	 */
	List<Map<String, Object>> getItems(Server server);

	/**
	 * 获取主机监控项历史数据
	 * 
	 * @author xiweicheng
	 * @creation 2014年4月1日 下午4:33:26
	 * @modification 2014年4月1日 下午4:33:26
	 * @param server
	 * @return
	 */
	List<List<Object>> getHistory(Server server);
}
