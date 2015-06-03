/**
 * HomeDaoImpl.java
 */
package com.skycloud.jkb.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.skycloud.jkb.base.impl.BaseDaoImpl;
import com.skycloud.jkb.dao.IHomeDao;

/**
 * 
 * 
 * @creation 2013年12月24日 上午10:55:46
 * @modification 2013年12月24日 上午10:55:46
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Repository
@Transactional
public class HomeDaoImpl extends BaseDaoImpl implements IHomeDao {

	@Override
	public List<Map<String, Object>> getOrders(Map<String, Object> params) {

		String sql = "SELECT id, customer AS name FROM t_order where customer like ?";
		return getMapList(sql, params.get("customer"));
	}

}
