package com.skycloud.api.domain.hostinterface;
import java.util.ArrayList;
import java.util.List;

import com.skycloud.api.domain.base.HostInterface;
import com.skycloud.api.domain.base.RequestBase;
public class HostInterfaceMassaddRequest extends RequestBase{
	public HostInterfaceMassaddRequest() {
		super("hostinterface.massadd");
	}
	private HostInterfaceMassaddParams params = new HostInterfaceMassaddParams();
	public void setParams(HostInterfaceMassaddParams params) {
		this.params = params;
	}
	public HostInterfaceMassaddParams getParams() {
		return params;
	}
	public static class HostInterfaceMassaddParams{
		private List<HostInterface> hosts;
		private List<HostInterface> interfaces;
		public void setHosts(List<HostInterface> hosts) {
			this.hosts = hosts;
		}
		public List<HostInterface> getHosts() {
			 if(hosts==null){
				hosts   = new ArrayList<HostInterface>();
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
