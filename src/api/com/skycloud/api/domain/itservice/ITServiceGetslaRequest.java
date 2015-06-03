package com.skycloud.api.domain.itservice;
import java.util.ArrayList;
import java.util.List;

import com.skycloud.api.domain.base.ITService;
import com.skycloud.api.domain.base.RequestBase;
import com.skycloud.api.domain.base.TimeIntervals;
public class ITServiceGetslaRequest extends RequestBase{
	public ITServiceGetslaRequest() {
		super("service.getsla");
	}
	private ITServiceGetslaParams params = new ITServiceGetslaParams();
	public void setParams(ITServiceGetslaParams params) {
		this.params = params;
	}
	public ITServiceGetslaParams getParams() {
		return params;
	}
	public static class ITServiceGetslaParams extends ITService{
		private String serviceids;
		private List<TimeIntervals> intervals;
		public void setServiceids(String serviceids) {
			this.serviceids = serviceids;
		}
		public String getServiceids() {
			return serviceids;
		}
		public void setIntervals(List<TimeIntervals> intervals) {
			this.intervals = intervals;
		}
		public List<TimeIntervals> getIntervals() {
			 if(intervals==null){
				intervals   = new ArrayList<TimeIntervals>();
				return intervals;
			}
			 return intervals;
		}
	}
}
