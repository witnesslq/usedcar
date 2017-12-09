package com.zxd.usedcar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zxd.usedcar.model.User;
import com.zxd.usedcar.service.IUserService;
import com.zxd.usedcar.util.MyConst;
import com.zxd.usedcar.util.RestfulResponseBean;
import com.zxd.usedcar.util.Restful_Code;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService userService;

	@RequestMapping(value = "", method = { RequestMethod.GET })
	@ResponseBody
	public String getAll() {
		List<User> users = userService.getAllUser();
		return new RestfulResponseBean(Restful_Code.OK, users,
				"query all users successful", MyConst.VERSION).toJSONStr();
	}

	@RequestMapping(value = "/{id}", method = { RequestMethod.GET })
	@ResponseBody
	public String getById(@PathVariable int id) {
		User user = userService.getUserById(id);
		return new RestfulResponseBean(Restful_Code.OK, user,
				"query user for id=" + id + " successful", MyConst.VERSION)
				.toJSONStr();
	}
}
