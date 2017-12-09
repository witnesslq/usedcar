package com.zxd.usedcar.contorller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSONObject;
import com.zxd.usedcar.controller.UserController;

@RunWith(SpringJUnit4ClassRunner.class)
// 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml",
		"classpath:spring-mvc.xml" })
public class UserControllerTest {
	@Autowired
	private UserController userController;

	@Test
	public void testGetAll() {
		System.out.println(userController.getAll());
		JSONObject obj = JSONObject.parseObject(userController.getAll());
	}

	@Test
	public void testGetUserById() {
		int id = 2;
		System.out.println(userController.getById(id));
	}

}
