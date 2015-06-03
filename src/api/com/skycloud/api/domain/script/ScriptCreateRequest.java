package com.skycloud.api.domain.script;
import com.skycloud.api.domain.base.RequestBase;
import com.skycloud.api.domain.base.Script;
public class ScriptCreateRequest extends RequestBase{
	public ScriptCreateRequest() {
		super("script.create");
	}
	private ScriptCreateParams params = new ScriptCreateParams();
	public void setParams(ScriptCreateParams params) {
		this.params = params;
	}
	public ScriptCreateParams getParams() {
		return params;
	}
	public static class ScriptCreateParams extends Script{
	}
}
