package com.skycloud.api;

import org.junit.Assert;
import org.junit.Test;

import com.skycloud.api.domain.base.LLDiscoveryRule;
import com.skycloud.api.domain.lldrule.LLDiscoveryRuleUpdateRequest;
import com.skycloud.jkb.base.BaseApiTest;
import com.skycloud.jkb.pojo.vo.ApiResult;

public class LLDiscoveryRuleTest extends BaseApiTest {

	@Test
	public void updateTest() {
		LLDiscoveryRuleUpdateRequest llDiscoveryRuleUpdateRequest = new LLDiscoveryRuleUpdateRequest();

		LLDiscoveryRule llDiscoveryRule = new LLDiscoveryRule();

		llDiscoveryRule.setItemid("22700"); // flags=1
		llDiscoveryRule.setSnmp_community("123456");// {$SNMP_COMMUNITY}

		llDiscoveryRuleUpdateRequest.getParams().add(llDiscoveryRule);

		ApiResult invoke = apiInvoker.invoke(llDiscoveryRuleUpdateRequest);

		Assert.assertTrue(invoke.succeed());
	}
}
