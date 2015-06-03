package com.skycloud.api.domain.maintenance;
import java.util.ArrayList;
import java.util.List;

import com.skycloud.api.domain.base.Maintenance;
import com.skycloud.api.domain.base.MaintenanceTimePeriod;
import com.skycloud.api.domain.base.RequestBase;
public class MaintenanceCreateRequest extends RequestBase{
	public MaintenanceCreateRequest() {
		super("maintenance.create");
	}
	private MaintenanceCreateParams params = new MaintenanceCreateParams();
	public void setParams(MaintenanceCreateParams params) {
		this.params = params;
	}
	public MaintenanceCreateParams getParams() {
		return params;
	}
	public static class MaintenanceCreateParams extends Maintenance{
		private List<String> groupids;
		private List<String> hostids;
		private List<MaintenanceTimePeriod> timeperiods;
		public void setGroupids(List<String> groupids) {
			this.groupids = groupids;
		}
		public List<String> getGroupids() {
			 if(groupids==null){
				groupids   = new ArrayList<String>();
				return groupids;
			}
			 return groupids;
		}
		public void setHostids(List<String> hostids) {
			this.hostids = hostids;
		}
		public List<String> getHostids() {
			 if(hostids==null){
				hostids   = new ArrayList<String>();
				return hostids;
			}
			 return hostids;
		}
		public void setTimeperiods(List<MaintenanceTimePeriod> timeperiods) {
			this.timeperiods = timeperiods;
		}
		public List<MaintenanceTimePeriod> getTimeperiods() {
			 if(timeperiods==null){
				timeperiods   = new ArrayList<MaintenanceTimePeriod>();
				return timeperiods;
			}
			 return timeperiods;
		}
	}
}
