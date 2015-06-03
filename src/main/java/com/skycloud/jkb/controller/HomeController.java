package com.skycloud.jkb.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.skycloud.jkb.base.BaseController;
import com.skycloud.jkb.pojo.constant.SysConstant;
import com.skycloud.jkb.pojo.model.Home;
import com.skycloud.jkb.pojo.vo.ReqBody;
import com.skycloud.jkb.pojo.vo.ResultMsg;
import com.skycloud.jkb.service.IHomeService;

/**
 * 测试请求控制层.
 * 
 * @creation 2013年12月24日 下午4:26:40
 * @modification 2013年12月24日 下午4:26:40
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Controller
@RequestMapping("test")
public class HomeController extends BaseController {

	private static Logger logger = Logger.getLogger(HomeController.class);

	@Autowired
	IHomeService homeService;

	 @RequestMapping("home")
	public String home() {

		logger.debug("query size.");

		return "test";
	}

	// @RequestMapping("zabbixApi")
	@ResponseBody
	public JSON zabbixApi() {

		logger.debug("zabbixApi test...");

		String json = "{\"jsonrpc\": \"2.0\",\"result\": {\"actionids\": [\"18\"]},\"id\": 1}";

		return JSON.parseObject(json);
	}

	// @RequestMapping("backJsonString")
	@ResponseBody
	public String backJsonString() {

		logger.debug("backJsonString test...");

		String json = "{\"jsonrpc\": \"2.0\",\"result\": {\"actionids\": [\"18\"]},\"id\": 1}";

		return json;
	}

	// @RequestMapping("reqBody")
	public void reqBody(@RequestBody ReqBody reqBody) {

		logger.debug("reqBody test...");

		Home home = getParam(reqBody, Home.class);

		logger.debug(home);
	}

	// @RequestMapping("throwable")
	public void throwable() {

		logger.debug("throwable test...");

		homeService.toString();
	}

	// @RequestMapping("callback")
	public ModelAndView callback(@RequestBody ReqBody reqBody) {

		logger.debug("callbackJson test...");

		ModelAndView modelAndView = new ModelAndView(ajaxJsonView, SysConstant.MODEL_NAME_AJAX_JSON,
				new ResultMsg(true));
		modelAndView.addObject(SysConstant.CALLBACK, reqBody.getCallback());

		return modelAndView;
	}

}
