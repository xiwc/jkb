package com.skycloud.api.domain.proxy;
import java.util.ArrayList;
import java.util.List;

import com.skycloud.api.domain.base.Host;
import com.skycloud.api.domain.base.HostInterface;
import com.skycloud.api.domain.base.Proxy;
import com.skycloud.api.domain.base.RequestBase;
public class ProxyUpdateRequest extends RequestBase{
	public ProxyUpdateRequest() {
		super("proxy.update");
	}
	private ProxyUpdateParams params = new ProxyUpdateParams();
	public void setParams(ProxyUpdateParams params) {
		this.params = params;
	}
	public ProxyUpdateParams getParams() {
		return params;
	}
	public static class ProxyUpdateParams extends Proxy{
		private List<Host> hosts;
		private List<HostInterface> interfaces;
		public void setHosts(List<Host> hosts) {
			this.hosts = hosts;
		}
		public List<Host> getHosts() {
			 if(hosts==null){
				hosts   = new ArrayList<Host>();
				return hosts;
			}
			 return hosts;
		}
		public void setInterfaces(List<HostInterface> interfaces) {
			this.interfaces = interfaces;
		}
		public List<HostInterface> getInterfaces() {
			 if(interfaces==null){
				interfaces   = new ArrayList<HostInterface>();
				return interfaces;
			}
			 return interfaces;
		}
	}
}
