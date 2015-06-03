/**
 * ServerController.java
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
import com.skycloud.jkb.component.PropUtil;
import com.skycloud.jkb.pojo.constant.SysConstant;
import com.skycloud.jkb.pojo.model.Server;
import com.skycloud.jkb.pojo.vo.PageResult;
import com.skycloud.jkb.pojo.vo.ReqBody;
import com.skycloud.jkb.pojo.vo.ResultMsg;
import com.skycloud.jkb.service.IServerService;
import com.skycloud.jkb.util.StringUtil;

/**
 * 【服务器】请求控制层.
 * 
 * @creation 2014年01月15日 12:00:07
 * @modification 2014年01月15日 12:00:07
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Controller
@RequestMapping(value = "server")
public class ServerController extends BaseController {

	private static Logger logger = Logger.getLogger(ServerController.class);

	@Autowired
	IServerService serverService;

	@Autowired
	PropUtil propUtil;

	/**
	 * 添加【服务器】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 12:00:07
	 * @modification 2014年01月15日 12:00:07
	 * @return
	 */
	@RequestMapping("add")
	@ResponseBody
	public ResultMsg add(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("添加【服务器】");

		Server server = getParam(reqBody, Server.class);

		// 参数验证
		Assert.notNull(server.getId());
		Assert.notNull(server.getName());
		Assert.notNull(server.getIp());
		Assert.notNull(server.getTypeId());

		// 设置host字段
		server.setHost(StringUtil.join(SysConstant.EMPTY, SysConstant.PR_CHAZUO, server.getId()));

		// 设置监控模板
		if (StringUtil.isEmpty(server.getTemplateId())) {
			if (SysConstant.HOST_TYPE_WINDOWS.equals(server.getTypeId())) {
				server.setTemplateId(propUtil.getDefaultWinServerTplId());
			} else if (SysConstant.HOST_TYPE_LINUX.equals(server.getTypeId())) {
				server.setTemplateId(propUtil.getDefaultLinuxServerTplId());
			}
		}

		// 设置设备组
		if (StringUtil.isEmpty(server.getGroupId())) {
			server.setGroupId(propUtil.getDefaultHostGroupId());
		}

		boolean saved = serverService.save(locale, server);

		return new ResultMsg(saved, reqBody.getId(), server.getHostid());
	}

	/**
	 * 删除【服务器】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 12:00:07
	 * @modification 2014年01月15日 12:00:07
	 * @return
	 */
	@RequestMapping("delete")
	@ResponseBody
	public ResultMsg delete(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("删除【服务器】");

		Server server = getParam(reqBody, Server.class);

		// 参数验证
		Assert.notNull(server.getId());

		Server server2 = new Server();
		server2.setHost(SysConstant.PR_CHAZUO + server.getId());

		Server server3 = serverService.get(locale, server2);

		server.setHostid(server3.getHostid());

		boolean deleted = serverService.delete(locale, server);

		return new ResultMsg(deleted, reqBody.getId());
	}

	/**
	 * 获取【服务器】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 12:00:07
	 * @modification 2014年01月15日 12:00:07
	 * @return
	 */
	// @RequestMapping("get")
	@ResponseBody
	public ResultMsg get(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("获取【服务器】");

		// TODO

		Server server = getParam(reqBody, Server.class);

		// 参数验证
		// Assert.notNull(server.get);

		Server server2 = serverService.get(locale, server);

		return new ResultMsg(true, reqBody.getId(), server2);
	}

	/**
	 * 更新【服务器】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 12:00:07
	 * @modification 2014年01月15日 12:00:07
	 * @return
	 */
	@RequestMapping("update")
	@ResponseBody
	public ResultMsg update(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("更新【服务器】");

		Server server = getParam(reqBody, Server.class);

		// 参数验证
		Assert.notNull(server.getId());

		Server server2 = new Server();
		server2.setHost(SysConstant.PR_CHAZUO + server.getId());

		Server server3 = serverService.get(locale, server2);

		// 可更新字段
		// Assert.notNull(server.getName());
		// Assert.notNull(server.getIp());
		// Assert.notNull(server.getGroupId());
		// Assert.notNull(server.getTypeId());
		// Assert.notNull(server.getTemplateId());
		// Assert.notNull(server.getStatus());

		server.setHost(SysConstant.PR_CHAZUO + server.getId());
		server.setHostid(server3.getHostid());

		boolean updated = serverService.update(locale, server);

		return new ResultMsg(updated, reqBody.getId());
	}

	/**
	 * 列举【服务器】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 12:00:07
	 * @modification 2014年01月15日 12:00:07
	 * @return
	 */
	// @RequestMapping("list")
	@ResponseBody
	public ResultMsg list(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("列举【服务器】");

		// TODO

		// Server server = getParam(reqBody, Server.class);

		// 参数验证
		// Assert.notNull(server.get);

		List<Server> serverList = serverService.list(locale);

		return new ResultMsg(reqBody.getId(), serverList);
	}

	/**
	 * 查询【服务器】(不分页).
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 12:00:07
	 * @modification 2014年01月15日 12:00:07
	 * @return
	 */
	@RequestMapping("query")
	@ResponseBody
	public ResultMsg query(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("查询【服务器】");

		Server server = getParam(reqBody, Server.class);

		// 可查询条件
		// Assert.notNull(server.getHostid());
		// Assert.notNull(server.getName());
		// Assert.notNull(server.getItemName());
		// Assert.notNull(server.getItemId());
		// Assert.notNull(server.getIp());

		List<Map<String, Object>> serverList = serverService.query(locale, server);

		return new ResultMsg(reqBody.getId(), serverList);
	}

	/**
	 * 查询【服务器】(分页).
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 12:00:07
	 * @modification 2014年01月15日 12:00:07
	 * @return
	 */
	@RequestMapping("paging")
	@ResponseBody
	public ResultMsg paging(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("查询【服务器】");

		Server server = getParam(reqBody, Server.class);

		// 参数验证
		Assert.notNull(reqBody.getStart());
		Assert.notNull(reqBody.getLimit());

		// 可查询条件
		// Assert.notNull(server.getHostid());
		// Assert.notNull(server.getName());
		// Assert.notNull(server.getItemName());
		// Assert.notNull(server.getItemId());
		// Assert.notNull(server.getIp());

		PageResult pageResult = serverService.paging(locale, server, reqBody.getStart(), reqBody.getLimit());

		return new ResultMsg(reqBody.getId(), pageResult.getList(), pageResult.getTotal());
	}

	/**
	 * 获取实时监控数据cpu,mem,disk,netio,clock【服务器】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 12:00:07
	 * @modification 2014年01月15日 12:00:07
	 * @return
	 */
	@RequestMapping("getRT")
	@ResponseBody
	public ResultMsg getRT(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("获取实时监控数据【服务器】");

		Server server = getParam(reqBody, Server.class);

		// 参数验证
		Assert.notNull(server.getId());

		server.setHost(SysConstant.PR_CHAZUO + server.getId());

		Map<String, Object> rtMap = serverService.getRT(locale, server);

		if (rtMap == null) {
			return new ResultMsg(false);
		} else {
			return new ResultMsg(true, reqBody.getId(), rtMap);
		}
	}

	/**
	 * 获取主机主要的监控项.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 12:00:07
	 * @modification 2014年01月15日 12:00:07
	 * @return
	 */
	@RequestMapping("getItems")
	@ResponseBody
	public ResultMsg getItems(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("获取主机主要的监控项【服务器】");

		Server server = getParam(reqBody, Server.class);

		// 参数验证
		Assert.notNull(server.getId());

		server.setHost(SysConstant.PR_CHAZUO + server.getId());

		List<Map<String, Object>> items = serverService.getItems(server);

		if (items == null || items.size() == 0) {
			return new ResultMsg(false);
		} else {
			return new ResultMsg(true, reqBody.getId(), items);
		}
	}

	/**
	 * 获取主机主要的监控项.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月15日 12:00:07
	 * @modification 2014年01月15日 12:00:07
	 * @return
	 */
	@RequestMapping("getHistory")
	@ResponseBody
	public ResultMsg getHistory(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("获取主机历史监控数据【服务器】");

		Server server = getParam(reqBody, Server.class);

		// 参数验证
		Assert.notNull(server.getItemId());

		List<List<Object>> history = serverService.getHistory(server);

		if (history == null || history.size() == 0) {
			return new ResultMsg(false);
		} else {
			return new ResultMsg(true, reqBody.getId(), history);
		}
	}
}
