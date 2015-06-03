/**
 * InterfacesController.java
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
import com.skycloud.jkb.pojo.model.Interfaces;
import com.skycloud.jkb.pojo.vo.PageResult;
import com.skycloud.jkb.pojo.vo.ReqBody;
import com.skycloud.jkb.pojo.vo.ResultMsg;
import com.skycloud.jkb.service.IInterfacesService;

/**
 * 【网络接口】请求控制层.
 * 
 * @creation 2014年04月01日 09:52:37
 * @modification 2014年04月01日 09:52:37
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Controller
@RequestMapping(value = "interfaces")
public class InterfacesController extends BaseController {

	private static Logger logger = Logger.getLogger(InterfacesController.class);

	@Autowired
	IInterfacesService interfacesService;

	/**
	 * 添加【网络接口】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年04月01日 09:52:37
	 * @modification 2014年04月01日 09:52:37
	 * @return
	 */
	// @RequestMapping("add")
	@ResponseBody
	public ResultMsg add(@RequestBody ReqBody reqBody, Locale locale) {
	
		logger.debug("添加【网络接口】");

		// TODO

		Interfaces interfaces = getParam(reqBody, Interfaces.class);

		// 参数验证
		// Assert.notNull(interfaces.get);

		boolean saved = interfacesService.save(locale, interfaces);

		// TODO null->ID
		return new ResultMsg(saved, reqBody.getId(), null);
	}

	/**
	 * 删除【网络接口】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年04月01日 09:52:37
	 * @modification 2014年04月01日 09:52:37
	 * @return
	 */
	// @RequestMapping("delete")
	@ResponseBody
	public ResultMsg delete(@RequestBody ReqBody reqBody, Locale locale) {
	
		logger.debug("删除【网络接口】");

		// TODO

		Interfaces interfaces = getParam(reqBody, Interfaces.class);

		// 参数验证
		// Assert.notNull(interfaces.get);

		boolean deleted = interfacesService.delete(locale, interfaces);

		return new ResultMsg(deleted, reqBody.getId());
	}

	/**
	 * 获取【网络接口】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年04月01日 09:52:37
	 * @modification 2014年04月01日 09:52:37
	 * @return
	 */
	// @RequestMapping("get")
	@ResponseBody
	public ResultMsg get(@RequestBody ReqBody reqBody, Locale locale) {
	
		logger.debug("获取【网络接口】");

		// TODO

		Interfaces interfaces = getParam(reqBody, Interfaces.class);
		
		// 参数验证
		// Assert.notNull(interfaces.get);

		Interfaces getInterfaces = interfacesService.get(locale, interfaces);

		return new ResultMsg(true, reqBody.getId(), getInterfaces);
	}
	
	/**
	 * 更新【网络接口】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年04月01日 09:52:37
	 * @modification 2014年04月01日 09:52:37
	 * @return
	 */
	// @RequestMapping("update")
	@ResponseBody
	public ResultMsg update(@RequestBody ReqBody reqBody, Locale locale) {
	
		logger.debug("更新【网络接口】");

		// TODO

		Interfaces interfaces = getParam(reqBody, Interfaces.class);
		
		// 参数验证
		// Assert.notNull(interfaces.get);

		boolean updated = interfacesService.update(locale, interfaces);

		return new ResultMsg(updated, reqBody.getId());
	}
	
	/**
	 * 列举【网络接口】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年04月01日 09:52:37
	 * @modification 2014年04月01日 09:52:37
	 * @return
	 */
	// @RequestMapping("list")
	@ResponseBody
	public ResultMsg list(@RequestBody ReqBody reqBody, Locale locale) {
	
		logger.debug("列举【网络接口】");

		// TODO

		// Interfaces interfaces = getParam(reqBody, Interfaces.class);
		
		// 参数验证
		// Assert.notNull(interfaces.get);

		List<Interfaces> interfacesList = interfacesService.list(locale);

		return new ResultMsg(reqBody.getId(), interfacesList);
	}
	
	/**
	 * 查询【网络接口】(不分页).
	 * 
	 * @author xiweicheng
	 * @creation 2014年04月01日 09:52:37
	 * @modification 2014年04月01日 09:52:37
	 * @return
	 */
	// @RequestMapping("query")
	@ResponseBody
	public ResultMsg query(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("查询【网络接口】");

		// TODO

		Interfaces interfaces = getParam(reqBody, Interfaces.class);

		// 参数验证
		// Assert.notNull(interfaces.get);

		List<Map<String, Object>> interfacesList = interfacesService.query(locale, interfaces);

		return new ResultMsg(reqBody.getId(), interfacesList);
	}

	/**
	 * 查询【网络接口】(分页).
	 * 
	 * @author xiweicheng
	 * @creation 2014年04月01日 09:52:37
	 * @modification 2014年04月01日 09:52:37
	 * @return
	 */
	// @RequestMapping("paging")
	@ResponseBody
	public ResultMsg paging(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("查询【网络接口】");

		// TODO

		Interfaces interfaces = getParam(reqBody, Interfaces.class);

		// 参数验证
		Assert.notNull(reqBody.getStart());
		Assert.notNull(reqBody.getLimit());
		
		// Assert.notNull(interfaces.get);

		PageResult pageResult = interfacesService.paging(locale, interfaces, reqBody.getStart(), reqBody.getLimit());

		return new ResultMsg(reqBody.getId(), pageResult.getList(), pageResult.getTotal());
	}
	
}
