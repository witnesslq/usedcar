package com.zxd.usedcar.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxd.usedcar.mapper.UserMapper;
import com.zxd.usedcar.model.User;
import com.zxd.usedcar.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserMapper userMapper;
	
	public User getUserById(int id) {
		return userMapper.selectByPrimaryKey(id);
	}

	public List<User> getAllUser() {
		return userMapper.selectAllUser();
	}

}
