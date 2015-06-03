/**
 * ActionController.java
 */
package com.skycloud.jkb.controller;

import java.util.List;
import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.skycloud.jkb.base.BaseController;
import com.skycloud.jkb.pojo.model.Action;
import com.skycloud.jkb.pojo.vo.PageResult;
import com.skycloud.jkb.pojo.vo.ReqBody;
import com.skycloud.jkb.pojo.vo.ResultMsg;
import com.skycloud.jkb.service.IActionService;

/**
 * 【告警动作】请求控制层.
 * 
 * @creation 2014年01月03日 12:19:14
 * @modification 2014年01月03日 12:19:14
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Controller
@RequestMapping(value = "action")
public class ActionController extends BaseController {

	private static Logger logger = Logger.getLogger(ActionController.class);

	@Autowired
	IActionService actionService;

	/**
	 * 添加【告警动作】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月03日 12:19:14
	 * @modification 2014年01月03日 12:19:14
	 * @return
	 */
	// @RequestMapping("add")
	@ResponseBody
	public ResultMsg add(@RequestBody ReqBody reqBody, Locale locale) {

		// TODO

		logger.debug("添加【告警动作】");

		Action action = getParam(reqBody, Action.class);

		// 参数验证
		// Assert.notNull(action.get);

		boolean saved = actionService.save(locale, action);

		return new ResultMsg(saved, reqBody.getId());
	}

	/**
	 * 删除【告警动作】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月03日 12:19:14
	 * @modification 2014年01月03日 12:19:14
	 * @return
	 */
	// @RequestMapping("delete")
	@ResponseBody
	public ResultMsg delete(@RequestBody ReqBody reqBody, Locale locale) {

		// TODO

		logger.debug("删除【告警动作】");

		Action action = getParam(reqBody, Action.class);

		// 参数验证
		// Assert.notNull(action.get);

		boolean deleted = actionService.delete(locale, action);

		return new ResultMsg(deleted, reqBody.getId());
	}

	/**
	 * 获取【告警动作】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月03日 12:19:14
	 * @modification 2014年01月03日 12:19:14
	 * @return
	 */
	// @RequestMapping("get")
	@ResponseBody
	public ResultMsg get(@RequestBody ReqBody reqBody, Locale locale) {

		// TODO

		logger.debug("获取【告警动作】");

		Action action = getParam(reqBody, Action.class);

		// 参数验证
		// Assert.notNull(action.get);

		Action getAction = actionService.get(locale, action);

		return new ResultMsg(true, reqBody.getId(), getAction);
	}

	/**
	 * 更新【告警动作】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月03日 12:19:14
	 * @modification 2014年01月03日 12:19:14
	 * @return
	 */
	// @RequestMapping("update")
	@ResponseBody
	public ResultMsg update(@RequestBody ReqBody reqBody, Locale locale) {

		// TODO

		logger.debug("更新【告警动作】");

		Action action = getParam(reqBody, Action.class);

		// 参数验证
		// Assert.notNull(action.get);

		boolean updated = actionService.update(locale, action);

		return new ResultMsg(updated, reqBody.getId());
	}

	/**
	 * 列举【告警动作】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月03日 12:19:14
	 * @modification 2014年01月03日 12:19:14
	 * @return
	 */
	// @RequestMapping("list")
	@ResponseBody
	public ResultMsg list(@RequestBody ReqBody reqBody, Locale locale) {

		// TODO

		logger.debug("列举【告警动作】");

		// Action action = getParam(reqBody, Action.class);

		// 参数验证
		// Assert.notNull(action.get);

		List<Action> actionList = actionService.list(locale);

		return new ResultMsg(reqBody.getId(), actionList);
	}

	/**
	 * 查询【告警动作】(不分页).
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月03日 12:19:14
	 * @modification 2014年01月03日 12:19:14
	 * @return
	 */
	// @RequestMapping("query")
	@ResponseBody
	public ResultMsg query(@RequestBody ReqBody reqBody, Locale locale) {

		// TODO

		logger.debug("查询【告警动作】");

		Action action = getParam(reqBody, Action.class);

		// 参数验证
		// Assert.notNull(action.get);

		List<Action> actionList = actionService.query(locale, action);

		return new ResultMsg(reqBody.getId(), actionList);
	}

	/**
	 * 查询【告警动作】(分页).
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月03日 12:19:14
	 * @modification 2014年01月03日 12:19:14
	 * @return
	 */
	// @RequestMapping("paging")
	@ResponseBody
	public ResultMsg paging(@RequestBody ReqBody reqBody, Locale locale) {

		// TODO

		logger.debug("查询【告警动作】");

		Action action = getParam(reqBody, Action.class);

		// 参数验证
		Assert.notNull(reqBody.getStart());
		Assert.notNull(reqBody.getLimit());

		// Assert.notNull(action.get);

		PageResult pageResult = actionService.paging(locale, action, reqBody.getStart(), reqBody.getLimit());

		return new ResultMsg(reqBody.getId(), pageResult.getList(), pageResult.getTotal());
	}

}
