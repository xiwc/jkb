/**
 * IInterfacesService.java
 */
package com.skycloud.jkb.service;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.skycloud.jkb.base.IBaseService;
import com.skycloud.jkb.pojo.model.Interfaces;
import com.skycloud.jkb.pojo.vo.PageResult;

/**
 * 【网络接口】业务逻辑接口.
 * 
 * @creation 2014年04月01日 09:52:37
 * @modification 2014年04月01日 09:52:37
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
public interface IInterfacesService extends IBaseService {

	/**
	 * 创建【网络接口】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年04月01日 09:52:37
	 * @modification 2014年04月01日 09:52:37
	 * @param interfaces
	 * @return
	 */
	boolean save(Locale locale, Interfaces interfaces);

	/**
	 * 删除【网络接口】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年04月01日 09:52:37
	 * @modification 2014年04月01日 09:52:37
	 * @param interfaces
	 * @return
	 */
	boolean delete(Locale locale, Interfaces interfaces);

	/**
	 * 获取【网络接口】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年04月01日 09:52:37
	 * @modification 2014年04月01日 09:52:37
	 * @param interfaces
	 * @return
	 */
	Interfaces get(Locale locale, Interfaces interfaces);
	
	/**
	 * 更新【网络接口】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年04月01日 09:52:37
	 * @modification 2014年04月01日 09:52:37
	 * @param interfaces
	 * @return
	 */
	boolean update(Locale locale, Interfaces interfaces);
	
	/**
	 * 列举【网络接口】.
	 * 
	 * @author xiweicheng
	 * @creation 2014年04月01日 09:52:37
	 * @modification 2014年04月01日 09:52:37
	 * @param interfaces
	 * @return
	 */
	List<Interfaces> list(Locale locale);

	/**
	 * 查询【网络接口】(不分页).
	 * 
	 * @author xiweicheng
	 * @creation 2014年04月01日 09:52:37
	 * @modification 2014年04月01日 09:52:37
	 * @param interfaces
	 * @return
	 */
	List<Map<String, Object>> query(Locale locale, Interfaces interfaces);

	/**
	 * 查询【网络接口】(分页).
	 * 
	 * @author xiweicheng
	 * @creation 2014年04月01日 09:52:37
	 * @modification 2014年04月01日 09:52:37
	 * @param interfaces
	 * @return
	 */
	PageResult paging(Locale locale, Interfaces interfaces, Long start, Long limit);

	/**
	 * 判断【网络接口】是否存在.
	 * 
	 * @author xiweicheng
	 * @creation 2014年04月01日 09:52:37
	 * @modification 2014年04月01日 09:52:37
	 * @param interfaces
	 * @return
	 */
	boolean exists(Locale locale, Interfaces interfaces);
}
