package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.entitymodel.User;
import com.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;

	@Autowired
	Environment environment;

	@RequestMapping(value = "/user/list", method = RequestMethod.GET)
	public @ResponseBody List<User> findAll() {
		return userService.findAll();
	}

	@RequestMapping(value = "/user/{username}", method = RequestMethod.GET)
	public @ResponseBody User getUserDetail(@PathVariable(name = "username") String username) {
		return userService.getByUsername(username);
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public @ResponseBody boolean checkUsernameIsExist(@RequestParam(name = "username") String username) {
		return userService.checkUsernameIsExist(username);
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String getWellcomePage() {
		return "register";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLoginPage(HttpServletRequest request, @RequestParam(name = "e", required = false) String error) {
		if (error != null)
			request.setAttribute("msg", error);
		return "login";
	}

	@RequestMapping(value = "/success", method = RequestMethod.GET)
	public String getSuccesPage() {
		return "login_demo";
	}

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String getAdminPage() {
		return "admin_demo";
	}
	
	@GetMapping("/logout")
	public String logout(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return "redirect:/";
	}

}
