package com.skycloud.api.domain.script;
import com.skycloud.api.domain.base.RequestBase;
import com.skycloud.api.domain.base.Script;
public class ScriptUpdateRequest extends RequestBase{
	public ScriptUpdateRequest() {
		super("script.update");
	}
	private ScriptUpdateParams params = new ScriptUpdateParams();
	public void setParams(ScriptUpdateParams params) {
		this.params = params;
	}
	public ScriptUpdateParams getParams() {
		return params;
	}
	public static class ScriptUpdateParams extends Script{
	}
}
