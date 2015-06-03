/**
 * HomeDao.java
 */
package com.skycloud.jkb.dao;

import java.util.List;
import java.util.Map;

import com.skycloud.jkb.base.IBaseDao;

/**
 * 
 * 
 * @creation 2013年12月24日 上午10:55:35
 * @modification 2013年12月24日 上午10:55:35
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
public interface IHomeDao extends IBaseDao {

	List<Map<String, Object>> getOrders(Map<String, Object> params);

}
