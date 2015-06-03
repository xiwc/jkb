package com.skycloud.api.domain.item;

import java.util.ArrayList;
import java.util.List;

import com.skycloud.api.domain.base.Item;
import com.skycloud.api.domain.base.RequestBase;

public class ItemUpdateRequest extends RequestBase {

	public ItemUpdateRequest() {
		super("item.update");
	}

	private List<ItemUpdateParams> params;

	public void setParams(List<ItemUpdateParams> params) {
		this.params = params;
	}

	public List<ItemUpdateParams> getParams() {

		if (params == null) {
			params = new ArrayList<>();
		}
		return params;
	}

	public static class ItemUpdateParams extends Item {

		private List<Item> applications;

		public void setApplications(List<Item> applications) {
			this.applications = applications;
		}

		public List<Item> getApplications() {
			if (applications == null) {
				applications = new ArrayList<Item>();
				return applications;
			}
			return applications;
		}
	}
}
