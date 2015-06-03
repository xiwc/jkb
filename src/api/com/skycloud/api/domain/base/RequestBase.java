package com.skycloud.api.domain.base;

import com.skycloud.jkb.pojo.vo.SysConfig;

public class RequestBase {

	protected String jsonrpc;
	protected String method;
	protected String auth;
	protected int id;

	protected RequestBase() {
		this.id = 1;
		this.jsonrpc = "2.0";
		this.auth = SysConfig.sessionid;
	}

	protected RequestBase(String method) {
		this();
		this.method = method;
	}

}
