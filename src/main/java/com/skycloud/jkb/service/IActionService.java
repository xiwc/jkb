/**
 * IActionService.java
 */
package com.skycloud.jkb.service;

import java.util.List;
import java.util.Locale;

import com.skycloud.jkb.base.IBaseService;
import com.skycloud.jkb.pojo.model.Action;
import com.skycloud.jkb.pojo.vo.PageResult;

/**
 * 【告警动作】业务逻辑接口.
 * 
 * @creation 2014年01月03日 12:19:14
 * @modification 2014年01月03日 12:19:14
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
public interface IActionService extends IBaseService {

	/**
	 * 创建【告警动作】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月03日 12:19:14
	 * @modification 2014年01月03日 12:19:14
	 * @param action
	 * @return
	 */
	boolean save(Locale locale, Action action);

	/**
	 * 删除【告警动作】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月03日 12:19:14
	 * @modification 2014年01月03日 12:19:14
	 * @param action
	 * @return
	 */
	boolean delete(Locale locale, Action action);

	/**
	 * 获取【告警动作】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月03日 12:19:14
	 * @modification 2014年01月03日 12:19:14
	 * @param action
	 * @return
	 */
	Action get(Locale locale, Action action);
	
	/**
	 * 更新【告警动作】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月03日 12:19:14
	 * @modification 2014年01月03日 12:19:14
	 * @param action
	 * @return
	 */
	boolean update(Locale locale, Action action);
	
	/**
	 * 列举【告警动作】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月03日 12:19:14
	 * @modification 2014年01月03日 12:19:14
	 * @param action
	 * @return
	 */
	List<Action> list(Locale locale);

	/**
	 * 查询【告警动作】(不分页).
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月03日 12:19:14
	 * @modification 2014年01月03日 12:19:14
	 * @param action
	 * @return
	 */
	List<Action> query(Locale locale, Action action);

	/**
	 * 查询【告警动作】(分页).
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月03日 12:19:14
	 * @modification 2014年01月03日 12:19:14
	 * @param action
	 * @return
	 */
	PageResult paging(Locale locale, Action action, Long start, Long limit);

	/**
	 * 判断【告警动作】是否存在.
	 * 
	 * @author xiweicheng
	 * @creation 2014年01月03日 12:19:14
	 * @modification 2014年01月03日 12:19:14
	 * @param action
	 * @return
	 */
	boolean exists(Locale locale, Action action);
}
