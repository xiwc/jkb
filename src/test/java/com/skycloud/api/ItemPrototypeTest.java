package com.skycloud.api;

import org.junit.Assert;
import org.junit.Test;

import com.skycloud.api.domain.itemprototype.ItemPrototypeUpdateRequest;
import com.skycloud.api.domain.itemprototype.ItemPrototypeUpdateRequest.ItemPrototypeUpdateParams;
import com.skycloud.jkb.base.BaseApiTest;
import com.skycloud.jkb.pojo.vo.ApiResult;

public class ItemPrototypeTest extends BaseApiTest {

	@Test
	public void updateTest() {
		ItemPrototypeUpdateRequest itemPrototypeUpdateRequest = new ItemPrototypeUpdateRequest();

		ItemPrototypeUpdateParams itemPrototypeUpdateParams = new ItemPrototypeUpdateParams();
		itemPrototypeUpdateParams.setItemid("22700"); // flags=1 No
		// itemPrototypeUpdateParams.setItemid("58042"); // flags=2 OK
		itemPrototypeUpdateParams.setSnmp_community("123456");

		itemPrototypeUpdateRequest.getParams().add(itemPrototypeUpdateParams);

		// itemPrototypeUpdateParams = new ItemPrototypeUpdateParams();
		// itemPrototypeUpdateParams.setItemid("23433");
		// itemPrototypeUpdateParams.setSnmp_community("123456");
		//
		// itemPrototypeUpdateRequest.getParams().add(itemPrototypeUpdateParams);

		ApiResult invoke = apiInvoker.invoke(itemPrototypeUpdateRequest);

		Assert.assertTrue(invoke.succeed());
	}

}
