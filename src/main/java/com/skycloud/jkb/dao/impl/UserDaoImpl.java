/**
 * UserDaoImpl.java
 */
package com.skycloud.jkb.dao.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Locale;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.skycloud.jkb.base.impl.BaseDaoImpl;
import com.skycloud.jkb.dao.IUserDao;
import com.skycloud.jkb.pojo.entity.Users;
import com.skycloud.jkb.util.NumberUtil;

/**
 * 用户持久化层实现.
 * 
 * @creation 2013年12月30日 下午4:13:10
 * @modification 2013年12月30日 下午4:13:10
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Repository
@Transactional
public class UserDaoImpl extends BaseDaoImpl implements IUserDao {

	@Override
	public boolean exists(Locale locale, String alias) {
		List<?> list = hibernateTemplate.find("select count(*) from Users where alias=?", alias);
		return list.size() > 0 ? NumberUtil.gt(list.get(0), 0D) : false;
	}

	@Override
	public Users getByAlias(Locale locale, String alias) {
		List<?> list = hibernateTemplate.find("from Users where alias=?", alias);
		return (Users) (list.size() > 0 ? list.get(0) : null);
	}

	@Override
	public boolean deleteFromSkycloudUserInfo(Locale locale, final String userId) {

		return hibernateTemplate.execute(new HibernateCallback<Boolean>() {

			@Override
			public Boolean doInHibernate(Session session) throws HibernateException, SQLException {
				int cnt = session.createQuery("delete from SkycloudUserinfo where userid=?")
						.setLong(0, NumberUtil.toLong(userId)).executeUpdate();
				return cnt > 0;
			}

		});
	}

}
