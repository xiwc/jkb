package com.skycloud.api.domain.lldrule;
import java.util.ArrayList;
import java.util.List;

import com.skycloud.api.domain.base.RequestBase;
public class LLDiscoveryRuleIswritableRequest extends RequestBase{
	public LLDiscoveryRuleIswritableRequest() {
		super("discoveryrule.iswritable");
	}
	private List<String> params;
	public void setParams(List<String> params) {
		this.params = params;
	}
	public List<String> getParams() {
		 if(params==null){
			params   = new ArrayList<String>();
			return params;
		}
		 return params;
	}
}
