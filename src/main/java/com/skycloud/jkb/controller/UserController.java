/**
 * UserController.java
 */
package com.skycloud.jkb.controller;

import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.skycloud.jkb.base.BaseController;
import com.skycloud.jkb.pojo.model.User;
import com.skycloud.jkb.pojo.vo.ReqBody;
import com.skycloud.jkb.pojo.vo.ResultMsg;
import com.skycloud.jkb.service.IUserService;

/**
 * 用户管理请求控制层.
 * 
 * @creation 2013年12月25日 下午5:15:40
 * @modification 2013年12月25日 下午5:15:40
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Controller
@RequestMapping(value = "user")
public class UserController extends BaseController {

	private static Logger logger = Logger.getLogger(UserController.class);

	@Autowired
	IUserService userService;

	/**
	 * 添加用户.
	 * 
	 * @author xiweicheng
	 * @creation 2013年12月25日 下午5:18:36
	 * @modification 2013年12月25日 下午5:18:36
	 * @return
	 */
	@RequestMapping("add")
	@ResponseBody
	public ResultMsg add(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("添加用户");

		User user = getParam(reqBody, User.class);

		Assert.notNull(user.getAlias());
		Assert.notNull(user.getPasswd());
		Assert.notNull(user.getEmail());

		boolean saved = userService.save(locale, user);

		return new ResultMsg(saved, reqBody.getId());
	}

	// @RequestMapping("delete")
	@ResponseBody
	public ResultMsg delete(@RequestBody ReqBody reqBody, Locale locale) {

		// TODO

		logger.debug("删除用户");

		User user = getParam(reqBody, User.class);

		// TODO 参数验证
		Assert.notNull(user.getAlias());

		boolean deleted = userService.delete(locale, user);

		return new ResultMsg(deleted, reqBody.getId());
	}

	// @RequestMapping("get")
	@ResponseBody
	public ResultMsg get(@RequestBody ReqBody reqBody, Locale locale) {

		// TODO

		logger.debug("获取用户");

		User user = getParam(reqBody, User.class);
		// TODO 参数验证
		Assert.notNull(user.getAlias());

		User userBackUser = userService.get(locale, user);

		return new ResultMsg(true, reqBody.getId(), userBackUser);
	}
}
