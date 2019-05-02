package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.entitymodel.JobPost;
import com.service.JobPostService;

@Controller
public class JobPostController {
	@Autowired
	JobPostService jobPostService;

	@RequestMapping(value = "/jobPost/list", method = RequestMethod.GET)
	public @ResponseBody List<JobPost> findAll() {
		return jobPostService.findAll();
	}

	@RequestMapping(value = "/jobPost/findLocation", method = RequestMethod.GET)
	public @ResponseBody List<JobPost> findLocation(@RequestParam(name = "location", required = true) String location) {
		return jobPostService.findLocation(location);
	}

	@RequestMapping(value = "/jobPost/postUser", method = RequestMethod.GET)
	public @ResponseBody List<JobPost> findByPostUser(
			@RequestParam(name = "username", required = true) String postUser) {
		return jobPostService.findByPostUser(postUser);
	}

	@RequestMapping(value = "/jobPost/find", method = RequestMethod.POST)
	public @ResponseBody List<JobPost> find(@RequestParam(name = "position", required = false) String position,
			@RequestParam(name = "jobType", required = false) String jobType,
			@RequestParam(name = "location", required = false) String location,
			@RequestParam(name = "isActive", required = false) Boolean isActive) {
		if (position == null && jobType == null && location == null)
			return jobPostService.findAll();
		return jobPostService.find(position, jobType, location, isActive);
	}

}
