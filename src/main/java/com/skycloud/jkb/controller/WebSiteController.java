/**
 * WebSiteController.java
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
import com.skycloud.jkb.pojo.model.WebSite;
import com.skycloud.jkb.pojo.vo.PageResult;
import com.skycloud.jkb.pojo.vo.ReqBody;
import com.skycloud.jkb.pojo.vo.ResultMsg;
import com.skycloud.jkb.service.IWebSiteService;

/**
 * Web站点请求控制层.
 * 
 * @creation 2014年01月02日 06:24:49
 * @modification 2014年01月02日 06:24:49
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Controller
@RequestMapping(value = "webSite")
public class WebSiteController extends BaseController {

	private static Logger logger = Logger.getLogger(WebSiteController.class);

	@Autowired
	IWebSiteService webSiteService;

	/**
	 * 添加Web站点.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月02日 06:24:49
	 * @modification 2014年01月02日 06:24:49
	 * @return
	 */
	@RequestMapping("add")
	@ResponseBody
	public ResultMsg add(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("添加Web站点");

		WebSite webSite = getParam(reqBody, WebSite.class);

		// 参数验证
		Assert.notNull(webSite.getName());
		Assert.notNull(webSite.getUrl());
		Assert.notNull(webSite.getGroupId());

		boolean saved = webSiteService.save(locale, webSite);

		return new ResultMsg(saved, reqBody.getId(), webSite.getHostid());
	}

	/**
	 * 删除Web站点.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月02日 06:24:49
	 * @modification 2014年01月02日 06:24:49
	 * @return
	 */
	@RequestMapping("delete")
	@ResponseBody
	public ResultMsg delete(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("删除Web站点");

		WebSite webSite = getParam(reqBody, WebSite.class);

		// 参数验证
		Assert.notNull(webSite.getHostid());

		boolean deleted = webSiteService.delete(locale, webSite);

		return new ResultMsg(deleted, reqBody.getId());
	}

	/**
	 * 获取Web站点.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月02日 06:24:49
	 * @modification 2014年01月02日 06:24:49
	 * @return
	 */
	// @RequestMapping("get")
	@ResponseBody
	public ResultMsg get(@RequestBody ReqBody reqBody, Locale locale) {

		// TODO

		logger.debug("获取Web站点");

		WebSite webSite = getParam(reqBody, WebSite.class);

		// TODO 参数验证
		// Assert.notNull(webSite.get);

		WebSite getWebSite = webSiteService.get(locale, webSite);

		return new ResultMsg(true, reqBody.getId(), getWebSite);
	}

	/**
	 * 更新Web站点.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月02日 06:24:49
	 * @modification 2014年01月02日 06:24:49
	 * @return
	 */
	@RequestMapping("update")
	@ResponseBody
	public ResultMsg update(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("更新Web站点");

		WebSite webSite = getParam(reqBody, WebSite.class);

		// 参数验证
		Assert.notNull(webSite.getName());
		Assert.notNull(webSite.getUrl());
		Assert.notNull(webSite.getStatus());

		boolean updated = webSiteService.update(locale, webSite);

		return new ResultMsg(updated, reqBody.getId());
	}

	/**
	 * 列举Web站点.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月02日 06:24:49
	 * @modification 2014年01月02日 06:24:49
	 * @return
	 */
	// @RequestMapping("list")
	@ResponseBody
	public ResultMsg list(@RequestBody ReqBody reqBody, Locale locale) {

		// TODO

		logger.debug("列举Web站点");

		// WebSite webSite = getParam(reqBody, WebSite.class);

		// TODO 参数验证
		// Assert.notNull(webSite.get);

		List<WebSite> webSiteList = webSiteService.list(locale);

		return new ResultMsg(reqBody.getId(), webSiteList);
	}

	/**
	 * 查询【Web站点】(分页).
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月06日 04:47:01
	 * @modification 2014年01月06日 04:47:01
	 * @return
	 */
	@RequestMapping("paging")
	@ResponseBody
	public ResultMsg paging(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("查询【Web站点】");

		WebSite webSite = getParam(reqBody, WebSite.class);

		// 参数验证
		Assert.notNull(reqBody.getStart());
		Assert.notNull(reqBody.getLimit());

		PageResult pageResult = webSiteService.paging(locale, webSite, reqBody.getStart(), reqBody.getLimit());

		return new ResultMsg(reqBody.getId(), pageResult.getList(), pageResult.getTotal());
	}

}
