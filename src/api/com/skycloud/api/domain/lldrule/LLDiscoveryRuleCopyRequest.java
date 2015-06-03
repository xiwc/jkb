package com.skycloud.api.domain.lldrule;
import java.util.ArrayList;
import java.util.List;

import com.skycloud.api.domain.base.RequestBase;
public class LLDiscoveryRuleCopyRequest extends RequestBase{
	public LLDiscoveryRuleCopyRequest() {
		super("discoveryrule.copy");
	}
	private LLDiscoveryRuleCopyParams params = new LLDiscoveryRuleCopyParams();
	public void setParams(LLDiscoveryRuleCopyParams params) {
		this.params = params;
	}
	public LLDiscoveryRuleCopyParams getParams() {
		return params;
	}
	public static class LLDiscoveryRuleCopyParams{
		private List<String> discoveryids;
		private List<String> hostids;
		public void setDiscoveryids(List<String> discoveryids) {
			this.discoveryids = discoveryids;
		}
		public List<String> getDiscoveryids() {
			 if(discoveryids==null){
				discoveryids   = new ArrayList<String>();
				return discoveryids;
			}
			 return discoveryids;
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
	}
}
