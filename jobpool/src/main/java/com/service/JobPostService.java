package com.service;

import java.util.List;

import com.model.entitymodel.JobPost;

public interface JobPostService {

	public void add(JobPost jobPost);

	public void update(JobPost jobPost);

	public void delete(int id);

	public JobPost findById(int id);

	public List<JobPost> findAll();
	
	public List<JobPost> find(String position, String jobType, String location, boolean isActive);

	public List<JobPost> findJobType(String jobType);
	
	public List<JobPost> findTitle(String title);

	public List<JobPost> findCompany(String company);

	public List<JobPost> findLocation(String location);

	public List<JobPost> findPosition(String position);

	public List<JobPost> findSalary(int salary);

	public List<JobPost> find(boolean isActive);
	
	public List<JobPost> findByPostUser(String username);
}
