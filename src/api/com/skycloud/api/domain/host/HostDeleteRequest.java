package com.skycloud.api.domain.host;
import java.util.ArrayList;
import java.util.List;

import com.skycloud.api.domain.base.Host;
import com.skycloud.api.domain.base.RequestBase;
public class HostDeleteRequest extends RequestBase{
	public HostDeleteRequest() {
		super("host.delete");
	}
	private List<Host> params;
	public void setParams(List<Host> params) {
		this.params = params;
	}
	public List<Host> getParams() {
		 if(params==null){
			params   = new ArrayList<Host>();
			return params;
		}
		 return params;
	}
}
