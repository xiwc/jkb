package com.skycloud.api.domain.hostinterface;
import java.util.ArrayList;
import java.util.List;

import com.skycloud.api.domain.base.RequestBase;
public class HostInterfaceDeleteRequest extends RequestBase{
	public HostInterfaceDeleteRequest() {
		super("hostinterface.delete");
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
