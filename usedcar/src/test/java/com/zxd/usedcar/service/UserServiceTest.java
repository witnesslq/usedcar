package com.zxd.usedcar.service;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zxd.usedcar.exception.UserServiceException;
import com.zxd.usedcar.mapper.UserMapper;
import com.zxd.usedcar.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring-mvc.xml",
		"classpath:spring-mybatis.xml" })
public class UserServiceTest {

	@Autowired
	private UserService userService;
	@Autowired
	private UserMapper userMapper;

	@Test
	public void testRegister() {
		User user = new User();
		user.setuUsername("xiaobing");
		user.setuPassword("123");
		user.setuName("xiaobing");
		user.setuSex(1);
		user.setuBirth(new Date());
		user.setuPhone("15073189496");
		user.setuProvince("hunan");
		user.setuCity("changsha");
		user.setuEmail("1455813736@qq.com");
		user.setuRole(1);
		try {
			userService.register(user);
		} catch (UserServiceException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testLogin(){
		User user = new User();
		user.setuUsername("xiaobing");
//		user.setuUsername("xiaoming");
//		user.setuPassword("123");
		user.setuPassword("123456");
		try {
			System.out.println(userService.login(user));
		} catch (UserServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
