/** WebUtil.java */
package com.skycloud.jkb.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.skycloud.jkb.pojo.constant.SysConstant;
import com.skycloud.jkb.pojo.model.User;
import com.skycloud.jkb.pojo.vo.ResultMsg;

/**
 * @author XiWeiCheng
 * 
 */
public final class WebUtil {

	private static Logger logger = Logger.getLogger(WebUtil.class);

	private WebUtil() {
		super();
	}

	/**
	 * 向客户端返回json字符串内容.
	 * 
	 * @param response
	 * @param resultMsg
	 */
	public static void writeResult(HttpServletResponse response, ResultMsg resultMsg) {

		PrintWriter pw = null;

		try {
			response.setContentType("text/html;charset=UTF-8");
			response.setHeader("Cache-Control", "no-cache");

			pw = response.getWriter();
			pw.write(JsonUtil.toJson(resultMsg));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw.flush();
			pw.close();
		}
	}

	/**
	 * 向客户端返回json字符串内容.
	 * 
	 * @param response
	 * @param resultMsg
	 */
	public static void writeObject(HttpServletResponse response, Object resultMsg) {

		PrintWriter pw = null;

		try {
			response.setContentType("text/html;charset=UTF-8");
			response.setHeader("Cache-Control", "no-cache");

			pw = response.getWriter();
			pw.write(JsonUtil.toJson(resultMsg));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw.flush();
			pw.close();
		}
	}

	/**
	 * 解析请求参数.
	 * 
	 * @param request
	 * @return
	 */
	public static Map<String, String[]> parseParams(HttpServletRequest request) {

		Map<String, String[]> map = new HashMap<String, String[]>();
		// 获得所有请求参数名
		Enumeration<?> params = request.getParameterNames();

		StringBuffer paramSb = null;
		StringBuffer emptyParamSb = null;

		if (logger.isDebugEnabled()) {
			paramSb = new StringBuffer();
			emptyParamSb = new StringBuffer();
			paramSb.append("<<请求参数[request params]>>");
			paramSb.append(SysConstant.NEW_LINE);
		}

		while (params.hasMoreElements()) {
			// 得到参数名
			String name = params.nextElement().toString();
			// 得到参数对应值
			String[] value = request.getParameterValues(name);
			map.put(name, value);

			if (logger.isDebugEnabled()) {

				String values = StringUtil.join(SysConstant.COMMA, value);

				if (StringUtil.isEmpty(values)) {
					emptyParamSb.append(name + "=" + values);
					emptyParamSb.append(SysConstant.NEW_LINE);
				} else {
					paramSb.append(name + "=" + values);
					paramSb.append(SysConstant.NEW_LINE);
				}
			}
		}

		if (logger.isDebugEnabled()) {

			if (emptyParamSb.length() > 0) {
				paramSb.append("--------------------------------------------");
				paramSb.append(SysConstant.NEW_LINE);
				paramSb.append(emptyParamSb);
			}

			if (paramSb.length() > 0) {
				paramSb.delete(paramSb.length() - SysConstant.NEW_LINE.length(), paramSb.length());
			}

			logger.debug(paramSb.toString());
		}

		return map;
	}

	/**
	 * 解析拼接请求参数.
	 * 
	 * @param request
	 * @return
	 */
	public static StringBuffer joinParams(HttpServletRequest request) {

		// 获得所有请求参数名
		Enumeration<?> params = request.getParameterNames();

		StringBuffer paramSb = new StringBuffer();
		StringBuffer emptyParamSb = new StringBuffer();

		while (params.hasMoreElements()) {
			// 得到参数名
			String name = params.nextElement().toString();
			// 得到参数对应值
			String[] value = request.getParameterValues(name);

			String values = StringUtil.join(SysConstant.COMMA, value);

			if (StringUtil.isEmpty(values)) {
				emptyParamSb.append(name + "=" + values);
				emptyParamSb.append(SysConstant.NEW_LINE);
			} else {
				paramSb.append(name + "=" + values);
				paramSb.append(SysConstant.NEW_LINE);
			}
		}

		if (emptyParamSb.length() > 0) {
			paramSb.append("--------------------------------------------");
			paramSb.append(SysConstant.NEW_LINE);
			paramSb.append(emptyParamSb);
		}

		if (paramSb.length() > 0) {
			paramSb.delete(paramSb.length() - SysConstant.NEW_LINE.length(), paramSb.length());
		}

		return paramSb;
	}

	/**
	 * 拼接URL
	 * 
	 * @author xiweicheng
	 * @creation 2013年12月30日 下午12:39:45
	 * @modification 2013年12月30日 下午12:39:45
	 * @param baseUrl
	 * @param path
	 * @return
	 */
	public static String JoinUrls(String baseUrl, String... paths) {

		String url = baseUrl;

		for (String path : paths) {
			url = JoinUrl(url, path);
		}

		return url == null ? SysConstant.EMPTY : url;
	}

	/**
	 * 拼接URL
	 * 
	 * @author xiweicheng
	 * @creation 2013年12月30日 下午12:39:45
	 * @modification 2013年12月30日 下午12:39:45
	 * @param baseUrl
	 * @param path
	 * @return
	 */
	public static String JoinUrl(String baseUrl, String path) {

		if (baseUrl == null) {
			return path == null ? SysConstant.EMPTY : path;
		}

		if (path == null) {
			return baseUrl == null ? SysConstant.EMPTY : baseUrl;
		}

		if (baseUrl.endsWith("/") && path.startsWith("/")) {
			return baseUrl + path.substring(1);
		} else if (!baseUrl.endsWith("/") && !path.startsWith("/")) {
			return baseUrl + "/" + path;
		} else {
			return baseUrl + path;
		}
	}

	/**
	 * 获取Request.
	 * 
	 * @author xiweicheng
	 * @creation 2014年1月2日 下午4:42:29
	 * @modification 2014年1月2日 下午4:42:29
	 * @return
	 */
	public static HttpServletRequest getRequest() {
		RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();

		if (requestAttributes != null) {
			return ((ServletRequestAttributes) requestAttributes).getRequest();
		}

		return null;
	}

	/**
	 * 获取Session.
	 * 
	 * @author xiweicheng
	 * @creation 2014年1月2日 下午4:42:41
	 * @modification 2014年1月2日 下午4:42:41
	 * @return
	 */
	public static HttpSession getSession() {
		HttpServletRequest request = getRequest();

		return request == null ? null : request.getSession();
	}

	/**
	 * 获取Session用户.
	 * 
	 * @author xiweicheng
	 * @creation 2014年1月2日 下午4:47:18
	 * @modification 2014年1月2日 下午4:47:18
	 * @return
	 */
	public static User getSessionUser() {
		HttpSession session = getSession();

		Object object = (session == null ? null : session.getAttribute(SysConstant.SESSION_USER));

		if (object instanceof User) {
			return (User) object;
		}
		return null;
	}

	/**
	 * 获取Session用户Id.
	 * 
	 * @author xiweicheng
	 * @creation 2014年1月13日 下午3:00:49
	 * @modification 2014年1月13日 下午3:00:49
	 * @return
	 */
	public static String getSessionUserId() {
		User user = getSessionUser();

		return user == null ? null : String.valueOf(user.getUserid());
	}

	/**
	 * 获取session id.
	 * 
	 * @author xiweicheng
	 * @creation 2014年1月2日 下午4:48:29
	 * @modification 2014年1月2日 下午4:48:29
	 * @return
	 */
	public static String getSessionId() {
		HttpSession session = getSession();

		return session == null ? null : session.getId();
	}
}
