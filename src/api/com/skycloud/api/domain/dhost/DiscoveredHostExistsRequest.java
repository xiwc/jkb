package com.skycloud.api.domain.dhost;
import java.util.ArrayList;
import java.util.List;

import com.skycloud.api.domain.base.RequestBase;
public class DiscoveredHostExistsRequest extends RequestBase{
	public DiscoveredHostExistsRequest() {
		super("dhost.exists");
	}
	private DiscoveredHostExistsParams params = new DiscoveredHostExistsParams();
	public void setParams(DiscoveredHostExistsParams params) {
		this.params = params;
	}
	public DiscoveredHostExistsParams getParams() {
		return params;
	}
	public static class DiscoveredHostExistsParams{
		private List<String> dhostid;
		private String node;
		private List<String> nodeids;
		public void setDhostid(List<String> dhostid) {
			this.dhostid = dhostid;
		}
		public List<String> getDhostid() {
			 if(dhostid==null){
				dhostid   = new ArrayList<String>();
				return dhostid;
			}
			 return dhostid;
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
