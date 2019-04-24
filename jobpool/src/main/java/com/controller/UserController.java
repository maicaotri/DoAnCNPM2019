package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.entitymodel.User;
import com.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping(value = "/user/list", method = RequestMethod.GET)
	public @ResponseBody List<User> findAll() {
		return userService.findAll();
	}
	
	@RequestMapping(value = "/user/{username}", method = RequestMethod.GET)
	public @ResponseBody User getUserDetail(@PathVariable(name="username") String username) {
		return userService.getByUsername(username);
	}
}
