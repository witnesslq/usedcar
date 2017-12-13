package com.zxd.usedcar.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zxd.usedcar.exception.UserServiceException;
import com.zxd.usedcar.model.User;
import com.zxd.usedcar.service.UserService;
import com.zxd.usedcar.util.MyConst;
import com.zxd.usedcar.util.RestfulResponseBean;
import com.zxd.usedcar.util.Restful_Code;

/**
 * 
 * <p>
 * Title:UserController
 * </p>
 * <p>
 * Description:user view controller
 * </p>
 * <p>
 * Company:Benson Lab
 * </p>
 * 
 * @author Benson
 * @date 2017年12月13日 上午12:38:29
 * @version V1.0.0
 * @email 1455813736@qq.com
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "", method = { RequestMethod.POST })
	@ResponseBody
	/**
	 * 
	 * <p> Title:UserController </p>
	 * <p> Description:user register a account and return the account info </p>
	 * @param user
	 * @return
	 * @return String
	 */
	public String userRegister(@RequestBody User user) {
		System.out.println(user);
		String result = null;
		try {
			userService.register(user);
			result = new RestfulResponseBean(Restful_Code.CREATED, user,
					"register successful", MyConst.VERSION).toJSONStr();
		} catch (UserServiceException e) {
			e.printStackTrace();
			result = new RestfulResponseBean(Restful_Code.UNPRPCESABLE_ENTITY,
					null, e.getMessage(), MyConst.VERSION).toJSONStr();
		} catch (RuntimeException re) {
			re.printStackTrace();
			result = new RestfulResponseBean(
					Restful_Code.DATABASE_ACCESS_ERROR, null,
					"data access error", MyConst.VERSION).toJSONStr();
		}
		return result;
	}

	/**
	 * 
	 * <p>
	 * Title:UserController
	 * </p>
	 * <p>
	 * Description:user sign in the system using username and password
	 * </p>
	 * 
	 * @param user
	 * @return
	 * @return String
	 */
	@RequestMapping(value = "/{username}/{password}", method = { RequestMethod.GET })
	public String login(@PathVariable("username") String username,
			@PathVariable("password") String password) {
		User user = new User();
		user.setuUsername(username);
		user.setuPassword(password);
		String result = null;
		try {
			User getUser = userService.login(user);
			result = new RestfulResponseBean(Restful_Code.OK, getUser,
					"login successful", MyConst.VERSION).toJSONStr();
		} catch (UserServiceException e) {
			result = new RestfulResponseBean(Restful_Code.UNPRPCESABLE_ENTITY,
					null, e.getMessage(), MyConst.VERSION).toJSONStr();
		} catch (RuntimeException re) {
			result = new RestfulResponseBean(
					Restful_Code.DATABASE_ACCESS_ERROR, null,
					"data access error", MyConst.VERSION).toJSONStr();
		}
		return result;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public void loginJSP(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = new User();
		user.setuUsername(username);
		user.setuPassword(password);
		try {
			User getUser = userService.login(user);
			request.getSession().setAttribute("user", getUser);
			response.sendRedirect("/usedcar/page/main.html");
		} catch (UserServiceException e) {
			e.printStackTrace();
			response.sendRedirect("/usedcar/page/main.html");
		}
	}
}
