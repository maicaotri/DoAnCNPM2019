package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/register")
	public String getRegisterPage() {
		return "register";
	}
	@GetMapping("/about")
	public String getAboutPage() {
		return "about";
	}
	@GetMapping("/login")
	public String getLoginPage() {
		return "login";
	}
	@GetMapping("/home")
	public String getHomePage() {
		return "home";
	}
	@GetMapping("/jobPost")
	public String getJobPostPage() {
		return "job-post";
	}
	@GetMapping("/newPost")
	public String getNewPostPage() {
		return "new-post";
	}
	@GetMapping("/blog")
	public String getBlogPage() {
		return "blog";
	}
	@GetMapping("/blogSingle")
	public String getBlogSinglePage() {
		return "blog-single";
	}
	@GetMapping("/contact")
	public String getContactPage() {
		return "contact";
	}
	@GetMapping("/admin")
	public String getAdminPage() {
		return "/admin/admin";
	}
	@GetMapping("/account")
	public String getAccountPage() {
		return "/admin/account";
	}
	@GetMapping("/addAccount")
	public String getAddAccountPage() {
		return "/admin/add_account";
	}
	@GetMapping("/addArticle")
	public String getAddArticlePage() {
		return "/admin/add_article";
	}
	@GetMapping("/charts")
	public String getChartsPage() {
		return "/admin/charts";
	}
	@GetMapping("/editAccount")
	public String getEditAccountPage() {
		return "/admin/edit_account";
	}
	@GetMapping("/editArticle")
	public String getEditArticlePage() {
		return "/admin/edit_article";
	}
	@GetMapping(value="/menu")
	public String getMenu() {
		return "/admin/menu";
	}
	@GetMapping("/post_article")
	public String getPostArticlePage() {
		return "/admin/post_article";
	}
}
