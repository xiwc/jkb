/**
 * IUserDao.java
 */
package com.skycloud.jkb.dao;

import java.util.Locale;

import com.skycloud.jkb.pojo.entity.Users;

/**
 * 
 * 
 * @creation 2013年12月30日 下午4:12:29
 * @modification 2013年12月30日 下午4:12:29
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
public interface IUserDao {

	boolean exists(Locale locale, String alias);
	
	Users getByAlias(Locale locale, String alias);

	boolean deleteFromSkycloudUserInfo(Locale locale, String userId);
}
