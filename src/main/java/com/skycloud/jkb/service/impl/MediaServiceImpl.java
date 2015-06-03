/**
 * MediaServiceImpl.java
 */
package com.skycloud.jkb.service.impl;

import java.util.List;
import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.skycloud.api.domain.base.User;
import com.skycloud.api.domain.media.MediaGetRequest;
import com.skycloud.api.domain.user.UserAddmediaRequest;
import com.skycloud.api.domain.user.UserDeleteMediaRequest;
import com.skycloud.api.domain.user.UserUpdatemediaRequest;
import com.skycloud.jkb.base.impl.BaseServiceImpl;
import com.skycloud.jkb.component.ApiInvoker;
import com.skycloud.jkb.dao.IMediaDao;
import com.skycloud.jkb.pojo.entity.Users;
import com.skycloud.jkb.pojo.model.Media;
import com.skycloud.jkb.pojo.model.MediaType;
import com.skycloud.jkb.pojo.vo.ApiResult;
import com.skycloud.jkb.service.IMediaService;
import com.skycloud.jkb.service.IMediaTypeService;
import com.skycloud.jkb.service.IUserService;
import com.skycloud.jkb.util.JsonUtil;
import com.skycloud.jkb.util.StringUtil;

/**
 * 告警媒介业务逻辑实现.
 * 
 * @creation 2014年01月02日 02:38:05
 * @modification 2014年01月02日 02:38:05
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Service
@Transactional
public class MediaServiceImpl extends BaseServiceImpl implements IMediaService {

	private static Logger logger = Logger.getLogger(MediaServiceImpl.class);

	@Autowired
	IMediaDao mediaDao;

	@Autowired
	ApiInvoker apiInvoker;

	@Autowired
	IUserService userService;

	@Autowired
	IMediaTypeService mediaTypeService;

	@Override
	public boolean save(Locale locale, Media media) {

		logger.debug("[业务逻辑层]添加告警媒介");

		String userId = media.getUserid();

		if (StringUtil.isEmpty(userId)) {
			Users users = userService.getByAlias(locale, media.getAlias());

			throwRuntimeExceptionWhenNull(users, messageUtil.getMsg("media", locale, media.getAlias()));

			userId = String.valueOf(users.getUserid());
		}

		if (StringUtil.isNotEmpty(media.getEmail())) {
			UserAddmediaRequest userAddmediaRequest = new UserAddmediaRequest();
			List<String> users = userAddmediaRequest.getParams().getUsers();
			List<com.skycloud.api.domain.base.Media> medias = userAddmediaRequest.getParams().getMedias();

			users.add(userId);
			com.skycloud.api.domain.base.Media media3 = new com.skycloud.api.domain.base.Media();

			BeanUtils.copyProperties(media, media3);

			media3.setSendto(media.getEmail());

			MediaType mediaType = mediaTypeService.getByType(locale, 0);

			if (mediaType != null) {
				media3.setMediatypeid(String.valueOf(mediaType.getMediatypeid()));

				medias.add(media3);

				ApiResult invoke = apiInvoker.invoke(userAddmediaRequest);

				throwRuntimeExceptionWhenTrue(invoke.failed(), invoke.getMessage());
			} else {
				logger.error("media type [email] is not exists.");
			}
		}

		if (StringUtil.isNotEmpty(media.getPhoneNumber())) {
			UserAddmediaRequest userAddmediaRequest = new UserAddmediaRequest();
			List<String> users = userAddmediaRequest.getParams().getUsers();
			List<com.skycloud.api.domain.base.Media> medias = userAddmediaRequest.getParams().getMedias();

			users.add(userId);
			com.skycloud.api.domain.base.Media media3 = new com.skycloud.api.domain.base.Media();

			BeanUtils.copyProperties(media, media3);

			media3.setSendto(media.getPhoneNumber());

			MediaType mediaType = mediaTypeService.getByType(locale, 2);

			if (mediaType != null) {
				media3.setMediatypeid(String.valueOf(mediaType.getMediatypeid()));

				medias.add(media3);

				ApiResult invoke = apiInvoker.invoke(userAddmediaRequest);

				throwRuntimeExceptionWhenTrue(invoke.failed(), invoke.getMessage());
			} else {
				logger.error("media type [SMS] is not exists.");
			}
		}

		return true;
	}

	@Override
	public boolean update(Locale locale, Media media) {

		logger.debug("[业务逻辑层]更新告警媒介");

		Users users1 = userService.getByAlias(locale, media.getAlias());

		throwRuntimeExceptionWhenNull(users1, messageUtil.getMsg("media", locale, media.getAlias()));

		UserUpdatemediaRequest userUpdatemediaRequest = new UserUpdatemediaRequest();
		List<User> users = userUpdatemediaRequest.getParams().getUsers();
		List<com.skycloud.api.domain.base.Media> medias = userUpdatemediaRequest.getParams().getMedias();

		User user = new User();
		user.setUserid(String.valueOf(users1.getUserid()));
		users.add(user);
		com.skycloud.api.domain.base.Media media3 = new com.skycloud.api.domain.base.Media();

		BeanUtils.copyProperties(media, media3);

		medias.add(media3);

		ApiResult invoke = apiInvoker.invoke(userUpdatemediaRequest);

		throwRuntimeExceptionWhenTrue(invoke.failed(), invoke.getMessage());

		return true;
	}

	@Override
	public boolean delete(Locale locale, Media media) {

		logger.debug("[业务逻辑层]删除告警媒介");

		Users users1 = userService.getByAlias(locale, media.getAlias());

		throwRuntimeExceptionWhenNull(users1, messageUtil.getMsg("media", locale, media.getAlias()));

		UserDeleteMediaRequest userDeleteMediaRequest = new UserDeleteMediaRequest();
		userDeleteMediaRequest.getParams().add(media.getMediaid());

		ApiResult invoke = apiInvoker.invoke(userDeleteMediaRequest);

		throwRuntimeExceptionWhenTrue(invoke.failed(), invoke.getMessage());

		return true;
	}

	@Override
	public Media get(Locale locale, Media media) {

		logger.debug("[业务逻辑层]获取告警媒介");

		MediaGetRequest mediaGetRequest = new MediaGetRequest();
		mediaGetRequest.getParams().getMediaids().add(media.getMediaid());

		ApiResult invoke = apiInvoker.invoke(mediaGetRequest);

		throwRuntimeExceptionWhenTrue(invoke.failed(), invoke.getMessage());

		JSONArray jsonArrayResult = invoke.getJSONArrayResult();

		return JSON.toJavaObject(jsonArrayResult.getJSONObject(0), Media.class);
	}

	@Override
	public List<Media> list(Locale locale, Media media) {

		logger.debug("[业务逻辑层]列举告警媒介");

		MediaGetRequest mediaGetRequest = new MediaGetRequest();
		mediaGetRequest.getParams().getUserids().add(media.getUserid());

		ApiResult invoke = apiInvoker.invoke(mediaGetRequest);

		throwRuntimeExceptionWhenTrue(invoke.failed(), invoke.getMessage());

		JSONArray jsonArrayResult = invoke.getJSONArrayResult();

		List<Media> mediaList = JsonUtil.jsonArr2Object(jsonArrayResult, Media.class);

		return mediaList;
	}

}