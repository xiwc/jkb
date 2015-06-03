/**
 * AppServiceController.java
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
import com.skycloud.jkb.pojo.model.AppService;
import com.skycloud.jkb.pojo.vo.PageResult;
import com.skycloud.jkb.pojo.vo.ReqBody;
import com.skycloud.jkb.pojo.vo.ResultMsg;
import com.skycloud.jkb.service.IAppServiceService;

/**
 * 【应用服务】请求控制层.
 * 
 * @creation 2014年01月15日 03:56:46
 * @modification 2014年01月15日 03:56:46
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Controller
@RequestMapping(value = "appService")
public class AppServiceController extends BaseController {

	private static Logger logger = Logger.getLogger(AppServiceController.class);

	@Autowired
	IAppServiceService appServiceService;

	/**
	 * 添加【应用服务】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 03:56:46
	 * @modification 2014年01月15日 03:56:46
	 * @return
	 */
	// @RequestMapping("add")
	@ResponseBody
	public ResultMsg add(@RequestBody ReqBody reqBody, Locale locale) {
	
		logger.debug("添加【应用服务】");

		// TODO

		AppService appService = getParam(reqBody, AppService.class);

		// 参数验证
		// Assert.notNull(appService.get);

		boolean saved = appServiceService.save(locale, appService);

		// TODO null->ID
		return new ResultMsg(saved, reqBody.getId(), null);
	}

	/**
	 * 删除【应用服务】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 03:56:46
	 * @modification 2014年01月15日 03:56:46
	 * @return
	 */
	// @RequestMapping("delete")
	@ResponseBody
	public ResultMsg delete(@RequestBody ReqBody reqBody, Locale locale) {
	
		logger.debug("删除【应用服务】");

		// TODO

		AppService appService = getParam(reqBody, AppService.class);

		// 参数验证
		// Assert.notNull(appService.get);

		boolean deleted = appServiceService.delete(locale, appService);

		return new ResultMsg(deleted, reqBody.getId());
	}

	/**
	 * 获取【应用服务】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 03:56:46
	 * @modification 2014年01月15日 03:56:46
	 * @return
	 */
	// @RequestMapping("get")
	@ResponseBody
	public ResultMsg get(@RequestBody ReqBody reqBody, Locale locale) {
	
		logger.debug("获取【应用服务】");

		// TODO

		AppService appService = getParam(reqBody, AppService.class);
		
		// 参数验证
		// Assert.notNull(appService.get);

		AppService getAppService = appServiceService.get(locale, appService);

		return new ResultMsg(true, reqBody.getId(), getAppService);
	}
	
	/**
	 * 更新【应用服务】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 03:56:46
	 * @modification 2014年01月15日 03:56:46
	 * @return
	 */
	// @RequestMapping("update")
	@ResponseBody
	public ResultMsg update(@RequestBody ReqBody reqBody, Locale locale) {
	
		logger.debug("更新【应用服务】");

		// TODO

		AppService appService = getParam(reqBody, AppService.class);
		
		// 参数验证
		// Assert.notNull(appService.get);

		boolean updated = appServiceService.update(locale, appService);

		return new ResultMsg(updated, reqBody.getId());
	}
	
	/**
	 * 列举【应用服务】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 03:56:46
	 * @modification 2014年01月15日 03:56:46
	 * @return
	 */
	// @RequestMapping("list")
	@ResponseBody
	public ResultMsg list(@RequestBody ReqBody reqBody, Locale locale) {
	
		logger.debug("列举【应用服务】");

		// TODO

		// AppService appService = getParam(reqBody, AppService.class);
		
		// 参数验证
		// Assert.notNull(appService.get);

		List<AppService> appServiceList = appServiceService.list(locale);

		return new ResultMsg(reqBody.getId(), appServiceList);
	}
	
	/**
	 * 查询【应用服务】(不分页).
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 03:56:46
	 * @modification 2014年01月15日 03:56:46
	 * @return
	 */
	// @RequestMapping("query")
	@ResponseBody
	public ResultMsg query(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("查询【应用服务】");

		// TODO

		AppService appService = getParam(reqBody, AppService.class);

		// 参数验证
		// Assert.notNull(appService.get);

		List<Map<String, Object>> appServiceList = appServiceService.query(locale, appService);

		return new ResultMsg(reqBody.getId(), appServiceList);
	}

	/**
	 * 查询【应用服务】(分页).
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 03:56:46
	 * @modification 2014年01月15日 03:56:46
	 * @return
	 */
	// @RequestMapping("paging")
	@ResponseBody
	public ResultMsg paging(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("查询【应用服务】");

		// TODO

		AppService appService = getParam(reqBody, AppService.class);

		// 参数验证
		Assert.notNull(reqBody.getStart());
		Assert.notNull(reqBody.getLimit());
		
		// Assert.notNull(appService.get);

		PageResult pageResult = appServiceService.paging(locale, appService, reqBody.getStart(), reqBody.getLimit());

		return new ResultMsg(reqBody.getId(), pageResult.getList(), pageResult.getTotal());
	}
	
}
