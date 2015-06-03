package com.skycloud.api.domain.itservice;
import java.util.ArrayList;
import java.util.List;

import com.skycloud.api.domain.base.ITService;
import com.skycloud.api.domain.base.ItServiceDependency;
import com.skycloud.api.domain.base.ItServiceTime;
import com.skycloud.api.domain.base.RequestBase;
public class ITServiceUpdateRequest extends RequestBase{
	public ITServiceUpdateRequest() {
		super("service.update");
	}
	private ITServiceUpdateParams params = new ITServiceUpdateParams();
	public void setParams(ITServiceUpdateParams params) {
		this.params = params;
	}
	public ITServiceUpdateParams getParams() {
		return params;
	}
	public static class ITServiceUpdateParams extends ITService{
		private List<ItServiceDependency> dependencies;
		private String parentid;
		private List<ItServiceTime> times;
		public void setDependencies(List<ItServiceDependency> dependencies) {
			this.dependencies = dependencies;
		}
		public List<ItServiceDependency> getDependencies() {
			 if(dependencies==null){
				dependencies   = new ArrayList<ItServiceDependency>();
				return dependencies;
			}
			 return dependencies;
		}
		public void setParentid(String parentid) {
			this.parentid = parentid;
		}
		public String getParentid() {
			return parentid;
		}
		public void setTimes(List<ItServiceTime> times) {
			this.times = times;
		}
		public List<ItServiceTime> getTimes() {
			 if(times==null){
				times   = new ArrayList<ItServiceTime>();
				return times;
			}
			 return times;
		}
	}
}
