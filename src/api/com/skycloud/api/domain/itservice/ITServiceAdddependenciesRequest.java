package com.skycloud.api.domain.itservice;
import com.skycloud.api.domain.base.RequestBase;
public class ITServiceAdddependenciesRequest extends RequestBase{
	public ITServiceAdddependenciesRequest() {
		super("service.adddependencies");
	}
	private ITServiceAdddependenciesParams params = new ITServiceAdddependenciesParams();
	public void setParams(ITServiceAdddependenciesParams params) {
		this.params = params;
	}
	public ITServiceAdddependenciesParams getParams() {
		return params;
	}
	public static class ITServiceAdddependenciesParams{
		private String serviceid;
		private String dependsOnServiceid;
		private String soft;
		public void setServiceid(String serviceid) {
			this.serviceid = serviceid;
		}
		public String getServiceid() {
			return serviceid;
		}
		public void setDependsOnServiceid(String dependsOnServiceid) {
			this.dependsOnServiceid = dependsOnServiceid;
		}
		public String getDependsOnServiceid() {
			return dependsOnServiceid;
		}
		public void setSoft(String soft) {
			this.soft = soft;
		}
		public String getSoft() {
			return soft;
		}
	}
}
