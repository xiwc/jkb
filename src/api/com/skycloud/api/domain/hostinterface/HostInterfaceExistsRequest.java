package com.skycloud.api.domain.hostinterface;
import java.util.ArrayList;
import java.util.List;

import com.skycloud.api.domain.base.RequestBase;
public class HostInterfaceExistsRequest extends RequestBase{
	public HostInterfaceExistsRequest() {
		super("hostinterface.exists");
	}
	private HostInterfaceExistsParams params = new HostInterfaceExistsParams();
	public void setParams(HostInterfaceExistsParams params) {
		this.params = params;
	}
	public HostInterfaceExistsParams getParams() {
		return params;
	}
	public static class HostInterfaceExistsParams{
		private List<String> dns;
		private List<String> hostid;
		private List<String> interfaceid;
		private List<String> ip;
		private String node;
		private List<String> nodeids;
		public void setDns(List<String> dns) {
			this.dns = dns;
		}
		public List<String> getDns() {
			 if(dns==null){
				dns   = new ArrayList<String>();
				return dns;
			}
			 return dns;
		}
		public void setHostid(List<String> hostid) {
			this.hostid = hostid;
		}
		public List<String> getHostid() {
			 if(hostid==null){
				hostid   = new ArrayList<String>();
				return hostid;
			}
			 return hostid;
		}
		public void setInterfaceid(List<String> interfaceid) {
			this.interfaceid = interfaceid;
		}
		public List<String> getInterfaceid() {
			 if(interfaceid==null){
				interfaceid   = new ArrayList<String>();
				return interfaceid;
			}
			 return interfaceid;
		}
		public void setIp(List<String> ip) {
			this.ip = ip;
		}
		public List<String> getIp() {
			 if(ip==null){
				ip   = new ArrayList<String>();
				return ip;
			}
			 return ip;
		}
		public void setNode(String node) {
			this.node = node;
		}
		public String getNode() {
			return node;
		}
		public void setNodeids(List<String> nodeids) {
			this.nodeids = nodeids;
		}
		public List<String> getNodeids() {
			 if(nodeids==null){
				nodeids   = new ArrayList<String>();
				return nodeids;
			}
			 return nodeids;
		}
	}
}
