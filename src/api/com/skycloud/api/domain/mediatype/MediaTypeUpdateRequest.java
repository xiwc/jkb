package com.skycloud.api.domain.mediatype;
import java.util.ArrayList;
import java.util.List;

import com.skycloud.api.domain.base.MediaType;
import com.skycloud.api.domain.base.RequestBase;
public class MediaTypeUpdateRequest extends RequestBase{
	public MediaTypeUpdateRequest() {
		super("mediatype.update");
	}
	private List<MediaType> params;
	public void setParams(List<MediaType> params) {
		this.params = params;
	}
	public List<MediaType> getParams() {
		 if(params==null){
			params   = new ArrayList<MediaType>();
			return params;
		}
		 return params;
	}
}
