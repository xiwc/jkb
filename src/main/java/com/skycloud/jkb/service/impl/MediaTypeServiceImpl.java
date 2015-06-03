/**
 * MediaTypeServiceImpl.java
 */
package com.skycloud.jkb.service.impl;

import java.util.List;
import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.skycloud.jkb.base.impl.BaseServiceImpl;
import com.skycloud.jkb.component.ApiInvoker;
import com.skycloud.jkb.dao.IMediaTypeDao;
import com.skycloud.jkb.pojo.model.MediaType;
import com.skycloud.jkb.service.IMediaTypeService;

/**
 * 告警媒介类型业务逻辑实现.
 * 
 * @creation 2014年01月02日 05:10:45
 * @modification 2014年01月02日 05:10:45
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Service
@Transactional
public class MediaTypeServiceImpl extends BaseServiceImpl implements IMediaTypeService {

	private static Logger logger = Logger.getLogger(MediaTypeServiceImpl.class);

	@Autowired
	IMediaTypeDao mediaTypeDao;

	@Autowired
	ApiInvoker apiInvoker;

	@Override
	public boolean save(Locale locale, MediaType mediaType) {

		logger.debug("[业务逻辑层]添加告警媒介类型");

		// TODO
		return true;
	}

	@Override
	public boolean delete(Locale locale, MediaType mediaType) {

		logger.debug("[业务逻辑层]删除告警媒介类型");

		// TODO
		return true;
	}

	@Override
	public MediaType get(Locale locale, MediaType mediaType) {

		logger.debug("[业务逻辑层]获取告警媒介类型");

		// TODO
		return null;
	}

	@Override
	public boolean update(Locale locale, MediaType mediaType) {

		logger.debug("[业务逻辑层]更新告警媒介类型");

		// TODO
		return true;
	}

	@Override
	public List<MediaType> list(Locale locale) {

		logger.debug("[业务逻辑层]列举告警媒介类型");

		// TODO
		return null;
	}

	@Override
	public MediaType getByType(Locale locale, int mediaType) {

		logger.debug("[业务逻辑层]根据类型获取告警媒介类型");

		MediaType mediaType2 = mediaTypeDao.getByType(locale, mediaType);

		return mediaType2;
	}

}