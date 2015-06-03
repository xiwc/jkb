/**
 * IMediaService.java
 */
package com.skycloud.jkb.service;

import java.util.List;
import java.util.Locale;

import com.skycloud.jkb.base.IBaseService;
import com.skycloud.jkb.pojo.model.Media;

/**
 * 告警媒介业务逻辑接口.
 * 
 * @creation 2014年01月02日 02:38:05
 * @modification 2014年01月02日 02:38:05
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
public interface IMediaService extends IBaseService {

	/**
	 * 创建告警媒介.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月02日 02:38:05
	 * @modification 2014年01月02日 02:38:05
	 * @param media
	 * @return
	 */
	boolean save(Locale locale, Media media);

	/**
	 * 删除告警媒介.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月02日 02:38:05
	 * @modification 2014年01月02日 02:38:05
	 * @param media
	 * @return
	 */
	boolean delete(Locale locale, Media media);

	/**
	 * 获取告警媒介.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月02日 02:38:05
	 * @modification 2014年01月02日 02:38:05
	 * @param media
	 * @return
	 */
	Media get(Locale locale, Media media);

	/**
	 * 更新告警媒介.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月02日 02:38:05
	 * @modification 2014年01月02日 02:38:05
	 * @param media
	 * @return
	 */
	boolean update(Locale locale, Media media);

	/**
	 * 列举告警媒介.
	 * 
	 * @author xiweicheng
	 * @creation 2014年1月2日 下午3:23:23
	 * @modification 2014年1月2日 下午3:23:23
	 * @param locale
	 * @return
	 */
	List<Media> list(Locale locale, Media media);

}
