package com.skycloud.api;

import org.junit.Assert;
import org.junit.Test;

import com.skycloud.api.domain.item.ItemUpdateRequest;
import com.skycloud.api.domain.item.ItemUpdateRequest.ItemUpdateParams;
import com.skycloud.jkb.base.BaseApiTest;
import com.skycloud.jkb.pojo.vo.ApiResult;

public class ItemTest extends BaseApiTest {

	@Test
	public void updateTest() {
		ItemUpdateRequest itemUpdateRequest = new ItemUpdateRequest();

		ItemUpdateParams itemUpdateParams = new ItemUpdateParams();
		itemUpdateParams.setItemid("22700"); // flags=1 No
		// itemUpdateParams.setItemid("22231"); // flags=0 OK
		// itemUpdateParams.setItemid("84320"); // flags=4 OK
		itemUpdateParams.setSnmp_community("123456");

		itemUpdateRequest.getParams().add(itemUpdateParams);

		// itemUpdateParams = new ItemUpdateParams();
		// itemUpdateParams.setItemid("23433");
		// itemUpdateParams.setSnmp_community("123456");
		//
		// itemUpdateRequest.getParams().add(itemUpdateParams);

		ApiResult invoke = apiInvoker.invoke(itemUpdateRequest);

		Assert.assertTrue(invoke.succeed());
	}

}
