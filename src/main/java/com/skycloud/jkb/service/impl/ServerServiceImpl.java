/**
 * ServerServiceImpl.java
 */
package com.skycloud.jkb.service.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
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
import com.skycloud.jkb.component.PropUtil;
import com.skycloud.jkb.dao.IInterfacesDao;
import com.skycloud.jkb.dao.IServerDao;
import com.skycloud.jkb.dao.ISkycloudGroupstypeHostDao;
import com.skycloud.jkb.pojo.constant.SysConstant;
import com.skycloud.jkb.pojo.entity.Conditions;
import com.skycloud.jkb.pojo.entity.Hosts;
import com.skycloud.jkb.pojo.entity.Interfaces;
import com.skycloud.jkb.pojo.entity.MediaType;
import com.skycloud.jkb.pojo.entity.Operations;
import com.skycloud.jkb.pojo.entity.Opmessage;
import com.skycloud.jkb.pojo.entity.OpmessageUsr;
import com.skycloud.jkb.pojo.entity.SkycloudGroupstypeHost;
import com.skycloud.jkb.pojo.entity.Users;
import com.skycloud.jkb.pojo.model.Action;
import com.skycloud.jkb.pojo.model.Server;
import com.skycloud.jkb.pojo.vo.ApiResult;
import com.skycloud.jkb.pojo.vo.PageResult;
import com.skycloud.jkb.service.IActionService;
import com.skycloud.jkb.service.IMediaTypeService;
import com.skycloud.jkb.service.IServerService;
import com.skycloud.jkb.util.DateUtil;
import com.skycloud.jkb.util.JsonUtil;
import com.skycloud.jkb.util.NumberUtil;
import com.skycloud.jkb.util.StringUtil;
import com.skycloud.jkb.util.WebUtil;

/**
 * 【服务器】业务逻辑实现.
 * 
 * @creation 2014年01月15日 12:00:07
 * @modification 2014年01月15日 12:00:07
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Service
@Transactional
public class ServerServiceImpl extends BaseServiceImpl implements IServerService {

	private static Logger logger = Logger.getLogger(ServerServiceImpl.class);

	private static DecimalFormat format = new DecimalFormat("0.00");

	@Autowired
	IServerDao serverDao;

	@Autowired
	ApiInvoker apiInvoker;

	@Autowired
	IActionService actionService;

	@Autowired
	IMediaTypeService mediaTypeService;

	@Autowired
	ISkycloudGroupstypeHostDao skycloudGroupstypeHostDao;

	@Autowired
	PropUtil propUtil;

	@Autowired
	IInterfacesDao interfacesDao;

	@Override
	public boolean save(Locale locale, Server server) {

		logger.debug("[业务逻辑层]添加【服务器】");

		// 基本信息
		ApiResult invoke = saveHostBasicInfo(locale, server);

		server.setHostid(NumberUtil.toLong(invoke.getIdResult(SysConstant.ID_HOSTIDS)));

		// 保存host的groupstype信息&创建者信息
		SkycloudGroupstypeHost skycloudGroupstypeHost = new SkycloudGroupstypeHost();
		skycloudGroupstypeHost.setTypeid(NumberUtil.toLong(server.getTypeId()));
		skycloudGroupstypeHost.setHostid(server.getHostid());
		skycloudGroupstypeHost.setAssetid(null);
		// host创建者
		// skycloudGroupstypeHost.setUserid(WebUtil.getSessionUser().getUserid());
		skycloudGroupstypeHost.setMark(null);

		hibernateTemplate.save(skycloudGroupstypeHost);

		// TODO 告警动作
		// setAction(locale, server);

		return true;
	}

	/**
	 * 配置告警动作(agent方式)
	 * 
	 * @author xiweicheng
	 * @creation 2014年1月6日 下午3:59:19
	 * @modification 2014年1月6日 下午3:59:19
	 * @param locale
	 * @param server
	 */
	private boolean setAction(Locale locale, Server server) {

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
		conditions.setValue(String.valueOf(server.getHostid()));

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

	/**
	 * 保存host基本信息(agent方式).
	 * 
	 * @author xiweicheng
	 * @creation 2014年1月13日 下午2:07:40
	 * @modification 2014年1月13日 下午2:07:40
	 * @param locale
	 * @param server
	 * @return
	 */
	private ApiResult saveHostBasicInfo(Locale locale, Server server) {
		HostCreateRequest hostCreateRequest = new HostCreateRequest();
		HostCreateParams params = hostCreateRequest.getParams();

		// host 基本参数
		params.setHost(server.getHost());
		params.setStatus(0);
		params.setDisable_until(SysConstant.NUMBER_0);
		params.setAvailable(1);// agent enable
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

		params.setName(server.getName());

		// host 所属组
		HostGroup hostGroup = new HostGroup();
		hostGroup.setGroupid(server.getGroupId());
		params.getGroups().add(hostGroup);

		// host 关联模板
		Template template = new Template();
		template.setTemplateid(server.getTemplateId());
		params.getTemplates().add(template);

		// host 关联interfaces
		HostInterface hostInterface = new HostInterface();
		hostInterface.setMain(SysConstant.NUM_1);
		hostInterface.setType(SysConstant.NUM_1);
		hostInterface.setUseip(SysConstant.NUM_1);
		hostInterface.setIp(server.getIp());
		hostInterface.setDns(SysConstant.EMPTY);
		hostInterface.setPort(propUtil.getDefaultAgentPort());
		params.getInterfaces().add(hostInterface);

		ApiResult invoke = apiInvoker.invoke(hostCreateRequest);
		throwRuntimeExceptionWhenTrue(invoke.failed(), messageUtil.getMsg("M0004", locale, "server"));
		return invoke;
	}

	@Override
	public boolean delete(Locale locale, Server server) {

		logger.debug("[业务逻辑层]删除【服务器】");

		// 删除配置的告警动作.
		ActionGetRequest actionGetRequest = new ActionGetRequest();
		actionGetRequest.getParams().setHostids(Arrays.asList(String.valueOf(server.getHostid())));

		ApiResult invoke = apiInvoker.invoke(actionGetRequest);
		throwRuntimeExceptionWhenTrue(invoke.failed(), invoke.getMessage());

		ActionDeleteRequest actionDeleteRequest = new ActionDeleteRequest();

		JSONArray jsonArrayResult = invoke.getJSONArrayResult();

		// 存在action则删除.
		if (jsonArrayResult.size() > 0) {
			for (int i = 0; i < jsonArrayResult.size(); i++) {
				JSONObject jsonObject = jsonArrayResult.getJSONObject(i);
				String actionId = jsonObject.getString("actionid");

				actionDeleteRequest.getParams().add(actionId);
			}

			ApiResult invoke2 = apiInvoker.invoke(actionDeleteRequest);
			throwRuntimeExceptionWhenTrue(invoke2.failed(), invoke2.getMessage());
		}

		// 删除server.
		HostDeleteRequest hostDeleteRequest = new HostDeleteRequest();
		Host host = new Host();
		host.setHostid(String.valueOf(server.getHostid()));

		hostDeleteRequest.getParams().add(host);

		ApiResult invoke3 = apiInvoker.invoke(hostDeleteRequest);
		throwRuntimeExceptionWhenTrue(invoke3.failed(), invoke3.getMessage());

		// 删除扩展信息
		skycloudGroupstypeHostDao.deleteByhostId(String.valueOf(server.getHostid()));

		return true;
	}

	@Override
	public Server get(Locale locale, Server server) {

		logger.debug("[业务逻辑层]获取【服务器】");

		Hosts host = serverDao.queryByHost(server.getHost());

		if (host != null) {
			Server server2 = new Server();
			BeanUtils.copyProperties(host, server2);

			return server2;
		} else {
			logger.debug("获取的host不存在!");
		}

		return null;
	}

	@Override
	public boolean update(Locale locale, Server server) {

		logger.debug("[业务逻辑层]更新【服务器】");

		HostUpdateRequest hostUpdateRequest = new HostUpdateRequest();
		hostUpdateRequest.getParams().setHostid(String.valueOf(server.getHostid()));

		if (StringUtil.isNotEmpty(server.getName())) {
			hostUpdateRequest.getParams().setName(server.getName());
			hostUpdateRequest.getParams().setHost(server.getHost());
		}

		if (StringUtil.isNotEmpty(server.getIp())) {

			Interfaces interfaces = interfacesDao.queryByHostId(server.getHostid());

			if (interfaces != null) {
				HostInterface hostInterface = new HostInterface();
				hostInterface.setInterfaceid(String.valueOf(interfaces.getInterfaceid()));
				hostInterface.setIp(server.getIp());
				hostInterface.setType(SysConstant.NUM_1);
				hostInterface.setMain(SysConstant.NUM_1);
				hostInterface.setUseip(SysConstant.NUM_1);
				hostInterface.setDns(SysConstant.EMPTY);
				hostInterface.setPort(SysConstant.DEFAULT_PORT_8050);

				hostUpdateRequest.getParams().getInterfaces().add(hostInterface);
			}
		}

		if (StringUtil.isNotEmpty(server.getGroupId())) {
			HostGroup hostGroup = new HostGroup();
			hostGroup.setGroupid(server.getGroupId());
			hostUpdateRequest.getParams().getGroups().add(hostGroup);
		}

		if (StringUtil.isNotEmpty(server.getTemplateId())) {
			Template template = new Template();
			template.setTemplateid(server.getTemplateId());
			hostUpdateRequest.getParams().getTemplates().add(template);
		}

		if (StringUtil.isNotEmpty(server.getStatus())) {
			hostUpdateRequest.getParams().setStatus(server.getStatus());
		}

		ApiResult invoke = apiInvoker.invoke(hostUpdateRequest);

		throwRuntimeExceptionWhenTrue(invoke.failed(), invoke.getMessage());

		// 更新typeId
		if (StringUtil.isNotEmpty(server.getTypeId())) {
			skycloudGroupstypeHostDao.updateTypeIdByHostId(String.valueOf(server.getHostid()), server.getTypeId());
		}

		return true;
	}

	@Override
	public List<Server> list(Locale locale) {

		logger.debug("[业务逻辑层]列举【服务器】");

		// TODO
		return null;
	}

	@Override
	public List<Map<String, Object>> query(Locale locale, Server server) {

		logger.debug("[业务逻辑层]查询【服务器】(不分页)");

		return serverDao.query(locale, server, null, null);
	}

	@Override
	public PageResult paging(Locale locale, Server server, Long start, Long limit) {

		logger.debug("[业务逻辑层]查询【服务器】(分页)");

		PageResult pageResult = new PageResult();
		pageResult.setList(serverDao.query(locale, server, start, limit));
		pageResult.setTotal(serverDao.queryCount(locale, server));

		return pageResult;
	}

	@Override
	public boolean exists(Locale locale, Server server) {

		logger.debug("[业务逻辑层]判断【服务器】是否存在");

		// TODO
		return true;
	}

	@Override
	public Map<String, Object> getRT(Locale locale, Server server) {

		logger.debug("[业务逻辑层]实时获取监控数据");

		Map<String, Object> mapRet = new HashMap<>();

		try {

			// /opt/allmoni/bin/GetData.py -h 'chazuo_100' -t AGENT
			String[] cmd = new String[] { "/bin/sh", "-c",
					StringUtil.replace(" /opt/allmoni/bin/GetData.py -h '{?1}' -t AGENT ", server.getHost()) };

			Process ps = Runtime.getRuntime().exec(cmd);

			BufferedReader br = new BufferedReader(new InputStreamReader(ps.getInputStream()));
			String line = null;

			Map<String, String> map = new HashMap<String, String>();

			while ((line = br.readLine()) != null) {
				String[] kv = line.split("\t+");
				if (kv.length > 1) {
					map.put(kv[0].trim(), kv[1].trim().split(" ")[0].trim());
				}
			}

			ps.destroy();

			List<Double> netIfInList = new ArrayList<>();
			List<Double> netIfOutList = new ArrayList<>();

			List<BigDecimal> fsUsedList = new ArrayList<>();
			List<BigDecimal> fsTotalList = new ArrayList<>();

			double cpu = 0;
			double cpu2 = 0;
			double mem = 0;
			double netIfIn = 0;
			double netIfOut = 0;
			BigDecimal fsUsed = BigDecimal.ZERO;
			BigDecimal fsTotal = BigDecimal.ZERO;

			if (logger.isDebugEnabled()) {
				logger.debug(JsonUtil.toJson(map));
			}

			for (String k : map.keySet()) {

				if ("system.cpu.util[,idle]".equals(k)) {
					cpu = 100 - Double.valueOf(map.get(k));
				}

				if ("AvgUsage".equals(k)) {
					cpu2 = Double.valueOf(map.get(k));
				}

				if ("vm.memory.size[pavailable]".equals(k)) {
					mem = 100 - Double.valueOf(map.get(k));
				}

				if (k.matches("^(net\\.if\\.out)\\[.*\\]$")) {
					netIfOutList.add(Double.valueOf(map.get(k)));
				}

				if (k.matches("^(net\\.if\\.in)\\[.*\\]$")) {
					netIfInList.add(Double.valueOf(map.get(k)));
				}

				if (k.matches("^(vfs\\.fs\\.size)\\[.*,used\\]$")) {
					fsUsedList.add(new BigDecimal(map.get(k)));
				}

				if (k.matches("^(vfs\\.fs\\.size)\\[.*,total\\]$")) {
					fsTotalList.add(new BigDecimal(map.get(k)));
				}

			}

			for (Double val : netIfInList) {
				if (val != null && !val.isNaN()) {
					netIfIn += val;
				}
			}

			if (netIfInList.size() > 0) {
				netIfIn = netIfIn / netIfInList.size() / 1000;
			}

			for (Double val : netIfOutList) {
				if (val != null && !val.isNaN()) {
					netIfOut += val;
				}
			}

			if (netIfOutList.size() > 0) {
				netIfOut = netIfOut / netIfOutList.size() / 1000;
			}

			for (BigDecimal val : fsUsedList) {
				fsUsed = fsUsed.add(val);
			}

			for (BigDecimal val : fsTotalList) {
				fsTotal = fsTotal.add(val);
			}

			cpu = cpu == 0 ? cpu2 : cpu;

			mapRet.put("cpu", format.format(cpu));
			mapRet.put("memory", format.format(mem));
			mapRet.put("netin", format.format(netIfIn));
			mapRet.put("netout", format.format(netIfOut));

			if (fsTotal != null && fsTotal.doubleValue() != 0) {
				mapRet.put("disk", format.format((fsUsed.doubleValue() * 100 / fsTotal.doubleValue())));
			} else {
				mapRet.put("disk", format.format(0));
			}
			mapRet.put("clock", DateUtil.now().getTime() / 1000);

			if (logger.isDebugEnabled()) {
				logger.debug(JsonUtil.toJson(mapRet));
			}

			return mapRet;

		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage(), e);
			return null;
		}
	}

	@Override
	public List<Map<String, Object>> getItems(Server server) {
		return serverDao.getItems(server.getHost());
	}

	@Override
	public List<List<Object>> getHistory(Server server) {

		List<List<Object>> historyUint = serverDao.getHistoryUint2(server.getItemId());

		if (historyUint == null || historyUint.size() == 0) {
			return serverDao.getHistoryFloat2(server.getItemId());
		} else {
			return historyUint;
		}
	}
}