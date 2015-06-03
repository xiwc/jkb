package com.skycloud.api.domain.drule;

import java.util.ArrayList;
import java.util.List;

import com.skycloud.api.domain.base.DiscoveryCheck;
import com.skycloud.api.domain.base.DiscoveryRule;
import com.skycloud.api.domain.base.RequestBase;

public class DiscoveryRuleUpdateRequest extends RequestBase {
	public DiscoveryRuleUpdateRequest() {
		super("drule.update");
	}

	private List<DiscoveryRuleUpdateParams> params;

	public void setParams(List<DiscoveryRuleUpdateParams> params) {
		this.params = params;
	}

	public List<DiscoveryRuleUpdateParams> getParams() {

		if (params == null) {
			params = new ArrayList<>();
		}
		return params;
	}

	public static class DiscoveryRuleUpdateParams extends DiscoveryRule {
		private List<DiscoveryCheck> dchecks;

		public void setDchecks(List<DiscoveryCheck> dchecks) {
			this.dchecks = dchecks;
		}

		public List<DiscoveryCheck> getDchecks() {
			if (dchecks == null) {
				dchecks = new ArrayList<DiscoveryCheck>();
				return dchecks;
			}
			return dchecks;
		}
	}
}
