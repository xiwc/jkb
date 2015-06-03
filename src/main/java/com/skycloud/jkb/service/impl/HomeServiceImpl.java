/**
 * HomeServiceImpl.java
 */
package com.skycloud.jkb.service.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.skycloud.jkb.base.impl.BaseServiceImpl;
import com.skycloud.jkb.base.impl.CommonDao;
import com.skycloud.jkb.dao.IHomeDao;
import com.skycloud.jkb.service.IHomeService;

/**
 * 
 * 
 * @creation 2013年12月24日 上午10:54:52
 * @modification 2013年12月24日 上午10:54:52
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Service
@Transactional
public class HomeServiceImpl extends BaseServiceImpl implements IHomeService {

	@Autowired
	IHomeDao homeDao;

	@Autowired
	SessionFactory sessionFactory;

	@Autowired
	CommonDao commonDao;

}
