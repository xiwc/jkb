package com.skycloud.api.domain.discoveredservice;
import java.util.ArrayList;
import java.util.List;

import com.skycloud.api.domain.base.RequestBase;
public class DiscoveredServiceExistsRequest extends RequestBase{
	public DiscoveredServiceExistsRequest() {
		super("dservice.exists");
	}
	private DiscoveredServiceExistsParams params = new DiscoveredServiceExistsParams();
	public void setParams(DiscoveredServiceExistsParams params) {
		this.params = params;
	}
	public DiscoveredServiceExistsParams getParams() {
		return params;
	}
	public static class DiscoveredServiceExistsParams{
		private List<String> dserviceid;
		private String node;
		private List<String> nodeids;
		public void setDserviceid(List<String> dserviceid) {
			this.dserviceid = dserviceid;
		}
		public List<String> getDserviceid() {
			 if(dserviceid==null){
				dserviceid   = new ArrayList<String>();
				return dserviceid;
			}
			 return dserviceid;
		}
		public void setNode(String node) {
			this.node = node;
		}
		public String getNode() {
			return node;
		}
		public void setNodeids(List<String> nodeids) {
			this.nodeids = nodeids;
		}
		public List<String> getNodeids() {
			 if(nodeids==null){
				nodeids   = new ArrayList<String>();
				return nodeids;
			}
			 return nodeids;
		}
	}
}
