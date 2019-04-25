package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
public @ResponseBody List<JobPost> findLocation(@RequestParam(name="location", required=true) String location){
	return jobPostService.findLocation(location);
}

@RequestMapping(value = "/jobPost/postUser", method = RequestMethod.GET)
public @ResponseBody List<JobPost> findByPostUser(@RequestParam(name="username", required=true) String postUser){
	return jobPostService.findByPostUser(postUser);
}

}
