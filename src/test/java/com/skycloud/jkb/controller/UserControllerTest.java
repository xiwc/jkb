/**
 * UserControllerTest.java
 */
package com.skycloud.jkb.controller;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.Locale;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.skycloud.jkb.base.BaseControllerTest;
import com.skycloud.jkb.pojo.model.User;
import com.skycloud.jkb.pojo.vo.ReqBody;
import com.skycloud.jkb.service.IUserService;
import com.skycloud.jkb.util.JsonUtil;

/**
 * 
 * 
 * @creation 2013年12月26日 下午1:15:18
 * @modification 2013年12月26日 下午1:15:18
 * @company Skycloud
 * @author xiweicheng
 * @version 1.0
 * 
 */
public class UserControllerTest extends BaseControllerTest {

	@Autowired
	UserController userController;

	IUserService userServiceMock;

	@Before
	public void setup() {

		userServiceMock = mock(IUserService.class);

		userController.userService = userServiceMock;

		this.mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
	}

	@Test
	public void testAdd() throws Exception {

		User userDTO = new User();

		ReqBody requestBody = new ReqBody();
		requestBody.setParams(userDTO);

		// mock when
		when(userServiceMock.save((User) any())).thenReturn(true);

		MockHttpServletRequestBuilder requestBuilder = post("/user/add").contentType(MediaType.APPLICATION_JSON)
				.content(JsonUtil.toJson(requestBody)).sessionAttr("loginUser", userDTO)
				.param("time", "2013/11/27 13:25:00").param("time", "2013/12/27 13:25:00");

		this.mockMvc.perform(requestBuilder).andExpect(status().isOk()).andExpect(view().name("success"));

		// mock verify
		verify(userServiceMock).save((User) any());
		verifyNoMoreInteractions(userServiceMock);
	}

	@Test
	public void testDelete() throws Exception {

		User userDTO = new User();

		ReqBody requestBody = new ReqBody();
		requestBody.setParams(userDTO);

		// mock when
		when(userServiceMock.delete((Locale) any(), (User) any())).thenReturn(true);

		MockHttpServletRequestBuilder requestBuilder = post("/user/delete").contentType(MediaType.APPLICATION_JSON)
				.content(JsonUtil.toJson(requestBody)).sessionAttr("loginUser", userDTO)
				.param("time", "2013/2/27 13:25:00").param("time", "2013/3/27 13:25:00");

		this.mockMvc.perform(requestBuilder).andExpect(status().isOk()).andExpect(view().name("success"));

		// mock verify
		verify(userServiceMock).delete((User) any());
		verifyNoMoreInteractions(userServiceMock);
	}

	@Test
	public void testGet() throws Exception {
	}

}
