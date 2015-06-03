/**
 * NumberUtil.java
 */
package com.skycloud.jkb.util;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Map;

import com.skycloud.jkb.pojo.constant.SysConstant;

/**
 * 数字处理工具类.
 * 
 * @creation 2013-10-11 上午11:51:59
 * @modification 2013-10-11 上午11:51:59
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
public final class NumberUtil {

	/** EMPTY [String] */
	public static final String EMPTY = "";

	public static NumberFormat format = new DecimalFormat("0");

	private NumberUtil() {
		super();
	}

	/**
	 * 去除小数点部位.
	 * 
	 * @param value
	 * @return
	 */
	public static String formatDouble(double value) {
		return format.format(value);
	}

	/**
	 * 转换为Integer.
	 * 
	 * @param value
	 * @return
	 */
	public static Integer toInteger(Object value) {

		try {
			if (value == null || EMPTY.equals(value)) {
				return null;
			}
			return Integer.valueOf(value.toString());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	/**
	 * 转换为Double.
	 * 
	 * @param value
	 * @return
	 */
	public static Double toDouble(Object value) {

		try {
			if (value == null || EMPTY.equals(value)) {
				return null;
			}
			return Double.valueOf(value.toString());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	/**
	 * 转换为Long.
	 * 
	 * @param value
	 * @return
	 */
	public static Long toLong(Object value) {

		try {
			if (value == null || EMPTY.equals(value)) {
				return null;
			}
			return Long.valueOf(value.toString());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	/**
	 * 判断 val1 > val2
	 * 
	 * @author xiweicheng
	 * @creation 2013年12月31日 下午3:44:21
	 * @modification 2013年12月31日 下午3:44:21
	 * @param val1
	 * @param val2
	 * @return
	 */
	public static boolean gt(Object val1, Double val2) {

		Double v1 = toDouble(val1);

		if (v1 == null) {
			throw new IllegalArgumentException("Argument[val1]can not be null.");
		}

		if (val2 == null) {
			throw new IllegalArgumentException("Argument[val2]can not be null.");
		}

		return v1 > val2;
	}

	/**
	 * 判断 val1 == val2
	 * 
	 * @author xiweicheng
	 * @creation 2013年12月31日 下午3:44:21
	 * @modification 2013年12月31日 下午3:44:21
	 * @param val1
	 * @param val2
	 * @return
	 */
	public static boolean eq(Object val1, Double val2) {

		Double v1 = toDouble(val1);

		if (v1 == null) {
			throw new IllegalArgumentException("Argument[val1]can not be null.");
		}

		if (val2 == null) {
			throw new IllegalArgumentException("Argument[val2]can not be null.");
		}

		return v1 == val2;
	}

	/**
	 * 判断 val1 != val2
	 * 
	 * @author xiweicheng
	 * @creation 2013年12月31日 下午3:44:21
	 * @modification 2013年12月31日 下午3:44:21
	 * @param val1
	 * @param val2
	 * @return
	 */
	public static boolean ne(Object val1, Double val2) {

		return !eq(val1, val2);
	}

	/**
	 * 判断 val1 == val2
	 * 
	 * @author xiweicheng
	 * @creation 2013年12月31日 下午3:44:21
	 * @modification 2013年12月31日 下午3:44:21
	 * @param val1
	 * @param val2
	 * @return
	 */
	public static boolean lt(Object val1, Double val2) {

		return !gt(val1, val2);
	}

	public static Integer getInteger(Map<String, Object> map, String key) {

		return toInteger(map.get(key));
	}

	public static Double getDouble(Map<String, Object> map, String key) {

		return toDouble(map.get(key));
	}

	public static Long getLong(Map<String, Object> map, String key) {

		return toLong(map.get(key));
	}

	public static String format(Object object) {

		if (object instanceof Double) {
			return formatDouble((Double) object);
		} else {
			Double val = toDouble(object);

			if (val != null) {
				return formatDouble(val);
			}
		}

		return SysConstant.EMPTY;
	}

	/**
	 * 判断是否为数字类型或者数字字符串.
	 * 
	 * @author xiweicheng
	 * @creation 2013年11月15日 下午2:47:36
	 * @modification 2013年11月15日 下午2:47:36
	 * @param val
	 * @return
	 */
	public static boolean isNumber(Object val) {

		if (val instanceof Number) {
			return true;
		}

		if (toDouble(val) != null) {
			return true;
		}

		return false;
	}
}