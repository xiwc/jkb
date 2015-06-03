package com.skycloud.api.domain.hostinterface;
import com.skycloud.api.domain.base.HostInterface;
import com.skycloud.api.domain.base.RequestBase;
public class HostInterfaceCreateRequest extends RequestBase{
	public HostInterfaceCreateRequest() {
		super("hostinterface.create");
	}
	private HostInterfaceCreateParams params = new HostInterfaceCreateParams();
	public void setParams(HostInterfaceCreateParams params) {
		this.params = params;
	}
	public HostInterfaceCreateParams getParams() {
		return params;
	}
	public static class HostInterfaceCreateParams extends HostInterface{
	}
}
