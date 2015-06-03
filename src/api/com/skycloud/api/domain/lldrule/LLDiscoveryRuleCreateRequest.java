package com.skycloud.api.domain.lldrule;
import java.util.ArrayList;
import java.util.List;

import com.skycloud.api.domain.base.LLDiscoveryRule;
import com.skycloud.api.domain.base.RequestBase;
public class LLDiscoveryRuleCreateRequest extends RequestBase{
	public LLDiscoveryRuleCreateRequest() {
		super("discoveryrule.create");
	}
	private List<LLDiscoveryRule> params;
	public void setParams(List<LLDiscoveryRule> params) {
		this.params = params;
	}
	public List<LLDiscoveryRule> getParams() {
		 if(params==null){
			params   = new ArrayList<LLDiscoveryRule>();
			return params;
		}
		 return params;
	}
}
