/**
 * IWebSiteService.java
 */
package com.skycloud.jkb.service;

import java.util.List;
import java.util.Locale;

import com.skycloud.jkb.base.IBaseService;
import com.skycloud.jkb.pojo.model.WebSite;
import com.skycloud.jkb.pojo.vo.PageResult;

/**
 * Web站点业务逻辑接口.
 * 
 * @creation 2014年01月02日 06:24:49
 * @modification 2014年01月02日 06:24:49
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
public interface IWebSiteService extends IBaseService {

	/**
	 * 创建Web站点&配置website告警动作.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月02日 06:24:49
	 * @modification 2014年01月02日 06:24:49
	 * @param webSite
	 * @return
	 */
	boolean save(Locale locale, WebSite webSite);

	/**
	 * 删除Web站点.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月02日 06:24:49
	 * @modification 2014年01月02日 06:24:49
	 * @param webSite
	 * @return
	 */
	boolean delete(Locale locale, WebSite webSite);

	/**
	 * 获取Web站点.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月02日 06:24:49
	 * @modification 2014年01月02日 06:24:49
	 * @param webSite
	 * @return
	 */
	WebSite get(Locale locale, WebSite webSite);

	/**
	 * 更新Web站点.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月02日 06:24:49
	 * @modification 2014年01月02日 06:24:49
	 * @param webSite
	 * @return
	 */
	boolean update(Locale locale, WebSite webSite);

	/**
	 * 列举Web站点.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月02日 06:24:49
	 * @modification 2014年01月02日 06:24:49
	 * @param webSite
	 * @return
	 */
	List<WebSite> list(Locale locale);

	/**
	 * 查询【Web站点】(分页).
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月06日 04:48:04
	 * @modification 2014年01月06日 04:48:04
	 * @param webSite
	 * @return
	 */
	PageResult paging(Locale locale, WebSite webSite, Long start, Long limit);

}
