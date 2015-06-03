package com.skycloud.api.domain.hostinterface;
import com.skycloud.api.domain.base.HostInterface;
import com.skycloud.api.domain.base.RequestBase;
public class HostInterfaceReplacehostinterfacesRequest extends RequestBase{
	public HostInterfaceReplacehostinterfacesRequest() {
		super("hostinterface.replacehostinterfaces");
	}
	private HostInterfaceReplacehostinterfacesParams params = new HostInterfaceReplacehostinterfacesParams();
	public void setParams(HostInterfaceReplacehostinterfacesParams params) {
		this.params = params;
	}
	public HostInterfaceReplacehostinterfacesParams getParams() {
		return params;
	}
	public static class HostInterfaceReplacehostinterfacesParams extends HostInterface{
		private String hostid;
		private HostInterface interfaces;
		public void setHostid(String hostid) {
			this.hostid = hostid;
		}
		public String getHostid() {
			return hostid;
		}
		public void setInterfaces(HostInterface interfaces) {
			this.interfaces = interfaces;
		}
		public HostInterface getInterfaces() {
			return interfaces;
		}
	}
}
