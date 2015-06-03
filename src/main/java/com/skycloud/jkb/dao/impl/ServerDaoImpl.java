/**
 * ServerDaoImpl.java
 */
package com.skycloud.jkb.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.skycloud.jkb.base.impl.BaseDaoImpl;
import com.skycloud.jkb.dao.IServerDao;
import com.skycloud.jkb.pojo.entity.Hosts;
import com.skycloud.jkb.pojo.model.Server;
import com.skycloud.jkb.util.NumberUtil;
import com.skycloud.jkb.util.SqlUtil;
import com.skycloud.jkb.util.StringUtil;
import com.skycloud.jkb.util.WebUtil;

/**
 * 【服务器】持久化实现层.
 * 
 * @creation 2014年01月15日 02:45:10
 * @modification 2014年01月15日 02:45:10
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Repository
@Transactional
public class ServerDaoImpl extends BaseDaoImpl implements IServerDao {

	@Override
	public List<Map<String, Object>> query(Locale locale, Server server, Long start, Long limit) {

		StringBuffer sqlSb = new StringBuffer();
		sqlSb.append("SELECT\n");
		sqlSb.append("	i.ip,\n");
		sqlSb.append("	sgh.typeid,\n");
		sqlSb.append("	sgh.userid,\n");
		sqlSb.append("	sg.tier,\n");
		sqlSb.append("	sg.groupstype,\n");
		sqlSb.append("	sg.type,\n");
		sqlSb.append("	sg.monitortype,\n");
		sqlSb.append("	sgh.assetid,\n");
		sqlSb.append("	h.`status`,\n");
		sqlSb.append("	h.`name`,\n");
		sqlSb.append("	items.itemid,\n");
		sqlSb.append("	items.`name` AS itemname,\n");
		sqlSb.append("	items.key_,\n");
		sqlSb.append("	items.history,\n");
		sqlSb.append("	items.trends,\n");
		sqlSb.append("	items.lastvalue,\n");
		sqlSb.append("	items.lastclock,\n");
		sqlSb.append("	items.prevvalue,\n");
		sqlSb.append("	items.`status` AS itemstatus,\n");
		sqlSb.append("	items.value_type,\n");
		sqlSb.append("	items.units,\n");
		sqlSb.append("	items.description,\n");
		sqlSb.append("	items.flags,\n");
		sqlSb.append("	sgh.hostid\n");
		sqlSb.append("FROM\n");
		sqlSb.append("	skycloud_groupstype_host AS sgh\n");
		sqlSb.append("INNER JOIN skycloud_grouptype AS sg ON sgh.typeid = sg.typeid\n");
		sqlSb.append("INNER JOIN `hosts` AS h ON sgh.hostid = h.hostid\n");
		sqlSb.append("INNER JOIN items ON items.hostid = h.hostid\n");
		sqlSb.append("INNER JOIN interface AS i ON i.hostid = h.hostid\n");
		sqlSb.append("WHERE\n");
		sqlSb.append("	sg.monitortype = 'agent'\n");

		String userId = WebUtil.getSessionUserId();

		sqlSb.append(SqlUtil.replaceIfNotEmpty("AND sgh.userid = {?1}\n", userId));

		sqlSb.append("AND items.flags <> 2\n");

		sqlSb.append(SqlUtil.replaceIfNotEmpty("AND sgh.hostid = {?1}\n", server.getHostid()));

		sqlSb.append(SqlUtil.replaceIfNotEmpty("AND h.`name` LIKE '%{?1}%'\n", server.getName()));

		sqlSb.append(SqlUtil.replaceIfNotEmpty("AND items.`name` LIKE '%{?1}%'\n", server.getItemName()));

		sqlSb.append(SqlUtil.replaceIfNotEmpty("AND items.itemid = {?1}\n", server.getItemId()));

		sqlSb.append(SqlUtil.replaceIfNotEmpty("AND i.ip LIKE '%{?1}%'\n", server.getIp()));

		if (start != null && limit != null) {
			sqlSb.append("LIMIT ?,?\n");
			return getMapList(sqlSb, start, limit);
		} else {
			return getMapList(sqlSb);
		}

	}

	@Override
	public long queryCount(Locale locale, Server server) {

		StringBuffer sqlSb = new StringBuffer();
		sqlSb.append("SELECT\n");
		sqlSb.append("	COUNT(*)\n");
		sqlSb.append("FROM\n");
		sqlSb.append("	skycloud_groupstype_host AS sgh\n");
		sqlSb.append("INNER JOIN skycloud_grouptype AS sg ON sgh.typeid = sg.typeid\n");
		sqlSb.append("INNER JOIN `hosts` AS h ON sgh.hostid = h.hostid\n");
		sqlSb.append("INNER JOIN items ON items.hostid = h.hostid\n");
		sqlSb.append("INNER JOIN interface AS i ON i.hostid = h.hostid\n");
		sqlSb.append("WHERE\n");
		sqlSb.append("	sg.monitortype = 'agent'\n");

		String userId = WebUtil.getSessionUserId();

		SqlUtil.replaceIfNotEmpty("AND sgh.userid = {?1}\n", userId);

		sqlSb.append("AND items.flags <> 2\n");

		SqlUtil.replaceIfNotEmpty("AND sgh.hostid = {?1}\n", server.getHostid());

		sqlSb.append(SqlUtil.replaceIfNotEmpty("AND h.`name` LIKE '%{?1}%'\n", server.getName()));

		sqlSb.append(SqlUtil.replaceIfNotEmpty("AND items.`name` LIKE '%{?1}%'\n", server.getItemName()));

		sqlSb.append(SqlUtil.replaceIfNotEmpty("AND items.itemid = {?1}\n", server.getItemId()));

		return getCount(sqlSb);
	}

	@Override
	public Hosts queryByHost(final String host) {

		return hibernateTemplate.execute(new HibernateCallback<Hosts>() {

			@Override
			public Hosts doInHibernate(Session session) throws HibernateException, SQLException {

				return (Hosts) session.createQuery("from Hosts where host=?").setString(0, host).uniqueResult();
			}
		});
	}

	@Override
	public List<Map<String, Object>> getItems(String host) {

		StringBuffer sqlSb = new StringBuffer();
		sqlSb.append("SELECT\n");
		sqlSb.append("	items.itemid,\n");
		sqlSb.append("	items.`name`,\n");
		sqlSb.append("	items.key_,\n");
		sqlSb.append("	items.lastvalue,\n");
		sqlSb.append("	items.units\n");
		sqlSb.append("FROM\n");
		sqlSb.append("	items\n");
		sqlSb.append("INNER JOIN `hosts` ON items.hostid = `hosts`.hostid\n");
		sqlSb.append("WHERE\n");
		sqlSb.append("	`hosts`.`host` = ?\n");
		sqlSb.append("AND items.`status` = 0\n");
		sqlSb.append("AND items.flags IN (0, 4)\n");
		sqlSb.append("AND (\n");
		sqlSb.append("	items.key_ LIKE 'AvgUsage'\n");
		sqlSb.append("	OR items.key_ LIKE 'system.cpu.util[,idle]'\n");
		sqlSb.append("	OR items.key_ LIKE 'vm.memory.size[pavailable]'\n");
		sqlSb.append("	OR items.key_ LIKE 'net.if.in[%]'\n");
		sqlSb.append("	OR items.key_ LIKE 'net.if.out[%]'\n");
		sqlSb.append("	OR items.key_ LIKE 'vfs.fs.size[%,pfree]'\n");
		sqlSb.append(")\n");

		List<Map<String, Object>> mapList = getMapList(sqlSb, host);

		// String key = "vfs.fs.size[/boot,pfree]";
		// $1上空闲空间百分比
		Pattern p1 = Pattern.compile("vfs\\.fs\\.size\\[(.+),pfree\\]");

		// key = "net.if.out[rename7]";
		// 网卡$1的流出流量bps
		Pattern p2 = Pattern.compile("net\\.if\\.out\\[(.+)\\]");

		// key = "net.if.in[rename7]";
		// 网卡$1的流入流量bps
		Pattern p3 = Pattern.compile("net\\.if\\.in\\[(.+)\\]");

		for (Map<String, Object> map : mapList) {

			String key = StringUtil.getNotNullString(map, "key_");
			String name = StringUtil.getNotNullString(map, "name");

			Matcher matcher1 = p1.matcher(key);
			Matcher matcher2 = p2.matcher(key);
			Matcher matcher3 = p3.matcher(key);

			Matcher matcher = matcher1.matches() ? matcher1 : (matcher2.matches() ? matcher2
					: (matcher3.matches() ? matcher3 : null));

			if (matcher != null && matcher.matches()) {
				map.put("name", name.replace("$1", "[" + matcher.group(1) + "]"));
			}
		}

		return mapList;

	}

	@Override
	public List<List<Object>> getHistoryUint2(String itemId) {

		StringBuffer sqlSb = new StringBuffer();
		sqlSb.append("SELECT\n");
		sqlSb.append("	trends_uint.clock * 1000 AS x,\n");
		sqlSb.append("	trends_uint.num,\n");
		sqlSb.append("	trends_uint.value_min,\n");
		sqlSb.append("	trends_uint.value_avg AS y,\n");
		sqlSb.append("	trends_uint.value_max\n");
		sqlSb.append("FROM\n");
		sqlSb.append("	trends_uint\n");
		sqlSb.append("WHERE\n");
		sqlSb.append("	trends_uint.itemid = ?\n");
		sqlSb.append("ORDER BY\n");
		sqlSb.append("	clock\n");

		long preClock = -1;

		List<List<Object>> listList = new ArrayList<>();

		for (Map<String, Object> map : getMapList(sqlSb, itemId)) {
			long x = NumberUtil.getLong(map, "x");

			List<Object> list2 = new ArrayList<>();
			list2.add(map.get("x"));
			list2.add(map.get("y"));

			if (preClock == -1) {
				preClock = x;
			} else {
				if (x - preClock > 3600 * 1000) {
					List<Object> list3 = new ArrayList<>();
					list3.add(preClock + 3600 * 1000);
					list3.add(null);
					listList.add(list3);

					preClock = -1;
				} else {
					preClock = x;
				}
			}

			listList.add(list2);
		}

		return listList;
	}

	@Override
	public List<List<Object>> getHistoryFloat2(String itemId) {

		StringBuffer sqlSb = new StringBuffer();
		sqlSb.append("SELECT\n");
		sqlSb.append("	trends.clock * 1000 AS x,\n");
		sqlSb.append("	trends.num,\n");
		sqlSb.append("	trends.value_min,\n");
		sqlSb.append("	trends.value_avg AS y,\n");
		sqlSb.append("	trends.value_max\n");
		sqlSb.append("FROM\n");
		sqlSb.append("	trends\n");
		sqlSb.append("WHERE\n");
		sqlSb.append("	trends.itemid = ?\n");
		sqlSb.append("ORDER BY\n");
		sqlSb.append("	clock\n");

		List<List<Object>> listList = new ArrayList<>();

		long preClock = -1;

		for (Map<String, Object> map : getMapList(sqlSb, itemId)) {
			long x = NumberUtil.getLong(map, "x");

			List<Object> list2 = new ArrayList<>();
			list2.add(map.get("x"));
			list2.add(map.get("y"));

			if (preClock == -1) {
				preClock = x;
			} else {
				if (x - preClock > 3600 * 1000) {
					List<Object> list3 = new ArrayList<>();
					list3.add(preClock + 3600 * 1000);
					list3.add(null);
					listList.add(list3);

					preClock = -1;
				} else {
					preClock = x;
				}
			}

			listList.add(list2);
		}

		return listList;
	}
}
