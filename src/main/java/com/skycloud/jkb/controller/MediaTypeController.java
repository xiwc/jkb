/**
 * MediaTypeController.java
 */
package com.skycloud.jkb.controller;

import java.util.List;
import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.skycloud.jkb.base.BaseController;
import com.skycloud.jkb.pojo.model.MediaType;
import com.skycloud.jkb.pojo.vo.ReqBody;
import com.skycloud.jkb.pojo.vo.ResultMsg;
import com.skycloud.jkb.service.IMediaTypeService;

/**
 * 告警媒介类型请求控制层.
 * 
 * @creation 2014年01月02日 05:10:45
 * @modification 2014年01月02日 05:10:45
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Controller
@RequestMapping(value = "mediaType")
public class MediaTypeController extends BaseController {

	private static Logger logger = Logger.getLogger(MediaTypeController.class);

	@Autowired
	IMediaTypeService mediaTypeService;

	/**
	 * 添加告警媒介类型.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月02日 05:10:45
	 * @modification 2014年01月02日 05:10:45
	 * @return
	 */
	// @RequestMapping("add")
	@ResponseBody
	public ResultMsg add(@RequestBody ReqBody reqBody, Locale locale) {

		// TODO

		logger.debug("添加告警媒介类型");

		MediaType mediaType = getParam(reqBody, MediaType.class);

		// TODO 参数验证
		// Assert.notNull(mediaType.get);

		boolean saved = mediaTypeService.save(locale, mediaType);

		return new ResultMsg(saved, reqBody.getId());
	}

	/**
	 * 删除告警媒介类型.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月02日 05:10:45
	 * @modification 2014年01月02日 05:10:45
	 * @return
	 */
	// @RequestMapping("delete")
	@ResponseBody
	public ResultMsg delete(@RequestBody ReqBody reqBody, Locale locale) {

		// TODO

		logger.debug("删除告警媒介类型");

		MediaType mediaType = getParam(reqBody, MediaType.class);

		// TODO 参数验证
		// Assert.notNull(mediaType.get);

		boolean deleted = mediaTypeService.delete(locale, mediaType);

		return new ResultMsg(deleted, reqBody.getId());
	}

	/**
	 * 获取告警媒介类型.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月02日 05:10:45
	 * @modification 2014年01月02日 05:10:45
	 * @return
	 */
	// @RequestMapping("get")
	@ResponseBody
	public ResultMsg get(@RequestBody ReqBody reqBody, Locale locale) {

		// TODO

		logger.debug("获取告警媒介类型");

		MediaType mediaType = getParam(reqBody, MediaType.class);

		// TODO 参数验证
		// Assert.notNull(mediaType.get);

		MediaType getMediaType = mediaTypeService.get(locale, mediaType);

		return new ResultMsg(true, reqBody.getId(), getMediaType);
	}

	/**
	 * 更新告警媒介类型.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月02日 05:10:45
	 * @modification 2014年01月02日 05:10:45
	 * @return
	 */
	// @RequestMapping("update")
	@ResponseBody
	public ResultMsg update(@RequestBody ReqBody reqBody, Locale locale) {

		// TODO

		logger.debug("更新告警媒介类型");

		MediaType mediaType = getParam(reqBody, MediaType.class);

		// TODO 参数验证
		// Assert.notNull(mediaType.get);

		boolean updated = mediaTypeService.update(locale, mediaType);

		return new ResultMsg(updated, reqBody.getId());
	}

	/**
	 * 列举告警媒介类型.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月02日 05:10:45
	 * @modification 2014年01月02日 05:10:45
	 * @return
	 */
	// @RequestMapping("list")
	@ResponseBody
	public ResultMsg list(@RequestBody ReqBody reqBody, Locale locale) {

		// TODO

		logger.debug("列举告警媒介类型");

		// MediaType mediaType = getParam(reqBody, MediaType.class);

		// TODO 参数验证
		// Assert.notNull(mediaType.get);

		List<MediaType> mediaTypeList = mediaTypeService.list(locale);

		return new ResultMsg(reqBody.getId(), mediaTypeList);
	}

}
