/**
 * IHostGroupService.java
 */
package com.skycloud.jkb.service;
 
 
import java.util.List;
import java.util.Locale;

import com.skycloud.jkb.base.IBaseService;
import com.skycloud.jkb.pojo.model.HostGroup;
import com.skycloud.jkb.pojo.vo.PageResult;

/**
 * 主机组业务逻辑接口.
 * 
 * @creation 2014年01月03日 10:56:43
 * @modification 2014年01月03日 10:56:43
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
public interface IHostGroupService extends IBaseService {

	/**
	 * 创建主机组.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月03日 10:56:43
	 * @modification 2014年01月03日 10:56:43
	 * @param hostGroup
	 * @return
	 */
	boolean save(Locale locale, HostGroup hostGroup);

	/**
	 * 删除主机组.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月03日 10:56:43
	 * @modification 2014年01月03日 10:56:43
	 * @param hostGroup
	 * @return
	 */
	boolean delete(Locale locale, HostGroup hostGroup);

	/**
	 * 获取主机组.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月03日 10:56:43
	 * @modification 2014年01月03日 10:56:43
	 * @param hostGroup
	 * @return
	 */
	HostGroup get(Locale locale, HostGroup hostGroup);
	
	/**
	 * 更新主机组.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月03日 10:56:43
	 * @modification 2014年01月03日 10:56:43
	 * @param hostGroup
	 * @return
	 */
	boolean update(Locale locale, HostGroup hostGroup);
	
	/**
	 * 列举主机组.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月03日 10:56:43
	 * @modification 2014年01月03日 10:56:43
	 * @param hostGroup
	 * @return
	 */
	List<HostGroup> list(Locale locale);

	/**
	 * 查询主机组(不分页).
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月03日 10:56:43
	 * @modification 2014年01月03日 10:56:43
	 * @param hostGroup
	 * @return
	 */
	List<HostGroup> query(Locale locale, HostGroup hostGroup);

	/**
	 * 查询主机组(分页).
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月03日 10:56:43
	 * @modification 2014年01月03日 10:56:43
	 * @param hostGroup
	 * @return
	 */
	PageResult paging(Locale locale, HostGroup hostGroup, Long start, Long limit);

	/**
	 * 判断主机组是否存在.
	 *
	 * @author xiweicheng
	 * @creation 2014年1月3日 上午11:21:39
	 * @modification 2014年1月3日 上午11:21:39
	 * @param locale
	 * @param hostGroup
	 * @return
	 */
	boolean exists(Locale locale, HostGroup hostGroup);

}
