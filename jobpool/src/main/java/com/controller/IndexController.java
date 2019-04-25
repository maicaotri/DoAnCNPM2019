package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/register")
	public String getRegisterPage() {
		return "register";
	}
	@RequestMapping("/about")
	public String getAboutPage() {
		return "about";
	}
	@RequestMapping("/login")
	public String getLoginPage() {
		return "login";
	}
	@RequestMapping("/home")
	public String getHomePage() {
		return "home";
	}
	@RequestMapping("/jobPost")
	public String getJobPostPage() {
		return "job-post";
	}
	@RequestMapping("/newPost")
	public String getNewPostPage() {
		return "new-post";
	}
	@RequestMapping("/blog")
	public String getBlogPage() {
		return "blog";
	}
	@RequestMapping("/blogSingle")
	public String getBlogSinglePage() {
		return "blog-single";
	}
	@RequestMapping("/contact")
	public String getContactPage() {
		return "contact";
	}
	@RequestMapping("/admin")
	public String getAdminPage() {
		return "/admin/admin";
	}
	@RequestMapping("/account")
	public String getAccountPage() {
		return "/admin/account";
	}
	@RequestMapping("/addAccount")
	public String getAddAccountPage() {
		return "/admin/add_account";
	}
	@RequestMapping("/addArticle")
	public String getAddArticlePage() {
		return "/admin/add_article";
	}
	@RequestMapping("/charts")
	public String getChartsPage() {
		return "/admin/charts";
	}
	@RequestMapping("/editAccount")
	public String getEditAccountPage() {
		return "/admin/edit_account";
	}
	@RequestMapping("/editArticle")
	public String getEditArticlePage() {
		return "/admin/edit_article";
	}
	@RequestMapping("/menu")
	public String getMenu() {
		return "/admin/menu";
	}
	@RequestMapping("/post_article")
	public String getPostArticlePage() {
		return "/admin/post_article";
	}
}
