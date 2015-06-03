package com.skycloud.api.domain.hostinterface;
import java.util.ArrayList;
import java.util.List;

import com.skycloud.api.domain.base.HostInterface;
import com.skycloud.api.domain.base.RequestBase;
public class HostInterfaceMassremoveRequest extends RequestBase{
	public HostInterfaceMassremoveRequest() {
		super("hostinterface.massremove");
	}
	private HostInterfaceMassremoveParams params = new HostInterfaceMassremoveParams();
	public void setParams(HostInterfaceMassremoveParams params) {
		this.params = params;
	}
	public HostInterfaceMassremoveParams getParams() {
		return params;
	}
	public static class HostInterfaceMassremoveParams{
		private List<String> hostids;
		private List<HostInterface> interfaces;
		public void setHostids(List<String> hostids) {
			this.hostids = hostids;
		}
		public List<String> getHostids() {
			 if(hostids==null){
				hostids   = new ArrayList<String>();
				return hostids;
			}
			 return hostids;
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
