/**
 * IServerDao.java
 */
package com.skycloud.jkb.dao;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.skycloud.jkb.pojo.entity.Hosts;
import com.skycloud.jkb.pojo.model.Server;

/**
 * 【服务器】持久化接口层.
 * 
 * @creation 2014年01月15日 02:45:04
 * @modification 2014年01月15日 02:45:04
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
public interface IServerDao {

	/**
	 * 查询【服务器】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 02:45:04
	 * @modification 2014年01月15日 02:45:04
	 * @param locale
	 * @param server
	 * @param start
	 * @param limit
	 * @return
	 */
	List<Map<String, Object>> query(Locale locale, Server server, Long start, Long limit);

	/**
	 * 查询总数查询【服务器】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 02:45:04
	 * @modification 2014年01月15日 02:45:04
	 * @param locale
	 * @param server
	 * @return
	 */
	long queryCount(Locale locale, Server server);

	/**
	 * 根据host查询Hosts.
	 * 
	 * @author xiweicheng
	 * @creation 2014年3月31日 下午5:26:14
	 * @modification 2014年3月31日 下午5:26:14
	 * @param host
	 * @return
	 */
	Hosts queryByHost(String host);

	/**
	 * 获取主机的主要监控项.
	 * 
	 * @author xiweicheng
	 * @creation 2014年4月1日 下午3:56:54
	 * @modification 2014年4月1日 下午3:56:54
	 * @param host
	 * @return
	 */
	List<Map<String, Object>> getItems(String host);

	/**
	 * 获取主机监控项历史数据(float).
	 * 
	 * @author xiweicheng
	 * @creation 2014年4月1日 下午4:46:05
	 * @modification 2014年4月1日 下午4:46:05
	 * @param key
	 * @param hostIds
	 * @return
	 */
	List<List<Object>> getHistoryFloat2(String itemId);

	/**
	 * 获取主机监控项历史数据(uint).
	 * 
	 * @author xiweicheng
	 * @creation 2014年4月1日 下午4:46:32
	 * @modification 2014年4月1日 下午4:46:32
	 * @param itemId
	 * @return
	 */
	List<List<Object>> getHistoryUint2(String itemId);

}
