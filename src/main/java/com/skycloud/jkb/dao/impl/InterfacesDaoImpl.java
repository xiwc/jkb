/**
 * InterfacesDaoImpl.java
 */
package com.skycloud.jkb.dao.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.skycloud.jkb.base.impl.BaseDaoImpl;
import com.skycloud.jkb.dao.IInterfacesDao;
import com.skycloud.jkb.pojo.model.Interfaces;

/**
 * 【网络接口】持久化实现层.
 * 
 * @creation 2014年04月01日 09:52:37
 * @modification 2014年04月01日 09:52:37
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Repository
@Transactional
public class InterfacesDaoImpl extends BaseDaoImpl implements IInterfacesDao {

	@Override
	public List<Map<String, Object>> query(Locale locale, Interfaces interfaces, Long start, Long limit) {

		// TODO

		return null;
	}

	@Override
	public long queryCount(Locale locale, Interfaces interfaces) {

		// TODO

		return 0L;
	}

	@Override
	public com.skycloud.jkb.pojo.entity.Interfaces queryByHostId(final Long hostid) {

		return hibernateTemplate.execute(new HibernateCallback<com.skycloud.jkb.pojo.entity.Interfaces>() {

			@Override
			public com.skycloud.jkb.pojo.entity.Interfaces doInHibernate(Session session) throws HibernateException,
					SQLException {

				return (com.skycloud.jkb.pojo.entity.Interfaces) session
						.createQuery("from Interfaces where hosts.hostid=?").setLong(0, hostid).uniqueResult();
			}
		});
	}

}
