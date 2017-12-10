package com.zxd.usedcar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zxd.usedcar.exception.UserServiceException;
import com.zxd.usedcar.model.User;
import com.zxd.usedcar.service.IUserService;
import com.zxd.usedcar.util.MyConst;
import com.zxd.usedcar.util.RestfulResponseBean;
import com.zxd.usedcar.util.Restful_Code;

/**
 * 
 * <p>
 * Title:UserController
 * </p>
 * <p>
 * Description:User View Controller
 * </p>
 * <p>
 * Company:Benson Lab
 * </p>
 * 
 * @author Benson
 * @date 2017年12月10日 下午2:38:03
 * @version V1.0.0
 * @email 1455813736@qq.com
 */
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService userService;

	@RequestMapping(value = "", method = { RequestMethod.GET })
	@ResponseBody
	/**
	 * 
	 * <p> Title:UserController </p>
	 * <p> Description:get all user info from database </p>
	 * @param @return
	 * @return String json
	 * @throws
	 */
	public String getAll() {
		List<User> users = null;
		try {
			users = userService.getAllUser();
			return new RestfulResponseBean(Restful_Code.OK, users,
					"query all users successful", MyConst.VERSION).toJSONStr();
		} catch (UserServiceException e) {
			e.printStackTrace();
			return new RestfulResponseBean(e.getErrorCode(), users,
					e.getMessage(), MyConst.VERSION).toJSONStr();
		}
	}

	@RequestMapping(value = "/{id}", method = { RequestMethod.GET })
	@ResponseBody
	/**
	 * 
	 * <p> Title:UserController </p>
	 * <p> Description:get user info by user's id </p>
	 * @param @param id
	 * @param @return
	 * @return String json
	 * @throws
	 */
	public String getById(@PathVariable int id) {
		User user = null;
		try {
			user = userService.getUserById(id);
			return new RestfulResponseBean(Restful_Code.OK, user,
					"query user for id=" + id + " successful", MyConst.VERSION)
					.toJSONStr();
		} catch (UserServiceException e) {
			e.printStackTrace();
			return new RestfulResponseBean(e.getErrorCode(), user,
					e.getMessage(), MyConst.VERSION).toJSONStr();
		}
	}

	@RequestMapping(value = "", method = { RequestMethod.PUT })
	@ResponseBody
	/**
	 * 
	 * <p> Title:UserController </p>
	 * <p> Description:insert a user info into database with id </p>
	 * @param @param user
	 * @param @return
	 * @return String
	 * @throws
	 */
	public String addUserWithId(@RequestBody User user) {
		try {
			userService.addUserWithId(user);
			return new RestfulResponseBean(Restful_Code.CREATED, user,
					"insert user successful", MyConst.VERSION).toJSONStr();
		} catch (UserServiceException e) {
			e.printStackTrace();
			return new RestfulResponseBean(e.getErrorCode(), null,
					e.getMessage(), MyConst.VERSION).toJSONStr();
		}
	}

	@RequestMapping(value = "", method = { RequestMethod.POST })
	@ResponseBody
	/**
	 * 
	 * <p> Title:UserController </p>
	 * <p> Description:insert a user info into database with id </p>
	 * @param @param user
	 * @param @return
	 * @return String
	 * @throws
	 */
	public String addUserWithoutId(@RequestBody User user) {
		try {
			userService.addUserWithoutId(user);
			return new RestfulResponseBean(Restful_Code.CREATED, user,
					"insert user successful", MyConst.VERSION).toJSONStr();
		} catch (UserServiceException e) {
			e.printStackTrace();
			return new RestfulResponseBean(e.getErrorCode(), null,
					e.getMessage(), MyConst.VERSION).toJSONStr();
		}
	}

	@RequestMapping(value = "", method = { RequestMethod.PATCH })
	@ResponseBody
	/**
	 * 
	 * <p> Title:UserController </p>
	 * <p> Description:update a user info with id </p>
	 * @param user
	 * @return
	 * @return String
	 */
	public String updateUser(@RequestBody User user) {
		try {
			userService.updateUser(user);
			user = userService.getUserById(user.getId());
			return new RestfulResponseBean(Restful_Code.CREATED, user,
					"update user successful", MyConst.VERSION).toJSONStr();
		} catch (UserServiceException e) {
			e.printStackTrace();
			return new RestfulResponseBean(e.getErrorCode(), null,
					e.getMessage(), MyConst.VERSION).toJSONStr();
		}
	}

	@RequestMapping(value = "/{id}", method = { RequestMethod.DELETE })
	@ResponseBody
	/**
	 * 
	 * <p> Title:UserController </p>
	 * <p> Description:delete a user info by id </p>
	 * @param id
	 * @return
	 * @return String
	 */
	public String delUser(@PathVariable int id) {
		User user;
		try {
			user = userService.getUserById(id);
			userService.delUser(user);
			return new RestfulResponseBean(Restful_Code.DELETED, user,
					"delete user successful", MyConst.VERSION).toJSONStr();
		} catch (UserServiceException e) {
			e.printStackTrace();
			return new RestfulResponseBean(e.getErrorCode(), null,
					e.getMessage(), MyConst.VERSION).toJSONStr();
		}
	}
}
