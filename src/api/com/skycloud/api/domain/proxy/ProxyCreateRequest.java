package com.skycloud.api.domain.proxy;
import java.util.ArrayList;
import java.util.List;

import com.skycloud.api.domain.base.Host;
import com.skycloud.api.domain.base.HostInterface;
import com.skycloud.api.domain.base.Proxy;
import com.skycloud.api.domain.base.RequestBase;
public class ProxyCreateRequest extends RequestBase{
	public ProxyCreateRequest() {
		super("proxy.create");
	}
	private ProxyCreateParams params = new ProxyCreateParams();
	public void setParams(ProxyCreateParams params) {
		this.params = params;
	}
	public ProxyCreateParams getParams() {
		return params;
	}
	public static class ProxyCreateParams extends Proxy{
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
