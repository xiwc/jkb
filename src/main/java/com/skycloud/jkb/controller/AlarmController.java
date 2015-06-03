/**
 * AlarmController.java
 */
package com.skycloud.jkb.controller;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.skycloud.jkb.base.BaseController;
import com.skycloud.jkb.pojo.model.Alarm;
import com.skycloud.jkb.pojo.vo.PageResult;
import com.skycloud.jkb.pojo.vo.ReqBody;
import com.skycloud.jkb.pojo.vo.ResultMsg;
import com.skycloud.jkb.service.IAlarmService;

/**
 * 【告警】请求控制层.
 * 
 * @creation 2014年01月15日 03:59:48
 * @modification 2014年01月15日 03:59:48
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Controller
@RequestMapping(value = "alarm")
public class AlarmController extends BaseController {

	private static Logger logger = Logger.getLogger(AlarmController.class);

	@Autowired
	IAlarmService alarmService;

	/**
	 * 添加【告警】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 03:59:48
	 * @modification 2014年01月15日 03:59:48
	 * @return
	 */
	// @RequestMapping("add")
	@ResponseBody
	public ResultMsg add(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("添加【告警】");

		// TODO

		Alarm alarm = getParam(reqBody, Alarm.class);

		// 参数验证
		// Assert.notNull(alarm.get);

		boolean saved = alarmService.save(locale, alarm);

		// TODO null->ID
		return new ResultMsg(saved, reqBody.getId(), null);
	}

	/**
	 * 删除【告警】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 03:59:48
	 * @modification 2014年01月15日 03:59:48
	 * @return
	 */
	// @RequestMapping("delete")
	@ResponseBody
	public ResultMsg delete(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("删除【告警】");

		// TODO

		Alarm alarm = getParam(reqBody, Alarm.class);

		// 参数验证
		// Assert.notNull(alarm.get);

		boolean deleted = alarmService.delete(locale, alarm);

		return new ResultMsg(deleted, reqBody.getId());
	}

	/**
	 * 获取【告警】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 03:59:48
	 * @modification 2014年01月15日 03:59:48
	 * @return
	 */
	// @RequestMapping("get")
	@ResponseBody
	public ResultMsg get(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("获取【告警】");

		// TODO

		Alarm alarm = getParam(reqBody, Alarm.class);

		// 参数验证
		// Assert.notNull(alarm.get);

		Alarm getAlarm = alarmService.get(locale, alarm);

		return new ResultMsg(true, reqBody.getId(), getAlarm);
	}

	/**
	 * 更新【告警】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 03:59:48
	 * @modification 2014年01月15日 03:59:48
	 * @return
	 */
	// @RequestMapping("update")
	@ResponseBody
	public ResultMsg update(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("更新【告警】");

		// TODO

		Alarm alarm = getParam(reqBody, Alarm.class);

		// 参数验证
		// Assert.notNull(alarm.get);

		boolean updated = alarmService.update(locale, alarm);

		return new ResultMsg(updated, reqBody.getId());
	}

	/**
	 * 列举【告警】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 03:59:48
	 * @modification 2014年01月15日 03:59:48
	 * @return
	 */
	// @RequestMapping("list")
	@ResponseBody
	public ResultMsg list(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("列举【告警】");

		// TODO

		// Alarm alarm = getParam(reqBody, Alarm.class);

		// 参数验证
		// Assert.notNull(alarm.get);

		List<Alarm> alarmList = alarmService.list(locale);

		return new ResultMsg(reqBody.getId(), alarmList);
	}

	/**
	 * 查询【告警】(不分页).
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 03:59:48
	 * @modification 2014年01月15日 03:59:48
	 * @return
	 */
	// @RequestMapping("query")
	@ResponseBody
	public ResultMsg query(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("查询【告警】");

		// TODO

		Alarm alarm = getParam(reqBody, Alarm.class);

		// 参数验证
		// Assert.notNull(alarm.get);

		List<Map<String, Object>> alarmList = alarmService.query(locale, alarm);

		return new ResultMsg(reqBody.getId(), alarmList);
	}

	/**
	 * 查询【告警】(分页).
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 03:59:48
	 * @modification 2014年01月15日 03:59:48
	 * @return
	 */
	@RequestMapping("paging")
	@ResponseBody
	public ResultMsg paging(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("查询【告警】");

		// TODO

		Alarm alarm = getParam(reqBody, Alarm.class);

		// 参数验证
		Assert.notNull(reqBody.getStart());
		Assert.notNull(reqBody.getLimit());

		// Assert.notNull(alarm.get);

		PageResult pageResult = alarmService.paging(locale, alarm, reqBody.getStart(), reqBody.getLimit());

		return new ResultMsg(reqBody.getId(), pageResult.getList(), pageResult.getTotal());
	}

}
