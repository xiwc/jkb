package com.skycloud.api.domain.drule;
import java.util.ArrayList;
import java.util.List;

import com.skycloud.api.domain.base.DiscoveryCheck;
import com.skycloud.api.domain.base.DiscoveryRule;
import com.skycloud.api.domain.base.RequestBase;
public class DiscoveryRuleCreateRequest extends RequestBase{
	public DiscoveryRuleCreateRequest() {
		super("drule.create");
	}
	private DiscoveryRuleCreateParams params = new DiscoveryRuleCreateParams();
	public void setParams(DiscoveryRuleCreateParams params) {
		this.params = params;
	}
	public DiscoveryRuleCreateParams getParams() {
		return params;
	}
	public static class DiscoveryRuleCreateParams extends DiscoveryRule{
		private List<DiscoveryCheck> dchecks;
		public void setDchecks(List<DiscoveryCheck> dchecks) {
			this.dchecks = dchecks;
		}
		public List<DiscoveryCheck> getDchecks() {
			 if(dchecks==null){
				dchecks   = new ArrayList<DiscoveryCheck>();
				return dchecks;
			}
			 return dchecks;
		}
	}
}
