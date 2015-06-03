/**
 * WebSiteServiceImpl.java
 */
package com.skycloud.jkb.service.impl;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.skycloud.api.domain.action.ActionDeleteRequest;
import com.skycloud.api.domain.action.ActionGetRequest;
import com.skycloud.api.domain.base.Host;
import com.skycloud.api.domain.base.HostGroup;
import com.skycloud.api.domain.base.HostInterface;
import com.skycloud.api.domain.base.Template;
import com.skycloud.api.domain.host.HostCreateRequest;
import com.skycloud.api.domain.host.HostCreateRequest.HostCreateParams;
import com.skycloud.api.domain.host.HostDeleteRequest;
import com.skycloud.api.domain.host.HostUpdateRequest;
import com.skycloud.jkb.base.impl.BaseServiceImpl;
import com.skycloud.jkb.component.ApiInvoker;
import com.skycloud.jkb.dao.ISkycloudGroupstypeHostDao;
import com.skycloud.jkb.dao.IWebSiteDao;
import com.skycloud.jkb.pojo.constant.SysConstant;
import com.skycloud.jkb.pojo.entity.Conditions;
import com.skycloud.jkb.pojo.entity.MediaType;
import com.skycloud.jkb.pojo.entity.Operations;
import com.skycloud.jkb.pojo.entity.Opmessage;
import com.skycloud.jkb.pojo.entity.OpmessageUsr;
import com.skycloud.jkb.pojo.entity.SkycloudGroupstypeHost;
import com.skycloud.jkb.pojo.entity.Users;
import com.skycloud.jkb.pojo.model.Action;
import com.skycloud.jkb.pojo.model.WebSite;
import com.skycloud.jkb.pojo.vo.ApiResult;
import com.skycloud.jkb.pojo.vo.PageResult;
import com.skycloud.jkb.pojo.vo.SysConfig;
import com.skycloud.jkb.service.IActionService;
import com.skycloud.jkb.service.IMediaTypeService;
import com.skycloud.jkb.service.IWebSiteService;
import com.skycloud.jkb.util.NumberUtil;
import com.skycloud.jkb.util.StringUtil;
import com.skycloud.jkb.util.WebUtil;

/**
 * Web站点业务逻辑实现.
 * 
 * @creation 2014年01月02日 06:24:49
 * @modification 2014年01月02日 06:24:49
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Service
@Transactional
public class WebSiteServiceImpl extends BaseServiceImpl implements IWebSiteService {

	private static Logger logger = Logger.getLogger(WebSiteServiceImpl.class);

	@Autowired
	IWebSiteDao webSiteDao;

	@Autowired
	ApiInvoker apiInvoker;

	@Autowired
	IActionService actionService;

	@Autowired
	IMediaTypeService mediaTypeService;

	@Autowired
	ISkycloudGroupstypeHostDao skycloudGroupstypeHostDao;

	@Value("#{systemProperties['default.agent.port']}")
	String defaultAgentPort;

	@Override
	public boolean save(Locale locale, WebSite webSite) {

		logger.debug("[业务逻辑层]添加Web站点");

		// 保存host基本信息.
		ApiResult invoke = saveHostBasicInfo(locale, webSite);

		webSite.setHostid(NumberUtil.toLong(invoke.getIdResult(SysConstant.ID_HOSTIDS)));

		// 保存host的groupstype信息&创建者信息
		SkycloudGroupstypeHost skycloudGroupstypeHost = new SkycloudGroupstypeHost();
		skycloudGroupstypeHost.setTypeid(SysConfig.typeId_website);
		skycloudGroupstypeHost.setHostid(webSite.getHostid());
		skycloudGroupstypeHost.setAssetid(null);
		skycloudGroupstypeHost.setUserid(WebUtil.getSessionUser().getUserid());// host创建者
		skycloudGroupstypeHost.setMark(null);

		hibernateTemplate.save(skycloudGroupstypeHost);

		// 配置告警动作
		setAction(locale, webSite);

		return true;
	}

	/**
	 * 保存host基本信息.
	 * 
	 * @author xiweicheng
	 * @creation 2014年1月13日 下午2:07:40
	 * @modification 2014年1月13日 下午2:07:40
	 * @param locale
	 * @param webSite
	 * @return
	 */
	private ApiResult saveHostBasicInfo(Locale locale, WebSite webSite) {
		HostCreateRequest hostCreateRequest = new HostCreateRequest();
		HostCreateParams params = hostCreateRequest.getParams();

		// host 基本参数
		params.setHost(StringUtil.join(SysConstant.UNDERLINE, WebUtil.getSessionUser().getUserid(), webSite.getName(),
				UUID.randomUUID()));
		params.setStatus(0);
		params.setDisable_until(SysConstant.NUMBER_0);
		params.setAvailable(0);
		params.setErrors_from(SysConstant.NUMBER_0);

		params.setIpmi_authtype(0);
		params.setIpmi_privilege(2);
		params.setIpmi_disable_until(SysConstant.NUMBER_0);
		params.setIpmi_available(0);

		params.setSnmp_disable_until(SysConstant.NUMBER_0);
		params.setSnmp_available(0);

		params.setMaintenance_status(0);
		params.setMaintenance_type(0);
		params.setMaintenance_from(SysConstant.NUMBER_0);

		params.setIpmi_errors_from(SysConstant.NUMBER_0);
		params.setSnmp_errors_from(SysConstant.NUMBER_0);

		params.setJmx_disable_until(SysConstant.NUMBER_0);
		params.setJmx_available(0);
		params.setJmx_errors_from(SysConstant.NUMBER_0);

		params.setName(webSite.getName());

		// host 所属组
		HostGroup hostGroup = new HostGroup();
		hostGroup.setGroupid(webSite.getGroupId());
		params.getGroups().add(hostGroup);

		// host 关联模板
		Template template = new Template();
		template.setTemplateid(SysConfig.website_templateid);
		params.getTemplates().add(template);

		// host 关联interfaces
		HostInterface hostInterface = new HostInterface();
		hostInterface.setMain(SysConstant.NUM_1);
		hostInterface.setType(SysConstant.NUM_1);
		hostInterface.setUseip(SysConstant.NUM_1);
		hostInterface.setIp(SysConstant.DEFAULT_IP);
		hostInterface.setDns(webSite.getUrl());
		hostInterface.setPort(defaultAgentPort);
		params.getInterfaces().add(hostInterface);

		ApiResult invoke = apiInvoker.invoke(hostCreateRequest);
		throwRuntimeExceptionWhenTrue(invoke.failed(), messageUtil.getMsg("M0004", locale, "web site"));
		return invoke;
	}

	/**
	 * 配置告警动作
	 * 
	 * @author xiweicheng
	 * @creation 2014年1月6日 下午3:59:19
	 * @modification 2014年1月6日 下午3:59:19
	 * @param locale
	 * @param webSite
	 */
	private boolean setAction(Locale locale, WebSite webSite) {

		// 配置告警动作
		Action action = new Action();
		action.setName(SysConstant.ACTION_NAME_WEBSITE);
		action.setEventsource(SysConstant.NUM_0);
		action.setEvaltype(SysConstant.NUM_0);
		action.setStatus(SysConstant.NUM_0);
		action.setEscPeriod(SysConstant.NUM_120);
		action.setDefShortdata(SysConstant.ACTION_DEFSHORTDATA_WEBSITE);
		action.setDefLongdata(SysConstant.ACTION_DEFLONGDATA_WEBSITE);

		// 告警条件
		Set<Conditions> conditionses = new HashSet<>();
		action.setConditionses(conditionses);

		// host = hostid
		Conditions conditions = new Conditions();
		conditions.setConditiontype(SysConstant.NUM_1);// 1 - host;
		conditions.setOperator(SysConstant.NUM_0);// 0 - (default) =;
		// Value to compare with.
		conditions.setValue(String.valueOf(webSite.getHostid()));

		conditionses.add(conditions);

		// trigger value = problem(1)
		conditions = new Conditions();
		conditions.setConditiontype(SysConstant.NUM_1);// 5 - trigger value;
		conditions.setOperator(SysConstant.NUM_0);// 0 - (default) =;
		// Value to compare with.
		conditions.setValue(SysConstant.NUMBER_1);

		conditionses.add(conditions);

		// 告警操作
		Set<Operations> operationses = new HashSet<>();
		action.setOperationses(operationses);

		Operations operations = new Operations();
		operationses.add(operations);

		operations.setOperationtype(SysConstant.NUM_0);// 0 - send message;
		operations.setEscPeriod(SysConstant.NUM_0);
		operations.setEscStepFrom(SysConstant.NUM_1);
		operations.setEscStepTo(SysConstant.NUM_1);
		operations.setEvaltype(SysConstant.NUM_0);

		Set<OpmessageUsr> opmessageUsrs = new HashSet<>();
		OpmessageUsr opmessageUsr = new OpmessageUsr();
		opmessageUsrs.add(opmessageUsr);

		Users users = new Users();
		users.setUserid(WebUtil.getSessionUser().getUserid());
		opmessageUsr.setUsers(users);

		operations.setOpmessageUsrs(opmessageUsrs);
		Opmessage opmessage = new Opmessage();
		opmessage.setDefaultMsg(SysConstant.NUM_1);
		MediaType mediaType = mediaTypeService.getByType(locale, SysConstant.NUM_0);

		throwRuntimeExceptionWhenNull(mediaType, messageUtil.getMsg("M0009", locale, "email"));

		opmessage.setMediaType(mediaType);
		operations.setOpmessage(opmessage);

		boolean saved = actionService.save(locale, action);

		throwRuntimeExceptionWhenFalse(saved, messageUtil.getMsg("M0008", locale, "actionService.save"));

		return saved;
	}

	@Override
	public boolean delete(Locale locale, WebSite webSite) {

		logger.debug("[业务逻辑层]删除Web站点");

		// 删除配置的告警动作.
		ActionGetRequest actionGetRequest = new ActionGetRequest();
		actionGetRequest.getParams().setHostids(Arrays.asList(String.valueOf(webSite.getHostid())));

		ApiResult invoke = apiInvoker.invoke(actionGetRequest);
		throwRuntimeExceptionWhenTrue(invoke.failed(), invoke.getMessage());

		ActionDeleteRequest actionDeleteRequest = new ActionDeleteRequest();

		JSONArray jsonArrayResult = invoke.getJSONArrayResult();

		for (int i = 0; i < jsonArrayResult.size(); i++) {
			JSONObject jsonObject = jsonArrayResult.getJSONObject(i);
			String actionId = jsonObject.getString("actionid");

			actionDeleteRequest.getParams().add(actionId);
		}

		ApiResult invoke2 = apiInvoker.invoke(actionDeleteRequest);
		throwRuntimeExceptionWhenTrue(invoke2.failed(), invoke2.getMessage());

		// 删除website.
		HostDeleteRequest hostDeleteRequest = new HostDeleteRequest();
		Host host = new Host();
		host.setHostid(String.valueOf(webSite.getHostid()));

		hostDeleteRequest.getParams().add(host);

		ApiResult invoke3 = apiInvoker.invoke(hostDeleteRequest);
		throwRuntimeExceptionWhenTrue(invoke3.failed(), invoke3.getMessage());

		// 删除扩展信息
		skycloudGroupstypeHostDao.deleteByhostId(String.valueOf(webSite.getHostid()));

		return true;
	}

	@Override
	public WebSite get(Locale locale, WebSite webSite) {

		logger.debug("[业务逻辑层]获取Web站点");

		// TODO
		return null;
	}

	@Override
	public boolean update(Locale locale, WebSite webSite) {

		logger.debug("[业务逻辑层]更新Web站点");

		HostUpdateRequest hostUpdateRequest = new HostUpdateRequest();
		hostUpdateRequest.getParams().setHost(
				StringUtil.join(SysConstant.UNDERLINE, WebUtil.getSessionUser().getUserid(), webSite.getName(),
						UUID.randomUUID()));
		hostUpdateRequest.getParams().setName(webSite.getName());
		// 0 - (default) monitored host; 1 - unmonitored host.
		hostUpdateRequest.getParams().setStatus(webSite.getStatus());

		HostInterface hostInterface = new HostInterface();
		hostInterface.setDns(webSite.getUrl());
		hostUpdateRequest.getParams().getInterfaces().add(hostInterface);

		ApiResult invoke = apiInvoker.invoke(hostUpdateRequest);
		throwRuntimeExceptionWhenTrue(invoke.failed(), invoke.getMessage());

		return true;
	}

	@Override
	public List<WebSite> list(Locale locale) {

		logger.debug("[业务逻辑层]列举Web站点");

		// TODO
		return null;
	}

	@Override
	public PageResult paging(Locale locale, WebSite webSite, Long start, Long limit) {

		logger.debug("[业务逻辑层]查询【Web站点】(分页)");

		PageResult pageResult = new PageResult();

		List<Map<String, Object>> mapList = webSiteDao.page(locale, webSite, start, limit);
		long cnt = webSiteDao.pageCount(locale, webSite);
		pageResult.setList(mapList);
		pageResult.setTotal(cnt);

		return pageResult;
	}
}