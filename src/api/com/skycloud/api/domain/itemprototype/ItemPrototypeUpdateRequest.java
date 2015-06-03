package com.skycloud.api.domain.itemprototype;

import java.util.ArrayList;
import java.util.List;

import com.skycloud.api.domain.base.ItemPrototype;
import com.skycloud.api.domain.base.RequestBase;

public class ItemPrototypeUpdateRequest extends RequestBase {

	public ItemPrototypeUpdateRequest() {
		super("itemprototype.update");
	}

	private List<ItemPrototypeUpdateParams> params;

	public void setParams(List<ItemPrototypeUpdateParams> params) {
		this.params = params;
	}

	public List<ItemPrototypeUpdateParams> getParams() {

		if (params == null) {
			params = new ArrayList<>();
		}
		return params;
	}

	public static class ItemPrototypeUpdateParams extends ItemPrototype {
		private List<String> applications;

		public void setApplications(List<String> applications) {
			this.applications = applications;
		}

		public List<String> getApplications() {
			if (applications == null) {
				applications = new ArrayList<String>();
				return applications;
			}
			return applications;
		}
	}
}
