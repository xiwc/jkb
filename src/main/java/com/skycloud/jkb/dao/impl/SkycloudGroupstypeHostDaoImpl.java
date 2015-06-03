package com.skycloud.jkb.dao.impl;

import java.math.BigDecimal;
import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.skycloud.jkb.base.impl.BaseDaoImpl;
import com.skycloud.jkb.dao.ISkycloudGroupstypeHostDao;

/**
 * 
 * 
 * @creation 2014年1月15日 下午1:49:41
 * @modification 2014年1月15日 下午1:49:41
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Repository
@Transactional
public class SkycloudGroupstypeHostDaoImpl extends BaseDaoImpl implements ISkycloudGroupstypeHostDao {

	@Override
	public Boolean deleteByhostId(final String hostId) {

		return hibernateTemplate.execute(new HibernateCallback<Boolean>() {

			@Override
			public Boolean doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = session.createQuery("delete from SkycloudGroupstypeHost where hostid = ?");
				query.setBigDecimal(0, new BigDecimal(hostId));
				return query.executeUpdate() > 0;
			}

		});

	}

	@Override
	public Long updateTypeIdByHostId(final String hostId, final String typeId) {
		return hibernateTemplate.execute(new HibernateCallback<Long>() {

			@Override
			public Long doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = session.createQuery("update SkycloudGroupstypeHost set typeid = ? where hostid = ?");
				query.setBigDecimal(0, new BigDecimal(typeId));
				query.setBigDecimal(1, new BigDecimal(hostId));
				return Long.valueOf(query.executeUpdate());
			}

		});
	}

}
