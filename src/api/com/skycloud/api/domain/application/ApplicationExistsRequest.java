package com.skycloud.api.domain.application;
import java.util.ArrayList;
import java.util.List;

import com.skycloud.api.domain.base.RequestBase;
public class ApplicationExistsRequest extends RequestBase{
	public ApplicationExistsRequest() {
		super("application.exists");
	}
	private ApplicationExistsParams params = new ApplicationExistsParams();
	public void setParams(ApplicationExistsParams params) {
		this.params = params;
	}
	public ApplicationExistsParams getParams() {
		return params;
	}
	public static class ApplicationExistsParams{
		private List<String> hostid;
		private List<String> name;
		private String node;
		private List<String> nodeids;
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
		public void setName(List<String> name) {
			this.name = name;
		}
		public List<String> getName() {
			 if(name==null){
				name   = new ArrayList<String>();
				return name;
			}
			 return name;
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
