package com.zxd.usedcar.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxd.usedcar.exception.UserServiceException;
import com.zxd.usedcar.mapper.UserMapper;
import com.zxd.usedcar.model.User;
import com.zxd.usedcar.service.IUserService;
import com.zxd.usedcar.util.Restful_Code;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserMapper userMapper;

	public User getUserById(int id) throws UserServiceException {
		try {
			return userMapper.selectByPrimaryKey(id);
		} catch (RuntimeException re) {
			throw new UserServiceException(Restful_Code.DATABASE_ACCESS_ERROR,
					"database access error", re);
		}
	}

	public List<User> getAllUser() throws UserServiceException {
		try {
			return userMapper.selectAllUser();
		} catch (RuntimeException re) {
			throw new UserServiceException(Restful_Code.DATABASE_ACCESS_ERROR,
					"database access error", re);
		}
	}

	public void updateUser(User user) throws UserServiceException {
		try {
			if (userMapper.selectByPrimaryKey(user.getId()) == null) {
				throw new UserServiceException(1,
						"the user not be found in database");
			}
			userMapper.updateByPrimaryKeySelective(user);
		} catch (RuntimeException re) {
			throw new UserServiceException(Restful_Code.DATABASE_ACCESS_ERROR,
					"database access error", re);
		}
	}

	public void delUser(User user) throws UserServiceException {
		try {
			if (user == null
					|| userMapper.selectByPrimaryKey(user.getId()) == null) {
				throw new UserServiceException(1,
						"the user not be found in database");
			}
			userMapper.deleteByPrimaryKey(user.getId());
		} catch (RuntimeException re) {
			throw new UserServiceException(Restful_Code.DATABASE_ACCESS_ERROR,
					"database access error", re);
		}
	}

	public void addUserWithId(User user) throws UserServiceException {
		try {
			if (userMapper.selectByPrimaryKey(user.getId()) != null) {
				throw new UserServiceException(1, "user with id="
						+ user.getId() + " has existed");
			}
			userMapper.insert(user);
		} catch (RuntimeException re) {
			throw new UserServiceException(Restful_Code.DATABASE_ACCESS_ERROR,
					"database access error", re);
		}
	}

	public void addUserWithoutId(User user) throws UserServiceException {
		try {
			userMapper.insertSelective(user);
		} catch (RuntimeException re) {
			throw new UserServiceException(Restful_Code.DATABASE_ACCESS_ERROR,
					"database access error", re);
		}
	}
}
