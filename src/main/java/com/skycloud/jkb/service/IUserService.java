/**
 * IUserService.java
 */
package com.skycloud.jkb.service;

import java.util.Locale;

import com.skycloud.jkb.base.IBaseService;
import com.skycloud.jkb.pojo.entity.Users;
import com.skycloud.jkb.pojo.model.User;

/**
 * 用户业务逻辑接口.
 * 
 * @creation 2013年12月26日 下午3:26:43
 * @modification 2013年12月26日 下午3:26:43
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
public interface IUserService extends IBaseService {

	/**
	 * 创建用户.
	 * 
	 * @author xiweicheng
	 * @creation 2013年12月31日 下午2:54:52
	 * @modification 2013年12月31日 下午2:54:52
	 * @param user
	 * @return
	 */
	boolean save(Locale locale, User user);

	/**
	 * 删除用户.
	 * 
	 * @author xiweicheng
	 * @creation 2013年12月31日 下午2:55:07
	 * @modification 2013年12月31日 下午2:55:07
	 * @param user
	 * @return
	 */
	boolean delete(Locale locale, User user);

	/**
	 * 判断[users.alias]是否存在.
	 * 
	 * @author xiweicheng
	 * @creation 2013年12月31日 下午2:54:04
	 * @modification 2013年12月31日 下午2:54:04
	 * @param name
	 * @return
	 */
	boolean exists(Locale locale, String alias);

	/**
	 * 通过users.alias获取用户.
	 * 
	 * @author xiweicheng
	 * @creation 2013年12月31日 下午3:31:46
	 * @modification 2013年12月31日 下午3:31:46
	 * @param locale
	 * @param alias
	 * @return
	 */
	Users getByAlias(Locale locale, String alias);

	/**
	 * 获取用户信息.
	 * 
	 * @author xiweicheng
	 * @creation 2013年12月31日 下午5:18:07
	 * @modification 2013年12月31日 下午5:18:07
	 * @param user
	 * @return
	 */
	User get(Locale locale, User user);

}
