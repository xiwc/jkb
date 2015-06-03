package com.skycloud.api.domain.proxy;
import java.util.ArrayList;
import java.util.List;

import com.skycloud.api.domain.base.Proxy;
import com.skycloud.api.domain.base.RequestBase;
public class ProxyDeleteRequest extends RequestBase{
	public ProxyDeleteRequest() {
		super("proxy.delete");
	}
	private List<Proxy> params;
	public void setParams(List<Proxy> params) {
		this.params = params;
	}
	public List<Proxy> getParams() {
		 if(params==null){
			params   = new ArrayList<Proxy>();
			return params;
		}
		 return params;
	}
}
