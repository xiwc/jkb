/**
 * HomeControllerTest.java
 */
package com.skycloud.jkb.controller;

import static org.mockito.Mockito.mock;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.skycloud.jkb.base.BaseControllerTest;
import com.skycloud.jkb.pojo.model.Home;
import com.skycloud.jkb.pojo.model.User;
import com.skycloud.jkb.pojo.vo.ReqBody;
import com.skycloud.jkb.service.IHomeService;
import com.skycloud.jkb.util.JsonUtil;

/**
 * 
 * 
 * @creation 2013年12月28日 下午11:53:59
 * @modification 2013年12月28日 下午11:53:59
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
public class HomeControllerTest extends BaseControllerTest {

	@Autowired
	HomeController homeController;

	IHomeService homeServiceMock;

	@Before
	public void setup() {

		homeServiceMock = mock(IHomeService.class);

		homeController.homeService = homeServiceMock;

		this.mockMvc = MockMvcBuilders.standaloneSetup(homeController).build();
	}

	@Test
	public void testHome() throws Exception {
	}

	@Test
	public void testZabbixApi() throws Exception {

		MockHttpServletRequestBuilder requestBuilder = post("/test/zabbixApi").contentType(MediaType.APPLICATION_JSON)
				.content(JsonUtil.toJson(new ReqBody(new Home("1", "席维成"))));

		this.mockMvc.perform(requestBuilder);
	}

	@Test
	public void testBackJsonString() throws Exception {

		MockHttpServletRequestBuilder requestBuilder = post("/test/backJsonString").contentType(
				MediaType.APPLICATION_JSON).content(JsonUtil.toJson(new ReqBody(new Home("1", "席维成"))));

		this.mockMvc.perform(requestBuilder);
	}

	@Test
	public void testReqBody() throws Exception {

		MockHttpServletRequestBuilder requestBuilder = post("/test/reqBody").contentType(MediaType.APPLICATION_JSON)
				.content(JsonUtil.toJson(new ReqBody(new Home("1", "席维成"))));

		this.mockMvc.perform(requestBuilder);
	}

	@Test
	public void testThrowable() throws Exception {

		Mockito.when(homeServiceMock.toString()).thenThrow(new RuntimeException("msg..."));

		MockHttpServletRequestBuilder requestBuilder = post("/test/throwable").contentType(MediaType.APPLICATION_JSON)
				.content(JsonUtil.toJson(new User()));

		this.mockMvc.perform(requestBuilder);
	}

}
