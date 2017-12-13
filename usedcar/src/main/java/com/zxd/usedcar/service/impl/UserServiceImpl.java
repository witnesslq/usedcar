package com.zxd.usedcar.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxd.usedcar.exception.UserServiceException;
import com.zxd.usedcar.mapper.UserMapper;
import com.zxd.usedcar.model.User;
import com.zxd.usedcar.service.UserService;
import com.zxd.usedcar.util.EncryptUtil;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	public void register(User user) throws UserServiceException {
		if (userMapper.selectByUsername(user.getuUsername()) == null) {
			user.setuPassword(EncryptUtil.md5(user.getuPassword()));
			userMapper.insertSelective(user);
		}else{
			throw new UserServiceException("user has been used");
		}
	}

	public User login(User user) throws UserServiceException {
		User getUser = userMapper.selectByUsername(user.getuUsername());
		if(getUser==null){
			throw new UserServiceException("username is error");
		}else if(!getUser.getuPassword().equals(EncryptUtil.md5(user.getuPassword()))){
			throw new UserServiceException("password is error");
		}
		return getUser;
	}

}
