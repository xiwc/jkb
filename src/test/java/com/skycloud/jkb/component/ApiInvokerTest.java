/**
 * ApiInvokerTest.java
 */
package com.skycloud.jkb.component;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.skycloud.jkb.base.BaseTest;
import com.skycloud.jkb.pojo.model.User;
import com.skycloud.jkb.pojo.vo.ApiResult;
import com.skycloud.jkb.pojo.vo.ReqBody;

/**
 * 
 * 
 * @creation 2013年12月28日 下午3:27:44
 * @modification 2013年12月28日 下午3:27:44
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
public class ApiInvokerTest extends BaseTest {

	@Autowired
	ApiInvoker apiInvoker;

	@Test
	public void testInvoke() {
		User userDTO = new User();

		ApiResult invoke = apiInvoker.invoke(new ReqBody(userDTO), "test/backJsonString");

		assertTrue(invoke.succeed());

	}
	
	@Test
	public void testCallbackJson() {
		User userDTO = new User();

		String invoke = apiInvoker.invokeSimple(new ReqBody("callbackFunc", userDTO), "test/callback");

		assertNotNull(invoke);

	}

}
