/**
 * MediaTypeDaoImpl.java
 */
package com.skycloud.jkb.dao.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Locale;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.BeanUtils;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.skycloud.jkb.base.impl.BaseDaoImpl;
import com.skycloud.jkb.dao.IMediaTypeDao;
import com.skycloud.jkb.pojo.model.MediaType;

/**
 * 告警媒介类型持久化实现层.
 * 
 * @creation 2014年01月02日 05:10:45
 * @modification 2014年01月02日 05:10:45
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Repository
@Transactional
public class MediaTypeDaoImpl extends BaseDaoImpl implements IMediaTypeDao {

	@Override
	public MediaType getByType(Locale locale, final int mediaType) {

		return hibernateTemplate.execute(new HibernateCallback<MediaType>() {

			@Override
			public MediaType doInHibernate(Session session) throws HibernateException, SQLException {
				List<?> list = session.createQuery("from MediaType where type = ?")
						.setInteger(0, mediaType).list();

				if (list.size() > 0) {
					com.skycloud.jkb.pojo.entity.MediaType mediaType = (com.skycloud.jkb.pojo.entity.MediaType) list
							.get(0);
					MediaType mediaType2 = new MediaType();
					BeanUtils.copyProperties(mediaType, mediaType2);

					return mediaType2;
				}
				return null;
			}

		});
	}

}
