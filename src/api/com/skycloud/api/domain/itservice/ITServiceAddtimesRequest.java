package com.skycloud.api.domain.itservice;
import com.skycloud.api.domain.base.ItServiceTime;
import com.skycloud.api.domain.base.RequestBase;
public class ITServiceAddtimesRequest extends RequestBase{
	public ITServiceAddtimesRequest() {
		super("service.addtimes");
	}
	private ITServiceAddtimesParams params = new ITServiceAddtimesParams();
	public void setParams(ITServiceAddtimesParams params) {
		this.params = params;
	}
	public ITServiceAddtimesParams getParams() {
		return params;
	}
	public static class ITServiceAddtimesParams extends ItServiceTime{
	}
}
