package com.skycloud.api.domain.application;
import com.skycloud.api.domain.base.Application;
import com.skycloud.api.domain.base.RequestBase;
public class ApplicationUpdateRequest extends RequestBase{
	public ApplicationUpdateRequest() {
		super("application.update");
	}
	private ApplicationCreateParams params = new ApplicationCreateParams();
	public void setParams(ApplicationCreateParams params) {
		this.params = params;
	}
	public ApplicationCreateParams getParams() {
		return params;
	}
	public static class ApplicationCreateParams extends Application{
	}
}
