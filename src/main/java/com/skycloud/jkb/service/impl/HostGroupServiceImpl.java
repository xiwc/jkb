/**
 * HostGroupServiceImpl.java
 */
package com.skycloud.jkb.service.impl;

import java.util.List;
import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.skycloud.api.domain.hostgroup.HostGroupCreateRequest;
import com.skycloud.api.domain.hostgroup.HostGroupExistsRequest;
import com.skycloud.jkb.base.impl.BaseServiceImpl;
import com.skycloud.jkb.component.ApiInvoker;
import com.skycloud.jkb.dao.IHostGroupDao;
import com.skycloud.jkb.pojo.constant.SysConstant;
import com.skycloud.jkb.pojo.model.HostGroup;
import com.skycloud.jkb.pojo.vo.ApiResult;
import com.skycloud.jkb.pojo.vo.PageResult;
import com.skycloud.jkb.service.IHostGroupService;
import com.skycloud.jkb.util.NumberUtil;

/**
 * 主机组业务逻辑实现.
 * 
 * @creation 2014年01月03日 10:56:43
 * @modification 2014年01月03日 10:56:43
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Service
@Transactional
public class HostGroupServiceImpl extends BaseServiceImpl implements IHostGroupService {

	private static Logger logger = Logger.getLogger(HostGroupServiceImpl.class);

	@Autowired
	IHostGroupDao hostGroupDao;

	@Autowired
	ApiInvoker apiInvoker;

	@Override
	public boolean save(Locale locale, HostGroup hostGroup) {

		logger.debug("[业务逻辑层]添加主机组");

		HostGroupCreateRequest hostGroupCreateRequest = new HostGroupCreateRequest();
		com.skycloud.api.domain.base.HostGroup hostGroup2 = new com.skycloud.api.domain.base.HostGroup();
		hostGroup2.setName(hostGroup.getName());
		hostGroup2.setInternal(0);

		hostGroupCreateRequest.getParams().add(hostGroup2);

		ApiResult invoke = apiInvoker.invoke(hostGroupCreateRequest);

		throwRuntimeExceptionWhenTrue(invoke.failed(), messageUtil.getMsg("M0004", locale, "hostGroup"));

		hostGroup.setGroupid(NumberUtil.toLong(invoke.getIdResult(SysConstant.ID_GROUPIDS)));

		return true;
	}

	@Override
	public boolean delete(Locale locale, HostGroup hostGroup) {

		logger.debug("[业务逻辑层]删除主机组");

		// TODO
		return true;
	}

	@Override
	public HostGroup get(Locale locale, HostGroup hostGroup) {

		logger.debug("[业务逻辑层]获取主机组");

		// TODO
		return null;
	}

	@Override
	public boolean update(Locale locale, HostGroup hostGroup) {

		logger.debug("[业务逻辑层]更新主机组");

		// TODO
		return true;
	}

	@Override
	public List<HostGroup> list(Locale locale) {

		logger.debug("[业务逻辑层]列举主机组");

		// TODO
		return null;
	}

	@Override
	public List<HostGroup> query(Locale locale, HostGroup hostGroup) {

		logger.debug("[业务逻辑层]查询主机组(不分页)");

		// TODO
		return null;
	}

	@Override
	public PageResult paging(Locale locale, HostGroup hostGroup, Long start, Long limit) {

		logger.debug("[业务逻辑层]查询主机组(分页)");

		PageResult pageResult = new PageResult();

		// TODO
		return pageResult;
	}

	@Override
	public boolean exists(Locale locale, HostGroup hostGroup) {

		logger.debug("[业务逻辑层]判断主机组是否存在");

		HostGroupExistsRequest hostGroupExistsRequest = new HostGroupExistsRequest();
		hostGroupExistsRequest.getParams().getName().add(hostGroup.getName());

		ApiResult invoke = apiInvoker.invoke(hostGroupExistsRequest);

		throwRuntimeExceptionWhenTrue(invoke.failed(), messageUtil.getMsg("M0008", locale, "hostGroup exists"));

		return invoke.getBooleanResult();
	}

}