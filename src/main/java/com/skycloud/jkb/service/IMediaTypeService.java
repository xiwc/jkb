/**
 * IMediaTypeService.java
 */
package com.skycloud.jkb.service;

import java.util.List;
import java.util.Locale;

import com.skycloud.jkb.base.IBaseService;
import com.skycloud.jkb.pojo.model.MediaType;

/**
 * 告警媒介类型业务逻辑接口.
 * 
 * @creation 2014年01月02日 05:10:45
 * @modification 2014年01月02日 05:10:45
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
public interface IMediaTypeService extends IBaseService {

	/**
	 * 创建告警媒介类型.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月02日 05:10:45
	 * @modification 2014年01月02日 05:10:45
	 * @param mediaType
	 * @return
	 */
	boolean save(Locale locale, MediaType mediaType);

	/**
	 * 删除告警媒介类型.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月02日 05:10:45
	 * @modification 2014年01月02日 05:10:45
	 * @param mediaType
	 * @return
	 */
	boolean delete(Locale locale, MediaType mediaType);

	/**
	 * 获取告警媒介类型.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月02日 05:10:45
	 * @modification 2014年01月02日 05:10:45
	 * @param mediaType
	 * @return
	 */
	MediaType get(Locale locale, MediaType mediaType);

	/**
	 * 根据类型获取告警媒介类型.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月02日 05:10:45
	 * @modification 2014年01月02日 05:10:45
	 * @param mediaType
	 *            Possible values: 0 - email; 1 - script; 2 - SMS; 3 - Jabber;
	 *            100 - Ez Texting.
	 * @return
	 */
	MediaType getByType(Locale locale, int mediaType);

	/**
	 * 更新告警媒介类型.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月02日 05:10:45
	 * @modification 2014年01月02日 05:10:45
	 * @param mediaType
	 * @return
	 */
	boolean update(Locale locale, MediaType mediaType);

	/**
	 * 列举告警媒介类型.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月02日 05:10:45
	 * @modification 2014年01月02日 05:10:45
	 * @param mediaType
	 * @return
	 */
	List<MediaType> list(Locale locale);

}
