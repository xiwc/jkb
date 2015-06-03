package com.skycloud.api.domain.base;
public class Maintenance{
	private String maintenanceid;
	private String name;
	private String active_since;
	private String active_till;
	private String description;
	private Integer maintenance_type;
	public void setMaintenanceid(String maintenanceid) {
		this.maintenanceid = maintenanceid;
	}
	public String getMaintenanceid() {
		return maintenanceid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setActive_since(String active_since) {
		this.active_since = active_since;
	}
	public String getActive_since() {
		return active_since;
	}
	public void setActive_till(String active_till) {
		this.active_till = active_till;
	}
	public String getActive_till() {
		return active_till;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
	public void setMaintenance_type(Integer maintenance_type) {
		this.maintenance_type = maintenance_type;
	}
	public Integer getMaintenance_type() {
		return maintenance_type;
	}
}
