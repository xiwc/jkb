/**
 * HostGroupController.java
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
import com.skycloud.jkb.pojo.model.HostGroup;
import com.skycloud.jkb.pojo.vo.PageResult;
import com.skycloud.jkb.pojo.vo.ReqBody;
import com.skycloud.jkb.pojo.vo.ResultMsg;
import com.skycloud.jkb.service.IHostGroupService;

/**
 * 主机组请求控制层.
 * 
 * @creation 2014年01月03日 10:56:43
 * @modification 2014年01月03日 10:56:43
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Controller
@RequestMapping(value = "hostGroup")
public class HostGroupController extends BaseController {

	private static Logger logger = Logger.getLogger(HostGroupController.class);

	@Autowired
	IHostGroupService hostGroupService;

	/**
	 * 添加主机组.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月03日 10:56:43
	 * @modification 2014年01月03日 10:56:43
	 * @return
	 */
	@RequestMapping("add")
	@ResponseBody
	public ResultMsg add(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("添加主机组");

		HostGroup hostGroup = getParam(reqBody, HostGroup.class);

		// 参数验证
		Assert.notNull(hostGroup.getName());

		boolean saved = hostGroupService.save(locale, hostGroup);

		return new ResultMsg(saved, reqBody.getId(), hostGroup.getGroupid());
	}

	/**
	 * 删除主机组.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月03日 10:56:43
	 * @modification 2014年01月03日 10:56:43
	 * @return
	 */
	// @RequestMapping("delete")
	@ResponseBody
	public ResultMsg delete(@RequestBody ReqBody reqBody, Locale locale) {

		// TODO

		logger.debug("删除主机组");

		HostGroup hostGroup = getParam(reqBody, HostGroup.class);

		// 参数验证
		// Assert.notNull(hostGroup.get);

		boolean deleted = hostGroupService.delete(locale, hostGroup);

		return new ResultMsg(deleted, reqBody.getId());
	}

	/**
	 * 获取主机组.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月03日 10:56:43
	 * @modification 2014年01月03日 10:56:43
	 * @return
	 */
	// @RequestMapping("get")
	@ResponseBody
	public ResultMsg get(@RequestBody ReqBody reqBody, Locale locale) {

		// TODO

		logger.debug("获取主机组");

		HostGroup hostGroup = getParam(reqBody, HostGroup.class);

		// 参数验证
		// Assert.notNull(hostGroup.get);

		HostGroup getHostGroup = hostGroupService.get(locale, hostGroup);

		return new ResultMsg(true, reqBody.getId(), getHostGroup);
	}

	/**
	 * 更新主机组.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月03日 10:56:43
	 * @modification 2014年01月03日 10:56:43
	 * @return
	 */
	// @RequestMapping("update")
	@ResponseBody
	public ResultMsg update(@RequestBody ReqBody reqBody, Locale locale) {

		// TODO

		logger.debug("更新主机组");

		HostGroup hostGroup = getParam(reqBody, HostGroup.class);

		// 参数验证
		// Assert.notNull(hostGroup.get);

		boolean updated = hostGroupService.update(locale, hostGroup);

		return new ResultMsg(updated, reqBody.getId());
	}

	/**
	 * 列举主机组.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月03日 10:56:43
	 * @modification 2014年01月03日 10:56:43
	 * @return
	 */
	// @RequestMapping("list")
	@ResponseBody
	public ResultMsg list(@RequestBody ReqBody reqBody, Locale locale) {

		// TODO

		logger.debug("列举主机组");

		// HostGroup hostGroup = getParam(reqBody, HostGroup.class);

		// 参数验证
		// Assert.notNull(hostGroup.get);

		List<HostGroup> hostGroupList = hostGroupService.list(locale);

		return new ResultMsg(reqBody.getId(), hostGroupList);
	}

	/**
	 * 查询主机组(不分页).
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月03日 10:56:43
	 * @modification 2014年01月03日 10:56:43
	 * @return
	 */
	// @RequestMapping("query")
	@ResponseBody
	public ResultMsg query(@RequestBody ReqBody reqBody, Locale locale) {

		// TODO

		logger.debug("查询主机组");

		HostGroup hostGroup = getParam(reqBody, HostGroup.class);

		// 参数验证
		// Assert.notNull(hostGroup.get);

		List<HostGroup> hostGroupList = hostGroupService.query(locale, hostGroup);

		return new ResultMsg(reqBody.getId(), hostGroupList);
	}

	/**
	 * 查询主机组(分页).
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月03日 10:56:43
	 * @modification 2014年01月03日 10:56:43
	 * @return
	 */
	// @RequestMapping("paging")
	@ResponseBody
	public ResultMsg paging(@RequestBody ReqBody reqBody, Locale locale) {

		// TODO

		logger.debug("查询主机组");

		HostGroup hostGroup = getParam(reqBody, HostGroup.class);

		// 参数验证
		Assert.notNull(reqBody.getStart());
		Assert.notNull(reqBody.getLimit());

		// Assert.notNull(hostGroup.get);

		PageResult pageResult = hostGroupService.paging(locale, hostGroup, reqBody.getStart(), reqBody.getLimit());

		return new ResultMsg(reqBody.getId(), pageResult.getList(), pageResult.getTotal());
	}

}
