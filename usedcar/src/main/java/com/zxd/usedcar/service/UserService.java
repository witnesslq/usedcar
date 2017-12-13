package com.zxd.usedcar.service;

import org.springframework.stereotype.Service;

import com.zxd.usedcar.exception.UserServiceException;
import com.zxd.usedcar.model.User;

@Service
public interface UserService {
	/**
	 * 
	 * <p>
	 * Title:UserService
	 * </p>
	 * <p>
	 * Description:user register a account
	 * </p>
	 * 
	 * @param user
	 * @throws UserServiceException
	 * @return void
	 */
	void register(User user) throws UserServiceException;

	/**
	 * 
	 * <p>
	 * Title:UserService
	 * </p>
	 * <p>
	 * Description:user sign in the system using username and password with md5
	 * </p>
	 * 
	 * @param user
	 * @return
	 * @throws UserServiceException
	 * @return User
	 */
	User login(User user) throws UserServiceException;
}
