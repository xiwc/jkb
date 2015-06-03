/**
 * UserServiceImpl.java
 */
package com.skycloud.jkb.service.impl;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.skycloud.api.domain.user.UserCreateRequest;
import com.skycloud.api.domain.user.UserCreateRequest.UserCreateParams;
import com.skycloud.api.domain.user.UserDeleteRequest;
import com.skycloud.api.domain.usergroup.UserGroupCreateRequest;
import com.skycloud.api.domain.usergroup.UserGroupCreateRequest.UserGroupCreateParams;
import com.skycloud.jkb.base.impl.BaseServiceImpl;
import com.skycloud.jkb.component.ApiInvoker;
import com.skycloud.jkb.dao.IUserDao;
import com.skycloud.jkb.pojo.constant.SysConstant;
import com.skycloud.jkb.pojo.entity.SkycloudUserinfo;
import com.skycloud.jkb.pojo.entity.Users;
import com.skycloud.jkb.pojo.model.Media;
import com.skycloud.jkb.pojo.model.User;
import com.skycloud.jkb.pojo.vo.ApiResult;
import com.skycloud.jkb.pojo.vo.SysConfig;
import com.skycloud.jkb.service.IMediaService;
import com.skycloud.jkb.service.IUserService;
import com.skycloud.jkb.util.NumberUtil;
import com.skycloud.jkb.util.StringUtil;

/**
 * 用户业务逻辑层实现.
 * 
 * @creation 2013年12月26日 下午3:27:41
 * @modification 2013年12月26日 下午3:27:41
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl implements IUserService {

	private static Logger logger = Logger.getLogger(UserServiceImpl.class);

	@Autowired
	IUserDao userDao;

	@Autowired
	ApiInvoker apiInvoker;

	@Autowired
	IMediaService mediaService;

	@Override
	public boolean save(Locale locale, User user) {

		// 判断别名用户是否存在
		throwRuntimeExceptionWhenTrue(exists(locale, user.getAlias()),
				messageUtil.getMsg("M0002", locale, user.getAlias()));

		// 创建角色
		UserGroupCreateRequest userGroupCreateRequest = new UserGroupCreateRequest();
		UserGroupCreateParams params2 = userGroupCreateRequest.getParams();
		params2.setName(UUID.randomUUID().toString());

		ApiResult invoke = apiInvoker.invoke(userGroupCreateRequest);

		throwRuntimeExceptionWhenTrue(invoke.failed(), invoke.getMessage());

		String userGroupId = invoke.getIdResult(SysConstant.ID_USRGRPIDS);

		logger.debug("save user[userGroupId]: " + userGroupId);

		// 创建用户
		UserCreateRequest userCreateRequest = new UserCreateRequest();
		UserCreateParams params = userCreateRequest.getParams();
		params.setPasswd(user.getPasswd());
		params.setAlias(user.getAlias());
		params.setUsrgrps(Arrays.asList(userGroupId));

		invoke = apiInvoker.invoke(userCreateRequest);

		throwRuntimeExceptionWhenTrue(invoke.failed(), invoke.getMessage());

		String userId = invoke.getIdResult(SysConstant.ID_USERIDS);

		logger.debug("save user[userId]: " + userId);

		// save to skycloud_userinfo
		SkycloudUserinfo skycloudUserinfo = new SkycloudUserinfo();
		skycloudUserinfo.setUserid(NumberUtil.toLong(userId));
		skycloudUserinfo.setDepartmentid(SysConfig.creater_departmentid);
		skycloudUserinfo.setStatus(Integer.valueOf(0));
		skycloudUserinfo.setCreater(SysConfig.createrid);

		Serializable id = hibernateTemplate.save(skycloudUserinfo);
		throwRuntimeExceptionWhenNull(id, messageUtil.getMsg("M0004", locale, "skycloud_userinfo"));

		// 配置告警媒介方式.
		if (StringUtil.isNotEmpty(user.getEmail()) || StringUtil.isNotEmpty(user.getPhoneNumber())) {
			Media media = new Media();
			media.setUserid(userId);
			media.setAlias(user.getAlias());
			media.setActive(SysConstant.NUMBER_0);
			media.setSeverity(SysConstant.NUMBER_63);
			media.setPeriod(SysConstant.MEDIA_PERIOD);
			media.setEmail(user.getEmail());
			media.setPhoneNumber(user.getPhoneNumber());

			boolean saved = mediaService.save(locale, media);

			throwRuntimeExceptionWhenFalse(saved, messageUtil.getMsg("M0007", locale));
		}

		return true;
	}

	@Override
	public boolean delete(Locale locale, User user) {

		// users.alias -> users.userid
		Users users = getByAlias(locale, user.getAlias());
		throwRuntimeExceptionWhenTrue(users == null, messageUtil.getMsg("M0003", locale, user.getAlias()));

		UserDeleteRequest userDeleteRequest = new UserDeleteRequest();
		com.skycloud.api.domain.base.User user2 = new com.skycloud.api.domain.base.User();
		user2.setUserid(String.valueOf(users.getUserid()));
		userDeleteRequest.getParams().add(user2);

		ApiResult invoke = apiInvoker.invoke(userDeleteRequest);
		throwRuntimeExceptionWhenTrue(invoke.failed(), invoke.getMessage());

		// delete from skycloud_userinfo
		boolean val = userDao.deleteFromSkycloudUserInfo(locale, invoke.getIdResult(SysConstant.ID_USERIDS));
		throwRuntimeExceptionWhenFalse(val, messageUtil.getMsg("M0005", locale, "skycloud_userinfo"));

		return true;
	}

	@Override
	public boolean exists(Locale locale, String alias) {

		return userDao.exists(locale, alias);
	}

	@Override
	public Users getByAlias(Locale locale, String alias) {

		return userDao.getByAlias(locale, alias);
	}

	@Override
	public User get(Locale locale, User user) {

		Users users = getByAlias(locale, user.getAlias());
		throwRuntimeExceptionWhenNull(users, messageUtil.getMsg("M0006", locale));

		// TODO
		User user2 = new User();
		BeanUtils.copyProperties(users, user2);

		return user2;
	}

}
