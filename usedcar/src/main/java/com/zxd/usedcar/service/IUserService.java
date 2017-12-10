package com.zxd.usedcar.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zxd.usedcar.exception.UserServiceException;
import com.zxd.usedcar.model.User;

/**
 * 
 * <p>
 * Title:IUserService
 * </p>
 * <p>
 * Description:User service logic
 * </p>
 * <p>
 * Company:Benson Lab
 * </p>
 * 
 * @author Benson
 * @date 2017年12月10日 下午2:42:06
 * @version V1.0.0
 * @email 1455813736@qq.com
 */
@Service
public interface IUserService {
	/**
	 * 
	 * <p>
	 * Title:IUserService
	 * </p>
	 * <p>
	 * Description:get user info by user's id
	 * </p>
	 * 
	 * @param id
	 * @throws UserServiceException
	 * @return User
	 */
	User getUserById(int id) throws UserServiceException;

	/**
	 * 
	 * <p>
	 * Title:IUserService
	 * </p>
	 * <p>
	 * Description:get all user info
	 * </p>
	 * 
	 * @throws UserServiceException
	 * @return List<User>
	 */
	List<User> getAllUser() throws UserServiceException;

	/**
	 * 
	 * <p>
	 * Title:IUserService
	 * </p>
	 * <p>
	 * Description:insert a user info into database with id
	 * </p>
	 * 
	 * @param user
	 * @throws UserServiceException
	 * @return void
	 */
	void addUserWithId(User user) throws UserServiceException;

	/**
	 * 
	 * <p>
	 * Title:IUserService
	 * </p>
	 * <p>
	 * Description:TODO
	 * </p>
	 * 
	 * @param user
	 * @throws UserServiceException
	 * @return void
	 */
	void addUserWithoutId(User user) throws UserServiceException;

	/**
	 * 
	 * <p>
	 * Title:IUserService
	 * </p>
	 * <p>
	 * Description:update a user info in database if it is exist
	 * </p>
	 * 
	 * @param user
	 * @throws UserServiceException
	 * @return void
	 */
	void updateUser(User user) throws UserServiceException;

	/**
	 * 
	 * <p>
	 * Title:IUserService
	 * </p>
	 * <p>
	 * Description:delete a user info in database if it is exist
	 * </p>
	 * 
	 * @param user
	 * @throws UserServiceException
	 * @return void
	 */
	void delUser(User user) throws UserServiceException;
}
