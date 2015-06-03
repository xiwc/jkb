package com.skycloud.api.domain.trigger;
import java.util.ArrayList;
import java.util.List;

import com.skycloud.api.domain.base.RequestBase;
import com.skycloud.api.domain.base.Trigger;
public class TriggerDeletedependenciesRequest extends RequestBase{
	public TriggerDeletedependenciesRequest() {
		super("trigger.deletedependencies");
	}
	private List<Trigger> params;
	public void setParams(List<Trigger> params) {
		this.params = params;
	}
	public List<Trigger> getParams() {
		 if(params==null){
			params   = new ArrayList<Trigger>();
			return params;
		}
		 return params;
	}
}
