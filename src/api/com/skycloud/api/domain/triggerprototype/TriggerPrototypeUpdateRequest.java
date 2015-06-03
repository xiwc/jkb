package com.skycloud.api.domain.triggerprototype;
import com.skycloud.api.domain.base.RequestBase;
import com.skycloud.api.domain.base.TriggerPrototype;
public class TriggerPrototypeUpdateRequest extends RequestBase{
	public TriggerPrototypeUpdateRequest() {
		super("triggerprototype.update");
	}
	private TriggerPrototypeUpdateParams params = new TriggerPrototypeUpdateParams();
	public void setParams(TriggerPrototypeUpdateParams params) {
		this.params = params;
	}
	public TriggerPrototypeUpdateParams getParams() {
		return params;
	}
	public static class TriggerPrototypeUpdateParams extends TriggerPrototype{
	}
}
