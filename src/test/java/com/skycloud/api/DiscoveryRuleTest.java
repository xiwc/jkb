package com.skycloud.api;

import org.junit.Assert;
import org.junit.Test;

import com.skycloud.api.domain.drule.DiscoveryRuleUpdateRequest;
import com.skycloud.api.domain.drule.DiscoveryRuleUpdateRequest.DiscoveryRuleUpdateParams;
import com.skycloud.jkb.base.BaseApiTest;
import com.skycloud.jkb.pojo.vo.ApiResult;

public class DiscoveryRuleTest extends BaseApiTest {

	@Test
	public void updateTest() {
		DiscoveryRuleUpdateRequest discoveryRuleUpdateRequest = new DiscoveryRuleUpdateRequest();

		DiscoveryRuleUpdateParams discoveryRuleUpdateParams = new DiscoveryRuleUpdateParams();

		discoveryRuleUpdateParams.setItemid("22700");
		discoveryRuleUpdateParams.setIprange("192.168.2.1-255");

		discoveryRuleUpdateRequest.getParams().add(discoveryRuleUpdateParams);

		ApiResult invoke = apiInvoker.invoke(discoveryRuleUpdateRequest);

		Assert.assertTrue(invoke.succeed());
	}
}
