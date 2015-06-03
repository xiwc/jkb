package com.skycloud.api.domain.drule;
import java.util.ArrayList;
import java.util.List;

import com.skycloud.api.domain.base.RequestBase;
public class DiscoveryRuleExistsRequest extends RequestBase{
	public DiscoveryRuleExistsRequest() {
		super("drule.exists");
	}
	private DiscoveryRuleExistsParams params = new DiscoveryRuleExistsParams();
	public void setParams(DiscoveryRuleExistsParams params) {
		this.params = params;
	}
	public DiscoveryRuleExistsParams getParams() {
		return params;
	}
	public static class DiscoveryRuleExistsParams{
		private List<String> druleids;
		private String name;
		private String node;
		private List<String> nodeids;
		public void setDruleids(List<String> druleids) {
			this.druleids = druleids;
		}
		public List<String> getDruleids() {
			 if(druleids==null){
				druleids   = new ArrayList<String>();
				return druleids;
			}
			 return druleids;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
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
