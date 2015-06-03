package com.skycloud.api.domain.itservice;
import java.util.ArrayList;
import java.util.List;

import com.skycloud.api.domain.base.ITService;
import com.skycloud.api.domain.base.ItServiceDependency;
import com.skycloud.api.domain.base.ItServiceTime;
import com.skycloud.api.domain.base.RequestBase;
public class ITServiceCreateRequest extends RequestBase{
	public ITServiceCreateRequest() {
		super("service.create");
	}
	private ITServiceCreateParams params = new ITServiceCreateParams();
	public void setParams(ITServiceCreateParams params) {
		this.params = params;
	}
	public ITServiceCreateParams getParams() {
		return params;
	}
	public static class ITServiceCreateParams extends ITService{
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
