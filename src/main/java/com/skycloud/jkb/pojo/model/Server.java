/**
 * Server.java
 */
package com.skycloud.jkb.pojo.model;

import java.io.Serializable;

import com.skycloud.jkb.pojo.entity.Hosts;

/**
 * 【服务器】请求参数.
 * 
 * @creation 2014年01月15日 12:00:07
 * @modification 2014年01月15日 12:00:07
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
public class Server extends Hosts implements Serializable {

	/** serialVersionUID [long] */
	private static final long serialVersionUID = -5517761313082417953L;

	private String ip;

	/** groupId [String] 设备组ID */
	private String groupId;

	/** typeId [String] DB字段->[skycloud_grouptype.typeid] */
	private String typeId;

	/** templateId [String] 监控模板ID */
	private String templateId;

	private String itemId;

	private String itemName;

	/** begin [String] 查询时间开始 */
	private String begin;

	/** end [String] 查询时间结束 */
	private String end;

	/** id [String] 插座创建主机的ID */
	private String id;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getTemplateId() {
		return templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBegin() {
		return begin;
	}

	public void setBegin(String begin) {
		this.begin = begin;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

}
