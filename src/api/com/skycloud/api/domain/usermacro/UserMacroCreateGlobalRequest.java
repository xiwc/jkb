package com.skycloud.api.domain.usermacro;
import java.util.ArrayList;
import java.util.List;

import com.skycloud.api.domain.base.Macro;
import com.skycloud.api.domain.base.RequestBase;
public class UserMacroCreateGlobalRequest extends RequestBase{
	public UserMacroCreateGlobalRequest() {
		super("usermacro.createglobal");
	}
	private List<Macro> params;
	public void setParams(List<Macro> params) {
		this.params = params;
	}
	public List<Macro> getParams() {
		 if(params==null){
			params   = new ArrayList<Macro>();
			return params;
		}
		 return params;
	}
}
