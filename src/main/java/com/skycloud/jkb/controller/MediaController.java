/**
 * MediaController.java
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
import com.skycloud.jkb.pojo.model.Media;
import com.skycloud.jkb.pojo.vo.ReqBody;
import com.skycloud.jkb.pojo.vo.ResultMsg;
import com.skycloud.jkb.service.IMediaService;

/**
 * 告警媒介请求控制层.
 * 
 * @creation 2014年01月02日 02:38:05
 * @modification 2014年01月02日 02:38:05
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Controller
@RequestMapping(value = "media")
public class MediaController extends BaseController {

	private static Logger logger = Logger.getLogger(MediaController.class);

	@Autowired
	IMediaService mediaService;

	/**
	 * 添加告警媒介.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月02日 02:38:05
	 * @modification 2014年01月02日 02:38:05
	 * @return
	 */
	// @RequestMapping("add")
	@ResponseBody
	public ResultMsg add(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("添加告警媒介");

		Media media = getParam(reqBody, Media.class);

		// TODO 参数验证
		Assert.notNull(media.getAlias());

		boolean saved = mediaService.save(locale, media);

		return new ResultMsg(saved, reqBody.getId());
	}

	/**
	 * 删除告警媒介.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月02日 02:38:05
	 * @modification 2014年01月02日 02:38:05
	 * @return
	 */
	// @RequestMapping("delete")
	@ResponseBody
	public ResultMsg delete(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("删除告警媒介");

		Media media = getParam(reqBody, Media.class);

		// TODO 参数验证
		// Assert.notNull(media.getXxx());

		boolean deleted = mediaService.delete(locale, media);

		return new ResultMsg(deleted, reqBody.getId());
	}

	/**
	 * 获取告警媒介.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月02日 02:38:05
	 * @modification 2014年01月02日 02:38:05
	 * @return
	 */
	// @RequestMapping("get")
	@ResponseBody
	public ResultMsg get(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("获取告警媒介");

		Media media = getParam(reqBody, Media.class);

		// TODO 参数验证
		// Assert.notNull(media.getXxx());

		Media getMedia = mediaService.get(locale, media);

		return new ResultMsg(true, reqBody.getId(), getMedia);
	}

	/**
	 * 更新告警媒介.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月02日 02:38:05
	 * @modification 2014年01月02日 02:38:05
	 * @return
	 */
	// @RequestMapping("update")
	@ResponseBody
	public ResultMsg update(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("更新告警媒介");

		Media media = getParam(reqBody, Media.class);

		// TODO 参数验证
		// Assert.notNull(media.getXxx());

		boolean updated = mediaService.update(locale, media);

		return new ResultMsg(updated, reqBody.getId());
	}

	/**
	 * 列举告警媒介.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月02日 02:38:05
	 * @modification 2014年01月02日 02:38:05
	 * @return
	 */
	// @RequestMapping("list")
	@ResponseBody
	public ResultMsg list(@RequestBody ReqBody reqBody, Locale locale) {

		logger.debug("列举告警媒介");

		Media media = getParam(reqBody, Media.class);

		// TODO 参数验证
		// Assert.notNull(media.getXxx());

		List<Media> mediaList = mediaService.list(locale, media);

		return new ResultMsg(reqBody.getId(), mediaList);
	}

}
