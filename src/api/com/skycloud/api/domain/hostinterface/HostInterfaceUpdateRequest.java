package com.skycloud.api.domain.hostinterface;
import com.skycloud.api.domain.base.HostInterface;
import com.skycloud.api.domain.base.RequestBase;
public class HostInterfaceUpdateRequest extends RequestBase{
	public HostInterfaceUpdateRequest() {
		super("hostinterface.update");
	}
	private HostInterfaceUpdateParams params = new HostInterfaceUpdateParams();
	public void setParams(HostInterfaceUpdateParams params) {
		this.params = params;
	}
	public HostInterfaceUpdateParams getParams() {
		return params;
	}
	public static class HostInterfaceUpdateParams extends HostInterface{
	}
}
