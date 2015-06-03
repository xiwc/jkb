/**
 * MediaDaoImpl.java
 */
 package com.skycloud.jkb.dao.impl;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.skycloud.jkb.base.impl.BaseDaoImpl;
import com.skycloud.jkb.dao.IMediaDao;

/**
 * 告警媒介持久化实现层.
 * 
 * @creation 2014年01月02日 02:38:05
 * @modification 2014年01月02日 02:38:05
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Repository
@Transactional
public class MediaDaoImpl extends BaseDaoImpl implements IMediaDao {
	
}
