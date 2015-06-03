/**
 * ActionServiceImpl.java
 */
package com.skycloud.jkb.service.impl;

import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.skycloud.api.domain.action.ActionCreateRequest;
import com.skycloud.api.domain.action.ActionCreateRequest.ActionCreateParams;
import com.skycloud.api.domain.base.ActionCondition;
import com.skycloud.api.domain.base.ActionOperation;
import com.skycloud.api.domain.base.ActionOperationMessage;
import com.skycloud.api.domain.base.ActionOperationSyn;
import com.skycloud.jkb.base.impl.BaseServiceImpl;
import com.skycloud.jkb.component.ApiInvoker;
import com.skycloud.jkb.dao.IActionDao;
import com.skycloud.jkb.pojo.constant.SysConstant;
import com.skycloud.jkb.pojo.entity.Conditions;
import com.skycloud.jkb.pojo.entity.Operations;
import com.skycloud.jkb.pojo.entity.Opmessage;
import com.skycloud.jkb.pojo.entity.OpmessageUsr;
import com.skycloud.jkb.pojo.model.Action;
import com.skycloud.jkb.pojo.vo.ApiResult;
import com.skycloud.jkb.pojo.vo.PageResult;
import com.skycloud.jkb.service.IActionService;
import com.skycloud.jkb.util.CollectionUtil;
import com.skycloud.jkb.util.NumberUtil;

/**
 * 【告警动作】业务逻辑实现.
 * 
 * @creation 2014年01月03日 12:19:14
 * @modification 2014年01月03日 12:19:14
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
@Service
@Transactional
public class ActionServiceImpl extends BaseServiceImpl implements IActionService {

	private static Logger logger = Logger.getLogger(ActionServiceImpl.class);

	@Autowired
	IActionDao actionDao;

	@Autowired
	ApiInvoker apiInvoker;

	@Override
	public boolean save(Locale locale, Action action) {

		logger.debug("[业务逻辑层]添加【告警动作】");

		ActionCreateRequest actionCreateRequest = new ActionCreateRequest();
		ActionCreateParams params = actionCreateRequest.getParams();

		// 告警动作基本信息
		params.setName(action.getName());
		params.setEventsource(action.getEventsource());
		params.setEvaltype(action.getEvaltype());
		params.setStatus(action.getStatus());
		params.setEsc_period(action.getEscPeriod());
		params.setDef_shortdata(action.getDefShortdata());
		params.setDef_longdata(action.getDefLongdata());

		// 告警动作条件(多个条件)
		Set<Conditions> conditionses = action.getConditionses();

		if (CollectionUtil.isNotEmpty(conditionses)) {
			for (Conditions conditions : conditionses) {
				ActionCondition actionCondition = new ActionCondition();
				actionCondition.setConditiontype(conditions.getConditiontype());
				actionCondition.setOperator(conditions.getOperator());
				actionCondition.setValue(conditions.getValue());

				params.getConditions().add(actionCondition);
			}
		}

		// 告警动作操作(多个操作)
		Set<Operations> operationses = action.getOperationses();

		if (CollectionUtil.isNotEmpty(operationses)) {
			for (Operations operations : operationses) {
				ActionOperation actionOperation = new ActionOperation();
				actionOperation.setOperationtype(operations.getOperationtype());
				actionOperation.setEsc_step_from(operations.getEscStepFrom());
				actionOperation.setEsc_step_to(operations.getEscStepTo());
				actionOperation.setEvaltype(operations.getEvaltype());

				params.getOperations().add(actionOperation);

				// TODO
				// // List<ActionOperationSyn> opcommand_grp;
				// Set<OpcommandGrp> opcommandGrps =
				// operations.getOpcommandGrps();
				// if (CollectionUtil.isNotEmpty(opcommandGrps)) {
				// }
				//
				// // List<ActionOperationSyn> opcommand_hst;
				// Set<OpcommandHst> opcommandHsts =
				// operations.getOpcommandHsts();
				// if (CollectionUtil.isNotEmpty(opcommandHsts)) {
				// }
				// // List<ActionOperationSyn> opconditions;
				// Set<Opconditions> opconditionses =
				// operations.getOpconditionses();
				// if (CollectionUtil.isNotEmpty(opconditionses)) {
				// }
				// // List<ActionOperationSyn> opgroup;
				// Set<Opgroup> opgroups = operations.getOpgroups();
				// if (CollectionUtil.isNotEmpty(opgroups)) {
				// }
				// // List<ActionOperationSyn> opmessage_grp;
				// Set<OpmessageGrp> opmessageGrps =
				// operations.getOpmessageGrps();
				// if (CollectionUtil.isNotEmpty(opmessageGrps)) {
				// }
				// // List<ActionOperationSyn> optemplate;
				// Set<Optemplate> optemplates = operations.getOptemplates();
				// if (CollectionUtil.isNotEmpty(optemplates)) {
				// }

				// List<ActionOperationSyn> opmessage_usr;
				Set<OpmessageUsr> opmessageUsrs = operations.getOpmessageUsrs();
				if (CollectionUtil.isNotEmpty(opmessageUsrs)) {
					for (OpmessageUsr opmessageUsr : opmessageUsrs) {
						ActionOperationSyn actionOperationSyn = new ActionOperationSyn();
						actionOperationSyn.setUserid(String.valueOf(opmessageUsr.getUsers().getUserid()));

						actionOperation.getOpmessage_usr().add(actionOperationSyn);
					}
				}

				// ActionOperationMessage opmessage;
				Opmessage opmessage = operations.getOpmessage();
				if (opmessage != null) {
					ActionOperationMessage actionOperationMessage = new ActionOperationMessage();
					actionOperationMessage.setDefault_msg(opmessage.getDefaultMsg());
					actionOperationMessage.setMediatypeid(String.valueOf(opmessage.getMediaType().getMediatypeid()));
					actionOperationMessage.setSubject(opmessage.getSubject());
					actionOperationMessage.setMessage(opmessage.getMessage());

					actionOperation.setOpmessage(actionOperationMessage);
				}

			}
		}

		ApiResult invoke = apiInvoker.invoke(actionCreateRequest);
		throwRuntimeExceptionWhenTrue(invoke.failed(), invoke.getMessage());

		action.setActionid(NumberUtil.toLong(invoke.getIdResult(SysConstant.ID_ACTIONIDS)));

		return true;
	}

	@Override
	public boolean delete(Locale locale, Action action) {

		logger.debug("[业务逻辑层]删除【告警动作】");

		// TODO
		return true;
	}

	@Override
	public Action get(Locale locale, Action action) {

		logger.debug("[业务逻辑层]获取【告警动作】");

		// TODO
		return null;
	}

	@Override
	public boolean update(Locale locale, Action action) {

		logger.debug("[业务逻辑层]更新【告警动作】");

		// TODO
		return true;
	}

	@Override
	public List<Action> list(Locale locale) {

		logger.debug("[业务逻辑层]列举【告警动作】");

		// TODO
		return null;
	}

	@Override
	public List<Action> query(Locale locale, Action action) {

		logger.debug("[业务逻辑层]查询【告警动作】(不分页)");

		// TODO
		return null;
	}

	@Override
	public PageResult paging(Locale locale, Action action, Long start, Long limit) {

		logger.debug("[业务逻辑层]查询【告警动作】(分页)");

		PageResult pageResult = new PageResult();

		// TODO
		return pageResult;
	}

	@Override
	public boolean exists(Locale locale, Action action) {

		logger.debug("[业务逻辑层]判断【告警动作】是否存在");

		// TODO
		return true;
	}

}