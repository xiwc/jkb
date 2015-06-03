package com.skycloud.api.domain.triggerprototype;
import java.util.ArrayList;
import java.util.List;

import com.skycloud.api.domain.base.RequestBase;
public class TriggerPrototypeDeleteRequest extends RequestBase{
	public TriggerPrototypeDeleteRequest() {
		super("triggerprototype.delete");
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
