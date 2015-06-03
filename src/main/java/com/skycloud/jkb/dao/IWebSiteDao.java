/**
 * IWebSiteDao.java
 */
package com.skycloud.jkb.dao;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.skycloud.jkb.pojo.model.WebSite;

/**
 * Web站点持久化接口层.
 * 
 * @creation 2014年01月02日 06:24:49
 * @modification 2014年01月02日 06:24:49
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
public interface IWebSiteDao {

	/**
	 * 分页查询.
	 * 
	 * @author xiweicheng
	 * @creation 2014年1月13日 下午2:35:56
	 * @modification 2014年1月13日 下午2:35:56
	 * @param locale
	 * @param webSite
	 * @param start
	 * @param limit
	 * @return
	 */
	List<Map<String, Object>> page(Locale locale, WebSite webSite, Long start, Long limit);

	/**
	 * 分页查询总数查询.
	 * 
	 * @author xiweicheng
	 * @creation 2014年1月13日 下午2:36:06
	 * @modification 2014年1月13日 下午2:36:06
	 * @param locale
	 * @param webSite
	 * @return
	 */
	long pageCount(Locale locale, WebSite webSite);

}
