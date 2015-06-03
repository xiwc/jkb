/**
 * AlarmDaoImpl.java
 */
package com.skycloud.jkb.dao.impl;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.skycloud.jkb.base.impl.BaseDaoImpl;
import com.skycloud.jkb.dao.IAlarmDao;
import com.skycloud.jkb.pojo.model.Alarm;
import com.skycloud.jkb.util.DateUtil;
import com.skycloud.jkb.util.SqlUtil;

/**
 * 【告警】持久化实现层.
 * 
 * @creation 2014年01月15日 03:59:48
 * @modification 2014年01月15日 03:59:48
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Repository
@Transactional
public class AlarmDaoImpl extends BaseDaoImpl implements IAlarmDao {

	@Override
	public List<Map<String, Object>> query(Locale locale, Alarm alarm, Long start, Long limit) {

		StringBuffer sqlSb = new StringBuffer();
		sqlSb.append("SELECT\n");
		sqlSb.append("	`triggers`.triggerid,\n");
		sqlSb.append("	`triggers`.description,\n");
		sqlSb.append("	`triggers`.priority,\n");
		sqlSb.append("	`triggers`.lastchange,\n");
		sqlSb.append("	`triggers`.type,\n");
		sqlSb.append("	`triggers`.value_flags,\n");
		sqlSb.append("	`triggers`.flags,\n");
		sqlSb.append("	`hosts`.`host`,\n");
		sqlSb.append("	`hosts`.`name`,\n");
		sqlSb.append("	sg.monitortype\n");
		sqlSb.append("FROM\n");
		sqlSb.append("	`triggers`\n");
		sqlSb.append("INNER JOIN functions ON `triggers`.triggerid = functions.triggerid\n");
		sqlSb.append("INNER JOIN items ON items.itemid = functions.itemid\n");
		sqlSb.append("INNER JOIN `hosts` ON `hosts`.hostid = items.hostid\n");
		sqlSb.append("INNER JOIN skycloud_groupstype_host AS sgh ON sgh.hostid = `hosts`.hostid\n");
		sqlSb.append("INNER JOIN skycloud_grouptype AS sg ON sg.typeid = sgh.typeid\n");
		sqlSb.append("WHERE\n");
		sqlSb.append("	`triggers`.`value` = 1\n");

		sqlSb.append(SqlUtil.replaceIfNotEmpty("AND sg.monitortype = '{?1}'\n", alarm.getMonitoringType()));
		sqlSb.append(SqlUtil.replaceIfNotEmpty("AND `triggers`.lastchange >= {?1}\n",
				DateUtil.getTime(alarm.getStartTime())));
		sqlSb.append(SqlUtil.replaceIfNotEmpty("AND `triggers`.lastchange <= {?1}\n",
				DateUtil.getTime(alarm.getEndTime())));
		sqlSb.append(SqlUtil.replaceIfNotEmpty("AND `triggers`.priority IN ({?1})\n", alarm.getLevel()));
		sqlSb.append(SqlUtil.replaceIfNotEmpty("AND `hosts`.`name` LIKE '%{?1}%'\n", alarm.getKeyword()));
		sqlSb.append(SqlUtil.replaceIfNotEmpty("AND `triggers`.description LIKE '%{?1}%'\n", alarm.getDescription()));

		sqlSb.append(SqlUtil.replaceIfNotEmpty("LIMIT {?1}, {?2}\n", start, limit));

		return getMapList(sqlSb);
	}

	@Override
	public long queryCount(Locale locale, Alarm alarm) {

		StringBuffer sqlSb = new StringBuffer();
		sqlSb.append("SELECT\n");
		sqlSb.append("	COUNT(*)\n");
		sqlSb.append("FROM\n");
		sqlSb.append("	`triggers`\n");
		sqlSb.append("INNER JOIN functions ON `triggers`.triggerid = functions.triggerid\n");
		sqlSb.append("INNER JOIN items ON items.itemid = functions.itemid\n");
		sqlSb.append("INNER JOIN `hosts` ON `hosts`.hostid = items.hostid\n");
		sqlSb.append("INNER JOIN skycloud_groupstype_host AS sgh ON sgh.hostid = `hosts`.hostid\n");
		sqlSb.append("INNER JOIN skycloud_grouptype AS sg ON sg.typeid = sgh.typeid\n");
		sqlSb.append("WHERE\n");
		sqlSb.append("	`triggers`.`value` = 1\n");

		sqlSb.append(SqlUtil.replaceIfNotEmpty("AND sg.monitortype = '{?1}'\n", alarm.getMonitoringType()));
		sqlSb.append(SqlUtil.replaceIfNotEmpty("AND `triggers`.lastchange >= {?1}\n",
				DateUtil.getTime(alarm.getStartTime())));
		sqlSb.append(SqlUtil.replaceIfNotEmpty("AND `triggers`.lastchange <= {?1}\n",
				DateUtil.getTime(alarm.getEndTime())));
		sqlSb.append(SqlUtil.replaceIfNotEmpty("AND `triggers`.priority IN ({?1})\n", alarm.getLevel()));
		sqlSb.append(SqlUtil.replaceIfNotEmpty("AND `hosts`.`name` LIKE '%{?1}%'\n", alarm.getKeyword()));
		sqlSb.append(SqlUtil.replaceIfNotEmpty("AND `triggers`.description LIKE '%{?1}%'\n", alarm.getDescription()));

		return getCount(sqlSb);
	}

}
