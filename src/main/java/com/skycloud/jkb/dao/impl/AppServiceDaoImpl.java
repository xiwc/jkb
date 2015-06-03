/**
 * AppServiceDaoImpl.java
 */
package com.skycloud.jkb.dao.impl;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.skycloud.jkb.base.impl.BaseDaoImpl;
import com.skycloud.jkb.dao.IAppServiceDao;
import com.skycloud.jkb.pojo.model.AppService;

/**
 * 【应用服务】持久化实现层.
 * 
 * @creation 2014年01月15日 03:56:46
 * @modification 2014年01月15日 03:56:46
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Repository
@Transactional
public class AppServiceDaoImpl extends BaseDaoImpl implements IAppServiceDao {

	@Override
	public List<Map<String, Object>> query(Locale locale, AppService appService, Long start, Long limit) {
		
		// TODO
		
		return null;
	}

	@Override
	public long queryCount(Locale locale, AppService appService) {
	
		// TODO
	
		return 0L;
	}
	
}
