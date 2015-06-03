/**
 * SysConstant.java
 */
package com.skycloud.jkb.pojo.constant;

/**
 * 
 * 
 * @creation 2013-9-18 上午11:06:26
 * @modification 2013-9-18 上午11:06:26
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
/**
 * 
 * 
 * @creation 2014年1月3日 上午11:07:58
 * @modification 2014年1月3日 上午11:07:58
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
public final class SysConstant {

	private SysConstant() {
	}

	public static final String NUMBER_MINUS_1 = "-1";
	public static final String NUMBER_0 = "0";
	public static final String NUMBER_1 = "1";
	public static final String NUMBER_2 = "2";
	public static final String NUMBER_3 = "3";
	public static final String NUMBER_4 = "4";
	public static final String NUMBER_5 = "5";
	public static final String NUMBER_63 = "63";

	public static final String EMPTY = "";

	public static final String FALSE = "false";
	public static final String TRUE = "true";

	public static final String DEFAULT_IP = "0.0.0.0";
	public static final String DEFAULT_PORT_8050 = "8050";
	public static final String DEFAULT_DNS = "0.0.0.0";

	public static final int NUM_MINUS_1 = -1;
	public static final int NUM_0 = 0;
	public static final int NUM_1 = 1;
	public static final int NUM_2 = 2;
	public static final int NUM_3 = 3;
	public static final int NUM_4 = 4;
	public static final int NUM_5 = 5;
	public static final int NUM_120 = 120;

	/** UNDERLINE [String] 下划线 字符串 */
	public static final String UNDERLINE = "_";
	/** COMMA [String] 逗号 字符串 */
	public static final String COMMA = ",";
	/** COLON [String] 冒号 字符串 */
	public static final String COLON = ":";
	/** NEW_LINE [String] */
	public static final String NEW_LINE = System.getProperty("line.separator");

	/** PR_CHAZUO [String] 插座创建主机的host的前缀 */
	public static final String PR_CHAZUO = "chazuo_";
	/** HOST_TYPE_WINDOWS [String] 主机类型 windows */
	public static final String HOST_TYPE_WINDOWS = "10";
	/** HOST_TYPE_LINUX [String] 主机类型 linux */
	public static final String HOST_TYPE_LINUX = "21";

	/** CALLBACK [String] 跨域访问的回调函数名 对应的参数Key值 */
	public static final String CALLBACK = "callback";
	/** MODEL_NAME_AJAX_JSON [Object] MODEL_NAME_AJAX_JSON */
	public static final String MODEL_NAME_AJAX_JSON = "ajax_json";

	/** ID_USRGRPIDS [String] */
	public static final String ID_USRGRPIDS = "usrgrpids";
	/** ID_USERIDS [String] */
	public static final String ID_USERIDS = "userids";
	/** ID_GROUPIDS [String] */
	public static final String ID_GROUPIDS = "groupids";
	/** ID_HOSTIDS [String] */
	public static final String ID_HOSTIDS = "hostids";
	/** ID_ACTIONIDS [String] */
	public static final String ID_ACTIONIDS = "actionids";

	/** SESSION_USER [String] */
	public static final String SESSION_USER = "sessionUser";
	/** MEDIA_PERIOD [String] */
	public static final String MEDIA_PERIOD = "1-7,00:00-24:00";
	/** ACTION_NAME_WEBSITE [String] */
	public static final String ACTION_NAME_WEBSITE = "trigger action[website]";
	/** ACTION_DEFSHORTDATA_WEBSITE [String] */
	public static final String ACTION_DEFSHORTDATA_WEBSITE = "{TRIGGER.STATUS}: {TRIGGER.NAME}";
	/** ACTION_DEFLONGDATA_WEBSITE [String] */
	public static final String ACTION_DEFLONGDATA_WEBSITE = "告警等级：{TRIGGER.NSEVERITY}\r\n监控URL：{HOST.NAME}\r\n告警时间：{EVENT.DATE} {EVENT.TIME}\r\n告警描述：{TRIGGER.NAME}";

}
