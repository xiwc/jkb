/**
 * IMediaTypeDao.java
 */
package com.skycloud.jkb.dao;


import java.util.Locale;

import com.skycloud.jkb.pojo.model.MediaType;

/**
 * 告警媒介类型持久化接口层.
 * 
 * @creation 2014年01月02日 05:10:45
 * @modification 2014年01月02日 05:10:45
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
public interface IMediaTypeDao {

	/**
	 * 
	 *
	 * @author xiweicheng
	 * @creation 2014年1月2日 下午5:16:00
	 * @modification 2014年1月2日 下午5:16:00
	 * @param locale
	 * @param mediaType
	 * @return
	 */
	MediaType getByType(Locale locale, int mediaType);
	
}
