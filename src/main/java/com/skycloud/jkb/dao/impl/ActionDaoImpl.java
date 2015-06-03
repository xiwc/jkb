/**
 * ActionDaoImpl.java
 */
package com.skycloud.jkb.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.skycloud.jkb.base.impl.BaseDaoImpl;
import com.skycloud.jkb.dao.IActionDao;

/**
 * 【告警动作】持久化实现层.
 * 
 * @creation 2014年01月03日 12:19:14
 * @modification 2014年01月03日 12:19:14
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Repository
@Transactional
public class ActionDaoImpl extends BaseDaoImpl implements IActionDao {
	
}
