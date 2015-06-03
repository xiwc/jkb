/**
 * WebSiteDaoImpl.java
 */
package com.skycloud.jkb.dao.impl;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.skycloud.jkb.base.impl.BaseDaoImpl;
import com.skycloud.jkb.dao.IWebSiteDao;
import com.skycloud.jkb.pojo.model.WebSite;
import com.skycloud.jkb.util.SqlUtil;
import com.skycloud.jkb.util.WebUtil;

/**
 * Web站点持久化实现层.
 * 
 * @creation 2014年01月02日 06:24:49
 * @modification 2014年01月02日 06:24:49
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Repository
@Transactional
public class WebSiteDaoImpl extends BaseDaoImpl implements IWebSiteDao {

	@Override
	public List<Map<String, Object>> page(Locale locale, WebSite webSite, Long start, Long limit) {

		StringBuffer sqlSb = new StringBuffer();
		sqlSb.append("SELECT\n");
		sqlSb.append("	h.hostid,\n");
		sqlSb.append("	h.`name` AS hostname,\n");
		sqlSb.append("	h.`status` AS hoststatus,\n");
		sqlSb.append("	i.itemid,\n");
		sqlSb.append("	i.type,\n");
		sqlSb.append("	i.`name` AS itemname,\n");
		sqlSb.append("	i.key_,\n");
		sqlSb.append("	i.delay,\n");
		sqlSb.append("	i.history,\n");
		sqlSb.append("	i.trends,\n");
		sqlSb.append("	i.lastvalue,\n");
		sqlSb.append("	i.lastclock,\n");
		sqlSb.append("	i.prevvalue,\n");
		sqlSb.append("	i.`status` AS itemstatus,\n");
		sqlSb.append("	i.value_type,\n");
		sqlSb.append("	i.units,\n");
		sqlSb.append("	i.formula,\n");
		sqlSb.append("	i.templateid,\n");
		sqlSb.append("	i.lastns,\n");
		sqlSb.append("	i.flags,\n");
		sqlSb.append("	i.lifetime\n");
		sqlSb.append("FROM\n");
		sqlSb.append("	skycloud_groupstype_host AS sgh\n");
		sqlSb.append("INNER JOIN `hosts` AS h ON sgh.hostid = h.hostid\n");
		sqlSb.append("INNER JOIN items AS i ON i.hostid = h.hostid\n");
		sqlSb.append("WHERE\n");
		sqlSb.append("  sgh.typeid = 14\n");

		String userId = WebUtil.getSessionUserId();

		sqlSb.append(SqlUtil.replaceIfNotEmpty("AND sgh.userid = {?1}\n", userId));

		sqlSb.append(SqlUtil.replaceIfNotEmpty("AND sgh.hostid = {?1}\n", webSite.getHostid()));

		sqlSb.append(SqlUtil.replaceIfNotEmpty("AND h.`name` LIKE '%{?1}%'\n", webSite.getName()));

		sqlSb.append("LIMIT ?,?\n");

		return getMapList(sqlSb, start, limit);
	}

	@Override
	public long pageCount(Locale locale, WebSite webSite) {

		StringBuffer sqlSb = new StringBuffer();
		sqlSb.append("SELECT\n");
		sqlSb.append("	COUNT(*)\n");
		sqlSb.append("FROM\n");
		sqlSb.append("	skycloud_groupstype_host AS sgh\n");
		sqlSb.append("INNER JOIN `hosts` AS h ON sgh.hostid = h.hostid\n");
		sqlSb.append("INNER JOIN items AS i ON i.hostid = h.hostid\n");
		sqlSb.append("WHERE\n");
		sqlSb.append("  sgh.typeid = 14\n");

		String userId = WebUtil.getSessionUserId();

		sqlSb.append(SqlUtil.replaceIfNotEmpty("AND sgh.userid = {?1}\n", userId));

		sqlSb.append(SqlUtil.replaceIfNotEmpty("AND sgh.hostid = {?1}\n", webSite.getHostid()));

		sqlSb.append(SqlUtil.replaceIfNotEmpty("AND h.`name` LIKE '%{?1}%'\n", webSite.getName()));

		return getCount(sqlSb);
	}

}
