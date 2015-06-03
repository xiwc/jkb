package com.skycloud.api.domain.maintenance;
import java.util.ArrayList;
import java.util.List;

import com.skycloud.api.domain.base.RequestBase;
public class MaintenanceExistsRequest extends RequestBase{
	public MaintenanceExistsRequest() {
		super("maintenance.exists");
	}
	private MaintenanceCreateParams params = new MaintenanceCreateParams();
	public void setParams(MaintenanceCreateParams params) {
		this.params = params;
	}
	public MaintenanceCreateParams getParams() {
		return params;
	}
	public static class MaintenanceCreateParams{
		private List<String> maintenanceid;
		private List<String> name;
		public void setMaintenanceid(List<String> maintenanceid) {
			this.maintenanceid = maintenanceid;
		}
		public List<String> getMaintenanceid() {
			 if(maintenanceid==null){
				maintenanceid   = new ArrayList<String>();
				return maintenanceid;
			}
			 return maintenanceid;
		}
		public void setName(List<String> name) {
			this.name = name;
		}
		public List<String> getName() {
			 if(name==null){
				name   = new ArrayList<String>();
				return name;
			}
			 return name;
		}
	}
}
