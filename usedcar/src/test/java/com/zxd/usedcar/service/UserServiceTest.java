package com.zxd.usedcar.service;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zxd.usedcar.exception.UserServiceException;

@RunWith(SpringJUnit4ClassRunner.class)
// 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class UserServiceTest extends TestCase {

	private static Logger logger = Logger.getLogger(UserServiceTest.class);

	@Autowired
	private IUserService userService;
	
	@Test
	public void testGetUserById() throws UserServiceException {
		System.out.println(userService.getUserById(1).getName());
	}
	
	@Test
	public void testGetAllUser() throws UserServiceException{
		System.out.println(userService.getAllUser());
	}

}
