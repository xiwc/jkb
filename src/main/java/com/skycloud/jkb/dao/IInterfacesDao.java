/**
 * IInterfacesDao.java
 */
package com.skycloud.jkb.dao;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.skycloud.jkb.pojo.model.Interfaces;

/**
 * 【网络接口】持久化接口层.
 * 
 * @creation 2014年04月01日 09:52:37
 * @modification 2014年04月01日 09:52:37
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
public interface IInterfacesDao {

	/**
	 * 查询【网络接口】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年04月01日 09:52:37
	 * @modification 2014年04月01日 09:52:37
	 * @param locale
	 * @param interfaces
	 * @param start
	 * @param limit
	 * @return
	 */
	List<Map<String, Object>> query(Locale locale, Interfaces interfaces, Long start, Long limit);

	/**
	 * 查询总数查询【网络接口】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年04月01日 09:52:37
	 * @modification 2014年04月01日 09:52:37
	 * @param locale
	 * @param interfaces
	 * @return
	 */
	long queryCount(Locale locale, Interfaces interfaces);

	/**
	 * 根据hostid查询网络接口
	 * 
	 * @author xiweicheng
	 * @creation 2014年4月1日 上午9:55:29
	 * @modification 2014年4月1日 上午9:55:29
	 * @param hostid
	 * @return
	 */
	com.skycloud.jkb.pojo.entity.Interfaces queryByHostId(Long hostid);
	
}
